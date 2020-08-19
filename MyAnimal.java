package be.intecbrussel.hoofdstuk13.fly;

public interface MyAnimal
{
    public abstract void bruit();
    public default void fly()
    {
        System.out.println("I am a fly.");
    }
}
