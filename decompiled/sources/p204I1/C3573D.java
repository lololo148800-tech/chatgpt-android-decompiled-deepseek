package p204I1;

import com.google.protobuf.AbstractC12107L1;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17321x;
import p328N1.AbstractC5599o;
import p328N1.C5605u;
import p328N1.C5606v;
import p328N1.C5609y;
import p371P1.C6306b;
import p467T1.C7191a;
import p467T1.C7193c;
import p467T1.C7200j;
import p467T1.C7202l;
import p467T1.C7205o;
import p467T1.InterfaceC7204n;
import p492U1.C7548m;
import p774h1.AbstractC14360p;
import p774h1.C14338P;
import p774h1.C14365u;
import p775h2.AbstractC14376f;
import p821j1.AbstractC16040e;

/* JADX INFO: renamed from: I1.D */
/* JADX INFO: loaded from: classes.dex */
public final class C3573D {

    /* JADX INFO: renamed from: a */
    public final InterfaceC7204n f10859a;

    /* JADX INFO: renamed from: b */
    public final long f10860b;

    /* JADX INFO: renamed from: c */
    public final C5609y f10861c;

    /* JADX INFO: renamed from: d */
    public final C5605u f10862d;

    /* JADX INFO: renamed from: e */
    public final C5606v f10863e;

    /* JADX INFO: renamed from: f */
    public final AbstractC5599o f10864f;

    /* JADX INFO: renamed from: g */
    public final String f10865g;

    /* JADX INFO: renamed from: h */
    public final long f10866h;

    /* JADX INFO: renamed from: i */
    public final C7191a f10867i;

    /* JADX INFO: renamed from: j */
    public final C7205o f10868j;

    /* JADX INFO: renamed from: k */
    public final C6306b f10869k;

    /* JADX INFO: renamed from: l */
    public final long f10870l;

    /* JADX INFO: renamed from: m */
    public final C7200j f10871m;

    /* JADX INFO: renamed from: n */
    public final C14338P f10872n;

    /* JADX INFO: renamed from: o */
    public final C3608x f10873o;

    /* JADX INFO: renamed from: p */
    public final AbstractC16040e f10874p;

    public C3573D(long j10, long j11, C5609y c5609y, C5605u c5605u, C5606v c5606v, AbstractC5599o abstractC5599o, String str, long j12, C7191a c7191a, C7205o c7205o, C6306b c6306b, long j13, C7200j c7200j, C14338P c14338p, C3608x c3608x, AbstractC16040e abstractC16040e) {
        this(j10 != 16 ? new C7193c(j10) : C7202l.f22868a, j11, c5609y, c5605u, c5606v, abstractC5599o, str, j12, c7191a, c7205o, c6306b, j13, c7200j, c14338p, c3608x, abstractC16040e);
    }

    /* JADX INFO: renamed from: a */
    public static C3573D m4244a(C3573D c3573d, long j10, long j11, int i10) {
        long jMo7588b = (i10 & 1) != 0 ? c3573d.f10859a.mo7588b() : j10;
        long j12 = (i10 & 2) != 0 ? c3573d.f10860b : j11;
        C5609y c5609y = c3573d.f10861c;
        C5605u c5605u = c3573d.f10862d;
        C5606v c5606v = c3573d.f10863e;
        AbstractC5599o abstractC5599o = (i10 & 32) != 0 ? c3573d.f10864f : null;
        String str = c3573d.f10865g;
        long j13 = c3573d.f10866h;
        C7191a c7191a = c3573d.f10867i;
        C7205o c7205o = c3573d.f10868j;
        C6306b c6306b = c3573d.f10869k;
        long j14 = c3573d.f10870l;
        C7200j c7200j = c3573d.f10871m;
        C14338P c14338p = c3573d.f10872n;
        C3608x c3608x = c3573d.f10873o;
        AbstractC16040e abstractC16040e = c3573d.f10874p;
        InterfaceC7204n c7193c = c3573d.f10859a;
        if (!C14365u.m15775c(jMo7588b, c7193c.mo7588b())) {
            c7193c = jMo7588b != 16 ? new C7193c(jMo7588b) : C7202l.f22868a;
        }
        return new C3573D(c7193c, j12, c5609y, c5605u, c5606v, abstractC5599o, str, j13, c7191a, c7205o, c6306b, j14, c7200j, c14338p, c3608x, abstractC16040e);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m4245b(C3573D c3573d) {
        if (this == c3573d) {
            return true;
        }
        return C7548m.m7893a(this.f10860b, c3573d.f10860b) && AbstractC16544l.m18089b(this.f10861c, c3573d.f10861c) && AbstractC16544l.m18089b(this.f10862d, c3573d.f10862d) && AbstractC16544l.m18089b(this.f10863e, c3573d.f10863e) && AbstractC16544l.m18089b(this.f10864f, c3573d.f10864f) && AbstractC16544l.m18089b(this.f10865g, c3573d.f10865g) && C7548m.m7893a(this.f10866h, c3573d.f10866h) && AbstractC16544l.m18089b(this.f10867i, c3573d.f10867i) && AbstractC16544l.m18089b(this.f10868j, c3573d.f10868j) && AbstractC16544l.m18089b(this.f10869k, c3573d.f10869k) && C14365u.m15775c(this.f10870l, c3573d.f10870l) && AbstractC16544l.m18089b(this.f10873o, c3573d.f10873o);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m4246c(C3573D c3573d) {
        return AbstractC16544l.m18089b(this.f10859a, c3573d.f10859a) && AbstractC16544l.m18089b(this.f10871m, c3573d.f10871m) && AbstractC16544l.m18089b(this.f10872n, c3573d.f10872n) && AbstractC16544l.m18089b(this.f10874p, c3573d.f10874p);
    }

    /* JADX INFO: renamed from: d */
    public final C3573D m4247d(C3573D c3573d) {
        if (c3573d == null) {
            return this;
        }
        InterfaceC7204n interfaceC7204n = c3573d.f10859a;
        return AbstractC3575F.m4248a(this, interfaceC7204n.mo7588b(), interfaceC7204n.mo7591e(), interfaceC7204n.mo7587a(), c3573d.f10860b, c3573d.f10861c, c3573d.f10862d, c3573d.f10863e, c3573d.f10864f, c3573d.f10865g, c3573d.f10866h, c3573d.f10867i, c3573d.f10868j, c3573d.f10869k, c3573d.f10870l, c3573d.f10871m, c3573d.f10872n, c3573d.f10873o, c3573d.f10874p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3573D)) {
            return false;
        }
        C3573D c3573d = (C3573D) obj;
        return m4245b(c3573d) && m4246c(c3573d);
    }

    public final int hashCode() {
        InterfaceC7204n interfaceC7204n = this.f10859a;
        long jMo7588b = interfaceC7204n.mo7588b();
        int i10 = C14365u.f45061k;
        int iM18981a = C17321x.m18981a(jMo7588b) * 31;
        AbstractC14360p abstractC14360pMo7591e = interfaceC7204n.mo7591e();
        int iM7896d = (C7548m.m7896d(this.f10860b) + ((Float.floatToIntBits(interfaceC7204n.mo7587a()) + ((iM18981a + (abstractC14360pMo7591e != null ? abstractC14360pMo7591e.hashCode() : 0)) * 31)) * 31)) * 31;
        C5609y c5609y = this.f10861c;
        int i11 = (iM7896d + (c5609y != null ? c5609y.f18160Y : 0)) * 31;
        C5605u c5605u = this.f10862d;
        int i12 = (i11 + (c5605u != null ? c5605u.f18148a : 0)) * 31;
        C5606v c5606v = this.f10863e;
        int i13 = (i12 + (c5606v != null ? c5606v.f18149a : 0)) * 31;
        AbstractC5599o abstractC5599o = this.f10864f;
        int iHashCode = (i13 + (abstractC5599o != null ? abstractC5599o.hashCode() : 0)) * 31;
        String str = this.f10865g;
        int iM7896d2 = (C7548m.m7896d(this.f10866h) + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31;
        C7191a c7191a = this.f10867i;
        int iFloatToIntBits = (iM7896d2 + (c7191a != null ? Float.floatToIntBits(c7191a.f22846a) : 0)) * 31;
        C7205o c7205o = this.f10868j;
        int iHashCode2 = (iFloatToIntBits + (c7205o != null ? c7205o.hashCode() : 0)) * 31;
        C6306b c6306b = this.f10869k;
        int iM15857w = AbstractC14376f.m15857w(this.f10870l, (iHashCode2 + (c6306b != null ? c6306b.f20438Y.hashCode() : 0)) * 31, 31);
        C7200j c7200j = this.f10871m;
        int i14 = (iM15857w + (c7200j != null ? c7200j.f22866a : 0)) * 31;
        C14338P c14338p = this.f10872n;
        int iHashCode3 = (i14 + (c14338p != null ? c14338p.hashCode() : 0)) * 31;
        C3608x c3608x = this.f10873o;
        int iHashCode4 = (iHashCode3 + (c3608x != null ? c3608x.hashCode() : 0)) * 31;
        AbstractC16040e abstractC16040e = this.f10874p;
        return iHashCode4 + (abstractC16040e != null ? abstractC16040e.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SpanStyle(color=");
        InterfaceC7204n interfaceC7204n = this.f10859a;
        sb2.append((Object) C14365u.m15781i(interfaceC7204n.mo7588b()));
        sb2.append(", brush=");
        sb2.append(interfaceC7204n.mo7591e());
        sb2.append(", alpha=");
        sb2.append(interfaceC7204n.mo7587a());
        sb2.append(", fontSize=");
        sb2.append((Object) C7548m.m7897e(this.f10860b));
        sb2.append(", fontWeight=");
        sb2.append(this.f10861c);
        sb2.append(", fontStyle=");
        sb2.append(this.f10862d);
        sb2.append(", fontSynthesis=");
        sb2.append(this.f10863e);
        sb2.append(", fontFamily=");
        sb2.append(this.f10864f);
        sb2.append(", fontFeatureSettings=");
        sb2.append(this.f10865g);
        sb2.append(", letterSpacing=");
        sb2.append((Object) C7548m.m7897e(this.f10866h));
        sb2.append(", baselineShift=");
        sb2.append(this.f10867i);
        sb2.append(", textGeometricTransform=");
        sb2.append(this.f10868j);
        sb2.append(", localeList=");
        sb2.append(this.f10869k);
        sb2.append(", background=");
        AbstractC12107L1.m13828s(this.f10870l, ", textDecoration=", sb2);
        sb2.append(this.f10871m);
        sb2.append(", shadow=");
        sb2.append(this.f10872n);
        sb2.append(", platformStyle=");
        sb2.append(this.f10873o);
        sb2.append(", drawStyle=");
        sb2.append(this.f10874p);
        sb2.append(')');
        return sb2.toString();
    }

    public C3573D(InterfaceC7204n interfaceC7204n, long j10, C5609y c5609y, C5605u c5605u, C5606v c5606v, AbstractC5599o abstractC5599o, String str, long j11, C7191a c7191a, C7205o c7205o, C6306b c6306b, long j12, C7200j c7200j, C14338P c14338p, C3608x c3608x, AbstractC16040e abstractC16040e) {
        this.f10859a = interfaceC7204n;
        this.f10860b = j10;
        this.f10861c = c5609y;
        this.f10862d = c5605u;
        this.f10863e = c5606v;
        this.f10864f = abstractC5599o;
        this.f10865g = str;
        this.f10866h = j11;
        this.f10867i = c7191a;
        this.f10868j = c7205o;
        this.f10869k = c6306b;
        this.f10870l = j12;
        this.f10871m = c7200j;
        this.f10872n = c14338p;
        this.f10873o = c3608x;
        this.f10874p = abstractC16040e;
    }

    public C3573D(long j10, long j11, C5609y c5609y, C5605u c5605u, C5606v c5606v, AbstractC5599o abstractC5599o, String str, long j12, C7191a c7191a, C7205o c7205o, C6306b c6306b, long j13, C7200j c7200j, C14338P c14338p, int i10) {
        this((i10 & 1) != 0 ? C14365u.f45060j : j10, (i10 & 2) != 0 ? C7548m.f23909c : j11, (i10 & 4) != 0 ? null : c5609y, (i10 & 8) != 0 ? null : c5605u, (i10 & 16) != 0 ? null : c5606v, (i10 & 32) != 0 ? null : abstractC5599o, (i10 & 64) != 0 ? null : str, (i10 & 128) != 0 ? C7548m.f23909c : j12, (i10 & 256) != 0 ? null : c7191a, (i10 & 512) != 0 ? null : c7205o, (i10 & 1024) != 0 ? null : c6306b, (i10 & 2048) != 0 ? C14365u.f45060j : j13, (i10 & 4096) != 0 ? null : c7200j, (i10 & 8192) != 0 ? null : c14338p, (C3608x) null, (AbstractC16040e) null);
    }
}
