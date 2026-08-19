package p976r;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p003A1.AbstractC0235c;
import p1015t2.InterfaceMenuItemC19750a;
import p692d0.C12959L;

/* JADX INFO: renamed from: r.A */
/* JADX INFO: loaded from: classes.dex */
public class MenuC18799A extends AbstractC0235c implements Menu {

    /* JADX INFO: renamed from: d */
    public final MenuC18814l f59760d;

    public MenuC18799A(Context context, MenuC18814l menuC18814l) {
        super(context);
        if (menuC18814l == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f59760d = menuC18814l;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m774h(this.f59760d.m20120a(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f59760d.addIntentOptions(i10, i11, i12, componentName, intentArr, intent, i13, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i14 = 0; i14 < length; i14++) {
                menuItemArr[i14] = m774h(menuItemArr2[i14]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f59760d.addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        C12959L c12959l = (C12959L) this.f879c;
        if (c12959l != null) {
            c12959l.clear();
        }
        this.f59760d.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f59760d.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i10) {
        return m774h(this.f59760d.findItem(i10));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i10) {
        return m774h(this.f59760d.getItem(i10));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f59760d.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return this.f59760d.isShortcutKey(i10, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i10, int i11) {
        return this.f59760d.performIdentifierAction(i10, i11);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        return this.f59760d.performShortcut(i10, keyEvent, i11);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i10) {
        if (((C12959L) this.f879c) != null) {
            int i11 = 0;
            while (true) {
                C12959L c12959l = (C12959L) this.f879c;
                if (i11 >= c12959l.f41154o0) {
                    break;
                }
                if (((InterfaceMenuItemC19750a) c12959l.m14646f(i11)).getGroupId() == i10) {
                    ((C12959L) this.f879c).m14647g(i11);
                    i11--;
                }
                i11++;
            }
        }
        this.f59760d.removeGroup(i10);
    }

    @Override // android.view.Menu
    public final void removeItem(int i10) {
        if (((C12959L) this.f879c) != null) {
            int i11 = 0;
            while (true) {
                C12959L c12959l = (C12959L) this.f879c;
                if (i11 >= c12959l.f41154o0) {
                    break;
                }
                if (((InterfaceMenuItemC19750a) c12959l.m14646f(i11)).getItemId() == i10) {
                    ((C12959L) this.f879c).m14647g(i11);
                    break;
                }
                i11++;
            }
        }
        this.f59760d.removeItem(i10);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i10, boolean z6, boolean z10) {
        this.f59760d.setGroupCheckable(i10, z6, z10);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i10, boolean z6) {
        this.f59760d.setGroupEnabled(i10, z6);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i10, boolean z6) {
        this.f59760d.setGroupVisible(i10, z6);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z6) {
        this.f59760d.setQwertyMode(z6);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f59760d.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10) {
        return this.f59760d.addSubMenu(i10);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10) {
        return m774h(this.f59760d.add(i10));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        return this.f59760d.addSubMenu(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return m774h(this.f59760d.m20120a(i10, i11, i12, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return this.f59760d.addSubMenu(i10, i11, i12, i13);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, int i13) {
        return m774h(this.f59760d.add(i10, i11, i12, i13));
    }
}
