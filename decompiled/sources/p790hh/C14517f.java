package p790hh;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: hh.f */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C14517f {
    public static final C14516e Companion = new C14516e();

    /* JADX INFO: renamed from: a */
    public final String f45745a;

    /* JADX INFO: renamed from: b */
    public final String f45746b;

    /* JADX INFO: renamed from: c */
    public final String f45747c;

    /* JADX INFO: renamed from: d */
    public final String f45748d;

    /* JADX INFO: renamed from: e */
    public final String f45749e;

    /* JADX INFO: renamed from: f */
    public final int f45750f;

    public /* synthetic */ C14517f(int i10, String str, String str2, String str3, String str4, String str5, int i11) {
        if (57 != (i10 & 57)) {
            AbstractC11153a0.m12389l(i10, 57, C14515d.f45744a.getDescriptor());
            throw null;
        }
        this.f45745a = str;
        if ((i10 & 2) == 0) {
            this.f45746b = null;
        } else {
            this.f45746b = str2;
        }
        if ((i10 & 4) == 0) {
            this.f45747c = null;
        } else {
            this.f45747c = str3;
        }
        this.f45748d = str4;
        this.f45749e = str5;
        this.f45750f = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14517f)) {
            return false;
        }
        C14517f c14517f = (C14517f) obj;
        return AbstractC16544l.m18089b(this.f45745a, c14517f.f45745a) && AbstractC16544l.m18089b(this.f45746b, c14517f.f45746b) && AbstractC16544l.m18089b(this.f45747c, c14517f.f45747c) && AbstractC16544l.m18089b(this.f45748d, c14517f.f45748d) && AbstractC16544l.m18089b(this.f45749e, c14517f.f45749e) && this.f45750f == c14517f.f45750f;
    }

    public final int hashCode() {
        int iHashCode = this.f45745a.hashCode() * 31;
        String str = this.f45746b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f45747c;
        int iM527p = AbstractC0168G.m527p((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f45748d);
        String str3 = this.f45749e;
        return ((iM527p + (str3 != null ? str3.hashCode() : 0)) * 31) + this.f45750f;
    }

    public final String toString() {
        return "█";
    }
}
