package p976r;

import android.view.MenuItem;

/* JADX INFO: renamed from: r.q */
/* JADX INFO: loaded from: classes.dex */
public final class MenuItemOnActionExpandListenerC18819q implements MenuItem.OnActionExpandListener {

    /* JADX INFO: renamed from: a */
    public final MenuItem.OnActionExpandListener f59905a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MenuItemC18821s f59906b;

    public MenuItemOnActionExpandListenerC18819q(MenuItemC18821s menuItemC18821s, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f59906b = menuItemC18821s;
        this.f59905a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f59905a.onMenuItemActionCollapse(this.f59906b.m774h(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f59905a.onMenuItemActionExpand(this.f59906b.m774h(menuItem));
    }
}
