
package selectCourse;

 
public class Course {
	 int id;
	 String Coursename;
	 String place;
	 float time;
 
	public Course( String Coursename,int id,String place,float time) {
		this.id = id;
		this.Coursename = Coursename;
		this.place = place;
		this.time = time;
	}
 
	public String toString() {
        return Coursename +    "�γ���" + "     �γ̱�ţ�" + id + "   �Ͽεص㣺" + place
                + "    �γ�ʱ�䣺" + time + "min" ;}
}