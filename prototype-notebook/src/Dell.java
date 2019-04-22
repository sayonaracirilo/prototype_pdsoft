public class Dell extends Notebook {
       public Dell(String m)
       {
             nomeModelo = m;
       }
  
       @Override
       public Notebook clone() throws CloneNotSupportedException
       {
             return (Dell)super.clone();
       }
}