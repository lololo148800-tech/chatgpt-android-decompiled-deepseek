package p084D4;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import p033B5.C0842z;
import p1072w2.AbstractC20798j;

/* JADX INFO: renamed from: D4.D */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1880D implements Runnable {

    /* JADX INFO: renamed from: q0 */
    public static final ThreadLocal f5464q0 = new ThreadLocal();

    /* JADX INFO: renamed from: r0 */
    public static final C0842z f5465r0 = new C0842z(5);

    /* JADX INFO: renamed from: Y */
    public ArrayList f5466Y;

    /* JADX INFO: renamed from: Z */
    public long f5467Z;

    /* JADX INFO: renamed from: o0 */
    public long f5468o0;

    /* JADX INFO: renamed from: p0 */
    public ArrayList f5469p0;

    /* JADX INFO: renamed from: c */
    public static AbstractC1933p0 m2863c(RecyclerView recyclerView, int i10, long j10) {
        int iM3076k = recyclerView.f33650t0.m3076k();
        for (int i11 = 0; i11 < iM3076k; i11++) {
            AbstractC1933p0 abstractC1933p0M12244L = RecyclerView.m12244L(recyclerView.f33650t0.m3075j(i11));
            if (abstractC1933p0M12244L.f5682c == i10 && !abstractC1933p0M12244L.m3093h()) {
                return null;
            }
        }
        C1911e0 c1911e0 = recyclerView.f33644q0;
        try {
            recyclerView.m12270T();
            AbstractC1933p0 abstractC1933p0M3036k = c1911e0.m3036k(i10, j10);
            if (abstractC1933p0M3036k != null) {
                if (!abstractC1933p0M3036k.m3092g() || abstractC1933p0M3036k.m3093h()) {
                    c1911e0.m3026a(abstractC1933p0M3036k, false);
                } else {
                    c1911e0.m3033h(abstractC1933p0M3036k.f5680a);
                }
            }
            return abstractC1933p0M3036k;
        } finally {
            recyclerView.m12271U(false);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2864a(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.f33602G0) {
            if (RecyclerView.f33580K1 && !this.f5466Y.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f5467Z == 0) {
                this.f5467Z = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        C1878B c1878b = recyclerView.f33645q1;
        c1878b.f5456b = i10;
        c1878b.f5457c = i11;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0135  */
    /* JADX INFO: renamed from: b */
    public final void m2865b(long j10) {
        C1879C c1879c;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C1879C c1879c2;
        ArrayList arrayList = this.f5466Y;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i11);
            if (recyclerView3.getWindowVisibility() == 0) {
                C1878B c1878b = recyclerView3.f33645q1;
                c1878b.m2862c(recyclerView3, false);
                i10 += c1878b.f5458d;
            }
        }
        ArrayList arrayList2 = this.f5469p0;
        arrayList2.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i13);
            if (recyclerView4.getWindowVisibility() == 0) {
                C1878B c1878b2 = recyclerView4.f33645q1;
                int iAbs = Math.abs(c1878b2.f5457c) + Math.abs(c1878b2.f5456b);
                for (int i14 = 0; i14 < c1878b2.f5458d * 2; i14 += 2) {
                    if (i12 >= arrayList2.size()) {
                        c1879c2 = new C1879C();
                        arrayList2.add(c1879c2);
                    } else {
                        c1879c2 = (C1879C) arrayList2.get(i12);
                    }
                    int[] iArr = c1878b2.f5455a;
                    int i15 = iArr[i14 + 1];
                    c1879c2.f5459a = i15 <= iAbs;
                    c1879c2.f5460b = iAbs;
                    c1879c2.f5461c = i15;
                    c1879c2.f5462d = recyclerView4;
                    c1879c2.f5463e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(arrayList2, f5465r0);
        for (int i16 = 0; i16 < arrayList2.size() && (recyclerView = (c1879c = (C1879C) arrayList2.get(i16)).f5462d) != null; i16++) {
            AbstractC1933p0 abstractC1933p0M2863c = m2863c(recyclerView, c1879c.f5463e, c1879c.f5459a ? Long.MAX_VALUE : j10);
            if (abstractC1933p0M2863c != null && abstractC1933p0M2863c.f5681b != null && abstractC1933p0M2863c.m3092g() && !abstractC1933p0M2863c.m3093h() && (recyclerView2 = (RecyclerView) abstractC1933p0M2863c.f5681b.get()) != null) {
                if (recyclerView2.f33616Q0 && recyclerView2.f33650t0.m3076k() != 0) {
                    AbstractC1897V abstractC1897V = recyclerView2.f33625Z0;
                    if (abstractC1897V != null) {
                        abstractC1897V.mo2913e();
                    }
                    AbstractC1900Y abstractC1900Y = recyclerView2.f33592B0;
                    C1911e0 c1911e0 = recyclerView2.f33644q0;
                    if (abstractC1900Y != null) {
                        abstractC1900Y.m2955f0(c1911e0);
                        recyclerView2.f33592B0.m2956g0(c1911e0);
                    }
                    c1911e0.f5586a.clear();
                    c1911e0.m3031f();
                }
                C1878B c1878b3 = recyclerView2.f33645q1;
                c1878b3.m2862c(recyclerView2, true);
                if (c1878b3.f5458d != 0) {
                    try {
                        int i17 = AbstractC20798j.f66061a;
                        Trace.beginSection("RV Nested Prefetch");
                        C1925l0 c1925l0 = recyclerView2.f33647r1;
                        AbstractC1893Q abstractC1893Q = recyclerView2.f33590A0;
                        c1925l0.f5639d = 1;
                        c1925l0.f5640e = abstractC1893Q.mo2898a();
                        c1925l0.f5642g = false;
                        c1925l0.f5643h = false;
                        c1925l0.f5644i = false;
                        for (int i18 = 0; i18 < c1878b3.f5458d * 2; i18 += 2) {
                            m2863c(recyclerView2, c1878b3.f5455a[i18], j10);
                        }
                        Trace.endSection();
                    } catch (Throwable th2) {
                        int i19 = AbstractC20798j.f66061a;
                        Trace.endSection();
                        throw th2;
                    }
                }
            }
            c1879c.f5459a = false;
            c1879c.f5460b = 0;
            c1879c.f5461c = 0;
            c1879c.f5462d = null;
            c1879c.f5463e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i10 = AbstractC20798j.f66061a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f5466Y;
            if (arrayList.isEmpty()) {
                this.f5467Z = 0L;
                return;
            }
            int size = arrayList.size();
            long jMax = 0;
            for (int i11 = 0; i11 < size; i11++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i11);
                if (recyclerView.getWindowVisibility() == 0) {
                    jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                }
            }
            if (jMax == 0) {
                this.f5467Z = 0L;
            } else {
                m2865b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f5468o0);
                this.f5467Z = 0L;
            }
        } finally {
            this.f5467Z = 0L;
            int i12 = AbstractC20798j.f66061a;
            Trace.endSection();
        }
    }
}
