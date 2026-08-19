package p130Eo;

import java.util.ArrayList;
import java.util.List;
import p027Ap.C0693a;
import p078Co.InterfaceC1760b;
import p523V9.AbstractC8038Z3;
import p571X9.AbstractC9393x3;
import p909nm.AbstractC17686t;

/* JADX INFO: renamed from: Eo.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C2620e implements InterfaceC1760b {

    /* JADX INFO: renamed from: a */
    public static final C2620e f8109a = new C2620e();

    @Override // p078Co.InterfaceC1760b
    /* JADX INFO: renamed from: d */
    public final Object mo2570d(Object obj, Object obj2) {
        C0693a c0693aM8396e = AbstractC8038Z3.m8396e(obj);
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : c0693aM8396e.f2015Y) {
            AbstractC17686t.m19398v(obj3 instanceof List ? (List) obj3 : AbstractC9393x3.m9974d(obj3), arrayList);
        }
        return arrayList;
    }
}
