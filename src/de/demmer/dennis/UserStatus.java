package de.demmer.dennis;

public enum UserStatus {
	
	ACTIVE, PENDING, BANNED, DELETED;
	
	
	
	public static void printStatus(User user) {
		
		switch (user.getStatus()) {
		case ACTIVE:
			System.out.println("User '"+ user.getName() + "' ist 'active'");
			//login();
			break;
		case PENDING:
			System.out.println("User '"+ user.getName() + "' ist 'pending'");
			break;
		case BANNED:
			System.out.println("User '"+ user.getName() + "' ist 'banned'");
			//banned();
			break;		
		case DELETED:
			System.out.println("User '"+ user.getName() + "' ist 'deleted'");
			break;
		default:
			break;
		}
		
	}


}
