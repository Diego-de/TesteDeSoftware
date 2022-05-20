package SHOW.Capital;

public class TipoIngresso {

        private double valor;

        public double getValor() {
                return valor;
        }
        public void setValor(double valor) {
                this.valor = valor;
        }


        public String TipoFront(){
           if (this.valor == 50){
                 return "Front";
           }else{
               return "Não é Front";
           }
        }

        public String TipoGold(){
                if (this.valor == 110){
                        return "Gold";
                }else{
                        return "Não é Gold";
                }
        }

        public String TipoCamarote(){
                if (this.valor == 150){
                        return "Camarote";
                }else{
                        return "Não é Camarote";
                }
        }


        @Override
        public String toString() {
                return "TipoIngresso{" +
                        "valor=" + getValor() +
                        '}';
        }
}
