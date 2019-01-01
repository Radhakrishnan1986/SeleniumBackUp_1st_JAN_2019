package finalizeTest;

public class FinalizeTest {

	public void finalize() {
		
		System.out.println("Finalize executer");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalizeTest a = new FinalizeTest();
		FinalizeTest b = new FinalizeTest();
		a = null;
		b = null;
		System.gc();
		
//To note, Results will or will not be displayed, based on the speed of respective Machine
//Before deleting/disconnecting we are asking webdriver to perform any action

/*It is a method that the Garbage Collectoralways calls just before the deletion/destroying the object 
which is eligible for Garbage Collection, so as to perform clean-up activity. 
Clean-up activity means closing the resources associated with that object like Database Connection, 
Network Connection or we can say resource de-allocation. Remember it is not a reserved keyword.
Once finalize method completes immediately Garbage Collector destroy that object. 

finalize method is present in Object class and its syntax is:
protected void finalize throws Throwable{}

Since Object class contains finalize method hence finalize method is available for every java class since Object is 
superclass of all java classes. Since it is available for every java class hence Garbage Collector can call finalize 
method on any java object
Now, the finalize method which is present in Object class, has empty implementation, 
in our class clean-up activities are there, then we have tooverride this method to define our own clean-up activities.*/
		
	}

}
