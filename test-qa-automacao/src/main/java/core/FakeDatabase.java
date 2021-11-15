package core;

import org.openqa.selenium.By;

public class FakeDatabase {
	public static String ANDAR_BIKE = "Andar de bicicleta";
	public static String ESTUDAR_VUE_JS = "Estudar VueJS";
	public static String ESTUDAR_REST = "Estudar RestAssured";

	//Simula um scrip SQL que atualiza o banco de dados com a massa de teste
	public static void inicializarMassaTeste() {
		DriverFactory.getDriver().findElement(By.xpath("//input[contains(@type,'text')]"))
				.sendKeys(
						ANDAR_BIKE + ";",
						ESTUDAR_VUE_JS + ";",
						ESTUDAR_REST);
		DriverFactory.getDriver().findElement(By.xpath("//i[@class='material-icons'][contains(.,'add')]")).click();
	}

}
