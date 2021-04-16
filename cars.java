package inheritance;

	interface cars{
		public void gears();
		public void speed();
	}
		class Rolls implements cars{

			public void gears() {
				System.out.println("The Rolls car have Gears count of : 7");
	         
					}
			public void speed() {
			System.out.println("The Rolls Speed is : 300");
			}
		}
			class Default{
				public static void main(String[] args) {
					Rolls mycar = new Rolls();
					mycar.gears();
					mycar.speed();
				}
			}
	  

			//This program is the implementation of default Interface.
			//The multiple inheritance also can be achieved by using Implements


