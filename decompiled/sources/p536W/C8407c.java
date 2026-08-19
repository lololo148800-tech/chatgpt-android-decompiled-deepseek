package p536W;

import androidx.lifecycle.EnumC11103l;
import androidx.lifecycle.InterfaceC11071G;
import androidx.lifecycle.InterfaceC11111t;
import androidx.lifecycle.InterfaceC11112u;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import p117Eb.C2392v;

/* JADX INFO: renamed from: W.c */
/* JADX INFO: loaded from: classes.dex */
public final class C8407c implements InterfaceC11111t {

    /* JADX INFO: renamed from: Y */
    public final C2392v f26137Y;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC11112u f26138Z;

    public C8407c(InterfaceC11112u interfaceC11112u, C2392v c2392v) {
        this.f26138Z = interfaceC11112u;
        this.f26137Y = c2392v;
    }

    @InterfaceC11071G(EnumC11103l.ON_DESTROY)
    public void onDestroy(InterfaceC11112u interfaceC11112u) {
        C2392v c2392v = this.f26137Y;
        synchronized (c2392v.f7436Z) {
            try {
                C8407c c8407cM3564v = c2392v.m3564v(interfaceC11112u);
                if (c8407cM3564v == null) {
                    return;
                }
                c2392v.m3539K(interfaceC11112u);
                Iterator it = ((Set) ((HashMap) c2392v.f7438p0).get(c8407cM3564v)).iterator();
                while (it.hasNext()) {
                    ((HashMap) c2392v.f7437o0).remove((C8405a) it.next());
                }
                ((HashMap) c2392v.f7438p0).remove(c8407cM3564v);
                c8407cM3564v.f26138Z.mo7809i().mo7808c(c8407cM3564v);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @InterfaceC11071G(EnumC11103l.ON_START)
    public void onStart(InterfaceC11112u interfaceC11112u) {
        this.f26137Y.m3537I(interfaceC11112u);
    }

    @InterfaceC11071G(EnumC11103l.ON_STOP)
    public void onStop(InterfaceC11112u interfaceC11112u) {
        this.f26137Y.m3539K(interfaceC11112u);
    }
}
