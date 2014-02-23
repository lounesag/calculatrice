package math;
 
class Addition {
   public Long calculer(Long a, Long b) {
      return a+b;
   }
   public Character lireSymbole() {
      return '-';
   }
   
   public Long soustraire(Long a, Long b) {
	   if (a>b){
		   Long c;
		   c=a-b;
	      return c;
	   }
	   else {return b-a ;}
   }
}