package bf;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: bf.z */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C11398z {
    public static final C11397y Companion = new C11397y();

    /* JADX INFO: renamed from: a */
    public final String f34425a;

    /* JADX INFO: renamed from: b */
    public final String f34426b;

    /* JADX INFO: renamed from: c */
    public final C11394v f34427c;

    /* JADX INFO: renamed from: d */
    public final String f34428d;

    public /* synthetic */ C11398z(int i10, String str, String str2, C11394v c11394v, String str3) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C11396x.f34424a.getDescriptor());
            throw null;
        }
        this.f34425a = str;
        this.f34426b = str2;
        if ((i10 & 4) == 0) {
            this.f34427c = null;
        } else {
            this.f34427c = c11394v;
        }
        if ((i10 & 8) == 0) {
            this.f34428d = null;
        } else {
            this.f34428d = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11398z)) {
            return false;
        }
        C11398z c11398z = (C11398z) obj;
        return AbstractC16544l.m18089b(this.f34425a, c11398z.f34425a) && AbstractC16544l.m18089b(this.f34426b, c11398z.f34426b) && AbstractC16544l.m18089b(this.f34427c, c11398z.f34427c) && AbstractC16544l.m18089b(this.f34428d, c11398z.f34428d);
    }

    public final int hashCode() {
        int iHashCode = this.f34425a.hashCode() * 31;
        String str = this.f34426b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C11394v c11394v = this.f34427c;
        int iHashCode3 = (iHashCode2 + (c11394v == null ? 0 : c11394v.f34420a.hashCode())) * 31;
        String str2 = this.f34428d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }

    public C11398z(String str, String str2, C11394v c11394v, String str3) {
        this.f34425a = str;
        this.f34426b = str2;
        this.f34427c = c11394v;
        this.f34428d = str3;
    }
}
