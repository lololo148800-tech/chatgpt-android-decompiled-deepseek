package p229J0;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p002A0.C0136m;
import p049Bm.InterfaceC1436k;
import p1095x1.AbstractC21068W;
import p1095x1.AbstractC21069X;
import p1095x1.InterfaceC21059M;
import p492U1.C7536a;
import p911o0.AbstractC17770m;
import p911o0.InterfaceC17760h;
import p911o0.InterfaceC17766k;

/* JADX INFO: renamed from: J0.z */
/* JADX INFO: loaded from: classes.dex */
public final class C4167z extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ AbstractC21069X f13540Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f13541Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractC21069X f13542o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC17760h f13543p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ long f13544q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ AbstractC21069X f13545r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ InterfaceC21059M f13546s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ InterfaceC17766k f13547t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ int f13548u0;

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ int f13549v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4167z(AbstractC21069X abstractC21069X, int i10, AbstractC21069X abstractC21069X2, InterfaceC17760h interfaceC17760h, long j10, AbstractC21069X abstractC21069X3, InterfaceC21059M interfaceC21059M, InterfaceC17766k interfaceC17766k, int i11, int i12) {
        super(1);
        this.f13540Y = abstractC21069X;
        this.f13541Z = i10;
        this.f13542o0 = abstractC21069X2;
        this.f13543p0 = interfaceC17760h;
        this.f13544q0 = j10;
        this.f13545r0 = abstractC21069X3;
        this.f13546s0 = interfaceC21059M;
        this.f13547t0 = interfaceC17766k;
        this.f13548u0 = i11;
        this.f13549v0 = i12;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        int iMax;
        int iM7854i;
        AbstractC21068W abstractC21068W = (AbstractC21068W) obj;
        AbstractC21069X abstractC21069X = this.f13540Y;
        int i10 = abstractC21069X.f66982Z;
        int i11 = this.f13541Z;
        int iMax2 = 0;
        abstractC21068W.m21546g(abstractC21069X, 0, (i11 - i10) / 2, 0.0f);
        C0136m c0136m = AbstractC17770m.f56728e;
        InterfaceC17760h interfaceC17760h = this.f13543p0;
        boolean zM18089b = AbstractC16544l.m18089b(interfaceC17760h, c0136m);
        AbstractC21069X abstractC21069X2 = this.f13542o0;
        AbstractC21069X abstractC21069X3 = this.f13545r0;
        long j10 = this.f13544q0;
        if (zM18089b) {
            int iM7854i2 = C7536a.m7854i(j10);
            int i12 = abstractC21069X2.f66981Y;
            iMax = (iM7854i2 - i12) / 2;
            int i13 = abstractC21069X.f66981Y;
            if (iMax < i13) {
                iM7854i = i13 - iMax;
            } else if (i12 + iMax > C7536a.m7854i(j10) - abstractC21069X3.f66981Y) {
                iM7854i = (C7536a.m7854i(j10) - abstractC21069X3.f66981Y) - (abstractC21069X2.f66981Y + iMax);
            }
            iMax += iM7854i;
        } else if (AbstractC16544l.m18089b(interfaceC17760h, AbstractC17770m.f56725b)) {
            iMax = (C7536a.m7854i(j10) - abstractC21069X2.f66981Y) - abstractC21069X3.f66981Y;
        } else {
            iMax = Math.max(this.f13546s0.mo7866k0(AbstractC3918H.f12044f), abstractC21069X.f66981Y);
        }
        InterfaceC17766k interfaceC17766k = this.f13547t0;
        if (AbstractC16544l.m18089b(interfaceC17766k, c0136m)) {
            iMax2 = (i11 - abstractC21069X2.f66982Z) / 2;
        } else if (AbstractC16544l.m18089b(interfaceC17766k, AbstractC17770m.f56727d)) {
            int i14 = this.f13548u0;
            if (i14 == 0) {
                iMax2 = i11 - abstractC21069X2.f66982Z;
            } else {
                int i15 = abstractC21069X2.f66982Z;
                int iM7853h = i14 - (i15 - this.f13549v0);
                int i16 = i15 + iM7853h;
                if (i16 > C7536a.m7853h(j10)) {
                    iM7853h -= i16 - C7536a.m7853h(j10);
                }
                iMax2 = (i11 - abstractC21069X2.f66982Z) - Math.max(0, iM7853h);
            }
        }
        abstractC21068W.m21546g(abstractC21069X2, iMax, iMax2, 0.0f);
        abstractC21068W.m21546g(abstractC21069X3, C7536a.m7854i(j10) - abstractC21069X3.f66981Y, (i11 - abstractC21069X3.f66982Z) / 2, 0.0f);
        return C17296C.f55119a;
    }
}
