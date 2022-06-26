/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sesion3;

import DiezClasesInternas.ClaseInternaOperadores;

/**
 *
 * @author blood
 */
public class Sesion3 {

    public static void main(String[] args) {
        
        /*UnoSobrecargaMetodos objetoUnoSobrecargaMetodos = new UnoSobrecargaMetodos();
        
        System.out.println(objetoUnoSobrecargaMetodos.sumaNumeros(15, 20));
        
        objetoUnoSobrecargaMetodos.sumaNumeros();
       //sumaNumeros();*/
        
      //  numerosDel5al1();
      //recursividad(5);
      
      //2. CLASES Y OBJETOS
       /* DosClaseSuma objeto1DosClaseSuma =new DosClaseSuma();
        DosClaseSuma objeto2DosClaseSuma =new DosClaseSuma();
        //OBJETO 1
        objeto1DosClaseSuma.metodoSumaNumeros(10, 15);
        objeto1DosClaseSuma.metodoSumaNumeros(20,30);
        //OBJETO2
        objeto2DosClaseSuma.metodoSumaNumeros(50,30);*/
       
       //3. Atributos Globales
       
     /*  TRESAtributosGlobales objetoTRESAtributosGlobales = new TRESAtributosGlobales();
       objetoTRESAtributosGlobales.numero1=20;
       objetoTRESAtributosGlobales.numero2=30;
       objetoTRESAtributosGlobales.sumaAtributosGlobales();
       
       */
     //4. STATIC Y NO STATIC
     
    /* Sesion3 objetoSesion=new Sesion3();
     
     objetoSesion.sumaNumeros();*/
     
   
   /* public void sumaNumeros(){
    int numero1=5;
    int numero2=5;
    int resultado= numero1+numero2;
    System.out.println(resultado);
   
    } */
    
    
    
    //APLICACION DE MÉTODOS DE FORMA TRADICIONAL
    /*public static void sumaNumeros(){
    int numero1=5;
    int numero2=5;
    int resultado= numero1+numero2;
    System.out.println(resultado);
   
    } */
    
    //2. Recursividad
    //Es el método de hacer que una función se llame a sí misma
    
    //Imprimir números del 5 al 1 con recursividad
  /*  public static void recursividad (int numero){
    
        if (numero>0) {           
            System.out.println(numero);
            recursividad(numero-1);
        }
    }*/
    
    /*public static void numerosDel5al1(){
    
        for (int i=5;i>0;i--) {
            System.out.println(i);
            
        }
    }*/
    
    //4. Constructor
   // CuatroConstructor objetoCuatroConstructor = new CuatroConstructor();
    
   /* 
   //5.MODIFICADORES
   CincoModificadores objetoCincoModificadores = new CincoModificadores();
    objetoCincoModificadores.defecto=5;
    objetoCincoModificadores.protegido=10;
    objetoCincoModificadores.publico=15;
    */
    //6. ENCAPSULAMIENTO
    
    /*SeisEncapsulamient objetoSeisEncapsulamiento = new SeisEncapsulamient();
    objetoSeisEncapsulamiento.setNombre("Frank");
    System.out.println(objetoSeisEncapsulamiento.getNombre());
    */
    
    //7. Package
    
   /* sietePackage.SieteNuevoPackage objetoSietePackage = new sietePackage.SieteNuevoPackage();
    objetoSietePackage.setNombres("Frank");
    objetoSietePackage.setEdad(10);
    System.out.println(objetoSietePackage.getNombres());
    System.out.println(objetoSietePackage.getEdad());
    */
    
   
   //8. Herencia
   
   /*OchoHerencia.ClaseHijoTrabajador objetoHijoTrabajador =new OchoHerencia.ClaseHijoTrabajador();
   
    objetoHijoTrabajador.setNombres("Frank");
    objetoHijoTrabajador.setApellidos("Valencia");
    objetoHijoTrabajador.setEdad(15);
    objetoHijoTrabajador.setCargo("Contador");
    
    System.out.println(objetoHijoTrabajador.getNombres());
    System.out.println(objetoHijoTrabajador.getApellidos());
    System.out.println(objetoHijoTrabajador.getEdad());
    System.out.println(objetoHijoTrabajador.getCargo());*/
   
   //9. Polimorfismo
   
  /* nuevePolimorfismo.Animal objetoAnimal = new nuevePolimorfismo.Animal();
   objetoAnimal.sonidoAnimal();
   
   nuevePolimorfismo.Gato objetoGato = new nuevePolimorfismo.Gato();
   objetoGato.sonidoAnimal();
   
   nuevePolimorfismo.Perro objetoPerro = new nuevePolimorfismo.Perro();
   objetoPerro.sonidoAnimal();*/
  
  //10. Clases Internas
  
   /* DiezClasesInternas.ClaseInternaOperadores objetoClaseInterna = new ClaseInternaOperadores();
    
    DiezClasesInternas.ClaseInternaOperadores.sumaNumeros objetoSuma = objetoClaseInterna.new sumaNumeros();
    
    objetoSuma.sumandoNumeros();*/
   
    //11. Clases y métodos abstractos
    
    /*Abstracto.Perro objetoPerro = new Abstracto.Perro();
    objetoPerro.sonidoAnimalAbstracto();*/
    
    //12.Interface
    
    /*DoceInterfaces.Perro objetoPerro = new DoceInterfaces.Perro();
    objetoPerro.sonidoAnimal();*/
    
    //13. Enums
    /*TreceEnums.Animales miGato = TreceEnums.Animales.Gato;
    
    System.out.println(miGato);*/
    
    //14.Excepciones
    
   /* CatorceExcepciones.Excepciones objetoExcepciones = new CatorceExcepciones.Excepciones();
    objetoExcepciones.DatosEmpleado();*/
   
    Formularios.FormularioBienvenida objetoFormulario = new Formularios.FormularioBienvenida();
    objetoFormulario.setVisible(true);
    
     }
}

