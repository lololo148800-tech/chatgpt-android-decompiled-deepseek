package p1149zc;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: zc.F */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C21837F {
    public static final C21836E Companion = new C21836E();

    /* JADX INFO: renamed from: a */
    public final String f69298a;

    /* JADX INFO: renamed from: b */
    public final String f69299b;

    /* JADX INFO: renamed from: c */
    public final String f69300c;

    /* JADX INFO: renamed from: d */
    public final String f69301d;

    /* JADX INFO: renamed from: e */
    public final long f69302e;

    /* JADX INFO: renamed from: f */
    public final String f69303f;

    public /* synthetic */ C21837F(int i10, String str, String str2, String str3, String str4, long j10, String str5) {
        if (1 != (i10 & 1)) {
            AbstractC11153a0.m12389l(i10, 1, C21835D.f69297a.getDescriptor());
            throw null;
        }
        this.f69298a = str;
        if ((i10 & 2) == 0) {
            this.f69299b = "";
        } else {
            this.f69299b = str2;
        }
        if ((i10 & 4) == 0) {
            this.f69300c = "";
        } else {
            this.f69300c = str3;
        }
        if ((i10 & 8) == 0) {
            this.f69301d = null;
        } else {
            this.f69301d = str4;
        }
        if ((i10 & 16) == 0) {
            this.f69302e = Long.MAX_VALUE;
        } else {
            this.f69302e = j10;
        }
        if ((i10 & 32) == 0) {
            this.f69303f = null;
        } else {
            this.f69303f = str5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21837F)) {
            return false;
        }
        C21837F c21837f = (C21837F) obj;
        return AbstractC16544l.m18089b(this.f69298a, c21837f.f69298a) && AbstractC16544l.m18089b(this.f69299b, c21837f.f69299b) && AbstractC16544l.m18089b(this.f69300c, c21837f.f69300c) && AbstractC16544l.m18089b(this.f69301d, c21837f.f69301d) && this.f69302e == c21837f.f69302e && AbstractC16544l.m18089b(this.f69303f, c21837f.f69303f);
    }

    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p(AbstractC0168G.m527p(this.f69298a.hashCode() * 31, 31, this.f69299b), 31, this.f69300c);
        String str = this.f69301d;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j10 = this.f69302e;
        int i10 = (((iM527p + iHashCode) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        String str2 = this.f69303f;
        return i10 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }

    public C21837F(String accessToken, String idToken, String type, String str, long j10, String str2) {
        AbstractC16544l.m18094g(accessToken, "accessToken");
        AbstractC16544l.m18094g(idToken, "idToken");
        AbstractC16544l.m18094g(type, "type");
        this.f69298a = accessToken;
        this.f69299b = idToken;
        this.f69300c = type;
        this.f69301d = str;
        this.f69302e = j10;
        this.f69303f = str2;
    }
}
