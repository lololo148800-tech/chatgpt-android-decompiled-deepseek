package p349O0;

import kotlin.jvm.internal.AbstractC16544l;
import p392Q0.C6546d;
import p586Y0.AbstractC9544C;
import p586Y0.AbstractC9556h;
import p586Y0.AbstractC9562n;
import p586Y0.InterfaceC9542A;
import p692d0.AbstractC12955H;
import p692d0.C12948A;

/* JADX INFO: renamed from: O0.B */
/* JADX INFO: loaded from: classes.dex */
public final class C5942B extends AbstractC9544C {

    /* JADX INFO: renamed from: h */
    public static final Object f19340h = new Object();

    /* JADX INFO: renamed from: c */
    public int f19341c;

    /* JADX INFO: renamed from: d */
    public int f19342d;

    /* JADX INFO: renamed from: e */
    public C12948A f19343e;

    /* JADX INFO: renamed from: f */
    public Object f19344f;

    /* JADX INFO: renamed from: g */
    public int f19345g;

    public C5942B() {
        C12948A c12948a = AbstractC12955H.f41148a;
        AbstractC16544l.m18092e(c12948a, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
        this.f19343e = c12948a;
        this.f19344f = f19340h;
    }

    @Override // p586Y0.AbstractC9544C
    /* JADX INFO: renamed from: a */
    public final void mo6337a(AbstractC9544C abstractC9544C) {
        AbstractC16544l.m18092e(abstractC9544C, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
        C5942B c5942b = (C5942B) abstractC9544C;
        this.f19343e = c5942b.f19343e;
        this.f19344f = c5942b.f19344f;
        this.f19345g = c5942b.f19345g;
    }

    @Override // p586Y0.AbstractC9544C
    /* JADX INFO: renamed from: b */
    public final AbstractC9544C mo6338b() {
        return new C5942B();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m6339c(C5944C c5944c, AbstractC9556h abstractC9556h) {
        boolean z6;
        boolean z10;
        Object obj = AbstractC9562n.f28759b;
        synchronized (obj) {
            z6 = true;
            z10 = (this.f19341c == abstractC9556h.mo10044d() && this.f19342d == abstractC9556h.mo10048h()) ? false : true;
        }
        if (this.f19344f == f19340h || (z10 && this.f19345g != m6340d(c5944c, abstractC9556h))) {
            z6 = false;
        }
        if (z6 && z10) {
            synchronized (obj) {
                this.f19341c = abstractC9556h.mo10044d();
                this.f19342d = abstractC9556h.mo10048h();
            }
        }
        return z6;
    }

    /* JADX INFO: renamed from: d */
    public final int m6340d(C5944C c5944c, AbstractC9556h abstractC9556h) throws Throwable {
        C12948A c12948a;
        int i10;
        int i11;
        int i12;
        int i13;
        AbstractC9544C abstractC9544CM10086j;
        synchronized (AbstractC9562n.f28759b) {
            c12948a = this.f19343e;
        }
        char c9 = 7;
        if (c12948a.f41113e == 0) {
            return 7;
        }
        C6546d c6546dM6420G = C5997d.m6420G();
        int i14 = c6546dM6420G.f21184o0;
        int i15 = 1;
        if (i14 > 0) {
            Object[] objArr = c6546dM6420G.f21182Y;
            int i16 = 0;
            do {
                ((C6019o) objArr[i16]).m6505b();
                i16++;
            } while (i16 < i14);
        }
        try {
            Object[] objArr2 = c12948a.f41110b;
            int[] iArr = c12948a.f41111c;
            long[] jArr = c12948a.f41109a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int iIdentityHashCode = 7;
                int i17 = 0;
                while (true) {
                    long j10 = jArr[i17];
                    if ((((~j10) << c9) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i18 = 8;
                        int i19 = 8 - ((~(i17 - length)) >>> 31);
                        int i20 = 0;
                        while (i20 < i19) {
                            if ((j10 & 255) < 128) {
                                int i21 = (i17 << 3) + i20;
                                InterfaceC9542A interfaceC9542A = (InterfaceC9542A) objArr2[i21];
                                if (iArr[i21] == i15) {
                                    if (interfaceC9542A instanceof C5944C) {
                                        C5944C c5944c2 = (C5944C) interfaceC9542A;
                                        i10 = 0;
                                        try {
                                            abstractC9544CM10086j = c5944c2.m6346g((C5942B) AbstractC9562n.m10086j(c5944c2.f19358p0, abstractC9556h), abstractC9556h, false, c5944c2.f19356Z);
                                        } catch (Throwable th2) {
                                            th = th2;
                                            int i22 = c6546dM6420G.f21184o0;
                                            if (i22 > 0) {
                                                Object[] objArr3 = c6546dM6420G.f21182Y;
                                                int i23 = i10;
                                                do {
                                                    ((C6019o) objArr3[i23]).m6504a();
                                                    i23++;
                                                } while (i23 < i22);
                                            }
                                            throw th;
                                        }
                                    } else {
                                        abstractC9544CM10086j = AbstractC9562n.m10086j(interfaceC9542A.mo6345f(), abstractC9556h);
                                    }
                                    iIdentityHashCode = (((iIdentityHashCode * 31) + System.identityHashCode(abstractC9544CM10086j)) * 31) + abstractC9544CM10086j.f28702a;
                                }
                                i13 = 8;
                            } else {
                                i13 = i18;
                            }
                            j10 >>= i13;
                            i20++;
                            i18 = i13;
                            i15 = 1;
                        }
                        i11 = 0;
                        if (i19 != i18) {
                            break;
                        }
                    } else {
                        i11 = 0;
                    }
                    if (i17 == length) {
                        break;
                    }
                    i17++;
                    c9 = 7;
                    i15 = 1;
                }
                i12 = iIdentityHashCode;
            } else {
                i11 = 0;
                i12 = 7;
            }
            int i24 = c6546dM6420G.f21184o0;
            if (i24 <= 0) {
                return i12;
            }
            Object[] objArr4 = c6546dM6420G.f21182Y;
            int i25 = i11;
            do {
                ((C6019o) objArr4[i25]).m6504a();
                i25++;
            } while (i25 < i24);
            return i12;
        } catch (Throwable th3) {
            th = th3;
            i10 = 0;
        }
    }
}
