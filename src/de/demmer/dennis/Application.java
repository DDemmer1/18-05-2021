package de.demmer.dennis;

public class Application {
	
	
	public static void main(String[] args) {

		User u1 = new User("5df5gh465", "DDemmer1", UserStatus.ACTIVE);
		User u2 = new User("4865d4fhg54", "Peter", UserStatus.BANNED);
		User u3 = new User("9465df4g6", "Klaus", UserStatus.PENDING);
		User u4 = new User("7dfh4536", "Mike", UserStatus.DELETED);
		
		
		
		UserStatus.printStatus(u1);
		UserStatus.printStatus(u2);
		UserStatus.printStatus(u3);
		UserStatus.printStatus(u4);

		
		
	}

}
