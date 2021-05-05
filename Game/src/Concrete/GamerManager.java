package Concrete;

import Abstract.BaseGamerManager;
import Abstract.IGamerCheckService;
import Entities.Gamers;


public class GamerManager extends BaseGamerManager  {

		private IGamerCheckService igamerCheckService;
		
		
	public GamerManager(IGamerCheckService igamerCheckService) {
			super();
			this.igamerCheckService = igamerCheckService;
		}


	@Override
	public void signUp(Gamers gamer) {
		
		if (igamerCheckService.gamerCheck(gamer)) {
			System.out.println("Kayýt Olundu hoþgeldiniz :"+gamer.getUsername());
		}else {
			System.out.println("Hesabýnýz oluþturulamadý.");
		}
		
	}
	
		
}
