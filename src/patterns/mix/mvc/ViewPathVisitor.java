package patterns.mix.mvc;

import patterns.visitor.define.Element;

import javax.management.Attribute;

public class ViewPathVisitor extends VisitorSupport {
    private String viewPath;
    private String result;
    public ViewPathVisitor(String _result) {
        result = _result;
    }

    @Override
    public void visit(Element el) {
        Attribute att = el.attribute("name");
        if (att != null) {
            if (att.getName().equals("name") && att.getText().equals("result")) {
                viewPath = el.getText();
            }
        }
    }

    public String getViewPath() {
        return viewPath;
    }
}
