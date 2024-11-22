public class Main {
    public static void main(String[] args) {

        //variables y constantes
    /*variable: Es un nombre que se asocia con una porcion de la memoria de la computadora,
     en la que se guarda un valor predeterminado
     int x = 25;

    String - stores text, such as "Hello". String values are surrounded by double quotes
    int - stores integers (whole numbers), without decimals, such as 123 or -123
    float - stores floating point numbers, with decimals, such as 19.99 or -19.99
    char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
    boolean - stores values with two states: true or false

     constantes: Son valores que se mantienen siempre de igual manera
     y que no dependen de una asignacion para obtener el mismo
     el valor del iva 21%

    tipo de dato / nombre
	int        / numero
     */

    //Cambiar el valor de myNumdesde 15 a 20
        int myNum1 = 15;
        myNum1 = 20;
        System.out.println(myNum1);

    /*Si no desea que otros (o usted mismo) sobrescriban los valores existentes, use la finalpalabra clave
    (esto declarará la variable como "FINAL" o "CONSTANTE", lo que significa que no se puede cambiar y es de solo lectura):
    */
        final int myNum = 10;
    //myNum = 25; genera un error de no puedes asignar un valor a la variable final


        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";

        //numeros
        int numero = 10;
        byte entero = 7;
        float decimos = 3.45f;
        double decimal = 10.5d;
        long enteroLargo = 999999999;
        System.out.println(decimal);


        boolean boleano = true;

        // para carater es comilla simple ''
        char caracterletra = 'a';

        //para texto es con comilla doble ""
        String texto = " Cadena de carcateres";


        //para tipos de numeros si se pueden concatenar
        System.out.println(numero + entero + decimos + decimal + enteroLargo);
        System.out.println(boleano);
        //letras y texto se pueden conctenar
        System.out.println(caracterletra + texto);

        //para elevar a la potencia de 10 en float y double
        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println(f1);
        System.out.println(d1);

    }
}