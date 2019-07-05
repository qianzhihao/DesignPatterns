package patterns.mix.mvc;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.AttributeType;

import javax.management.Attribute;
import javax.swing.text.AttributeSet;
import javax.swing.text.Element;

public class XmlActionNode extends ActionNode {

    private Element el;
    public XmlActionNode(Element _el) {
        this.el = _el;
    }

    @Override
    public String getActionName() {
        return getAttValue("name");
    }

    @Override
    public String getActionClass() {
        return getAttValue("class");
    }

    @Override
    public String getMethodName() {
        return getAttValue("method");
    }

    @Override
    public String getView(String result) {
        ViewPathVisitor visitor = new ViewPathVisitor("success");
        el.accept(visitor);
        return visitor.getViewPath();
    }

    private String getAttValue(String attName) {
        Attribute att = el.getAttributes(attName);
        return att.getText();
    }
}
