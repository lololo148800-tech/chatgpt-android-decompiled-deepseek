package p704dc;

import android.content.Context;
import cc.C11699d;
import p001A.C0036S0;
import p1009s9.C19503f;
import p165G9.C3020f;
import p228J.AbstractC3812N;
import p228J.C3827b0;
import p501Ub.C7604f;
import p571X9.AbstractC9185O4;
import p571X9.C9173M4;

/* JADX INFO: renamed from: dc.d */
/* JADX INFO: loaded from: classes.dex */
public final class C13063d extends AbstractC3812N {

    /* JADX INFO: renamed from: o0 */
    public final C7604f f41492o0;

    public C13063d(C7604f c7604f) {
        super(4, (byte) 0);
        this.f41492o0 = c7604f;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0031  */
    @Override // p228J.AbstractC3812N
    /* JADX INFO: renamed from: s */
    public final Object mo4535s(Object obj) {
        InterfaceC13061b c0036s0;
        C11699d c11699d = (C11699d) obj;
        Context contextM7952b = this.f41492o0.m7952b();
        C9173M4 c9173m4M9746e = AbstractC9185O4.m9746e(true != AbstractC13066g.m14803b() ? "play-services-mlkit-face-detection" : "face-detection");
        if (C3020f.m3865a(contextM7952b, "com.google.mlkit.dynamite.face") > 0) {
            c0036s0 = new C0036S0(contextM7952b, c11699d, c9173m4M9746e);
        } else {
            C19503f.f61952b.getClass();
            if (C19503f.m20600a(contextM7952b) >= 204500000) {
                c0036s0 = new C0036S0(contextM7952b, c11699d, c9173m4M9746e);
            } else {
                C3827b0 c3827b0 = new C3827b0();
                c3827b0.f11589o0 = contextM7952b;
                c3827b0.f11590p0 = c11699d;
                C19503f.f61952b.getClass();
                c3827b0.f11588Z = C19503f.m20600a(contextM7952b);
                c3827b0.f11591q0 = c9173m4M9746e;
                c0036s0 = c3827b0;
            }
        }
        return new C13065f(AbstractC9185O4.m9746e(true != AbstractC13066g.m14803b() ? "play-services-mlkit-face-detection" : "face-detection"), c11699d, c0036s0);
    }
}
