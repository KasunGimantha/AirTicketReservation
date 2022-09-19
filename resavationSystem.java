import java.util.Scanner;
public class resavationSystem{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	
		System.out.println();
		System.out.println("       		SKY LINE");
		System.out.println();
		System.out.println("Our destinations are:\nColombo\nMaththala\nSingapor\nTokyo");
		System.out.println("Depature:2.00 AM       Arrival:8.30 AM");
		System.out.println();
		System.out.print("please enter 'C' to continue or 'E' to exit: ");
		char c=sc.next().charAt(0);
		System.out.println();
		
		int arr[]=new int[16];
		int index=0;
		
		int seat=0;
		
		while(c!= 'E'){

			boolean condition=true;
			
			int ar[][]={{1 ,2 ,3 ,4 },
				{5 ,6 ,7 ,8 },
				{9 ,10,11,12},
				{13,14,15,16}};
			
			for(int rows=0;rows<=3;rows++){
				for(int cols=0;cols<=3;cols++)
					if(ar[rows][cols]==seat)
						System.out.print("Booked  ");
						
					else
						System.out.print(ar[rows][cols]+"   ");

					System.out.println();
					System.out.println();		
			}
			System.out.println();
			System.out.print("Select your seat number:");
			seat=sc.nextInt();
			
			for(int x=0;x<arr.length;x++){
				if(arr[x]==seat)
					condition=false;
				
			}
			if(condition==true){
				arr[index]=seat;
				index++;
	
				System.out.print("Enter your destination: ");
				String destin=sc.next();
				System.out.println();
				System.out.println("Seat no."+seat+" has been succesfully booked");



			
				System.out.println();
				System.out.println("       Thank You have a Nice Day!!!");
				System.out.println();
				System.out.print("please enter 'C' to continue or 'E' to exit: ");
				c=sc.next().charAt(0);
				
			}
			
			else{
				System.out.println();
				System.out.println("Seat number "+seat+" has been already booked. Please try another seat.");
				System.out.println();
				continue;
				}
			
		}

	}
}
