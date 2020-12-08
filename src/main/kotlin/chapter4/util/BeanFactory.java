package chapter4.util;

import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author linuxea
 */
public class BeanFactory {

    private static final Properties PROPERTIES;

    // 使用静态代码块初始化properties，加载factory.properties文件
    static {
        PROPERTIES = new Properties();
        try {
            // 必须使用类加载器读取resource文件夹下的配置文件
            PROPERTIES.load(BeanFactory.class.getClassLoader().getResourceAsStream("chapter4/factory.properties"));
        } catch (IOException e) {
            // BeanFactory类的静态初始化都失败了，那后续也没有必要继续执行了
            throw new ExceptionInInitializerError("BeanFactory initialize error, cause: " + e.getMessage());
        }
    }

    /**
     * 用来存放实例缓存
     */
    private final static Map<String, Object> BEAN_CACHE_MAP = new ConcurrentHashMap<>();

    /**
     * get single bean by name
     *
     * @param beanName bean 容器名称
     * @return object
     */
    public synchronized static Object getBean(String beanName) {
        try {
            if (true == BEAN_CACHE_MAP.containsKey(beanName)) {
                System.out.printf("%s 命中缓存%n", beanName);
                return BEAN_CACHE_MAP.get(beanName);
            }
            Class<?> beanClazz = Class.forName(PROPERTIES.getProperty(beanName));
            Object newInstance = beanClazz.newInstance();
            BEAN_CACHE_MAP.put(beanName, newInstance);
            return newInstance;
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        throw new RuntimeException("构建失败:" + beanName);
    }


}
