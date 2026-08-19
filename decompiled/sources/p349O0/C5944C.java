package p349O0;

import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p229J0.C4041e;
import p392Q0.C6546d;
import p537W0.C8412d;
import p586Y0.AbstractC9543B;
import p586Y0.AbstractC9544C;
import p586Y0.AbstractC9556h;
import p586Y0.AbstractC9562n;
import p586Y0.AbstractC9567s;
import p586Y0.InterfaceC9542A;
import p658b5.C11242m;
import p692d0.C12948A;

/* JADX INFO: renamed from: O0.C */
/* JADX INFO: loaded from: classes.dex */
public final class C5944C extends AbstractC9543B implements InterfaceC5982V0 {

    /* JADX INFO: renamed from: Z */
    public final InterfaceC1426a f19356Z;

    /* JADX INFO: renamed from: o0 */
    public final InterfaceC5959J0 f19357o0;

    /* JADX INFO: renamed from: p0 */
    public C5942B f19358p0 = new C5942B();

    public C5944C(InterfaceC1426a interfaceC1426a, InterfaceC5959J0 interfaceC5959J0) {
        this.f19356Z = interfaceC1426a;
        this.f19357o0 = interfaceC5959J0;
    }

    @Override // p586Y0.InterfaceC9542A
    /* JADX INFO: renamed from: f */
    public final AbstractC9544C mo6345f() {
        return this.f19358p0;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x00a4 A[EDGE_INSN: B:110:0x00a4->B:34:0x00a4 BREAK  A[LOOP:1: B:18:0x004b->B:33:0x009d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x009b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x009d A[Catch: all -> 0x003a, LOOP:1: B:18:0x004b->B:33:0x009d, LOOP_END, TryCatch #1 {all -> 0x003a, blocks: (B:10:0x0025, B:12:0x0031, B:15:0x003d, B:18:0x004b, B:20:0x005e, B:22:0x006a, B:24:0x0074, B:26:0x008a, B:29:0x0091, B:33:0x009d, B:34:0x00a4), top: B:104:0x0025 }] */
    /* JADX INFO: renamed from: g */
    public final C5942B m6346g(C5942B c5942b, AbstractC9556h abstractC9556h, boolean z6, InterfaceC1426a interfaceC1426a) {
        int i10;
        InterfaceC5959J0 interfaceC5959J0;
        int i11;
        C5942B c5942b2 = c5942b;
        if (!c5942b2.m6339c(this, abstractC9556h)) {
            C12948A c12948a = new C12948A();
            C11242m c11242m = AbstractC5961K0.f19405a;
            C8412d c8412d = (C8412d) c11242m.m12621z();
            if (c8412d == null) {
                i10 = 0;
                c8412d = new C8412d(0);
                c11242m.m12607I(c8412d);
            } else {
                i10 = 0;
            }
            C8412d c8412d2 = c8412d;
            int i12 = c8412d2.f26158a;
            C6546d c6546dM6420G = C5997d.m6420G();
            int i13 = c6546dM6420G.f21184o0;
            if (i13 > 0) {
                Object[] objArr = c6546dM6420G.f21182Y;
                int i14 = i10;
                do {
                    ((C6019o) objArr[i14]).m6505b();
                    i14++;
                } while (i14 < i13);
            }
            try {
                c8412d2.f26158a = i12 + 1;
                Object objM10110f = AbstractC9567s.m10110f(interfaceC1426a, new C4041e(this, c8412d2, c12948a, i12, 1));
                c8412d2.f26158a = i12;
                int i15 = c6546dM6420G.f21184o0;
                if (i15 > 0) {
                    Object[] objArr2 = c6546dM6420G.f21182Y;
                    do {
                        ((C6019o) objArr2[i10]).m6504a();
                        i10++;
                    } while (i10 < i15);
                }
                Object obj = AbstractC9562n.f28759b;
                synchronized (obj) {
                    try {
                        AbstractC9556h abstractC9556hM10087k = AbstractC9562n.m10087k();
                        Object obj2 = c5942b2.f19344f;
                        if (obj2 == C5942B.f19340h || (interfaceC5959J0 = this.f19357o0) == null || !interfaceC5959J0.mo6393a(objM10110f, obj2)) {
                            c5942b2 = (C5942B) AbstractC9562n.m10090n(this.f19358p0, this, abstractC9556hM10087k);
                            c5942b2.f19343e = c12948a;
                            c5942b2.f19345g = c5942b2.m6340d(this, abstractC9556hM10087k);
                            c5942b2.f19344f = objM10110f;
                        } else {
                            c5942b2.f19343e = c12948a;
                            c5942b2.f19345g = c5942b2.m6340d(this, abstractC9556hM10087k);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                C8412d c8412d3 = (C8412d) AbstractC5961K0.f19405a.m12621z();
                if (c8412d3 != null && c8412d3.f26158a == 0) {
                    AbstractC9562n.m10087k().mo10052m();
                    synchronized (obj) {
                        AbstractC9556h abstractC9556hM10087k2 = AbstractC9562n.m10087k();
                        c5942b2.f19341c = abstractC9556hM10087k2.mo10044d();
                        c5942b2.f19342d = abstractC9556hM10087k2.mo10048h();
                    }
                }
                return c5942b2;
            } catch (Throwable th3) {
                int i16 = c6546dM6420G.f21184o0;
                if (i16 > 0) {
                    Object[] objArr3 = c6546dM6420G.f21182Y;
                    do {
                        ((C6019o) objArr3[i10]).m6504a();
                        i10++;
                    } while (i10 < i16);
                }
                throw th3;
            }
        }
        if (z6) {
            C6546d c6546dM6420G2 = C5997d.m6420G();
            int i17 = c6546dM6420G2.f21184o0;
            if (i17 > 0) {
                Object[] objArr4 = c6546dM6420G2.f21182Y;
                int i18 = 0;
                do {
                    ((C6019o) objArr4[i18]).m6505b();
                    i18++;
                } while (i18 < i17);
            }
            try {
                C12948A c12948a2 = c5942b2.f19343e;
                C11242m c11242m2 = AbstractC5961K0.f19405a;
                C8412d c8412d4 = (C8412d) c11242m2.m12621z();
                if (c8412d4 == null) {
                    c8412d4 = new C8412d(0);
                    c11242m2.m12607I(c8412d4);
                }
                int i19 = c8412d4.f26158a;
                Object[] objArr5 = c12948a2.f41110b;
                int[] iArr = c12948a2.f41111c;
                long[] jArr = c12948a2.f41109a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i20 = 0;
                    while (true) {
                        long j10 = jArr[i20];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i20 != length) {
                                break;
                                break;
                            }
                            i20++;
                        } else {
                            int i21 = 8;
                            int i22 = 8 - ((~(i20 - length)) >>> 31);
                            int i23 = 0;
                            while (i23 < i22) {
                                if ((j10 & 255) < 128) {
                                    int i24 = (i20 << 3) + i23;
                                    InterfaceC9542A interfaceC9542A = (InterfaceC9542A) objArr5[i24];
                                    c8412d4.f26158a = i19 + iArr[i24];
                                    InterfaceC1436k interfaceC1436kMo10046f = abstractC9556h.mo10046f();
                                    if (interfaceC1436kMo10046f != null) {
                                        interfaceC1436kMo10046f.invoke(interfaceC9542A);
                                    }
                                    i11 = 8;
                                } else {
                                    i11 = i21;
                                }
                                j10 >>= i11;
                                i23++;
                                i21 = i11;
                            }
                            if (i22 != i21) {
                                break;
                            }
                            if (i20 != length) {
                                break;
                            }
                            i20++;
                        }
                    }
                }
                c8412d4.f26158a = i19;
                int i25 = c6546dM6420G2.f21184o0;
                if (i25 > 0) {
                    Object[] objArr6 = c6546dM6420G2.f21182Y;
                    int i26 = 0;
                    do {
                        ((C6019o) objArr6[i26]).m6504a();
                        i26++;
                    } while (i26 < i25);
                }
            } catch (Throwable th4) {
                int i27 = c6546dM6420G2.f21184o0;
                if (i27 > 0) {
                    Object[] objArr7 = c6546dM6420G2.f21182Y;
                    int i28 = 0;
                    do {
                        ((C6019o) objArr7[i28]).m6504a();
                        i28++;
                    } while (i28 < i27);
                }
                throw th4;
            }
        }
        return c5942b2;
    }

    @Override // p349O0.InterfaceC5982V0
    public final Object getValue() {
        InterfaceC1436k interfaceC1436kMo10046f = AbstractC9562n.m10087k().mo10046f();
        if (interfaceC1436kMo10046f != null) {
            interfaceC1436kMo10046f.invoke(this);
        }
        AbstractC9556h abstractC9556hM10087k = AbstractC9562n.m10087k();
        return m6346g((C5942B) AbstractC9562n.m10086j(this.f19358p0, abstractC9556hM10087k), abstractC9556hM10087k, true, this.f19356Z).f19344f;
    }

    /* JADX INFO: renamed from: h */
    public final C5942B m6347h() {
        AbstractC9556h abstractC9556hM10087k = AbstractC9562n.m10087k();
        return m6346g((C5942B) AbstractC9562n.m10086j(this.f19358p0, abstractC9556hM10087k), abstractC9556hM10087k, false, this.f19356Z);
    }

    @Override // p586Y0.InterfaceC9542A
    /* JADX INFO: renamed from: p */
    public final void mo6348p(AbstractC9544C abstractC9544C) {
        AbstractC16544l.m18092e(abstractC9544C, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.f19358p0 = (C5942B) abstractC9544C;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DerivedState(value=");
        C5942B c5942b = (C5942B) AbstractC9562n.m10085i(this.f19358p0);
        sb2.append(c5942b.m6339c(this, AbstractC9562n.m10087k()) ? String.valueOf(c5942b.f19344f) : "<Not calculated>");
        sb2.append(")@");
        sb2.append(hashCode());
        return sb2.toString();
    }
}
