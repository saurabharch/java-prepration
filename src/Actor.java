public interface Actor {

    void act();
    void speak();
    void fight();
    default void comedy(){
        System.out.println("I can do comedy");
    }
}
