package p093Dd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Dd.f */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C2014f {
    public static final C2013e Companion = new C2013e();

    /* JADX INFO: renamed from: a */
    public final String f6173a;

    /* JADX INFO: renamed from: b */
    public final String f6174b;

    /* JADX INFO: renamed from: c */
    public final boolean f6175c;

    /* JADX INFO: renamed from: d */
    public final boolean f6176d;

    /* JADX INFO: renamed from: e */
    public final String f6177e;

    /* JADX INFO: renamed from: f */
    public final boolean f6178f;

    public /* synthetic */ C2014f(int i10, String str, String str2, boolean z6, boolean z10, String str3, boolean z11) {
        if (63 != (i10 & 63)) {
            AbstractC11153a0.m12389l(i10, 63, C2012d.f6172a.getDescriptor());
            throw null;
        }
        this.f6173a = str;
        this.f6174b = str2;
        this.f6175c = z6;
        this.f6176d = z10;
        this.f6177e = str3;
        this.f6178f = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2014f)) {
            return false;
        }
        C2014f c2014f = (C2014f) obj;
        return AbstractC16544l.m18089b(this.f6173a, c2014f.f6173a) && AbstractC16544l.m18089b(this.f6174b, c2014f.f6174b) && this.f6175c == c2014f.f6175c && this.f6176d == c2014f.f6176d && AbstractC16544l.m18089b(this.f6177e, c2014f.f6177e) && this.f6178f == c2014f.f6178f;
    }

    public final int hashCode() {
        int iM527p = (((AbstractC0168G.m527p(this.f6173a.hashCode() * 31, 31, this.f6174b) + (this.f6175c ? 1231 : 1237)) * 31) + (this.f6176d ? 1231 : 1237)) * 31;
        String str = this.f6177e;
        return ((iM527p + (str == null ? 0 : str.hashCode())) * 31) + (this.f6178f ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }
}
