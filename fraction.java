public class fraction{
private int num;
private int den;


public void setnum(int n){
this.num = n;
}

public void setden(int d){
this.den = d;
}

public int getnum(){
return num;
}

public int getden(){
return den;
}

public static void main (String [] args){
fraction f = new fraction();
f.setnum(4);
f.setden(5);
System.out.println("numerator/denominator"+f.getnum()+"/"+f.getden());

}

	}
