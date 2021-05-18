package de.demmer.dennis;

public class LoginController {

	public void login(User user) {

		// ****
		switch (user.getStatus()) {
		case ACTIVE:
			System.out.println("User '" + user.getName() + "' ist 'active'");
			// loginContinue();
			break;
		case PENDING:
			System.out.println("User '" + user.getName() + "' ist 'pending'");
			break;
		case BANNED:
			System.out.println("User '" + user.getName() + "' ist 'banned'");
			// banned();
			break;
		case DELETED:
			System.out.println("User '" + user.getName() + "' ist 'deleted'");
			break;
		default:
			break;
		}
		// ****

	}

}
