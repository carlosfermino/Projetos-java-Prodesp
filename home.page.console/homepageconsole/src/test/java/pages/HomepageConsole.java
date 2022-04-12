package pages;

import org.openqa.selenium.By;

import metodos.MetodosDeTestes;

public class HomepageConsole {
	MetodosDeTestes metodos = new MetodosDeTestes();
	By menuSolicitacoes = By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[1]/button");
	By menuIncidentes = By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[2]/button");
	By menuAdministracao = By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[3]/button");

	public void menuConsole(String menu) throws InterruptedException {
		if (menu.equalsIgnoreCase("solicitações")) {
			metodos.clicar(menuSolicitacoes);
		} else if (menu.equalsIgnoreCase("incidentes")) {
			metodos.clicar(menuIncidentes);
		} else if (menu.equalsIgnoreCase("administração")) {
			metodos.clicar(menuAdministracao);
		} else {
			System.out.println("Opção invalida");
		}
	}

}
