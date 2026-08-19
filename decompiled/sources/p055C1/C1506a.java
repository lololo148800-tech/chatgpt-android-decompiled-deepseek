package p055C1;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1426a;
import p615Z6.C10252z0;
import p759g1.C13801c;

/* JADX INFO: renamed from: C1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1506a extends ActionMode.Callback2 {

    /* JADX INFO: renamed from: a */
    public final C10252z0 f4020a;

    public C1506a(C10252z0 c10252z0) {
        this.f4020a = c10252z0;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        C10252z0 c10252z0 = this.f4020a;
        c10252z0.getClass();
        AbstractC16544l.m18091d(menuItem);
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            InterfaceC1426a interfaceC1426a = (InterfaceC1426a) c10252z0.f30456o0;
            if (interfaceC1426a != null) {
                interfaceC1426a.invoke();
            }
        } else if (itemId == 1) {
            InterfaceC1426a interfaceC1426a2 = (InterfaceC1426a) c10252z0.f30457p0;
            if (interfaceC1426a2 != null) {
                interfaceC1426a2.invoke();
            }
        } else if (itemId == 2) {
            InterfaceC1426a interfaceC1426a3 = (InterfaceC1426a) c10252z0.f30458q0;
            if (interfaceC1426a3 != null) {
                interfaceC1426a3.invoke();
            }
        } else {
            if (itemId != 3) {
                return false;
            }
            InterfaceC1426a interfaceC1426a4 = (InterfaceC1426a) c10252z0.f30459r0;
            if (interfaceC1426a4 != null) {
                interfaceC1426a4.invoke();
            }
        }
        if (actionMode == null) {
            return true;
        }
        actionMode.finish();
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        C10252z0 c10252z0 = this.f4020a;
        c10252z0.getClass();
        if (menu == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null menu");
        }
        if (actionMode == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null mode");
        }
        if (((InterfaceC1426a) c10252z0.f30456o0) != null) {
            C10252z0.m10806c(1, menu);
        }
        if (((InterfaceC1426a) c10252z0.f30457p0) != null) {
            C10252z0.m10806c(2, menu);
        }
        if (((InterfaceC1426a) c10252z0.f30458q0) != null) {
            C10252z0.m10806c(3, menu);
        }
        if (((InterfaceC1426a) c10252z0.f30459r0) != null) {
            C10252z0.m10806c(4, menu);
        }
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        InterfaceC1426a interfaceC1426a = (InterfaceC1426a) this.f4020a.f30454Y;
        if (interfaceC1426a != null) {
            interfaceC1426a.invoke();
        }
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        C13801c c13801c = (C13801c) this.f4020a.f30455Z;
        if (rect != null) {
            rect.set((int) c13801c.f43586a, (int) c13801c.f43587b, (int) c13801c.f43588c, (int) c13801c.f43589d);
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        C10252z0 c10252z0 = this.f4020a;
        c10252z0.getClass();
        if (actionMode == null || menu == null) {
            return false;
        }
        C10252z0.m10807e(menu, 1, (InterfaceC1426a) c10252z0.f30456o0);
        C10252z0.m10807e(menu, 2, (InterfaceC1426a) c10252z0.f30457p0);
        C10252z0.m10807e(menu, 3, (InterfaceC1426a) c10252z0.f30458q0);
        C10252z0.m10807e(menu, 4, (InterfaceC1426a) c10252z0.f30459r0);
        return true;
    }
}
