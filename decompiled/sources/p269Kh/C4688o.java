package p269Kh;

import ao.AbstractC11153a0;
import ao.C11158d;
import ao.C11181o0;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;
import p775h2.AbstractC14376f;
import p909nm.C17691y;

/* JADX INFO: renamed from: Kh.o */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C4688o {
    public static final C4687n Companion = new C4687n();

    /* JADX INFO: renamed from: i */
    public static final KSerializer[] f15251i = {null, null, null, null, new C11158d(C11181o0.f33827a, 0), null, new C11158d(EnumC4691r.Companion.serializer(), 2), null};

    /* JADX INFO: renamed from: a */
    public final String f15252a;

    /* JADX INFO: renamed from: b */
    public final String f15253b;

    /* JADX INFO: renamed from: c */
    public final String f15254c;

    /* JADX INFO: renamed from: d */
    public final String f15255d;

    /* JADX INFO: renamed from: e */
    public final List f15256e;

    /* JADX INFO: renamed from: f */
    public final Integer f15257f;

    /* JADX INFO: renamed from: g */
    public final Set f15258g;

    /* JADX INFO: renamed from: h */
    public final C4699z f15259h;

    public C4688o(String categoryName, String slug, String str, String str2, List tags, Integer num, Set enabledTools, C4699z c4699z) {
        AbstractC16544l.m18094g(categoryName, "categoryName");
        AbstractC16544l.m18094g(slug, "slug");
        AbstractC16544l.m18094g(tags, "tags");
        AbstractC16544l.m18094g(enabledTools, "enabledTools");
        this.f15252a = categoryName;
        this.f15253b = slug;
        this.f15254c = str;
        this.f15255d = str2;
        this.f15256e = tags;
        this.f15257f = num;
        this.f15258g = enabledTools;
        this.f15259h = c4699z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4688o)) {
            return false;
        }
        C4688o c4688o = (C4688o) obj;
        return AbstractC16544l.m18089b(this.f15252a, c4688o.f15252a) && AbstractC16544l.m18089b(this.f15253b, c4688o.f15253b) && AbstractC16544l.m18089b(this.f15254c, c4688o.f15254c) && AbstractC16544l.m18089b(this.f15255d, c4688o.f15255d) && AbstractC16544l.m18089b(this.f15256e, c4688o.f15256e) && AbstractC16544l.m18089b(this.f15257f, c4688o.f15257f) && AbstractC16544l.m18089b(this.f15258g, c4688o.f15258g) && AbstractC16544l.m18089b(this.f15259h, c4688o.f15259h);
    }

    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p(this.f15252a.hashCode() * 31, 31, this.f15253b);
        String str = this.f15254c;
        int iHashCode = (iM527p + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f15255d;
        int iM15858x = AbstractC14376f.m15858x(this.f15256e, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        Integer num = this.f15257f;
        int iHashCode2 = (this.f15258g.hashCode() + ((iM15858x + (num == null ? 0 : num.hashCode())) * 31)) * 31;
        C4699z c4699z = this.f15259h;
        return iHashCode2 + (c4699z != null ? c4699z.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }

    public C4688o(int i10, String str, String str2, String str3, String str4, List list, Integer num, Set set, C4699z c4699z) {
        if (31 != (i10 & 31)) {
            AbstractC11153a0.m12389l(i10, 31, C4686m.f15250a.getDescriptor());
            throw null;
        }
        this.f15252a = str;
        this.f15253b = str2;
        this.f15254c = str3;
        this.f15255d = str4;
        this.f15256e = list;
        if ((i10 & 32) == 0) {
            this.f15257f = null;
        } else {
            this.f15257f = num;
        }
        if ((i10 & 64) == 0) {
            this.f15258g = C17691y.f56482Y;
        } else {
            this.f15258g = set;
        }
        if ((i10 & 128) == 0) {
            this.f15259h = null;
        } else {
            this.f15259h = c4699z;
        }
    }

    public /* synthetic */ C4688o(String str, String str2, String str3, String str4, List list, Integer num, C4699z c4699z, int i10) {
        this(str, str2, str3, str4, list, (i10 & 32) != 0 ? null : num, C17691y.f56482Y, (i10 & 128) != 0 ? null : c4699z);
    }
}
