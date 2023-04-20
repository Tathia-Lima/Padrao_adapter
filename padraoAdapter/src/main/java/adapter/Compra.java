package adapter;

public class Compra {

    IPagamento pagamento;
    PagamentoAdapter persistencia;

    public Compra() {
        pagamento = new FormaPagamento();
        persistencia = new PagamentoAdapter(pagamento);
    }

    public void setPagamento(String modoPagamento) {
        pagamento.setPagamento(modoPagamento);
        persistencia.salvarFormaPagamento();
    }

    public String getPagamento() {
        return persistencia.recuperarFormaPagamento();
    }

    public String getModoPagamento() {
        return persistencia.getModoPagamento();
    }

}

