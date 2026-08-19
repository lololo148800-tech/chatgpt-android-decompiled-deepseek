package p704dc;

import cc.C11699d;
import cc.InterfaceC11698c;
import java.util.concurrent.Executor;
import p001A.C0017I0;
import p013Ab.C0420b;
import p030B2.RunnableC0758g0;
import p1009s9.C19501d;
import p117Eb.C2392v;
import p501Ub.AbstractC7606h;
import p501Ub.C7602d;
import p501Ub.EnumC7610l;
import p571X9.AbstractC9185O4;
import p571X9.C9142H3;
import p571X9.C9173M4;
import p571X9.EnumC9357r3;
import p571X9.EnumC9369t3;
import p664bc.AbstractC11335b;

/* JADX INFO: renamed from: dc.a */
/* JADX INFO: loaded from: classes.dex */
public final class C13060a extends AbstractC11335b implements InterfaceC11698c {

    /* JADX INFO: renamed from: r0 */
    public final boolean f41489r0;

    /* JADX WARN: Illegal instructions before constructor call */
    public C13060a(C13065f c13065f, C7602d c7602d, C11699d c11699d) {
        Executor executor = (Executor) c7602d.f24036a.get();
        C9173M4 c9173m4M9746e = AbstractC9185O4.m9746e(true != AbstractC13066g.m14803b() ? "play-services-mlkit-face-detection" : "face-detection");
        super(c13065f, executor);
        boolean zM14803b = AbstractC13066g.m14803b();
        this.f41489r0 = zM14803b;
        C0017I0 c0017i0 = new C0017I0();
        c0017i0.f66o0 = zM14803b ? EnumC9357r3.TYPE_THICK : EnumC9357r3.TYPE_THIN;
        C2392v c2392v = new C2392v(21, false);
        c2392v.f7438p0 = AbstractC13066g.m14802a(c11699d);
        c0017i0.f67p0 = new C9142H3(c2392v);
        EnumC7610l.f24056Y.execute(new RunnableC0758g0(c9173m4M9746e, new C0420b(c0017i0, 1), EnumC9369t3.ON_DEVICE_FACE_CREATE, c9173m4M9746e.m9727c(), 3));
    }

    @Override // p1022t9.InterfaceC19825j
    /* JADX INFO: renamed from: a */
    public final C19501d[] mo7961a() {
        return this.f41489r0 ? AbstractC7606h.f24045a : new C19501d[]{AbstractC7606h.f24047c};
    }
}
