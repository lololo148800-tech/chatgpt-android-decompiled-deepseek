package p339Nf;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16558z;
import mm.C17296C;
import p017Af.C0468O;
import p040Bd.C0954L0;
import p040Bd.C0989R0;
import p040Bd.C1054b4;
import p040Bd.C1075e4;
import p049Bm.InterfaceC1436k;
import p246Ji.C4363c;
import p324Mn.C5521B;
import p537W0.C8410b;
import p909nm.AbstractC17681o;
import p911o0.AbstractC17792x;
import p936p0.C18265e;
import p936p0.C18280t;

/* JADX INFO: renamed from: Nf.u */
/* JADX INFO: loaded from: classes3.dex */
public final class C5739u extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ List f18675Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ List f18676Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ List f18677o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ String f18678p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ String f18679q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C5521B f18680r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C5521B f18681s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ InterfaceC1436k f18682t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ C18280t f18683u0;

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ Map f18684v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5739u(List list, List list2, List list3, String str, String str2, C5521B c5521b, C5521B c5521b2, InterfaceC1436k interfaceC1436k, C18280t c18280t, Map map) {
        super(1);
        this.f18675Y = list;
        this.f18676Z = list2;
        this.f18677o0 = list3;
        this.f18678p0 = str;
        this.f18679q0 = str2;
        this.f18680r0 = c5521b;
        this.f18681s0 = c5521b2;
        this.f18682t0 = interfaceC1436k;
        this.f18683u0 = c18280t;
        this.f18684v0 = map;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) throws Throwable {
        C18265e LazyColumn = (C18265e) obj;
        AbstractC16544l.m18094g(LazyColumn, "$this$LazyColumn");
        List list = this.f18675Y;
        Throwable th2 = null;
        if (!list.isEmpty()) {
            int i10 = 0;
            for (Object obj2 : list) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    AbstractC17681o.m19388q();
                    throw null;
                }
                AbstractC17792x.m19528k(LazyColumn, null, new C8410b(new C5737s(this.f18678p0, this.f18679q0, (C0954L0) obj2, this.f18680r0, this.f18681s0, this.f18682t0, i10, list, 0), true, 1841918344), 3);
                i10 = i11;
            }
        }
        C18280t c18280t = this.f18683u0;
        AbstractC17792x.m19542y(LazyColumn, "citations", new C8410b(new C0468O(c18280t, 15), true, 760723923));
        List list2 = this.f18676Z;
        if (list2.isEmpty()) {
            AbstractC17792x.m19528k(LazyColumn, null, AbstractC5720b.f18527a, 3);
        }
        List list3 = this.f18676Z;
        int i12 = 0;
        for (Object obj3 : list3) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                AbstractC17681o.m19388q();
                throw null;
            }
            AbstractC17792x.m19528k(LazyColumn, null, new C8410b(new C5737s(this.f18678p0, this.f18679q0, (C0989R0) obj3, this.f18680r0, this.f18681s0, this.f18682t0, i12, list3, 1), true, -2022674790), 3);
            i12 = i13;
        }
        AbstractC17792x.m19542y(LazyColumn, "sources", new C8410b(new C4363c(list2, c18280t, 1), true, -2038230532));
        List list4 = this.f18677o0;
        if (!(list4 instanceof Collection) || !list4.isEmpty()) {
            Iterator it = list4.iterator();
            do {
                if (!it.hasNext()) {
                    AbstractC17792x.m19528k(LazyColumn, null, AbstractC5720b.f18528b, 3);
                    break;
                }
            } while (((C1075e4) it.next()).f2928b.isEmpty());
        } else {
            AbstractC17792x.m19528k(LazyColumn, null, AbstractC5720b.f18528b, 3);
            break;
        }
        C16558z c16558z = new C16558z();
        List list5 = this.f18677o0;
        Iterator it2 = list5.iterator();
        int i14 = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i15 = i14 + 1;
            if (i14 < 0) {
                Throwable th3 = th2;
                AbstractC17681o.m19388q();
                throw th3;
            }
            C1075e4 c1075e4 = (C1075e4) next;
            int i16 = 0;
            for (Object obj4 : c1075e4.f2928b) {
                int i17 = i16 + 1;
                if (i16 < 0) {
                    Throwable th4 = th2;
                    AbstractC17681o.m19388q();
                    throw th4;
                }
                AbstractC17792x.m19528k(LazyColumn, null, new C8410b(new C5738t(this.f18678p0, this.f18679q0, (C1054b4) obj4, c1075e4, this.f18684v0, this.f18680r0, this.f18681s0, this.f18682t0, i14, i16, c16558z, this.f18676Z, list5), true, -1851028638), 3);
                th2 = null;
                i16 = i17;
                it2 = it2;
                i15 = i15;
            }
            i14 = i15;
        }
        return C17296C.f55119a;
    }
}
