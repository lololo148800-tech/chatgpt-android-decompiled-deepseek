package p946pc;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1439n;
import p492U1.C7548m;
import p988rc.C18930r;

/* JADX INFO: renamed from: pc.F */
/* JADX INFO: loaded from: classes3.dex */
public final class C18321F {

    /* JADX INFO: renamed from: i */
    public static final C18321F f58480i = new C18321F(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 255);

    /* JADX INFO: renamed from: a */
    public final C7548m f58481a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1439n f58482b;

    /* JADX INFO: renamed from: c */
    public final C18357w f58483c;

    /* JADX INFO: renamed from: d */
    public final C18336b f58484d;

    /* JADX INFO: renamed from: e */
    public final C18342h f58485e;

    /* JADX INFO: renamed from: f */
    public final C18333S f58486f;

    /* JADX INFO: renamed from: g */
    public final C18355u f58487g;

    /* JADX INFO: renamed from: h */
    public final C18930r f58488h;

    public C18321F(C7548m c7548m, InterfaceC1439n interfaceC1439n, C18357w c18357w, C18336b c18336b, C18342h c18342h, C18333S c18333s, C18355u c18355u, C18930r c18930r) {
        this.f58481a = c7548m;
        this.f58482b = interfaceC1439n;
        this.f58483c = c18357w;
        this.f58484d = c18336b;
        this.f58485e = c18342h;
        this.f58486f = c18333s;
        this.f58487g = c18355u;
        this.f58488h = c18930r;
    }

    /* JADX INFO: renamed from: a */
    public static C18321F m19847a(C18321F c18321f, C7548m c7548m, C18357w c18357w, int i10) {
        if ((i10 & 1) != 0) {
            c7548m = c18321f.f58481a;
        }
        C7548m c7548m2 = c7548m;
        InterfaceC1439n interfaceC1439n = c18321f.f58482b;
        if ((i10 & 4) != 0) {
            c18357w = c18321f.f58483c;
        }
        C18336b c18336b = c18321f.f58484d;
        C18342h c18342h = c18321f.f58485e;
        C18333S c18333s = c18321f.f58486f;
        C18355u c18355u = c18321f.f58487g;
        C18930r c18930r = c18321f.f58488h;
        c18321f.getClass();
        return new C18321F(c7548m2, interfaceC1439n, c18357w, c18336b, c18342h, c18333s, c18355u, c18930r);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18321F)) {
            return false;
        }
        C18321F c18321f = (C18321F) obj;
        return AbstractC16544l.m18089b(this.f58481a, c18321f.f58481a) && AbstractC16544l.m18089b(this.f58482b, c18321f.f58482b) && AbstractC16544l.m18089b(this.f58483c, c18321f.f58483c) && AbstractC16544l.m18089b(this.f58484d, c18321f.f58484d) && AbstractC16544l.m18089b(this.f58485e, c18321f.f58485e) && AbstractC16544l.m18089b(this.f58486f, c18321f.f58486f) && AbstractC16544l.m18089b(this.f58487g, c18321f.f58487g) && AbstractC16544l.m18089b(this.f58488h, c18321f.f58488h);
    }

    public final int hashCode() {
        C7548m c7548m = this.f58481a;
        int iM7896d = (c7548m == null ? 0 : C7548m.m7896d(c7548m.f23910a)) * 31;
        InterfaceC1439n interfaceC1439n = this.f58482b;
        int iHashCode = (iM7896d + (interfaceC1439n == null ? 0 : interfaceC1439n.hashCode())) * 31;
        C18357w c18357w = this.f58483c;
        int iHashCode2 = (iHashCode + (c18357w == null ? 0 : c18357w.hashCode())) * 31;
        C18336b c18336b = this.f58484d;
        int iHashCode3 = (iHashCode2 + (c18336b == null ? 0 : c18336b.hashCode())) * 31;
        C18342h c18342h = this.f58485e;
        int iHashCode4 = (iHashCode3 + (c18342h == null ? 0 : c18342h.hashCode())) * 31;
        C18333S c18333s = this.f58486f;
        int iHashCode5 = (iHashCode4 + (c18333s == null ? 0 : c18333s.hashCode())) * 31;
        C18355u c18355u = this.f58487g;
        int iHashCode6 = (iHashCode5 + (c18355u == null ? 0 : c18355u.hashCode())) * 31;
        C18930r c18930r = this.f58488h;
        return iHashCode6 + (c18930r != null ? c18930r.hashCode() : 0);
    }

    public final String toString() {
        return "RichTextStyle(paragraphSpacing=" + this.f58481a + ", headingStyle=" + this.f58482b + ", listStyle=" + this.f58483c + ", blockQuoteGutter=" + this.f58484d + ", codeBlockStyle=" + this.f58485e + ", tableStyle=" + this.f58486f + ", infoPanelStyle=" + this.f58487g + ", stringStyle=" + this.f58488h + Separators.RPAREN;
    }

    public /* synthetic */ C18321F(C7548m c7548m, C18357w c18357w, C18930r c18930r, int i10) {
        this((i10 & 1) != 0 ? null : c7548m, null, (i10 & 4) != 0 ? null : c18357w, null, null, null, null, (i10 & 128) != 0 ? null : c18930r);
    }
}
