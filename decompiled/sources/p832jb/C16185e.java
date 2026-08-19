package p832jb;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import p1036u9.InterfaceC20156b;
import p1061vb.C20512c;

/* JADX INFO: renamed from: jb.e */
/* JADX INFO: loaded from: classes.dex */
public final class C16185e implements InterfaceC20156b {

    /* JADX INFO: renamed from: a */
    public static final AtomicReference f50230a = new AtomicReference();

    @Override // p1036u9.InterfaceC20156b
    /* JADX INFO: renamed from: a */
    public final void mo17790a(boolean z6) {
        synchronized (C16187g.f50233j) {
            try {
                for (C16187g c16187g : new ArrayList(C16187g.f50234k.values())) {
                    if (c16187g.f50239e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it = c16187g.f50243i.iterator();
                        while (it.hasNext()) {
                            C16187g c16187g2 = ((C16184d) it.next()).f50229a;
                            if (z6) {
                                c16187g2.getClass();
                            } else {
                                ((C20512c) c16187g2.f50242h.get()).m21166c();
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
