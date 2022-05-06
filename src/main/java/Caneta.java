public class Caneta {

    private String CorCaneta;
    private String TipoCaneta;
    private boolean CanetaAberta;
    private boolean CanetaFechada;



    public String getCorCaneta() { return CorCaneta; }
    public void setCorCaneta(String corCaneta) {CorCaneta = corCaneta; }

    public String getTipoCaneta() {return TipoCaneta;}
    public void setTipoCaneta(String tipoCaneta) {TipoCaneta = tipoCaneta;}


    public void setCanetaAberta(boolean canetaAberta) {
        CanetaAberta = canetaAberta;
    }
    public void setCanetaFechada(boolean canetaFechada) {
        CanetaFechada = canetaFechada;
    }


    public  String Cor(){
        if (this.CorCaneta == this.getCorCaneta()){
            return "Azul";
        }else {
            return "Não azul";
        }
    }

    public  String Tipo(){
        if (this.TipoCaneta == this.getTipoCaneta()){
            return "bic";
        }else {
            return "Não bic";
        }
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
                "CorCaneta='" + CorCaneta + '\'' +
                ", TipoCaneta='" + TipoCaneta + '\'' +
                ", CanetaAberta=" + CanetaAberta +
                ", CanetaFechada=" + CanetaFechada +
                '}';
    }

}
