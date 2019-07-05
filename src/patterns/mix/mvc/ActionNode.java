package patterns.mix.mvc;

public abstract class ActionNode {
    private String actionName;
    private String actionClass;
    private String methodName = "excuete";
    private String view;
    public String getActionName() {
        return actionName;
    }
    public String getMethodName() {
        return methodName;
    }
    public abstract String getView(String Result);
}
