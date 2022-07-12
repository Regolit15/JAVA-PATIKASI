public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;  //Ders kodunun branchlere uymasini denetleyecegiz!
    int note;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;

        int note = 0;

    }


    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;

        } else {
            System.out.println("Ogretmen Ders icin uyumsuzdur!");
        }


    }

    void printTeacherInfo() {
        this.teacher.print();
    }
}
