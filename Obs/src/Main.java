public class Main {
    public static void main(String[] args) {
        Teacher t1=new Teacher("mahmut", "trh","24234234");
        Teacher t2=new Teacher("Graham Bell","fzk","2423");
        Teacher t3= new Teacher("kulyutar","bio","1111");

        Course tarih = new Course("Tarih","101","trh");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik","102","fzk");
        fizik.addTeacher(t2);

        Course biyo=new Course("Biology","109","bio");
        biyo.addTeacher(t3);

        Student s1 = new Student("Inek Saban","1343","5",tarih,fizik,biyo);
        s1.addBulkExamNote(100,70,50);
        s1.isPass();

        Student s2=new Student("guduk neco","342","3",tarih,fizik,biyo);
        s2.addBulkExamNote(60,70,50);
        s2.isPass();
    }
}
