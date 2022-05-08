public class CanetaDiego {

    private boolean CanetaAberta;
    private boolean CanetaFechada;


    public void setCanetaAberta(boolean canetaAberta) {
        CanetaAberta = canetaAberta;
    }
    public void setCanetaFechada(boolean canetaFechada) {
        CanetaFechada = canetaFechada;
    }

    public boolean getCanetaAberta() {
        return CanetaAberta;
    }
    public boolean getCanetaFechada() {
        return CanetaFechada;
    }

    public boolean Aberta(boolean testar) {
        if (this.CanetaAberta == testar){
            return true;
        }else{
            return false;

        }
    }

    public boolean Fechada(boolean testar) {
        if (this.CanetaFechada == testar){
            return true;
        }else{
            return false;

        }
    }
    public String Escreve() {
        if(this.CanetaAberta == true){
            return "Escrevendo...";
        }else{
          return "Caneta Fechada";
        }
    }

    @Override
    public String toString() {
        return "Caneta{" +
                ", CanetaAberta=" + this.getCanetaAberta() +
                ", CanetaFechada=" + this.getCanetaFechada() +
                '}';
    }

}
