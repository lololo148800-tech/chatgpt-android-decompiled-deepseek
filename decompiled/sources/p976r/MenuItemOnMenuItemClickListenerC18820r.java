package p976r;

import android.view.MenuItem;

/* JADX INFO: renamed from: r.r */
/* JADX INFO: loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC18820r implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a */
    public final MenuItem.OnMenuItemClickListener f59907a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MenuItemC18821s f59908b;

    public MenuItemOnMenuItemClickListenerC18820r(MenuItemC18821s menuItemC18821s, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f59908b = menuItemC18821s;
        this.f59907a = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f59907a.onMenuItemClick(this.f59908b.m774h(menuItem));
    }
}
