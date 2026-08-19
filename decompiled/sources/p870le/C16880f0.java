package p870le;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p042Bf.C1278t;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p1082wd.C20909b;
import p269Kh.C4675b;
import p269Kh.C4676c;
import p269Kh.C4679f;
import p269Kh.C4688o;
import p537W0.C8410b;
import p547Wc.C8777V;
import p909nm.AbstractC17680n;
import p911o0.AbstractC17792x;
import p936p0.C18265e;

/* JADX INFO: renamed from: le.f0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C16880f0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C4676c f54175Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ List f54176Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f54177o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC1436k f54178p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C20909b f54179q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ InterfaceC1436k f54180r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ InterfaceC1426a f54181s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16880f0(C4676c c4676c, List list, List list2, InterfaceC1436k interfaceC1436k, C20909b c20909b, InterfaceC1436k interfaceC1436k2, InterfaceC1426a interfaceC1426a) {
        super(1);
        this.f54175Y = c4676c;
        this.f54176Z = list;
        this.f54177o0 = list2;
        this.f54178p0 = interfaceC1436k;
        this.f54179q0 = c20909b;
        this.f54180r0 = interfaceC1436k2;
        this.f54181s0 = interfaceC1426a;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C18265e LazyColumn = (C18265e) obj;
        AbstractC16544l.m18094g(LazyColumn, "$this$LazyColumn");
        C4676c c4676c = this.f54175Y;
        List list = c4676c.f15224a;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (!((C4679f) obj2).f15228a.f15248m) {
                arrayList.add(obj2);
            }
        }
        List listM19363m0 = AbstractC17680n.m19363m0(arrayList);
        List list2 = c4676c.f15224a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : list2) {
            if (((C4679f) obj3).f15228a.f15248m) {
                arrayList2.add(obj3);
            }
        }
        for (C4679f c4679f : AbstractC17680n.m19361k0(AbstractC17680n.m19363m0(arrayList2), listM19363m0)) {
            C4675b c4675b = C4676c.Companion;
            ?? r6 = this.f54177o0;
            c4675b.getClass();
            boolean zM5393a = C4675b.m5393a(c4679f, this.f54176Z, r6);
            if (c4679f.f15228a.f15248m) {
                AbstractC17792x.m19528k(LazyColumn, null, new C8410b(new C16878e0(c4679f, this.f54178p0, zM5393a, 0), true, 303235914), 3);
            } else {
                List list3 = c4679f.f15229b;
                int size = list3.size();
                C20909b c20909b = this.f54179q0;
                InterfaceC1436k interfaceC1436k = this.f54180r0;
                InterfaceC1426a interfaceC1426a = this.f54181s0;
                if (size > 1) {
                    LazyColumn.m19803p(list3.size(), null, new C1278t(20, list3), new C8410b(new C16874c0(list3, c20909b, interfaceC1436k, interfaceC1426a, zM5393a, 1), true, -632812321));
                } else {
                    C4688o c4688o = (C4688o) AbstractC17680n.m19343S(list3);
                    if (c4688o != null) {
                        AbstractC17792x.m19528k(LazyColumn, null, new C8410b(new C8777V(c4679f, c20909b, c4688o, interfaceC1436k, interfaceC1426a, zM5393a), true, 1051234209), 3);
                    }
                }
            }
        }
        return C17296C.f55119a;
    }
}
