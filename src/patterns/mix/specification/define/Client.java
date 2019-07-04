package patterns.mix.specification.define;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<Object>();
        ISpecification specification1 = new BizSpecification(new Object());
        ISpecification specification2 = new BizSpecification(new Object());
        for (Object obj:list
             ) {
            if (specification1.and(specification2).isSatisfiedBy(obj)) {
                System.out.println(obj);
            }
        }
    }
}
