package p229J0;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1095x1.AbstractC21068W;
import p1095x1.AbstractC21069X;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21059M;
import p492U1.EnumC7546k;
import p758g0.C13756d;
import p911o0.AbstractC17758g;
import p911o0.AbstractC17780r;
import p911o0.C17775o0;
import p911o0.C17782s;
import p911o0.C17790w;

/* JADX INFO: renamed from: J0.h3 */
/* JADX INFO: loaded from: classes.dex */
public final class C4063h3 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f12901Y = 0;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC21059M f12902Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f12903o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f12904p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f12905q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ Object f12906r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ Object f12907s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4063h3(ArrayList arrayList, InterfaceC21059M interfaceC21059M, C4069i3 c4069i3, int i10, ArrayList arrayList2, int i11) {
        super(1);
        this.f12905q0 = arrayList;
        this.f12902Z = interfaceC21059M;
        this.f12907s0 = c4069i3;
        this.f12903o0 = i10;
        this.f12906r0 = arrayList2;
        this.f12904p0 = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f12901Y) {
            case 0:
                AbstractC21068W abstractC21068W = (AbstractC21068W) obj;
                ArrayList arrayList = (ArrayList) this.f12905q0;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    int i11 = this.f12904p0;
                    if (i10 >= size) {
                        float f10 = C4075j3.f12985c;
                        InterfaceC21059M interfaceC21059M = this.f12902Z;
                        int iMo7866k0 = interfaceC21059M.mo7866k0(AbstractC4099n3.f13140a) + interfaceC21059M.mo7866k0(f10);
                        C13756d c13756d = ((C4069i3) this.f12907s0).f12945b;
                        int iIntValue = iMo7866k0 + (c13756d != null ? ((Number) c13756d.m15224e()).intValue() : this.f12903o0);
                        ArrayList arrayList2 = (ArrayList) this.f12906r0;
                        int size2 = arrayList2.size();
                        for (int i12 = 0; i12 < size2; i12++) {
                            AbstractC21069X abstractC21069X = (AbstractC21069X) arrayList2.get(i12);
                            abstractC21068W.m21545d(abstractC21069X, iIntValue, (i11 - abstractC21069X.f66982Z) / 2, 0.0f);
                        }
                    } else {
                        AbstractC21069X abstractC21069X2 = (AbstractC21069X) arrayList.get(i10);
                        abstractC21068W.m21545d(abstractC21069X2, 0, (i11 - abstractC21069X2.f66982Z) / 2, 0.0f);
                        i10++;
                    }
                    break;
                }
                break;
            case 1:
                AbstractC17780r.m19508b((AbstractC21068W) obj, (AbstractC21069X) this.f12905q0, (InterfaceC21056J) this.f12906r0, this.f12902Z.getLayoutDirection(), this.f12903o0, this.f12904p0, ((C17782s) this.f12907s0).f56759a);
                break;
            default:
                AbstractC21068W abstractC21068W2 = (AbstractC21068W) obj;
                AbstractC21069X[] abstractC21069XArr = (AbstractC21069X[]) this.f12905q0;
                int length = abstractC21069XArr.length;
                int i13 = 0;
                int i14 = 0;
                while (i13 < length) {
                    AbstractC21069X abstractC21069X3 = abstractC21069XArr[i13];
                    int i15 = i14 + 1;
                    AbstractC16544l.m18091d(abstractC21069X3);
                    C17775o0 c17775o0M19486h = AbstractC17758g.m19486h(abstractC21069X3);
                    EnumC7546k layoutDirection = this.f12902Z.getLayoutDirection();
                    C17790w c17790w = (C17790w) this.f12906r0;
                    c17790w.getClass();
                    AbstractC17758g abstractC17758g = c17775o0M19486h != null ? c17775o0M19486h.f56736c : null;
                    int i16 = this.f12903o0;
                    abstractC21068W2.m21545d(abstractC21069X3, abstractC17758g != null ? abstractC17758g.mo19456c(i16 - abstractC21069X3.f66981Y, layoutDirection, abstractC21069X3, this.f12904p0) : c17790w.f56772b.mo10924a(0, i16 - abstractC21069X3.f66981Y, layoutDirection), ((int[]) this.f12907s0)[i14], 0.0f);
                    i13++;
                    i14 = i15;
                }
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4063h3(AbstractC21069X abstractC21069X, InterfaceC21056J interfaceC21056J, InterfaceC21059M interfaceC21059M, int i10, int i11, C17782s c17782s) {
        super(1);
        this.f12905q0 = abstractC21069X;
        this.f12906r0 = interfaceC21056J;
        this.f12902Z = interfaceC21059M;
        this.f12903o0 = i10;
        this.f12904p0 = i11;
        this.f12907s0 = c17782s;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4063h3(AbstractC21069X[] abstractC21069XArr, C17790w c17790w, int i10, int i11, InterfaceC21059M interfaceC21059M, int[] iArr) {
        super(1);
        this.f12905q0 = abstractC21069XArr;
        this.f12906r0 = c17790w;
        this.f12903o0 = i10;
        this.f12904p0 = i11;
        this.f12902Z = interfaceC21059M;
        this.f12907s0 = iArr;
    }
}
