package Abstract;

import Entities.Campaign;

public abstract class BaseCampaignManager implements ICampaignService {

	@Override
	public void addCampaign(Campaign campaign) {
	System.out.println("Kampanya Eklendi :"+campaign.getName());	
	}
	
	public void updateCampaign(Campaign campaign){
		System.out.println("Kampanya Deðiþtirildi :"+campaign.getName());
	}
	public void deleteCampaign(Campaign campaign) {
		System.out.println("Kampanya Silindi : "+campaign.getName());
	}
}
