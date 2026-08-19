package p110E4;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.internal.AbstractC16544l;
import p207I4.InterfaceC3618e;
import p207I4.InterfaceC3619f;

/* JADX INFO: renamed from: E4.m */
/* JADX INFO: loaded from: classes.dex */
public final class C2315m implements InterfaceC3619f, InterfaceC3618e {

    /* JADX INFO: renamed from: u0 */
    public static final TreeMap f7199u0 = new TreeMap();

    /* JADX INFO: renamed from: Y */
    public final int f7200Y;

    /* JADX INFO: renamed from: Z */
    public volatile String f7201Z;

    /* JADX INFO: renamed from: o0 */
    public final long[] f7202o0;

    /* JADX INFO: renamed from: p0 */
    public final double[] f7203p0;

    /* JADX INFO: renamed from: q0 */
    public final String[] f7204q0;

    /* JADX INFO: renamed from: r0 */
    public final byte[][] f7205r0;

    /* JADX INFO: renamed from: s0 */
    public final int[] f7206s0;

    /* JADX INFO: renamed from: t0 */
    public int f7207t0;

    public C2315m(int i10) {
        this.f7200Y = i10;
        int i11 = i10 + 1;
        this.f7206s0 = new int[i11];
        this.f7202o0 = new long[i11];
        this.f7203p0 = new double[i11];
        this.f7204q0 = new String[i11];
        this.f7205r0 = new byte[i11][];
    }

    /* JADX INFO: renamed from: a */
    public static final C2315m m3418a(int i10, String query) {
        AbstractC16544l.m18094g(query, "query");
        TreeMap treeMap = f7199u0;
        synchronized (treeMap) {
            Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i10));
            if (entryCeilingEntry == null) {
                C2315m c2315m = new C2315m(i10);
                c2315m.f7201Z = query;
                c2315m.f7207t0 = i10;
                return c2315m;
            }
            treeMap.remove(entryCeilingEntry.getKey());
            C2315m c2315m2 = (C2315m) entryCeilingEntry.getValue();
            c2315m2.getClass();
            c2315m2.f7201Z = query;
            c2315m2.f7207t0 = i10;
            return c2315m2;
        }
    }

    @Override // p207I4.InterfaceC3618e
    /* JADX INFO: renamed from: I */
    public final void mo3419I(int i10, double d10) {
        this.f7206s0[i10] = 3;
        this.f7203p0[i10] = d10;
    }

    @Override // p207I4.InterfaceC3618e
    /* JADX INFO: renamed from: V */
    public final void mo3420V(int i10, long j10) {
        this.f7206s0[i10] = 2;
        this.f7202o0[i10] = j10;
    }

    @Override // p207I4.InterfaceC3618e
    /* JADX INFO: renamed from: Y */
    public final void mo3421Y(int i10, byte[] bArr) {
        this.f7206s0[i10] = 5;
        this.f7205r0[i10] = bArr;
    }

    @Override // p207I4.InterfaceC3618e
    /* JADX INFO: renamed from: c */
    public final void mo3422c(int i10, String value) {
        AbstractC16544l.m18094g(value, "value");
        this.f7206s0[i10] = 4;
        this.f7204q0[i10] = value;
    }

    @Override // p207I4.InterfaceC3619f
    /* JADX INFO: renamed from: e */
    public final void mo3423e(InterfaceC3618e interfaceC3618e) {
        int i10 = this.f7207t0;
        if (1 > i10) {
            return;
        }
        int i11 = 1;
        while (true) {
            int i12 = this.f7206s0[i11];
            if (i12 == 1) {
                interfaceC3618e.mo3426s0(i11);
            } else if (i12 == 2) {
                interfaceC3618e.mo3420V(i11, this.f7202o0[i11]);
            } else if (i12 == 3) {
                interfaceC3618e.mo3419I(i11, this.f7203p0[i11]);
            } else if (i12 == 4) {
                String str = this.f7204q0[i11];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                interfaceC3618e.mo3422c(i11, str);
            } else if (i12 == 5) {
                byte[] bArr = this.f7205r0[i11];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                interfaceC3618e.mo3421Y(i11, bArr);
            }
            if (i11 == i10) {
                return;
            } else {
                i11++;
            }
        }
    }

    @Override // p207I4.InterfaceC3619f
    /* JADX INFO: renamed from: k */
    public final String mo3424k() {
        String str = this.f7201Z;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX INFO: renamed from: m */
    public final void m3425m() {
        TreeMap treeMap = f7199u0;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f7200Y), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                AbstractC16544l.m18093f(it, "queryPool.descendingKeySet().iterator()");
                while (true) {
                    int i10 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i10;
                }
            }
        }
    }

    @Override // p207I4.InterfaceC3618e
    /* JADX INFO: renamed from: s0 */
    public final void mo3426s0(int i10) {
        this.f7206s0[i10] = 1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
