public class Hp extends Notebook {
       public Hp(String m)
       {
             nomeModelo = m;
       }
  
       @Override
       public Notebook clone() throws CloneNotSupportedException
       {
             return (Hp)super.clone();
       }
}