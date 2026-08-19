package p146Fg;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Fg.f */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C2737f {
    public static final C2736e Companion = new C2736e();

    /* JADX INFO: renamed from: a */
    public final String f8398a;

    /* JADX INFO: renamed from: b */
    public final int f8399b;

    /* JADX INFO: renamed from: c */
    public final String f8400c;

    /* JADX INFO: renamed from: d */
    public final String f8401d;

    /* JADX INFO: renamed from: e */
    public final String f8402e;

    public /* synthetic */ C2737f(int i10, String str, int i11, String str2, String str3, String str4) {
        if (31 != (i10 & 31)) {
            AbstractC11153a0.m12389l(i10, 31, C2735d.f8397a.getDescriptor());
            throw null;
        }
        this.f8398a = str;
        this.f8399b = i11;
        this.f8400c = str2;
        this.f8401d = str3;
        this.f8402e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2737f)) {
            return false;
        }
        C2737f c2737f = (C2737f) obj;
        return AbstractC16544l.m18089b(this.f8398a, c2737f.f8398a) && this.f8399b == c2737f.f8399b && AbstractC16544l.m18089b(this.f8400c, c2737f.f8400c) && AbstractC16544l.m18089b(this.f8401d, c2737f.f8401d) && AbstractC16544l.m18089b(this.f8402e, c2737f.f8402e);
    }

    public final int hashCode() {
        return this.f8402e.hashCode() + AbstractC0168G.m527p(AbstractC0168G.m527p(((this.f8398a.hashCode() * 31) + this.f8399b) * 31, 31, this.f8400c), 31, this.f8401d);
    }

    public final String toString() {
        return "█";
    }

    public C2737f(String userAgent, String str, String systemVersion) {
        AbstractC16544l.m18094g(userAgent, "userAgent");
        AbstractC16544l.m18094g(systemVersion, "systemVersion");
        this.f8398a = userAgent;
        this.f8399b = 2500706;
        this.f8400c = str;
        this.f8401d = "1.2025.007";
        this.f8402e = systemVersion;
    }
}
