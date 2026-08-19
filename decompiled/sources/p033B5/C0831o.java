package p033B5;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p049Bm.InterfaceC1426a;
import p059C5.C1601s;
import p135F5.AbstractC2673i;
import p135F5.C2672h;
import p225Im.InterfaceC3756d;
import p283L5.C4944j;
import p354O5.C6134d;
import p420R5.C6812c;
import p445S5.C7021a;
import p496U5.AbstractC7566h;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: B5.o */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0831o implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f2312Y;

    public /* synthetic */ C0831o(int i10) {
        this.f2312Y = i10;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f2312Y) {
            case 0:
                return (C2672h) AbstractC2673i.f8211a.getValue();
            case 1:
                List listM19370t0 = AbstractC17680n.m19370t0((List) AbstractC7566h.f23968a.getValue(), new C0842z(0));
                ArrayList arrayList = new ArrayList();
                int size = listM19370t0.size();
                for (int i10 = 0; i10 < size; i10++) {
                    C6134d c6134d = (C6134d) listM19370t0.get(i10);
                    AbstractC16544l.m18092e(c6134d, "null cannot be cast to non-null type coil3.util.FetcherServiceLoaderTarget<kotlin.Any>");
                    c6134d.getClass();
                    C4944j c4944j = new C4944j(new C1601s(6));
                    InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C0816A.class);
                    C17309l c17309l = interfaceC3756dMo5693b != null ? new C17309l(c4944j, interfaceC3756dMo5693b) : null;
                    if (c17309l != null) {
                        arrayList.add(c17309l);
                    }
                }
                return arrayList;
            default:
                List listM19370t1 = AbstractC17680n.m19370t0((List) AbstractC7566h.f23969b.getValue(), new C0842z(1));
                ArrayList arrayList2 = new ArrayList();
                int size2 = listM19370t1.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    ((C7021a) listM19370t1.get(i11)).getClass();
                    arrayList2.add(new C6812c());
                }
                return arrayList2;
        }
    }
}
