package SHOW.Evento;

public class Local {
    private String nome;
    private double capacidade;
    private String disponibilidadeData;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getCapacidade() {
        return capacidade;
    }
    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }
    public String getDisponibilidadeData() {
        return disponibilidadeData;
    }
    public void setDisponibilidadeData(String disponibilidadeData) {
        this.disponibilidadeData = disponibilidadeData;
    }


    public boolean NomeLocal(){
        if (this.nome == "Classic Hall"){
            return true;
        }else{
            return false;
        }
    }

    public String CapacidadePessoas(){
        if(this.capacidade <= 18.000){
            return "Suporta";
        }else{
            return "Sobrecarregado";
        }
    }

    public String DisponibilidadeLocal(){
        if(this.disponibilidadeData == "20/07/2022" && CapacidadePessoas() == "Suporta"){
            return "Disponivel";
        }else{
            return "Não disponivel";
        }
    }

    @Override
    public String toString() {
        return "Local{" +
                "nome='" + getNome()+ '\'' +
                ", capacidade=" + getCapacidade() +
                ", disponibilidadeData='" + getDisponibilidadeData() + '\'' +
                '}';
    }
}
