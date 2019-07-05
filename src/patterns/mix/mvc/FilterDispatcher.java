package patterns.mix.mvc;

import java.io.IOException;
import java.util.logging.Filter;

public class FilterDispatcher implements Filter {
    private ValueStackHelper valueStackHelper = new ValueStackHelper();

    IActionDispatcher actionDispatcher = new ActionDispatcher();

    public void destroy() {}

    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        chain.doFilter(req, res);

        String actionName = getActionNameFromURI(req);

        ViewManager viewManager = new ViewManager(actionName);

        ValueStack valueStack = valueStackHelper.putIntoStack(req);

        String result = actionDispatcher.actionInvoke(actionName);

        String viewPath = viewManager.getViewPath(result);

        RequestDispatcher rd = req.getRequestDispatcher(viewPath);
        rd.forward(req, res);
    }

    public void init(FilterConfig arg[]) throws ServletException {

    }

    private String getActionNameFromURI(HttpServletRequest req) {
        String path = (String)req.getRequestURI();
        String actionName = path.substring(path.lastIndexOf("/") + 1, path.lastIndexOf("."));
        return actionName;
    }
}
