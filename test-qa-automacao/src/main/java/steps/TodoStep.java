package steps;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.TodoPage;

public class TodoStep {

	TodoPage page = new TodoPage();

	@After
	public void inicializarTest() {
		
	}

	@Before
	public void finalizarTest() {
		//DriverFactory.killDriver();
	}

	@Dado("que eu esteja na pagina {string}")
	public void que_eu_esteja_na_pagina(String url) {
		page.abrirNavegador(url);
	}

	@Quando("submeto meu formulario com a tarefa {string}")
	public void submeto_meu_formulario_com_a_tarefa(String tarefa) {
		page.setTarefa(tarefa);
		page.salvar();
	}

	@Entao("devera ser listado na tabela a tarefa cadastrada {string}")
	public void devera_ser_listado_na_tabela_a_tarefa_cadastrada(String tarefa) {
		assertTrue(page.verificaTabelaContemTarefa(tarefa));
	}

//	@Quando("clico na caixa de checkbox da tarefa {string}")
//	public void clico_na_caixa_de_checkbox_da_tarefa(String tarefa) {
//		//page.setTarefaConcluida(tarefa);
//	}
//
//	@Entao("tarefa devera ser removida da tabela {string}")
//	public void tarefa_devera_ser_removida_da_tabela(String tarefa) {
//		assertTrue(page.verificaTabelaContemTarefa(tarefa));
//	}
//
//	@Quando("preencho o formulario")
//	public void preencho_o_formulario() {
//		page.setTarefa("nova tarefa");
//	}
//
//	@Quando("clico no icone com imagem X")
//	public void clico_no_icone_com_imagem_x() {
//		page.limparFormulario();
//	}
//
//	@Entao("formulario devera ser limpo")
//	public void formulario_devera_ser_limpo() {
//		assertFalse(page.campoFormularioContemTexto());
//	}

}
