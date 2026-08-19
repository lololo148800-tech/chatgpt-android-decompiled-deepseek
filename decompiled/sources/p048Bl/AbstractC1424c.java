package p048Bl;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Bl.c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1424c implements InterfaceC1425d {

    /* JADX INFO: renamed from: q0 */
    public static final /* synthetic */ AtomicLongFieldUpdater f3806q0 = AtomicLongFieldUpdater.newUpdater(AbstractC1424c.class, "top");

    /* JADX INFO: renamed from: Y */
    public final int f3807Y;

    /* JADX INFO: renamed from: Z */
    public final int f3808Z;

    /* JADX INFO: renamed from: o0 */
    public final AtomicReferenceArray f3809o0;

    /* JADX INFO: renamed from: p0 */
    public final int[] f3810p0;
    private volatile /* synthetic */ long top = 0;

    public AbstractC1424c() {
        int iHighestOneBit = Integer.highestOneBit(511) * 2;
        this.f3807Y = iHighestOneBit;
        this.f3808Z = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
        int i10 = iHighestOneBit + 1;
        this.f3809o0 = new AtomicReferenceArray(i10);
        this.f3810p0 = new int[i10];
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo2049a();

    @Override // java.lang.AutoCloseable
    public final void close() {
        while (m2051k() != null) {
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m2050e(Object instance) {
        long j10;
        long j11;
        AbstractC16544l.m18094g(instance, "instance");
        int iIdentityHashCode = ((System.identityHashCode(instance) * (-1640531527)) >>> this.f3808Z) + 1;
        for (int i10 = 0; i10 < 8; i10++) {
            AtomicReferenceArray atomicReferenceArray = this.f3809o0;
            do {
                if (atomicReferenceArray.compareAndSet(iIdentityHashCode, null, instance)) {
                    if (iIdentityHashCode <= 0) {
                        throw new IllegalArgumentException("index should be positive");
                    }
                    do {
                        j10 = this.top;
                        j11 = ((((j10 >> 32) & 4294967295L) + 1) << 32) | ((long) iIdentityHashCode);
                        this.f3810p0[iIdentityHashCode] = (int) (4294967295L & j10);
                    } while (!f3806q0.compareAndSet(this, j10, j11));
                    return;
                }
            } while (atomicReferenceArray.get(iIdentityHashCode) == null);
            iIdentityHashCode--;
            if (iIdentityHashCode == 0) {
                iIdentityHashCode = this.f3807Y;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final Object m2051k() {
        int i10;
        while (true) {
            long j10 = this.top;
            i10 = 0;
            if (j10 == 0) {
                break;
            }
            long j11 = ((j10 >> 32) & 4294967295L) + 1;
            int i11 = (int) (4294967295L & j10);
            if (i11 == 0) {
                break;
            }
            if (f3806q0.compareAndSet(this, j10, (j11 << 32) | ((long) this.f3810p0[i11]))) {
                i10 = i11;
                break;
            }
        }
        if (i10 == 0) {
            return null;
        }
        return this.f3809o0.getAndSet(i10, null);
    }
}
