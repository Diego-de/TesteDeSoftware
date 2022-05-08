public class CarroDiego {

    private double saldo;
    private double precogasolina;
    private boolean ligado;

    public void setSaldo(double saldo) {

        this.saldo = saldo;
    }
    public void setPrecogasolina(double precogasolina) {
        this.precogasolina = precogasolina;
    }
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public double getSaldo() {
        return saldo;
    }
    public double getPrecogasolina() {
        return precogasolina;
    }
    public boolean getLigado() {
        return ligado;
    }


    public double comprarGasolina(){
        double result = this.getSaldo() - (this.getPrecogasolina()* 3);
        return result;
    }


    public boolean carroLigado(boolean v){
        if (this.ligado == v){
            return true;
        }else{
            return false;
        }
    }

    public String andando(){
        if (getLigado() == true){
            return "andando";
        }else{
            return "parado";
        }
    }

    @Override
    public String toString() {
        return "Carro{" +
                ", saldo=" + saldo +
                ", precogasolina=" + precogasolina +
                ", ligado=" + ligado +
                '}';
    }
}


