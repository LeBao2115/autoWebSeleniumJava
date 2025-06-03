package JavaOOP.BT_OOP3.common;

public class Constants {
    private static String browser = "Chrome";
    private static boolean report = true;
    private static boolean headless = true ;

    public static String getBrowser() {
        return browser;
    }

    public static boolean isHeadless() {
        return headless;
    }

    public static boolean isReport() {
        return report;
    }

    public static void setBrowser(String browser) {
        Constants.browser = browser;
    }

    public static void setHeadless(boolean headless) {
        Constants.headless = headless;
    }

    public static void setReport(boolean report) {
        Constants.report = report;
    }
}
