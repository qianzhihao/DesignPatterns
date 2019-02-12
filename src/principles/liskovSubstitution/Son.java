package principles.liskovSubstitution;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/*
* */
public class Son extends Father {
    //放大输入参数类型(方法重载 Overload)
    public Collection doSomething(HashMap map) {
        System.out.println("HashMap 转 Collection 被执行...");
        return map.values();
    }
}
