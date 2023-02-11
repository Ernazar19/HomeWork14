public class Frontend extends Programmer {
    private  String direction;
    private  long salary;
    void startTask(){
        System.out.println("The programmer writes a task");
    }void stopTask(){
        System.out.println("Unofortunaletty,the programmer did not finish the task");
    }

    public Frontend(String programmerName, int age, String direction, long salary) {
        super(programmerName, age);
       this.direction = direction;
        this.salary = salary;
    } @Override
    public String toString() {
        return "Programmer{" +
                "programmerName='" + getProgrammerName()+ '\'' +
                ", age=" + getAge() +'\''+
                "direction='" + direction + '\'' +
                ", salary=" + salary +
                '}';
    }
}