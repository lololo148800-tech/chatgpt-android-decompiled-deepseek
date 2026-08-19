package p229J0;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p030B2.C0781s;
import p049Bm.InterfaceC1436k;
import p1095x1.AbstractC21068W;
import p1095x1.AbstractC21069X;
import p1095x1.InterfaceC21083f0;
import p911o0.InterfaceC17716A0;

/* JADX INFO: renamed from: J0.a3 */
/* JADX INFO: loaded from: classes.dex */
public final class C4021a3 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ ArrayList f12610Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ ArrayList f12611Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ ArrayList f12612o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ ArrayList f12613p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C0781s f12614q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ int f12615r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ int f12616s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ InterfaceC17716A0 f12617t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ InterfaceC21083f0 f12618u0;

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ int f12619v0;

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ int f12620w0;

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ Integer f12621x0;

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ ArrayList f12622y0;

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ Integer f12623z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4021a3(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, C0781s c0781s, int i10, int i11, InterfaceC17716A0 interfaceC17716A0, InterfaceC21083f0 interfaceC21083f0, int i12, int i13, Integer num, ArrayList arrayList5, Integer num2) {
        super(1);
        this.f12610Y = arrayList;
        this.f12611Z = arrayList2;
        this.f12612o0 = arrayList3;
        this.f12613p0 = arrayList4;
        this.f12614q0 = c0781s;
        this.f12615r0 = i10;
        this.f12616s0 = i11;
        this.f12617t0 = interfaceC17716A0;
        this.f12618u0 = interfaceC21083f0;
        this.f12619v0 = i12;
        this.f12620w0 = i13;
        this.f12621x0 = num;
        this.f12622y0 = arrayList5;
        this.f12623z0 = num2;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        int i10;
        AbstractC21068W abstractC21068W = (AbstractC21068W) obj;
        ArrayList arrayList = this.f12610Y;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            abstractC21068W.m21545d((AbstractC21069X) arrayList.get(i11), 0, 0, 0.0f);
        }
        ArrayList arrayList2 = this.f12611Z;
        int size2 = arrayList2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            abstractC21068W.m21545d((AbstractC21069X) arrayList2.get(i12), 0, 0, 0.0f);
        }
        ArrayList arrayList3 = this.f12612o0;
        int size3 = arrayList3.size();
        int i13 = 0;
        while (true) {
            i10 = this.f12619v0;
            if (i13 >= size3) {
                break;
            }
            AbstractC21069X abstractC21069X = (AbstractC21069X) arrayList3.get(i13);
            int i14 = (this.f12615r0 - this.f12616s0) / 2;
            InterfaceC21083f0 interfaceC21083f0 = this.f12618u0;
            abstractC21068W.m21545d(abstractC21069X, this.f12617t0.mo5505a(interfaceC21083f0, interfaceC21083f0.getLayoutDirection()) + i14, i10 - this.f12620w0, 0.0f);
            i13++;
        }
        ArrayList arrayList4 = this.f12613p0;
        int size4 = arrayList4.size();
        for (int i15 = 0; i15 < size4; i15++) {
            AbstractC21069X abstractC21069X2 = (AbstractC21069X) arrayList4.get(i15);
            Integer num = this.f12621x0;
            abstractC21068W.m21545d(abstractC21069X2, 0, i10 - (num != null ? num.intValue() : 0), 0.0f);
        }
        C0781s c0781s = this.f12614q0;
        if (c0781s != null) {
            ArrayList arrayList5 = this.f12622y0;
            int size5 = arrayList5.size();
            for (int i16 = 0; i16 < size5; i16++) {
                AbstractC21069X abstractC21069X3 = (AbstractC21069X) arrayList5.get(i16);
                Integer num2 = this.f12623z0;
                AbstractC16544l.m18091d(num2);
                abstractC21068W.m21545d(abstractC21069X3, c0781s.f2192b, i10 - num2.intValue(), 0.0f);
            }
        }
        return C17296C.f55119a;
    }
}
