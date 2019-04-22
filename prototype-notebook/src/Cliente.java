
public class Cliente {
        
        
  public static void main(String args[]) throws CloneNotSupportedException {
              
    System.out.println("***Exemplo do padrão Prototype***\n");
    Notebook dell = new Dell("Inspiron 15 5000");
    dell.preco = 2500;
    
    Notebook hp = new Hp("HP 246 G6");
    hp.preco= 3000;
  
    Notebook exemplo_1;
    //Clone do Objeto Dell
    exemplo_1 = dell.clone();
  
    exemplo_1.setPreco(4000);
    System.out.println("Nome do Notebook: "+ exemplo_1.getNomeModelo() + ", Preço : " + exemplo_1.preco);
    
    Notebook exemplo_2;
    //Clone do Objeto Hp
    exemplo_2 = hp.clone();
 
    exemplo_2.setPreco(8000);
    System.out.println("Nome do Notebook: " + exemplo_2.getNomeModelo() + ", Preço: "+ exemplo_2.preco);
              
 }
        
}
