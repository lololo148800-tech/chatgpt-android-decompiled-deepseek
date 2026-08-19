package p736f0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1095x1.AbstractC21068W;
import p1095x1.AbstractC21069X;
import p1140z1.C21660F;
import p482Tg.C7448e;
import p492U1.C7543h;
import p571X9.AbstractC9101A4;
import p774h1.C14341T;
import p775h2.AbstractC14376f;
import p821j1.AbstractC16040e;

/* JADX INFO: renamed from: f0.A */
/* JADX INFO: loaded from: classes.dex */
public final class C13463A extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f42599Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ long f42600Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ long f42601o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f42602p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f42603q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13463A(Object obj, long j10, long j11, Object obj2, int i10) {
        super(1);
        this.f42599Y = i10;
        this.f42602p0 = obj;
        this.f42600Z = j10;
        this.f42601o0 = j11;
        this.f42603q0 = obj2;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f42599Y) {
            case 0:
                AbstractC21068W abstractC21068W = (AbstractC21068W) obj;
                long j10 = this.f42600Z;
                long j11 = this.f42601o0;
                C7448e c7448e = (C7448e) this.f42603q0;
                AbstractC21069X abstractC21069X = (AbstractC21069X) this.f42602p0;
                abstractC21068W.getClass();
                long jM9631a = AbstractC9101A4.m9631a(((int) (j10 >> 32)) + ((int) (j11 >> 32)), ((int) (j10 & 4294967295L)) + ((int) (j11 & 4294967295L)));
                AbstractC21068W.m21535a(abstractC21068W, abstractC21069X);
                abstractC21069X.mo21551N(C7543h.m7882d(jM9631a, abstractC21069X.f66985q0), 0.0f, c7448e);
                break;
            default:
                C21660F c21660f = (C21660F) obj;
                c21660f.m22080a();
                AbstractC14376f.m15849o(c21660f, (C14341T) this.f42602p0, this.f42600Z, this.f42601o0, 0.0f, (AbstractC16040e) this.f42603q0, 0, 104);
                break;
        }
        return C17296C.f55119a;
    }
}
