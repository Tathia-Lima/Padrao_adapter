package adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompraTest {

    @Test
    void deveRetornarModoPagamentoCartaoCredito() {
        Compra compra = new Compra();
        compra.setPagamento("Cartão de Credito");

        assertEquals("Cartão de Credito", compra.getPagamento());
    }

    @Test
    void deveRetornarModoPagamentoBoletoBancario() {
        Compra compra = new Compra();
        compra.setPagamento("Boleto Bancário");

        assertEquals("Boleto Bancário", compra.getPagamento());
    }

    @Test
    void deveRetornarModoPagamentoPix() {
        Compra compra = new Compra();
        compra.setPagamento("Pix");

        assertEquals("Pix", compra.getPagamento());
    }
    @Test
    void deveRetornarPagamentoCartãoCredito() {
        Compra compra = new Compra();
        compra.setPagamento("Cartão de Credito");;

        assertEquals("Cartão de Credito", compra.getPagamento());
    }

    @Test
    void deveRetornarCartãoCredito() {
        Compra compra = new Compra();
        compra.setPagamento("Cartão de Credito");;

        assertEquals("DinheiroX", compra.getModoPagamento());
    }

    @Test
    void deveRetornarPagamentoBoleto() {
        Compra compra = new Compra();
        compra.setPagamento("Boleto Bancário");;

        assertEquals("DinheiroY", compra.getModoPagamento());
    }
    @Test
    void deveRetornarPagamentoPix() {
        Compra compra = new Compra();
        compra.setPagamento("Pix");;

        assertEquals("DinheiroZ", compra.getModoPagamento());
    }
    
}
