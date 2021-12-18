package Interface;

public interface Mother 
{
   void look();
   void recipe();
   default void car()
   {
	   System.out.println("Hi mother car");
   }
}
