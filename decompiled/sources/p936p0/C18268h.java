package p936p0;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1440o;
import p571X9.AbstractC9388w4;
import p909nm.C17690x;
import p953q0.C18558P;

/* JADX INFO: renamed from: p0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C18268h extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f58251Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C18558P f58252Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ long f58253o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f58254p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f58255q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18268h(C18558P c18558p, long j10, int i10, int i11, int i12) {
        super(3);
        this.f58251Y = i12;
        this.f58252Z = c18558p;
        this.f58253o0 = j10;
        this.f58254p0 = i10;
        this.f58255q0 = i11;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f58251Y) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                int iIntValue2 = ((Number) obj2).intValue();
                int i10 = iIntValue + this.f58254p0;
                long j10 = this.f58253o0;
                int iM9965h = AbstractC9388w4.m9965h(i10, j10);
                int iM9964g = AbstractC9388w4.m9964g(iIntValue2 + this.f58255q0, j10);
                C17690x c17690x = C17690x.f56481Y;
                return this.f58252Z.f59128Z.mo19936R(iM9965h, iM9964g, c17690x, (InterfaceC1436k) obj3);
            default:
                int iIntValue3 = ((Number) obj).intValue();
                int iIntValue4 = ((Number) obj2).intValue();
                int i11 = iIntValue3 + this.f58254p0;
                long j11 = this.f58253o0;
                int iM9965h2 = AbstractC9388w4.m9965h(i11, j11);
                int iM9964g2 = AbstractC9388w4.m9964g(iIntValue4 + this.f58255q0, j11);
                C17690x c17690x2 = C17690x.f56481Y;
                return this.f58252Z.f59128Z.mo19936R(iM9965h2, iM9964g2, c17690x2, (InterfaceC1436k) obj3);
        }
    }
}
