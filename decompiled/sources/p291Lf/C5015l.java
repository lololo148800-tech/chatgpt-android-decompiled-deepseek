package p291Lf;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1095x1.AbstractC21068W;
import p1095x1.AbstractC21069X;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: Lf.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C5015l extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ ArrayList f16367Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f16368Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f16369o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f16370p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5015l(ArrayList arrayList, int i10, int i11, int i12) {
        super(1);
        this.f16367Y = arrayList;
        this.f16368Z = i10;
        this.f16369o0 = i11;
        this.f16370p0 = i12;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        AbstractC21068W layout = (AbstractC21068W) obj;
        AbstractC16544l.m18094g(layout, "$this$layout");
        ArrayList arrayList = this.f16367Y;
        int i10 = this.f16368Z;
        int i11 = 0;
        for (Object obj2 : AbstractC17680n.m19330H0(arrayList, i10, i10)) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                AbstractC17681o.m19388q();
                throw null;
            }
            int i13 = 0;
            for (Object obj3 : (List) obj2) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    AbstractC17681o.m19388q();
                    throw null;
                }
                int i15 = this.f16369o0 + this.f16370p0;
                layout.m21546g((AbstractC21069X) obj3, i13 * i15, i15 * i11, 0.0f);
                i13 = i14;
            }
            i11 = i12;
        }
        return C17296C.f55119a;
    }
}
