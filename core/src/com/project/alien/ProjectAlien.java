package com.project.alien;

import com.badlogic.gdx.Game;
import com.project.alien.utils.ScreenEnum;
import com.project.alien.utils.ScreenManager;

public class ProjectAlien extends Game {

    @Override
    public void create() {
        ScreenManager.getInstance().initialize(this);
        ScreenManager.getInstance().showScreen(ScreenEnum.MAIN_MENU);
    }

}
