public class Teacher {
    String name;
    String mpno;
    String branch;

    Teacher(String name, String branch, String mpno) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
        // constructera  islenme kismi budur!
    }

    void print() {
        System.out.println("Adi : " + this.name);
        System.out.println("Ders adi : " + this.branch);
        System.out.println("Tel no : " + this.mpno);
    }


}

