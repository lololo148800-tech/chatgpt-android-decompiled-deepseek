package p349O0;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import mm.C17296C;
import p049Bm.InterfaceC1440o;
import p692d0.C12954G;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: O0.t0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6030t0 extends AbstractC19694j implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public List f19630Y;

    /* JADX INFO: renamed from: Z */
    public List f19631Z;

    /* JADX INFO: renamed from: o0 */
    public List f19632o0;

    /* JADX INFO: renamed from: p0 */
    public C12954G f19633p0;

    /* JADX INFO: renamed from: q0 */
    public C12954G f19634q0;

    /* JADX INFO: renamed from: r0 */
    public C12954G f19635r0;

    /* JADX INFO: renamed from: s0 */
    public Set f19636s0;

    /* JADX INFO: renamed from: t0 */
    public C12954G f19637t0;

    /* JADX INFO: renamed from: u0 */
    public int f19638u0;

    /* JADX INFO: renamed from: v0 */
    public /* synthetic */ InterfaceC5977T f19639v0;

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ C6032u0 f19640w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6030t0(C6032u0 c6032u0, InterfaceC18770c interfaceC18770c) {
        super(3, interfaceC18770c);
        this.f19640w0 = c6032u0;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0081 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0083 A[Catch: all -> 0x0029, LOOP:1: B:12:0x0041->B:23:0x0083, LOOP_END, TryCatch #0 {all -> 0x0029, blocks: (B:4:0x000b, B:6:0x0018, B:9:0x002c, B:12:0x0041, B:14:0x004c, B:16:0x0058, B:18:0x0062, B:19:0x0072, B:23:0x0083, B:24:0x008c, B:27:0x0099, B:29:0x00a8, B:31:0x00b4, B:33:0x00be, B:34:0x00c8, B:38:0x00d4, B:39:0x00d7, B:42:0x00e7, B:44:0x00f6, B:46:0x0102, B:48:0x010c, B:49:0x011c, B:55:0x0138, B:56:0x013b), top: B:61:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00d2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00d4 A[Catch: all -> 0x0029, LOOP:3: B:27:0x0099->B:38:0x00d4, LOOP_END, TryCatch #0 {all -> 0x0029, blocks: (B:4:0x000b, B:6:0x0018, B:9:0x002c, B:12:0x0041, B:14:0x004c, B:16:0x0058, B:18:0x0062, B:19:0x0072, B:23:0x0083, B:24:0x008c, B:27:0x0099, B:29:0x00a8, B:31:0x00b4, B:33:0x00be, B:34:0x00c8, B:38:0x00d4, B:39:0x00d7, B:42:0x00e7, B:44:0x00f6, B:46:0x0102, B:48:0x010c, B:49:0x011c, B:55:0x0138, B:56:0x013b), top: B:61:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:65:0x008c A[EDGE_INSN: B:65:0x008c->B:24:0x008c BREAK  A[LOOP:1: B:12:0x0041->B:23:0x0083], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00d7 A[EDGE_INSN: B:70:0x00d7->B:39:0x00d7 BREAK  A[LOOP:3: B:27:0x0099->B:38:0x00d4], SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static final void m6588c(C6032u0 c6032u0, List list, List list2, List list3, C12954G c12954g, C12954G c12954g2, C12954G c12954g3, C12954G c12954g4) {
        synchronized (c6032u0.f19647c) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i10 = 0; i10 < size; i10++) {
                    C6029t c6029t = (C6029t) list3.get(i10);
                    c6029t.m6564a();
                    c6032u0.m6604H(c6029t);
                }
                list3.clear();
                Object[] objArr = c12954g.f41144b;
                long[] jArr = c12954g.f41143a;
                int length = jArr.length - 2;
                long j10 = -9187201950435737472L;
                if (length >= 0) {
                    int i11 = 0;
                    while (true) {
                        long j11 = jArr[i11];
                        long[] jArr2 = jArr;
                        if ((((~j11) << 7) & j11 & j10) != j10) {
                            int i12 = 8 - ((~(i11 - length)) >>> 31);
                            for (int i13 = 0; i13 < i12; i13++) {
                                if ((j11 & 255) < 128) {
                                    C6029t c6029t2 = (C6029t) objArr[(i11 << 3) + i13];
                                    c6029t2.m6564a();
                                    c6032u0.m6604H(c6029t2);
                                }
                                j11 >>= 8;
                            }
                            if (i12 != 8) {
                                break;
                            }
                            if (i11 != length) {
                                break;
                            }
                            i11++;
                            jArr = jArr2;
                            j10 = -9187201950435737472L;
                        } else if (i11 != length) {
                            break;
                            break;
                        } else {
                            i11++;
                            jArr = jArr2;
                            j10 = -9187201950435737472L;
                        }
                    }
                }
                c12954g.m14625b();
                Object[] objArr2 = c12954g2.f41144b;
                long[] jArr3 = c12954g2.f41143a;
                int length2 = jArr3.length - 2;
                if (length2 >= 0) {
                    int i14 = 0;
                    while (true) {
                        long j12 = jArr3[i14];
                        if ((((~j12) << 7) & j12 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i14 != length2) {
                                break;
                                break;
                            }
                            i14++;
                        } else {
                            int i15 = 8 - ((~(i14 - length2)) >>> 31);
                            for (int i16 = 0; i16 < i15; i16++) {
                                if ((j12 & 255) < 128) {
                                    ((C6029t) objArr2[(i14 << 3) + i16]).m6570g();
                                }
                                j12 >>= 8;
                            }
                            if (i15 != 8) {
                                break;
                            } else if (i14 != length2) {
                                break;
                            } else {
                                i14++;
                            }
                        }
                    }
                }
                c12954g2.m14625b();
                c12954g3.m14625b();
                Object[] objArr3 = c12954g4.f41144b;
                long[] jArr4 = c12954g4.f41143a;
                int length3 = jArr4.length - 2;
                if (length3 >= 0) {
                    int i17 = 0;
                    while (true) {
                        long j13 = jArr4[i17];
                        if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i18 = 8 - ((~(i17 - length3)) >>> 31);
                            for (int i19 = 0; i19 < i18; i19++) {
                                if ((j13 & 255) < 128) {
                                    C6029t c6029t3 = (C6029t) objArr3[(i17 << 3) + i19];
                                    c6029t3.m6564a();
                                    c6032u0.m6604H(c6029t3);
                                }
                                j13 >>= 8;
                            }
                            if (i18 != 8) {
                                break;
                            }
                        }
                        if (i17 == length3) {
                            break;
                        } else {
                            i17++;
                        }
                    }
                }
                c12954g4.m14625b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m6589k(List list, C6032u0 c6032u0) {
        list.clear();
        synchronized (c6032u0.f19647c) {
            try {
                ArrayList arrayList = c6032u0.f19655k;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    list.add((AbstractC5981V) arrayList.get(i10));
                }
                c6032u0.f19655k.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C6030t0 c6030t0 = new C6030t0(this.f19640w0, (InterfaceC18770c) obj3);
        c6030t0.f19639v0 = (InterfaceC5977T) obj2;
        c6030t0.invokeSuspend(C17296C.f55119a);
        return EnumC19250a.f61036Y;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x00a7 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:16:0x00d0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:17:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:20:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:22:0x0132 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x0133  */
    /* JADX WARN: Code duplicated, block: B:26:0x0148  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0133 -> B:24:0x013c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0148 -> B:25:0x0144). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // sm.AbstractC19685a
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p349O0.C6030t0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
