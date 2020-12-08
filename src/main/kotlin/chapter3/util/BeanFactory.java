package chapter3.util;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author linuxea
 */
public class BeanFactory {

    /**
     * 用来存放实例缓存
     */
    private final static Map<String, Object> BEAN_CACHE_MAP = new ConcurrentHashMap<>();

    public synchronized static Object getBean(String classPath) {
        try {
            if (true == BEAN_CACHE_MAP.containsKey(classPath)) {
                System.out.printf("%s 命中缓存%n", classPath);
                return BEAN_CACHE_MAP.get(classPath);
            }
            Object newInstance = Class.forName(classPath).newInstance();
            BEAN_CACHE_MAP.put(classPath, newInstance);
            return newInstance;
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        throw new RuntimeException("构建失败" + classPath);
    }


}
