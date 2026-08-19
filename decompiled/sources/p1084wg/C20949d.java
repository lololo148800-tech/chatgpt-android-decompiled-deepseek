package p1084wg;

import androidx.lifecycle.AbstractC11095d;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC11112u;
import com.withpersona.sdk2.inquiry.Inquiry;
import io.sentry.util.C15504i;
import kotlin.jvm.internal.AbstractC16544l;
import p103Dn.AbstractC2124C;
import p103Dn.C2153Q0;
import p1081wc.InterfaceC20904w;
import p195Hh.C3430e;
import p523V9.AbstractC8168p6;
import p841k.C16288h;
import p893n.AbstractActivityC17375g;
import vg.EnumC20615b;
import vg.InterfaceC20614a;

/* JADX INFO: renamed from: wg.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C20949d implements InterfaceC20614a, DefaultLifecycleObserver {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC20904w f66725Y;

    /* JADX INFO: renamed from: Z */
    public final C3430e f66726Z = AbstractC8168p6.m8749b("PersonaSanctionManager", null);

    /* JADX INFO: renamed from: o0 */
    public C16288h f66727o0;

    /* JADX INFO: renamed from: p0 */
    public final C2153Q0 f66728p0;

    /* JADX INFO: renamed from: q0 */
    public final C2153Q0 f66729q0;

    public C20949d(InterfaceC20904w interfaceC20904w) {
        this.f66725Y = interfaceC20904w;
        C2153Q0 c2153q0M3204c = AbstractC2124C.m3204c(EnumC20615b.f65422Y);
        this.f66728p0 = c2153q0M3204c;
        this.f66729q0 = c2153q0M3204c;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(InterfaceC11112u owner) {
        AbstractC16544l.m18094g(owner, "owner");
        AbstractActivityC17375g abstractActivityC17375g = owner instanceof AbstractActivityC17375g ? (AbstractActivityC17375g) owner : null;
        if (abstractActivityC17375g != null) {
            this.f66727o0 = (C16288h) abstractActivityC17375g.m11096m(new C15504i(this, 8), new Inquiry.Contract(abstractActivityC17375g));
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(InterfaceC11112u interfaceC11112u) {
        AbstractC11095d.m12154b(this, interfaceC11112u);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(InterfaceC11112u interfaceC11112u) {
        AbstractC11095d.m12155c(this, interfaceC11112u);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(InterfaceC11112u interfaceC11112u) {
        AbstractC11095d.m12156d(this, interfaceC11112u);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(InterfaceC11112u interfaceC11112u) {
        AbstractC11095d.m12157e(this, interfaceC11112u);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(InterfaceC11112u interfaceC11112u) {
        AbstractC11095d.m12158f(this, interfaceC11112u);
    }
}
