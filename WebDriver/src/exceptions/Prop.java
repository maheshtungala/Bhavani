package exceptions;

public class Prop {
    void a(){
    	int a=10;
    	System.out.println(a/0);
    }
    void b(){
    	a();
    }
    void c(){
    	b();
    }
	public static void main(String[] args) {
		Prop p = new Prop();
		p.c();

	}

}
