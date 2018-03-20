package lesson1;

public class Cube {
	int l;
	int b;
	int h;
	
	public int getvolume(){
		return(l*b*h);
	}
	
	public int getarea() {
		return(2*(l*b + b*h + l*h));
	}

	Cube(){
		l=10;
		b=20;
		h=15;
		
	}
	
	Cube(int length,int bredth, int height){
		l=length;
		b=bredth;
		h=height;
		
	}
}
