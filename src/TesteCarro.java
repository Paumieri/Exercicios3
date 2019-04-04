public class TesteCarro {
    
     public static void main(String[] args) {
         
         
         
         Carro c1 = new Carro();
         c1.modelo = "cruze";
         c1.motor = "2.0";
         c1.cor = "Prata";
                 
         
         System.out.println("modelo de c1: " + c1.modelo );
         System.out.println("motor de c1: " + c1.motor );
         System.out.println("cor de c1: " + c1.cor );
         
         Carro c2 = new Carro();
         c2.modelo = "corolla";
         c2.motor = "1.8";
         c2.cor = "Preto";
              
               
         System.out.println("modelo de c2: " + c2.modelo );
         System.out.println("motor de c2: " + c2.motor );
         System.out.println("cor de c2: " + c2.cor );
         
         Carro c3 = new Carro();
         c3.modelo = "civic";
         c3.motor = "1.6";
         c3.cor = "Branco";
              
               
         System.out.println("modelo de c3: " + c3.modelo );
         System.out.println("motor de c3: " + c3.motor );
         System.out.println("cor de c3: " + c3.cor );
     }
    
}
