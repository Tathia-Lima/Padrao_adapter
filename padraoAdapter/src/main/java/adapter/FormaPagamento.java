package adapter;

public class FormaPagamento implements IPagamento {

    private String modoPagamento;

    @Override
    public String getPagamento() {
        return this.modoPagamento;
    }

    @Override
    public void setPagamento(String modoPagamento) {
        this.modoPagamento = modoPagamento;
    }
}
