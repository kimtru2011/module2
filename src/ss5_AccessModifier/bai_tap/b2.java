package ss5_AccessModifier.bai_tap;

public class b2 {
    public static class Student {
       private String name = "John";
       private String classes = "CO2";
       public Student() {

       }
       public Student(String name, String classes) {
           this.name = name;
           this.classes = classes;
       }
       public void setName(String name) {
           this.name = name;
       }
       public void setClasses(String classes) {
           this.classes = classes;
       }
       public String toString() {
           return "Student { "+"name = '"+name+'\'' +", classes = '"+classes+'\''+'}';
       }

        public static void main(String[] args) {
            Student student = new Student();
            student.setName("Nguyen Van A");
            System.out.println(student.toString());
            student.setClasses("C03");
            System.out.println(student.toString());
        }
    }
}
