package ir.moke.gwt.client.layout;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Panel;

public class DefaultLayout extends Composite {
    interface DefaultLayoutBinder extends UiBinder<Panel, DefaultLayout> {
    }

    private static final DefaultLayoutBinder binder = GWT.create(DefaultLayoutBinder.class);

    public DefaultLayout() {
        Panel panelBinder = binder.createAndBindUi(this);
        initWidget(panelBinder);
    }
}
