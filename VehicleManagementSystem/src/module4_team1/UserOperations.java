package module4_team1;

import database.ConnectionURL;

public class UserOperations {
	private static UserOperations _instance;
	
	public static UserOperations getInstance() {
		if(_instance == null) {
			_instance = new UserOperations();
		}
		return _instance;
	}

	public void addUserDetailsToDB(String firstName, String lastName, String email, String contactNo, String comment, String dealerId, String vehicleId) {
		User user = new User(firstName, lastName, email, contactNo, comment);
		ConnectionURL.getInstance().addToDatabase(user, dealerId, vehicleId);
	}	
}
