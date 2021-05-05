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
			System.out.println("Kay�t Olundu ho�geldiniz :"+gamer.getUsername());
		}else {
			System.out.println("Hesab�n�z olu�turulamad�.");
		}
		
	}
	
		
}
