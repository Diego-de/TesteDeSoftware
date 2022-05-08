public class IngressoEmerson {

    private double valor;
    private int quantidade;
    private boolean lucro;


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

    public boolean getLucro() {
        return lucro;
    }
    public void setLucro(boolean lucro) {
        this.lucro = lucro;
    }


    public String tipoIngresso(){
        if(this.getValor() >= 50){
            return "Camarote";
        }else{
            return "Não tem essa opção";
        }
    }

    public int quantidadeIngresso(int aVenda){
        return aVenda - this.quantidade;
    }


    public boolean lucro(){
        if (this.getQuantidade() * this.getValor() >= 2000){
            return true;

        }else{
            return false;
        }
    }


    @Override
    public String toString() {
        return "Ingresso{" +
                "valor=" + this.getValor() +
                ", quantidade=" + this.getQuantidade() +
                ", lucro=" + this.getLucro()+
                '}';
    }
}
