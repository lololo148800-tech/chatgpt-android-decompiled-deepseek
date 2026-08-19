package p575Xd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Xd.s */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C9460s implements InterfaceC9461t {
    public static final C9459r Companion = new C9459r();

    /* JADX INFO: renamed from: a */
    public final String f28473a;

    /* JADX INFO: renamed from: b */
    public final String f28474b;

    /* JADX INFO: renamed from: c */
    public final String f28475c;

    /* JADX INFO: renamed from: d */
    public final String f28476d;

    /* JADX INFO: renamed from: e */
    public final String f28477e;

    public C9460s(int i10, String str, String str2, String str3, String str4, String str5) {
        if (16 != (i10 & 16)) {
            AbstractC11153a0.m12389l(i10, 16, C9458q.f28472a.getDescriptor());
            throw null;
        }
        if ((i10 & 1) == 0) {
            this.f28473a = null;
        } else {
            this.f28473a = str;
        }
        if ((i10 & 2) == 0) {
            this.f28474b = null;
        } else {
            this.f28474b = str2;
        }
        if ((i10 & 4) == 0) {
            this.f28475c = null;
        } else {
            this.f28475c = str3;
        }
        if ((i10 & 8) == 0) {
            this.f28476d = null;
        } else {
            this.f28476d = str4;
        }
        this.f28477e = str5;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0021  */
    /* JADX WARN: Code duplicated, block: B:31:0x004d  */
    public final boolean equals(Object obj) {
        boolean zM18089b;
        boolean zM18089b2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9460s)) {
            return false;
        }
        C9460s c9460s = (C9460s) obj;
        if (!AbstractC16544l.m18089b(this.f28473a, c9460s.f28473a)) {
            return false;
        }
        String str = this.f28474b;
        String str2 = c9460s.f28474b;
        if (str == null) {
            if (str2 == null) {
                zM18089b = true;
            } else {
                zM18089b = false;
            }
        } else if (str2 == null) {
            zM18089b = false;
        } else {
            zM18089b = AbstractC16544l.m18089b(str, str2);
        }
        if (!zM18089b || !AbstractC16544l.m18089b(this.f28475c, c9460s.f28475c) || !AbstractC16544l.m18089b(this.f28476d, c9460s.f28476d)) {
            return false;
        }
        String str3 = this.f28477e;
        String str4 = c9460s.f28477e;
        if (str3 == null) {
            if (str4 == null) {
                zM18089b2 = true;
            } else {
                zM18089b2 = false;
            }
        } else if (str4 == null) {
            zM18089b2 = false;
        } else {
            zM18089b2 = AbstractC16544l.m18089b(str3, str4);
        }
        return zM18089b2;
    }

    public final int hashCode() {
        String str = this.f28473a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f28474b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f28475c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f28476d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f28477e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }

    public C9460s(String str, String str2, String str3, String str4, String str5) {
        this.f28473a = str;
        this.f28474b = str2;
        this.f28475c = str3;
        this.f28476d = str4;
        this.f28477e = str5;
    }
}
