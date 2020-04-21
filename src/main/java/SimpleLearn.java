public class SimpleLearn {

    static SimpleLearn simpleLearn = new SimpleLearn();
    int num1 = 3;
    int num2 = 2;
    int result;

    public static void main(String[] args) {
        simpleLearn.add();
        simpleLearn.subtract();
    }

    void add(){
        result = num1+num2;
        System.out.println(" "+result);
    }

    void subtract(){
        result = num1-num2;
        System.out.println(" "+result);
    }
}
