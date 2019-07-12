import model.Student;

public class GetStuent {
    public static void main(String[] args) {
        Student mystudent = new Student();
        mystudent.setName("bob");
        mystudent.setSex("man");
        mystudent.setAge(15);
        mystudent.setNum(1122);
        System.out.println("name: " + mystudent.getName() + ", "
                + "sex: " + mystudent.getSex() + ", "
                + "age: " + mystudent.getAge() + ", "
                + "num: " + mystudent.getNum()
        );
    }

}
