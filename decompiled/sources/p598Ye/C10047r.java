package p598Ye;

import ao.AbstractC11153a0;
import ao.C11158d;
import bf.C11349D;
import bf.C11377e;
import bf.C11380h;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p1155zi.C22020j1;
import p245Jh.C4360r;
import p269Kh.C4699z;
import p559Wn.InterfaceC8975g;
import p775h2.AbstractC14376f;
import p909nm.AbstractC17682p;
import p909nm.C17689w;

/* JADX INFO: renamed from: Ye.r */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C10047r {
    public static final C10046q Companion = new C10046q();

    /* JADX INFO: renamed from: d */
    public static final KSerializer[] f29760d = {null, new C11158d(C10038i.f29740a, 0), null};

    /* JADX INFO: renamed from: a */
    public final C10044o f29761a;

    /* JADX INFO: renamed from: b */
    public final List f29762b;

    /* JADX INFO: renamed from: c */
    public final C4360r f29763c;

    public /* synthetic */ C10047r(int i10, C10044o c10044o, List list, C4360r c4360r) {
        if (1 != (i10 & 1)) {
            AbstractC11153a0.m12389l(i10, 1, C10045p.f29759a.getDescriptor());
            throw null;
        }
        this.f29761a = c10044o;
        if ((i10 & 2) == 0) {
            this.f29762b = C17689w.f56480Y;
        } else {
            this.f29762b = list;
        }
        if ((i10 & 4) == 0) {
            this.f29763c = null;
        } else {
            this.f29763c = c4360r;
        }
    }

    /* JADX INFO: renamed from: a */
    public final C11349D m10653a() {
        C10044o c10044o = this.f29761a;
        String value = c10044o.f29749a;
        AbstractC16544l.m18094g(value, "value");
        C10037h c10037h = c10044o.f29750b;
        String str = c10037h.f29735b;
        C11380h c11380h = new C11380h(c10037h.f29737d, c10037h.f29736c);
        String str2 = c10044o.f29751c;
        if (str2 == null) {
            C22020j1.Companion.getClass();
            str2 = "gpt-4o-mini";
        }
        String str3 = str2;
        C10043n c10043n = c10044o.f29755g;
        C11349D c11349d = new C11349D(value, c10037h.f29734a, str, null, c10044o.f29752d, null, null, null, c11380h, str3, false, false, c10044o.f29754f, false, false, false, false, c10043n != null ? c10043n.f29747a : null, false, true, null, c10037h.f29738e, null, null, c10044o.f29757i, c10044o.f29758j, null, 325312744);
        C4360r c4360r = this.f29763c;
        C4699z c4699zM5167a = c4360r != null ? c4360r.m5167a() : null;
        List<C10040k> list = this.f29762b;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
        for (C10040k c10040k : list) {
            arrayList.add(new C11377e(c10040k.f29741a, c10040k.f29743c, c10040k.f29742b, c10040k.f29744d, c10040k.f29745e));
        }
        return C11349D.m12777a(c11349d, null, null, null, null, null, null, false, c4699zM5167a, arrayList, 251658239);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10047r)) {
            return false;
        }
        C10047r c10047r = (C10047r) obj;
        return AbstractC16544l.m18089b(this.f29761a, c10047r.f29761a) && AbstractC16544l.m18089b(this.f29762b, c10047r.f29762b) && AbstractC16544l.m18089b(this.f29763c, c10047r.f29763c);
    }

    public final int hashCode() {
        int iM15858x = AbstractC14376f.m15858x(this.f29762b, this.f29761a.hashCode() * 31, 31);
        C4360r c4360r = this.f29763c;
        return iM15858x + (c4360r == null ? 0 : c4360r.hashCode());
    }

    public final String toString() {
        return "█";
    }
}
