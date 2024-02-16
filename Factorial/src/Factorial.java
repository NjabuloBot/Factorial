class factorial{

   int factorialValue = 1;

   public int recurFunction(int n){
         if(n <= 1){
            return factorialValue;
         }else{
            factorialValue*=n;
            return recurFunction(n -1);
      }
   }
}