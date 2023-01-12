public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Calculator calc=new Calculator();
        calc.setTotal(0);
        calc.add(100);
        calc.add(200);
        calc.add(300);
        calc.add(400);
        System.out.println("calc.getTotal()="+calc.getTotal());
        calc.subtract(150);
        System.out.println("calc.getTotal()="+calc.getTotal());
    }
}

