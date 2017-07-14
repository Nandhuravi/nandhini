public class rep {
	
		

		public static void main(String[] args) {
			int n=args.length;
			int count[]=new int[n];
			int a1[]=new int[n];
			for(int i=0;i<n;i++){
				a1[i]=Integer.parseInt(args[i]);
				count[i]=0;
			}
			for(int i=0;i<n;i++){
					for(int j=0;j<n;j++){
					if(a1[i]==a1[j]){
						count[i]=count[i]+1;
						}
					}
			  }
			for(int i=0;i<n;i++){
				if(count[i]<2){
					System.out.println("The non repeating element is:"+a1[i]);
				}
			}
		}

	}

