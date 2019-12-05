package module4_team1;

public class DealerDetails {
    private String details;
    private String id;
    private DealerDetails _instance;
    
    public DealerDetails getInstance() {
    	if(_instance == null) {
    		_instance = new DealerDetails();
    	}
    	return _instance;
    }
    
    public DealerDetails() {
    	
    }
    
    public DealerDetails(String id, String details) {
    	this.id = id;
    	this.details = details;
    }
    
    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
