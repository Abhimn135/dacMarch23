class P109{
	public static void main(String[] args){
		for(int i=1;i<=5;i++){
			for(int j=4;j>=i;j--){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		int a=5;
		for(int i=1;i<=5;i++){
				for(int k=2;k<=i;k++){
				System.out.print(" ");
				}
			
			for(int j=1;j<=a;j++){
			
				System.out.print("*");
			}
			a--;
			System.out.println();
		}
		
		
	}
}