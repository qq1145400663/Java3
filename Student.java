
package selectCourse;
 
 
public class Student extends Person{ 
    String c;
    public Student(int number, String name,String sex) {
		super(number,name,sex);
		this.number = number;
		this.name = name;
		this.sex = sex;
	}

	 public String toString(){
	        return "Student(ѧ����Ϣ):  ������" + name
	                + "    ѧ�ţ�" + number + "   �Ա�" + sex ;
	    }
	 void tuike() {
    	 c=null;
     }
	 void delete() {
	      if(c== null);{
	  	  System.out.println("ѧ��Ŀǰδѡ��");}
	  	 
	    }
}

 
	