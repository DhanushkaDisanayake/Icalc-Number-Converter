import java.util.*;
class Assingment05{
	public static void main(String args[]){
		Scanner input = new Scanner (System.in);
		L1:do{
			System.out.printf("\n%38s __   ______             __\n","");
			System.out.printf("%38s|  \\ /      \\           |  \\\n","");
			System.out.printf("%38s \\$$|  $$$$$$\\   _____  | $$  ________\n","");
			System.out.printf("%38s|  \\| $$   \\$$  |     \\ | $$ /        \\\n","");
			System.out.printf("%38s| $$| $$         \\$$$$$\\| $$|   $$$$$$$\n","");
			System.out.printf("%38s| $$| $$   __  /      $$| $$|  $$\n","");
			System.out.printf("%38s| $$| $$__/  \\|  $$$$$$$| $$|  $$_____\n","");
			System.out.printf("%38s| $$ \\$$    $$ \\$$    $$| $$ \\ $$     \\\n","");
			System.out.printf("%38s \\$$  \\$$$$$$   \\$$$$$$$ \\$$  \\ $$$$$$$\n","");
			
			System.out.println(" _   _                       _                         _____                                         _");
			System.out.println("| \\ | |                     | |                       / ____|                                       | |");
			System.out.println("|  \\| |  _   _   _ __ ___   | |__     ___   _ __     | |        ___    _ __   __   __   ___   _ __  | |_    ___   _ __ ");
			System.out.println("| . ' | | | | | | '_ ' _ \\  | '_ \\   / _ \\ | '__|    | |       / _ \\  | '_ \\  \\ \\ / /  / _ \\ | '__| | __|  / _ \\ | '__|");
			System.out.println("| |\\  | | |_| | | | | | | | | |_) | |  __/ | |       | |____  | (_) | | | | |  \\ v /  |  __/ | |    | |_  |  __/ | |   ");
			System.out.println("|_| \\_|  \\__,_| |_| |_| |_| |_.__/   \\___| |_|        \\_____|  \\___/  |_| |_|   \\_/    \\___| |_|     \\__|  \\___| |_|   \n");
			System.out.println("=======================================================================================================================\n");
			System.out.println("\t[01] Decimal Converter\n");
			System.out.println("\t[02] Binary Converter\n");
			System.out.println("\t[03] Octal Converter\n");
			System.out.println("\t[04] Hexadecimal Converter\n");
			System.out.println("\t[05] Exit.\n\n");
			
			System.out.print("Enter Option -> ");
			int option = input.nextInt();
			System.out.println();
				
			switch(option){
				case 1 :{ 
					L2:while(true){					
						System.out.println("+----------------------------------------------------------------------+");
						System.out.println("|                       Decimal Converter                              |");
						System.out.println("+----------------------------------------------------------------------+\n");
						
						System.out.print("Enter the Decimal number : ");
						int num = input.nextInt();
		
						System.out.println();
						String binary = "";
						String octal = "";
						String hex = "";
						
						if(num<0){
							System.out.println("\tinvalid input...");
							System.out.println();
							System.out.print("Do you want to input number again (N/Y) -> ");
							char again = input.next().charAt(0);
							System.out.println();
							
							if ( again=='Y' || again=='y' ){
								continue L2;
							}else{
								return;
							}
						}else{
							int numBinary=num;
							while (numBinary>0){
								int ch = numBinary%2;
								numBinary/=2;
								binary = ch + binary; 
							}
							System.out.println("\tBinary number        : "+binary);
							
							int numOctal= num;
							while (numOctal>0){
								int ch = numOctal%8;
								numOctal/=8;
								octal = ch + octal; 
							}
							System.out.println("\tOctal number         : "+octal);
							
							int numHex= num;
							while (numHex>0){
								int rema = numHex%16;
								char ch;
								if (rema>=10){
									ch =(char)('A'+ (rema-10));
								}else{
									ch = (char)('0' +rema);
								}
								numHex/=16;
								hex = ch + hex; 
							}
							System.out.println("\tHexadecimal number   : "+hex);
							
							System.out.println();
							System.out.print("Do you want to go to homepage (Y/N) -> ");
							char homePage = input.next().charAt(0);
							
							if (homePage=='Y'||homePage=='y'){
								continue L1;
							}else{
								return;
							}
						}
					}			
				}

				case 2 :{
					L2:while(true){					
						System.out.println("+----------------------------------------------------------------------+");
						System.out.println("|                       Binary Converter                               |");
						System.out.println("+----------------------------------------------------------------------+\n");
						
						System.out.print("Enter the Binary number : ");
						int num = input.nextInt();
						
						String numI = "";
						
						while (num > 0){
							int digit = num % 10;
							char ch = (char) ('0' + digit);
							numI = ch + numI;
							num /= 10;    
						}

						boolean x = true;
						for (int i = 0; i < numI.length(); i++){
							char ch = numI.charAt(i);
							if (ch!='0' && ch!='1'){
								x = false;
							}
						}

						System.out.println();
						String decimalStr = numI;
						String octal = "";
						String hex = "";
						
						if(x==false){
							System.out.println("\tinvalid input...");
							System.out.println();
							System.out.print("Do you want to input number again (N/Y) -> ");
							char again = input.next().charAt(0);
							System.out.println();
							
							if ( again=='Y' || again=='y' ){
								continue L2;
							}else{
								return;
							}
						}else{
							int decimal=0;
							for (int i = decimalStr.length()-1,j=0; i >=0; i--,j++){
								char ch=decimalStr.charAt(i);
								int numPow=ch-48;
								decimal+=Math.pow(2,j)*numPow;
							}
							System.out.println("\tDecimal number       : "+decimal);
							
							int numOctal= decimal;
							while (numOctal>0){
								int ch = numOctal%8;
								numOctal/=8;
								octal = ch + octal; 
							}
							System.out.println("\tOctal number         : "+octal);
							
							int numHex= decimal;
							while (numHex>0){
								int rema = numHex%16;
								char ch;
								if (rema>=10){
									ch =(char)('A'+ (rema-10));
								}else{
									ch = (char)('0' +rema);
								}
								numHex/=16;
								hex = ch + hex; 
							}
							System.out.println("\tHexadecimal number   : "+hex);
							
							System.out.println();
							System.out.print("Do you want to go to homepage (Y/N) -> ");
							char homePage = input.next().charAt(0);
							
							if (homePage=='Y'||homePage=='y'){
								continue L1;
							}else{
								return;
							}
						}
					}			
				}

				case 3 :{
					L2:while(true){					
						System.out.println("+----------------------------------------------------------------------+");
						System.out.println("|                        Octal Converter                               |");
						System.out.println("+----------------------------------------------------------------------+\n");
						
						System.out.print("Enter the Octal number : ");
						int num = input.nextInt();
						
						String numI = "";
						
						while (num > 0){
							int digit = num % 10;
							char ch = (char) ('0' + digit);
							numI = ch + numI;
							num /= 10;    
						}

						boolean x = true;
						for (int i = 0; i < numI.length(); i++){
							char ch = numI.charAt(i);
							if (ch!='0' && ch!='1' && ch!='2' && ch!='3' && ch!='4' && ch!='5' && ch!='6' && ch!='7'){
								x = false;
							}
						}

						System.out.println();
						String decimalStr = numI;
						String binary = "";
						String hex = "";
						
						if(x==false){
							System.out.println("\tinvalid input...");
							System.out.println();
							System.out.print("Do you want to input number again (N/Y) -> ");
							char again = input.next().charAt(0);
							System.out.println();
							
							if ( again=='Y' || again=='y' ){
								continue L2;
							}else{
								return;
							}
						}else{
							int decimal=0;
							for (int i = decimalStr.length()-1,j=0; i >=0; i--,j++){
								char ch=decimalStr.charAt(i);
								int numPow=ch-48;
								decimal+=Math.pow(8,j)*numPow;
							}
							System.out.println("\tDecimal number         : "+decimal);
							
							int numBinary=decimal;
							while (numBinary>0){
								int ch = numBinary%2;
								numBinary/=2;
								binary = ch + binary; 
							}
							System.out.println("\tBinary number          : "+binary);
							
							int numHex= decimal;
							while (numHex>0){
								int rema = numHex%16;
								char ch;
								if (rema>=10){
									ch =(char)('A'+ (rema-10));
								}else{
									ch = (char)('0' +rema);
								}
								numHex/=16;
								hex = ch + hex; 
							}
							System.out.println("\tHexadecimal number     : "+hex);
							
							System.out.println();
							System.out.print("Do you want to go to homepage (Y/N) -> ");
							char homePage = input.next().charAt(0);
							
							if (homePage=='Y'||homePage=='y'){
								continue L1;
							}else{
								return;
							}
						}
					}			
				}
				
				case 4 :{
					L2:while(true){					
						System.out.println("+----------------------------------------------------------------------+");
						System.out.println("|                        Hexadecimal Converter                         |");
						System.out.println("+----------------------------------------------------------------------+\n");
						
						System.out.print("Enter the Hexadecimal number : ");
						String num = input.next();
						
						System.out.println();
						String decimalStr = num;
						String binary = "";
						String octal = "";
						

						int decimal=0;
						for (int i = decimalStr.length()-1,j=0; i >=0; i--,j++){
							char ch=decimalStr.charAt(i);
							int pow;
							
							if(ch>='0' && ch<='9'){
								pow=ch-'0';
							}else if(ch>='A' && ch<='F'){
								pow=ch-'A'+10;
							}else if(ch>='a' && ch<='a'){
								pow=ch-'a'+10;
							}else{
								System.out.println("\tinvalid input...");
								System.out.println();
								System.out.print("Do you want to input number again (N/Y) -> ");
								char again = input.next().charAt(0);
								System.out.println();
								
								if ( again=='Y' || again=='y' ){
									continue L2;
								}else{
									return;
								}
							}
							decimal+=Math.pow(16,j)*pow;
						}
						System.out.println("\tDecimal number         : "+decimal);
							
						int numBinary=decimal;
						while (numBinary>0){
							int ch = numBinary%2;
							numBinary/=2;
							binary = ch + binary; 
						}
						System.out.println("\tBinary number          : "+binary);
							
						int numOctal= decimal;
						while (numOctal>0){
							int ch = numOctal%8;
							numOctal/=8;
							octal = ch + octal; 
						}
						System.out.println("\tOctal number           : "+octal);
							
						System.out.println();
						System.out.print("Do you want to go to homepage (Y/N) -> ");
						char homePage = input.next().charAt(0);
							
						if (homePage=='Y'||homePage=='y'){
							continue L1;
						}else{
							return;
						}						
					}			
				}
				case 5 :
				return;
				
				default:
					System.out.println("Invalid Option...Try again... ");
			}
		}while(true);	
	}
}
