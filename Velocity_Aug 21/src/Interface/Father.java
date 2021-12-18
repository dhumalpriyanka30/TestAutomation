package Interface;

public interface Father 

{
    void house();
    void money();
     default void car()
{
	System.out.println("Father car");
}
}
