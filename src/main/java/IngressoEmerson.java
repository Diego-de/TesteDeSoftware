public class IngressoEmerson {

    private double valor;
    private int quantidade;


    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }




    public String tipoIngresso(){
        if(this.getValor() >= 50){
            return "Camarote";
        }else{
            return "Não tem essa opção";
        }
    }

    public int quantidadeIngresso(int aVenda){
        return  aVenda - this.quantidade;
    }


    public double Saldo(){
        return this.getValor() -  (this.quantidade * 50);
    }


    @Override
    public String toString() {
        return "Ingresso{" +
                "valor=" + this.getValor() +
                ", quantidade=" + this.getQuantidade() +

                '}';
    }
}
