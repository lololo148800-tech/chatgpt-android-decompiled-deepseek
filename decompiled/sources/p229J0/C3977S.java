package p229J0;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p025An.C0644w;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p102Dm.AbstractC2119a;
import p1095x1.AbstractC21068W;
import p1095x1.AbstractC21069X;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: J0.S */
/* JADX INFO: loaded from: classes.dex */
public final class C3977S extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ ArrayList f12456Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f12457Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ ArrayList f12458o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C3880A3 f12459p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC1426a f12460q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ int f12461r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ ArrayList f12462s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ ArrayList f12463t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ int f12464u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3977S(ArrayList arrayList, int i10, ArrayList arrayList2, C3880A3 c3880a3, InterfaceC1426a interfaceC1426a, int i11, ArrayList arrayList3, ArrayList arrayList4, int i12) {
        super(1);
        this.f12456Y = arrayList;
        this.f12457Z = i10;
        this.f12458o0 = arrayList2;
        this.f12459p0 = c3880a3;
        this.f12460q0 = interfaceC1426a;
        this.f12461r0 = i11;
        this.f12462s0 = arrayList3;
        this.f12463t0 = arrayList4;
        this.f12464u0 = i12;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        Integer numValueOf;
        Integer numValueOf2;
        int iM3195i;
        AbstractC21068W abstractC21068W = (AbstractC21068W) obj;
        ArrayList arrayList = this.f12456Y;
        Integer numValueOf3 = null;
        if (!arrayList.isEmpty()) {
            numValueOf = Integer.valueOf(((AbstractC21069X) arrayList.get(0)).f66981Y);
            int iM19381j = AbstractC17681o.m19381j(arrayList);
            if (1 <= iM19381j) {
                int i10 = 1;
                while (true) {
                    Integer numValueOf4 = Integer.valueOf(((AbstractC21069X) arrayList.get(i10)).f66981Y);
                    if (numValueOf4.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf4;
                    }
                    if (i10 == iM19381j) {
                        break;
                    }
                    i10++;
                }
            }
        } else {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        int i11 = this.f12457Z;
        int iMax = Math.max(0, (i11 - iIntValue) / 2);
        ArrayList arrayList2 = this.f12458o0;
        if (!arrayList2.isEmpty()) {
            numValueOf2 = Integer.valueOf(((AbstractC21069X) arrayList2.get(0)).f66981Y);
            int iM19381j2 = AbstractC17681o.m19381j(arrayList2);
            if (1 <= iM19381j2) {
                int i12 = 1;
                while (true) {
                    Integer numValueOf5 = Integer.valueOf(((AbstractC21069X) arrayList2.get(i12)).f66981Y);
                    if (numValueOf5.compareTo(numValueOf2) > 0) {
                        numValueOf2 = numValueOf5;
                    }
                    if (i12 == iM19381j2) {
                        break;
                    }
                    i12++;
                }
            }
        } else {
            numValueOf2 = null;
        }
        int iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : 0;
        if (!arrayList2.isEmpty()) {
            numValueOf3 = Integer.valueOf(((AbstractC21069X) arrayList2.get(0)).f66982Z);
            int iM19381j3 = AbstractC17681o.m19381j(arrayList2);
            if (1 <= iM19381j3) {
                int i13 = 1;
                while (true) {
                    Integer numValueOf6 = Integer.valueOf(((AbstractC21069X) arrayList2.get(i13)).f66982Z);
                    if (numValueOf6.compareTo(numValueOf3) > 0) {
                        numValueOf3 = numValueOf6;
                    }
                    if (i13 == iM19381j3) {
                        break;
                    }
                    i13++;
                }
            }
        }
        int iIntValue3 = numValueOf3 != null ? numValueOf3.intValue() : 0;
        int i14 = (i11 - iIntValue2) / 2;
        int iOrdinal = this.f12459p0.m4602b().ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            iM3195i = this.f12461r0;
        } else {
            if (iOrdinal != 2) {
                throw new C0644w();
            }
            iM3195i = AbstractC2119a.m3195i(((Number) this.f12460q0.invoke()).floatValue());
        }
        int i15 = iM3195i - iIntValue3;
        ArrayList arrayList3 = this.f12462s0;
        int size = arrayList3.size();
        for (int i16 = 0; i16 < size; i16++) {
            abstractC21068W.m21546g((AbstractC21069X) arrayList3.get(i16), 0, this.f12464u0, 0.0f);
        }
        ArrayList arrayList4 = this.f12463t0;
        int size2 = arrayList4.size();
        for (int i17 = 0; i17 < size2; i17++) {
            abstractC21068W.m21546g((AbstractC21069X) arrayList4.get(i17), 0, 0, 0.0f);
        }
        int size3 = arrayList.size();
        for (int i18 = 0; i18 < size3; i18++) {
            abstractC21068W.m21546g((AbstractC21069X) arrayList.get(i18), iMax, 0, 0.0f);
        }
        int size4 = arrayList2.size();
        for (int i19 = 0; i19 < size4; i19++) {
            abstractC21068W.m21546g((AbstractC21069X) arrayList2.get(i19), i14, i15, 0.0f);
        }
        return C17296C.f55119a;
    }
}
