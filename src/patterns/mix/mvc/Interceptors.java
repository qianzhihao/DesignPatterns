package patterns.mix.mvc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Interceptors implements Iterable<AbstractInterceptor> {

    public Interceptors(ArrayList<AbstractInterceptor> list) {

    }

    @Override
    public Iterator<AbstractInterceptor> iterator() {
        return null;
    }

    public void intercept() {
    }

}
