public class Hero  implements Actor{

    @Override
    public void act() {
        System.out.println("Hero: Act");
    }

    @Override
    public void comedy() {
        System.out.println("Hero: Comedy");
    }

    @Override
    public void speak() {
        System.out.println("Hero: Speak");
    }

    @Override
    public void fight() {
        System.out.println("Hero : Fight");
    }

    public void dance(){
        System.out.println("Hero: Dance");
    }
}
