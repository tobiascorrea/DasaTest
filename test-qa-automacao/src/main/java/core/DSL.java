package core;

import org.openqa.selenium.By;

import static core.DriverFactory.getDriver;

public class DSL {

	private DSLTable table;

	public DSL() {
		this.table = new DSLTable();
	}

	public void abrirNavegador(String url) {
		getDriver().get(url);
	}

	public void escrever(String elementId, String text) {
		getDriver().findElement(By.xpath(elementId)).sendKeys(text);
	}

	public void clicar(String elementId) {
		getDriver().findElement(By.xpath(elementId)).click();
	}

	public DSLTable getTable() {
		return this.table;
	}
}
