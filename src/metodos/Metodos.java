

package metodos;
import java.util.*;
/*
 * @author Angel
 */

/**
 *
 * @author vesprada         Hola
 */

public class Metodos {
    
    /**
     *
     */
    public static void inicio(){  // Aqui inicio el programa y recojo la cadena que se va a utilizar.
        
        Scanner intro = new Scanner(System.in);
        Variable a = new Variable();
        System.out.println("ORDENACION DE CADENAS");
        System.out.println("---------------------");
        System.out.println("Atencion - el programa ordena cadenas alfanuméricas,");
        System.out.println("los resultados de la media podrían no ser exactos.");
        System.out.println("---------------------");
        System.out.print("\nDime la cadena a ordenar: ");
        String frase = intro.next();
        //String frase = "213";
        a.setCadena(frase);//Variable "frase" al privado que se va directamente.
        System.out.println("La cadena es: "+a.getCadena());
    }
    //--------------------------Esto es un separador---------------------------
    /**
     Aqui esta el metodo CrearVector 
    */
    public static void CrearVector(){// aqui creo el vector y la mando a la variable privada, para trabajar indirectamente con ella.
        Variable a = new Variable();
        char[] v = new char[a.getCadena().length()];
        System.out.println("El vector será de "+a.getCadena().length()+" posiciones.");
        for (int x=0;x<=a.getCadena().length()-1;x++){
            v[x]=a.getCadena().charAt(x);
        }
        a.setVector(v);//El vector crea cada posicion con cada caracter de la cadena y lo guarda.
        System.out.println("El vector ha sido creado con la cadena "+a.getCadena());
    }
    //--------------------------Esto es un separador---------------------------
    /**
     Aqui esta el metodo MenorMayor
      @param 
    */
    
    /**
     *
     * @return v
     */
    public static char[] MenorMayor(){//ordenacion de menor a mayor
        Variable a = new Variable();// Conecto con las variables privadas
        char[] v = new char[a.getCadena().length()];// creo un vector temporal que sera el que devuelva al main para no alterar el vector principal
        v=a.getVector();//Y lo copio tal cual.
        for (int x=0;x<(a.getCadena().length());x++){// proceso de ordenacion en burbuja.
            for(int y=0;y<(a.getCadena().length())-1;y++){
                if (v[y+1]<v[y]){
                    char num1 = v[y];//auxiliar...
                    v[y]=v[y+1];
                    v[y+1]=num1;
                }
            }
        }
        System.out.println("Vector ordenado.");
        return v;//Retornamos el vector ordenado, seguimos teniendo el vector desordenado en la privada.
    }
    //--------------------------Esto es un separador---------------------------
    /**
     Aqui esta el metodo Mayormenor
     * @return v
    */
    public static char[] MayorMenor(){//Hacemos lo mismo
        Variable a = new Variable();
        char[] v = new char[a.getCadena().length()];
        v=a.getVector();
        for (int x=0;x<(a.getCadena().length());x++){
            for(int y=0;y<(a.getCadena().length())-1;y++){ //lo unico que cambia respecto al anterior es el '<'
                if (v[y+1]>v[y]){
                    char num1 = v[y];
                    v[y]=v[y+1];
                    v[y+1]=num1;
                }
            }
        }
        System.out.println("Vector ordenado.");
        return v;
    }
    //--------------------------Esto es un separador---------------------------
    /**
     Aqui esta el metodo Menor 
     * @return v[a.getCadena().length()-1]
    */
    public static char Menor(){
    Variable a = new Variable();
    char[] v = new char[a.getCadena().length()];
    v=a.getVector();
    for(int y=0;y<(a.getCadena().length())-1;y++){
             char aux=v[y];
             if (v[y+1]>aux){
                 v[y+1]=v[y];
             }
         }
        return v[a.getCadena().length()-1];
    }
    //--------------------------Esto es un separador---------------------------
    /**
     Aqui esta el metodo Mayor
     * @return v[a.getCadena().length()-1]
    */
    public static char Mayor(){
    Variable a = new Variable();
    char[] v = new char[a.getCadena().length()];
    v=a.getVector();
    for(int y=0;y<(a.getCadena().length())-1;y++){
             char aux=v[y];
             if (v[y+1]<aux){
                 v[y+1]=v[y];
             }
         }
        return v[a.getCadena().length()-1];
    }
    //--------------------------Esto es un separador---------------------------
    /**
     Aqui esta el metodo Palindromo 
     * @return pal
    */
    public static boolean Palindromo(){
    Variable a = new Variable();
    char[] v = new char[a.getCadena().length()];
    char[] c = new char[a.getCadena().length()];
    boolean pal=false;
     v=a.getVector();
     int n=0;
     int m=a.getCadena().length()-1;
     do{
        c[n]=a.getCadena().charAt(m);
        n++;
        m--;
     }while(n<m);
     for (int z=0;z<(a.getCadena().length())-1;z++){
         if(v[z]==c[z]){
         pal=true;
        }  
     }
       return pal;
    }
    //--------------------------Esto es un separador---------------------------
    /**
     Aqui esta el metodo Iguales
     * @param comparacion
     * @return iguales
    */
    public static boolean Iguales(String comparacion){
    Variable a = new Variable();
    char[] v = new char[a.getCadena().length()];
    char[] c = new char[comparacion.length()];
    boolean iguales=false;
    v=a.getVector();
     for (int z=0;z<(a.getCadena().length());z++){
     c[z]=comparacion.charAt(z);
     }
         for(int y=0;y<(a.getCadena().length())-1;y++){
             if (v[y]==c[y]){
                 iguales=true;
             }
         }
        
    return iguales;
    }
    //--------------------------Esto es un separador---------------------------
    /**
     Aqui esta el metodo Copiar
     * @return a.getVector()
    */
    public static char[] Copiar(){
    Variable a = new Variable();
    return a.getVector();//Retorna el vector y ya tiene la copia creada.
    }
    //--------------------------Esto es un separador---------------------------
    /**
     Aqui esta el metodo Media
     * @return 
    */
    public static char Media(){
    Variable a = new Variable();
    char[] v = new char[a.getCadena().length()];
    int media=0;
    v=a.getVector();
    for (int z=0;z<(a.getCadena().length());z++){//se suman y se divide por el numero de caracteres.
    media=media+v[z];
    }
    media=media/a.getCadena().length();
    return (char)media;//Al ser caracter hara alguna cosa rara, pero al ingresar numeros enteros si que funciona (redondeando);
    }
    //--------------------------Esto es un separador---------------------------
    /**
     Aqui esta el main con el Switch
     * @param args
    */
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        Variable a = new Variable();
        
        String continuar;
        
        do {
            inicio();//<----- Metodo 1
            System.out.print ("¿Es correcto? s/n: ");
            continuar = intro.next();
            //continuar = "s";
        } while (!continuar.equals("s"));
        
        CrearVector();//<----- Metodo 2
        char[] resultado=new char[a.getCadena().length()];
        int opcion;
        System.out.println("-------------------------");
        System.out.println("1 - Ordenar de menor a mayor");
        System.out.println("2 - Ordenar de mayor a menor");
        System.out.println("3 - Ver el menor");
        System.out.println("4 - Ver el mayor");
        System.out.println("5 - Comparar cadenas");
        System.out.println("6 - Palindromo");
        System.out.println("7 - Duplicar");
        System.out.println("8 - Media");
        System.out.println("-------------------------");
        System.out.print("¿Qué deseas hacer?: ");
        opcion=intro.nextInt();
        switch(opcion){
        case 1:
            resultado=MenorMayor();//<----- Metodo 3
            for (int x=0;x<=a.getCadena().length()-1;x++){
            System.out.print(resultado[x]);
            }
            break;
        case 2:
            resultado=MayorMenor();//<----- Metodo 4
            for (int x=0;x<=a.getCadena().length()-1;x++){
            System.out.print(resultado[x]);
            }
            break;
        case 3:
           char Result = Menor();//<----- Metodo 5
           System.out.println("El menor es "+Result);
            break;
        case 4:
            Result=Mayor();//<----- Metodo 6
            System.out.println("El mayor es "+Result);
            break;
        case 5:
            System.out.print("Inserta una cadena para comparar: ");
            String comparacion=intro.next();
            if (Iguales(comparacion))
            System.out.println("Son iguales");
            else
            System.out.println("No son iguales");
            break;
        case 6:
            if (Palindromo())
                System.out.println("Es palindromo");
            else
                System.out.println("No es palindromo");
            break;
        case 7:
            char[] v = new char[a.getCadena().length()];
            v=Copiar();//El vector "v" se copiara del original, para ser usado en el main.
            break;
        case 8:
           char med = Media();
           System.out.println("La media es [ "+med+" ]");
           break;
        default: System.err.println("Opción inválida.");
            break;
        }
        
    }
    
}
