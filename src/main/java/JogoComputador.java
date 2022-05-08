public class JogoComputador {

    private double memoria;
    private double memoriaJogo;
    private boolean ligado;


    public void setMemoria(double memoria) {
        this.memoria = memoria;
    }
    public void setMemoriaJogo(double memoriaJogo) {
        this.memoriaJogo = memoriaJogo;
    }
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public double getMemoria() {
        return memoria;
    }
    public boolean getLigado() {
        return ligado;
    }
    public double getMemoriaJogo() {
        return memoriaJogo;
    }

    public boolean ComputadorLigado(){
        if(this.ligado == true){
            return true;
        }else{
            return false;
        }
    }

    public boolean Suporta(){
        if(this.getMemoria() > this.getMemoriaJogo()){
            return true;
        }else{
            return false;
        }
    }

    public String jogoRodando(){
        if(this.getLigado() == true){
            return "rodando...";
        }else{
            return "Não está rodando...";
        }
    }

    @Override
    public String toString() {
        return "JogoComputador{" +
                "memoria=" + memoria +
                ", memoriaJogo=" + memoriaJogo +
                ", ligado=" + ligado +
                '}';
    }
}
