package p488Tn;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.org.webrtc.WebrtcBuildVersion;
import p1113xn.AbstractC21329w;

/* JADX INFO: renamed from: Tn.h */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7525h {

    /* JADX INFO: renamed from: a */
    public static final C7524g f23861a = new C7524g(new byte[0], 0, 0, null);

    /* JADX INFO: renamed from: b */
    public static final int f23862b;

    /* JADX INFO: renamed from: c */
    public static final int f23863c;

    /* JADX INFO: renamed from: d */
    public static final int f23864d;

    /* JADX INFO: renamed from: e */
    public static final int f23865e;

    /* JADX INFO: renamed from: f */
    public static final AtomicReferenceArray f23866f;

    /* JADX INFO: renamed from: g */
    public static final AtomicReferenceArray f23867g;

    static {
        int iIntValue;
        int i10 = 0;
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f23862b = iHighestOneBit;
        int i11 = iHighestOneBit / 2;
        int i12 = i11 >= 1 ? i11 : 1;
        f23863c = i12;
        String property = System.getProperty("kotlinx.io.pool.size.bytes", AbstractC16544l.m18089b(System.getProperty("java.vm.name"), "Dalvik") ? WebrtcBuildVersion.maint_version : "4194304");
        AbstractC16544l.m18093f(property, "getProperty(...)");
        Integer numM21736w = AbstractC21329w.m21736w(property);
        if (numM21736w != null && (iIntValue = numM21736w.intValue()) >= 0) {
            i10 = iIntValue;
        }
        f23864d = i10;
        int i13 = i10 / i12;
        if (i13 < 8192) {
            i13 = 8192;
        }
        f23865e = i13;
        f23866f = new AtomicReferenceArray(iHighestOneBit);
        f23867g = new AtomicReferenceArray(i12);
    }

    /* JADX INFO: renamed from: a */
    public static final void m7833a(C7524g segment) {
        AbstractC16544l.m18094g(segment, "segment");
        if (segment.f23859f != null || segment.f23860g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        AbstractC7527j abstractC7527j = segment.f23857d;
        if (abstractC7527j != null) {
            C7523f c7523f = (C7523f) abstractC7527j;
            if (c7523f.f23853b != 0) {
                int iDecrementAndGet = C7523f.f23852c.decrementAndGet(c7523f);
                if (iDecrementAndGet >= 0) {
                    return;
                }
                if (iDecrementAndGet != -1) {
                    throw new IllegalStateException(("Shared copies count is negative: " + (iDecrementAndGet + 1)).toString());
                }
                c7523f.f23853b = 0;
            }
        }
        AtomicReferenceArray atomicReferenceArray = f23866f;
        int id2 = (int) ((((long) f23862b) - 1) & Thread.currentThread().getId());
        segment.f23855b = 0;
        segment.f23858e = true;
        while (true) {
            C7524g c7524g = (C7524g) atomicReferenceArray.get(id2);
            C7524g c7524g2 = f23861a;
            if (c7524g != c7524g2) {
                int i10 = c7524g != null ? c7524g.f23856c : 0;
                if (i10 < 65536) {
                    segment.f23859f = c7524g;
                    segment.f23856c = i10 + 8192;
                    while (!atomicReferenceArray.compareAndSet(id2, c7524g, segment)) {
                        if (atomicReferenceArray.get(id2) != c7524g) {
                        }
                    }
                    return;
                }
                if (f23864d <= 0) {
                    return;
                }
                segment.f23855b = 0;
                segment.f23858e = true;
                int id3 = (int) ((((long) f23863c) - 1) & Thread.currentThread().getId());
                AtomicReferenceArray atomicReferenceArray2 = f23867g;
                int i11 = 0;
                while (true) {
                    C7524g c7524g3 = (C7524g) atomicReferenceArray2.get(id3);
                    if (c7524g3 != c7524g2) {
                        int i12 = (c7524g3 != null ? c7524g3.f23856c : 0) + 8192;
                        if (i12 <= f23865e) {
                            segment.f23859f = c7524g3;
                            segment.f23856c = i12;
                            while (!atomicReferenceArray2.compareAndSet(id3, c7524g3, segment)) {
                                if (atomicReferenceArray2.get(id3) != c7524g3) {
                                }
                            }
                            return;
                        }
                        int i13 = f23863c;
                        if (i11 >= i13) {
                            return;
                        }
                        i11++;
                        id3 = (id3 + 1) & (i13 - 1);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static final C7524g m7834b() {
        C7524g c7524g;
        C7524g c7524g2;
        AtomicReferenceArray atomicReferenceArray = f23866f;
        int id2 = (int) ((((long) f23862b) - 1) & Thread.currentThread().getId());
        do {
            c7524g = f23861a;
            c7524g2 = (C7524g) atomicReferenceArray.getAndSet(id2, c7524g);
        } while (AbstractC16544l.m18089b(c7524g2, c7524g));
        if (c7524g2 != null) {
            atomicReferenceArray.set(id2, c7524g2.f23859f);
            c7524g2.f23859f = null;
            c7524g2.f23856c = 0;
            return c7524g2;
        }
        atomicReferenceArray.set(id2, null);
        if (f23864d <= 0) {
            return new C7524g();
        }
        AtomicReferenceArray atomicReferenceArray2 = f23867g;
        int i10 = f23863c;
        int id3 = (int) (Thread.currentThread().getId() & (((long) i10) - 1));
        int i11 = 0;
        while (true) {
            C7524g c7524g3 = (C7524g) atomicReferenceArray2.getAndSet(id3, c7524g);
            if (!AbstractC16544l.m18089b(c7524g3, c7524g)) {
                if (c7524g3 != null) {
                    atomicReferenceArray2.set(id3, c7524g3.f23859f);
                    c7524g3.f23859f = null;
                    c7524g3.f23856c = 0;
                    return c7524g3;
                }
                atomicReferenceArray2.set(id3, null);
                if (i11 >= i10) {
                    return new C7524g();
                }
                id3 = (id3 + 1) & (i10 - 1);
                i11++;
            }
        }
    }
}
