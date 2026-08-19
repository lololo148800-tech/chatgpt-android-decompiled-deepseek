package p544W9;

import android.view.View;
import android.view.Window;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p1155zi.C21891A;
import p219Ig.InterfaceC3717f;
import p772h.C14218I;

/* JADX INFO: renamed from: W9.x */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8736x {
    /* JADX INFO: renamed from: b */
    public static boolean m9469b(InterfaceC3717f interfaceC3717f) {
        List list = interfaceC3717f.mo4415a().f1655b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((C21891A) it.next()).m22329h()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo9471c(C14218I c14218i, C14218I c14218i2, Window window, View view, boolean z6, boolean z10);

    /* JADX INFO: renamed from: a */
    public void mo9470a(Window window) {
    }
}
