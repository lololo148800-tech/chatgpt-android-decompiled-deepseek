package p204I1;

import kotlin.jvm.internal.AbstractC16544l;
import p328N1.AbstractC5599o;
import p328N1.C5605u;
import p328N1.C5606v;
import p328N1.C5609y;
import p371P1.C6306b;
import p467T1.C7191a;
import p467T1.C7205o;
import p492U1.C7536a;
import p492U1.C7548m;
import p571X9.AbstractC9160K3;
import p774h1.C14365u;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: I1.i */
/* JADX INFO: loaded from: classes.dex */
public final class C3593i {

    /* JADX INFO: renamed from: a */
    public final C3577H f10947a;

    public C3593i(C3577H c3577h) {
        this.f10947a = c3577h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3593i)) {
            return false;
        }
        C3577H c3577h = this.f10947a;
        C3593i c3593i = (C3593i) obj;
        if (!AbstractC16544l.m18089b(c3577h.f10882a, c3593i.f10947a.f10882a)) {
            return false;
        }
        C3577H c3577h2 = c3593i.f10947a;
        if (!c3577h.f10883b.m4279f(c3577h2.f10883b) || !AbstractC16544l.m18089b(c3577h.f10884c, c3577h2.f10884c) || c3577h.f10885d != c3577h2.f10885d || c3577h.f10886e != c3577h2.f10886e || !AbstractC9160K3.m9708a(c3577h.f10887f, c3577h2.f10887f) || !AbstractC16544l.m18089b(c3577h.f10888g, c3577h2.f10888g) || c3577h.f10889h != c3577h2.f10889h || c3577h.f10890i != c3577h2.f10890i) {
            return false;
        }
        long j10 = c3577h.f10891j;
        return C7536a.m7854i(j10) == C7536a.m7854i(c3577h2.f10891j) && C7536a.m7853h(j10) == C7536a.m7853h(c3577h2.f10891j);
    }

    public final int hashCode() {
        C3577H c3577h = this.f10947a;
        int iHashCode = c3577h.f10882a.hashCode() * 31;
        C3582M c3582m = c3577h.f10883b;
        C3573D c3573d = c3582m.f10910a;
        int iM7896d = C7548m.m7896d(c3573d.f10860b) * 31;
        C5609y c5609y = c3573d.f10861c;
        int i10 = (iM7896d + (c5609y != null ? c5609y.f18160Y : 0)) * 31;
        C5605u c5605u = c3573d.f10862d;
        int i11 = (i10 + (c5605u != null ? c5605u.f18148a : 0)) * 31;
        C5606v c5606v = c3573d.f10863e;
        int i12 = (i11 + (c5606v != null ? c5606v.f18149a : 0)) * 31;
        AbstractC5599o abstractC5599o = c3573d.f10864f;
        int iHashCode2 = (i12 + (abstractC5599o != null ? abstractC5599o.hashCode() : 0)) * 31;
        String str = c3573d.f10865g;
        int iM7896d2 = (C7548m.m7896d(c3573d.f10866h) + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31)) * 31;
        C7191a c7191a = c3573d.f10867i;
        int iFloatToIntBits = (iM7896d2 + (c7191a != null ? Float.floatToIntBits(c7191a.f22846a) : 0)) * 31;
        C7205o c7205o = c3573d.f10868j;
        int iHashCode3 = (iFloatToIntBits + (c7205o != null ? c7205o.hashCode() : 0)) * 31;
        C6306b c6306b = c3573d.f10869k;
        int iHashCode4 = (iHashCode3 + (c6306b != null ? c6306b.f20438Y.hashCode() : 0)) * 31;
        int i13 = C14365u.f45061k;
        int iM15857w = AbstractC14376f.m15857w(c3573d.f10870l, iHashCode4, 31);
        C3608x c3608x = c3573d.f10873o;
        int iHashCode5 = (c3582m.f10911b.hashCode() + ((iM15857w + (c3608x != null ? c3608x.hashCode() : 0)) * 31)) * 31;
        C3609y c3609y = c3582m.f10912c;
        int iHashCode6 = (c3577h.f10890i.hashCode() + ((c3577h.f10889h.hashCode() + ((c3577h.f10888g.hashCode() + ((((((AbstractC14376f.m15858x(c3577h.f10884c, (iHashCode5 + (c3609y != null ? c3609y.hashCode() : 0) + iHashCode) * 31, 31) + c3577h.f10885d) * 31) + (c3577h.f10886e ? 1231 : 1237)) * 31) + c3577h.f10887f) * 31)) * 31)) * 31)) * 31;
        long j10 = c3577h.f10891j;
        return C7536a.m7853h(j10) + ((C7536a.m7854i(j10) + iHashCode6) * 31);
    }
}
