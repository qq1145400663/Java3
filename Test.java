package selectCourse;
public class Test {
    public static void main(String[] args) {
        Student me = new Student(2019310642, "����", "MAN");
        System.out.println("ѧ����Ϣ");
        System.out.println(me);
        Teacher b = new Teacher(01, "������", "MAN", "ģ��");
        System.out.println("��ʦ��Ϣ");
        System.out.println(b);
        Course c = new Course("ģ��", 01, "207", 90f);
        System.out.println("�γ���Ϣ");
        System.out.println(c); 
        me.tuike();
        me.delete();
   
}
}   