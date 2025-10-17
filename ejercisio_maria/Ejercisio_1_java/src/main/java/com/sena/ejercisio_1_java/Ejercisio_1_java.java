package com.sena.ejercisio_1_java;

import java.util.Scanner;
public class Ejercisio_1_java {
    
   static Scanner dato = new Scanner(System.in);
    public static void main(String[] args) { 
       
        /*1*//*
        int n;
        System.out.println("Escribir un numero: ");
        n = dato.nextInt();
        while(n>=0){
            System.out.println("Tu numero es " +n);
            System.out.println("Escribir un numero: ");
            n = dato.nextInt();
         
      *//*2*//*
        float nota, sum=0, prom;
        int cont=0;
        System.out.println("Ingrese su nota, para terminar ingrese 0: ");
        nota = dato.nextFloat();
        while(nota>0){
            sum=sum+nota;
            cont++;
            System.out.println("Ingrese otra nota, para terminar ingrese 0: ");
            nota = dato.nextFloat(); 
        }
        prom=sum/cont;
        System.out.println("Promedio " + prom);
      
        *//*3*//*
     String clave1, clave2;
      System.out.println("Escribir tu contraseña: ");
      clave1= dato.nextLine();
      System.out.println("Escribir tu contraseña: ");
      clave2 = dato.nextLine();
         while(!clave1.equals(clave2)){
            System.out.println("Contraseña incorrecta");
            System.out.println("Digite su contraseña: ");
            clave2=dato.nextLine(); 
        }
         
         *//*4*//*
      int n1, r=1;
        System.out.println("Escribe un numero: ");
        n1 = dato.nextInt();
        while(n1>1){
            r=r*n1;
            System.out.println("El factorial del numero es: "+ r);
            n1=n1-1;
            
        }
      *//*5*//*
      String nom_pro, clave;
      int valor_pro, total=0;
        System.out.print("Nombre del producto: ");
        nom_pro=dato.nextLine();
        System.out.print("Valor del producto: ");
        valor_pro=dato.nextInt();
        dato.nextLine();
      System.out.print("Usted desea continuar? Si la respuesta es 'no' poner 'Fin' y si su respuesta es si para continuar poner 'si': "); 
        clave=dato.nextLine();  
        while(!clave.equalsIgnoreCase("Fin")){
            System.out.print("Nombre del produecto: ");
            nom_pro=dato.nextLine();
            total=total+valor_pro;
            System.out.print("Valor del producto: ");
            valor_pro=dato.nextInt();
            dato.nextLine();
            total=total+valor_pro;
            System.out.print("Usted desea continuar? Si la respuesta es 'no' poner 'Fin' y si su respuesta es si para continuar poner 'si': "); 
            clave=dato.nextLine();
        }
         
         System.out.println("El total de los productos es:" + total);  
      *//*5*//*
      String pro,fin="si";
      int pre, total=0;
      
      while(!fin.equalsIgnoreCase("Fin")){
          System.out.print("Nombre del producto: ");
            pro=dato.next();
            System.out.print("Valor del producto: ");
            pre=dato.nextInt();
            dato.nextLine();
            total+=pre;
            System.out.print("Usted desea continuar? Si la respuesta es 'no' poner 'Fin' y si su respuesta es si para continuar poner 'si': "); 
            fin=dato.next();
      }
        System.out.print("El precio total es "+ total);
      *//*6*//*
      int n;
     
        System.out.println("Usted introdusca un numero: ");
        n=dato.nextInt();
        while(n!=0){
            if(n%2==0){
                System.out.println("El numero "+ n + " es par");
            }else{
                System.out.println("El numero "+n+" es impar");  
                
            }
            System.out.println("Usted introdusca un numero: ");
            n=dato.nextInt();
        }
      *//*7*//*
      
      int edad, cont=0;
      float prom, sum=0;
        System.out.print("Digite su edad, si usted desea parar el programa escribir 0: ");
        edad=dato.nextInt();
        while(edad>0 & edad<120){
          sum+=edad;
          cont++;
          System.out.print("Digite su edad, si usted desea parar el programa escribir 0: "); 
          edad=dato.nextInt();
        }
        prom=sum/cont;
        System.out.print("El promedio de esdades es "+ prom);
      
      
        
      *//*8*//*
      int saldo, salTo=0;
              
      System.out.print("Ingrese el saldo a depositar e ingrese 0 para terminar: ");
      saldo=dato.nextInt();
        while(saldo>0){  
            salTo=salTo+saldo;
            System.out.print("Ingrese su saldo a depositar e ingrese 0 para terminar: ");
            saldo=dato.nextInt();
        }
         System.out.print("Su saldo total es: " + salTo);
      *//*9*//*
      int temp, sum=0,cont=0, maxima=0, minima=0;
      float media;
      String desi="Si";
      
        while(!desi.equalsIgnoreCase("No")){
          System.out.print("Ingrese la temperatura: ");
          temp=dato.nextInt();
          
          sum+=temp;
          cont++;
          if(cont==1){
              minima=temp;
              maxima=temp;
          }else{
              
          if(temp<=minima){
              minima=temp;
          }
          if(temp>=maxima){
              maxima=temp;
          }
          }
          media=sum/cont;
          System.out.println("La maxima es "+ maxima + ", la media es "+media+ ", la minima es "+minima);
          System.out.println("Desea continuar? ");
          desi=dato.next();
        }
        
      *//*10.Un cajero automático permitirá ingresar “retiros” mientras el saldo sea
        suficiente; al terminar, mostrar cuántas transacciones se realizaron y el saldo
        restante.*//*
      
      int saldo, retiro, traRe=0;
      String ret="";
      System.out.print("Ingrese su saldo: ");
          saldo=dato.nextInt();
      while(saldo>0){
          System.out.print("Cual es el saldo a retirar: ");
          retiro= dato.nextInt();
          traRe++;
          saldo-=retiro;
          
          dato.nextLine();
          System.out.println("Desea retirar, escriba retirar: ");
          ret=dato.nextLine();
          if(ret.equalsIgnoreCase("Retirar")){
              break;
          }
          
      }
        System.out.println("Se realizaron "+ traRe +" transacciones y su saldo restante es "+ saldo);
        
     *//*11. Desarrolla un algoritmo que registre los datos de los 
      pacientes  en una clínica(nombre, edad, diagnóstico)
      mientras haya cupo disponible o hasta que se
    ingrese “fin”, luego muestre el listado completo registrado. *//*
     String nom, diag, fin="";
     int eda, cupo;
        System.out.println("Ingrese el numero de cupo disponible: ");
        cupo=dato.nextInt();
     while(!fin.equalsIgnoreCase("Fin") || cupo==cupo){
         System.out.println("Ingrese el nombre: ");
         nom=dato.nextLine();
         System.out.println("Ingrese la edad: ");
         eda=dato.nextInt();
         dato.nextLine();
         System.out.println("Ingrese el diagnostico: ");
         diag=dato.nextLine();
     }
     *//*12.Hacer un algoritmo que permita ingresar números hasta que el usuario
    introduzca un cero, y al final muestre el promedio de todos los números
        ingresados.*//*
     int n=1, sum=0, cont=0;
     float prom;
        while(n!=0){
          sum+=n;
          cont++;
          System.out.println("Ingrese un numero: ");
          n=dato.nextInt();  
        }
        cont=cont-1;
        sum=sum-1;
        prom=sum/cont;
        System.out.println("El promedio de los datos es " + prom);
        
   *//*13.Construir un algoritmo que solicite edades mientras sean mayores que 0, y al
final muestre cuántos son menores de edad, cuántos adultos y el promedio
de edad.
*//*
    int eda, cont=0, contM=0, sum=0;
    float prom;
      System.out.println("Ingrese cual es su edad: ");
      eda=dato.nextInt();
      while(eda!=0){
          sum+=eda;
          System.out.println("Ingrese cual es su edad: ");
          eda=dato.nextInt();
          if(eda<=17 && eda!=0){ 
              cont++;
          } else{
            contM++;
          }
         
      }
        prom=sum/(cont+contM);
        System.out.println("El total de menores son " + cont);
        System.out.println("El total de mayores de edad es " + contM);
        System.out.println("El promedio es "+ prom);
   
      *//*14.Un banco procesa solicitudes de préstamos. Por cada solicitud se pide:
    número de cliente, monto solicitado y plazo en meses. El programa debe leer
    solicitudes hasta que se ingrese un cliente con monto cero, mostrando
    cuántos préstamos se procesaron y el total de dinero solicitado.*//*
      
      String nuCli;
      int monSol=-1, mes, cont=0, total=0;
        
        while(monSol!=0){
        System.out.print("Ingrese el numero de cliente que usted posee: ");
        nuCli = dato.nextLine();
        dato.nextLine();
        System.out.println("Ingrese el monton solicitado: ");
        monSol = dato.nextInt();
        System.out.println("Ingrese el plazo en meses: ");
        mes = dato.nextInt();
            cont++;
            total+=monSol;
            
        }
        System.out.println("El numero de prestamos procesados son: " + cont);
        System.out.println("El monton solicitado es: " + total);
    
    *//*15.Diseñar un algoritmo que lea nombres y notas de estudiantes hasta que se
ingrese el nombre "FIN". Al final mostrar el número de aprobados y
reprobados.
*//* 
        int cont=0, contR=0;
        String  nom="";
        float nota;
        while(!nom.equalsIgnoreCase("Fin")){
            System.out.println("Ingrese su nombre, y si quiere parar el programa ingrese 'Fin': ");
             nom=dato.nextLine();
             
             if(nom.equalsIgnoreCase("Fin")){
                break;
            }
            System.out.println("Ingrese su nota: ");
            nota=dato.nextFloat();
            dato.nextLine();
            
            if(nota>=3.0 && nota<5.0){
                cont++;
            }else{
                contR++;
            }
        }
           System.out.println("Aprobaron " + cont+" desaprobaron "+ contR);
           dato.close();

        *//*16.Una tienda desea registrar las compras de clientes. Por cada compra se pide:
código del cliente, valor de la compra y forma de pago (contado o crédito).
El algoritmo debe leer hasta que el valor de la compra sea 0, y mostrar el
total de ventas de contado, el total a crédito y el total general.

        *//*String ccli, fpa;
        int vc, tvc=0, tcr=0, Total=0;
        System.out.print("Ingrese su codigo: ");
         ccli= dato.nextLine();
         System.out.print("Ingrese el valor de su compra: ");
         vc=dato.nextInt();  
         dato.nextLine();
         System.out.print("Ingrese su forma de pago 'de contado o crédito': ");
          fpa=dato.nextLine();
        while (vc!=0){
         if(fpa.equalsIgnoreCase("contado")){
            tvc+=vc;
         } else if(fpa.equalsIgnoreCase("credito")){
             tcr+=vc;
         } else {
             System.out.println("No es un metodo de pago correcto");
             break;
         }
         Total+=vc;
        System.out.print("Ingrese su codigo: ");
         ccli= dato.nextLine();
         System.out.print("Ingrese el valor de su compra: ");
         vc=dato.nextInt();
         if(vc==0){
             break;
         }
         dato.nextLine();
         
         System.out.print("Ingrese su forma de pago 'de contado o crédito': ");
            fpa=dato.nextLine();
            
        }
        System.out.println("El valor total de su compra contado es "+tvc+", el valor de su compra a credito es "+ tcr+" y el valor total es "+Total);
    *//*17.Un hospital necesita procesar las consultas de pacientes. Por cada paciente
se ingresan: número de historia clínica, edad, sexo y tipo de consulta
(urgencia, control, general). El proceso termina cuando se ingrese un número
de historia clínica igual a -1. Al finalizar, mostrar cuántas consultas fueron
urgencias, controles y generales*//*
    String sexo, tc;
    int eda, nhc=0, contU=0, contC=0, contG=0;
        
     while(nhc!=-1){
        System.out.println("Ingrese el numero de historia clínica: ");
        nhc=dato.nextInt();
        if(nhc==-1){
            break;
        }
        System.out.println("Ingrese su edad: ");
        eda=dato.nextInt();
        dato.nextLine();
        System.out.println("Ingrese su sexo: ");
        sexo=dato.nextLine();
        System.out.println("Ingrese el tipo de consulta (urgencias, controles, generales): ");
        tc=dato.nextLine();
        if(tc.equalsIgnoreCase("urgencias")){
            contU++;
        } else if(tc.equalsIgnoreCase("controles")){
            contC++;
        } else if(tc.equalsIgnoreCase("generales")){
            contG++;
        } else{
            System.out.println("El tipo de consulta ingresado no es correcto.");
            break;
        }
        
        
      }
        System.out.println("El numero de tipo de consultas de urgencia fue "+contU+", de controles "+contC+" y generales es "+contG);
 
        *//*18.Diseñar un algoritmo que lea los registros de consumo eléctrico de n hogares:
    número de cuenta, kWh consumidos y estrato. El ciclo termina cuando se
    ingrese un número de cuenta igual a cero. Al final mostrar el consumo total y
    el promedio de kWh por hogar.*//*
          String est;
       int nc=-1, kwh, cont=0, prom, sum=0;
       
       
       while(nc!=0){
           System.out.println("Ingrese su número de cuenta: ");
            nc=dato.nextInt();
            if(nc==0){
                break;
            }
            System.out.println("Ingrese el kwh consumidos: ");
            kwh=dato.nextInt();
            dato.nextLine();
            System.out.println("Ingrese el estrato: ");
            est=dato.nextLine();
            
           cont++;
           sum+=kwh;
             
       }
        prom=sum/cont;
        System.out.println("El consumo total es de " +sum);
        System.out.println("El promedio de kwh por hogar es "+ prom);*/
    
    }
}

