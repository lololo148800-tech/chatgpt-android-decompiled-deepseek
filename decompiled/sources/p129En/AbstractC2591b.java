package p129En;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p077Cn.EnumC1733a;
import p103Dn.InterfaceC2149O0;
import p972qm.InterfaceC18770c;

/* JADX INFO: renamed from: En.b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2591b {

    /* JADX INFO: renamed from: Y */
    public AbstractC2593d[] f8032Y;

    /* JADX INFO: renamed from: Z */
    public int f8033Z;

    /* JADX INFO: renamed from: o0 */
    public int f8034o0;

    /* JADX INFO: renamed from: p0 */
    public C2588H f8035p0;

    /* JADX INFO: renamed from: c */
    public final AbstractC2593d m3610c() {
        AbstractC2593d abstractC2593dMo3232g;
        C2588H c2588h;
        synchronized (this) {
            try {
                AbstractC2593d[] abstractC2593dArrMo3233h = this.f8032Y;
                if (abstractC2593dArrMo3233h == null) {
                    abstractC2593dArrMo3233h = mo3233h();
                    this.f8032Y = abstractC2593dArrMo3233h;
                } else if (this.f8033Z >= abstractC2593dArrMo3233h.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(abstractC2593dArrMo3233h, abstractC2593dArrMo3233h.length * 2);
                    AbstractC16544l.m18093f(objArrCopyOf, "copyOf(...)");
                    this.f8032Y = (AbstractC2593d[]) objArrCopyOf;
                    abstractC2593dArrMo3233h = (AbstractC2593d[]) objArrCopyOf;
                }
                int i10 = this.f8034o0;
                do {
                    abstractC2593dMo3232g = abstractC2593dArrMo3233h[i10];
                    if (abstractC2593dMo3232g == null) {
                        abstractC2593dMo3232g = mo3232g();
                        abstractC2593dArrMo3233h[i10] = abstractC2593dMo3232g;
                    }
                    i10++;
                    if (i10 >= abstractC2593dArrMo3233h.length) {
                        i10 = 0;
                    }
                } while (!abstractC2593dMo3232g.mo3246a(this));
                this.f8034o0 = i10;
                this.f8033Z++;
                c2588h = this.f8035p0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (c2588h != null) {
            c2588h.m3609x(1);
        }
        return abstractC2593dMo3232g;
    }

    /* JADX INFO: renamed from: g */
    public abstract AbstractC2593d mo3232g();

    /* JADX INFO: renamed from: h */
    public abstract AbstractC2593d[] mo3233h();

    /* JADX INFO: renamed from: i */
    public final InterfaceC2149O0 m3611i() {
        C2588H c2588h;
        synchronized (this) {
            c2588h = this.f8035p0;
            if (c2588h == null) {
                int i10 = this.f8033Z;
                c2588h = new C2588H(1, Integer.MAX_VALUE, EnumC1733a.f4962Z);
                c2588h.mo3231f(Integer.valueOf(i10));
                this.f8035p0 = c2588h;
            }
        }
        return c2588h;
    }

    /* JADX INFO: renamed from: j */
    public final void m3612j(AbstractC2593d abstractC2593d) {
        C2588H c2588h;
        int i10;
        InterfaceC18770c[] interfaceC18770cArrMo3247b;
        synchronized (this) {
            try {
                int i11 = this.f8033Z - 1;
                this.f8033Z = i11;
                c2588h = this.f8035p0;
                if (i11 == 0) {
                    this.f8034o0 = 0;
                }
                AbstractC16544l.m18092e(abstractC2593d, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                interfaceC18770cArrMo3247b = abstractC2593d.mo3247b(this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (InterfaceC18770c interfaceC18770c : interfaceC18770cArrMo3247b) {
            if (interfaceC18770c != null) {
                interfaceC18770c.resumeWith(C17296C.f55119a);
            }
        }
        if (c2588h != null) {
            c2588h.m3609x(-1);
        }
    }
}
