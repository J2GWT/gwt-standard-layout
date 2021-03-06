/*
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package ir.moke.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import ir.moke.gwt.client.layout.DefaultLayout;

public class Main implements EntryPoint {

    @Override
    public void onModuleLoad() {
        Resources.INSTANCE.getMainCss().ensureInjected();
        DefaultLayout defaultLayout = new DefaultLayout();
        RootLayoutPanel rp = RootLayoutPanel.get();
        rp.add(defaultLayout);

    }
}
