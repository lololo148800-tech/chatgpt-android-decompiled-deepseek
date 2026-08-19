package p193Hf;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Hf.n */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C3385n extends AbstractC3409v {
    public static final C3382m Companion = new C3382m();

    /* JADX INFO: renamed from: a */
    public final String f10322a;

    /* JADX INFO: renamed from: b */
    public final String f10323b;

    /* JADX INFO: renamed from: c */
    public final String f10324c;

    /* JADX INFO: renamed from: d */
    public final String f10325d;

    public C3385n(int i10, String str, String str2, String str3, String str4) {
        if (15 != (i10 & 15)) {
            AbstractC11153a0.m12389l(i10, 15, C3379l.f10309a.getDescriptor());
            throw null;
        }
        this.f10322a = str;
        this.f10323b = str2;
        this.f10324c = str3;
        this.f10325d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3385n)) {
            return false;
        }
        C3385n c3385n = (C3385n) obj;
        return AbstractC16544l.m18089b(this.f10322a, c3385n.f10322a) && AbstractC16544l.m18089b(this.f10323b, c3385n.f10323b) && AbstractC16544l.m18089b(this.f10324c, c3385n.f10324c) && AbstractC16544l.m18089b(this.f10325d, c3385n.f10325d);
    }

    public final int hashCode() {
        return this.f10325d.hashCode() + AbstractC0168G.m527p(AbstractC0168G.m527p(this.f10322a.hashCode() * 31, 31, this.f10323b), 31, this.f10324c);
    }

    public final String toString() {
        return "█";
    }
}
