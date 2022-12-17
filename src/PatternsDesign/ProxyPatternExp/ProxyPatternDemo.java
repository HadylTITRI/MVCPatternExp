package PatternsDesign.ProxyPatternExp;

public class ProxyPatternDemo {
    public static void main(String args[]){
        Image image = new ProxyImage("C:\\Users\\ASUS\\Desktop\\M1 ISII\\TP1-AL\\TP1\\TP1\\TP01_AL\\videoShow\\images\\person1.png");
        image.display();

        System.out.println("");

        image.display();
    }
}
