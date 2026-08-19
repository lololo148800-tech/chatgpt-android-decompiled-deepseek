package p349O0;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p007A5.C0376k;
import p038Ba.AbstractC0865o;
import p045Bj.C1313k;
import p049Bm.InterfaceC1426a;
import p1091wn.C21030k;
import p370P0.C6279a;
import p392Q0.C6548f;
import p491U0.C7535c;
import p537W0.C8410b;
import p586Y0.AbstractC9543B;
import p586Y0.InterfaceC9542A;
import p692d0.C12948A;
import p692d0.C12951D;
import p692d0.C12953F;
import p692d0.C12954G;
import p692d0.C12982u;
import p720e6.C13288c;

/* JADX INFO: renamed from: O0.t */
/* JADX INFO: loaded from: classes.dex */
public final class C6029t implements InterfaceC6023q {

    /* JADX INFO: renamed from: A0 */
    public boolean f19612A0;

    /* JADX INFO: renamed from: B0 */
    public final C0376k f19613B0;

    /* JADX INFO: renamed from: C0 */
    public final C6021p f19614C0;

    /* JADX INFO: renamed from: D0 */
    public boolean f19615D0;

    /* JADX INFO: renamed from: Y */
    public final AbstractC6025r f19616Y;

    /* JADX INFO: renamed from: Z */
    public final AbstractC0865o f19617Z;

    /* JADX INFO: renamed from: o0 */
    public final AtomicReference f19618o0 = new AtomicReference(null);

    /* JADX INFO: renamed from: p0 */
    public final Object f19619p0 = new Object();

    /* JADX INFO: renamed from: q0 */
    public final C12953F f19620q0;

    /* JADX INFO: renamed from: r0 */
    public final C5943B0 f19621r0;

    /* JADX INFO: renamed from: s0 */
    public final C13288c f19622s0;

    /* JADX INFO: renamed from: t0 */
    public final C12954G f19623t0;

    /* JADX INFO: renamed from: u0 */
    public final C12954G f19624u0;

    /* JADX INFO: renamed from: v0 */
    public final C13288c f19625v0;

    /* JADX INFO: renamed from: w0 */
    public final C6279a f19626w0;

    /* JADX INFO: renamed from: x0 */
    public final C6279a f19627x0;

    /* JADX INFO: renamed from: y0 */
    public final C13288c f19628y0;

    /* JADX INFO: renamed from: z0 */
    public C13288c f19629z0;

    public C6029t(AbstractC6025r abstractC6025r, AbstractC0865o abstractC0865o) {
        this.f19616Y = abstractC6025r;
        this.f19617Z = abstractC0865o;
        C12953F c12953f = new C12953F(new C12954G());
        this.f19620q0 = c12953f;
        C5943B0 c5943b0 = new C5943B0();
        if (abstractC6025r.mo6485c()) {
            c5943b0.f19355v0 = new C12982u();
        }
        if (abstractC6025r.mo6487e()) {
            c5943b0.m6342j();
        }
        this.f19621r0 = c5943b0;
        this.f19622s0 = new C13288c(23);
        this.f19623t0 = new C12954G();
        this.f19624u0 = new C12954G();
        this.f19625v0 = new C13288c(23);
        C6279a c6279a = new C6279a();
        this.f19626w0 = c6279a;
        C6279a c6279a2 = new C6279a();
        this.f19627x0 = c6279a2;
        this.f19628y0 = new C13288c(23);
        this.f19629z0 = new C13288c(23);
        C0376k c0376k = new C0376k(5, false);
        c0376k.f1278Z = false;
        this.f19613B0 = c0376k;
        C6021p c6021p = new C6021p(abstractC0865o, abstractC6025r, c5943b0, c12953f, c6279a, c6279a2, this);
        abstractC6025r.mo6493k(c6021p);
        this.f19614C0 = c6021p;
        boolean z6 = abstractC6025r instanceof C6032u0;
        C8410b c8410b = AbstractC6007i.f19508a;
    }

    /* JADX INFO: renamed from: a */
    public final void m6564a() {
        this.f19618o0.set(null);
        this.f19626w0.f20394a.m6840d();
        this.f19627x0.f20394a.m6840d();
        C12953F c12953f = this.f19620q0;
        if (c12953f.f41141Y.m14630g()) {
            return;
        }
        new ArrayList();
        new ArrayList();
        new ArrayList();
        new ArrayList();
        if (c12953f.f41141Y.m14630g()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = c12953f.iterator();
            while (true) {
                C7535c c7535c = (C7535c) it;
                if (!c7535c.hasNext()) {
                    Trace.endSection();
                    return;
                } else {
                    InterfaceC6034v0 interfaceC6034v0 = (InterfaceC6034v0) c7535c.next();
                    c7535c.remove();
                    interfaceC6034v0.mo2149a();
                }
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m6565b(Object obj, boolean z6) {
        int i10;
        Object objM14619e = ((C12951D) this.f19622s0.f42001Y).m14619e(obj);
        if (objM14619e == null) {
            return;
        }
        boolean z10 = objM14619e instanceof C12954G;
        C12954G c12954g = this.f19623t0;
        C12954G c12954g2 = this.f19624u0;
        C13288c c13288c = this.f19628y0;
        if (!z10) {
            C6018n0 c6018n0 = (C6018n0) objM14619e;
            if (c13288c.m14922b0(obj, c6018n0) || c6018n0.m6501c(obj) == 1) {
                return;
            }
            if (c6018n0.f19539g == null || z6) {
                c12954g.m14624a(c6018n0);
                return;
            } else {
                c12954g2.m14624a(c6018n0);
                return;
            }
        }
        C12954G c12954g3 = (C12954G) objM14619e;
        Object[] objArr = c12954g3.f41144b;
        long[] jArr = c12954g3.f41143a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j10 = jArr[i11];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8;
                int i13 = 8 - ((~(i11 - length)) >>> 31);
                int i14 = 0;
                while (i14 < i13) {
                    if ((j10 & 255) < 128) {
                        C6018n0 c6018n1 = (C6018n0) objArr[(i11 << 3) + i14];
                        if (!c13288c.m14922b0(obj, c6018n1) && c6018n1.m6501c(obj) != 1) {
                            if (c6018n1.f19539g == null || z6) {
                                c12954g.m14624a(c6018n1);
                            } else {
                                c12954g2.m14624a(c6018n1);
                            }
                        }
                        i10 = 8;
                    } else {
                        i10 = i12;
                    }
                    j10 >>= i10;
                    i14++;
                    i12 = i10;
                }
                if (i13 != i12) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:194:0x00d4 A[EDGE_INSN: B:194:0x00d4->B:37:0x00d4 BREAK  A[LOOP:2: B:24:0x007b->B:35:0x00bf], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x0194 A[EDGE_INSN: B:216:0x0194->B:72:0x0194 BREAK  A[LOOP:13: B:59:0x0150->B:70:0x018c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x00bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00bf A[LOOP:2: B:24:0x007b->B:35:0x00bf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x018a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x018c A[LOOP:13: B:59:0x0150->B:70:0x018c, LOOP_END] */
    /* JADX INFO: renamed from: c */
    public final void m6566c(Set set, boolean z6) {
        C13288c c13288c;
        long[] jArr;
        String str;
        int i10;
        String str2;
        boolean zM14626c;
        Object[] objArr;
        String str3;
        Object[] objArr2;
        String str4;
        long[] jArr2;
        int i11;
        String str5;
        long[] jArr3;
        int i12;
        int i13;
        long j10;
        boolean zM14630g;
        long[] jArr4;
        Object[] objArr3;
        long[] jArr5;
        Object[] objArr4;
        Object[] objArr5;
        C13288c c13288c2;
        Object[] objArr6;
        C13288c c13288c3;
        int i14;
        int i15;
        int i16;
        boolean z10 = set instanceof C6548f;
        C13288c c13288c4 = this.f19625v0;
        char c9 = 7;
        long j11 = -9187201950435737472L;
        int i17 = 8;
        if (z10) {
            C12954G c12954g = ((C6548f) set).f21195Y;
            Object[] objArr7 = c12954g.f41144b;
            long[] jArr6 = c12954g.f41143a;
            int length = jArr6.length - 2;
            if (length >= 0) {
                int i18 = 0;
                while (true) {
                    long j12 = jArr6[i18];
                    if ((((~j12) << c9) & j12 & j11) != j11) {
                        int i19 = 8 - ((~(i18 - length)) >>> 31);
                        int i20 = 0;
                        while (i20 < i19) {
                            if ((j12 & 255) < 128) {
                                Object obj = objArr7[(i18 << 3) + i20];
                                if (obj instanceof C6018n0) {
                                    ((C6018n0) obj).m6501c(null);
                                } else {
                                    m6565b(obj, z6);
                                    Object objM14619e = ((C12951D) c13288c4.f42001Y).m14619e(obj);
                                    if (objM14619e != null) {
                                        if (objM14619e instanceof C12954G) {
                                            C12954G c12954g2 = (C12954G) objM14619e;
                                            Object[] objArr8 = c12954g2.f41144b;
                                            long[] jArr7 = c12954g2.f41143a;
                                            int length2 = jArr7.length - 2;
                                            if (length2 >= 0) {
                                                objArr6 = objArr7;
                                                c13288c3 = c13288c4;
                                                int i21 = 0;
                                                while (true) {
                                                    long j13 = jArr7[i21];
                                                    i14 = i19;
                                                    i15 = i20;
                                                    if ((((~j13) << c9) & j13 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                        if (i21 != length2) {
                                                            break;
                                                            break;
                                                        }
                                                        i21++;
                                                        i19 = i14;
                                                        i20 = i15;
                                                        c9 = 7;
                                                    } else {
                                                        int i22 = 8 - ((~(i21 - length2)) >>> 31);
                                                        for (int i23 = 0; i23 < i22; i23++) {
                                                            if ((j13 & 255) < 128) {
                                                                m6565b((C5944C) objArr8[(i21 << 3) + i23], z6);
                                                            }
                                                            j13 >>= 8;
                                                        }
                                                        if (i22 != 8) {
                                                            break;
                                                        }
                                                        if (i21 != length2) {
                                                            break;
                                                        }
                                                        i21++;
                                                        i19 = i14;
                                                        i20 = i15;
                                                        c9 = 7;
                                                    }
                                                }
                                            }
                                        } else {
                                            objArr6 = objArr7;
                                            c13288c3 = c13288c4;
                                            i14 = i19;
                                            i15 = i20;
                                            m6565b((C5944C) objM14619e, z6);
                                        }
                                    }
                                    i16 = 8;
                                }
                                objArr6 = objArr7;
                                c13288c3 = c13288c4;
                                i14 = i19;
                                i15 = i20;
                                i16 = 8;
                            } else {
                                objArr6 = objArr7;
                                c13288c3 = c13288c4;
                                i14 = i19;
                                i15 = i20;
                                i16 = i17;
                            }
                            j12 >>= i16;
                            i20 = i15 + 1;
                            i17 = i16;
                            c13288c4 = c13288c3;
                            i19 = i14;
                            c9 = 7;
                            objArr7 = objArr6;
                        }
                        objArr5 = objArr7;
                        c13288c2 = c13288c4;
                        if (i19 != i17) {
                            break;
                        }
                    } else {
                        objArr5 = objArr7;
                        c13288c2 = c13288c4;
                    }
                    if (i18 == length) {
                        break;
                    }
                    i18++;
                    objArr7 = objArr5;
                    c13288c4 = c13288c2;
                    c9 = 7;
                    j11 = -9187201950435737472L;
                    i17 = 8;
                }
            }
        } else {
            C13288c c13288c5 = c13288c4;
            for (Object obj2 : set) {
                if (obj2 instanceof C6018n0) {
                    ((C6018n0) obj2).m6501c(null);
                    c13288c = c13288c5;
                } else {
                    m6565b(obj2, z6);
                    c13288c = c13288c5;
                    Object objM14619e2 = ((C12951D) c13288c.f42001Y).m14619e(obj2);
                    if (objM14619e2 != null) {
                        if (objM14619e2 instanceof C12954G) {
                            C12954G c12954g3 = (C12954G) objM14619e2;
                            Object[] objArr9 = c12954g3.f41144b;
                            long[] jArr8 = c12954g3.f41143a;
                            int length3 = jArr8.length - 2;
                            if (length3 >= 0) {
                                int i24 = 0;
                                while (true) {
                                    long j14 = jArr8[i24];
                                    if ((((~j14) << 7) & j14 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i24 != length3) {
                                            break;
                                            break;
                                        }
                                        i24++;
                                    } else {
                                        int i25 = 8 - ((~(i24 - length3)) >>> 31);
                                        for (int i26 = 0; i26 < i25; i26++) {
                                            if ((j14 & 255) < 128) {
                                                m6565b((C5944C) objArr9[(i24 << 3) + i26], z6);
                                            }
                                            j14 >>= 8;
                                        }
                                        if (i25 != 8) {
                                            break;
                                        } else if (i24 != length3) {
                                            break;
                                        } else {
                                            i24++;
                                        }
                                    }
                                }
                            }
                        } else {
                            m6565b((C5944C) objM14619e2, z6);
                        }
                    }
                }
                c13288c5 = c13288c;
            }
        }
        String str6 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>";
        C13288c c13288c6 = this.f19622s0;
        C12954G c12954g4 = this.f19623t0;
        if (z6) {
            C12954G c12954g5 = this.f19624u0;
            if (c12954g5.m14631h()) {
                C12951D c12951d = (C12951D) c13288c6.f42001Y;
                long[] jArr9 = c12951d.f41123a;
                int length4 = jArr9.length - 2;
                if (length4 >= 0) {
                    int i27 = 0;
                    while (true) {
                        long j15 = jArr9[i27];
                        if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i28 = 8 - ((~(i27 - length4)) >>> 31);
                            int i29 = 0;
                            while (i29 < i28) {
                                if ((j15 & 255) < 128) {
                                    int i30 = (i27 << 3) + i29;
                                    Object obj3 = c12951d.f41124b[i30];
                                    Object obj4 = c12951d.f41125c[i30];
                                    if (obj4 instanceof C12954G) {
                                        AbstractC16544l.m18092e(obj4, str6);
                                        C12954G c12954g6 = (C12954G) obj4;
                                        Object[] objArr10 = c12954g6.f41144b;
                                        long[] jArr10 = c12954g6.f41143a;
                                        jArr3 = jArr9;
                                        int length5 = jArr10.length - 2;
                                        str5 = str6;
                                        i12 = length4;
                                        i13 = i27;
                                        if (length5 >= 0) {
                                            int i31 = 0;
                                            while (true) {
                                                long j16 = jArr10[i31];
                                                j10 = j15;
                                                if ((((~j16) << 7) & j16 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i32 = 8 - ((~(i31 - length5)) >>> 31);
                                                    int i33 = 0;
                                                    while (i33 < i32) {
                                                        if ((j16 & 255) < 128) {
                                                            jArr5 = jArr10;
                                                            int i34 = (i31 << 3) + i33;
                                                            objArr4 = objArr10;
                                                            C6018n0 c6018n0 = (C6018n0) objArr10[i34];
                                                            if (c12954g5.m14626c(c6018n0) || c12954g4.m14626c(c6018n0)) {
                                                                c12954g6.m14634k(i34);
                                                            }
                                                        } else {
                                                            jArr5 = jArr10;
                                                            objArr4 = objArr10;
                                                        }
                                                        j16 >>= 8;
                                                        i33++;
                                                        jArr10 = jArr5;
                                                        objArr10 = objArr4;
                                                    }
                                                    jArr4 = jArr10;
                                                    objArr3 = objArr10;
                                                    if (i32 != 8) {
                                                        break;
                                                    }
                                                } else {
                                                    jArr4 = jArr10;
                                                    objArr3 = objArr10;
                                                }
                                                if (i31 == length5) {
                                                    break;
                                                }
                                                i31++;
                                                j15 = j10;
                                                jArr10 = jArr4;
                                                objArr10 = objArr3;
                                            }
                                        } else {
                                            j10 = j15;
                                        }
                                        zM14630g = c12954g6.m14630g();
                                    } else {
                                        str5 = str6;
                                        jArr3 = jArr9;
                                        i12 = length4;
                                        i13 = i27;
                                        j10 = j15;
                                        AbstractC16544l.m18092e(obj4, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                        C6018n0 c6018n1 = (C6018n0) obj4;
                                        zM14630g = c12954g5.m14626c(c6018n1) || c12954g4.m14626c(c6018n1);
                                    }
                                    if (zM14630g) {
                                        c12951d.m14622h(i30);
                                    }
                                } else {
                                    str5 = str6;
                                    jArr3 = jArr9;
                                    i12 = length4;
                                    i13 = i27;
                                    j10 = j15;
                                }
                                j15 = j10 >> 8;
                                i29++;
                                length4 = i12;
                                jArr9 = jArr3;
                                str6 = str5;
                                i27 = i13;
                            }
                            str4 = str6;
                            jArr2 = jArr9;
                            int i35 = length4;
                            int i36 = i27;
                            if (i28 != 8) {
                                break;
                            }
                            length4 = i35;
                            i11 = i36;
                        } else {
                            str4 = str6;
                            jArr2 = jArr9;
                            i11 = i27;
                        }
                        if (i11 == length4) {
                            break;
                        }
                        i27 = i11 + 1;
                        jArr9 = jArr2;
                        str6 = str4;
                    }
                }
                c12954g5.m14625b();
                m6571h();
                return;
            }
        }
        String str7 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>";
        if (c12954g4.m14631h()) {
            C12951D c12951d2 = (C12951D) c13288c6.f42001Y;
            long[] jArr11 = c12951d2.f41123a;
            int length6 = jArr11.length - 2;
            if (length6 >= 0) {
                int i37 = 0;
                while (true) {
                    long j17 = jArr11[i37];
                    if ((((~j17) << 7) & j17 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i38 = 8 - ((~(i37 - length6)) >>> 31);
                        int i39 = 0;
                        while (i39 < i38) {
                            if ((j17 & 255) < 128) {
                                int i40 = (i37 << 3) + i39;
                                Object obj5 = c12951d2.f41124b[i40];
                                Object obj6 = c12951d2.f41125c[i40];
                                if (obj6 instanceof C12954G) {
                                    String str8 = str7;
                                    AbstractC16544l.m18092e(obj6, str8);
                                    C12954G c12954g7 = (C12954G) obj6;
                                    Object[] objArr11 = c12954g7.f41144b;
                                    long[] jArr12 = c12954g7.f41143a;
                                    int length7 = jArr12.length - 2;
                                    if (length7 >= 0) {
                                        int i41 = 0;
                                        while (true) {
                                            long j18 = jArr12[i41];
                                            long[] jArr13 = jArr12;
                                            i10 = i38;
                                            if ((((~j18) << 7) & j18 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i42 = 8 - ((~(i41 - length7)) >>> 31);
                                                int i43 = 0;
                                                while (i43 < i42) {
                                                    if ((j18 & 255) < 128) {
                                                        str3 = str8;
                                                        int i44 = (i41 << 3) + i43;
                                                        objArr2 = objArr11;
                                                        if (c12954g4.m14626c((C6018n0) objArr11[i44])) {
                                                            c12954g7.m14634k(i44);
                                                        }
                                                    } else {
                                                        str3 = str8;
                                                        objArr2 = objArr11;
                                                    }
                                                    j18 >>= 8;
                                                    i43++;
                                                    str8 = str3;
                                                    objArr11 = objArr2;
                                                }
                                                str2 = str8;
                                                objArr = objArr11;
                                                if (i42 != 8) {
                                                    break;
                                                }
                                            } else {
                                                str2 = str8;
                                                objArr = objArr11;
                                            }
                                            if (i41 == length7) {
                                                break;
                                            }
                                            i41++;
                                            i38 = i10;
                                            jArr12 = jArr13;
                                            str8 = str2;
                                            objArr11 = objArr;
                                        }
                                    } else {
                                        str2 = str8;
                                        i10 = i38;
                                    }
                                    zM14626c = c12954g7.m14630g();
                                } else {
                                    i10 = i38;
                                    str2 = str7;
                                    AbstractC16544l.m18092e(obj6, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                    zM14626c = c12954g4.m14626c((C6018n0) obj6);
                                }
                                if (zM14626c) {
                                    c12951d2.m14622h(i40);
                                }
                            } else {
                                jArr11 = jArr11;
                                i37 = i37;
                                i10 = i38;
                                str2 = str7;
                                i39 = i39;
                            }
                            j17 >>= 8;
                            i39++;
                            i37 = i37;
                            jArr11 = jArr11;
                            i38 = i10;
                            str7 = str2;
                        }
                        jArr = jArr11;
                        int i45 = i37;
                        str = str7;
                        if (i38 != 8) {
                            break;
                        } else {
                            i37 = i45;
                        }
                    } else {
                        jArr = jArr11;
                        str = str7;
                    }
                    if (i37 == length6) {
                        break;
                    }
                    i37++;
                    jArr11 = jArr;
                    str7 = str;
                }
            }
            m6571h();
            c12954g4.m14625b();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m6567d() {
        synchronized (this.f19619p0) {
            try {
                m6568e(this.f19626w0);
                m6576m();
            } catch (Throwable th2) {
                try {
                    try {
                        if (!this.f19620q0.f41141Y.m14630g()) {
                            C12953F c12953f = this.f19620q0;
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            if (!c12953f.f41141Y.m14630g()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    Iterator it = c12953f.iterator();
                                    while (((C21030k) ((C7535c) it).f23886o0).hasNext()) {
                                        InterfaceC6034v0 interfaceC6034v0 = (InterfaceC6034v0) ((C21030k) ((C7535c) it).f23886o0).next();
                                        ((C7535c) it).remove();
                                        interfaceC6034v0.mo2149a();
                                    }
                                    Trace.endSection();
                                } catch (Throwable th3) {
                                    Trace.endSection();
                                    throw th3;
                                }
                            }
                        }
                        throw th2;
                    } catch (Exception e10) {
                        m6564a();
                        throw e10;
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }

    @Override // p349O0.InterfaceC6023q
    public final void dispose() {
        synchronized (this.f19619p0) {
            try {
                C6021p c6021p = this.f19614C0;
                if (c6021p.f19553E) {
                    C5997d.m6445c0("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                    throw null;
                }
                if (!this.f19615D0) {
                    this.f19615D0 = true;
                    C8410b c8410b = AbstractC6007i.f19509b;
                    C6279a c6279a = c6021p.f19559K;
                    if (c6279a != null) {
                        m6568e(c6279a);
                    }
                    boolean z6 = this.f19621r0.f19347Z > 0;
                    if (z6 || !this.f19620q0.f41141Y.m14630g()) {
                        C1313k c1313k = new C1313k(this.f19620q0);
                        if (z6) {
                            C5947D0 c5947d0M6344p = this.f19621r0.m6344p();
                            try {
                                C5997d.m6436W(c5947d0M6344p, c1313k);
                                c5947d0M6344p.m6368e(true);
                                this.f19617Z.m1930c();
                                this.f19617Z.mo1940m();
                                c1313k.m2019f();
                            } catch (Throwable th2) {
                                c5947d0M6344p.m6368e(false);
                                throw th2;
                            }
                        }
                        c1313k.m2018e();
                    }
                    C6021p c6021p2 = this.f19614C0;
                    c6021p2.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        c6021p2.f19566b.mo6496n(c6021p2);
                        c6021p2.f19552D.f19461a.clear();
                        c6021p2.f19582r.clear();
                        c6021p2.f19569e.f20394a.m6840d();
                        c6021p2.f19585u = null;
                        c6021p2.f19565a.m1930c();
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.f19616Y.mo6497o(this);
    }

    /* JADX WARN: Code duplicated, block: B:110:0x01f1  */
    /* JADX INFO: renamed from: e */
    public final void m6568e(C6279a c6279a) throws Throwable {
        C1313k c1313k;
        long[] jArr;
        int i10;
        C1313k c1313k2;
        long[] jArr2;
        int i11;
        int i12;
        char c9;
        long j10;
        int i13;
        boolean zM14630g;
        long[] jArr3;
        long[] jArr4;
        AbstractC0865o abstractC0865o = this.f19617Z;
        C6279a c6279a2 = this.f19627x0;
        C1313k c1313k3 = new C1313k(this.f19620q0);
        try {
            if (c6279a.f20394a.m6842f()) {
                if (c6279a2.f20394a.m6842f()) {
                    c1313k3.m2018e();
                    return;
                }
                return;
            }
            try {
                Trace.beginSection("Compose:applyChanges");
                try {
                    C5947D0 c5947d0M6344p = this.f19621r0.m6344p();
                    int i14 = 0;
                    try {
                        c6279a.f20394a.m6841e(abstractC0865o, c5947d0M6344p, c1313k3);
                        c5947d0M6344p.m6368e(true);
                        abstractC0865o.mo1940m();
                        Trace.endSection();
                        c1313k3.m2019f();
                        ArrayList arrayList = (ArrayList) c1313k3.f3470e;
                        if (!arrayList.isEmpty()) {
                            Trace.beginSection("Compose:sideeffects");
                            try {
                                int size = arrayList.size();
                                for (int i15 = 0; i15 < size; i15++) {
                                    ((InterfaceC1426a) arrayList.get(i15)).invoke();
                                }
                                arrayList.clear();
                                Trace.endSection();
                            } catch (Throwable th2) {
                                Trace.endSection();
                                throw th2;
                            }
                        }
                        if (this.f19612A0) {
                            Trace.beginSection("Compose:unobserve");
                            try {
                                this.f19612A0 = false;
                                C12951D c12951d = (C12951D) this.f19622s0.f42001Y;
                                long[] jArr5 = c12951d.f41123a;
                                int length = jArr5.length - 2;
                                if (length >= 0) {
                                    int i16 = 0;
                                    while (true) {
                                        long j11 = jArr5[i16];
                                        char c10 = 7;
                                        long j12 = -9187201950435737472L;
                                        if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i17 = 8;
                                            int i18 = 8 - ((~(i16 - length)) >>> 31);
                                            int i19 = i14;
                                            while (i19 < i18) {
                                                if ((j11 & 255) < 128) {
                                                    int i20 = (i16 << 3) + i19;
                                                    Object obj = c12951d.f41124b[i20];
                                                    Object obj2 = c12951d.f41125c[i20];
                                                    if (obj2 instanceof C12954G) {
                                                        AbstractC16544l.m18092e(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>");
                                                        C12954G c12954g = (C12954G) obj2;
                                                        Object[] objArr = c12954g.f41144b;
                                                        long[] jArr6 = c12954g.f41143a;
                                                        int length2 = jArr6.length - 2;
                                                        c1313k2 = c1313k3;
                                                        jArr2 = jArr5;
                                                        if (length2 >= 0) {
                                                            int i21 = 0;
                                                            while (true) {
                                                                try {
                                                                    long j13 = jArr6[i21];
                                                                    i11 = length;
                                                                    i12 = i16;
                                                                    c9 = 7;
                                                                    j10 = -9187201950435737472L;
                                                                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                        int i22 = 8 - ((~(i21 - length2)) >>> 31);
                                                                        int i23 = 0;
                                                                        while (i23 < i22) {
                                                                            if ((j13 & 255) < 128) {
                                                                                jArr4 = jArr6;
                                                                                int i24 = (i21 << 3) + i23;
                                                                                if (!((C6018n0) objArr[i24]).m6500b()) {
                                                                                    c12954g.m14634k(i24);
                                                                                }
                                                                            } else {
                                                                                jArr4 = jArr6;
                                                                            }
                                                                            j13 >>= 8;
                                                                            i23++;
                                                                            jArr6 = jArr4;
                                                                        }
                                                                        jArr3 = jArr6;
                                                                        if (i22 != 8) {
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        jArr3 = jArr6;
                                                                    }
                                                                    if (i21 == length2) {
                                                                        break;
                                                                    }
                                                                    i21++;
                                                                    length = i11;
                                                                    i16 = i12;
                                                                    jArr6 = jArr3;
                                                                } catch (Throwable th3) {
                                                                    th = th3;
                                                                    Trace.endSection();
                                                                    throw th;
                                                                }
                                                            }
                                                        } else {
                                                            i11 = length;
                                                            i12 = i16;
                                                            j10 = -9187201950435737472L;
                                                            c9 = 7;
                                                        }
                                                        zM14630g = c12954g.m14630g();
                                                    } else {
                                                        c1313k2 = c1313k3;
                                                        jArr2 = jArr5;
                                                        i11 = length;
                                                        i12 = i16;
                                                        c9 = c10;
                                                        j10 = -9187201950435737472L;
                                                        AbstractC16544l.m18092e(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                                        zM14630g = !((C6018n0) obj2).m6500b();
                                                    }
                                                    if (zM14630g) {
                                                        c12951d.m14622h(i20);
                                                    }
                                                    i13 = 8;
                                                } else {
                                                    c1313k2 = c1313k3;
                                                    jArr2 = jArr5;
                                                    i11 = length;
                                                    i12 = i16;
                                                    c9 = c10;
                                                    j10 = j12;
                                                    i13 = i17;
                                                }
                                                j11 >>= i13;
                                                i19++;
                                                i17 = i13;
                                                j12 = j10;
                                                c10 = c9;
                                                c1313k3 = c1313k2;
                                                jArr5 = jArr2;
                                                length = i11;
                                                i16 = i12;
                                            }
                                            c1313k = c1313k3;
                                            jArr = jArr5;
                                            int i25 = length;
                                            int i26 = i16;
                                            if (i18 != i17) {
                                                break;
                                            }
                                            length = i25;
                                            i10 = i26;
                                        } else {
                                            c1313k = c1313k3;
                                            jArr = jArr5;
                                            i10 = i16;
                                        }
                                        if (i10 == length) {
                                            break;
                                        }
                                        i16 = i10 + 1;
                                        c1313k3 = c1313k;
                                        jArr5 = jArr;
                                        i14 = 0;
                                    }
                                } else {
                                    c1313k = c1313k3;
                                }
                                m6571h();
                                Trace.endSection();
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        } else {
                            c1313k = c1313k3;
                        }
                        if (c6279a2.f20394a.m6842f()) {
                            c1313k.m2018e();
                        }
                    } catch (Throwable th5) {
                        try {
                            c5947d0M6344p.m6368e(false);
                            throw th5;
                        } catch (Throwable th6) {
                            th = th6;
                            Trace.endSection();
                            throw th;
                        }
                    }
                } catch (Throwable th7) {
                    th = th7;
                }
            } catch (Throwable th8) {
                th = th8;
                if (c6279a2.f20394a.m6842f()) {
                    c1313k3.m2018e();
                }
                throw th;
            }
        } catch (Throwable th9) {
            th = th9;
            if (c6279a2.f20394a.m6842f()) {
                c1313k3.m2018e();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m6569f() {
        synchronized (this.f19619p0) {
            try {
                if (this.f19627x0.f20394a.m6843g()) {
                    m6568e(this.f19627x0);
                }
            } catch (Throwable th2) {
                try {
                    try {
                        if (!this.f19620q0.f41141Y.m14630g()) {
                            C12953F c12953f = this.f19620q0;
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            if (!c12953f.f41141Y.m14630g()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    Iterator it = c12953f.iterator();
                                    while (((C21030k) ((C7535c) it).f23886o0).hasNext()) {
                                        InterfaceC6034v0 interfaceC6034v0 = (InterfaceC6034v0) ((C21030k) ((C7535c) it).f23886o0).next();
                                        ((C7535c) it).remove();
                                        interfaceC6034v0.mo2149a();
                                    }
                                    Trace.endSection();
                                } catch (Throwable th3) {
                                    Trace.endSection();
                                    throw th3;
                                }
                            }
                        }
                        throw th2;
                    } catch (Exception e10) {
                        m6564a();
                        throw e10;
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m6570g() {
        synchronized (this.f19619p0) {
            try {
                this.f19614C0.f19585u = null;
                if (!this.f19620q0.f41141Y.m14630g()) {
                    C12953F c12953f = this.f19620q0;
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    if (!c12953f.f41141Y.m14630g()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            Iterator it = c12953f.iterator();
                            while (true) {
                                C7535c c7535c = (C7535c) it;
                                if (!c7535c.hasNext()) {
                                    break;
                                }
                                InterfaceC6034v0 interfaceC6034v0 = (InterfaceC6034v0) c7535c.next();
                                c7535c.remove();
                                interfaceC6034v0.mo2149a();
                            }
                            Trace.endSection();
                        } catch (Throwable th2) {
                            Trace.endSection();
                            throw th2;
                        }
                    }
                }
            } catch (Throwable th3) {
                try {
                    try {
                        if (!this.f19620q0.f41141Y.m14630g()) {
                            C12953F c12953f2 = this.f19620q0;
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            if (!c12953f2.f41141Y.m14630g()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    Iterator it2 = c12953f2.iterator();
                                    while (true) {
                                        C7535c c7535c2 = (C7535c) it2;
                                        if (!c7535c2.hasNext()) {
                                            break;
                                        }
                                        InterfaceC6034v0 interfaceC6034v1 = (InterfaceC6034v0) c7535c2.next();
                                        c7535c2.remove();
                                        interfaceC6034v1.mo2149a();
                                    }
                                    Trace.endSection();
                                } catch (Throwable th4) {
                                    Trace.endSection();
                                    throw th4;
                                }
                            }
                        }
                        throw th3;
                    } catch (Exception e10) {
                        m6564a();
                        throw e10;
                    }
                } catch (Throwable th5) {
                    throw th5;
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m6571h() {
        long[] jArr;
        long[] jArr2;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean zM14630g;
        Object[] objArr;
        long[] jArr3;
        Object[] objArr2;
        long[] jArr4;
        C6029t c6029t = this;
        C12951D c12951d = (C12951D) c6029t.f19625v0.f42001Y;
        long[] jArr5 = c12951d.f41123a;
        int length = jArr5.length - 2;
        long j10 = 255;
        char c9 = 7;
        long j11 = -9187201950435737472L;
        int i14 = 8;
        if (length >= 0) {
            int i15 = 0;
            while (true) {
                long j12 = jArr5[i15];
                if ((((~j12) << c9) & j12 & j11) != j11) {
                    int i16 = 8 - ((~(i15 - length)) >>> 31);
                    int i17 = 0;
                    while (i17 < i16) {
                        if ((j12 & j10) < 128) {
                            int i18 = (i15 << 3) + i17;
                            Object obj = c12951d.f41124b[i18];
                            Object obj2 = c12951d.f41125c[i18];
                            boolean z6 = obj2 instanceof C12954G;
                            C13288c c13288c = c6029t.f19622s0;
                            if (z6) {
                                AbstractC16544l.m18092e(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>");
                                C12954G c12954g = (C12954G) obj2;
                                Object[] objArr3 = c12954g.f41144b;
                                long[] jArr6 = c12954g.f41143a;
                                int length2 = jArr6.length - 2;
                                jArr2 = jArr5;
                                i10 = length;
                                if (length2 >= 0) {
                                    int i19 = 0;
                                    while (true) {
                                        long j13 = jArr6[i19];
                                        i11 = i16;
                                        i12 = i17;
                                        if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i20 = 8 - ((~(i19 - length2)) >>> 31);
                                            int i21 = 0;
                                            while (i21 < i20) {
                                                if ((j13 & 255) < 128) {
                                                    jArr4 = jArr6;
                                                    int i22 = (i19 << 3) + i21;
                                                    objArr2 = objArr3;
                                                    if (!((C12951D) c13288c.f42001Y).m14616b((C5944C) objArr3[i22])) {
                                                        c12954g.m14634k(i22);
                                                    }
                                                } else {
                                                    objArr2 = objArr3;
                                                    jArr4 = jArr6;
                                                }
                                                j13 >>= 8;
                                                i21++;
                                                jArr6 = jArr4;
                                                objArr3 = objArr2;
                                            }
                                            objArr = objArr3;
                                            jArr3 = jArr6;
                                            if (i20 != 8) {
                                                break;
                                            }
                                        } else {
                                            objArr = objArr3;
                                            jArr3 = jArr6;
                                        }
                                        if (i19 == length2) {
                                            break;
                                        }
                                        i19++;
                                        i16 = i11;
                                        i17 = i12;
                                        jArr6 = jArr3;
                                        objArr3 = objArr;
                                    }
                                } else {
                                    i11 = i16;
                                    i12 = i17;
                                }
                                zM14630g = c12954g.m14630g();
                            } else {
                                jArr2 = jArr5;
                                i10 = length;
                                i11 = i16;
                                i12 = i17;
                                AbstractC16544l.m18092e(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                zM14630g = !((C12951D) c13288c.f42001Y).m14616b((C5944C) obj2);
                            }
                            if (zM14630g) {
                                c12951d.m14622h(i18);
                            }
                            i13 = 8;
                        } else {
                            jArr2 = jArr5;
                            i10 = length;
                            i11 = i16;
                            i12 = i17;
                            i13 = i14;
                        }
                        j12 >>= i13;
                        i17 = i12 + 1;
                        i14 = i13;
                        jArr5 = jArr2;
                        length = i10;
                        i16 = i11;
                        j10 = 255;
                        c6029t = this;
                    }
                    jArr = jArr5;
                    int i23 = length;
                    if (i16 != i14) {
                        break;
                    } else {
                        length = i23;
                    }
                } else {
                    jArr = jArr5;
                }
                if (i15 == length) {
                    break;
                }
                i15++;
                c6029t = this;
                jArr5 = jArr;
                j10 = 255;
                c9 = 7;
                j11 = -9187201950435737472L;
                i14 = 8;
            }
        }
        C12954G c12954g2 = this.f19624u0;
        if (!c12954g2.m14631h()) {
            return;
        }
        Object[] objArr4 = c12954g2.f41144b;
        long[] jArr7 = c12954g2.f41143a;
        int length3 = jArr7.length - 2;
        if (length3 < 0) {
            return;
        }
        int i24 = 0;
        while (true) {
            long j14 = jArr7[i24];
            if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i25 = 8 - ((~(i24 - length3)) >>> 31);
                for (int i26 = 0; i26 < i25; i26++) {
                    if ((j14 & 255) < 128) {
                        int i27 = (i24 << 3) + i26;
                        if (!(((C6018n0) objArr4[i27]).f19539g != null)) {
                            c12954g2.m14634k(i27);
                        }
                    }
                    j14 >>= 8;
                }
                if (i25 != 8) {
                    return;
                }
            }
            if (i24 == length3) {
                return;
            } else {
                i24++;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m6572i(C8410b c8410b) throws Exception {
        try {
            synchronized (this.f19619p0) {
                m6575l();
                C13288c c13288c = this.f19629z0;
                this.f19629z0 = new C13288c(23);
                try {
                    m6582s();
                    C6021p c6021p = this.f19614C0;
                    if (!c6021p.f19569e.f20394a.m6842f()) {
                        C5997d.m6470z("Expected applyChanges() to have been called");
                        throw null;
                    }
                    c6021p.m6551n(c13288c, c8410b);
                } catch (Exception e10) {
                    this.f19629z0 = c13288c;
                    throw e10;
                }
            }
        } catch (Throwable th2) {
            try {
                if (!this.f19620q0.f41141Y.m14630g()) {
                    C12953F c12953f = this.f19620q0;
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    if (!c12953f.f41141Y.m14630g()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            Iterator it = c12953f.iterator();
                            while (((C21030k) ((C7535c) it).f23886o0).hasNext()) {
                                InterfaceC6034v0 interfaceC6034v0 = (InterfaceC6034v0) ((C21030k) ((C7535c) it).f23886o0).next();
                                ((C7535c) it).remove();
                                interfaceC6034v0.mo2149a();
                            }
                            Trace.endSection();
                        } catch (Throwable th3) {
                            Trace.endSection();
                            throw th3;
                        }
                    }
                }
                throw th2;
            } catch (Exception e11) {
                m6564a();
                throw e11;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m6573j(C8410b c8410b) {
        if (this.f19615D0) {
            C5997d.m6445c0("The composition is disposed");
            throw null;
        }
        this.f19616Y.mo6483a(this, c8410b);
    }

    /* JADX INFO: renamed from: k */
    public final void m6574k() {
        synchronized (this.f19619p0) {
            try {
                boolean z6 = this.f19621r0.f19347Z > 0;
                if (z6 || !this.f19620q0.f41141Y.m14630g()) {
                    Trace.beginSection("Compose:deactivate");
                    try {
                        C1313k c1313k = new C1313k(this.f19620q0);
                        if (z6) {
                            C5947D0 c5947d0M6344p = this.f19621r0.m6344p();
                            try {
                                C5997d.m6419F(c5947d0M6344p, c1313k);
                                c5947d0M6344p.m6368e(true);
                                this.f19617Z.mo1940m();
                                c1313k.m2019f();
                            } catch (Throwable th2) {
                                c5947d0M6344p.m6368e(false);
                                throw th2;
                            }
                        }
                        c1313k.m2018e();
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
                ((C12951D) this.f19622s0.f42001Y).m14615a();
                ((C12951D) this.f19625v0.f42001Y).m14615a();
                ((C12951D) this.f19629z0.f42001Y).m14615a();
                this.f19626w0.f20394a.m6840d();
                this.f19627x0.f20394a.m6840d();
                C6021p c6021p = this.f19614C0;
                c6021p.f19552D.f19461a.clear();
                c6021p.f19582r.clear();
                c6021p.f19569e.f20394a.m6840d();
                c6021p.f19585u = null;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m6575l() {
        AtomicReference atomicReference = this.f19618o0;
        Object obj = C5997d.f19481g;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                C5997d.m6414A("pending composition has not been applied");
                throw null;
            }
            if (andSet instanceof Set) {
                m6566c((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                C5997d.m6414A("corrupt pendingModifications drain: " + atomicReference);
                throw null;
            }
            for (Set set : (Set[]) andSet) {
                m6566c(set, true);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m6576m() {
        AtomicReference atomicReference = this.f19618o0;
        Object andSet = atomicReference.getAndSet(null);
        if (AbstractC16544l.m18089b(andSet, C5997d.f19481g)) {
            return;
        }
        if (andSet instanceof Set) {
            m6566c((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                m6566c(set, false);
            }
            return;
        }
        if (andSet == null) {
            C5997d.m6414A("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw null;
        }
        C5997d.m6414A("corrupt pendingModifications drain: " + atomicReference);
        throw null;
    }

    /* JADX INFO: renamed from: n */
    public final void m6577n(ArrayList arrayList) throws Exception {
        if (arrayList.size() > 0) {
            ((AbstractC5981V) ((C17309l) arrayList.get(0)).f55136Y).getClass();
            throw null;
        }
        C5997d.m6437X(true);
        try {
            C6021p c6021p = this.f19614C0;
            c6021p.getClass();
            try {
                c6021p.m6563z(arrayList);
                c6021p.m6546i();
            } catch (Throwable th2) {
                c6021p.m6532a();
                throw th2;
            }
        } catch (Throwable th3) {
            C12953F c12953f = this.f19620q0;
            try {
                if (!c12953f.f41141Y.m14630g()) {
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    if (!c12953f.f41141Y.m14630g()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            Iterator it = c12953f.iterator();
                            while (true) {
                                C7535c c7535c = (C7535c) it;
                                if (!c7535c.hasNext()) {
                                    break;
                                }
                                InterfaceC6034v0 interfaceC6034v0 = (InterfaceC6034v0) c7535c.next();
                                c7535c.remove();
                                interfaceC6034v0.mo2149a();
                            }
                            Trace.endSection();
                        } catch (Throwable th4) {
                            Trace.endSection();
                            throw th4;
                        }
                    }
                }
                throw th3;
            } catch (Exception e10) {
                m6564a();
                throw e10;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final int m6578o(C6018n0 c6018n0, Object obj) {
        int iM6438Y;
        int i10 = c6018n0.f19533a;
        if ((i10 & 2) != 0) {
            c6018n0.f19533a = i10 | 4;
        }
        C5995c c5995c = c6018n0.f19535c;
        if (c5995c != null && c5995c.m6411a()) {
            C5943B0 c5943b0 = this.f19621r0;
            c5943b0.getClass();
            if (!(c5995c.m6411a() && (iM6438Y = C5997d.m6438Y(c5943b0.f19353t0, c5995c.f19473a, c5943b0.f19347Z)) >= 0 && AbstractC16544l.m18089b(c5943b0.f19353t0.get(iM6438Y), c5995c))) {
                synchronized (this.f19619p0) {
                }
                return 1;
            }
            if (c6018n0.f19536d != null) {
                return m6580q(c6018n0, c5995c, obj);
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: p */
    public final void m6579p() {
        C6029t c6029t;
        synchronized (this.f19619p0) {
            try {
                for (Object obj : this.f19621r0.f19348o0) {
                    C6018n0 c6018n0 = obj instanceof C6018n0 ? (C6018n0) obj : null;
                    if (c6018n0 != null && (c6029t = c6018n0.f19534b) != null) {
                        c6029t.m6578o(c6018n0, null);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0099 A[Catch: all -> 0x0031, LOOP:0: B:30:0x005f->B:42:0x0099, LOOP_END, TryCatch #0 {all -> 0x0031, blocks: (B:5:0x000a, B:7:0x0011, B:15:0x001f, B:17:0x0024, B:20:0x0034, B:22:0x0038, B:23:0x0044, B:25:0x0050, B:27:0x0054, B:30:0x005f, B:32:0x006f, B:34:0x007b, B:36:0x0085, B:39:0x0090, B:42:0x0099, B:43:0x009d, B:46:0x00a2), top: B:55:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00a2 A[Catch: all -> 0x0031, EDGE_INSN: B:46:0x00a2->B:47:0x00a7 BREAK  A[LOOP:0: B:30:0x005f->B:42:0x0099], TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:5:0x000a, B:7:0x0011, B:15:0x001f, B:17:0x0024, B:20:0x0034, B:22:0x0038, B:23:0x0044, B:25:0x0050, B:27:0x0054, B:30:0x005f, B:32:0x006f, B:34:0x007b, B:36:0x0085, B:39:0x0090, B:42:0x0099, B:43:0x009d, B:46:0x00a2), top: B:55:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a2 A[SYNTHETIC] */
    /* JADX INFO: renamed from: q */
    public final int m6580q(C6018n0 c6018n0, C5995c c5995c, Object obj) {
        synchronized (this.f19619p0) {
            try {
                C6021p c6021p = this.f19614C0;
                if (c6021p.f19553E && c6021p.m6530Y(c6018n0, obj)) {
                    return 4;
                }
                m6582s();
                if (obj == null) {
                    ((C12951D) this.f19629z0.f42001Y).m14623i(c6018n0, C5975S.f19447q0);
                } else if (obj instanceof C5944C) {
                    Object objM14619e = ((C12951D) this.f19629z0.f42001Y).m14619e(c6018n0);
                    if (objM14619e == null) {
                        this.f19629z0.m14925y(c6018n0, obj);
                        break;
                    }
                    if (objM14619e instanceof C12954G) {
                        C12954G c12954g = (C12954G) objM14619e;
                        Object[] objArr = c12954g.f41144b;
                        long[] jArr = c12954g.f41143a;
                        int length = jArr.length - 2;
                        if (length < 0) {
                            this.f19629z0.m14925y(c6018n0, obj);
                            break;
                        }
                        int i10 = 0;
                        loop0: while (true) {
                            long j10 = jArr[i10];
                            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i11 = 8 - ((~(i10 - length)) >>> 31);
                                for (int i12 = 0; i12 < i11; i12++) {
                                    if ((j10 & 255) < 128 && objArr[(i10 << 3) + i12] == C5975S.f19447q0) {
                                        break loop0;
                                    }
                                    j10 >>= 8;
                                }
                                if (i11 == 8) {
                                    if (i10 == length) {
                                        i10++;
                                    }
                                }
                                this.f19629z0.m14925y(c6018n0, obj);
                                break;
                            }
                            if (i10 == length) {
                                this.f19629z0.m14925y(c6018n0, obj);
                                break;
                            }
                            i10++;
                        }
                    } else {
                        if (objM14619e != C5975S.f19447q0) {
                            this.f19629z0.m14925y(c6018n0, obj);
                            break;
                        }
                    }
                } else {
                    ((C12951D) this.f19629z0.f42001Y).m14623i(c6018n0, C5975S.f19447q0);
                }
                this.f19616Y.mo6491i(this);
                return this.f19614C0.f19553E ? 3 : 2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m6581r(Object obj) {
        Object objM14619e = ((C12951D) this.f19622s0.f42001Y).m14619e(obj);
        if (objM14619e == null) {
            return;
        }
        boolean z6 = objM14619e instanceof C12954G;
        C13288c c13288c = this.f19628y0;
        if (!z6) {
            C6018n0 c6018n0 = (C6018n0) objM14619e;
            if (c6018n0.m6501c(obj) == 4) {
                c13288c.m14925y(obj, c6018n0);
                return;
            }
            return;
        }
        C12954G c12954g = (C12954G) objM14619e;
        Object[] objArr = c12954g.f41144b;
        long[] jArr = c12954g.f41143a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        C6018n0 c6018n1 = (C6018n0) objArr[(i10 << 3) + i12];
                        if (c6018n1.m6501c(obj) == 4) {
                            c13288c.m14925y(obj, c6018n1);
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m6582s() {
        if (this.f19613B0.f1278Z) {
            return;
        }
        this.f19616Y.getClass();
        AbstractC16544l.m18089b(null, null);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0063 A[LOOP:0: B:7:0x001c->B:21:0x0063, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x008b A[SYNTHETIC] */
    /* JADX INFO: renamed from: t */
    public final boolean m6583t(Set set) {
        boolean z6 = set instanceof C6548f;
        C13288c c13288c = this.f19625v0;
        C13288c c13288c2 = this.f19622s0;
        if (z6) {
            C12954G c12954g = ((C6548f) set).f21195Y;
            Object[] objArr = c12954g.f41144b;
            long[] jArr = c12954g.f41143a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                loop0: while (true) {
                    long j10 = jArr[i10];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j10) < 128) {
                                Object obj = objArr[(i10 << 3) + i12];
                                if (((C12951D) c13288c2.f42001Y).m14616b(obj) || ((C12951D) c13288c.f42001Y).m14616b(obj)) {
                                    break loop0;
                                }
                            }
                            j10 >>= 8;
                        }
                        if (i11 == 8) {
                            if (i10 != length) {
                                i10++;
                            }
                        }
                    } else if (i10 != length) {
                        i10++;
                    }
                }
                return true;
            }
        } else {
            for (Object obj2 : set) {
                if (((C12951D) c13288c2.f42001Y).m14616b(obj2) || ((C12951D) c13288c.f42001Y).m14616b(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m6584u() {
        boolean zM6509C;
        synchronized (this.f19619p0) {
            try {
                m6575l();
                try {
                    C13288c c13288c = this.f19629z0;
                    this.f19629z0 = new C13288c(23);
                    try {
                        m6582s();
                        zM6509C = this.f19614C0.m6509C(c13288c);
                        if (!zM6509C) {
                            m6576m();
                        }
                    } catch (Exception e10) {
                        this.f19629z0 = c13288c;
                        throw e10;
                    }
                } catch (Throwable th2) {
                    try {
                        if (!this.f19620q0.f41141Y.m14630g()) {
                            C12953F c12953f = this.f19620q0;
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            if (!c12953f.f41141Y.m14630g()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    Iterator it = c12953f.iterator();
                                    while (((C21030k) ((C7535c) it).f23886o0).hasNext()) {
                                        InterfaceC6034v0 interfaceC6034v0 = (InterfaceC6034v0) ((C21030k) ((C7535c) it).f23886o0).next();
                                        ((C7535c) it).remove();
                                        interfaceC6034v0.mo2149a();
                                    }
                                    Trace.endSection();
                                } catch (Throwable th3) {
                                    Trace.endSection();
                                    throw th3;
                                }
                            }
                        }
                        throw th2;
                    } catch (Exception e11) {
                        m6564a();
                        throw e11;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return zM6509C;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v */
    public final void m6585v(C6548f c6548f) {
        Object obj;
        while (true) {
            Object obj2 = this.f19618o0.get();
            if (obj2 == null ? true : obj2.equals(C5997d.f19481g)) {
                obj = c6548f;
            } else if (obj2 instanceof Set) {
                obj = new Set[]{obj2, c6548f};
            } else {
                if (!(obj2 instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.f19618o0).toString());
                }
                AbstractC16544l.m18092e(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                Set[] setArr = (Set[]) obj2;
                AbstractC16544l.m18094g(setArr, "<this>");
                int length = setArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(setArr, length + 1);
                objArrCopyOf[length] = c6548f;
                obj = objArrCopyOf;
            }
            AtomicReference atomicReference = this.f19618o0;
            do {
                if (atomicReference.compareAndSet(obj2, obj)) {
                    if (obj2 == null) {
                        synchronized (this.f19619p0) {
                            m6576m();
                        }
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == obj2);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m6586w(Object obj) {
        C6018n0 c6018n0M6560w;
        boolean z6;
        boolean z10;
        int i10;
        int i11;
        C6021p c6021p = this.f19614C0;
        if (c6021p.f19590z <= 0 && (c6018n0M6560w = c6021p.m6560w()) != null) {
            boolean z11 = true;
            int i12 = c6018n0M6560w.f19533a | 1;
            c6018n0M6560w.f19533a = i12;
            if ((i12 & 32) == 0) {
                C12948A c12948a = c6018n0M6560w.f19538f;
                if (c12948a == null) {
                    c12948a = new C12948A();
                    c6018n0M6560w.f19538f = c12948a;
                }
                int i13 = c6018n0M6560w.f19537e;
                int iM14602b = c12948a.m14602b(obj);
                if (iM14602b < 0) {
                    iM14602b = ~iM14602b;
                    i11 = -1;
                } else {
                    i11 = c12948a.f41111c[iM14602b];
                }
                c12948a.f41110b[iM14602b] = obj;
                c12948a.f41111c[iM14602b] = i13;
                if (i11 == c6018n0M6560w.f19537e) {
                    return;
                }
            }
            if (obj instanceof AbstractC9543B) {
                ((AbstractC9543B) obj).m10038d(1);
            }
            this.f19622s0.m14925y(obj, c6018n0M6560w);
            if (obj instanceof C5944C) {
                C5944C c5944c = (C5944C) obj;
                C5942B c5942bM6347h = c5944c.m6347h();
                C13288c c13288c = this.f19625v0;
                c13288c.m14923c0(obj);
                C12948A c12948a2 = c5942bM6347h.f19343e;
                Object[] objArr = c12948a2.f41110b;
                long[] jArr = c12948a2.f41109a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i14 = 0;
                    while (true) {
                        long j10 = jArr[i14];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i15 = 8;
                            int i16 = 8 - ((~(i14 - length)) >>> 31);
                            int i17 = 0;
                            while (i17 < i16) {
                                if ((j10 & 255) < 128) {
                                    InterfaceC9542A interfaceC9542A = (InterfaceC9542A) objArr[(i14 << 3) + i17];
                                    if (interfaceC9542A instanceof AbstractC9543B) {
                                        z10 = true;
                                        ((AbstractC9543B) interfaceC9542A).m10038d(1);
                                    } else {
                                        z10 = true;
                                    }
                                    c13288c.m14925y(interfaceC9542A, obj);
                                    i10 = 8;
                                } else {
                                    z10 = z11;
                                    i10 = i15;
                                }
                                j10 >>= i10;
                                i17++;
                                i15 = i10;
                                z11 = z10;
                            }
                            z6 = z11;
                            if (i16 != i15) {
                                break;
                            }
                        } else {
                            z6 = z11;
                        }
                        if (i14 == length) {
                            break;
                        }
                        i14++;
                        z11 = z6;
                    }
                }
                Object obj2 = c5942bM6347h.f19344f;
                C12951D c12951d = c6018n0M6560w.f19539g;
                if (c12951d == null) {
                    c12951d = new C12951D();
                    c6018n0M6560w.f19539g = c12951d;
                }
                c12951d.m14623i(c5944c, obj2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x005d A[Catch: all -> 0x0053, LOOP:0: B:11:0x0023->B:23:0x005d, LOOP_END, TryCatch #0 {all -> 0x0053, blocks: (B:4:0x0003, B:6:0x0012, B:8:0x0016, B:11:0x0023, B:13:0x0033, B:15:0x003f, B:17:0x0048, B:20:0x0055, B:23:0x005d, B:24:0x0060), top: B:29:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0065 A[EDGE_INSN: B:31:0x0065->B:25:0x0065 BREAK  A[LOOP:0: B:11:0x0023->B:23:0x005d], SYNTHETIC] */
    /* JADX INFO: renamed from: x */
    public final void m6587x(Object obj) {
        synchronized (this.f19619p0) {
            try {
                m6581r(obj);
                Object objM14619e = ((C12951D) this.f19625v0.f42001Y).m14619e(obj);
                if (objM14619e != null) {
                    if (objM14619e instanceof C12954G) {
                        C12954G c12954g = (C12954G) objM14619e;
                        Object[] objArr = c12954g.f41144b;
                        long[] jArr = c12954g.f41143a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i10 = 0;
                            while (true) {
                                long j10 = jArr[i10];
                                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                                    if (i10 != length) {
                                        break;
                                        break;
                                    }
                                    i10++;
                                } else {
                                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                                    for (int i12 = 0; i12 < i11; i12++) {
                                        if ((255 & j10) < 128) {
                                            m6581r((C5944C) objArr[(i10 << 3) + i12]);
                                        }
                                        j10 >>= 8;
                                    }
                                    if (i11 != 8) {
                                        break;
                                    } else if (i10 != length) {
                                        break;
                                    } else {
                                        i10++;
                                    }
                                }
                            }
                        }
                    } else {
                        m6581r((C5944C) objM14619e);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
