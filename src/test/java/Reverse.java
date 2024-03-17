

public class Reverse {
	
	
	public void Studentid(int Regno) {
	System.out.println("rollno:"+Regno);
}
	public void Studentid(String Name) {
	System.out.println("Name:"+Name);
}
	public void Studentid(String name,int no) {
	System.out.println("Name:"+name);
	System.out.println("Number:"+no);
}
	public static void main (String[]args) {
	Reverse s = new Reverse();
	s.Studentid(789545);
	s.Studentid("Prem");
	s.Studentid("Prem",789545);
	}
}
	
	


