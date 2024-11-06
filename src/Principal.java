import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        int opcion = 1;
        var muestraResultado = new Conversor();
        Scanner lectura = new Scanner(System.in);

        String menu = ("""
                    
                    ***  ¡Bienvenido/a al conversor de divisas!  ***
                    
                    1- Peso argentino =>> Dolar
                    2- Dolar =>> Peso argentino
                    3- Peso argentino =>> Real brasileño
                    4- Real brasileño =>> Peso Argentino
                    5- Peso argentino =>> Peso colombiano
                    6- Peso colombiano =>> Peso argentino
                    7- Salir
                    
                    Ingrese una opción valida:
                    
                    *******************************************
                    """);

        while (opcion != 7) {
            System.out.println(menu);
            opcion = lectura.nextInt();

            if (opcion < 7 && opcion > 0) {

                System.out.println("Ingrese el monto que desea convertir:");
                var asd = lectura.next();

                double monto = afterTextChanged(asd);
                double result;
                switch (opcion) {
                    case 1:
                        result = muestraResultado.convertir("ARS", "USD", monto);
                        System.out.println(monto + " Pesos argentinos, son: " + result + " dolares");
                        break;
                    case 2:
                        result = muestraResultado.convertir("USD", "ARS", monto);
                        System.out.println(monto + " dolares, son: " + result + " pesos argentinos");
                        break;
                    case 3:
                        result = muestraResultado.convertir("ARS", "BRL", monto);
                        System.out.println(monto + " pesos argentinos, son: " + result + " reales");
                        break;
                    case 4:
                        result = muestraResultado.convertir("BRL", "ARS", monto);
                        System.out.println(monto + " reales, son: " + result + " pesos argentinos");
                        break;
                    case 5:
                        result = muestraResultado.convertir("ARS", "COP", monto);
                        System.out.println(monto + " pesos argentinos, son: " + result + " pesos colombianos");
                        break;
                    case 6:
                        result = muestraResultado.convertir("COP", "ARS", monto);
                        System.out.println(monto + " pesos colombianos, son: " + result + " pesos argentinos");
                        break;
                }
            } else {
                if (opcion == 7) {
                    System.out.println("Gracias por utilizar nuestro conversor.");
                    opcion = 7;
                } else {
                    System.out.println("Opción no valida, por favor ingrese un número del menú.");
                }
            }
        }
    }

    public static double afterTextChanged(String asd) {
        double doubleValue = 0;
        if (asd != null) {
            try {
                doubleValue = Double.parseDouble(asd.toString().replace(',', '.'));
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un monto en formato numerico.");
            }
        }
        return doubleValue;
    }
}