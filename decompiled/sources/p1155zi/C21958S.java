package p1155zi;

import ao.AbstractC11153a0;
import ao.C11158d;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: zi.S */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C21958S {
    public static final C21953Q Companion = new C21953Q();

    /* JADX INFO: renamed from: g */
    public static final KSerializer[] f69518g = {EnumC21964U.Companion.serializer(), null, null, null, null, new C11158d(EnumC21973X.Companion.serializer(), 0)};

    /* JADX INFO: renamed from: a */
    public final EnumC21964U f69519a;

    /* JADX INFO: renamed from: b */
    public final String f69520b;

    /* JADX INFO: renamed from: c */
    public final String f69521c;

    /* JADX INFO: renamed from: d */
    public final String f69522d;

    /* JADX INFO: renamed from: e */
    public final String f69523e;

    /* JADX INFO: renamed from: f */
    public final List f69524f;

    public /* synthetic */ C21958S(int i10, EnumC21964U enumC21964U, String str, String str2, String str3, String str4, List list) {
        if (63 != (i10 & 63)) {
            AbstractC11153a0.m12389l(i10, 63, C21950P.f69510a.getDescriptor());
            throw null;
        }
        this.f69519a = enumC21964U;
        this.f69520b = str;
        this.f69521c = str2;
        this.f69522d = str3;
        this.f69523e = str4;
        this.f69524f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21958S)) {
            return false;
        }
        C21958S c21958s = (C21958S) obj;
        return this.f69519a == c21958s.f69519a && AbstractC16544l.m18089b(this.f69520b, c21958s.f69520b) && AbstractC16544l.m18089b(this.f69521c, c21958s.f69521c) && AbstractC16544l.m18089b(this.f69522d, c21958s.f69522d) && AbstractC16544l.m18089b(this.f69523e, c21958s.f69523e) && AbstractC16544l.m18089b(this.f69524f, c21958s.f69524f);
    }

    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p(this.f69519a.hashCode() * 31, 31, this.f69520b);
        String str = this.f69521c;
        int iHashCode = (iM527p + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f69522d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f69523e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.f69524f;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
