package p1044uj;

import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1087wj.AbstractC20994o;
import p1087wj.C20991l;
import p1087wj.C20993n;
import p729ej.C13430u;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: uj.p0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C20355p0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f64356Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractC20994o f64357Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20355p0(AbstractC20994o abstractC20994o, int i10) {
        super(1);
        this.f64356Y = i10;
        this.f64357Z = abstractC20994o;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        EnumC20335f0 enumC20335f0;
        switch (this.f64356Y) {
            case 0:
                C13430u action = (C13430u) obj;
                AbstractC16544l.m18094g(action, "$this$action");
                List<Parcelable> listMo21035g = ((AbstractC20337g0) action.f42521b).mo21035g();
                ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(listMo21035g, 10));
                for (Parcelable parcelable : listMo21035g) {
                    C20993n c20993n = (C20993n) this.f64357Z;
                    if (AbstractC16544l.m18089b(parcelable, c20993n.f66825a)) {
                        parcelable = c20993n.f66826b;
                    }
                    arrayList.add(parcelable);
                }
                if (arrayList.isEmpty()) {
                    enumC20335f0 = EnumC20335f0.f64299p0;
                } else {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            enumC20335f0 = EnumC20335f0.f64299p0;
                        } else if (((AbstractC20340i) it.next()) instanceof C20336g) {
                            enumC20335f0 = EnumC20335f0.f64297Z;
                        }
                    }
                }
                action.f42521b = AbstractC20337g0.m21039c((AbstractC20337g0) action.f42521b, enumC20335f0, null, arrayList, null, 10);
                break;
            default:
                C13430u action2 = (C13430u) obj;
                AbstractC16544l.m18094g(action2, "$this$action");
                action2.m14964a(new C20319V(((C20991l) this.f64357Z).f66823a));
                break;
        }
        return C17296C.f55119a;
    }
}
