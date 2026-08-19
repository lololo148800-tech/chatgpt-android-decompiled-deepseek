package p077Cn;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.AbstractC0575H;
import p025An.C0624m;
import p025An.InterfaceC0586M0;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1440o;
import p153Fn.AbstractC2940r;
import p153Fn.AbstractC2941s;
import p153Fn.C2942t;
import p523V9.AbstractC8154o0;
import p571X9.AbstractC9233X;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Cn.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C1736d implements InterfaceC0586M0 {

    /* JADX INFO: renamed from: Y */
    public Object f4971Y = AbstractC1745m.f5012p;

    /* JADX INFO: renamed from: Z */
    public C0624m f4972Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C1743k f4973o0;

    public C1736d(C1743k c1743k) {
        this.f4973o0 = c1743k;
    }

    @Override // p025An.InterfaceC0586M0
    /* JADX INFO: renamed from: a */
    public final void mo1212a(AbstractC2940r abstractC2940r, int i10) {
        C0624m c0624m = this.f4972Z;
        if (c0624m != null) {
            c0624m.mo1212a(abstractC2940r, i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final Object m2525b(AbstractC19687c abstractC19687c) throws Throwable {
        C1751s c1751s;
        Object obj;
        C1751s c1751s2;
        boolean z6 = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object obj2 = this.f4971Y;
        if (obj2 != AbstractC1745m.f5012p && obj2 != AbstractC1745m.f5008l) {
            z6 = true;
            break;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C1743k.f4989u0;
        C1743k c1743k = this.f4973o0;
        C1751s c1751s3 = (C1751s) atomicReferenceFieldUpdater.get(c1743k);
        while (true) {
            if (c1743k.mo2515d()) {
                this.f4971Y = AbstractC1745m.f5008l;
                Throwable thM2555x = c1743k.m2555x();
                if (thM2555x == null) {
                    break;
                }
                int i10 = AbstractC2941s.f8805a;
                throw thM2555x;
            }
            long andIncrement = C1743k.f4985q0.getAndIncrement(c1743k);
            long j10 = AbstractC1745m.f4998b;
            long j11 = andIncrement / j10;
            int i11 = (int) (andIncrement % j10);
            if (c1751s3.f8804o0 != j11) {
                C1751s c1751sM2554w = c1743k.m2554w(j11, c1751s3);
                if (c1751sM2554w == null) {
                    continue;
                } else {
                    c1751s = c1751sM2554w;
                }
            } else {
                c1751s = c1751s3;
            }
            Object objM2544N = c1743k.m2544N(c1751s, i11, andIncrement, null);
            C2942t c2942t = AbstractC1745m.f5009m;
            if (objM2544N == c2942t) {
                throw new IllegalStateException("unreachable");
            }
            C2942t c2942t2 = AbstractC1745m.f5011o;
            if (objM2544N != c2942t2) {
                if (objM2544N != AbstractC1745m.f5010n) {
                    c1751s.m3743a();
                    this.f4971Y = objM2544N;
                    z6 = true;
                    break;
                }
                C1743k c1743k2 = this.f4973o0;
                C0624m c0624mM1193v = AbstractC0575H.m1193v(AbstractC8154o0.m8714e(abstractC19687c));
                try {
                    this.f4972Z = c0624mM1193v;
                    AbstractC2940r abstractC2940r = c1751s;
                    Object objM2544N2 = c1743k2.m2544N(c1751s, i11, andIncrement, this);
                    if (objM2544N2 != c2942t) {
                        InterfaceC1440o c1734b = null;
                        InterfaceC1436k interfaceC1436k = c1743k2.f4994Z;
                        if (objM2544N2 == c2942t2) {
                            if (andIncrement < c1743k2.m2533A()) {
                                abstractC2940r.m3743a();
                            }
                            C1751s c1751s4 = (C1751s) C1743k.f4989u0.get(c1743k2);
                            while (true) {
                                if (c1743k2.mo2515d()) {
                                    C0624m c0624m = this.f4972Z;
                                    AbstractC16544l.m18091d(c0624m);
                                    this.f4972Z = null;
                                    this.f4971Y = AbstractC1745m.f5008l;
                                    Throwable thM2555x2 = c1743k.m2555x();
                                    if (thM2555x2 != null) {
                                        c0624m.resumeWith(AbstractC9233X.m9806b(thM2555x2));
                                        break;
                                    }
                                    c0624m.resumeWith(Boolean.FALSE);
                                    break;
                                }
                                long andIncrement2 = C1743k.f4985q0.getAndIncrement(c1743k2);
                                long j12 = AbstractC1745m.f4998b;
                                long j13 = andIncrement2 / j12;
                                int i12 = (int) (andIncrement2 % j12);
                                if (c1751s4.f8804o0 != j13) {
                                    C1751s c1751sM2554w2 = c1743k2.m2554w(j13, c1751s4);
                                    if (c1751sM2554w2 != null) {
                                        c1751s2 = c1751sM2554w2;
                                    }
                                } else {
                                    c1751s2 = c1751s4;
                                }
                                Object objM2544N3 = c1743k2.m2544N(c1751s2, i12, andIncrement2, this);
                                if (objM2544N3 == AbstractC1745m.f5009m) {
                                    mo1212a(c1751s2, i12);
                                    break;
                                }
                                if (objM2544N3 == AbstractC1745m.f5011o) {
                                    if (andIncrement2 < c1743k2.m2533A()) {
                                        c1751s2.m3743a();
                                    }
                                    c1751s4 = c1751s2;
                                } else {
                                    if (objM2544N3 == AbstractC1745m.f5010n) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    c1751s2.m3743a();
                                    this.f4971Y = objM2544N3;
                                    this.f4972Z = null;
                                    obj = Boolean.TRUE;
                                    if (interfaceC1436k != null) {
                                        c1734b = new C1734b(interfaceC1436k, objArr2 == true ? 1 : 0, objM2544N3);
                                    }
                                }
                            }
                        } else {
                            abstractC2940r.m3743a();
                            this.f4971Y = objM2544N2;
                            this.f4972Z = null;
                            obj = Boolean.TRUE;
                            if (interfaceC1436k != null) {
                                c1734b = new C1734b(interfaceC1436k, objArr == true ? 1 : 0, objM2544N2);
                            }
                        }
                        c0624mM1193v.mo1246n(obj, c1734b);
                        break;
                    }
                    mo1212a(abstractC2940r, i11);
                    Object objM1261q = c0624mM1193v.m1261q();
                    EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                    return objM1261q;
                } catch (Throwable th2) {
                    c0624mM1193v.m1250A();
                    throw th2;
                }
            }
            if (andIncrement < c1743k.m2533A()) {
                c1751s.m3743a();
            }
            c1751s3 = c1751s;
        }
        return Boolean.valueOf(z6);
    }

    /* JADX INFO: renamed from: c */
    public final Object m2526c() throws Throwable {
        Object obj = this.f4971Y;
        C2942t c2942t = AbstractC1745m.f5012p;
        if (obj == c2942t) {
            throw new IllegalStateException("`hasNext()` has not been invoked");
        }
        this.f4971Y = c2942t;
        if (obj != AbstractC1745m.f5008l) {
            return obj;
        }
        Throwable thM2556y = this.f4973o0.m2556y();
        int i10 = AbstractC2941s.f8805a;
        throw thM2556y;
    }
}
