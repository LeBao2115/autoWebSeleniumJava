package JavaOOP.BT_OOP3.common;

public class BaseTest {
    public void createDriver(String url){
        System.out.println("--------Creating-------- ");
        System.out.println("URL: " + url);
        System.out.println("browser: " + Constants.getBrowser());
        System.out.println("report: " + Constants.isReport());
        System.out.println("headless: " + Constants.isHeadless());
    }

    public void closeDriver(String url){
        System.out.println("-----Closing--------");
        System.out.println("URL: " + url);
        System.out.println("browser: " + Constants.getBrowser());
    }
}
