package inr;

	interface Pizza{
		void show();
	}
	public class b {
	static Pizza p = new Pizza(){
		public void show(){
			System.out.println("HI IM YOUR PIZZA BOY");
		}
	};
		public static void main(String[]args){
			p.show();
		}
		
	}

