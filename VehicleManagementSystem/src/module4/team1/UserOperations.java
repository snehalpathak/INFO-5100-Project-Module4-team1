package module4.team1;

public class UserOperations {
	private static UserOperations _instance;
	
	public static UserOperations getInstance() {
		if(_instance == null)
			_instance = new UserOperations();
		
		return _instance;
	}

	public void addUserDetailsToDB(User user) {
		
	}
	
}
