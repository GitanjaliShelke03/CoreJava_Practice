public class ThisConstructor {
    int a;
    public ThisConstructor() {
        System.out.println("no arg constructor");

    }
    public ThisConstructor(int a) {
        this();   //call above no arg constructor ..current class constuctor
        this.a = a; //refer current class instance variable
        System.out.println(a);

    }
	
	//this keyword used to invoke current class method
	
	void display(){
		System.out.println("hello");
	}
	
	void show(){
		this.display();
	}

    public static void main(String[] args) {
        ThisConstructor t = new ThisConstructor(2);
		t.show();
    }
}
