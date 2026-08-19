package p042Bf;

import bf.C11349D;
import bf.C11370Z;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p017Af.C0485p;
import p049Bm.InterfaceC1436k;
import p1025te.C19882m;
import p1105xc.C21173c;
import p1105xc.C21177g;
import p1105xc.C21179i;
import p1105xc.EnumC21180j;
import p1155zi.C21936L0;
import p537W0.C8410b;
import p552Wg.C8843e;
import p624Zg.C10370h;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p936p0.C18265e;
import td.C19841d;

/* JADX INFO: renamed from: Bf.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C1278t extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f3401Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ List f3402Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1278t(int i10, List list) {
        super(1);
        this.f3401Y = i10;
        this.f3402Z = list;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f3401Y) {
            case 0:
                this.f3402Z.get(((Number) obj).intValue());
                return null;
            case 1:
                this.f3402Z.get(((Number) obj).intValue());
                return null;
            case 2:
                this.f3402Z.get(((Number) obj).intValue());
                return null;
            case 3:
                this.f3402Z.get(((Number) obj).intValue());
                return null;
            case 4:
                C18265e LazyColumn = (C18265e) obj;
                AbstractC16544l.m18094g(LazyColumn, "$this$LazyColumn");
                List list = this.f3402Z;
                LazyColumn.m19803p(list.size(), null, new C1278t(3, list), new C8410b(new C0485p(list, 3), true, -1091073711));
                return C17296C.f55119a;
            case 5:
                this.f3402Z.get(((Number) obj).intValue());
                return null;
            case 6:
                return C8843e.f27076Z.invoke(this.f3402Z.get(((Number) obj).intValue()));
            case 7:
                this.f3402Z.get(((Number) obj).intValue());
                return null;
            case 8:
                C11370Z gizmos = (C11370Z) obj;
                AbstractC16544l.m18094g(gizmos, "gizmos");
                List list2 = gizmos.f34376b;
                int iM19257b = AbstractC17660E.m19257b(AbstractC17682p.m19389r(list2, 10));
                if (iM19257b < 16) {
                    iM19257b = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM19257b);
                for (Object obj2 : list2) {
                    linkedHashMap.put(new C21936L0(((C11349D) obj2).f34318a), obj2);
                }
                List list3 = this.f3402Z;
                int iM19257b2 = AbstractC17660E.m19257b(AbstractC17682p.m19389r(list3, 10));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM19257b2 >= 16 ? iM19257b2 : 16);
                for (Object obj3 : list3) {
                    linkedHashMap2.put(new C21936L0(((C11349D) obj3).f34318a), obj3);
                }
                return C11370Z.m12781a(gizmos, AbstractC17680n.m19322C0(AbstractC17659D.m19248j(linkedHashMap, linkedHashMap2).values()), null, 5);
            case 9:
                return C10370h.f30729Z.invoke(this.f3402Z.get(((Number) obj).intValue()));
            case 10:
                this.f3402Z.get(((Number) obj).intValue());
                return null;
            case 11:
                return C10370h.f30730o0.invoke(this.f3402Z.get(((Number) obj).intValue()));
            case 12:
                this.f3402Z.get(((Number) obj).intValue());
                return null;
            case 13:
                this.f3402Z.get(((Number) obj).intValue());
                return null;
            case 14:
                this.f3402Z.get(((Number) obj).intValue());
                return null;
            case 15:
                this.f3402Z.get(((Number) obj).intValue());
                return null;
            case 16:
                this.f3402Z.get(((Number) obj).intValue());
                return null;
            case 17:
                this.f3402Z.get(((Number) obj).intValue());
                return null;
            case 18:
                this.f3402Z.get(((Number) obj).intValue());
                return null;
            case 19:
                this.f3402Z.get(((Number) obj).intValue());
                return null;
            case 20:
                this.f3402Z.get(((Number) obj).intValue());
                return null;
            case 21:
                this.f3402Z.get(((Number) obj).intValue());
                return null;
            case 22:
                return C19841d.f62923o0.invoke(this.f3402Z.get(((Number) obj).intValue()));
            case 23:
                this.f3402Z.get(((Number) obj).intValue());
                return null;
            case 24:
                return C19882m.f63028Y.invoke(this.f3402Z.get(((Number) obj).intValue()));
            case 25:
                this.f3402Z.get(((Number) obj).intValue());
                return null;
            default:
                C21177g it = (C21177g) obj;
                AbstractC16544l.m18094g(it, "it");
                return new C21173c(EnumC21180j.f67323Z, "completion_request", this.f3402Z, 0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1278t(List list) {
        super(1);
        this.f3401Y = 26;
        C21179i c21179i = EnumC21180j.Companion;
        this.f3402Z = list;
    }
}
