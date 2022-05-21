package SHOW.Capital;

public class Despesas {

    private double pagamentoCantor;
    private double pagamentoLocal;


    public double getPagamentoCantor() {
        return pagamentoCantor;
    }
    public void setPagamentoCantor(double pagamentoCantor) {
        this.pagamentoCantor = pagamentoCantor;
    }

    public double getPagamentoLocal() {
        return pagamentoLocal;
    }
    public void setPagamentoLocal(double pagamentoLocal) {
        this.pagamentoLocal = pagamentoLocal;
    }

    public double TaxaCantor(){
        double resultado = 1860000.0 - this.pagamentoCantor;
        return resultado;
    }

    public double TaxaLocal(){
        double resultado = 1460000.0 - this.pagamentoLocal;
        return resultado;
    }

    public double totalDespesas(){
        double resultado = this.pagamentoCantor + this.pagamentoLocal;
        return resultado;
    }


    @Override
    public String toString() {
        return "Despesas{" +
                "pagamentoCantor=" + getPagamentoCantor() +
                ", pagamentoLocal=" + getPagamentoLocal() +
                '}';
    }
}
