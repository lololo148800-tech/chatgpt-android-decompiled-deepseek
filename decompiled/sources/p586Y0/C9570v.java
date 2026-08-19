package p586Y0;

import java.util.HashMap;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p1140z1.C21688e;
import p349O0.C5942B;
import p349O0.C5944C;
import p349O0.C5997d;
import p349O0.C6019o;
import p392Q0.C6546d;
import p402Qc.C6593i;
import p692d0.C12948A;
import p692d0.C12951D;
import p692d0.C12954G;
import p720e6.C13288c;

/* JADX INFO: renamed from: Y0.v */
/* JADX INFO: loaded from: classes.dex */
public final class C9570v {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1436k f28783a;

    /* JADX INFO: renamed from: b */
    public Object f28784b;

    /* JADX INFO: renamed from: c */
    public C12948A f28785c;

    /* JADX INFO: renamed from: j */
    public int f28792j;

    /* JADX INFO: renamed from: d */
    public int f28786d = -1;

    /* JADX INFO: renamed from: e */
    public final C13288c f28787e = new C13288c(23);

    /* JADX INFO: renamed from: f */
    public final C12951D f28788f = new C12951D();

    /* JADX INFO: renamed from: g */
    public final C12954G f28789g = new C12954G();

    /* JADX INFO: renamed from: h */
    public final C6546d f28790h = new C6546d(new C5944C[16]);

    /* JADX INFO: renamed from: i */
    public final C6019o f28791i = new C6019o(this, 1);

    /* JADX INFO: renamed from: k */
    public final C13288c f28793k = new C13288c(23);

    /* JADX INFO: renamed from: l */
    public final HashMap f28794l = new HashMap();

    public C9570v(InterfaceC1436k interfaceC1436k) {
        this.f28783a = interfaceC1436k;
    }

    /* JADX INFO: renamed from: a */
    public final void m10116a(Object obj, C6593i c6593i, InterfaceC1426a interfaceC1426a) {
        long[] jArr;
        int i10;
        Object obj2 = this.f28784b;
        C12948A c12948a = this.f28785c;
        int i11 = this.f28786d;
        this.f28784b = obj;
        this.f28785c = (C12948A) this.f28788f.m14619e(obj);
        if (this.f28786d == -1) {
            this.f28786d = AbstractC9562n.m10087k().mo10044d();
        }
        C6019o c6019o = this.f28791i;
        C6546d c6546dM6420G = C5997d.m6420G();
        try {
            c6546dM6420G.m7099c(c6019o);
            AbstractC9567s.m10110f(interfaceC1426a, c6593i);
            c6546dM6420G.m7111p(c6546dM6420G.f21184o0 - 1);
            Object obj3 = this.f28784b;
            AbstractC16544l.m18091d(obj3);
            int i12 = this.f28786d;
            C12948A c12948a2 = this.f28785c;
            if (c12948a2 != null) {
                long[] jArr2 = c12948a2.f41109a;
                int length = jArr2.length - 2;
                if (length >= 0) {
                    int i13 = 0;
                    while (true) {
                        long j10 = jArr2[i13];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i14 = 8;
                            int i15 = 8 - ((~(i13 - length)) >>> 31);
                            int i16 = 0;
                            while (i16 < i15) {
                                if ((j10 & 255) < 128) {
                                    int i17 = (i13 << 3) + i16;
                                    Object obj4 = c12948a2.f41110b[i17];
                                    boolean z6 = c12948a2.f41111c[i17] != i12;
                                    if (z6) {
                                        m10119d(obj3, obj4);
                                    }
                                    if (z6) {
                                        c12948a2.m14605e(i17);
                                    }
                                    i10 = 8;
                                } else {
                                    i10 = i14;
                                }
                                j10 >>= i10;
                                i16++;
                                i14 = i10;
                                jArr2 = jArr2;
                            }
                            jArr = jArr2;
                            if (i15 != i14) {
                                break;
                            }
                        } else {
                            jArr = jArr2;
                        }
                        if (i13 == length) {
                            break;
                        }
                        i13++;
                        jArr2 = jArr;
                    }
                }
            }
            this.f28784b = obj2;
            this.f28785c = c12948a;
            this.f28786d = i11;
        } catch (Throwable th2) {
            c6546dM6420G.m7111p(c6546dM6420G.f21184o0 - 1);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x008c A[LOOP:0: B:15:0x0047->B:28:0x008c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x008f A[EDGE_INSN: B:37:0x008f->B:29:0x008f BREAK  A[LOOP:0: B:15:0x0047->B:28:0x008c], SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public final void m10118c(Object obj, int i10, Object obj2, C12948A c12948a) {
        int i11;
        if (this.f28792j > 0) {
            return;
        }
        int iM14602b = c12948a.m14602b(obj);
        if (iM14602b < 0) {
            iM14602b = ~iM14602b;
            i11 = -1;
        } else {
            i11 = c12948a.f41111c[iM14602b];
        }
        c12948a.f41110b[iM14602b] = obj;
        c12948a.f41111c[iM14602b] = i10;
        if ((obj instanceof C5944C) && i11 != i10) {
            C5942B c5942bM6347h = ((C5944C) obj).m6347h();
            this.f28794l.put(obj, c5942bM6347h.f19344f);
            C12948A c12948a2 = c5942bM6347h.f19343e;
            C13288c c13288c = this.f28793k;
            c13288c.m14923c0(obj);
            Object[] objArr = c12948a2.f41110b;
            long[] jArr = c12948a2.f41109a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i12 = 0;
                while (true) {
                    long j10 = jArr[i12];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i12 != length) {
                            break;
                            break;
                        }
                        i12++;
                    } else {
                        int i13 = 8 - ((~(i12 - length)) >>> 31);
                        for (int i14 = 0; i14 < i13; i14++) {
                            if ((j10 & 255) < 128) {
                                InterfaceC9542A interfaceC9542A = (InterfaceC9542A) objArr[(i12 << 3) + i14];
                                if (interfaceC9542A instanceof AbstractC9543B) {
                                    ((AbstractC9543B) interfaceC9542A).m10038d(2);
                                }
                                c13288c.m14925y(interfaceC9542A, obj);
                            }
                            j10 >>= 8;
                        }
                        if (i13 != 8) {
                            break;
                        } else if (i12 != length) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                }
            }
        }
        if (i11 == -1) {
            if (obj instanceof AbstractC9543B) {
                ((AbstractC9543B) obj).m10038d(2);
            }
            this.f28787e.m14925y(obj, obj2);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m10119d(Object obj, Object obj2) {
        C13288c c13288c = this.f28787e;
        c13288c.m14922b0(obj2, obj);
        if (!(obj2 instanceof C5944C) || ((C12951D) c13288c.f42001Y).m14616b(obj2)) {
            return;
        }
        this.f28793k.m14923c0(obj2);
        this.f28794l.remove(obj2);
    }

    /* JADX INFO: renamed from: e */
    public final void m10120e() {
        C21688e c21688e;
        long[] jArr;
        int i10;
        C21688e c21688e2;
        long[] jArr2;
        int i11;
        int i12;
        int i13;
        char c9;
        long j10;
        int i14;
        C21688e c21688e3 = C21688e.f68837s0;
        C12951D c12951d = this.f28788f;
        long[] jArr3 = c12951d.f41123a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i15 = 0;
        while (true) {
            long j11 = jArr3[i15];
            char c10 = 7;
            long j12 = -9187201950435737472L;
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i16 = 8;
                int i17 = 8 - ((~(i15 - length)) >>> 31);
                int i18 = 0;
                while (i18 < i17) {
                    if ((j11 & 255) < 128) {
                        int i19 = (i15 << 3) + i18;
                        Object obj = c12951d.f41124b[i19];
                        C12948A c12948a = (C12948A) c12951d.f41125c[i19];
                        Boolean bool = (Boolean) c21688e3.invoke(obj);
                        if (bool.booleanValue()) {
                            Object[] objArr = c12948a.f41110b;
                            int[] iArr = c12948a.f41111c;
                            long[] jArr4 = c12948a.f41109a;
                            int length2 = jArr4.length - 2;
                            c21688e2 = c21688e3;
                            jArr2 = jArr3;
                            i11 = length;
                            if (length2 >= 0) {
                                int i20 = 0;
                                while (true) {
                                    long j13 = jArr4[i20];
                                    i13 = i17;
                                    long[] jArr5 = jArr4;
                                    c9 = 7;
                                    j10 = -9187201950435737472L;
                                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i21 = 8 - ((~(i20 - length2)) >>> 31);
                                        int i22 = 0;
                                        while (i22 < i21) {
                                            if ((j13 & 255) < 128) {
                                                int i23 = (i20 << 3) + i22;
                                                Object obj2 = objArr[i23];
                                                int i24 = iArr[i23];
                                                m10119d(obj, obj2);
                                            }
                                            j13 >>= 8;
                                            i22++;
                                            i15 = i15;
                                        }
                                        i12 = i15;
                                        if (i21 != 8) {
                                            break;
                                        }
                                    } else {
                                        i12 = i15;
                                    }
                                    if (i20 == length2) {
                                        break;
                                    }
                                    i20++;
                                    i17 = i13;
                                    jArr4 = jArr5;
                                    i15 = i12;
                                }
                            } else {
                                i12 = i15;
                                i13 = i17;
                                j10 = -9187201950435737472L;
                                c9 = 7;
                            }
                        } else {
                            c21688e2 = c21688e3;
                            jArr2 = jArr3;
                            i11 = length;
                            i12 = i15;
                            i13 = i17;
                            c9 = c10;
                            j10 = j12;
                        }
                        if (bool.booleanValue()) {
                            c12951d.m14622h(i19);
                        }
                        i14 = 8;
                    } else {
                        c21688e2 = c21688e3;
                        jArr2 = jArr3;
                        i11 = length;
                        i12 = i15;
                        i13 = i17;
                        c9 = c10;
                        j10 = j12;
                        i14 = i16;
                    }
                    j11 >>= i14;
                    i18++;
                    i16 = i14;
                    j12 = j10;
                    c10 = c9;
                    c21688e3 = c21688e2;
                    jArr3 = jArr2;
                    length = i11;
                    i17 = i13;
                    i15 = i12;
                }
                c21688e = c21688e3;
                jArr = jArr3;
                int i25 = length;
                int i26 = i15;
                if (i17 != i16) {
                    return;
                }
                length = i25;
                i10 = i26;
            } else {
                c21688e = c21688e3;
                jArr = jArr3;
                i10 = i15;
            }
            if (i10 == length) {
                return;
            }
            i15 = i10 + 1;
            c21688e3 = c21688e;
            jArr3 = jArr;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 18571. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: b */
    public final boolean m10117b(java.util.Set r46) {
        /*
            Method dump skipped, instruction units count: 1857
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p586Y0.C9570v.m10117b(java.util.Set):boolean");
    }
}
