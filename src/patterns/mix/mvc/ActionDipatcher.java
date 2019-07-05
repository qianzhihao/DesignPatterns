package patterns.mix.mvc;

import java.util.ArrayList;

public class ActionDipatcher implements IActionDispatcher {

    private ActionManager actionManager = new ActionManager();

    private ArrayList<Interceptors> listInterceptors = InterceptorFactory.createInterceptors();

    @Override
    public String actionInvoke(String actionName) {
        return actionManager.execAction(actionName);
    }
}
