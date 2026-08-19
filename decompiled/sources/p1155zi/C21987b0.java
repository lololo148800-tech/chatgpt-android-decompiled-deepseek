package p1155zi;

import ao.AbstractC11153a0;
import ao.C11158d;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: zi.b0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C21987b0 {
    public static final C21983a0 Companion = new C21983a0();

    /* JADX INFO: renamed from: g */
    public static final KSerializer[] f69608g = {null, null, null, new C11158d(EnumC21973X.Companion.serializer(), 0), null, null};

    /* JADX INFO: renamed from: a */
    public final String f69609a;

    /* JADX INFO: renamed from: b */
    public final String f69610b;

    /* JADX INFO: renamed from: c */
    public final String f69611c;

    /* JADX INFO: renamed from: d */
    public final List f69612d;

    /* JADX INFO: renamed from: e */
    public final String f69613e;

    /* JADX INFO: renamed from: f */
    public final Boolean f69614f;

    public /* synthetic */ C21987b0(int i10, String str, String str2, String str3, List list, String str4, Boolean bool) {
        if (15 != (i10 & 15)) {
            AbstractC11153a0.m12389l(i10, 15, C21979Z.f69578a.getDescriptor());
            throw null;
        }
        this.f69609a = str;
        this.f69610b = str2;
        this.f69611c = str3;
        this.f69612d = list;
        if ((i10 & 16) == 0) {
            this.f69613e = null;
        } else {
            this.f69613e = str4;
        }
        if ((i10 & 32) == 0) {
            this.f69614f = Boolean.TRUE;
        } else {
            this.f69614f = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21987b0)) {
            return false;
        }
        C21987b0 c21987b0 = (C21987b0) obj;
        return AbstractC16544l.m18089b(this.f69609a, c21987b0.f69609a) && AbstractC16544l.m18089b(this.f69610b, c21987b0.f69610b) && AbstractC16544l.m18089b(this.f69611c, c21987b0.f69611c) && AbstractC16544l.m18089b(this.f69612d, c21987b0.f69612d) && AbstractC16544l.m18089b(this.f69613e, c21987b0.f69613e) && AbstractC16544l.m18089b(this.f69614f, c21987b0.f69614f);
    }

    public final int hashCode() {
        int iHashCode = this.f69609a.hashCode() * 31;
        String str = this.f69610b;
        int iM527p = AbstractC0168G.m527p((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f69611c);
        List list = this.f69612d;
        int iHashCode2 = (iM527p + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.f69613e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f69614f;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }

    public C21987b0(String str, String str2, String str3, List list, String str4, Boolean bool, int i10) {
        str4 = (i10 & 16) != 0 ? null : str4;
        bool = (i10 & 32) != 0 ? Boolean.TRUE : bool;
        this.f69609a = str;
        this.f69610b = str2;
        this.f69611c = str3;
        this.f69612d = list;
        this.f69613e = str4;
        this.f69614f = bool;
    }
}
