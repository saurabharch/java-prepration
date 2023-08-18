public class ObjectPassing {
    public static void main(String[] args) {
        Paper p = new Paper();
        p.setText("Hello World");
        System.out.println(p.getText());
        Printer hp = new Printer();
        hp.print(p);
        System.out.println(p.getText());
    }
}

class Printer{

    public void print(Paper p){
        p.setText("Get Lost");
    }

}

class Paper{
    String text;
    public void setText(String i){
        text = i;
    }
    public String getText(){
        return text;
    }
}
