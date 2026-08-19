package p773h0;

import com.google.protobuf.AbstractC12107L1;
import fo.C13711h;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1140z1.C21660F;
import p544W9.AbstractC8443A;
import p604Yk.C10077b;
import p759g1.AbstractC13799a;
import p759g1.C13803e;
import p774h1.C14341T;
import p775h2.AbstractC14376f;
import p821j1.C16037b;
import p821j1.C16043h;

/* JADX INFO: renamed from: h0.s */
/* JADX INFO: loaded from: classes.dex */
public final class C14307s extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ boolean f44914Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C14341T f44915Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ long f44916o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ float f44917p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ float f44918q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ long f44919r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ long f44920s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ C16043h f44921t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14307s(boolean z6, C14341T c14341t, long j10, float f10, float f11, long j11, long j12, C16043h c16043h) {
        super(1);
        this.f44914Y = z6;
        this.f44915Z = c14341t;
        this.f44916o0 = j10;
        this.f44917p0 = f10;
        this.f44918q0 = f11;
        this.f44919r0 = j11;
        this.f44920s0 = j12;
        this.f44921t0 = c16043h;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C21660F c21660f = (C21660F) obj;
        c21660f.m22080a();
        if (this.f44914Y) {
            AbstractC14376f.m15851q(c21660f, this.f44915Z, 0L, 0L, this.f44916o0, null, 246);
        } else {
            long j10 = this.f44916o0;
            float fM15297b = AbstractC13799a.m15297b(j10);
            float f10 = this.f44917p0;
            if (fM15297b < f10) {
                float f11 = this.f44918q0;
                C16037b c16037b = c21660f.f68674Y;
                float fM15333e = C13803e.m15333e(c16037b.f49479Z.m15202x());
                float f12 = this.f44918q0;
                float f13 = fM15333e - f12;
                float fM15331c = C13803e.m15331c(c16037b.f49479Z.m15202x()) - f12;
                C14341T c14341t = this.f44915Z;
                long j11 = this.f44916o0;
                C13711h c13711h = c16037b.f49479Z;
                long jM15202x = c13711h.m15202x();
                c13711h.m15196m().mo15706e();
                try {
                    ((C10077b) c13711h.f43259Z).m10675z(f11, f11, f13, fM15331c, 0);
                    AbstractC14376f.m15851q(c21660f, c14341t, 0L, 0L, j11, null, 246);
                } finally {
                    AbstractC12107L1.m13830u(c13711h, jM15202x);
                }
            } else {
                AbstractC14376f.m15851q(c21660f, this.f44915Z, this.f44919r0, this.f44920s0, AbstractC8443A.m9047c(f10, j10), this.f44921t0, 208);
            }
        }
        return C17296C.f55119a;
    }
}
