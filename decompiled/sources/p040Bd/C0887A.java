package p040Bd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.A */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C0887A {
    public static final C1202z Companion = new C1202z();

    /* JADX INFO: renamed from: a */
    public final int f2610a;

    /* JADX INFO: renamed from: b */
    public final String f2611b;

    /* JADX INFO: renamed from: c */
    public final String f2612c;

    public C0887A(int i10) {
        this.f2610a = i10;
        this.f2611b = "1700";
        this.f2612c = "2200";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0887A)) {
            return false;
        }
        C0887A c0887a = (C0887A) obj;
        return this.f2610a == c0887a.f2610a && AbstractC16544l.m18089b(this.f2611b, c0887a.f2611b) && AbstractC16544l.m18089b(this.f2612c, c0887a.f2612c);
    }

    public final int hashCode() {
        return this.f2612c.hashCode() + AbstractC0168G.m527p(this.f2610a * 31, 31, this.f2611b);
    }

    public final String toString() {
        return "█";
    }

    public /* synthetic */ C0887A(String str, int i10, int i11, String str2) {
        if (7 != (i10 & 7)) {
            AbstractC11153a0.m12389l(i10, 7, C1196y.f3151a.getDescriptor());
            throw null;
        }
        this.f2610a = i11;
        this.f2611b = str;
        this.f2612c = str2;
    }
}
