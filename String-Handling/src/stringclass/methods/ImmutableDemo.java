package stringclass.methods;

public class ImmutableDemo {
    private int i;
    ImmutableDemo(int i)
    {
    	this.i=i;
    }
	public ImmutableDemo Modify(int i)  //implementation of this method decides immutability
	{
		if(this.i== i)//if no change occured reuse old object
		{
			return this;
		}
		else {
			return (new ImmutableDemo(i));//if changes found return new object with changes
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ImmutableDemo t1= new ImmutableDemo(10);
        ImmutableDemo t2= t1.Modify(100);
        ImmutableDemo t3= t1.Modify(10);
        System.out.println(t1==t2);
        System.out.println(t1==t3);
	}

}
