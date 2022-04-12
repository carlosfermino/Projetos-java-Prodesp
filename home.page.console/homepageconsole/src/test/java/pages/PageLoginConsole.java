package pages;

import org.openqa.selenium.By;

import metodos.MetodosDeTestes;

public class PageLoginConsole {

	MetodosDeTestes metodos = new MetodosDeTestes();
	private By emailLogin = By.name("email");
	private By senhaLogin = By.name("password");
	private By clicarLogin = By.xpath("//button[@class='form-group float-right mat-raised-button mat-button-base mat-primary']");

	public void preencherEmail(By elemeneto, String texto) {
		metodos.escrever(elemeneto, texto);

	}

	public void preencherSenha(By elemento, String texto) {
		metodos.escrever(elemento, texto);

	}

	public void clicarLogin(By elemento) {
		metodos.clicar(elemento);
	}

	public By getEmailLogin() {
		return emailLogin;
	}

	public By getSenhaLogin() {
		return senhaLogin;
	}

	public By getClicarLogin() {
		return clicarLogin;
	}

}
