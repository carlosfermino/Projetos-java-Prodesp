package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.MetodosDeTestes;
import pages.HomepageConsole;
import pages.PageLoginConsole;

public class PageLoginConsoleTeste {
	MetodosDeTestes metodos = new MetodosDeTestes();
	PageLoginConsole page = new PageLoginConsole();
	HomepageConsole home = new HomepageConsole();

	@Given("que acesse a page do console e preencho o campo email")
	public void que_acesse_a_page_do_console_e_preencho_o_campo_email() {
		page.preencherEmail(page.getEmailLogin(), "cesmart@gmail.com");
	}

	@Given("preencho o campo senha")
	public void preencho_o_campo_senha() {
		page.preencherSenha(page.getSenhaLogin(), "12345678");

	}

	@When("clico em login")
	public void clico_em_login() {
		page.clicarLogin(page.getClicarLogin());
	}

	@Then("sou direcionado para a home page da console")
	public void sou_direcionado_para_a_home_page_da_console() {
		metodos.validarTitle("Console");

	}
	@Given("que acesse a home page da console e clico em solicitacoes")
	public void que_acesse_a_home_page_da_console_e_clico_em_solicitacoes() throws InterruptedException {
		Thread.sleep(1000);
	    home.menuConsole("solicitações");
	}

	@Given("clico em incidentes")
	public void clico_em_incidentes() throws InterruptedException {
	    //home.menuConsole("incidentes");
	}

	@When("clico em administracao")
	public void clico_em_administracao() throws InterruptedException {
		//home.menuConsole("administração");
	    
	}

	@Then("sou direcionado para a respctiva page selecionada")
	public void sou_direcionado_para_a_respctiva_page_selecionada() {
	    
	}

}
