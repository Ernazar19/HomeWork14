public class Main {
    public static void main(String[] args) {
        //TODO Zadacha014.1
        //  Бир Super класс жана анын бир sub классын түзүңүз.
        //  Super класска 1 поле 1 метод түзүңүз.
        //  Sub класска 2 уникальный поле жана 2 метод түзүңүз.
        //  Main класстан sub класстын объектисин түзүп,
        //  баардык маанилерин жана методдорун консольго toString() методун колдонуп чыгарыңыз.
       Backend backend = new Backend("Aizat",20,"Java",200000);
        System.out.println(backend);
        //backend.startTask();
        //backend.stopTask();
        System.out.println("************************************************************************");
        Frontend frontend = new Frontend("Anara",24,"Javascrip",200000);
        System.out.println(frontend);
        //frontend.startTask();
        //frontend.stopTask();
        System.out.println("************************************************************************");


       //TODO zadacha 14.2
       // Fruits деген класс түзүңүз, аны Orange, Apple, Banana деген класстар мурастасын. (IS-A)
       // Orange, Apple, Banana класстардын кайсы витаминге бай полялары (класстары) болсун. (HAS-A)
       // Мейн класстан объекттерин түзүп, toString() колдонуп, консольго чыгарыңыз




        Vitamin vitamin1 = new Vitamin("A,С1,В2,B4,PP,B6,B9");
        Orange orange = new Orange("Orange","Sweet and sour",45,50,vitamin1 );
        System.out.println(orange);
        System.out.println("************************************************************************");
        Vitamin vitamin2 = new Vitamin("A,B,E,H,K,HЭ,РЭ");
        Apple apple = new Apple("Red","sweet",20,25,vitamin2);
        System.out.println(apple);
        System.out.println("************************************************************************");
        Vitamin vitamin3 = new Vitamin("b6-19%,c-11.1%, M-13.5%");
        Banana banana = new Banana("Yellow","sweet",90,50,vitamin3);
        System.out.println(banana);


    }
}