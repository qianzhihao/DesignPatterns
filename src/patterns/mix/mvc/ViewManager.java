package patterns.mix.mvc;

public class ViewManager {
    private String actionName;
    private ValueStack valueStack = ValueStackHelper.getValueStack();
    public ViewManager(String _actionName) {
        this.actionName = _actionName;
    }

    public String getViewPath(String result) {
        AbsLangData langData = new GBLangData();
        AbsView view = new JspView(langData);
        return view.getURI();
    }
}
