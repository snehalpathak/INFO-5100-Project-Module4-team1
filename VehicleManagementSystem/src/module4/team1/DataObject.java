package module4.team1;

import java.util.UUID;

public class DataObject {
	private String id;
	private static DataObject _instance;
	
	public static DataObject getInstance() {
		if(_instance == null)
			_instance = new DataObject();
		
		return _instance;
	}
	
	
	public String getId() {
		id = UUID.randomUUID().toString();
		return id;
	}
}
