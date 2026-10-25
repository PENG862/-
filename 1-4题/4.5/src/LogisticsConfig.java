public class LogisticsConfig {
    private String systemName = "顺风智慧物流系统";

    private LogisticsConfig() {
    }

    private LogisticsConfig(String systemName) {
        this.systemName = systemName;
    }
    private static final LogisticsConfig l1=new LogisticsConfig();
    public static LogisticsConfig getInstance(){
        return l1;
    }

}
