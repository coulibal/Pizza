package exceptions;

public class Def {

	public static void main(String[] args) {
Person p=new Person("FRITZ MÜLLER");
int i=5;
System.out.println(p.derName);
System.out.println(i);
try{
System.out.println(p.derName);

}
catch( Exception e){
	
}
System.out.println(i);

}

}