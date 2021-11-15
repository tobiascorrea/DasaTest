package core;

import static core.DriverFactory.getDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DSLTable {

	public boolean contains(String elementId, String search) {
		List<WebElement> elements = buscaTodosElementosTabela(elementId);
		for (int i = 0; i < elements.size(); i++) {
			String text = elements.get(i).getText();
			if (text.contains(search)) {
				return true;
			}
		}
		return false;
	}

	public int getIndexByValue(String elementId, String value) {
		int index = -1;
		List<WebElement> elements = buscaTodosElementosTabela(elementId);
		for (int i = 0; i < elements.size(); i++) {
			String text = elements.get(i).getText();
			if (text.contains(value)) {
				index = i + 1;
			}
		}

		return index;
	}


	private List<WebElement> buscaTodosElementosTabela(String elementId) {
		return getDriver().findElements(By.xpath(elementId));
	}
}
