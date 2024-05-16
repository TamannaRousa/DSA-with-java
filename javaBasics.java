public class javaBasics {
    public static void main(String[] args) {
        int age=12;
        if(age>=18){
            System.out.println("adult:vote and drive");
        }
        if(age>13 && age<18){
            System.out.println("teenager");
        }
        else{
            System.out.println("not adult");
        }
    }
}