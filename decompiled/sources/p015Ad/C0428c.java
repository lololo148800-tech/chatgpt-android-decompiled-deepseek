package p015Ad;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Ad.c */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C0428c {
    public static final C0427b Companion = new C0427b();

    /* JADX INFO: renamed from: a */
    public final String f1402a;

    /* JADX INFO: renamed from: b */
    public final String f1403b;

    /* JADX INFO: renamed from: c */
    public final String f1404c;

    /* JADX INFO: renamed from: d */
    public final String f1405d;

    public /* synthetic */ C0428c(int i10, String str, String str2, String str3, String str4) {
        if (15 != (i10 & 15)) {
            AbstractC11153a0.m12389l(i10, 15, C0426a.f1401a.getDescriptor());
            throw null;
        }
        this.f1402a = str;
        this.f1403b = str2;
        this.f1404c = str3;
        this.f1405d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0428c)) {
            return false;
        }
        C0428c c0428c = (C0428c) obj;
        return AbstractC16544l.m18089b(this.f1402a, c0428c.f1402a) && AbstractC16544l.m18089b(this.f1403b, c0428c.f1403b) && AbstractC16544l.m18089b(this.f1404c, c0428c.f1404c) && AbstractC16544l.m18089b(this.f1405d, c0428c.f1405d);
    }

    public final int hashCode() {
        return this.f1405d.hashCode() + AbstractC0168G.m527p(AbstractC0168G.m527p(this.f1402a.hashCode() * 31, 31, this.f1403b), 31, this.f1404c);
    }

    public final String toString() {
        return "█";
    }
}
