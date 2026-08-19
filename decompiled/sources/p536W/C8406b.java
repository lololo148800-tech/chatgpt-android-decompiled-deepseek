package p536W;

import android.os.Build;
import androidx.lifecycle.EnumC11103l;
import androidx.lifecycle.EnumC11104m;
import androidx.lifecycle.InterfaceC11071G;
import androidx.lifecycle.InterfaceC11111t;
import androidx.lifecycle.InterfaceC11112u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p178H.AbstractC3174u0;
import p178H.InterfaceC3153k;
import p228J.InterfaceC3864u;
import p228J.InterfaceC3866v;
import p326N.C5565g;
import p817j$.util.DesugarCollections;

/* JADX INFO: renamed from: W.b */
/* JADX INFO: loaded from: classes.dex */
public final class C8406b implements InterfaceC11111t, InterfaceC3153k {

    /* JADX INFO: renamed from: Z */
    public final InterfaceC11112u f26134Z;

    /* JADX INFO: renamed from: o0 */
    public final C5565g f26135o0;

    /* JADX INFO: renamed from: Y */
    public final Object f26133Y = new Object();

    /* JADX INFO: renamed from: p0 */
    public boolean f26136p0 = false;

    public C8406b(InterfaceC11112u interfaceC11112u, C5565g c5565g) {
        this.f26134Z = interfaceC11112u;
        this.f26135o0 = c5565g;
        if (interfaceC11112u.mo7809i().mo7807b().compareTo(EnumC11104m.f33477p0) >= 0) {
            c5565g.m5966j();
        } else {
            c5565g.m5972v();
        }
        interfaceC11112u.mo7809i().mo7806a(this);
    }

    @Override // p178H.InterfaceC3153k
    /* JADX INFO: renamed from: a */
    public final InterfaceC3866v mo105a() {
        return this.f26135o0.f18037C0;
    }

    @Override // p178H.InterfaceC3153k
    /* JADX INFO: renamed from: c */
    public final InterfaceC3864u mo107c() {
        return this.f26135o0.f18036B0;
    }

    /* JADX INFO: renamed from: j */
    public final void m8948j(Collection collection) {
        synchronized (this.f26133Y) {
            this.f26135o0.m5965e(collection);
        }
    }

    /* JADX INFO: renamed from: k */
    public final InterfaceC11112u m8949k() {
        InterfaceC11112u interfaceC11112u;
        synchronized (this.f26133Y) {
            interfaceC11112u = this.f26134Z;
        }
        return interfaceC11112u;
    }

    /* JADX INFO: renamed from: l */
    public final List m8950l() {
        List listUnmodifiableList;
        synchronized (this.f26133Y) {
            listUnmodifiableList = DesugarCollections.unmodifiableList(this.f26135o0.m5956A());
        }
        return listUnmodifiableList;
    }

    @InterfaceC11071G(EnumC11103l.ON_DESTROY)
    public void onDestroy(InterfaceC11112u interfaceC11112u) {
        synchronized (this.f26133Y) {
            C5565g c5565g = this.f26135o0;
            c5565g.m5959E((ArrayList) c5565g.m5956A());
        }
    }

    @InterfaceC11071G(EnumC11103l.ON_PAUSE)
    public void onPause(InterfaceC11112u interfaceC11112u) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f26135o0.f18041Y.mo113i(false);
        }
    }

    @InterfaceC11071G(EnumC11103l.ON_RESUME)
    public void onResume(InterfaceC11112u interfaceC11112u) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f26135o0.f18041Y.mo113i(true);
        }
    }

    @InterfaceC11071G(EnumC11103l.ON_START)
    public void onStart(InterfaceC11112u interfaceC11112u) {
        synchronized (this.f26133Y) {
            try {
                if (!this.f26136p0) {
                    this.f26135o0.m5966j();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @InterfaceC11071G(EnumC11103l.ON_STOP)
    public void onStop(InterfaceC11112u interfaceC11112u) {
        synchronized (this.f26133Y) {
            try {
                if (!this.f26136p0) {
                    this.f26135o0.m5972v();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final boolean m8951s(AbstractC3174u0 abstractC3174u0) {
        boolean zContains;
        synchronized (this.f26133Y) {
            zContains = ((ArrayList) this.f26135o0.m5956A()).contains(abstractC3174u0);
        }
        return zContains;
    }

    /* JADX INFO: renamed from: t */
    public final void m8952t() {
        synchronized (this.f26133Y) {
            try {
                if (this.f26136p0) {
                    return;
                }
                onStop(this.f26134Z);
                this.f26136p0 = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m8953u() {
        synchronized (this.f26133Y) {
            C5565g c5565g = this.f26135o0;
            c5565g.m5959E((ArrayList) c5565g.m5956A());
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m8954v() {
        synchronized (this.f26133Y) {
            try {
                if (this.f26136p0) {
                    this.f26136p0 = false;
                    if (this.f26134Z.mo7809i().mo7807b().compareTo(EnumC11104m.f33477p0) >= 0) {
                        onStart(this.f26134Z);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
