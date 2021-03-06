package com.simplecity.amp_library.ui.drawer;

import com.simplecity.amp_library.model.Playlist;
import com.simplecity.amp_library.ui.views.PurchaseView;
import java.util.List;

public interface DrawerView extends PurchaseView {

    void setPlaylistItems(List<Playlist> playlists);

    void closeDrawer();

    void setDrawerItemSelected(@DrawerParent.Type int type);
}
