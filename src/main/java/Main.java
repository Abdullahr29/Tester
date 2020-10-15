public class Main {
    public static void main(String[] args){
        DoctorList docL = new DoctorList();
        System.out.println(docL.getName(0));
        String doc = "Dr. Elias";
        docL.addDoctor(doc);
        System.out.println(docL.getName(1));

        Calculator calc = new Calculator();
        calc.add(69);
        calc.squareRoot();
        calc.divide(69);
        calc.clear();
        calc.add(42);
        calc.multiply(10);
    }
}
