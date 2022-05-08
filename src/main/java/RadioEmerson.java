public class RadioEmerson {

    private int volume;
    private double canal;

    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public double getCanal() {
        return canal;
    }
    public void setCanal(double canal) {
        this.canal = canal;
    }


    public boolean aumentaV(){
        if(this.getVolume() + 1 == 100){
            return true;
        }else{
            return false;
        }
    }

    public boolean diminuirV(){
        if(this.getVolume() - 1 == 98){
            return true;
        }else{
            return false;
        }
    }

    public boolean TrocaCanal(){
        if(this.getCanal() + 1 == 103.1){
            return true;
        }else{
            return false;
        }
    }


    @Override
    public String toString() {
        return "Radio{" +
                "volume=" + volume +
                ", canal=" + canal +
                '}';
    }
}
