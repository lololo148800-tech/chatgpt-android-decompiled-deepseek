package p329N3;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.SystemClock;
import p051Bo.C1458d;
import p057C3.C1556e;
import p1073w3.AbstractC20817s;
import p1073w3.C20813o;
import p232J3.InterfaceC4220U;

/* JADX INFO: renamed from: N3.o */
/* JADX INFO: loaded from: classes.dex */
public final class C5625o {

    /* JADX INFO: renamed from: a */
    public final C5622l f18251a;

    /* JADX INFO: renamed from: b */
    public final C5629s f18252b;

    /* JADX INFO: renamed from: c */
    public boolean f18253c;

    /* JADX INFO: renamed from: f */
    public long f18256f;

    /* JADX INFO: renamed from: i */
    public boolean f18259i;

    /* JADX INFO: renamed from: d */
    public int f18254d = 0;

    /* JADX INFO: renamed from: e */
    public long f18255e = -9223372036854775807L;

    /* JADX INFO: renamed from: g */
    public long f18257g = -9223372036854775807L;

    /* JADX INFO: renamed from: h */
    public long f18258h = -9223372036854775807L;

    /* JADX INFO: renamed from: j */
    public float f18260j = 1.0f;

    /* JADX INFO: renamed from: k */
    public C20813o f18261k = C20813o.f66098a;

    public C5625o(Context context, C5622l c5622l) {
        this.f18251a = c5622l;
        this.f18252b = new C5629s(context);
    }

    /* JADX WARN: Code duplicated, block: B:125:0x023b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e0  */
    /* JADX INFO: renamed from: a */
    public final int m6029a(long j10, long j11, long j12, long j13, boolean z6, C1458d c1458d) {
        boolean z10;
        long j14;
        boolean z11;
        long j15;
        long j16;
        boolean z12;
        c1458d.f3833b = -9223372036854775807L;
        c1458d.f3834c = -9223372036854775807L;
        if (this.f18255e == -9223372036854775807L) {
            this.f18255e = j11;
        }
        boolean z13 = false;
        if (this.f18257g != j10) {
            C5629s c5629s = this.f18252b;
            long j17 = c5629s.f18282n;
            if (j17 != -1) {
                c5629s.f18284p = j17;
                c5629s.f18285q = c5629s.f18283o;
            }
            c5629s.f18281m++;
            long j18 = j10 * 1000;
            C5618h c5618h = c5629s.f18269a;
            c5618h.f18198a.m6007b(j18);
            if (c5618h.f18198a.m6006a()) {
                c5618h.f18200c = false;
            } else if (c5618h.f18201d != -9223372036854775807L) {
                if (c5618h.f18200c) {
                    C5617g c5617g = c5618h.f18199b;
                    long j19 = c5617g.f18193d;
                    if (j19 == 0) {
                        z12 = false;
                    } else {
                        z12 = c5617g.f18196g[(int) ((j19 - 1) % 15)];
                    }
                    if (z12) {
                        c5618h.f18199b.m6008c();
                        c5618h.f18199b.m6007b(c5618h.f18201d);
                    }
                } else {
                    c5618h.f18199b.m6008c();
                    c5618h.f18199b.m6007b(c5618h.f18201d);
                }
                c5618h.f18200c = true;
                c5618h.f18199b.m6007b(j18);
            }
            if (c5618h.f18200c && c5618h.f18199b.m6006a()) {
                C5617g c5617g2 = c5618h.f18198a;
                c5618h.f18198a = c5618h.f18199b;
                c5618h.f18199b = c5617g2;
                c5618h.f18200c = false;
            }
            c5618h.f18201d = j18;
            c5618h.f18202e = c5618h.f18198a.m6006a() ? 0 : c5618h.f18202e + 1;
            c5629s.m6038c();
            this.f18257g = j10;
        }
        long jM21390D = (long) ((j10 - j11) / ((double) this.f18260j));
        if (this.f18253c) {
            this.f18261k.getClass();
            jM21390D -= AbstractC20817s.m21390D(SystemClock.elapsedRealtime()) - j12;
        }
        c1458d.f3833b = jM21390D;
        if (this.f18258h == -9223372036854775807L || this.f18259i) {
            int i10 = this.f18254d;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException();
                        }
                        this.f18261k.getClass();
                        long jM21390D2 = AbstractC20817s.m21390D(SystemClock.elapsedRealtime()) - this.f18256f;
                        if (!this.f18253c || jM21390D >= -30000 || jM21390D2 <= 100000) {
                            z10 = false;
                        }
                    } else if (j11 < j13) {
                        z10 = false;
                    }
                }
                z10 = true;
            } else {
                z10 = this.f18253c;
            }
        } else {
            z10 = false;
        }
        if (z10) {
            return 0;
        }
        if (!this.f18253c || j11 == this.f18255e) {
            return 5;
        }
        this.f18261k.getClass();
        long jNanoTime = System.nanoTime();
        C5629s c5629s2 = this.f18252b;
        long j20 = c1458d.f3833b;
        Long.signum(j20);
        long j21 = (j20 * 1000) + jNanoTime;
        if (c5629s2.f18284p == -1 || !c5629s2.f18269a.f18198a.m6006a()) {
            j14 = jNanoTime;
        } else {
            C5618h c5618h2 = c5629s2.f18269a;
            if (c5618h2.f18198a.m6006a()) {
                C5617g c5617g3 = c5618h2.f18198a;
                long j22 = c5617g3.f18194e;
                j16 = j22 == 0 ? 0L : c5617g3.f18195f / j22;
            } else {
                j16 = -9223372036854775807L;
            }
            j14 = jNanoTime;
            long j23 = c5629s2.f18285q + ((long) (((c5629s2.f18281m - c5629s2.f18284p) * j16) / c5629s2.f18277i));
            if (Math.abs(j21 - j23) <= 20000000) {
                j21 = j23;
            } else {
                c5629s2.f18281m = 0L;
                c5629s2.f18284p = -1L;
                c5629s2.f18282n = -1L;
            }
        }
        c5629s2.f18282n = c5629s2.f18281m;
        c5629s2.f18283o = j21;
        ChoreographerFrameCallbackC5628r choreographerFrameCallbackC5628r = c5629s2.f18271c;
        if (choreographerFrameCallbackC5628r != null && c5629s2.f18279k != -9223372036854775807L) {
            long j24 = choreographerFrameCallbackC5628r.f18265Y;
            if (j24 != -9223372036854775807L) {
                long j25 = c5629s2.f18279k;
                long j26 = (((j21 - j24) / j25) * j25) + j24;
                if (j21 <= j26) {
                    j15 = j26 - j25;
                } else {
                    j15 = j26;
                    j26 = j25 + j26;
                }
                if (j26 - j21 >= j21 - j15) {
                    j26 = j15;
                }
                j21 = j26 - c5629s2.f18280l;
            }
        }
        c1458d.f3834c = j21;
        long j27 = (j21 - j14) / 1000;
        c1458d.f3833b = j27;
        boolean z14 = (this.f18258h == -9223372036854775807L || this.f18259i) ? false : true;
        C5622l c5622l = this.f18251a;
        if (j27 >= -500000 || z6) {
            z11 = false;
        } else {
            InterfaceC4220U interfaceC4220U = c5622l.f4303u0;
            interfaceC4220U.getClass();
            int iMo4943c = interfaceC4220U.mo4943c(j11 - c5622l.f4305w0);
            if (iMo4943c == 0) {
                z11 = false;
            } else {
                if (z14) {
                    C1556e c1556e = c5622l.f9742L1;
                    c1556e.f4314d += iMo4943c;
                    c1556e.f4316f += c5622l.f18230m2;
                } else {
                    c5622l.f9742L1.f4320j++;
                    c5622l.m6021G0(iMo4943c, c5622l.f18230m2);
                }
                if (c5622l.m4093J()) {
                    c5622l.m4099T();
                }
                C5615e c5615e = c5622l.f18219b2;
                if (c5615e != null) {
                    c5615e.m6000a(false);
                }
                z11 = true;
            }
        }
        if (z11) {
            return 4;
        }
        long j28 = c1458d.f3833b;
        if (j28 < -30000 && !z6) {
            z13 = true;
        }
        if (z13) {
            return z14 ? 3 : 2;
        }
        return j28 > 50000 ? 5 : 1;
    }

    /* JADX INFO: renamed from: b */
    public final void m6030b(boolean z6) {
        this.f18259i = z6;
        this.f18261k.getClass();
        this.f18258h = SystemClock.elapsedRealtime() + 5000;
    }

    /* JADX INFO: renamed from: c */
    public final void m6031c(int i10) {
        this.f18254d = Math.min(this.f18254d, i10);
    }

    /* JADX INFO: renamed from: d */
    public final void m6032d() {
        this.f18253c = true;
        this.f18261k.getClass();
        this.f18256f = AbstractC20817s.m21390D(SystemClock.elapsedRealtime());
        C5629s c5629s = this.f18252b;
        c5629s.f18272d = true;
        c5629s.f18281m = 0L;
        c5629s.f18284p = -1L;
        c5629s.f18282n = -1L;
        C5627q c5627q = c5629s.f18270b;
        if (c5627q != null) {
            ChoreographerFrameCallbackC5628r choreographerFrameCallbackC5628r = c5629s.f18271c;
            choreographerFrameCallbackC5628r.getClass();
            choreographerFrameCallbackC5628r.f18266Z.sendEmptyMessage(2);
            Handler handlerM21411l = AbstractC20817s.m21411l(null);
            DisplayManager displayManager = c5627q.f18262a;
            displayManager.registerDisplayListener(c5627q, handlerM21411l);
            C5629s.m6036a(c5627q.f18263b, displayManager.getDisplay(0));
        }
        c5629s.m6039d(false);
    }

    /* JADX INFO: renamed from: e */
    public final void m6033e() {
        this.f18253c = false;
        this.f18258h = -9223372036854775807L;
        C5629s c5629s = this.f18252b;
        c5629s.f18272d = false;
        C5627q c5627q = c5629s.f18270b;
        if (c5627q != null) {
            c5627q.f18262a.unregisterDisplayListener(c5627q);
            ChoreographerFrameCallbackC5628r choreographerFrameCallbackC5628r = c5629s.f18271c;
            choreographerFrameCallbackC5628r.getClass();
            choreographerFrameCallbackC5628r.f18266Z.sendEmptyMessage(3);
        }
        c5629s.m6037b();
    }

    /* JADX INFO: renamed from: f */
    public final void m6034f(float f10) {
        C5629s c5629s = this.f18252b;
        c5629s.f18274f = f10;
        C5618h c5618h = c5629s.f18269a;
        c5618h.f18198a.m6008c();
        c5618h.f18199b.m6008c();
        c5618h.f18200c = false;
        c5618h.f18201d = -9223372036854775807L;
        c5618h.f18202e = 0;
        c5629s.m6038c();
    }
}
