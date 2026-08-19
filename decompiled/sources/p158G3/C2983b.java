package p158G3;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import p031B3.AbstractC0801e;
import p031B3.AbstractC0804h;
import p031B3.C0803g;
import p031B3.C0805i;
import p031B3.InterfaceC0800d;
import p1073w3.AbstractC20800b;
import p117Eb.C2385o;
import p885m4.C17156f;
import p885m4.C17159i;
import p885m4.C17160j;
import p885m4.InterfaceC17157g;
import p885m4.InterfaceC17158h;
import p885m4.InterfaceC17163m;

/* JADX INFO: renamed from: G3.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2983b implements InterfaceC17158h, InterfaceC0800d {

    /* JADX INFO: renamed from: a */
    public final C0805i f8950a;

    /* JADX INFO: renamed from: b */
    public final Object f8951b;

    /* JADX INFO: renamed from: c */
    public final ArrayDeque f8952c;

    /* JADX INFO: renamed from: d */
    public final ArrayDeque f8953d;

    /* JADX INFO: renamed from: e */
    public final C0803g[] f8954e;

    /* JADX INFO: renamed from: f */
    public final AbstractC0804h[] f8955f;

    /* JADX INFO: renamed from: g */
    public int f8956g;

    /* JADX INFO: renamed from: h */
    public int f8957h;

    /* JADX INFO: renamed from: i */
    public C0803g f8958i;

    /* JADX INFO: renamed from: j */
    public AbstractC0801e f8959j;

    /* JADX INFO: renamed from: k */
    public boolean f8960k;

    /* JADX INFO: renamed from: l */
    public boolean f8961l;

    /* JADX INFO: renamed from: m */
    public long f8962m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ int f8963n;

    /* JADX INFO: renamed from: o */
    public final Object f8964o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2983b(InterfaceC17163m interfaceC17163m) {
        this(new C17160j[2], new C17156f[2]);
        this.f8963n = 1;
        int i10 = this.f8956g;
        C0803g[] c0803gArr = this.f8954e;
        AbstractC20800b.m21320h(i10 == c0803gArr.length);
        for (C0803g c0803g : c0803gArr) {
            c0803g.m1836q(1024);
        }
        this.f8964o = interfaceC17163m;
    }

    @Override // p031B3.InterfaceC0800d
    /* JADX INFO: renamed from: b */
    public final void mo1831b(long j10) {
        synchronized (this.f8951b) {
            try {
                AbstractC20800b.m21320h(this.f8956g == this.f8954e.length || this.f8960k);
                this.f8962m = j10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p031B3.InterfaceC0800d
    /* JADX INFO: renamed from: e */
    public final Object mo1833e() {
        C0803g c0803g;
        synchronized (this.f8951b) {
            try {
                AbstractC0801e abstractC0801e = this.f8959j;
                if (abstractC0801e != null) {
                    throw abstractC0801e;
                }
                AbstractC20800b.m21320h(this.f8958i == null);
                int i10 = this.f8956g;
                if (i10 == 0) {
                    c0803g = null;
                } else {
                    C0803g[] c0803gArr = this.f8954e;
                    int i11 = i10 - 1;
                    this.f8956g = i11;
                    c0803g = c0803gArr[i11];
                }
                this.f8958i = c0803g;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c0803g;
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC0801e m3816f(Throwable th2) {
        switch (this.f8963n) {
            case 0:
                return new C2985d("Unexpected decode error", th2);
            default:
                return new C17159i("Unexpected decode error", th2);
        }
    }

    @Override // p031B3.InterfaceC0800d
    public final void flush() {
        synchronized (this.f8951b) {
            try {
                this.f8960k = true;
                C0803g c0803g = this.f8958i;
                if (c0803g != null) {
                    c0803g.mo1834n();
                    int i10 = this.f8956g;
                    this.f8956g = i10 + 1;
                    this.f8954e[i10] = c0803g;
                    this.f8958i = null;
                }
                while (!this.f8952c.isEmpty()) {
                    C0803g c0803g2 = (C0803g) this.f8952c.removeFirst();
                    c0803g2.mo1834n();
                    int i11 = this.f8956g;
                    this.f8956g = i11 + 1;
                    this.f8954e[i11] = c0803g2;
                }
                while (!this.f8953d.isEmpty()) {
                    ((AbstractC0804h) this.f8953d.removeFirst()).mo1839o();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final AbstractC0801e m3817g(C0803g c0803g, AbstractC0804h abstractC0804h, boolean z6) {
        switch (this.f8963n) {
            case 0:
                C2982a c2982a = (C2982a) abstractC0804h;
                try {
                    ByteBuffer byteBuffer = c0803g.f2226q0;
                    byteBuffer.getClass();
                    AbstractC20800b.m21320h(byteBuffer.hasArray());
                    AbstractC20800b.m21316d(byteBuffer.arrayOffset() == 0);
                    C2385o c2385o = (C2385o) this.f8964o;
                    byte[] bArrArray = byteBuffer.array();
                    int iRemaining = byteBuffer.remaining();
                    c2385o.getClass();
                    c2982a.f8948q0 = C2385o.m3481b(iRemaining, bArrArray);
                    c2982a.f2231o0 = c0803g.f2228s0;
                    return null;
                } catch (C2985d e10) {
                    return e10;
                }
            default:
                C17160j c17160j = (C17160j) c0803g;
                C17156f c17156f = (C17156f) abstractC0804h;
                try {
                    ByteBuffer byteBuffer2 = c17160j.f2226q0;
                    byteBuffer2.getClass();
                    byte[] bArrArray2 = byteBuffer2.array();
                    int iLimit = byteBuffer2.limit();
                    InterfaceC17163m interfaceC17163m = (InterfaceC17163m) this.f8964o;
                    if (z6) {
                        interfaceC17163m.mo3514c();
                    }
                    InterfaceC17157g interfaceC17157gMo3516i = interfaceC17163m.mo3516i(bArrArray2, 0, iLimit);
                    long j10 = c17160j.f2228s0;
                    long j11 = c17160j.f54831v0;
                    c17156f.f2231o0 = j10;
                    c17156f.f54827q0 = interfaceC17157gMo3516i;
                    if (j11 != Long.MAX_VALUE) {
                        j10 = j11;
                    }
                    c17156f.f54828r0 = j10;
                    c17156f.f2232p0 = false;
                    return null;
                } catch (C17159i e11) {
                    return e11;
                }
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m3818h() {
        AbstractC0801e abstractC0801eM3816f;
        synchronized (this.f8951b) {
            while (!this.f8961l) {
                try {
                    if (!this.f8952c.isEmpty() && this.f8957h > 0) {
                        break;
                    }
                    this.f8951b.wait();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (this.f8961l) {
                return false;
            }
            C0803g c0803g = (C0803g) this.f8952c.removeFirst();
            AbstractC0804h[] abstractC0804hArr = this.f8955f;
            int i10 = this.f8957h - 1;
            this.f8957h = i10;
            AbstractC0804h abstractC0804h = abstractC0804hArr[i10];
            boolean z6 = this.f8960k;
            this.f8960k = false;
            if (c0803g.m1824d(4)) {
                abstractC0804h.m1823a(4);
            } else {
                abstractC0804h.f2231o0 = c0803g.f2228s0;
                if (c0803g.m1824d(134217728)) {
                    abstractC0804h.m1823a(134217728);
                }
                if (!m3820j(c0803g.f2228s0)) {
                    abstractC0804h.f2232p0 = true;
                }
                try {
                    abstractC0801eM3816f = m3817g(c0803g, abstractC0804h, z6);
                } catch (OutOfMemoryError e10) {
                    abstractC0801eM3816f = m3816f(e10);
                } catch (RuntimeException e11) {
                    abstractC0801eM3816f = m3816f(e11);
                }
                if (abstractC0801eM3816f != null) {
                    synchronized (this.f8951b) {
                        this.f8959j = abstractC0801eM3816f;
                    }
                    return false;
                }
            }
            synchronized (this.f8951b) {
                try {
                    if (this.f8960k || abstractC0804h.f2232p0) {
                        abstractC0804h.mo1839o();
                    } else {
                        this.f8953d.addLast(abstractC0804h);
                    }
                    c0803g.mo1834n();
                    int i11 = this.f8956g;
                    this.f8956g = i11 + 1;
                    this.f8954e[i11] = c0803g;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            return true;
        }
    }

    @Override // p031B3.InterfaceC0800d
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final AbstractC0804h mo1832d() {
        synchronized (this.f8951b) {
            try {
                AbstractC0801e abstractC0801e = this.f8959j;
                if (abstractC0801e != null) {
                    throw abstractC0801e;
                }
                if (this.f8953d.isEmpty()) {
                    return null;
                }
                return (AbstractC0804h) this.f8953d.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m3820j(long j10) {
        boolean z6;
        synchronized (this.f8951b) {
            long j11 = this.f8962m;
            z6 = j11 == -9223372036854775807L || j10 >= j11;
        }
        return z6;
    }

    @Override // p031B3.InterfaceC0800d
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final void mo1830a(C0803g c0803g) {
        synchronized (this.f8951b) {
            try {
                AbstractC0801e abstractC0801e = this.f8959j;
                if (abstractC0801e != null) {
                    throw abstractC0801e;
                }
                AbstractC20800b.m21316d(c0803g == this.f8958i);
                this.f8952c.addLast(c0803g);
                if (!this.f8952c.isEmpty() && this.f8957h > 0) {
                    this.f8951b.notify();
                }
                this.f8958i = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m3822l(AbstractC0804h abstractC0804h) {
        synchronized (this.f8951b) {
            abstractC0804h.mo1838n();
            int i10 = this.f8957h;
            this.f8957h = i10 + 1;
            this.f8955f[i10] = abstractC0804h;
            if (!this.f8952c.isEmpty() && this.f8957h > 0) {
                this.f8951b.notify();
            }
        }
    }

    @Override // p031B3.InterfaceC0800d
    public final void release() {
        synchronized (this.f8951b) {
            this.f8961l = true;
            this.f8951b.notify();
        }
        try {
            this.f8950a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public C2983b(C0803g[] c0803gArr, AbstractC0804h[] abstractC0804hArr) {
        AbstractC0804h c2982a;
        C0803g c0803g;
        this.f8951b = new Object();
        this.f8962m = -9223372036854775807L;
        this.f8952c = new ArrayDeque();
        this.f8953d = new ArrayDeque();
        this.f8954e = c0803gArr;
        this.f8956g = c0803gArr.length;
        for (int i10 = 0; i10 < this.f8956g; i10++) {
            C0803g[] c0803gArr2 = this.f8954e;
            switch (this.f8963n) {
                case 0:
                    c0803g = new C0803g(1);
                    break;
                default:
                    c0803g = new C17160j(1);
                    break;
            }
            c0803gArr2[i10] = c0803g;
        }
        this.f8955f = abstractC0804hArr;
        this.f8957h = abstractC0804hArr.length;
        for (int i11 = 0; i11 < this.f8957h; i11++) {
            AbstractC0804h[] abstractC0804hArr2 = this.f8955f;
            switch (this.f8963n) {
                case 0:
                    c2982a = new C2982a(this);
                    break;
                default:
                    c2982a = new C17156f(this);
                    break;
            }
            abstractC0804hArr2[i11] = c2982a;
        }
        C0805i c0805i = new C0805i(this);
        this.f8950a = c0805i;
        c0805i.start();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2983b(C2385o c2385o) {
        this(new C0803g[1], new C2982a[1]);
        this.f8963n = 0;
        this.f8964o = c2385o;
    }

    @Override // p885m4.InterfaceC17158h
    /* JADX INFO: renamed from: c */
    public void mo3815c(long j10) {
    }
}
