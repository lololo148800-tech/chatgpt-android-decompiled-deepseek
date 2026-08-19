package p269Kh;

import ao.AbstractC11153a0;
import ao.C11158d;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p003A1.AbstractC0168G;
import p245Jh.C4343a;
import p559Wn.InterfaceC8975g;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: Kh.B */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C4673B {
    public static final C4685l Companion = new C4685l();

    /* JADX INFO: renamed from: e */
    public static final KSerializer[] f15217e = {new C11158d(C4681h.f15232a, 0), new C11158d(C4686m.f15250a, 0), null, new C11158d(C4343a.f14136a, 0)};

    /* JADX INFO: renamed from: a */
    public final List f15218a;

    /* JADX INFO: renamed from: b */
    public final List f15219b;

    /* JADX INFO: renamed from: c */
    public final String f15220c;

    /* JADX INFO: renamed from: d */
    public final List f15221d;

    public /* synthetic */ C4673B(int i10, List list, List list2, String str, List list3) {
        if (15 != (i10 & 15)) {
            AbstractC11153a0.m12389l(i10, 15, C4680g.f15231a.getDescriptor());
            throw null;
        }
        this.f15218a = list;
        this.f15219b = list2;
        this.f15220c = str;
        this.f15221d = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4673B)) {
            return false;
        }
        C4673B c4673b = (C4673B) obj;
        return AbstractC16544l.m18089b(this.f15218a, c4673b.f15218a) && AbstractC16544l.m18089b(this.f15219b, c4673b.f15219b) && AbstractC16544l.m18089b(this.f15220c, c4673b.f15220c) && AbstractC16544l.m18089b(this.f15221d, c4673b.f15221d);
    }

    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p(AbstractC14376f.m15858x(this.f15219b, this.f15218a.hashCode() * 31, 31), 31, this.f15220c);
        List list = this.f15221d;
        return iM527p + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "█";
    }

    public C4673B(ArrayList arrayList, ArrayList arrayList2, String remoteFallbackModelSlug, List list) {
        AbstractC16544l.m18094g(remoteFallbackModelSlug, "remoteFallbackModelSlug");
        this.f15218a = arrayList;
        this.f15219b = arrayList2;
        this.f15220c = remoteFallbackModelSlug;
        this.f15221d = list;
    }
}
