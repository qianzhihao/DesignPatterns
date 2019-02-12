package principles.liskovSubstitution;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * 把 HashMap 转换为 Collection 集合类型
 */
public class Father {
    public Collection doSomething(Map map){
        System.out.println("Map 转 Collection 被执行...");
        return map.values();
    }
}
