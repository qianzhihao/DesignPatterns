package patterns.mix.mvc;

import java.util.Observable;
import java.util.Observer;

public class Checker implements Observer {
//    private IXmlValidate validate;
//    String xmlPath;
//    public Checker(IXmlValidate _validate) {
//        this.validate = _validate;
//    }
//    public void setXmlPath(String _xmlPath) {
//        this.xmlPath = _xmlPath;
//    }
//
//    public boolean check() {
//        return validate.validate(xmlPath);
//    }
    public void update(Observable arg0, Object arg1) {
        arg1 = check();
    }
}
