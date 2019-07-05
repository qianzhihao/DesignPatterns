package patterns.mix.mvc;

import java.util.Observable;

public class FileWatcher extends Observable implements Watchable {
    private boolean isReload = false;
    public void watch() {
        super.addObserver(new Checker());
        super.setChanged();
        super.notifyObservers(isReload);
    }
}
