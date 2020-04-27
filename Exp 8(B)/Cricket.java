class Games {
    public void type() {  
 	System.out.println("Indoor & outdoor"); 
    }
}
class Cricket extends Games {
    public void type() {  
        System.out.println("outdoor game"); 
    }
    public static void main(String[] args)
    {
   	Cricket ck = new Cricket();
        Games gm = new Cricket();   //gm refers to Cricket object
   	gm.type();
   	ck.type();
   	gm.type();	//calls Cricket's version of type
    }
}
