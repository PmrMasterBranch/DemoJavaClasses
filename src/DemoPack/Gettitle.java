package DemoPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Java_New\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		String ExecpetedTitle = "actiTIME - Login";
		String ActualTitle = driver.getTitle();	
		
		if (ActualTitle.equals(ExecpetedTitle)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		}
	}


