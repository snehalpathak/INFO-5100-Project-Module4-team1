package module4_team1;

import java.util.UUID;

public class DataObject {
	private static DataObject _instance;
	
	public static DataObject getInstance() {
		if(_instance == null)
			_instance = new DataObject();
		
		return _instance;
	}
	
	
	public String getId() {
		return UUID.randomUUID().toString();
	}
}
