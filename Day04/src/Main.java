public class Main {
    public static void main(String[] args){
        String str = "(1+2)";
        BalancedExpression exp = new BalancedExpression();
        System.out.println(str+" is it balanced : "+exp.isBalanced(str));
        
        str = "<1+2+3]";
        System.out.println(str+" is it balanced : "+exp.isBalanced(str));

        str = "{";
        System.out.println(str+" is it balanced : "+exp.isBalanced(str));
    }
}
