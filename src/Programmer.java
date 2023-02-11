public class Programmer {
    private  String programmerName;
    private  int age;

    public Programmer(String programmerName, int age) {
        this.programmerName = programmerName;
       this.age = age;
    }

    public String getProgrammerName() {
        return programmerName;
    }

    public void setProgrammerName(String programmerName) {
        this.programmerName = programmerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "programmerName='" + programmerName + '\'' +
                ", age=" + age +
                '}';
    }
}
