package p080D0;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.C0227a;
import p017Af.C0485p;
import p1095x1.InterfaceC21098s;
import p1139z0.C21585H;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6002f0;
import p562X0.AbstractC9020o;
import p692d0.AbstractC12975n;
import p692d0.C12985x;
import p909nm.AbstractC17685s;

/* JADX INFO: renamed from: D0.o0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1821o0 implements InterfaceC1815l0 {

    /* JADX INFO: renamed from: l */
    public static final C21585H f5241l;

    /* JADX INFO: renamed from: a */
    public boolean f5242a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f5243b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final C12985x f5244c;

    /* JADX INFO: renamed from: d */
    public final AtomicLong f5245d;

    /* JADX INFO: renamed from: e */
    public C1842z f5246e;

    /* JADX INFO: renamed from: f */
    public C0485p f5247f;

    /* JADX INFO: renamed from: g */
    public C1795b0 f5248g;

    /* JADX INFO: renamed from: h */
    public C1840y f5249h;

    /* JADX INFO: renamed from: i */
    public C1842z f5250i;

    /* JADX INFO: renamed from: j */
    public C1842z f5251j;

    /* JADX INFO: renamed from: k */
    public final C6002f0 f5252k;

    static {
        C1819n0 c1819n0 = C1819n0.f5234Y;
        C1787V c1787v = C1787V.f5122p0;
        C21585H c21585h = AbstractC9020o.f27518a;
        f5241l = new C21585H(c1819n0, 10, c1787v);
    }

    public C1821o0(long j10) {
        C12985x c12985x = AbstractC12975n.f41185a;
        this.f5244c = new C12985x();
        this.f5245d = new AtomicLong(j10);
        C12985x c12985x2 = AbstractC12975n.f41185a;
        AbstractC16544l.m18092e(c12985x2, "null cannot be cast to non-null type androidx.collection.LongObjectMap<V of androidx.collection.LongObjectMapKt.emptyLongObjectMap>");
        this.f5252k = C5997d.m6430Q(c12985x2, C5975S.f19448r0);
    }

    /* JADX INFO: renamed from: a */
    public final C12985x m2648a() {
        return (C12985x) this.f5252k.getValue();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m2649b(InterfaceC21098s interfaceC21098s, long j10, long j11, C1826r c1826r, boolean z6) {
        C1795b0 c1795b0 = this.f5248g;
        if (c1795b0 == null) {
            return true;
        }
        C1803f0 c1803f0 = c1795b0.f5146Y;
        long jM2589a = C1803f0.m2589a(c1803f0, interfaceC21098s, j10);
        long jM2589a2 = C1803f0.m2589a(c1803f0, interfaceC21098s, j11);
        c1803f0.m2600l(z6);
        return c1803f0.m2603o(jM2589a, jM2589a2, false, c1826r);
    }

    /* JADX INFO: renamed from: c */
    public final ArrayList m2650c(InterfaceC21098s interfaceC21098s) {
        boolean z6 = this.f5242a;
        ArrayList arrayList = this.f5243b;
        if (!z6) {
            AbstractC17685s.m19392u(arrayList, new C1817m0(new C0227a(interfaceC21098s, 5), 0));
            this.f5242a = true;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public final void m2651d(C1816m c1816m) {
        int iNumberOfTrailingZeros;
        long j10 = c1816m.f5227a;
        C12985x c12985x = this.f5244c;
        if (c12985x.m14709b(j10)) {
            this.f5243b.remove(c1816m);
            long j11 = c1816m.f5227a;
            int i10 = ((int) ((j11 >>> 32) ^ j11)) * (-862048943);
            int i11 = i10 ^ (i10 << 16);
            int i12 = i11 & 127;
            int i13 = c12985x.f41224d;
            int i14 = (i11 >>> 7) & i13;
            int i15 = 0;
            loop0: while (true) {
                long[] jArr = c12985x.f41221a;
                int i16 = i14 >> 3;
                int i17 = (i14 & 7) << 3;
                long j12 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
                long j13 = (((long) i12) * 72340172838076673L) ^ j12;
                for (long j14 = (~j13) & (j13 - 72340172838076673L) & (-9187201950435737472L); j14 != 0; j14 &= j14 - 1) {
                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j14) >> 3) + i14) & i13;
                    if (c12985x.f41222b[iNumberOfTrailingZeros] == j11) {
                        break loop0;
                    }
                }
                if ((j12 & ((~j12) << 6) & (-9187201950435737472L)) != 0) {
                    iNumberOfTrailingZeros = -1;
                    break;
                } else {
                    i15 += 8;
                    i14 = (i14 + i15) & i13;
                }
            }
            if (iNumberOfTrailingZeros >= 0) {
                c12985x.f41225e--;
                long[] jArr2 = c12985x.f41221a;
                int i18 = c12985x.f41224d;
                int i19 = iNumberOfTrailingZeros >> 3;
                int i20 = (iNumberOfTrailingZeros & 7) << 3;
                long j15 = (jArr2[i19] & (~(255 << i20))) | (254 << i20);
                jArr2[i19] = j15;
                jArr2[(((iNumberOfTrailingZeros - 7) & i18) + (i18 & 7)) >> 3] = j15;
                Object[] objArr = c12985x.f41223c;
                Object obj = objArr[iNumberOfTrailingZeros];
                objArr[iNumberOfTrailingZeros] = null;
            }
            C1842z c1842z = this.f5251j;
            if (c1842z != null) {
                c1842z.invoke(Long.valueOf(j11));
            }
        }
    }
}
