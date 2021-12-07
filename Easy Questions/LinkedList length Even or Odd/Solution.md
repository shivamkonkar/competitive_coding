class GFG
{
	int isLengthEvenorOdd(Node head1)
	{
	    int counter = 0;
	    
	    while(head1 != null){
	        counter = counter + 1;
	        head1 = head1.next;
	    }
	    
	    if(counter % 2 == 0){
	       
	    
	        return 0 ;
	        
	    }
	    
	    
	    return 1;
	}
}