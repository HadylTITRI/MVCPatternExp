package PatternsDesign.SingeltonPatternExp;

// Obtener le seul objet de la classe singelon :  SingleObject

public class SingeltonPatternDemo {
    public static void main(String args[]){

        SingleObject object = SingleObject.getInstance();
        object.showMessage();
    }
}
