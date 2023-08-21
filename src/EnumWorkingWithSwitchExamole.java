public class EnumWorkingWithSwitchExamole {

// Enum can Implement interface but not extend class the class
    enum Mobile {
        APPLE(200000),SAMSUNG(),MOTOROLA(27000),REDMI(17000);
        int price;

        Mobile(){

        }
        Mobile(int price) {
            this.price = price;
        }

        public int getPrice(){
            return price;
        }
    }
    // Actual Enum is converting in to this.
//    class Mobile {
//        public static final Mobile APPLE = new Mobile();
//        public static final Mobile SAMSUNG = new Mobile();
//        public static final Mobile MOTOROLA = new Mobile();
//        public static final Mobile REDMI = new Mobile();
//    }
    public static void main(String[] args) {

        Mobile m = Mobile.APPLE;

        switch (m){
            case APPLE:
                System.out.println("Apple Mobile");
                break;
            case SAMSUNG:
                System.out.println("SAMSUNG Mobile");
                break;
            case MOTOROLA:
                System.out.println("MOTOROLA Mobile");
                break;
            case REDMI:
                System.out.println("REDMI Mobile");
                break;
            default:
                System.out.println("Nokia Mobile");
        }
        Mobile mb[] = Mobile.values();
        for(Mobile mob:mb){
            System.out.println(mob.ordinal()+". "+mob.name() +" PRICE: "+mob.price);
        }

       // System.out.println(Mobile.SAMSUNG.ordinal()+".SAMSUNG PRICE: "+Mobile.SAMSUNG.getPrice());

    }
}
