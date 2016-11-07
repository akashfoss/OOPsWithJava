public class fraction2{
private int num;
private int den;


public void setnum(int n){
this.num = 1;

}

public void setden(int d){
this.den = 1;
}

public int getnum(){
return num;
}

public int getden(){
return den;
}

public static void main (String [] args){
fraction2 f = new fraction2();
f.setnum(4);
f.setden(5);
System.out.println("numerator/denominator"+f.getnum()+"/"+f.getden());

}
	}
