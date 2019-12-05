package module4_team1;

public class VehicleDetails {
    private String details;
    private String id;
    private int interestedPeopleCount;
    private VehicleDetails _instance;
    
    public VehicleDetails getInstance() {
    	if(_instance == null) {
    		_instance = new VehicleDetails();
    	}
    	return _instance;
    }
    
    public VehicleDetails() {
    	
    }

    public VehicleDetails(String details, String id, int interestedPeopleCount) {
    	this.id = id;
    	this.details = details;
    	this.interestedPeopleCount = interestedPeopleCount;    	
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

    public int getInterestedPeopleCount() {
        return interestedPeopleCount;
    }

    public void setInterestedPeopleCount(int interestedPeopleCount) {
        this.interestedPeopleCount = interestedPeopleCount;
    }
}
