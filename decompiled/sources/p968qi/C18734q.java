package p968qi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p909nm.AbstractC17665J;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: qi.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C18734q extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f59591Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C18739v f59592Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1436k f59593o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f59594p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18734q(C18739v c18739v, InterfaceC1436k interfaceC1436k, int i10, int i11) {
        super(0);
        this.f59591Y = i11;
        this.f59592Z = c18739v;
        this.f59593o0 = interfaceC1436k;
        this.f59594p0 = i10;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        InterfaceC1436k interfaceC1436k;
        InterfaceC1436k interfaceC1436k2;
        switch (this.f59591Y) {
            case 0:
                C18739v c18739v = this.f59592Z;
                if (c18739v != null && (interfaceC1436k = this.f59593o0) != null) {
                    Set set = c18739v.f59612d;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = set.iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        int i10 = this.f59594p0;
                        if (zHasNext) {
                            Object next = it.next();
                            if (((int) (((C18726i) next).f59568a & 4294967295L)) != i10) {
                                arrayList.add(next);
                            }
                        } else {
                            Set setM19328G0 = AbstractC17680n.m19328G0(arrayList);
                            Integer numValueOf = Integer.valueOf(i10);
                            Set set2 = c18739v.f59610b;
                            interfaceC1436k.invoke(C18739v.m20045a(c18739v, set2.contains(numValueOf) ? AbstractC17665J.m19263c(set2, numValueOf) : AbstractC17665J.m19267g(set2, numValueOf), null, setM19328G0, 5));
                        }
                    }
                }
                break;
            default:
                C18739v c18739v2 = this.f59592Z;
                if (c18739v2 != null && (interfaceC1436k2 = this.f59593o0) != null) {
                    Set set3 = c18739v2.f59612d;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = set3.iterator();
                    while (true) {
                        boolean zHasNext2 = it2.hasNext();
                        int i11 = this.f59594p0;
                        if (zHasNext2) {
                            Object next2 = it2.next();
                            if (((int) (((C18726i) next2).f59568a >> 32)) != i11) {
                                arrayList2.add(next2);
                            }
                        } else {
                            Set setM19328G1 = AbstractC17680n.m19328G0(arrayList2);
                            Integer numValueOf2 = Integer.valueOf(i11);
                            Set set4 = c18739v2.f59611c;
                            interfaceC1436k2.invoke(C18739v.m20045a(c18739v2, null, set4.contains(numValueOf2) ? AbstractC17665J.m19263c(set4, numValueOf2) : AbstractC17665J.m19267g(set4, numValueOf2), setM19328G1, 3));
                        }
                    }
                }
                break;
        }
        return C17296C.f55119a;
    }
}
