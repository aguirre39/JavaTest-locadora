/*

package br.ce.wcaquino.servicos;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class LocadoraFilmesTest {

    private WebDriver driver;

    @BeforeTest
    public void setUp() {
        // Define o caminho para o driver do Chrome
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        // Inicializa o driver do Chrome
        driver = new ChromeDriver();
    }

    @Test
    public void testPesquisarFilme() {
        // Abre a página do site da Locadora de Filmes
        driver.get("http://localhost:8080");

        // Pesquisa por um filme
        WebElement campoPesquisa = driver.findElement(By.id("campo-pesquisa"));
        campoPesquisa.sendKeys("Filme 1");
        campoPesquisa.submit();

        // Verifica se o filme foi encontrado na lista de resultados
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement resultado = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(@class, 'card-title') and contains(text(), 'Filme 1')]")));
        assertEquals(resultado.getText(), "Filme 1");
    }

    @Test
    public void testeExemplo() {
        try {
            Thread.sleep(5000); // Adiciona um delay de 5 segundos

            // Pesquisar por um filme
            WebElement campoPesquisa = driver.findElement(By.id("campo-pesquisa"));
            campoPesquisa.sendKeys("Filme 1");
            campoPesquisa.submit();

            // Selecionar o filme na lista de resultados
            WebDriverWait wait = new WebDriverWait(driver, 10);
            WebElement resultado = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(@class, 'card-title') and contains(text(), 'Filme 1')]")));
            resultado.click();

            // Realizar a locação do filme
            WebElement botaoLocar = driver.findElement(By.xpath("//button[contains(@class, 'btn') and contains(text(), 'Locar')]"));
            botaoLocar.click();

            // Preencher o formulário de locação
            WebElement campoUsuario = driver.findElement(By.id("campo-usuario"));
            campoUsuario.sendKeys("Usuário 1");
            WebElement campoSenha = driver.findElement(By.id("campo-senha"));
            campoSenha.sendKeys("Senha 1");
            WebElement campoDataLocacao = driver.findElement(By.id("campo-data-locacao"));
            campoDataLocacao.sendKeys("01/01/2022");
            WebElement campoDataDevolucao = driver.findElement(By.id("campo-data-devolucao"));
            campoDataDevolucao.sendKeys("02/01/2022");
            WebElement campoCep = driver.findElement(By.id("campo-cep"));
            campoCep.sendKeys("12345-678");
            WebElement campoEndereco = driver.findElement(By.id("campo-endereco"));
            campoEndereco.sendKeys("Rua 1");
            WebElement campoNumero = driver.findElement(By.id("campo-numero"));
            campoNumero.sendKeys("123");
            WebElement campoComplemento = driver.findElement(By.id("campo-complemento"));
            campoComplemento.sendKeys("Apto 1");
            WebElement campoBairro = driver.findElement(By.id("campo-bairro"));
            campoBairro.sendKeys("Bairro 1");
            WebElement campoCidade = driver.findElement(By.id("campo-cidade"));
            campoCidade.sendKeys("Cidade 1");
            WebElement campoEstado = driver.findElement(By.id("campo-estado"));
            campoEstado.sendKeys("SP");
            WebElement campoTelefone = driver.findElement(By.id("campo-telefone"));
            campoTelefone.sendKeys("11987654321");
            WebElement campoEmail = driver.findElement(By.id("campo-email"));
            campoEmail.sendKeys("usuario1@email.com");

            // Realizar a locação do filme
            Thread.sleep(10000); // Adiciona um delay de 10 segundos
            WebElement botaoConfirmarLocacao = driver.findElement(By.xpath("//button[contains(@class, 'btn') and contains(text(), 'Confirmar Locação')]"));
            botaoConfirmarLocacao.click();

            // Verificar se a locação foi realizada com sucesso
            WebDriverWait wait2 = new WebDriverWait(driver, 10);
            WebElement mensagemLocacaoRealizada = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class, 'alert-success') and contains(text(), 'Locação realizada com sucesso!')]")));
             assertEquals(mensagemLocacaoRealizada.getText(), "Locação realizada com sucesso!");
            } catch (InterruptedException e) {
             e.printStackTrace();
        }
}

@AfterTest
public void tearDown() {
    // Fecha o navegador
    driver.quit();
}

}

*/