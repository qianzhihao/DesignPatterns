package patterns.decorator.define;

public class ConcreteComponent extends Component {

    @Override
    public void operate() {
        System.out.println("Do something");
    }
}
