public class Calculadora {

    public double soma(double a, double b){
        return a+b;
    }

    public double porcentagem(double a){
        double resultado = 0.15 * a;
        return resultado;
    }

    public double potencia(double a, double b){
        double resultado = Math.pow(a,b);
        return  resultado;
    }


}
