
package ejercicio2;

public class Ejercicio2 extends Thread{

    public Ejercicio2(String str){
        super(str);
    }
    public void run(){
        for (int i=0;i<5;i++){
            System.out.println(i+" "+getName());
            try{
            System.out.println("Bloqueado 1 segundo");
            Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("Fio interrumpido");
            }
            
            
            
        }System.out.println("Termina o thread "+getName());
    }

    public static void main(String[] args) {
     
        new Ejercicio2("Aspas").start();
        new Ejercicio2("Guidetti").start();
        new Ejercicio2("Orellana").start();
        new Ejercicio2("Sisto").start();
        new Ejercicio2("Radoja").start();
        System.out.println("Termina thread main");
        
 
        
        
    }
    
}
