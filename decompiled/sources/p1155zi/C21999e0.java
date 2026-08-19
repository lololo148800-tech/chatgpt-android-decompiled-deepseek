package p1155zi;

import ao.AbstractC11153a0;
import ao.C11158d;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: zi.e0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C21999e0 {
    public static final C21995d0 Companion = new C21995d0();

    /* JADX INFO: renamed from: e */
    public static final KSerializer[] f69627e = {new C11158d(C22039o0.f69722a, 0), null, new C11158d(C21950P.f69510a, 0), null};

    /* JADX INFO: renamed from: a */
    public final List f69628a;

    /* JADX INFO: renamed from: b */
    public final C21987b0 f69629b;

    /* JADX INFO: renamed from: c */
    public final List f69630c;

    /* JADX INFO: renamed from: d */
    public final String f69631d;

    public /* synthetic */ C21999e0(int i10, List list, C21987b0 c21987b0, List list2, String str) {
        if (15 != (i10 & 15)) {
            AbstractC11153a0.m12389l(i10, 15, C21991c0.f69623a.getDescriptor());
            throw null;
        }
        this.f69628a = list;
        this.f69629b = c21987b0;
        this.f69630c = list2;
        this.f69631d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21999e0)) {
            return false;
        }
        C21999e0 c21999e0 = (C21999e0) obj;
        return AbstractC16544l.m18089b(this.f69628a, c21999e0.f69628a) && AbstractC16544l.m18089b(this.f69629b, c21999e0.f69629b) && AbstractC16544l.m18089b(this.f69630c, c21999e0.f69630c) && AbstractC16544l.m18089b(this.f69631d, c21999e0.f69631d);
    }

    public final int hashCode() {
        List list = this.f69628a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        C21987b0 c21987b0 = this.f69629b;
        int iM15858x = AbstractC14376f.m15858x(this.f69630c, (iHashCode + (c21987b0 == null ? 0 : c21987b0.hashCode())) * 31, 31);
        String str = this.f69631d;
        return iM15858x + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }

    public C21999e0(List list, C21987b0 c21987b0, List blockedFeatures, String str) {
        AbstractC16544l.m18094g(blockedFeatures, "blockedFeatures");
        this.f69628a = list;
        this.f69629b = c21987b0;
        this.f69630c = blockedFeatures;
        this.f69631d = str;
    }
}
