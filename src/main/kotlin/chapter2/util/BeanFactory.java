package chapter2.util;

/**
 * @author linuxea
 */
public class BeanFactory {


    public static Object getBean(String classPath) {
        try {
            return Class.forName(classPath).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        throw new RuntimeException("构建失败" + classPath);
    }


}
