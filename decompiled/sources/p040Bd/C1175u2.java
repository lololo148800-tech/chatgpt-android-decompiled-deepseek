package p040Bd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.u2 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1175u2 {
    public static final C1169t2 Companion = new C1169t2();

    /* JADX INFO: renamed from: a */
    public final String f3123a;

    /* JADX INFO: renamed from: b */
    public final String f3124b;

    /* JADX INFO: renamed from: c */
    public final String f3125c;

    /* JADX INFO: renamed from: d */
    public final String f3126d;

    public /* synthetic */ C1175u2(int i10, String str, String str2, String str3, String str4) {
        if (15 != (i10 & 15)) {
            AbstractC11153a0.m12389l(i10, 15, C1163s2.f3088a.getDescriptor());
            throw null;
        }
        this.f3123a = str;
        this.f3124b = str2;
        this.f3125c = str3;
        this.f3126d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1175u2)) {
            return false;
        }
        C1175u2 c1175u2 = (C1175u2) obj;
        return AbstractC16544l.m18089b(this.f3123a, c1175u2.f3123a) && AbstractC16544l.m18089b(this.f3124b, c1175u2.f3124b) && AbstractC16544l.m18089b(this.f3125c, c1175u2.f3125c) && AbstractC16544l.m18089b(this.f3126d, c1175u2.f3126d);
    }

    public final int hashCode() {
        String str = this.f3123a;
        int iM527p = AbstractC0168G.m527p((str == null ? 0 : str.hashCode()) * 31, 31, this.f3124b);
        String str2 = this.f3125c;
        int iHashCode = (iM527p + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f3126d;
        return iHashCode + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
