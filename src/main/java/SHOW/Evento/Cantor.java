package SHOW.Evento;

public class Cantor {

    private String EstiloMusical;
    private boolean presenca;
    private String horario;


    public String getEstiloMusical() {
        return EstiloMusical;
    }
    public void setEstiloMusical(String estiloMusical) {
        this.EstiloMusical = estiloMusical;
    }
    public boolean getPresenca() {
        return presenca;
    }
    public void setPresenca(boolean presenca) {
        this.presenca = presenca;
    }
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }



    public String EstiloMusica(){
        if (this.EstiloMusical == "Joao Gomes"){
            return "Fórro";
        }else{
            return "Outros";
        }
    }


    public boolean Presente(){
        if (this.presenca == true){
            return true;
        }else{
            return false;
        }
    }

    public String Hora(){
        if (this.horario == "21:30" && this.presenca == true){
            return "Cantar";
        }else{
            return "Está atrasado,Vamos para o proximo cantor!";
        }
    }

    @Override
    public String toString() {
        return "Cantor{" +
                "Nome do Cantor: '" + getEstiloMusical() + '\'' +
                ", Está presente: " + getPresenca() +
                ", horario que vai cantar: " + getHorario() + '\'' +
                '}';
    }
}
