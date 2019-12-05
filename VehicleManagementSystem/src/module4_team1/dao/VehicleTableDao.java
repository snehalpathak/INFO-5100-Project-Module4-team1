package module4_team1.dao;

import module4_team1.VehicleDetails;

public class VehicleTableDao {

	public VehicleDetails getVehicleDetails(String carId) {
	 VehicleDetails item = new VehicleDetails();
		item.setId(carId);
		item.setDetails("model name: XXX, maker name: XXX, year: XXX");
		item.setInterestedPeopleCount(100);
		return item;
	}

}
