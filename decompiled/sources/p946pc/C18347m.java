package p946pc;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1095x1.AbstractC21068W;
import p1095x1.AbstractC21069X;
import p1095x1.InterfaceC21059M;
import p492U1.EnumC7546k;
import p571X9.AbstractC9101A4;

/* JADX INFO: renamed from: pc.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C18347m extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f58574Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ List f58575Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ List f58576o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC21059M f58577p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ float f58578q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ AbstractC21069X f58579r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18347m(int i10, List list, List list2, InterfaceC21059M interfaceC21059M, float f10, AbstractC21069X abstractC21069X) {
        super(1);
        this.f58574Y = i10;
        this.f58575Z = list;
        this.f58576o0 = list2;
        this.f58577p0 = interfaceC21059M;
        this.f58578q0 = f10;
        this.f58579r0 = abstractC21069X;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        AbstractC21068W layout = (AbstractC21068W) obj;
        AbstractC16544l.m18094g(layout, "$this$layout");
        int i10 = 0;
        for (int i11 = 0; i11 < this.f58574Y; i11++) {
            AbstractC21069X abstractC21069X = (AbstractC21069X) this.f58575Z.get(i11);
            AbstractC21069X abstractC21069X2 = (AbstractC21069X) this.f58576o0.get(i11);
            int iMax = Math.max(abstractC21069X.f66982Z, abstractC21069X2.f66982Z);
            float f10 = this.f58578q0;
            InterfaceC21059M interfaceC21059M = this.f58577p0;
            int iMo7866k0 = interfaceC21059M.mo7866k0(f10) + iMax;
            AbstractC21069X abstractC21069X3 = this.f58579r0;
            float f11 = 0 / 2.0f;
            float f12 = 1.0f;
            if (interfaceC21059M.getLayoutDirection() != EnumC7546k.f23904Y) {
                f12 = 1.0f * (-1);
            }
            float f13 = 1;
            long jM9631a = AbstractC9101A4.m9631a(Math.round((f12 + f13) * f11), Math.round((f13 - 1.0f) * f11));
            layout.m21545d(abstractC21069X, (int) (jM9631a >> 32), ((int) (jM9631a & 4294967295L)) + i10, 0.0f);
            layout.m21545d(abstractC21069X2, abstractC21069X3.f66981Y, i10, 0.0f);
            i10 += iMo7866k0;
        }
        return C17296C.f55119a;
    }
}
