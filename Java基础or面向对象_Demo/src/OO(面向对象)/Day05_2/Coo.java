package OO.Day05_2;
import OO.Day05.Aoo;;

public class Coo { //演示同包的概念
	void show(){
		Aoo o = new Aoo();
		o.a = 1;
		//o.b = 2;
		//o.c = 3;
		//o.d = 4;
	}
}

class Doo extends Aoo{ //演示protected
	void show(){
		a = 1;
		b = 2;
		//c = 3;
		//d = 4;
	}
}


