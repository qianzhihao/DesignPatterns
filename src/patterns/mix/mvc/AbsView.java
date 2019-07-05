package patterns.mix.mvc;

public abstract class AbsView {
    private AbsLangData langData;
    public AbsView(AbsLangData _langData) {
        this.langData = _langData;
    }

    public AbsLangData getLangData() {
        return langData;
    }

    public String getURI() {
        return null;
    }

    public abstract void assemble();
}
