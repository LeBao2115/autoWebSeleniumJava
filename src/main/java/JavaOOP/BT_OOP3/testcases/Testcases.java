package JavaOOP.BT_OOP3.testcases;

import JavaOOP.BT_OOP3.common.BaseTest;

public class Testcases extends BaseTest {
    public String URL = "https://cms.anhtester.com/login";

    public void Login(){
        createDriver(URL);
        System.out.println("Input Email");
        System.out.println("Input Password");
        System.out.println("Click Login Button");
        closeDriver(URL);
    }

    public void AddCategory(){
        createDriver(URL);
        System.out.println("Input Email");
        System.out.println("Input Password");
        System.out.println("Click Login Button");
        System.out.println("Click Product on Menu");
        System.out.println("Click Category");
        System.out.println("Click 'Add New Category' button");
        System.out.println("Input name");
        System.out.println("Choose option of 'Parent Category'");
        System.out.println("Input number on Ordering Number");
        System.out.println("Choose Type");
        System.out.println("Add File on Banner");
        System.out.println("Add File on Icon");
        System.out.println("Input String on Meta Title");
        System.out.println("Input String on Meta description");
        System.out.println("Select option of Filtering Attributes");
        System.out.println("Click button save");
        System.out.println("Find Category name on Search");
        System.out.println("Verify Category is exist");
        System.out.println("Verify Category information");
        closeDriver(URL);
    }

    public static void main(String[] args) {
        Testcases tc = new Testcases();
        tc.Login();
        System.out.println("===================");
        tc.AddCategory();
    }
}
