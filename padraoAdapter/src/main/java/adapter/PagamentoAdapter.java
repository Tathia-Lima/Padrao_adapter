package adapter;

public class PagamentoAdapter extends Pagamento {

    private IPagamento formaPagamento;

    public PagamentoAdapter(IPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String recuperarFormaPagamento() {
        if (this.getModoPagamento() == "DinheiroX")
            formaPagamento.setPagamento("Cartão de Credito");
        else if (this.getModoPagamento() == "DinheiroY")
            formaPagamento.setPagamento("Boleto Bancário");
        else if (this.getModoPagamento() == "DinheiroZ")
            formaPagamento.setPagamento("Pix");
        return formaPagamento.getPagamento();
    }

    public void salvarFormaPagamento() {
        if (formaPagamento.getPagamento().equals("Cartão de Credito"))
            this.setModoPagamento("DinheiroX");
        else if (formaPagamento.getPagamento().equals("Boleto Bancário"))
            this.setModoPagamento("DinheiroY");
        else if (formaPagamento.getPagamento().equals("Pix"))
            this.setModoPagamento("DinheiroZ");
        else
            this.setModoPagamento("Dinheiro");
    }
}
