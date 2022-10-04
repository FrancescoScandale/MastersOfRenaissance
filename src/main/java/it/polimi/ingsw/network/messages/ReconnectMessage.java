package it.polimi.ingsw.network.messages;

import java.io.Serializable;

public class ReconnectMessage extends Message implements Serializable {
    private final String nickname;

    public ReconnectMessage(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }
}
