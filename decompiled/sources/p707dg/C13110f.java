package p707dg;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: dg.f */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C13110f {
    public static final C13109e Companion = new C13109e();

    /* JADX INFO: renamed from: a */
    public final String f41628a;

    /* JADX INFO: renamed from: b */
    public final String f41629b;

    /* JADX INFO: renamed from: c */
    public final String f41630c;

    public /* synthetic */ C13110f(int i10, String str, String str2, String str3) {
        if (7 != (i10 & 7)) {
            AbstractC11153a0.m12389l(i10, 7, C13108d.f41627a.getDescriptor());
            throw null;
        }
        this.f41628a = str;
        this.f41629b = str2;
        this.f41630c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13110f)) {
            return false;
        }
        C13110f c13110f = (C13110f) obj;
        return AbstractC16544l.m18089b(this.f41628a, c13110f.f41628a) && AbstractC16544l.m18089b(this.f41629b, c13110f.f41629b) && AbstractC16544l.m18089b(this.f41630c, c13110f.f41630c);
    }

    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p(this.f41628a.hashCode() * 31, 31, this.f41629b);
        String str = this.f41630c;
        return iM527p + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "█";
    }

    public C13110f(String verificationId, String verificationCode) {
        AbstractC16544l.m18094g(verificationId, "verificationId");
        AbstractC16544l.m18094g(verificationCode, "verificationCode");
        this.f41628a = verificationId;
        this.f41629b = verificationCode;
        this.f41630c = null;
    }
}
