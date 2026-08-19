package p040Bd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.b0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1050b0 {
    public static final C1043a0 Companion = new C1043a0();

    /* JADX INFO: renamed from: a */
    public final int f2874a;

    /* JADX INFO: renamed from: b */
    public final String f2875b;

    /* JADX INFO: renamed from: c */
    public final String f2876c;

    public /* synthetic */ C1050b0(String str, int i10, int i11, String str2) {
        if (7 != (i10 & 7)) {
            AbstractC11153a0.m12389l(i10, 7, C1036Z.f2863a.getDescriptor());
            throw null;
        }
        this.f2874a = i11;
        this.f2875b = str;
        this.f2876c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1050b0)) {
            return false;
        }
        C1050b0 c1050b0 = (C1050b0) obj;
        return this.f2874a == c1050b0.f2874a && AbstractC16544l.m18089b(this.f2875b, c1050b0.f2875b) && AbstractC16544l.m18089b(this.f2876c, c1050b0.f2876c);
    }

    public final int hashCode() {
        return this.f2876c.hashCode() + AbstractC0168G.m527p(this.f2874a * 31, 31, this.f2875b);
    }

    public final String toString() {
        return "█";
    }
}
