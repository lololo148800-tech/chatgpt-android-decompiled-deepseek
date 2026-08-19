package p040Bd;

import ao.AbstractC11153a0;
import ao.C11158d;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.AbstractC16643b;
import no.AbstractC17708b;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.W2 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1021W2 {
    public static final C1015V2 Companion = new C1015V2();

    /* JADX INFO: renamed from: g */
    public static final KSerializer[] f2829g = {null, null, null, null, new C11158d(C1163s2.f3088a, 0), new C11158d(C0926G2.f2672a, 0)};

    /* JADX INFO: renamed from: a */
    public final String f2830a;

    /* JADX INFO: renamed from: b */
    public final String f2831b;

    /* JADX INFO: renamed from: c */
    public final String f2832c;

    /* JADX INFO: renamed from: d */
    public final AbstractC16643b f2833d;

    /* JADX INFO: renamed from: e */
    public final List f2834e;

    /* JADX INFO: renamed from: f */
    public final List f2835f;

    public /* synthetic */ C1021W2(int i10, String str, String str2, String str3, AbstractC16643b abstractC16643b, List list, List list2) {
        if (4 != (i10 & 4)) {
            AbstractC11153a0.m12389l(i10, 4, C0920F2.f2658a.getDescriptor());
            throw null;
        }
        if ((i10 & 1) == 0) {
            this.f2830a = null;
        } else {
            this.f2830a = str;
        }
        if ((i10 & 2) == 0) {
            this.f2831b = null;
        } else {
            this.f2831b = str2;
        }
        this.f2832c = str3;
        if ((i10 & 8) == 0) {
            this.f2833d = null;
        } else {
            this.f2833d = abstractC16643b;
        }
        if ((i10 & 16) == 0) {
            this.f2834e = null;
        } else {
            this.f2834e = list;
        }
        if ((i10 & 32) == 0) {
            this.f2835f = AbstractC17708b.m19421m(new C1009U2[0]);
        } else {
            this.f2835f = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1021W2)) {
            return false;
        }
        C1021W2 c1021w2 = (C1021W2) obj;
        return AbstractC16544l.m18089b(this.f2830a, c1021w2.f2830a) && AbstractC16544l.m18089b(this.f2831b, c1021w2.f2831b) && AbstractC16544l.m18089b(this.f2832c, c1021w2.f2832c) && AbstractC16544l.m18089b(this.f2833d, c1021w2.f2833d) && AbstractC16544l.m18089b(this.f2834e, c1021w2.f2834e) && AbstractC16544l.m18089b(this.f2835f, c1021w2.f2835f);
    }

    public final int hashCode() {
        String str = this.f2830a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f2831b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f2832c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        AbstractC16643b abstractC16643b = this.f2833d;
        int iHashCode4 = (iHashCode3 + (abstractC16643b == null ? 0 : abstractC16643b.hashCode())) * 31;
        List list = this.f2834e;
        return this.f2835f.hashCode() + ((iHashCode4 + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "█";
    }
}
