import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

	static WebDriver driver = null;
	private static String namePaginaPrincipal;
	
	public SeleniumTest() {
		
	}
	
	

	@BeforeClass
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("D:\\Projetos\\Atividade1\\src\\trabalho2-1.html");
		namePaginaPrincipal = driver.getWindowHandle();
	}
	
	@Test
	public void testTituloDaPagina() {
		driver.get("D:\\Projetos\\Atividade1\\src\\trabalho2-1.html");
		String tituloEsperado = "Trabalho 2-1";
		Assert.assertEquals(tituloEsperado, driver.getTitle());
	}
	
	@Test
	public void testCampoNomeValoresValidos() {
		driver.get("D:\\Projetos\\Atividade1\\src\\trabalho2-1.html");
		WebElement nome = driver.findElement(By.id("nome"));
		WebElement endereco = driver.findElement(By.id("endereco"));
		WebElement sexo = driver.findElement(By.id("sexo"));
		WebElement idade = driver.findElement(By.id("idade"));
		WebElement salvar = driver.findElement(By.id("botao_somar"));
		
		nome.sendKeys("abc");
		endereco.sendKeys("Osasco");
		sexo.sendKeys("Masculino");
		idade.sendKeys("25");
		salvar.click();
		
		Alert alert = driver.switchTo().alert();
		Assert.assertTrue(alert.getText().equals("Cadastro realizado com sucesso"));
        alert.accept();
		
		
	}
	@Test
	public void testCampoNomeValoresInvalido() {
		driver.get("D:\\Projetos\\Atividade1\\src\\trabalho2-1.html");
		WebElement nome = driver.findElement(By.id("nome"));
		WebElement endereco = driver.findElement(By.id("endereco"));
		WebElement sexo = driver.findElement(By.id("sexo"));
		WebElement idade = driver.findElement(By.id("idade"));
		WebElement resultado = driver.findElement(By.id("resultado"));
		WebElement salvar = driver.findElement(By.id("botao_somar"));
		
		nome.sendKeys("");
		endereco.sendKeys("Osasco");
		sexo.sendKeys("Masculino");
		idade.sendKeys("25");
		salvar.click();
		
		
		Assert.assertEquals("Preencha o campo nome", resultado.getText());
        
		}
	@Test
	public void testCampoEnderecoValoresValidos() {
		driver.get("D:\\Projetos\\Atividade1\\src\\trabalho2-1.html");
		WebElement nome = driver.findElement(By.id("nome"));
		WebElement endereco = driver.findElement(By.id("endereco"));
		WebElement sexo = driver.findElement(By.id("sexo"));
		WebElement idade = driver.findElement(By.id("idade"));
		WebElement salvar = driver.findElement(By.id("botao_somar"));
		
		nome.sendKeys("abc");
		endereco.sendKeys("Osasco");
		sexo.sendKeys("Masculino");
		idade.sendKeys("25");
		salvar.click();
		
		Alert alert = driver.switchTo().alert();
		Assert.assertTrue(alert.getText().equals("Cadastro realizado com sucesso"));
        alert.accept();
		
		
	}
	@Test
	public void testCampoEnderecoValoresInvalido() {
		driver.get("D:\\Projetos\\Atividade1\\src\\trabalho2-1.html");
		WebElement nome = driver.findElement(By.id("nome"));
		WebElement endereco = driver.findElement(By.id("endereco"));
		WebElement sexo = driver.findElement(By.id("sexo"));
		WebElement idade = driver.findElement(By.id("idade"));
		WebElement resultado = driver.findElement(By.id("resultado"));
		WebElement salvar = driver.findElement(By.id("botao_somar"));
		
		nome.sendKeys("Lucas");
		endereco.sendKeys("");
		sexo.sendKeys("Masculino");
		idade.sendKeys("25");
		salvar.click();
		
		
		Assert.assertEquals("Preencha o campo endereco", resultado.getText());
        
		}
	@Test
	public void testSexoValoresValidosMasculino() {
		driver.get("D:\\Projetos\\Atividade1\\src\\trabalho2-1.html");
		WebElement nome = driver.findElement(By.id("nome"));
		WebElement endereco = driver.findElement(By.id("endereco"));
		WebElement sexo = driver.findElement(By.id("sexo"));
		WebElement idade = driver.findElement(By.id("idade"));
		WebElement salvar = driver.findElement(By.id("botao_somar"));
		
		nome.sendKeys("abc");
		endereco.sendKeys("Osasco");
		sexo.sendKeys("Masculino");
		idade.sendKeys("25");
		salvar.click();
		
		Alert alert = driver.switchTo().alert();
		Assert.assertTrue(alert.getText().equals("Cadastro realizado com sucesso"));
        alert.accept();
		
		
	}
	@Test
	public void testSexoValoresValidosFeminino() {
		driver.get("D:\\Projetos\\Atividade1\\src\\trabalho2-1.html");
		WebElement nome = driver.findElement(By.id("nome"));
		WebElement endereco = driver.findElement(By.id("endereco"));
		WebElement sexo = driver.findElement(By.id("sexo"));
		WebElement idade = driver.findElement(By.id("idade"));
		WebElement salvar = driver.findElement(By.id("botao_somar"));
		
		nome.sendKeys("abc");
		endereco.sendKeys("Osasco");
		sexo.sendKeys("Feminino");
		idade.sendKeys("25");
		salvar.click();
		
		Alert alert = driver.switchTo().alert();
		Assert.assertTrue(alert.getText().equals("Cadastro realizado com sucesso"));
        alert.accept();
		
		
	}
	@Test
	public void testCampoSexoValoresInvalido() {
		driver.get("D:\\Projetos\\Atividade1\\src\\trabalho2-1.html");
		WebElement nome = driver.findElement(By.id("nome"));
		WebElement endereco = driver.findElement(By.id("endereco"));
		WebElement sexo = driver.findElement(By.id("sexo"));
		WebElement idade = driver.findElement(By.id("idade"));
		WebElement resultado = driver.findElement(By.id("resultado"));
		WebElement salvar = driver.findElement(By.id("botao_somar"));
		
		nome.sendKeys("Lucas");
		endereco.sendKeys("Osasco");
		sexo.sendKeys("...");
		idade.sendKeys("25");
		salvar.click();
		
		
		Assert.assertEquals("Selecione um valor para o campo sexo", resultado.getText());
        
		}
	@Test
	public void testIdadeValoresValidos() {
		driver.get("D:\\Projetos\\Atividade1\\src\\trabalho2-1.html");
		WebElement nome = driver.findElement(By.id("nome"));
		WebElement endereco = driver.findElement(By.id("endereco"));
		WebElement sexo = driver.findElement(By.id("sexo"));
		WebElement idade = driver.findElement(By.id("idade"));
		WebElement salvar = driver.findElement(By.id("botao_somar"));
		
		nome.sendKeys("abc");
		endereco.sendKeys("Osasco");
		sexo.sendKeys("Feminino");
		idade.sendKeys("25");
		salvar.click();
		
		Alert alert = driver.switchTo().alert();
		Assert.assertTrue(alert.getText().equals("Cadastro realizado com sucesso"));
        alert.accept();
		
		
	}
	@Test
	public void testCampoIdadeValoresInvalidoMenorZero() {
		driver.get("D:\\Projetos\\Atividade1\\src\\trabalho2-1.html");
		WebElement nome = driver.findElement(By.id("nome"));
		WebElement endereco = driver.findElement(By.id("endereco"));
		WebElement sexo = driver.findElement(By.id("sexo"));
		WebElement idade = driver.findElement(By.id("idade"));
		WebElement resultado = driver.findElement(By.id("resultado"));
		WebElement salvar = driver.findElement(By.id("botao_somar"));
		
		nome.sendKeys("Lucas");
		endereco.sendKeys("Osasco");
		sexo.sendKeys("Masculino");
		idade.sendKeys("-1");
		salvar.click();
		
		
		Assert.assertEquals("Preencha o campo idade com valores acima de 0", resultado.getText());
        
		}
	@Test
	public void testCampoIdadeValoresInvalidoApenasNumero() {
		driver.get("D:\\Projetos\\Atividade1\\src\\trabalho2-1.html");
		WebElement nome = driver.findElement(By.id("nome"));
		WebElement endereco = driver.findElement(By.id("endereco"));
		WebElement sexo = driver.findElement(By.id("sexo"));
		WebElement idade = driver.findElement(By.id("idade"));
		WebElement resultado = driver.findElement(By.id("resultado"));
		WebElement salvar = driver.findElement(By.id("botao_somar"));
		
		nome.sendKeys("Lucas");
		endereco.sendKeys("Osasco");
		sexo.sendKeys("Masculino");
		idade.sendKeys("anc***");
		salvar.click();
		
		
		Assert.assertEquals("Preencha o campo idade, somente com numeros", resultado.getText());
        
		}

	
	 @AfterClass
	 public static void tearDown() {
	     driver.quit();
	 }
	 
}
