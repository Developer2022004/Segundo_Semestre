/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;
import java.util.regex.*;
/**
 *
 * @author JESUS EMMANUEL
 */
public class Validaciones {
    /*
    public boolean validarEnteros(String numero){
        int contador = 0;
        for(int x = 0; x < numero.length(); x++){
           //System.out.println(numero.charAt(x));
           char caracter = numero.charAt(x);
           
           if(caracter == '.'){
               contador++;
           }
        }
        if(contador > 0){
            return false;
        }else{
            return true;
         }
    }
    */
    /*
    public boolean validarEnteros(String numero){
        int contador = 0;
        for(int x = 0; x < numero.length(); x++){
           //System.out.println(numero.charAt(x));
           char caracter = numero.charAt(x);
           
           if(caracter == '.'){
               contador++;
           }
        }
        if(contador > 0){
            return false;
        }else{
            return true;
         }
    }
    */
    /*
    El metodo validarNumeros cumple la funcion de validar
    el numero ingresado en cadena de texto y revisar si
    cumple la validacion de solamente contener un solo punto,
    esto para decidir si es entero o decimal
    */
     public String validarNumeros(String numero){
        int contador = 0;
        String respuesta = "";
        for(int x = 0; x < numero.length(); x++){
           if(numero.charAt(x) == '.'){
               contador++;
           }
        }
         if(contador == 1){
               respuesta = "decimal";
           }else if(contador == 0){
               respuesta = "entero";
           }
        return respuesta;
    }
     
     /*
     El metodo comprobrar Decimales cunple la funcion
     de buscar el primer cero despues del punto en conjunto
     con sus numeros acompañantes es decir 12.0038271
     para despues decidir si redondear el numero al entero cerca o no hacerlo
     */
     
     public String comprobarDecimales(int _numero){
         String numero = Float.toString(_numero);
         String salidaNumero = "";
         //numero.matches("\\d+[0]+");
         if(numero.matches("\\d+[.]{1}[0]+")){
             int numeroInt = Math.round(_numero);
             salidaNumero = Integer.toString(numeroInt);
         }else{
             salidaNumero = Float.toString(_numero);
         }
         return salidaNumero;
     }
     
     public String comprobarDecimales(float _numero){
         String numero = Float.toString(_numero);
         String salidaNumero = "";
         if(numero.matches("\\d+[.]{1}[0]+")){
             int numeroInt = Math.round(_numero);
             salidaNumero = Integer.toString(numeroInt);
         }else{
             salidaNumero = Float.toString(_numero);
         }
         return salidaNumero;
     }
}
