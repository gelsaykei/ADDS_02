package com.sena.do_while;
    import java.util.Scanner;
public class Do_While {
    static Scanner dato = new Scanner(System.in);
    public static void main(String[] args) {
        String sexo;
    int eda, nhc, contU=0, contC=0, contG=0, tc;
        
      do{
        System.out.println("Ingrese el numero de historia clínica: ");
        nhc=dato.nextInt();
        if(nhc==-1){
            break;
        }
        System.out.println("Ingrese la edad: ");
        eda=dato.nextInt();
        dato.nextLine();
        System.out.println("Ingrese el sexo del paciente: ");
        sexo=dato.nextLine();
          System.out.println("===Tipo de consulta===");
          System.out.println("Ingrese "+ "1. Urgencia"+ " 2. Control"+ " 3. General: ");
          tc=dato.nextInt();
          dato.nextLine();
          switch(tc){
              case 1:
                  contU++;
                  break;
              case 2: 
                  contC++;
                  break;
              case 3:
                  contG++;
                  break;
              case 4:
                  System.out.println("Usted desidio salir");
                  break;
              default:
                  System.out.println("Datos no validos, intente nuevamente. ");
          }
          
      }while(nhc!=-1);
          System.out.println("===Tipos de consultas===");
          System.out.println("Urgencia: "+contU);
          System.out.println("Control: "+contC);
          System.out.println("General: "+contG);
 
                        
    }
}
