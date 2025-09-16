import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoAutomation {

	public static void main(String[] args) {
		
		//Con esto le indicamos donde podra encontrar el driver de chromeDriver, lo tenemos que tener descargado previamente
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\drivers\\chromedriver_V140.0.7339.82.exe");
		
		//System.setProperty("webdriver.firefox.driver", "C:\\BrowserDrivers\\drivers\\geckodriver_142.0.1.exe");
		//System.setProperty("webdriver.edge.driver", "C:\\BrowserDrivers\\drivers\\msedgedriver_V140.0.3485.66.exe");


		//Creamos el objeto chromedriver, driver nos sirve para manejar el navegador en este caso sera Chrome
		ChromeDriver driver = new ChromeDriver();

		//FirefoxDriver driver2 = new FirefoxDriver();
		//EdgeDriver driver3 = new EdgeDriver();
		
		
		
		driver.get("https://www.google.com/");
		
		
		
	}

}
