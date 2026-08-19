package p026Ao;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Ao.H */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0659H {

    /* JADX INFO: renamed from: a */
    public static final C0658G f1931a = new C0658G(new byte[0], 0, 0, false, false);

    /* JADX INFO: renamed from: b */
    public static final int f1932b;

    /* JADX INFO: renamed from: c */
    public static final AtomicReference[] f1933c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f1932b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i10 = 0; i10 < iHighestOneBit; i10++) {
            atomicReferenceArr[i10] = new AtomicReference();
        }
        f1933c = atomicReferenceArr;
    }

    /* JADX INFO: renamed from: a */
    public static final void m1368a(C0658G segment) {
        AbstractC16544l.m18094g(segment, "segment");
        if (segment.f1929f != null || segment.f1930g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (segment.f1927d) {
            return;
        }
        AtomicReference atomicReference = f1933c[(int) (Thread.currentThread().getId() & (((long) f1932b) - 1))];
        C0658G c0658g = f1931a;
        C0658G c0658g2 = (C0658G) atomicReference.getAndSet(c0658g);
        if (c0658g2 == c0658g) {
            return;
        }
        int i10 = c0658g2 != null ? c0658g2.f1926c : 0;
        if (i10 >= 65536) {
            atomicReference.set(c0658g2);
            return;
        }
        segment.f1929f = c0658g2;
        segment.f1925b = 0;
        segment.f1926c = i10 + 8192;
        atomicReference.set(segment);
    }

    /* JADX INFO: renamed from: b */
    public static final C0658G m1369b() {
        AtomicReference atomicReference = f1933c[(int) (Thread.currentThread().getId() & (((long) f1932b) - 1))];
        C0658G c0658g = f1931a;
        C0658G c0658g2 = (C0658G) atomicReference.getAndSet(c0658g);
        if (c0658g2 == c0658g) {
            return new C0658G();
        }
        if (c0658g2 == null) {
            atomicReference.set(null);
            return new C0658G();
        }
        atomicReference.set(c0658g2.f1929f);
        c0658g2.f1929f = null;
        c0658g2.f1926c = 0;
        return c0658g2;
    }
}
