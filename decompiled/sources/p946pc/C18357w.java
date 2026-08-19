package p946pc;

import kotlin.jvm.internal.AbstractC16544l;
import p009A7.FlM.nkFZpTrMPpn;
import p049Bm.InterfaceC1436k;
import p291Lf.C5021r;
import p492U1.C7548m;

/* JADX INFO: renamed from: pc.w */
/* JADX INFO: loaded from: classes3.dex */
public final class C18357w {

    /* JADX INFO: renamed from: f */
    public static final C18357w f58611f = new C18357w(null, null, null, null, null);

    /* JADX INFO: renamed from: a */
    public final C7548m f58612a;

    /* JADX INFO: renamed from: b */
    public final C7548m f58613b;

    /* JADX INFO: renamed from: c */
    public final C7548m f58614c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC1436k f58615d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC1436k f58616e;

    public C18357w(C7548m c7548m, C7548m c7548m2, C7548m c7548m3, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2) {
        this.f58612a = c7548m;
        this.f58613b = c7548m2;
        this.f58614c = c7548m3;
        this.f58615d = interfaceC1436k;
        this.f58616e = interfaceC1436k2;
    }

    /* JADX INFO: renamed from: a */
    public static C18357w m19860a(C18357w c18357w, C7548m c7548m, C7548m c7548m2, C7548m c7548m3, C5021r c5021r, int i10) {
        if ((i10 & 1) != 0) {
            c7548m = c18357w.f58612a;
        }
        C7548m c7548m4 = c7548m;
        if ((i10 & 2) != 0) {
            c7548m2 = c18357w.f58613b;
        }
        C7548m c7548m5 = c7548m2;
        if ((i10 & 4) != 0) {
            c7548m3 = c18357w.f58614c;
        }
        C7548m c7548m6 = c7548m3;
        InterfaceC1436k interfaceC1436k = c5021r;
        if ((i10 & 16) != 0) {
            interfaceC1436k = c18357w.f58616e;
        }
        return new C18357w(c7548m4, c7548m5, c7548m6, c18357w.f58615d, interfaceC1436k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18357w)) {
            return false;
        }
        C18357w c18357w = (C18357w) obj;
        return AbstractC16544l.m18089b(this.f58612a, c18357w.f58612a) && AbstractC16544l.m18089b(this.f58613b, c18357w.f58613b) && AbstractC16544l.m18089b(this.f58614c, c18357w.f58614c) && AbstractC16544l.m18089b(this.f58615d, c18357w.f58615d) && AbstractC16544l.m18089b(this.f58616e, c18357w.f58616e);
    }

    public final int hashCode() {
        C7548m c7548m = this.f58612a;
        int iM7896d = (c7548m == null ? 0 : C7548m.m7896d(c7548m.f23910a)) * 31;
        C7548m c7548m2 = this.f58613b;
        int iM7896d2 = (iM7896d + (c7548m2 == null ? 0 : C7548m.m7896d(c7548m2.f23910a))) * 31;
        C7548m c7548m3 = this.f58614c;
        int iM7896d3 = (iM7896d2 + (c7548m3 == null ? 0 : C7548m.m7896d(c7548m3.f23910a))) * 31;
        InterfaceC1436k interfaceC1436k = this.f58615d;
        int iHashCode = (iM7896d3 + (interfaceC1436k == null ? 0 : interfaceC1436k.hashCode())) * 31;
        InterfaceC1436k interfaceC1436k2 = this.f58616e;
        return iHashCode + (interfaceC1436k2 != null ? interfaceC1436k2.hashCode() : 0);
    }

    public final String toString() {
        return "ListStyle(markerIndent=" + this.f58612a + ", contentsIndent=" + this.f58613b + ", itemSpacing=" + this.f58614c + ", orderedMarkers=" + this.f58615d + ", unorderedMarkers=" + this.f58616e + nkFZpTrMPpn.ywLKahUMSQsL;
    }
}
