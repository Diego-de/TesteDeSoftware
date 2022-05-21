package SHOW.Evento;

public class Publico {
    private int idade;

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }


    public String Entrada(){
        if (this.idade >= 18) {
            return "Mostrar";
        } else {
            return "Acompanhado";
        }
    }

    public boolean Documentacao(){
        if (Entrada() == "Mostrar"){
            return true;
        }else{
            return false;
        }
    }

    public String Pulseira(){
        if (Documentacao()){
            return "Recebeu pulseira";
        }else{
            return "Nao recebeu";
        }
    }

    @Override
    public String toString() {
        return "Publico{" +
                "idade=" + getIdade() +
                '}';
    }
}
