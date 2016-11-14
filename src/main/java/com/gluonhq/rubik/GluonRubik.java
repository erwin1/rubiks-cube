package com.gluonhq.rubik;

import com.gluonhq.charm.down.Platform;
import com.gluonhq.charm.glisten.application.MobileApplication;
import com.gluonhq.charm.glisten.mvc.SplashView;
import com.gluonhq.charm.glisten.visual.Swatch;
import com.gluonhq.rubik.views.RubikView;
import com.gluonhq.rubik.views.Splash;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.geometry.Rectangle2D;
import javafx.stage.Screen;
import javafx.util.Duration;

public class GluonRubik extends MobileApplication {

    @Override
    public void init() {
        addViewFactory(HOME_VIEW, () -> new RubikView(HOME_VIEW));
        addViewFactory(SPLASH_VIEW, () -> new SplashView(null, new Splash(), Duration.seconds(3)));
    }

    @Override
    public void postInit(Scene scene) {
        Swatch.TEAL.assignTo(scene);

        if (Platform.isDesktop()) {
            ((Stage) scene.getWindow()).getIcons().add(new Image(GluonRubik.class.getResourceAsStream("/icon.png")));
            Rectangle2D visualBounds = Screen.getPrimary().getVisualBounds();
            ((Stage) scene.getWindow()).setWidth(visualBounds.getWidth());
            ((Stage) scene.getWindow()).setHeight(visualBounds.getHeight());
        }
    }
}
