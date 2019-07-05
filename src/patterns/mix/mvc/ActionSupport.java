package patterns.mix.mvc;

public abstract class ActionSupport {
    public final static String SUCCESS = "success";
    public final static String FAIL = "fail";
    public String execute() {
        return SUCCESS;
    }
}
