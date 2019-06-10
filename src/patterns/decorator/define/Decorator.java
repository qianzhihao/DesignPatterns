package patterns.decorator.define;

public abstract class Decorator extends Component {
    private Component component = null;
    public Decorator(Component _component) {
        this.component = _component;
    }

    @Override
    public void operate() {
        this.component.operate();
    }
}