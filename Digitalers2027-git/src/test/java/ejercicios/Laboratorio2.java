package ejercicios;
import java.time.Duration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Laboratorio2 {
	
	@Test
	void lab2_E1_localizadores() {
		WebDriver driver = new ChromeDriver();
		
		try {
			driver.get("https://automationexercise.com/login");
			driver.manage().window().maximize();
			
			WebElement enlaceProductos = driver.findElement(By.partialLinkText("Products"));
			WebElement enlaceRegistro = driver.findElement(By.linkText("Signup / Login"));
			WebElement nombre = driver.findElement(By.name("name"));
			WebElement bloqueRegistro = driver.findElement(By.className("signup-form"));
			
			//Mala practica: WebElement botonRegistro = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button"));
			
			WebElement botonRegistro = driver.findElement(By.xpath("//button[@data-qa=\"signup-button\"]"));
			WebElement email = driver.findElement(By.cssSelector("[data-qa='signup-email']"));
			
			email.sendKeys("example@email.com");
			
			System.out.println(enlaceProductos.getText());
			System.out.println(enlaceRegistro.getText());
			System.out.println("Se muestra campo nombre: " + nombre.isDisplayed());
			System.out.println("Se muestra formulario registro: " + bloqueRegistro.isDisplayed());
			System.out.println("Se muestra boton registro: " + botonRegistro.isDisplayed());
			System.out.println("Se muestra campo email: " + email.isDisplayed());
		}
		finally {
			driver.quit();
		}
	}
	
}