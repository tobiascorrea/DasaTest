package pages;

import static core.DriverFactory.getDriver;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.DSL;
import elements.TodoElement;

public class TodoPage {

	private DSL dsl = new DSL();
	public TodoElement element = new TodoElement();

	public void abrirNavegador(String url) {
		dsl.abrirNavegador(url);
	}

	public void setTarefa(String tarefa) {
		dsl.escrever(element.campoTexto, tarefa);
	}

	public void salvar() {
		dsl.clicar(element.botaoSalvar);
	}

	public boolean verificaTabelaContemTarefa(String tarefa) {
		return dsl.getTable().contains(element.tabela, tarefa);
	}

	public void deletar(String tarefa) {
		int indice = dsl.getTable().getIndexByValue(element.tabela, tarefa);
		dsl.clicar(element.botaoDeletar.replace("param", String.valueOf(indice)));
	}

	public void setTarefaConcluida(String tarefa) {
		int indice = dsl.getTable().getIndexByValue(element.tabela, tarefa);
		dsl.clicar(element.checkBox.replace("param", String.valueOf(indice)));
	}

	public boolean campoFormularioContemTexto() {
		String text = getDriver().findElement(By.xpath(element.campoTexto)).getAttribute("value");
		if (text == null || text.trim().isEmpty())
			return false;
		return true;
	}

	public void limparFormulario() {
		dsl.clicar(element.botaoLimpar);
	}

	public void esperarRecarregarTabela() {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
		wait.until(ExpectedConditions.stalenessOf(getDriver().findElement(By.xpath(element.tabela))));
	}
}
