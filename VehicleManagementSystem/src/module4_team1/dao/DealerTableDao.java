package module4_team1.dao;

import module4_team1.DealerDetails;

public class DealerTableDao {

	public DealerDetails getDealerDetails(String dealerId) {
		DealerDetails item = new DealerDetails();
		item.setId(dealerId);
		item.setDetails("Dealer name: XXXX, store location: XXXXXX");
		return item;
	}
}
