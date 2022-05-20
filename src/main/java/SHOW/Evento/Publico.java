package SHOW.Evento;

public class Publico {
    private int idade;
    private String documento;

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }


    public String Entrada(){
        if (this.idade >= 18) {
            return "Mostrar Documento";
        } else {
            return "Acompanhado";
        }
    }

    public boolean Documentacao(){
        if (this.documento == "Mostrar"){
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
                ", documento='" + getDocumento() + '\'' +
                '}';
    }
}
