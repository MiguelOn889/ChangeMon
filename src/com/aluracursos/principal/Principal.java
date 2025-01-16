package com.aluracursos.principal;

import com.aluracursos.modelos.ConsultarMoneda;
import com.aluracursos.modelos.Menu;
import com.aluracursos.modelos.Moneda;
import com.aluracursos.modelos.Divisas;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        while (true) {
            try {

                // se crea la variable menu de la clase Menu
                Menu menu = new Menu();
                Divisas divisas = new Divisas();

                System.out.println("************Bienvenido al convertidor de divisas ChangeMon*********");
                System.out.println(menu.menu);

                System.out.println("Porfavor escoja la divisa de base");
                Scanner teclado = new Scanner(System.in);

                int primerDivisa = teclado.nextInt();
                System.out.println("Ahora por favor escoja la divisa a la cual quiere saber el equivalente");
                teclado = new Scanner(System.in);

                int segundaDivisa = teclado.nextInt();
                System.out.println("Porfavor introduzca la cantidad que desea convertir");
                double cantidad = teclado.nextDouble();


                // objeto llamado consulta de la clase ConsultarMoneda
                ConsultarMoneda consulta = new ConsultarMoneda();
                // se crea el objeto moenda de la clase Moneda
                // el objeto moneda sera igual al metodo ConvertirMoneda este metodo se aplica al objeto que se creo anteriormente
                // divisas es el map de todas las divisas, y el metodo get(primeraDivisa) devuelve el valor para la clave primeraDivisa
                // el cual es un numero que ingreso el usuario
                Moneda moneda = consulta.ConvertirMoneda(divisas.get(primerDivisa), divisas.get(segundaDivisa), cantidad);
                System.out.println("Para hoy " + moneda.time_last_update_utc().substring(0, 16) + " " + cantidad + " " + moneda.base_code() + " equivalen a " + moneda.conversion_result() + " " + moneda.target_code());
            }catch (InputMismatchException e) {
                // Error específico de entrada no numérica
                System.out.println("Error: Por favor, ingrese un número válido.");
            } catch (NullPointerException e) {
                // Error si no encuentra la divisa en el Map
                System.out.println("Error: La divisa ingresada no está en el listado. Inténtelo de nuevo.");
            } catch (Exception e) {
                // Cualquier otro tipo de error
                System.out.println("Ocurrió un error inesperado: " + e.getMessage());
                break; // Sale del ciclo en caso de error grave
            }
        }
    }
}
