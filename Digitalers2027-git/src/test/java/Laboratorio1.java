import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;


public class Laboratorio1 {
    
    @Test
    void lab1_test() {
        System.out.println("Hola man");
        System.out.println("\nBuenas noches");
    }
    
    @Test
    void lab1_E2() throws InterruptedException {
    	WebDriver driver = new ChromeDriver();
    	
    	try {
    	driver.get("https://automationexercise.com/");
    	driver.manage().window().maximize();
    	Thread.sleep(5000);
    	
    	}finally {
    		driver.quit();
    	}
    }
    
	@Test
	void lab1_E2_plus() {
		WebDriver driver = new EdgeDriver();
	
			try {
			driver.get("https://automationexercise.com/products");
	    	driver.manage().window().maximize();
		} finally {
			driver.quit();
		} 	
	}
	
	@Test
	void lab1_E3() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
    	try {
    	driver.get("https://automationexercise.com/products");
    	WebElement buscador = driver.findElement(By.id("search_product"));
    	buscador.sendKeys("Blue Top");
    	Thread.sleep(1500);
    	
    	WebElement botonBuscar = driver.findElement(By.id("submit_search"));
    	botonBuscar.click();//Da click en enviar busqueda
    	  
   
    	Thread.sleep(1500);
    	
    	}finally {
    		driver.quit();
    	}
		
	}
	
	@Test
	void lab1_E4() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
    	try {
    	driver.get("https://automationexercise.com/products");
    	WebElement buscador = driver.findElement(By.id("search_product"));
    	buscador.sendKeys("Blue Top");
    	Thread.sleep(1500);
    	buscador.sendKeys(Keys.ENTER); //Da click en el buscador.
    	Thread.sleep(1500); //Espera 1 seg y medio
    	
    	}finally {
    		driver.quit();
    	}
		
	}
}