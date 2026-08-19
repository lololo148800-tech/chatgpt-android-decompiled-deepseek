package p586Y0;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC16544l;
import p013Ab.C0420b;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p117Eb.C2388r;
import p193Hf.C3331S0;
import p349O0.C5944C;
import p349O0.C5990Z0;
import p349O0.C5999e;
import p392Q0.C6548f;
import p658b5.C11242m;
import p692d0.C12954G;
import p909nm.AbstractC17678l;
import p909nm.C17689w;

/* JADX INFO: renamed from: Y0.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9562n {

    /* JADX INFO: renamed from: a */
    public static final C11242m f28758a = new C11242m(7);

    /* JADX INFO: renamed from: b */
    public static final Object f28759b = new Object();

    /* JADX INFO: renamed from: c */
    public static C9560l f28760c;

    /* JADX INFO: renamed from: d */
    public static int f28761d;

    /* JADX INFO: renamed from: e */
    public static final C2388r f28762e;

    /* JADX INFO: renamed from: f */
    public static final C0420b f28763f;

    /* JADX INFO: renamed from: g */
    public static Object f28764g;

    /* JADX INFO: renamed from: h */
    public static Object f28765h;

    /* JADX INFO: renamed from: i */
    public static final AtomicReference f28766i;

    /* JADX INFO: renamed from: j */
    public static final AbstractC9556h f28767j;

    /* JADX INFO: renamed from: k */
    public static final C5999e f28768k;

    /* JADX WARN: Type inference failed for: r3v1, types: [int[], java.io.Serializable] */
    static {
        C9560l c9560l = C9560l.f28750q0;
        f28760c = c9560l;
        f28761d = 2;
        C2388r c2388r = new C2388r();
        c2388r.f7421c = new int[16];
        c2388r.f7422d = new int[16];
        int[] iArr = new int[16];
        int i10 = 0;
        while (i10 < 16) {
            int i11 = i10 + 1;
            iArr[i10] = i11;
            i10 = i11;
        }
        c2388r.f7423e = iArr;
        f28762e = c2388r;
        C0420b c0420b = new C0420b((char) 0, 8);
        c0420b.f1382o0 = new int[16];
        c0420b.f1383p0 = new C5990Z0[16];
        f28763f = c0420b;
        C17689w c17689w = C17689w.f56480Y;
        f28764g = c17689w;
        f28765h = c17689w;
        int i12 = f28761d;
        f28761d = i12 + 1;
        C9549a c9549a = new C9549a(i12, c9560l);
        f28760c = f28760c.m10076q(c9549a.f28739b);
        AtomicReference atomicReference = new AtomicReference(c9549a);
        f28766i = atomicReference;
        f28767j = (AbstractC9556h) atomicReference.get();
        f28768k = new C5999e(0);
    }

    /* JADX INFO: renamed from: a */
    public static final void m10077a() {
        m10082f(C9561m.f28755Z);
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC1436k m10078b(InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2) {
        if (interfaceC1436k == null || interfaceC1436k2 == null || interfaceC1436k == interfaceC1436k2) {
            return interfaceC1436k == null ? interfaceC1436k2 : interfaceC1436k;
        }
        return new C3331S0(interfaceC1436k, interfaceC1436k2, 3);
    }

    /* JADX INFO: renamed from: c */
    public static final HashMap m10079c(C9550b c9550b, C9550b c9550b2, C9560l c9560l) {
        long[] jArr;
        int i10;
        C9560l c9560l2;
        long[] jArr2;
        C12954G c12954gMo10059w = c9550b2.mo10059w();
        int iMo10044d = c9550b.mo10044d();
        if (c12954gMo10059w != null) {
            C9560l c9560lM10075p = c9550b2.mo10045e().m10076q(c9550b2.mo10044d()).m10075p(c9550b2.f28727j);
            Object[] objArr = c12954gMo10059w.f41144b;
            long[] jArr3 = c12954gMo10059w.f41143a;
            int length = jArr3.length - 2;
            if (length < 0) {
                return null;
            }
            int i11 = 0;
            HashMap map = null;
            while (true) {
                long j10 = jArr3[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8;
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((255 & j10) < 128) {
                            InterfaceC9542A interfaceC9542A = (InterfaceC9542A) objArr[(i11 << 3) + i14];
                            AbstractC9544C abstractC9544CMo6345f = interfaceC9542A.mo6345f();
                            AbstractC9544C abstractC9544CM10096t = m10096t(abstractC9544CMo6345f, iMo10044d, c9560l);
                            if (abstractC9544CM10096t == null) {
                                jArr2 = jArr3;
                            } else {
                                jArr2 = jArr3;
                                AbstractC9544C abstractC9544CM10096t2 = m10096t(abstractC9544CMo6345f, iMo10044d, c9560lM10075p);
                                if (abstractC9544CM10096t2 != null && !abstractC9544CM10096t.equals(abstractC9544CM10096t2)) {
                                    AbstractC9544C abstractC9544CM10096t3 = m10096t(abstractC9544CMo6345f, c9550b2.mo10044d(), c9550b2.mo10045e());
                                    if (abstractC9544CM10096t3 == null) {
                                        m10095s();
                                        throw null;
                                    }
                                    AbstractC9544C abstractC9544CMo6408j = interfaceC9542A.mo6408j(abstractC9544CM10096t2, abstractC9544CM10096t, abstractC9544CM10096t3);
                                    if (abstractC9544CMo6408j != null) {
                                        if (map == null) {
                                            map = new HashMap();
                                        }
                                        map.put(abstractC9544CM10096t, abstractC9544CMo6408j);
                                        map = map;
                                    }
                                }
                            }
                        } else {
                            jArr2 = jArr3;
                        }
                        j10 >>= 8;
                        i14++;
                        i12 = 8;
                        jArr3 = jArr2;
                        iMo10044d = iMo10044d;
                        c9560lM10075p = c9560lM10075p;
                    }
                    jArr = jArr3;
                    i10 = iMo10044d;
                    c9560l2 = c9560lM10075p;
                    if (i13 == i12) {
                    }
                    return map;
                }
                jArr = jArr3;
                i10 = iMo10044d;
                c9560l2 = c9560lM10075p;
                if (i11 == length) {
                    return map;
                }
                i11++;
                jArr3 = jArr;
                iMo10044d = i10;
                c9560lM10075p = c9560l2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static final void m10080d(AbstractC9556h abstractC9556h) {
        int i10;
        if (f28760c.m10074m(abstractC9556h.mo10044d())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("Snapshot is not open: id=");
        sb2.append(abstractC9556h.mo10044d());
        sb2.append(", disposed=");
        sb2.append(abstractC9556h.f28740c);
        sb2.append(", applied=");
        C9550b c9550b = abstractC9556h instanceof C9550b ? (C9550b) abstractC9556h : null;
        sb2.append(c9550b != null ? Boolean.valueOf(c9550b.f28730m) : "read-only");
        sb2.append(", lowestPin=");
        synchronized (f28759b) {
            C2388r c2388r = f28762e;
            i10 = c2388r.f7419a > 0 ? ((int[]) c2388r.f7421c)[0] : -1;
        }
        sb2.append(i10);
        throw new IllegalStateException(sb2.toString().toString());
    }

    /* JADX INFO: renamed from: e */
    public static final C9560l m10081e(C9560l c9560l, int i10, int i11) {
        while (i10 < i11) {
            c9560l = c9560l.m10076q(i10);
            i10++;
        }
        return c9560l;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00a3 A[LOOP:1: B:30:0x0069->B:43:0x00a3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6 A[EDGE_INSN: B:58:0x00a6->B:44:0x00a6 BREAK  A[LOOP:1: B:30:0x0069->B:43:0x00a3], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: f */
    public static final Object m10082f(InterfaceC1436k interfaceC1436k) {
        Object obj;
        C12954G c12954g;
        Object objM10099w;
        AbstractC9556h abstractC9556h = f28767j;
        AbstractC16544l.m18092e(abstractC9556h, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.GlobalSnapshot");
        synchronized (f28759b) {
            try {
                obj = f28766i.get();
                c12954g = ((C9549a) obj).f28725h;
                if (c12954g != null) {
                    f28768k.addAndGet(1);
                }
                objM10099w = m10099w((AbstractC9556h) obj, interfaceC1436k);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (c12954g != null) {
            try {
                ?? r6 = f28764g;
                int size = r6.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((InterfaceC1439n) r6.get(i10)).invoke(new C6548f(c12954g), obj);
                }
                f28768k.addAndGet(-1);
            } catch (Throwable th3) {
                f28768k.addAndGet(-1);
                throw th3;
            }
        }
        synchronized (f28759b) {
            m10083g();
            if (c12954g != null) {
                Object[] objArr = c12954g.f41144b;
                long[] jArr = c12954g.f41143a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i11 = 0;
                    while (true) {
                        long j10 = jArr[i11];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i11 != length) {
                                break;
                                break;
                            }
                            i11++;
                        } else {
                            int i12 = 8 - ((~(i11 - length)) >>> 31);
                            for (int i13 = 0; i13 < i12; i13++) {
                                if ((255 & j10) < 128) {
                                    m10094r((InterfaceC9542A) objArr[(i11 << 3) + i13]);
                                }
                                j10 >>= 8;
                            }
                            if (i12 != 8) {
                                break;
                            }
                            if (i11 != length) {
                                break;
                            }
                            i11++;
                        }
                    }
                }
            }
        }
        return objM10099w;
    }

    /* JADX INFO: renamed from: g */
    public static final void m10083g() {
        C0420b c0420b = f28763f;
        int i10 = c0420b.f1381Z;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            C5990Z0 c5990z0 = ((C5990Z0[]) c0420b.f1383p0)[i11];
            Object obj = c5990z0 != null ? c5990z0.get() : null;
            if (obj != null && m10093q((InterfaceC9542A) obj)) {
                if (i12 != i11) {
                    ((C5990Z0[]) c0420b.f1383p0)[i12] = c5990z0;
                    int[] iArr = (int[]) c0420b.f1382o0;
                    iArr[i12] = iArr[i11];
                }
                i12++;
            }
            i11++;
        }
        for (int i13 = i12; i13 < i10; i13++) {
            ((C5990Z0[]) c0420b.f1383p0)[i13] = null;
            ((int[]) c0420b.f1382o0)[i13] = 0;
        }
        if (i12 != i10) {
            c0420b.f1381Z = i12;
        }
    }

    /* JADX INFO: renamed from: h */
    public static final AbstractC9556h m10084h(AbstractC9556h abstractC9556h, InterfaceC1436k interfaceC1436k, boolean z6) {
        boolean z10 = abstractC9556h instanceof C9550b;
        if (z10 || abstractC9556h == null) {
            return new C9547F(z10 ? (C9550b) abstractC9556h : null, interfaceC1436k, null, false, z6);
        }
        return new C9548G(abstractC9556h, interfaceC1436k, z6);
    }

    /* JADX INFO: renamed from: i */
    public static final AbstractC9544C m10085i(AbstractC9544C abstractC9544C) {
        AbstractC9544C abstractC9544CM10096t;
        AbstractC9556h abstractC9556hM10087k = m10087k();
        AbstractC9544C abstractC9544CM10096t2 = m10096t(abstractC9544C, abstractC9556hM10087k.mo10044d(), abstractC9556hM10087k.mo10045e());
        if (abstractC9544CM10096t2 != null) {
            return abstractC9544CM10096t2;
        }
        synchronized (f28759b) {
            AbstractC9556h abstractC9556hM10087k2 = m10087k();
            abstractC9544CM10096t = m10096t(abstractC9544C, abstractC9556hM10087k2.mo10044d(), abstractC9556hM10087k2.mo10045e());
        }
        if (abstractC9544CM10096t != null) {
            return abstractC9544CM10096t;
        }
        m10095s();
        throw null;
    }

    /* JADX INFO: renamed from: j */
    public static final AbstractC9544C m10086j(AbstractC9544C abstractC9544C, AbstractC9556h abstractC9556h) {
        AbstractC9544C abstractC9544CM10096t = m10096t(abstractC9544C, abstractC9556h.mo10044d(), abstractC9556h.mo10045e());
        if (abstractC9544CM10096t != null) {
            return abstractC9544CM10096t;
        }
        m10095s();
        throw null;
    }

    /* JADX INFO: renamed from: k */
    public static final AbstractC9556h m10087k() {
        AbstractC9556h abstractC9556h = (AbstractC9556h) f28758a.m12621z();
        return abstractC9556h == null ? (AbstractC9556h) f28766i.get() : abstractC9556h;
    }

    /* JADX INFO: renamed from: l */
    public static final InterfaceC1436k m10088l(boolean z6, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2) {
        if (!z6) {
            interfaceC1436k2 = null;
        }
        if (interfaceC1436k == null || interfaceC1436k2 == null || interfaceC1436k == interfaceC1436k2) {
            return interfaceC1436k == null ? interfaceC1436k2 : interfaceC1436k;
        }
        return new C3331S0(interfaceC1436k, interfaceC1436k2, 2);
    }

    /* JADX INFO: renamed from: m */
    public static final AbstractC9544C m10089m(AbstractC9544C abstractC9544C, InterfaceC9542A interfaceC9542A) {
        int i10 = f28761d;
        C2388r c2388r = f28762e;
        if (c2388r.f7419a > 0) {
            i10 = ((int[]) c2388r.f7421c)[0];
        }
        int i11 = i10 - 1;
        C9560l c9560l = C9560l.f28750q0;
        AbstractC9544C abstractC9544C2 = null;
        AbstractC9544C abstractC9544C3 = null;
        for (AbstractC9544C abstractC9544CMo6345f = interfaceC9542A.mo6345f(); abstractC9544CMo6345f != null; abstractC9544CMo6345f = abstractC9544CMo6345f.f28703b) {
            int i12 = abstractC9544CMo6345f.f28702a;
            if (i12 != 0) {
                if (i12 != 0 && i12 <= i11 && !c9560l.m10074m(i12)) {
                    if (abstractC9544C3 != null) {
                        if (abstractC9544CMo6345f.f28702a >= abstractC9544C3.f28702a) {
                            abstractC9544C2 = abstractC9544C3;
                            break;
                        }
                        break;
                    }
                    abstractC9544C3 = abstractC9544CMo6345f;
                }
            }
            abstractC9544C2 = abstractC9544CMo6345f;
            break;
        }
        if (abstractC9544C2 != null) {
            abstractC9544C2.f28702a = Integer.MAX_VALUE;
            return abstractC9544C2;
        }
        AbstractC9544C abstractC9544CMo6338b = abstractC9544C.mo6338b();
        abstractC9544CMo6338b.f28702a = Integer.MAX_VALUE;
        abstractC9544CMo6338b.f28703b = interfaceC9542A.mo6345f();
        interfaceC9542A.mo6348p(abstractC9544CMo6338b);
        return abstractC9544CMo6338b;
    }

    /* JADX INFO: renamed from: n */
    public static final AbstractC9544C m10090n(AbstractC9544C abstractC9544C, C5944C c5944c, AbstractC9556h abstractC9556h) {
        AbstractC9544C abstractC9544CM10089m;
        synchronized (f28759b) {
            abstractC9544CM10089m = m10089m(abstractC9544C, c5944c);
            abstractC9544CM10089m.mo6337a(abstractC9544C);
            abstractC9544CM10089m.f28702a = abstractC9556h.mo10044d();
        }
        return abstractC9544CM10089m;
    }

    /* JADX INFO: renamed from: o */
    public static final void m10091o(AbstractC9556h abstractC9556h, InterfaceC9542A interfaceC9542A) {
        abstractC9556h.mo10056s(abstractC9556h.mo10048h() + 1);
        InterfaceC1436k interfaceC1436kMo10049i = abstractC9556h.mo10049i();
        if (interfaceC1436kMo10049i != null) {
            interfaceC1436kMo10049i.invoke(interfaceC9542A);
        }
    }

    /* JADX INFO: renamed from: p */
    public static final AbstractC9544C m10092p(AbstractC9544C abstractC9544C, AbstractC9543B abstractC9543B, AbstractC9556h abstractC9556h, AbstractC9544C abstractC9544C2) {
        AbstractC9544C abstractC9544CM10089m;
        if (abstractC9556h.mo10047g()) {
            abstractC9556h.mo10053n(abstractC9543B);
        }
        int iMo10044d = abstractC9556h.mo10044d();
        if (abstractC9544C2.f28702a == iMo10044d) {
            return abstractC9544C2;
        }
        synchronized (f28759b) {
            abstractC9544CM10089m = m10089m(abstractC9544C, abstractC9543B);
        }
        abstractC9544CM10089m.f28702a = iMo10044d;
        if (abstractC9544C2.f28702a != 1) {
            abstractC9556h.mo10053n(abstractC9543B);
        }
        return abstractC9544CM10089m;
    }

    /* JADX INFO: renamed from: q */
    public static final boolean m10093q(InterfaceC9542A interfaceC9542A) {
        AbstractC9544C abstractC9544C;
        int i10 = f28761d;
        C2388r c2388r = f28762e;
        if (c2388r.f7419a > 0) {
            i10 = ((int[]) c2388r.f7421c)[0];
        }
        AbstractC9544C abstractC9544C2 = null;
        AbstractC9544C abstractC9544CMo6345f = null;
        int i11 = 0;
        for (AbstractC9544C abstractC9544CMo6345f2 = interfaceC9542A.mo6345f(); abstractC9544CMo6345f2 != null; abstractC9544CMo6345f2 = abstractC9544CMo6345f2.f28703b) {
            int i12 = abstractC9544CMo6345f2.f28702a;
            if (i12 != 0) {
                if (i12 >= i10) {
                    i11++;
                } else if (abstractC9544C2 == null) {
                    i11++;
                    abstractC9544C2 = abstractC9544CMo6345f2;
                } else {
                    if (i12 < abstractC9544C2.f28702a) {
                        abstractC9544C = abstractC9544C2;
                        abstractC9544C2 = abstractC9544CMo6345f2;
                    } else {
                        abstractC9544C = abstractC9544CMo6345f2;
                    }
                    if (abstractC9544CMo6345f == null) {
                        abstractC9544CMo6345f = interfaceC9542A.mo6345f();
                        AbstractC9544C abstractC9544C3 = abstractC9544CMo6345f;
                        while (true) {
                            if (abstractC9544CMo6345f == null) {
                                abstractC9544CMo6345f = abstractC9544C3;
                                break;
                            }
                            int i13 = abstractC9544CMo6345f.f28702a;
                            if (i13 >= i10) {
                                break;
                            }
                            if (abstractC9544C3.f28702a < i13) {
                                abstractC9544C3 = abstractC9544CMo6345f;
                            }
                            abstractC9544CMo6345f = abstractC9544CMo6345f.f28703b;
                        }
                    }
                    abstractC9544C2.f28702a = 0;
                    abstractC9544C2.mo6337a(abstractC9544CMo6345f);
                    abstractC9544C2 = abstractC9544C;
                }
            }
        }
        return i11 > 1;
    }

    /* JADX INFO: renamed from: r */
    public static final void m10094r(InterfaceC9542A interfaceC9542A) {
        if (m10093q(interfaceC9542A)) {
            C0420b c0420b = f28763f;
            int i10 = c0420b.f1381Z;
            int iIdentityHashCode = System.identityHashCode(interfaceC9542A);
            int i11 = -1;
            if (i10 > 0) {
                int i12 = c0420b.f1381Z - 1;
                int i13 = 0;
                while (true) {
                    if (i13 <= i12) {
                        int i14 = (i13 + i12) >>> 1;
                        int i15 = ((int[]) c0420b.f1382o0)[i14];
                        if (i15 >= iIdentityHashCode) {
                            if (i15 <= iIdentityHashCode) {
                                C5990Z0 c5990z0 = ((C5990Z0[]) c0420b.f1383p0)[i14];
                                if (interfaceC9542A != (c5990z0 != null ? c5990z0.get() : null)) {
                                    int i16 = i14 - 1;
                                    while (true) {
                                        if (-1 >= i16 || ((int[]) c0420b.f1382o0)[i16] != iIdentityHashCode) {
                                            int i17 = c0420b.f1381Z;
                                            i16 = i14 + 1;
                                            while (true) {
                                                if (i16 >= i17) {
                                                    i16 = -(c0420b.f1381Z + 1);
                                                    break;
                                                } else {
                                                    if (((int[]) c0420b.f1382o0)[i16] != iIdentityHashCode) {
                                                        i16 = -(i16 + 1);
                                                        break;
                                                    }
                                                    C5990Z0 c5990z1 = ((C5990Z0[]) c0420b.f1383p0)[i16];
                                                    if ((c5990z1 != null ? c5990z1.get() : null) == interfaceC9542A) {
                                                        break;
                                                    } else {
                                                        i16++;
                                                    }
                                                }
                                            }
                                        } else {
                                            C5990Z0 c5990z2 = ((C5990Z0[]) c0420b.f1383p0)[i16];
                                            if ((c5990z2 != null ? c5990z2.get() : null) == interfaceC9542A) {
                                                break;
                                            } else {
                                                i16--;
                                            }
                                        }
                                    }
                                    i11 = i16;
                                    break;
                                }
                                i11 = i14;
                                break;
                            }
                            i12 = i14 - 1;
                        } else {
                            i13 = i14 + 1;
                        }
                    } else {
                        i11 = -(i13 + 1);
                        break;
                    }
                }
                if (i11 >= 0) {
                    return;
                }
            }
            int i18 = -(i11 + 1);
            C5990Z0[] c5990z0Arr = (C5990Z0[]) c0420b.f1383p0;
            int length = c5990z0Arr.length;
            if (i10 == length) {
                int i19 = length * 2;
                C5990Z0[] c5990z0Arr2 = new C5990Z0[i19];
                int[] iArr = new int[i19];
                int i20 = i18 + 1;
                AbstractC17678l.m19304k(i20, i18, i10, c5990z0Arr, c5990z0Arr2);
                AbstractC17678l.m19308o(0, i18, 6, (C5990Z0[]) c0420b.f1383p0, c5990z0Arr2);
                AbstractC17678l.m19303j(i20, i18, i10, (int[]) c0420b.f1382o0, iArr);
                AbstractC17678l.m19307n(0, i18, 6, (int[]) c0420b.f1382o0, iArr);
                c0420b.f1383p0 = c5990z0Arr2;
                c0420b.f1382o0 = iArr;
            } else {
                int i21 = i18 + 1;
                AbstractC17678l.m19304k(i21, i18, i10, c5990z0Arr, c5990z0Arr);
                int[] iArr2 = (int[]) c0420b.f1382o0;
                AbstractC17678l.m19303j(i21, i18, i10, iArr2, iArr2);
            }
            ((C5990Z0[]) c0420b.f1383p0)[i18] = new C5990Z0(interfaceC9542A);
            ((int[]) c0420b.f1382o0)[i18] = iIdentityHashCode;
            c0420b.f1381Z++;
        }
    }

    /* JADX INFO: renamed from: s */
    public static final void m10095s() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    /* JADX INFO: renamed from: t */
    public static final AbstractC9544C m10096t(AbstractC9544C abstractC9544C, int i10, C9560l c9560l) {
        AbstractC9544C abstractC9544C2 = null;
        while (abstractC9544C != null) {
            int i11 = abstractC9544C.f28702a;
            if (i11 != 0 && i11 <= i10 && !c9560l.m10074m(i11) && (abstractC9544C2 == null || abstractC9544C2.f28702a < abstractC9544C.f28702a)) {
                abstractC9544C2 = abstractC9544C;
            }
            abstractC9544C = abstractC9544C.f28703b;
        }
        if (abstractC9544C2 != null) {
            return abstractC9544C2;
        }
        return null;
    }

    /* JADX INFO: renamed from: u */
    public static final AbstractC9544C m10097u(AbstractC9544C abstractC9544C, InterfaceC9542A interfaceC9542A) {
        AbstractC9544C abstractC9544CM10096t;
        AbstractC9556h abstractC9556hM10087k = m10087k();
        InterfaceC1436k interfaceC1436kMo10046f = abstractC9556hM10087k.mo10046f();
        if (interfaceC1436kMo10046f != null) {
            interfaceC1436kMo10046f.invoke(interfaceC9542A);
        }
        AbstractC9544C abstractC9544CM10096t2 = m10096t(abstractC9544C, abstractC9556hM10087k.mo10044d(), abstractC9556hM10087k.mo10045e());
        if (abstractC9544CM10096t2 != null) {
            return abstractC9544CM10096t2;
        }
        synchronized (f28759b) {
            AbstractC9556h abstractC9556hM10087k2 = m10087k();
            AbstractC9544C abstractC9544CMo6345f = interfaceC9542A.mo6345f();
            AbstractC16544l.m18092e(abstractC9544CMo6345f, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable$lambda$9");
            abstractC9544CM10096t = m10096t(abstractC9544CMo6345f, abstractC9556hM10087k2.mo10044d(), abstractC9556hM10087k2.mo10045e());
            if (abstractC9544CM10096t == null) {
                m10095s();
                throw null;
            }
        }
        return abstractC9544CM10096t;
    }

    /* JADX INFO: renamed from: v */
    public static final void m10098v(int i10) {
        int i11;
        C2388r c2388r = f28762e;
        int i12 = ((int[]) c2388r.f7423e)[i10];
        c2388r.m3500n(i12, c2388r.f7419a - 1);
        c2388r.f7419a--;
        int[] iArr = (int[]) c2388r.f7421c;
        int i13 = iArr[i12];
        int i14 = i12;
        while (i14 > 0) {
            int i15 = ((i14 + 1) >> 1) - 1;
            if (iArr[i15] <= i13) {
                break;
            }
            c2388r.m3500n(i15, i14);
            i14 = i15;
        }
        int[] iArr2 = (int[]) c2388r.f7421c;
        int i16 = c2388r.f7419a >> 1;
        while (i12 < i16) {
            int i17 = (i12 + 1) << 1;
            int i18 = i17 - 1;
            if (i17 < c2388r.f7419a && (i11 = iArr2[i17]) < iArr2[i18]) {
                if (i11 >= iArr2[i12]) {
                    break;
                }
                c2388r.m3500n(i17, i12);
                i12 = i17;
            } else {
                if (iArr2[i18] >= iArr2[i12]) {
                    break;
                }
                c2388r.m3500n(i18, i12);
                i12 = i18;
            }
        }
        ((int[]) c2388r.f7423e)[i10] = c2388r.f7420b;
        c2388r.f7420b = i10;
    }

    /* JADX INFO: renamed from: w */
    public static final Object m10099w(AbstractC9556h abstractC9556h, InterfaceC1436k interfaceC1436k) {
        Object objInvoke = interfaceC1436k.invoke(f28760c.m10073j(abstractC9556h.mo10044d()));
        synchronized (f28759b) {
            int i10 = f28761d;
            f28761d = i10 + 1;
            C9560l c9560lM10073j = f28760c.m10073j(abstractC9556h.mo10044d());
            f28760c = c9560lM10073j;
            f28766i.set(new C9549a(i10, c9560lM10073j));
            abstractC9556h.mo10043c();
            f28760c = f28760c.m10076q(i10);
        }
        return objInvoke;
    }

    /* JADX INFO: renamed from: x */
    public static final AbstractC9544C m10100x(AbstractC9544C abstractC9544C, InterfaceC9542A interfaceC9542A, AbstractC9556h abstractC9556h) {
        AbstractC9544C abstractC9544CM10096t;
        if (abstractC9556h.mo10047g()) {
            abstractC9556h.mo10053n(interfaceC9542A);
        }
        int iMo10044d = abstractC9556h.mo10044d();
        AbstractC9544C abstractC9544CM10096t2 = m10096t(abstractC9544C, iMo10044d, abstractC9556h.mo10045e());
        if (abstractC9544CM10096t2 == null) {
            m10095s();
            throw null;
        }
        if (abstractC9544CM10096t2.f28702a == abstractC9556h.mo10044d()) {
            return abstractC9544CM10096t2;
        }
        synchronized (f28759b) {
            abstractC9544CM10096t = m10096t(interfaceC9542A.mo6345f(), iMo10044d, abstractC9556h.mo10045e());
            if (abstractC9544CM10096t == null) {
                m10095s();
                throw null;
            }
            if (abstractC9544CM10096t.f28702a != iMo10044d) {
                AbstractC9544C abstractC9544CM10089m = m10089m(abstractC9544CM10096t, interfaceC9542A);
                abstractC9544CM10089m.mo6337a(abstractC9544CM10096t);
                abstractC9544CM10089m.f28702a = abstractC9556h.mo10044d();
                abstractC9544CM10096t = abstractC9544CM10089m;
            }
        }
        if (abstractC9544CM10096t2.f28702a != 1) {
            abstractC9556h.mo10053n(interfaceC9542A);
        }
        return abstractC9544CM10096t;
    }
}
