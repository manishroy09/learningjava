class gfg1 {
    static boolean isPrime(int n) {
        
        
         int div=0;
        for(int i=1; i*i<=n ; i++){
            if(n%i==0){
                
                div++;
                
                if(i!=n/i)
                div++;
                
            }
            
        }
        if (div==2){
            return true;
        }
        else{
            return false;
        }
    }
    
}