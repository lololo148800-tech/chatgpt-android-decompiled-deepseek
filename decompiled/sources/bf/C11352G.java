package bf;

import ao.AbstractC11153a0;
import ao.C11125B;
import ao.C11158d;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.C8972d;
import p559Wn.InterfaceC8975g;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: bf.G */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C11352G {
    public static final C11351F Companion = new C11351F();

    /* JADX INFO: renamed from: e */
    public static final KSerializer[] f34345e = {null, new C11158d(EnumC11347B.Companion.serializer(), 0), new C11158d(new C8972d(AbstractC16526C.f51263a.mo5693b(InterfaceC11353H.class), new Annotation[0]), 0), new C11158d(C11125B.f33744a, 0)};

    /* JADX INFO: renamed from: a */
    public final C11349D f34346a;

    /* JADX INFO: renamed from: b */
    public final List f34347b;

    /* JADX INFO: renamed from: c */
    public final List f34348c;

    /* JADX INFO: renamed from: d */
    public final List f34349d;

    public /* synthetic */ C11352G(int i10, C11349D c11349d, List list, List list2, List list3) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C11350E.f34344a.getDescriptor());
            throw null;
        }
        this.f34346a = c11349d;
        this.f34347b = list;
        if ((i10 & 4) == 0) {
            this.f34348c = null;
        } else {
            this.f34348c = list2;
        }
        if ((i10 & 8) == 0) {
            this.f34349d = null;
        } else {
            this.f34349d = list3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11352G)) {
            return false;
        }
        C11352G c11352g = (C11352G) obj;
        return AbstractC16544l.m18089b(this.f34346a, c11352g.f34346a) && AbstractC16544l.m18089b(this.f34347b, c11352g.f34347b) && AbstractC16544l.m18089b(this.f34348c, c11352g.f34348c) && AbstractC16544l.m18089b(this.f34349d, c11352g.f34349d);
    }

    public final int hashCode() {
        int iM15858x = AbstractC14376f.m15858x(this.f34347b, this.f34346a.hashCode() * 31, 31);
        List list = this.f34348c;
        int iHashCode = (iM15858x + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f34349d;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }

    public C11352G(C11349D c11349d, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.f34346a = c11349d;
        this.f34347b = arrayList;
        this.f34348c = arrayList2;
        this.f34349d = arrayList3;
    }
}
