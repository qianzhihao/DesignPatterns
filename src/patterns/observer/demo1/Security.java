package patterns.observer.demo1;

public class Security implements Watcher {

	@Override
	public void update() {
		System.out.println("运输车有行动，保安贴身保护");
	}
}
