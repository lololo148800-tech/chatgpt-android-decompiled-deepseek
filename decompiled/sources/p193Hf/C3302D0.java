package p193Hf;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p040Bd.C1032Y1;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9393x3;
import p909nm.AbstractC17680n;
import ye.C21514c;

/* JADX INFO: renamed from: Hf.D0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3302D0 extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public static final C3302D0 f10064Z = new C3302D0(2, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C3302D0 f10065o0 = new C3302D0(2, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f10066Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3302D0(int i10, int i11) {
        super(i10);
        this.f10066Y = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10066Y) {
            case 0:
                List list = (List) obj;
                C1032Y1 value = (C1032Y1) obj2;
                AbstractC16544l.m18094g(list, "list");
                AbstractC16544l.m18094g(value, "value");
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (!AbstractC16544l.m18089b(((C1032Y1) obj3).f2850a, value.f2850a)) {
                        arrayList.add(obj3);
                    }
                }
                return AbstractC17680n.m19362l0(arrayList, value);
            default:
                String value2 = ((C21514c) obj2).f68131a;
                AbstractC16544l.m18094g((List) obj, "<anonymous parameter 0>");
                AbstractC16544l.m18094g(value2, "value");
                return AbstractC9393x3.m9974d(new C21514c(value2));
        }
    }
}
