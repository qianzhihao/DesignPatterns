package patterns.mix.mvc;

import java.util.Map;

public class JspView extends AbsView {

    public JspView(AbsLangData _langData) {
        super(_langData);
    }

    @Override
    public void assemble() {
        Map<String, String> langMap = getLangData().getItems();
        for (String key:langMap.keySet()
             ) {

        }
    }
}
