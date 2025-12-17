// public class Demo{
//     public static void main(String[] args) {
//     //     for(int i=1;i<=5;i++) {
// 	// 		for(int j=1;j<=5;j++) {
// 	// 			if(i==1 || j==1 || j==5 || i==5) {
// 	// 				System.out.print("*");
// 	// 			}
// 	// 			else {
// 	// 				System.out.print(" ");
// 	// 			}
// 	// 	}
// 	// 		System.out.println();
// 	// }


// 		for(int i=1;i<=5;i++){
// 			for(int j=1;j<=5;j++){
// 				if(i>=j){
// 					System.out.print("*");
// 				}
// 			}
// 			System.out.println();
// 		}

// 	}}
    

public class Demo{
	public static void main(String[] args) {
		Robot R1=new Robot();
		R1.Has("Chitti",2,21);
		System.out.println(R1.Name);
		System.out.println(R1.age);
		System.out.println(R1.Roll_NO);
		R1.Does("Running, Walking, Gaming, Cleaning");
		R1.Emotions("No Emotions");


		Car c1=new Car();
		c1.Setter("Tesla","Maroon",4,"100Kwh");
		c1.Has();
		c1.Does("Fast with Rapid innovation");
		c1.SpecialF("Self Drive, Bio weapon Defense Mode");
		System.out.println();
		System.out.println("----- NEXT ----");
		System.out.println();
		Car c2=new Car();
		c2.Setter("BMW","Blue",4,"2998 cc");
		c2.Has();
		c2.Does("Fast running with Safety, Voice Assitance");
		c2.SpecialF("3D remote View, Curb view");



	}
}
class Robot{
	String Name;
	int age;
	int Roll_NO;
	String work;
	void Has(String Name,int age,int Roll_NO){
		this.Name=Name;
		this.age=age;
		this.Roll_NO=Roll_NO;
	}
	void Does(String work){
		System.out.println(work);
	}
	void Emotions(String Emotions){
		// this.work=work;
		System.out.println(Emotions);
	}
}

class Car{
	String Name;
	String Color;
	int Wheels;
	String CC_Engine;
	String SpecialF;
	String Does;

	void Setter(String Name,String Color,int Wheels,String CC_Engine){
		this.Name=Name;
		this.Color=Color;
		this.Wheels=Wheels;
		this.CC_Engine=CC_Engine;
		this.Does=Does;
		this.SpecialF=SpecialF;
	}
    void Has(){
		System.out.println(Name);
		System.out.println(Color);
		System.out.println(Wheels);
		System.out.println(CC_Engine);
	}
	void Does(String Does){
		System.out.println(Does);
	}
	void SpecialF(String SpecialF){
		System.out.println(SpecialF);
	}

}