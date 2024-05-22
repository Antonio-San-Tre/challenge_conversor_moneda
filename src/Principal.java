
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {

        Scanner entradaDatos = new Scanner(System.in);
        int valorBillete;
        int opcionUsuario =0;

        while (opcionUsuario !=7) {

            System.out.println("**********************************");
            System.out.println("""
                    Bienvenido al coversor de monedas...
                    1) Dolar a peso mexicano
                    2) Peso mexicano a dolar
                    3) Dolar a peso argentino
                    4) Peso argentino a dolar
                    5) Dolar a euro
                    6) Euro a dolar1
                    7) Salir
                    Elija un opcion valida
                    ******************************************************""");

            opcionUsuario = entradaDatos.nextInt();

            ConsultaMoneda consulta = new ConsultaMoneda();
            switch (opcionUsuario) {

                case 1:
                    System.out.println("Ingrese el valor que desees convertir...");
                    valorBillete = entradaDatos.nextInt();
                    System.out.println("El valor de "+valorBillete+" [USD] corresponde al valor final"
                            +" de =>>> "+valorBillete*(consulta.convierteMoneda().dameValor())+" [MXN].");
                    break;

                case 2:
                    System.out.println("Ingrese el valor que desees convertir...");
                    valorBillete = entradaDatos.nextInt();
                    System.out.println("El valor de "+valorBillete+" [MXN] corresponde al valor final"
                            +" de =>>> "+valorBillete*(consulta.convierteMoneda1().dameValor())+" [USD].");
                    break;

                case 3:
                    System.out.println("Ingrese el valor que desees convertir...");
                    valorBillete = entradaDatos.nextInt();
                    System.out.println("El valor de "+valorBillete+" [USD] corresponde al valor final"
                            +" de =>>> "+valorBillete*(consulta.convierteMoneda2().dameValor())+" [ARS].");
                    break;

                case 4:
                    System.out.println("Ingrese el valor que desees convertir...");
                    valorBillete = entradaDatos.nextInt();
                    System.out.println("El valor de "+valorBillete+" [ARS] corresponde al valor final"
                            +" de =>>> "+valorBillete*(consulta.convierteMoneda3().dameValor())+" [USD].");
                    break;

                case 5:
                    System.out.println("Ingrese el valor que desees convertir...");
                    valorBillete = entradaDatos.nextInt();
                    System.out.println("El valor de "+valorBillete+" [USD] corresponde al valor final"
                            +" de =>>> "+valorBillete*(consulta.convierteMoneda4().dameValor())+" [EUR].");
                    break;

                case 6:
                    System.out.println("Ingrese el valor que desees convertir...");
                    valorBillete = entradaDatos.nextInt();
                    System.out.println("El valor de "+valorBillete+" [EUR] corresponde al valor final"
                            +" de =>>> "+valorBillete*(consulta.convierteMoneda5().dameValor())+" [USD].");
                    break;

                case 7:
                    System.out.println("Saliendo del programa");
                    break;

                default:
                    System.out.println("Opcion no valida, ingrese un valor valido");
            }

        }

    }
}
