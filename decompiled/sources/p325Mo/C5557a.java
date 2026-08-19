package p325Mo;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: Mo.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C5557a extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C5557a f18010Z = new C5557a(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C5557a f18011o0 = new C5557a(1, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C5557a f18012p0 = new C5557a(1, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C5557a f18013q0 = new C5557a(1, 3);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f18014Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5557a(int i10, int i11) {
        super(i10);
        this.f18014Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f18014Y) {
            case 0:
                List it = (List) obj;
                AbstractC16544l.m18094g(it, "it");
                Iterator it2 = it.iterator();
                double dDoubleValue = 0.0d;
                while (it2.hasNext()) {
                    dDoubleValue += ((Number) it2.next()).doubleValue();
                }
                return Double.valueOf(dDoubleValue);
            case 1:
                List it3 = (List) obj;
                AbstractC16544l.m18094g(it3, "it");
                Iterator it4 = it3.iterator();
                if (!it4.hasNext()) {
                    return null;
                }
                double dDoubleValue2 = ((Number) it4.next()).doubleValue();
                while (it4.hasNext()) {
                    dDoubleValue2 = Math.max(dDoubleValue2, ((Number) it4.next()).doubleValue());
                }
                return Double.valueOf(dDoubleValue2);
            case 2:
                List it5 = (List) obj;
                AbstractC16544l.m18094g(it5, "it");
                Iterator it6 = it5.iterator();
                if (!it6.hasNext()) {
                    return null;
                }
                double dDoubleValue3 = ((Number) it6.next()).doubleValue();
                while (it6.hasNext()) {
                    dDoubleValue3 = Math.min(dDoubleValue3, ((Number) it6.next()).doubleValue());
                }
                return Double.valueOf(dDoubleValue3);
            default:
                List it7 = (List) obj;
                AbstractC16544l.m18094g(it7, "it");
                Iterator it8 = it7.iterator();
                if (!it8.hasNext()) {
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                }
                Object next = it8.next();
                while (it8.hasNext()) {
                    next = Double.valueOf(((Number) next).doubleValue() * ((Number) it8.next()).doubleValue());
                }
                return (Double) next;
        }
    }
}
