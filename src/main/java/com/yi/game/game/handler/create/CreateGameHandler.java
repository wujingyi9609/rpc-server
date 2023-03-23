package com.yi.game.game.handler.create;

import com.yi.game.common.constant.GameType;
import com.yi.game.game.factory.GameHandlerFactory;
import com.yi.game.player.model.Player;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class CreateGameHandler {
    @Autowired
    private GameHandlerFactory handlerFactory;

    @Autowired
    private void postConstruct() {

    }

    public abstract GameType getType();

    public abstract void create(Player player);
}
