

public class Moneda {
    private String conversion_rate;

    public double dameValor (){
        return Double.parseDouble(conversion_rate);
    }

}
