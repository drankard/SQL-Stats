package dk.graveyard;

import com.vaadin.ui.*;

/**
 * Created by IntelliJ IDEA.
 * User: dn
 * Date: Sep 7, 2010
 * Time: 5:52:26 PM
 */
public class EditStatElement extends VerticalLayout {

    private TextField sqlField;

    public EditStatElement() {
        Panel panel = new Panel("SQL");
        sqlField = new TextField();
        sqlField.setRows(10);
        sqlField.setColumns(50);
        panel.addComponent(sqlField);
        HorizontalLayout hl = new HorizontalLayout();
        Button validateBtn = new Button("Validate");
        Button saveBtn = new Button("Save");
        hl.addComponent(validateBtn);
        hl.addComponent(saveBtn);
        panel.addComponent(hl);
        addComponent(panel);
    }

    public String getSQL() {
        return sqlField.getValue().toString();
    }
}
