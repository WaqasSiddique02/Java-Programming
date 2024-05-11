public class Main {
Scanner scanner = new Scanner(System.in);

public void Student() {
System.out.println(&quot;...........................................&quot;);
System.out.println(&quot;Student&quot;);
System.out.print(&quot;Enter name: &quot;);
String name = scanner.nextLine();
System.out.print(&quot;Enter rollNo: &quot;);
int rollNo = scanner.nextInt();
System.out.print(&quot;Enter Grade: &quot;);
char Grade = scanner.next().charAt(0);
System.out.println(&quot;Name:&quot; + name);
System.out.println(&quot;rollNo:&quot; + rollNo);
System.out.println(&quot;Grade:&quot; + Grade);
}

public void Teacher() {
System.out.println(&quot;...........................................&quot;);
System.out.println(&quot;Teacher&quot;);
System.out.print(&quot;Enter name: &quot;);

String name = scanner.nextLine();
System.out.print(&quot;Enter Id: &quot;);
int Id = scanner.nextInt();
System.out.print(&quot;Enter Sallery: &quot;);
int sallery = scanner.nextInt();
System.out.println(&quot;Name:&quot; + name);
System.out.println(&quot;Id:&quot; + Id);
System.out.println(&quot;Sallery:&quot; + sallery);
}

public void HOD() {
System.out.println(&quot;...........................................&quot;);
System.out.println(&quot;HOD&quot;);
System.out.print(&quot;Enter name: &quot;);
String name = scanner.nextLine();
System.out.print(&quot;Enter department: &quot;);
String department = scanner.nextLine();
System.out.print(&quot;Enter Sallery: &quot;);
int sallery = scanner.nextInt();
System.out.println(&quot;Name:&quot; + name);
System.out.println(&quot;Department:&quot; + department);
System.out.println(&quot;Sallery:&quot; + sallery);
}

}
class Second {
public static void main(String[] args) {
Main myobj = new Main();
myobj.Student();

myobj.Teacher();
myobj.HOD();
}
}
