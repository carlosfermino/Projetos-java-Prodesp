package metodos;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import driver.DriversConexoes;

public class MetodosDeTestes extends DriversConexoes {
	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}
	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}
	public void validarTitle(String title) {
		String pageConsole = driver.getTitle();
		assertEquals(title, pageConsole);
	}
	public void validarSenha(String texo) {
		String textoCapturado = driver.findElement(By.name("password")).getText();
		assertEquals(texo, textoCapturado);
	}
	public void validarTexto() {
		
	}
	
}
