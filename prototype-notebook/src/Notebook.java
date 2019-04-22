
public abstract class Notebook implements Cloneable {
       public String nomeModelo;
       protected double preco;
  
       public String getNomeModelo()
       {
             return nomeModelo;
       }
  
       public void setNomeModelo(String nomeModelo)
       {
             this.nomeModelo = nomeModelo;
       }
  
       
       public void setPreco(double preco) {
     		this.preco = preco;
     	}
       public Notebook clone() throws CloneNotSupportedException
       {
             return (Notebook)super.clone();
       }
}