public class OOPS {
    public static void main(String args []){
        Student s1 = new Student("Ronak");
        Student s2 = new Student(98);
        System.out.println(s1.name);
        System.out.println(s2.roll_no);
    }
}
    class Student
    {
        String name;
        int roll_no;

        Student(String name){
            this.name = name;
        }


        Student(int roll_no){
            this.roll_no = roll_no;
        }

    }

