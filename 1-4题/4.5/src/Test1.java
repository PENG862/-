public class Test1 {
    public void main() {
        LogisticsConfig l1 = LogisticsConfig.getInstance();
        LogisticsConfig l2 = LogisticsConfig.getInstance();
        System.out.println("单例测试：配置类实例A与实例B是否相同？ -> " + (l1 == l2));
    }
}
