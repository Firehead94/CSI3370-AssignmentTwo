public class BeerSong {
   
   public static void main(String [] args){
   	
   	Ninety_Nine_Bottles_of_Beer();
   	
   }
   
   public static void Ninety_Nine_Bottles_of_Beer(){
   	
   	for (int i = 99; i > 1; i=i) {
   		System.out.printf("%d bottles of beer on the wall, %d bottles of beer\n", i, i);
   		i--;
   		System.out.printf("take one down, pass it around, %d bottles of beer on the wall.\n", i);
   	}
   	System.out.println("1 bottle of beer on the wall, 1 bottle of beer \n take one down, pass it around, no more bottles of beer on the wall.");
   	
   }
}