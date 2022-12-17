package PatternsDesign.StrategyPatternExp;

public class StrategyPatternDemo {
    public static void main(String args[]){
        Context context = new Context(new OperationAdd());
        System.out.println("15 + 30 =" + context.executeStrategy(15, 30));

        context = new Context(new OperationSubstract());
        System.out.println("70 - 63 = " + context.executeStrategy(70, 63));

        context = new Context(new OperationMultiply());
        System.out.println("15 * 3 = " + context.executeStrategy(15 , 3));
    }
}
