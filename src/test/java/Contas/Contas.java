package Contas;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Contas {
    SelenideElement btnContas = $(".dropdown-toggle");
    SelenideElement btnAdicionar = $(By.linkText("Adicionar"));
    SelenideElement inputNome = $("#nome");
    SelenideElement btnSalvar = $(".btn-primary");
    SelenideElement alert = $(".alert-success");

    public void adicionarConta(){
        btnContas.click();
        btnAdicionar.click();
    }

    public void inserirConta(String Descricao) {
        inputNome.setValue(Descricao);
    }

    public void salvar() {
        btnSalvar.click();
    }

    public String alerta(){
        return alert.getText();
    }
}
