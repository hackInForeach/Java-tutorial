
public class Main {

	public static void main(String[] args) {
		// static = modifier. As single copy of a variable/method is created and shared.
		//		    The class "owns" the static member
	
		
		Friend friend1 = new Friend("Sponegbob");
		Friend friend2 = new Friend("Patrik");
		Friend friend3 = new Friend("Squidward");
		Friend friend4 = new Friend("Sandy");
	
		
		
		//System.out.println(Friend.numberOfFriends);
		Friend.displayFriends();
	}

}
