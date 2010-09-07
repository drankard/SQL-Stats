package dk.graveyard;

import com.vaadin.Application;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.Window;

/**
 * Created by IntelliJ IDEA.
 * User: dn
 * Date: Sep 7, 2010
 * Time: 5:41:52 PM
 */
public class StatsApplication extends Application {

    @Override
    public void init() {
        Window mainWindow = new Window("Stats App");
        Label label = new Label("Hello Vaadin user");
        mainWindow.addComponent(label);
        mainWindow.addComponent(new EditStatElement());
        setMainWindow(mainWindow);
    }
}
