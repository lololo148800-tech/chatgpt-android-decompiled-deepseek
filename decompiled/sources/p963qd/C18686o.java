package p963qd;

import bf.C11349D;
import bf.InterfaceC11374b0;
import kotlin.jvm.internal.AbstractC16544l;
import p098Di.InterfaceC2062k;
import p269Kh.C4688o;
import ve.C20584h;

/* JADX INFO: renamed from: qd.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C18686o implements InterfaceC2062k {

    /* JADX INFO: renamed from: a */
    public final String f59487a;

    /* JADX INFO: renamed from: b */
    public final C4688o f59488b;

    /* JADX INFO: renamed from: c */
    public final C11349D f59489c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC11374b0 f59490d;

    /* JADX INFO: renamed from: e */
    public final C20584h f59491e;

    /* JADX INFO: renamed from: f */
    public final boolean f59492f;

    /* JADX INFO: renamed from: g */
    public final boolean f59493g;

    /* JADX INFO: renamed from: h */
    public final C18687p f59494h;

    /* JADX INFO: renamed from: i */
    public final boolean f59495i;

    public C18686o(String str, C4688o c4688o, C11349D c11349d, InterfaceC11374b0 interfaceC11374b0, C20584h c20584h, boolean z6, boolean z10, C18687p c18687p, boolean z11) {
        this.f59487a = str;
        this.f59488b = c4688o;
        this.f59489c = c11349d;
        this.f59490d = interfaceC11374b0;
        this.f59491e = c20584h;
        this.f59492f = z6;
        this.f59493g = z10;
        this.f59494h = c18687p;
        this.f59495i = z11;
    }

    /* JADX INFO: renamed from: e */
    public static C18686o m20040e(C18686o c18686o, String str, C4688o c4688o, C11349D c11349d, InterfaceC11374b0 interfaceC11374b0, C20584h c20584h, boolean z6, C18687p c18687p, boolean z10, int i10) {
        String str2 = (i10 & 1) != 0 ? c18686o.f59487a : str;
        C4688o c4688o2 = (i10 & 2) != 0 ? c18686o.f59488b : c4688o;
        C11349D c11349d2 = (i10 & 4) != 0 ? c18686o.f59489c : c11349d;
        InterfaceC11374b0 interfaceC11374b1 = (i10 & 8) != 0 ? c18686o.f59490d : interfaceC11374b0;
        C20584h c20584h2 = (i10 & 16) != 0 ? c18686o.f59491e : c20584h;
        boolean z11 = (i10 & 32) != 0 ? c18686o.f59492f : z6;
        boolean z12 = c18686o.f59493g;
        C18687p c18687p2 = (i10 & 128) != 0 ? c18686o.f59494h : c18687p;
        boolean z13 = (i10 & 256) != 0 ? c18686o.f59495i : z10;
        c18686o.getClass();
        return new C18686o(str2, c4688o2, c11349d2, interfaceC11374b1, c20584h2, z11, z12, c18687p2, z13);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0016  */
    public final boolean equals(Object obj) {
        boolean zM18089b;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18686o)) {
            return false;
        }
        C18686o c18686o = (C18686o) obj;
        String str = c18686o.f59487a;
        String str2 = this.f59487a;
        if (str2 == null) {
            if (str == null) {
                zM18089b = true;
            } else {
                zM18089b = false;
            }
        } else if (str == null) {
            zM18089b = false;
        } else {
            zM18089b = AbstractC16544l.m18089b(str2, str);
        }
        return zM18089b && AbstractC16544l.m18089b(this.f59488b, c18686o.f59488b) && AbstractC16544l.m18089b(this.f59489c, c18686o.f59489c) && AbstractC16544l.m18089b(this.f59490d, c18686o.f59490d) && AbstractC16544l.m18089b(this.f59491e, c18686o.f59491e) && this.f59492f == c18686o.f59492f && this.f59493g == c18686o.f59493g && AbstractC16544l.m18089b(this.f59494h, c18686o.f59494h) && this.f59495i == c18686o.f59495i;
    }

    public final int hashCode() {
        String str = this.f59487a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        C4688o c4688o = this.f59488b;
        int iHashCode2 = (iHashCode + (c4688o == null ? 0 : c4688o.hashCode())) * 31;
        C11349D c11349d = this.f59489c;
        int iHashCode3 = (iHashCode2 + (c11349d == null ? 0 : c11349d.hashCode())) * 31;
        InterfaceC11374b0 interfaceC11374b0 = this.f59490d;
        int iHashCode4 = (iHashCode3 + (interfaceC11374b0 == null ? 0 : interfaceC11374b0.hashCode())) * 31;
        C20584h c20584h = this.f59491e;
        int iHashCode5 = (((((iHashCode4 + (c20584h == null ? 0 : c20584h.hashCode())) * 31) + (this.f59492f ? 1231 : 1237)) * 31) + (this.f59493g ? 1231 : 1237)) * 31;
        C18687p c18687p = this.f59494h;
        return ((iHashCode5 + (c18687p != null ? c18687p.hashCode() : 0)) * 31) + (this.f59495i ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }
}
