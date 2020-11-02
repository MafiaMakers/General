package Mafia.General.Network;
import Mafia.General.Events.MafiaEvent;

//! \brief Базовый класс для событий сети
public class NetworkEvent extends MafiaEvent {

    public NetworkEvent(){
        super();
    }

    public NetworkEvent(Object source){
        super(source);
    }

}
