package p991rh;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: rh.c */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C18994c {
    public static final C18993b Companion = new C18993b();

    /* JADX INFO: renamed from: e */
    public static final KSerializer[] f60570e = {EnumC18986A.Companion.serializer(), null, null, null};

    /* JADX INFO: renamed from: a */
    public final EnumC18986A f60571a;

    /* JADX INFO: renamed from: b */
    public final String f60572b;

    /* JADX INFO: renamed from: c */
    public final String f60573c;

    /* JADX INFO: renamed from: d */
    public final String f60574d;

    public /* synthetic */ C18994c(int i10, EnumC18986A enumC18986A, String str, String str2, String str3) {
        if (1 != (i10 & 1)) {
            AbstractC11153a0.m12389l(i10, 1, C18992a.f60569a.getDescriptor());
            throw null;
        }
        this.f60571a = enumC18986A;
        if ((i10 & 2) == 0) {
            this.f60572b = null;
        } else {
            this.f60572b = str;
        }
        if ((i10 & 4) == 0) {
            this.f60573c = null;
        } else {
            this.f60573c = str2;
        }
        if ((i10 & 8) == 0) {
            this.f60574d = null;
        } else {
            this.f60574d = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18994c)) {
            return false;
        }
        C18994c c18994c = (C18994c) obj;
        return this.f60571a == c18994c.f60571a && AbstractC16544l.m18089b(this.f60572b, c18994c.f60572b) && AbstractC16544l.m18089b(this.f60573c, c18994c.f60573c) && AbstractC16544l.m18089b(this.f60574d, c18994c.f60574d);
    }

    public final int hashCode() {
        int iHashCode = this.f60571a.hashCode() * 31;
        String str = this.f60572b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f60573c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f60574d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
