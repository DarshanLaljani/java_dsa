public class Main {
    public static void main(String[] args) {

        int[] rollno = new int[5];
        String[] Name = new String[5];
         float[] marks = new float[5];
    Student Darshan = new Student(12,"darshan",34);
    Student Vikas = new Student(32,"vikas",43);
    Darshan.Changename("Genius");
        Student random = new Student(Vikas);
        System.out.println(Vikas.name+" "+Vikas.rollno);
        System.out.println(random.marks );
        Student random2 = new Student();
        System.out.println(random2.name);
    }
}

class Student{
    int rollno;
    String name;
    float marks;
void Changename(String newName){
    name = newName;
}
    Student(int rollno,String name,float marks){
        this.rollno= rollno;
        this.marks=marks;
        this.name=name;
    }
    Student (Student other){
        this.rollno=other.rollno;
        this.name= other.name;
        this.marks= other.marks;
    }
    Student(){
    this(13,"darshan",32f);
    }

}
