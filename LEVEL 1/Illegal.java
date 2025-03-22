 import  java.util.Scanner; 
    public  class  Illegal{ 
    public  static  void  generateException  (String s){
      System.out.println(s.substring(  5  ,  2  )); 
    }
    public  static  void  handleException  (String s){ 
     try  
     { 
       System.out.println(s.substring(  5  ,  2  )); 
     }  
    catch  (IllegalArgumentException e)
    { 
        System.out.println(  "IllegalArgumentException  caught:  "  +e.getMessage()); 
    }  
    catch  (Exception e){ 
        System.out.println(  "Generic Exception:"  +e.getMessage()); 
    } 
 } 
     public  static  void  main  (String[] args) { 
        Scanner sc=  new  Scanner(System.in); 
        String s=sc.next(); 
        //generateException(s); 
        handleException(s); 
 } 
 } 