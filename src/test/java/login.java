import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class login {

    @Test
    public void logarComSucesso(){
        open("https://seubarriga.wcaquino.me/login");

        $(By.id("email")).setValue("hugo.ferreira@bluesoft.com.br");
        $(By.id("senha")).setValue("8437");
        //$(By.className("btn-primary")).click();
        $(byClassName("btn-primary")).click();

        Assertions.assertEquals("Bem vindo, hugo!", $(".alert-success").getText());


    }

    public void logarNoSistema(){
        open("https://seubarriga.wcaquino.me/login");

        $(By.id("email")).setValue("hugo.ferreira@bluesoft.com.br");
        $(By.id("senha")).setValue("8437");
        //$(By.className("btn-primary")).click();
        $(byClassName("btn-primary")).click();

    }
    @Test
    public void loginSemSenha(){
        open("https://seubarriga.wcaquino.me/login");

        $("#email").setValue("gustavo.chagas@bluesoft.com.br");
        //$(By.id("senha")).setValue("8437");
        //$(By.className("btn-primary")).click();
        $(byClassName("btn-primary")).click();

        Assertions.assertEquals("Senha é um campo obrigatório", $(".alert-danger").getText());

    }

    @Test
    public void addConta(){
        logarNoSistema();
        SelenideElement btnContas = $(".dropdown-toggle");
        SelenideElement btnAdicionar = $(By.linkText("Adicionar"));
        SelenideElement inputNome = $("#nome");
        SelenideElement btnSalvar = $(".btn-primary");
        SelenideElement alert = $(".alert-success");

        btnContas.click();
        btnAdicionar.click();
        inputNome.setValue("Gustavo Chagas");
        btnSalvar.click();


        Assertions.assertEquals("Conta adicionada com sucesso!", alert.getText());
    }


}
