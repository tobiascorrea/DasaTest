package core;

import org.openqa.selenium.By;

public class FakeDatabase {

	public static void inicializarMassaTeste() {
		DriverFactory.getDriver().findElement(By.xpath("//input[contains(@type,'text')]"))
		.sendKeys("Andar de bicicleta;", 
				"Estudar VueJS;",
				"Estudar RestAssured");
		DriverFactory.getDriver().findElement(By.xpath("//i[@class='material-icons'][contains(.,'add')]")).click();
		
	}

}
