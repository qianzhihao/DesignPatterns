package patterns.mix.mvc;

import java.util.Map;

public class SwfView extends AbsView {

    public SwfView(AbsLangData _langData) {
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
