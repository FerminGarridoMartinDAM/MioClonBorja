import java.util.Scanner;

public class SentenciaSwitch {


    public void usoSwitchInt(){

        //obtenido por el usuario o por parametros
        int valor =7;
        //Quiero evaluar si los elementos son 1 , 5 , 7 o resto
        switch (valor){
            case 1:
                //cuerpo cuando la variable toma valor 1
                System.out.println("Toma valor de 1");
                break;
            case 5:
                System.out.println("Toma valor de 5");
                break;
            case 7:
                System.out.println("Toma valor de 7");
                break;
            default:
                System.out.println("Valor no coincidente con 1 , 5 o 7");
        }
        System.out.println("Terminando el switch");
    }


    public void usoSwitchString(){
        String nombre = "Borja";
        switch (nombre.toLowerCase()){
            case "borja":
                System.out.println("El nombre es Borja");
                break;


            case "maria":
                System.out.println("El nombre es Maria");
                break;

            case "juan":
                System.out.println("El nombre es Juan");
                break;

            default:
                System.out.println("El nombre no coincide");
        }
    }

    public void usoSwitchChar(){
        char letra = 'A';
        switch (letra){
            case 'A':
                System.out.println("El character es A");
                break;
            case 'B':
                System.out.println("El character es B");
                break;
            case'C':
                System.out.println("El character es C");
                break;
            case 'a':
                System.out.println("El character es a");
                break;
            case 68:
                System.out.println("El character es el equivalente en char ");
                break;
            default:
                System.out.println("Character no coincidente con los casos");
        }
    }


    public void usoSwitchLambda(){
        int nota = 7;
        switch (nota){
            case 1 ->{
                System.out.println("Seleccionado caso 1");
            }
            case 2 ->{System.out.println("Seleccionado caso 2");}
            case 3 ->{System.out.println("Seleccionado caso 3");}
            case 4 ->{System.out.println("Seleccionado caso 4");}
            case 5|6|7|8|9|10|11|12 ->{System.out.println("Seleccionado caso 5");}
            default -> {
                System.out.println("No coindice con los casos");
            }
        }
    }

    public void menuOpciones(){
        System.out.println("Menu operaciones");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Divicir");
        System.out.println("5. Modulo");
        Scanner scn = new Scanner(System.in);
        int option = scn.nextInt();
        switch (option){
            case 1 ->{
                System.out.println("Vas a sumar");
            } case 2 ->{
                System.out.println("Vas a restar");
            } case 3 ->{
                System.out.println("Vas a multiplicar");
            } case 4 ->{
                System.out.println("Vas a dividir");
            } case 5 ->{
                System.out.println("Vas a modulo");
            }
        }
    }

}
