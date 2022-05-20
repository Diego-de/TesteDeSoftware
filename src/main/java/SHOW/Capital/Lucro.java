package SHOW.Capital;

public class Lucro {

    private double IngressosVendidos;
    private double resultado;

    public double getIngressosVendidos() {
        return IngressosVendidos;
    }
    public void setIngressosVendidos(double ingressosVendidos) {
        IngressosVendidos = ingressosVendidos;
    }



    public double QuantidadeVendidosFront(){
        double resultado = this.IngressosVendidos * 50;
        return resultado;
    }

    public double QuantidadeVendidosGold(){
        double resultado = this.IngressosVendidos * 110;
        return resultado;
    }

    public double QuantidadeVendidosCamatore(){
        double resultado = this.IngressosVendidos * 150;
        return resultado;
    }

    public double LucroTotal(){
        resultado = QuantidadeVendidosFront() + QuantidadeVendidosGold() +QuantidadeVendidosCamatore();
        return resultado;
    }



    @Override
    public String toString() {
        return "Lucro{" +
                "IngressosVendidos=" + getIngressosVendidos() +
                ", resultado=" + resultado +
                '}';
    }
}
