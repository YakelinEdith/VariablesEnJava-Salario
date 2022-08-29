

package com.mycompany.calculodesalario;


public class CalculoDeSalario {

    public static void main(String[] args) {
      // Actualizar datos numéricos:
      int salary = 1000;
      int salaryFinal=0;
      
      salary = salary + 200;
      System.out.println(salary); //1200
      
      salary += 300;
      System.out.println(salary); //1500
      
      salary = salary+30*2-50-40; 
      
      salaryFinal=salary;
      
      System.out.println(salaryFinal);
        // Actualizar variables de tipo String:
      String employeeName = "Anahí ";
      employeeName = employeeName + "Salgado ";
      System.out.println(employeeName); // Anahí Salgado, "ojo" el error era que la variable que 
                                        // se iba a imprimir era el salario y no la variable en la 
                                        // cual tenemos almacenado el nombre
      
      employeeName += "Díaz de la Vega";
      System.out.println(employeeName); // Anahí Salgado Díaz de la Vega
      
      employeeName = "Irene " + employeeName;
      System.out.println(employeeName); //Irene Anahí Salgado Díaz de la Vega
    }
}    
      
      
              
      
      
