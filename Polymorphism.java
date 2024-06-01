public class Polymorphism {
    public static void main(String[] args) {
    //     Calculator cal = new Calculator();
    //     System.out.println(cal.sum(1, 1));
    //     System.out.println(cal.sum((float)3.5,(float) 1.5));//float as it is taking it as double
    //     System.out.println(cal.sum(1, 1, 2));
           Deer d = new Deer();
           d.eat();//when parent and child class function is same then at the time of calling child class function only child class function will be called
    }
}
//Function overloading(Type of compile time polymorphism)
class Calculator{
    int sum(int a, int b){
        return a + b;
    }

    float sum(float a, float b){
        return a + b;
    }
    int sum(int a, int b, int c){
        return a + b + c;
    }
}
//Function overriding
class Animal {
    void eat(){
        System.out.println("eats anything");
    }
}
class Deer {
    void eat(){
        System.out.println("eats grass");
    }
}