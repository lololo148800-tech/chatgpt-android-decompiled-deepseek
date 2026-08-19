package p946pc;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p102Dm.AbstractC2119a;
import p1095x1.AbstractC21068W;
import p1095x1.AbstractC21069X;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21083f0;
import p537W0.C8410b;
import p547Wc.C8805o;
import p571X9.AbstractC9388w4;
import p571X9.AbstractC9406z4;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: pc.K */
/* JADX INFO: loaded from: classes3.dex */
public final class C18326K extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ float f58497Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ ArrayList f58498Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC21083f0 f58499o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f58500p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f58501q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ ArrayList f58502r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ float f58503s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ InterfaceC1436k f58504t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18326K(float f10, ArrayList arrayList, InterfaceC21083f0 interfaceC21083f0, int i10, int i11, ArrayList arrayList2, float f11, InterfaceC1436k interfaceC1436k) {
        super(1);
        this.f58497Y = f10;
        this.f58498Z = arrayList;
        this.f58499o0 = interfaceC21083f0;
        this.f58500p0 = i10;
        this.f58501q0 = i11;
        this.f58502r0 = arrayList2;
        this.f58503s0 = f11;
        this.f58504t0 = interfaceC1436k;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        AbstractC21068W layout = (AbstractC21068W) obj;
        AbstractC16544l.m18094g(layout, "$this$layout");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        float f10 = this.f58497Y;
        float fFloatValue = f10;
        int i10 = 0;
        for (Object obj2 : this.f58498Z) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC17681o.m19388q();
                throw null;
            }
            float f11 = f10 / 2.0f;
            arrayList.add(Float.valueOf(fFloatValue - f11));
            float f12 = f10;
            for (AbstractC21069X abstractC21069X : (List) obj2) {
                if (i10 == 0) {
                    arrayList2.add(Float.valueOf(f12 - f11));
                }
                layout.m21545d(abstractC21069X, AbstractC2119a.m3195i(f12), AbstractC2119a.m3195i(fFloatValue), 0.0f);
                f12 += this.f58503s0 + f10;
            }
            if (i10 == 0) {
                arrayList2.add(Float.valueOf(f12 - f11));
            }
            fFloatValue += ((Number) this.f58502r0.get(i10)).floatValue() + f10;
            i10 = i11;
        }
        arrayList.add(Float.valueOf(fFloatValue - (f10 / 2.0f)));
        InterfaceC21056J interfaceC21056J = (InterfaceC21056J) AbstractC17680n.m19365o0(this.f58499o0.mo21503m0(Boolean.TRUE, new C8410b(new C8805o(this.f58504t0, 29, new C18331P(arrayList, arrayList2)), true, -1387549559)));
        int i12 = this.f58500p0;
        int i13 = this.f58501q0;
        if (i12 >= 0 && i13 >= 0) {
            layout.m21546g(interfaceC21056J.mo21533p(AbstractC9388w4.m9966i(i12, i12, i13, i13)), 0, 0, 0.0f);
            return C17296C.f55119a;
        }
        AbstractC9406z4.m9983b("width(" + i12 + ") and height(" + i13 + ") must be >= 0");
        throw null;
    }
}
