package Abstract;

import Entities.Campaign;
import Entities.Gamers;
import Entities.Games;

public interface IGamesService {
 void selling(Gamers gamer, Games game);
 void selling(Gamers gamer, Games game,Campaign campaign);
}
