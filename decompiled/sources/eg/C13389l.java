package eg;

import kotlin.jvm.internal.AbstractC16544l;
import p324Mn.C5551u;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: eg.l */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C13389l {
    public static final C13388k Companion = new C13388k();

    /* JADX INFO: renamed from: a */
    public final Boolean f42434a;

    /* JADX INFO: renamed from: b */
    public final String f42435b;

    /* JADX INFO: renamed from: c */
    public final C5551u f42436c;

    public /* synthetic */ C13389l(int i10, Boolean bool, String str, C5551u c5551u) {
        if ((i10 & 1) == 0) {
            this.f42434a = null;
        } else {
            this.f42434a = bool;
        }
        if ((i10 & 2) == 0) {
            this.f42435b = null;
        } else {
            this.f42435b = str;
        }
        if ((i10 & 4) == 0) {
            this.f42436c = null;
        } else {
            this.f42436c = c5551u;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13389l)) {
            return false;
        }
        C13389l c13389l = (C13389l) obj;
        return AbstractC16544l.m18089b(this.f42434a, c13389l.f42434a) && AbstractC16544l.m18089b(this.f42435b, c13389l.f42435b) && AbstractC16544l.m18089b(this.f42436c, c13389l.f42436c);
    }

    public final int hashCode() {
        Boolean bool = this.f42434a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.f42435b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C5551u c5551u = this.f42436c;
        return iHashCode2 + (c5551u != null ? c5551u.f18004Y.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
