package p204I1;

import kotlin.jvm.internal.AbstractC16544l;
import p025An.C0644w;
import p328N1.AbstractC5599o;
import p328N1.C5605u;
import p328N1.C5606v;
import p328N1.C5609y;
import p371P1.C6306b;
import p467T1.C7191a;
import p467T1.C7192b;
import p467T1.C7193c;
import p467T1.C7200j;
import p467T1.C7202l;
import p467T1.C7205o;
import p467T1.InterfaceC7204n;
import p492U1.C7548m;
import p492U1.C7549n;
import p571X9.AbstractC9119D4;
import p571X9.AbstractC9154J3;
import p594Y9.AbstractC9930m3;
import p774h1.AbstractC14337O;
import p774h1.AbstractC14360p;
import p774h1.C14338P;
import p774h1.C14341T;
import p774h1.C14365u;
import p821j1.AbstractC16040e;

/* JADX INFO: renamed from: I1.F */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3575F {

    /* JADX INFO: renamed from: a */
    public static final long f10876a = AbstractC9119D4.m9650c(14);

    /* JADX INFO: renamed from: b */
    public static final long f10877b = AbstractC9119D4.m9650c(0);

    /* JADX INFO: renamed from: c */
    public static final long f10878c = C14365u.f45059i;

    /* JADX INFO: renamed from: d */
    public static final InterfaceC7204n f10879d;

    static {
        long j10 = C14365u.f45052b;
        f10879d = j10 != 16 ? new C7193c(j10) : C7202l.f22868a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    /* JADX INFO: renamed from: a */
    public static final C3573D m4248a(C3573D c3573d, long j10, AbstractC14360p abstractC14360p, float f10, long j11, C5609y c5609y, C5605u c5605u, C5606v c5606v, AbstractC5599o abstractC5599o, String str, long j12, C7191a c7191a, C7205o c7205o, C6306b c6306b, long j13, C7200j c7200j, C14338P c14338p, C3608x c3608x, AbstractC16040e abstractC16040e) {
        C7205o c7205o2;
        long j14;
        AbstractC16040e abstractC16040e2;
        C5609y c5609y2 = c5609y;
        C5605u c5605u2 = c5605u;
        C5606v c5606v2 = c5606v;
        String str2 = str;
        C7191a c7191a2 = c7191a;
        if (!AbstractC9119D4.m9651d(j11) && !C7548m.m7893a(j11, c3573d.f10860b)) {
            c7205o2 = c7205o;
            j14 = j13;
            abstractC16040e2 = abstractC16040e;
        } else if ((abstractC14360p != null || j10 == 16 || C14365u.m15775c(j10, c3573d.f10859a.mo7588b())) && ((c5605u2 == null || c5605u2.equals(c3573d.f10862d)) && ((c5609y2 == null || c5609y2.equals(c3573d.f10861c)) && ((abstractC5599o == null || abstractC5599o == c3573d.f10864f) && (AbstractC9119D4.m9651d(j12) || C7548m.m7893a(j12, c3573d.f10866h)))))) {
            if ((c7200j == null || c7200j.equals(c3573d.f10871m)) && AbstractC16544l.m18089b(abstractC14360p, c3573d.f10859a.mo7591e()) && ((abstractC14360p == null || f10 == c3573d.f10859a.mo7587a()) && ((c5606v2 == null || c5606v2.equals(c3573d.f10863e)) && ((str2 == null || str2.equals(c3573d.f10865g)) && (c7191a2 == null || c7191a2.equals(c3573d.f10867i)))))) {
                c7205o2 = c7205o;
                if ((c7205o2 == null || c7205o2.equals(c3573d.f10868j)) && (c6306b == null || c6306b.equals(c3573d.f10869k))) {
                    j14 = j13;
                    if ((j14 == 16 || C14365u.m15775c(j14, c3573d.f10870l)) && ((c14338p == null || c14338p.equals(c3573d.f10872n)) && (c3608x == null || c3608x.equals(c3573d.f10873o)))) {
                        abstractC16040e2 = abstractC16040e;
                        if (abstractC16040e2 == null || abstractC16040e2.equals(c3573d.f10874p)) {
                            return c3573d;
                        }
                    }
                }
                abstractC16040e2 = abstractC16040e;
            } else {
                c7205o2 = c7205o;
            }
            j14 = j13;
            abstractC16040e2 = abstractC16040e;
        } else {
            c7205o2 = c7205o;
            j14 = j13;
            abstractC16040e2 = abstractC16040e;
        }
        InterfaceC7204n c7193c = C7202l.f22868a;
        if (abstractC14360p != null) {
            if (abstractC14360p instanceof C14341T) {
                long jM9702a = AbstractC9154J3.m9702a(f10, ((C14341T) abstractC14360p).f45021a);
                if (jM9702a != 16) {
                    c7193c = new C7193c(jM9702a);
                }
            } else {
                if (!(abstractC14360p instanceof AbstractC14337O)) {
                    throw new C0644w();
                }
                c7193c = new C7192b((AbstractC14337O) abstractC14360p, f10);
            }
        } else if (j10 != 16) {
            c7193c = new C7193c(j10);
        }
        InterfaceC7204n interfaceC7204nMo7590d = c3573d.f10859a.mo7590d(c7193c);
        AbstractC5599o abstractC5599o2 = abstractC5599o == null ? c3573d.f10864f : abstractC5599o;
        long j15 = !AbstractC9119D4.m9651d(j11) ? j11 : c3573d.f10860b;
        if (c5609y2 == null) {
            c5609y2 = c3573d.f10861c;
        }
        if (c5605u2 == null) {
            c5605u2 = c3573d.f10862d;
        }
        if (c5606v2 == null) {
            c5606v2 = c3573d.f10863e;
        }
        if (str2 == null) {
            str2 = c3573d.f10865g;
        }
        long j16 = !AbstractC9119D4.m9651d(j12) ? j12 : c3573d.f10866h;
        if (c7191a2 == null) {
            c7191a2 = c3573d.f10867i;
        }
        if (c7205o2 == null) {
            c7205o2 = c3573d.f10868j;
        }
        C6306b c6306b2 = c6306b == null ? c3573d.f10869k : c6306b;
        if (j14 == 16) {
            j14 = c3573d.f10870l;
        }
        long j17 = j14;
        C7200j c7200j2 = c7200j == null ? c3573d.f10871m : c7200j;
        C14338P c14338p2 = c14338p == null ? c3573d.f10872n : c14338p;
        C3608x c3608x2 = c3573d.f10873o;
        if (c3608x2 == null) {
            c3608x2 = c3608x;
        }
        if (abstractC16040e2 == null) {
            abstractC16040e2 = c3573d.f10874p;
        }
        return new C3573D(interfaceC7204nMo7590d, j15, c5609y2, c5605u2, c5606v2, abstractC5599o2, str2, j16, c7191a2, c7205o2, c6306b2, j17, c7200j2, c14338p2, c3608x2, abstractC16040e2);
    }

    /* JADX INFO: renamed from: b */
    public static final Object m4249b(float f10, Object obj, Object obj2) {
        return ((double) f10) < 0.5d ? obj : obj2;
    }

    /* JADX INFO: renamed from: c */
    public static final long m4250c(float f10, long j10, long j11) {
        if (AbstractC9119D4.m9651d(j10) || AbstractC9119D4.m9651d(j11)) {
            return ((C7548m) m4249b(f10, new C7548m(j10), new C7548m(j11))).f23910a;
        }
        if (AbstractC9119D4.m9651d(j10) || AbstractC9119D4.m9651d(j11)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
        if (C7549n.m7898a(C7548m.m7894b(j10), C7548m.m7894b(j11))) {
            return AbstractC9119D4.m9652e(AbstractC9930m3.m10589c(C7548m.m7895c(j10), C7548m.m7895c(j11), f10), 1095216660480L & j10);
        }
        throw new IllegalArgumentException(("Cannot perform operation for " + ((Object) C7549n.m7899b(C7548m.m7894b(j10))) + " and " + ((Object) C7549n.m7899b(C7548m.m7894b(j11)))).toString());
    }
}
