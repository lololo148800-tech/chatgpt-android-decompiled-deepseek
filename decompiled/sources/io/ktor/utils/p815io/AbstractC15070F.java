package io.ktor.utils.p815io;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.io.EOFException;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p008A6.C0386f;
import p025An.AbstractC0575H;
import p025An.C0564B0;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p138F8.vJO.anhfj;
import p153Fn.AbstractC2923a;
import p488Tn.AbstractC7527j;
import p488Tn.C7518a;
import p488Tn.C7524g;
import p488Tn.InterfaceC7526i;
import p509Uk.C7715h;
import p509Uk.C7716i;
import p523V9.AbstractC8048a6;
import p523V9.AbstractC8154o0;
import p544W9.AbstractC8694q;
import p571X9.AbstractC9233X;
import p658b5.C11234e;
import p972qm.C18777j;
import p972qm.InterfaceC18776i;
import p996rm.C19251b;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: io.ktor.utils.io.F */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15070F {

    /* JADX INFO: renamed from: a */
    public static final C15067C f46833a = new C15067C();

    /* JADX INFO: renamed from: a */
    public static C15073I m16173a(byte[] content) {
        int length = content.length;
        AbstractC16544l.m18094g(content, "content");
        C7518a c7518a = new C7518a();
        c7518a.m7815P(content, 0, length);
        return new C15073I(c7518a);
    }

    /* JADX INFO: renamed from: b */
    public static final void m16174b(InterfaceC15088n interfaceC15088n) {
        AbstractC16544l.m18094g(interfaceC15088n, "<this>");
        interfaceC15088n.mo1138b(new IOException("Channel was cancelled"));
    }

    /* JADX INFO: renamed from: c */
    public static final void m16175c(InterfaceC15066B interfaceC15066B, Throwable th2) {
        AbstractC16544l.m18094g(interfaceC15066B, "<this>");
        if (th2 != null) {
            ((C15085k) interfaceC15066B).mo1138b(th2);
            return;
        }
        C15068D c15068d = new C15068D(1, 0, InterfaceC15066B.class, interfaceC15066B, "flushAndClose", "flushAndClose(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        C15067C c15067c = f46833a;
        try {
            AbstractC2923a.m3736j(C17296C.f55119a, AbstractC8154o0.m8714e(new C19251b(c15068d)));
        } catch (Throwable th3) {
            AbstractC8048a6.m8438b(c15067c, th3);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007f  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:52:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v2, types: [io.ktor.utils.io.B] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v9, types: [io.ktor.utils.io.B] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00d9 -> B:20:0x0056). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: d */
    public static final Object m16176d(InterfaceC15088n interfaceC15088n, InterfaceC15066B interfaceC15066B, long j10, AbstractC19687c abstractC19687c) throws Throwable {
        C15089o c15089o;
        InterfaceC15088n interfaceC15088n2;
        long j11;
        long j12;
        C15089o c15089o2;
        InterfaceC15088n interfaceC15088n3;
        ?? r6;
        C15085k c15085k;
        InterfaceC15066B interfaceC15066B2;
        long j13;
        long j14;
        if (abstractC19687c instanceof C15089o) {
            c15089o = (C15089o) abstractC19687c;
            int i10 = c15089o.f46879r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c15089o.f46879r0 = i10 - Integer.MIN_VALUE;
            } else {
                c15089o = new C15089o(abstractC19687c);
            }
        } else {
            c15089o = new C15089o(abstractC19687c);
        }
        Object obj = c15089o.f46878q0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        ?? r10 = c15089o.f46879r0;
        int i11 = 1;
        try {
            if (r10 == 0) {
                AbstractC9233X.m9807c(obj);
                r10 = interfaceC15066B;
                j11 = j10;
                j12 = j11;
                c15089o2 = c15089o;
                interfaceC15088n3 = interfaceC15088n;
                if (interfaceC15088n3.mo1141e()) {
                }
                c15089o2.f46874Y = null;
                c15089o2.f46875Z = null;
                c15089o2.f46876o0 = j12;
                c15089o2.f46877p0 = j11;
                c15089o2.f46879r0 = 3;
                if (((C15085k) r10).m16203h(c15089o2) == enumC19250a) {
                    return enumC19250a;
                }
                j13 = j11;
                j14 = j12;
            } else if (r10 == 1) {
                j11 = c15089o.f46877p0;
                j12 = c15089o.f46876o0;
                InterfaceC15066B interfaceC15066B3 = c15089o.f46875Z;
                interfaceC15088n2 = (InterfaceC15088n) c15089o.f46874Y;
                AbstractC9233X.m9807c(obj);
                r6 = interfaceC15066B3;
                long jMin = Math.min(j11, AbstractC8694q.m9397d(interfaceC15088n2.mo1139c()));
                c15085k = (C15085k) r6;
                interfaceC15088n2.mo1139c().mo7816U(c15085k.m16206k(), jMin);
                j11 -= jMin;
                c15089o.f46874Y = interfaceC15088n2;
                c15089o.f46875Z = c15085k;
                c15089o.f46876o0 = j12;
                c15089o.f46877p0 = j11;
                c15089o.f46879r0 = 2;
                if (c15085k.m16203h(c15089o) == enumC19250a) {
                    return enumC19250a;
                }
                interfaceC15066B2 = c15085k;
                InterfaceC15088n interfaceC15088n4 = interfaceC15088n2;
                c15089o2 = c15089o;
                interfaceC15088n3 = interfaceC15088n4;
                i11 = 1;
                r10 = interfaceC15066B2;
                if (interfaceC15088n3.mo1141e()) {
                }
                c15089o2.f46874Y = null;
                c15089o2.f46875Z = null;
                c15089o2.f46876o0 = j12;
                c15089o2.f46877p0 = j11;
                c15089o2.f46879r0 = 3;
                if (((C15085k) r10).m16203h(c15089o2) == enumC19250a) {
                    return enumC19250a;
                }
                j13 = j11;
                j14 = j12;
            } else {
                if (r10 == 2) {
                    j11 = c15089o.f46877p0;
                    j12 = c15089o.f46876o0;
                    InterfaceC15066B interfaceC15066B4 = c15089o.f46875Z;
                    interfaceC15088n2 = (InterfaceC15088n) c15089o.f46874Y;
                    AbstractC9233X.m9807c(obj);
                    interfaceC15066B2 = interfaceC15066B4;
                    try {
                        InterfaceC15088n interfaceC15088n5 = interfaceC15088n2;
                        c15089o2 = c15089o;
                        interfaceC15088n3 = interfaceC15088n5;
                        i11 = 1;
                        r10 = interfaceC15066B2;
                        if (!interfaceC15088n3.mo1141e() || j11 <= 0) {
                            c15089o2.f46874Y = null;
                            c15089o2.f46875Z = null;
                            c15089o2.f46876o0 = j12;
                            c15089o2.f46877p0 = j11;
                            c15089o2.f46879r0 = 3;
                            if (((C15085k) r10).m16203h(c15089o2) == enumC19250a) {
                                return enumC19250a;
                            }
                            j13 = j11;
                            j14 = j12;
                        } else {
                            try {
                                if (interfaceC15088n3.mo1139c().mo7821g()) {
                                    c15089o2.f46874Y = interfaceC15088n3;
                                    c15089o2.f46875Z = r10;
                                    c15089o2.f46876o0 = j12;
                                    c15089o2.f46877p0 = j11;
                                    c15089o2.f46879r0 = i11;
                                    if (interfaceC15088n3.mo1140d(i11, c15089o2) == enumC19250a) {
                                        return enumC19250a;
                                    }
                                }
                                C15089o c15089o3 = c15089o2;
                                interfaceC15088n2 = interfaceC15088n3;
                                c15089o = c15089o3;
                                r6 = r10;
                                long jMin2 = Math.min(j11, AbstractC8694q.m9397d(interfaceC15088n2.mo1139c()));
                                c15085k = (C15085k) r6;
                                interfaceC15088n2.mo1139c().mo7816U(c15085k.m16206k(), jMin2);
                                j11 -= jMin2;
                                c15089o.f46874Y = interfaceC15088n2;
                                c15089o.f46875Z = c15085k;
                                c15089o.f46876o0 = j12;
                                c15089o.f46877p0 = j11;
                                c15089o.f46879r0 = 2;
                                if (c15085k.m16203h(c15089o) == enumC19250a) {
                                    return enumC19250a;
                                }
                                interfaceC15066B2 = c15085k;
                                InterfaceC15088n interfaceC15088n6 = interfaceC15088n2;
                                c15089o2 = c15089o;
                                interfaceC15088n3 = interfaceC15088n6;
                                i11 = 1;
                                r10 = interfaceC15066B2;
                                if (interfaceC15088n3.mo1141e()) {
                                }
                                c15089o2.f46874Y = null;
                                c15089o2.f46875Z = null;
                                c15089o2.f46876o0 = j12;
                                c15089o2.f46877p0 = j11;
                                c15089o2.f46879r0 = 3;
                                if (((C15085k) r10).m16203h(c15089o2) == enumC19250a) {
                                    return enumC19250a;
                                }
                                j13 = j11;
                                j14 = j12;
                            } catch (Throwable th2) {
                                th = th2;
                                r10 = c15085k;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        C15089o c15089o4 = c15089o2;
                        interfaceC15088n2 = interfaceC15088n3;
                        c15089o = c15089o4;
                    }
                    try {
                        interfaceC15088n2.mo1138b(th);
                        m16175c(r10, th);
                        throw th;
                    } catch (Throwable th4) {
                        c15089o.f46874Y = th4;
                        c15089o.f46875Z = null;
                        c15089o.f46879r0 = 4;
                        if (((C15085k) r10).m16203h(c15089o) == enumC19250a) {
                            return enumC19250a;
                        }
                        throw th4;
                    }
                }
                if (r10 != 3) {
                    if (r10 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Throwable th5 = (Throwable) c15089o.f46874Y;
                    AbstractC9233X.m9807c(obj);
                    throw th5;
                }
                j13 = c15089o.f46877p0;
                j14 = c15089o.f46876o0;
                AbstractC9233X.m9807c(obj);
            }
            return new Long(j14 - j13);
        } catch (Throwable th6) {
            th = th6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0076 A[PHI: r2 r6 r8 r10
      0x0076: PHI (r2v2 Bm.k) = (r2v1 Bm.k), (r2v4 Bm.k) binds: [B:30:0x006c, B:47:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x0076: PHI (r6v10 io.ktor.utils.io.n) = (r6v0 io.ktor.utils.io.n), (r6v12 io.ktor.utils.io.n) binds: [B:30:0x006c, B:47:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x0076: PHI (r8v2 long) = (r8v0 long), (r8v4 long) binds: [B:30:0x006c, B:47:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x0076: PHI (r10v10 kotlin.jvm.internal.A) = (r10v5 kotlin.jvm.internal.A), (r10v11 kotlin.jvm.internal.A) binds: [B:30:0x006c, B:47:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x007c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0082  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0088 -> B:46:0x00bc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00a3 -> B:42:0x00a8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: e */
    public static final java.lang.Object m16177e(io.ktor.utils.p815io.InterfaceC15088n r6, final java.nio.channels.WritableByteChannel r7, final long r8, sm.AbstractC19687c r10) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.p815io.AbstractC15070F.m16177e(io.ktor.utils.io.n, java.nio.channels.WritableByteChannel, long, sm.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0049 -> B:26:0x0060). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x005a -> B:25:0x005d). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: f */
    public static final Object m16178f(InterfaceC15088n interfaceC15088n, long j10, AbstractC19687c abstractC19687c) {
        C15090p c15090p;
        long j11;
        InterfaceC15088n interfaceC15088n2;
        long j12;
        if (abstractC19687c instanceof C15090p) {
            c15090p = (C15090p) abstractC19687c;
            int i10 = c15090p.f46884q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c15090p.f46884q0 = i10 - Integer.MIN_VALUE;
            } else {
                c15090p = new C15090p(abstractC19687c);
            }
        } else {
            c15090p = new C15090p(abstractC19687c);
        }
        Object obj = c15090p.f46883p0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c15090p.f46884q0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            j11 = j10;
            if (j10 > 0 || interfaceC15088n.mo1141e()) {
                return new Long(j11 - j10);
            }
            if (m16180h(interfaceC15088n) == 0) {
                c15090p.f46880Y = interfaceC15088n;
                c15090p.f46881Z = j11;
                c15090p.f46882o0 = j10;
                c15090p.f46884q0 = 1;
                if (interfaceC15088n.mo1140d(1, c15090p) == enumC19250a) {
                    return enumC19250a;
                }
                interfaceC15088n2 = interfaceC15088n;
                j12 = j10;
            }
            long jMin = Math.min(j10, AbstractC8694q.m9397d(interfaceC15088n.mo1139c()));
            AbstractC8694q.m9396c(interfaceC15088n.mo1139c(), jMin);
            j10 -= jMin;
            if (j10 > 0) {
            }
            return new Long(j11 - j10);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j12 = c15090p.f46882o0;
        j11 = c15090p.f46881Z;
        interfaceC15088n2 = c15090p.f46880Y;
        AbstractC9233X.m9807c(obj);
        long j13 = j12;
        interfaceC15088n = interfaceC15088n2;
        j10 = j13;
        long jMin2 = Math.min(j10, AbstractC8694q.m9397d(interfaceC15088n.mo1139c()));
        AbstractC8694q.m9396c(interfaceC15088n.mo1139c(), jMin2);
        j10 -= jMin2;
        if (j10 > 0) {
        }
        return new Long(j11 - j10);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0036 A[RETURN] */
    /* JADX INFO: renamed from: g */
    public static final Object m16179g(InterfaceC15066B interfaceC15066B, AbstractC19687c abstractC19687c) throws Throwable {
        Object objM16203h;
        AbstractC16544l.m18094g(interfaceC15066B, "<this>");
        C15085k c15085k = (C15085k) interfaceC15066B;
        Throwable thMo1137a = c15085k.mo1137a();
        if (thMo1137a != null) {
            throw thMo1137a;
        }
        C15085k c15085k2 = interfaceC15066B instanceof C15085k ? (C15085k) interfaceC15066B : null;
        C17296C c17296c = C17296C.f55119a;
        if (c15085k2 == null || !c15085k2.f46865b) {
            C7518a c7518aM16206k = c15085k.m16206k();
            AbstractC16544l.m18094g(c7518aM16206k, "<this>");
            if (((int) c7518aM16206k.f23841o0) >= 1048576) {
                objM16203h = c15085k.m16203h(abstractC19687c);
                if (objM16203h == EnumC19250a.f61036Y) {
                    return objM16203h;
                }
            }
        } else {
            objM16203h = c15085k.m16203h(abstractC19687c);
            if (objM16203h == EnumC19250a.f61036Y) {
                return objM16203h;
            }
        }
        return c17296c;
    }

    /* JADX INFO: renamed from: h */
    public static final int m16180h(InterfaceC15088n interfaceC15088n) {
        AbstractC16544l.m18094g(interfaceC15088n, "<this>");
        return (int) interfaceC15088n.mo1139c().mo7819b().f23841o0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public static final Object m16181i(InterfaceC15088n interfaceC15088n, byte[] buffer, int i10, int i11, AbstractC19687c abstractC19687c) {
        C15091q c15091q;
        if (abstractC19687c instanceof C15091q) {
            c15091q = (C15091q) abstractC19687c;
            int i12 = c15091q.f46890r0;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c15091q.f46890r0 = i12 - Integer.MIN_VALUE;
            } else {
                c15091q = new C15091q(abstractC19687c);
            }
        } else {
            c15091q = new C15091q(abstractC19687c);
        }
        Object obj = c15091q.f46889q0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i13 = c15091q.f46890r0;
        if (i13 == 0) {
            AbstractC9233X.m9807c(obj);
            if (interfaceC15088n.mo1141e()) {
                return new Integer(-1);
            }
            if (interfaceC15088n.mo1139c().mo7821g()) {
                c15091q.f46885Y = interfaceC15088n;
                c15091q.f46886Z = buffer;
                c15091q.f46887o0 = i10;
                c15091q.f46888p0 = i11;
                c15091q.f46890r0 = 1;
                if (interfaceC15088n.mo1140d(1, c15091q) == enumC19250a) {
                    return enumC19250a;
                }
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i11 = c15091q.f46888p0;
            i10 = c15091q.f46887o0;
            buffer = c15091q.f46886Z;
            interfaceC15088n = c15091q.f46885Y;
            AbstractC9233X.m9807c(obj);
        }
        if (interfaceC15088n.mo1141e()) {
            return new Integer(-1);
        }
        InterfaceC7526i interfaceC7526iMo1139c = interfaceC15088n.mo1139c();
        AbstractC16544l.m18094g(interfaceC7526iMo1139c, "<this>");
        AbstractC16544l.m18094g(buffer, "buffer");
        int iMo7814N = interfaceC7526iMo1139c.mo7814N(buffer, i10, i11 + i10);
        if (iMo7814N == -1) {
            iMo7814N = 0;
        }
        return new Integer(iMo7814N);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: k */
    public static final Object m16183k(InterfaceC15088n interfaceC15088n, AbstractC19687c abstractC19687c) throws EOFException {
        C15093s c15093s;
        if (abstractC19687c instanceof C15093s) {
            c15093s = (C15093s) abstractC19687c;
            int i10 = c15093s.f46897o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c15093s.f46897o0 = i10 - Integer.MIN_VALUE;
            } else {
                c15093s = new C15093s(abstractC19687c);
            }
        } else {
            c15093s = new C15093s(abstractC19687c);
        }
        Object obj = c15093s.f46896Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c15093s.f46897o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            if (interfaceC15088n.mo1139c().mo7821g()) {
                c15093s.f46895Y = interfaceC15088n;
                c15093s.f46897o0 = 1;
                if (interfaceC15088n.mo1140d(1, c15093s) == enumC19250a) {
                    return enumC19250a;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC15088n = c15093s.f46895Y;
            AbstractC9233X.m9807c(obj);
        }
        if (interfaceC15088n.mo1139c().mo7821g()) {
            throw new EOFException("Not enough data available");
        }
        return Byte.valueOf(interfaceC15088n.mo1139c().readByte());
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0047  */
    /* JADX WARN: Code duplicated, block: B:19:0x0051  */
    /* JADX WARN: Code duplicated, block: B:21:0x005f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0060  */
    /* JADX WARN: Code duplicated, block: B:24:0x0064 A[PHI: r11 r12 r13
      0x0064: PHI (r11v5 io.ktor.utils.io.n) = (r11v3 io.ktor.utils.io.n), (r11v7 io.ktor.utils.io.n) binds: [B:18:0x004f, B:23:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0064: PHI (r12v6 Tn.a) = (r12v5 Tn.a), (r12v7 Tn.a) binds: [B:18:0x004f, B:23:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0064: PHI (r13v7 int) = (r13v6 int), (r13v8 int) binds: [B:18:0x004f, B:23:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    /* JADX WARN: Code duplicated, block: B:28:0x007b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0086  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x004f -> B:24:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0060 -> B:23:0x0062). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: l */
    public static final java.lang.Object m16184l(io.ktor.utils.p815io.InterfaceC15088n r11, int r12, sm.AbstractC19687c r13) {
        /*
            boolean r0 = r13 instanceof io.ktor.utils.p815io.C15094t
            if (r0 == 0) goto L13
            r0 = r13
            io.ktor.utils.io.t r0 = (io.ktor.utils.p815io.C15094t) r0
            int r1 = r0.f46902q0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f46902q0 = r1
            goto L18
        L13:
            io.ktor.utils.io.t r0 = new io.ktor.utils.io.t
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f46901p0
            rm.a r1 = p996rm.EnumC19250a.f61036Y
            int r2 = r0.f46902q0
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            int r11 = r0.f46900o0
            Tn.a r12 = r0.f46899Z
            io.ktor.utils.io.n r2 = r0.f46898Y
            p571X9.AbstractC9233X.m9807c(r13)
            goto L62
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            p571X9.AbstractC9233X.m9807c(r13)
            Tn.a r13 = new Tn.a
            r13.<init>()
            r10 = r13
            r13 = r12
            r12 = r10
        L40:
            long r4 = r12.f23841o0
            long r6 = (long) r13
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L94
            Tn.i r2 = r11.mo1139c()
            boolean r2 = r2.mo7821g()
            if (r2 == 0) goto L64
            r0.f46898Y = r11
            r0.f46899Z = r12
            r0.f46900o0 = r13
            r0.f46902q0 = r3
            java.lang.Object r2 = r11.mo1140d(r3, r0)
            if (r2 != r1) goto L60
            return r1
        L60:
            r2 = r11
            r11 = r13
        L62:
            r13 = r11
            r11 = r2
        L64:
            boolean r2 = r11.mo1141e()
            if (r2 != 0) goto L94
            Tn.i r2 = r11.mo1139c()
            long r4 = p544W9.AbstractC8694q.m9397d(r2)
            long r6 = (long) r13
            long r8 = r12.f23841o0
            long r8 = r6 - r8
            int r2 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r2 <= 0) goto L86
            Tn.i r2 = r11.mo1139c()
            long r4 = r12.f23841o0
            long r6 = r6 - r4
            r2.mo7816U(r12, r6)
            goto L40
        L86:
            Tn.i r2 = r11.mo1139c()
            long r4 = r2.mo7826z(r12)
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r4)
            goto L40
        L94:
            long r0 = r12.f23841o0
            long r2 = (long) r13
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r11 < 0) goto L9c
            return r12
        L9c:
            java.io.EOFException r11 = new java.io.EOFException
            java.lang.String r0 = "Not enough data available, required "
            java.lang.String r1 = " bytes but only "
            java.lang.StringBuilder r13 = android.gov.nist.javax.sdp.fields.AbstractC10763a.m11057o(r13, r0, r1)
            long r0 = r12.f23841o0
            java.lang.String r12 = " available"
            java.lang.String r12 = android.gov.nist.javax.sdp.fields.AbstractC10763a.m11050h(r0, r12, r13)
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.p815io.AbstractC15070F.m16184l(io.ktor.utils.io.n, int, sm.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: m */
    public static final Object m16185m(InterfaceC15088n interfaceC15088n, long j10, AbstractC19687c abstractC19687c) {
        C15096v c15096v;
        C7518a c7518a;
        if (abstractC19687c instanceof C15096v) {
            c15096v = (C15096v) abstractC19687c;
            int i10 = c15096v.f46911q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c15096v.f46911q0 = i10 - Integer.MIN_VALUE;
            } else {
                c15096v = new C15096v(abstractC19687c);
            }
        } else {
            c15096v = new C15096v(abstractC19687c);
        }
        Object obj = c15096v.f46910p0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c15096v.f46911q0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            c7518a = new C7518a();
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j11 = c15096v.f46909o0;
            C7518a c7518a2 = c15096v.f46908Z;
            InterfaceC15088n interfaceC15088n2 = c15096v.f46907Y;
            AbstractC9233X.m9807c(obj);
            c7518a = c7518a2;
            j10 = j11;
            interfaceC15088n = interfaceC15088n2;
        }
        while (!interfaceC15088n.mo1141e()) {
            long jM9397d = 0;
            if (j10 <= 0) {
                break;
            }
            if (j10 >= AbstractC8694q.m9397d(interfaceC15088n.mo1139c())) {
                jM9397d = j10 - AbstractC8694q.m9397d(interfaceC15088n.mo1139c());
                new Long(interfaceC15088n.mo1139c().mo7826z(c7518a));
            } else {
                interfaceC15088n.mo1139c().mo7816U(c7518a, j10);
            }
            c15096v.f46907Y = interfaceC15088n;
            c15096v.f46908Z = c7518a;
            c15096v.f46909o0 = jM9397d;
            c15096v.f46911q0 = 1;
            if (interfaceC15088n.mo1140d(1, c15096v) == enumC19250a) {
                return enumC19250a;
            }
            j10 = jM9397d;
        }
        c7518a.getClass();
        return c7518a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: n */
    public static final Object m16186n(InterfaceC15088n interfaceC15088n, AbstractC19687c abstractC19687c) throws Throwable {
        C15095u c15095u;
        C7518a c7518a;
        if (abstractC19687c instanceof C15095u) {
            c15095u = (C15095u) abstractC19687c;
            int i10 = c15095u.f46906p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c15095u.f46906p0 = i10 - Integer.MIN_VALUE;
            } else {
                c15095u = new C15095u(abstractC19687c);
            }
        } else {
            c15095u = new C15095u(abstractC19687c);
        }
        Object obj = c15095u.f46905o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c15095u.f46906p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            c7518a = new C7518a();
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7518a c7518a2 = c15095u.f46904Z;
            InterfaceC15088n interfaceC15088n2 = c15095u.f46903Y;
            AbstractC9233X.m9807c(obj);
            c7518a = c7518a2;
            interfaceC15088n = interfaceC15088n2;
        }
        while (!interfaceC15088n.mo1141e()) {
            c7518a.m7822k(interfaceC15088n.mo1139c());
            c15095u.f46903Y = interfaceC15088n;
            c15095u.f46904Z = c7518a;
            c15095u.f46906p0 = 1;
            if (interfaceC15088n.mo1140d(1, c15095u) == enumC19250a) {
                return enumC19250a;
            }
        }
        Throwable thMo1137a = interfaceC15088n.mo1137a();
        if (thMo1137a != null) {
            throw thMo1137a;
        }
        c7518a.getClass();
        return c7518a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: o */
    public static final Object m16187o(InterfaceC15088n interfaceC15088n, int i10, AbstractC19687c abstractC19687c) throws IOException {
        C15097w c15097w;
        StringBuilder sb2;
        if (abstractC19687c instanceof C15097w) {
            c15097w = (C15097w) abstractC19687c;
            int i11 = c15097w.f46914o0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c15097w.f46914o0 = i11 - Integer.MIN_VALUE;
            } else {
                c15097w = new C15097w(abstractC19687c);
            }
        } else {
            c15097w = new C15097w(abstractC19687c);
        }
        Object obj = c15097w.f46913Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i12 = c15097w.f46914o0;
        if (i12 == 0) {
            AbstractC9233X.m9807c(obj);
            StringBuilder sb3 = new StringBuilder();
            c15097w.f46912Y = sb3;
            c15097w.f46914o0 = 1;
            Object objM16188p = m16188p(interfaceC15088n, sb3, i10, c15097w);
            if (objM16188p == enumC19250a) {
                return enumC19250a;
            }
            obj = objM16188p;
            sb2 = sb3;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sb2 = c15097w.f46912Y;
            AbstractC9233X.m9807c(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            return sb2.toString();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0096  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:49:0x010a  */
    /* JADX WARN: Code duplicated, block: B:60:0x0138  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:92:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:95:0x01de  */
    /* JADX WARN: Code duplicated, block: B:98:0x01e8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00a4 -> B:35:0x00a7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: p */
    public static final java.lang.Object m16188p(io.ktor.utils.p815io.InterfaceC15088n r22, java.lang.StringBuilder r23, int r24, sm.AbstractC19687c r25) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.p815io.AbstractC15070F.m16188p(io.ktor.utils.io.n, java.lang.StringBuilder, int, sm.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v2, types: [byte[], java.io.Serializable] */
    /* JADX INFO: renamed from: q */
    public static final Serializable m16189q(InterfaceC15088n interfaceC15088n, AbstractC19687c abstractC19687c) throws Throwable {
        C15099y c15099y;
        if (abstractC19687c instanceof C15099y) {
            c15099y = (C15099y) abstractC19687c;
            int i10 = c15099y.f46922Z;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c15099y.f46922Z = i10 - Integer.MIN_VALUE;
            } else {
                c15099y = new C15099y(abstractC19687c);
            }
        } else {
            c15099y = new C15099y(abstractC19687c);
        }
        Object objM16182j = c15099y.f46921Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c15099y.f46922Z;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM16182j);
            c15099y.f46922Z = 1;
            objM16182j = m16182j(interfaceC15088n, c15099y);
            if (objM16182j == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(objM16182j);
        }
        C7518a c7518a = (C7518a) objM16182j;
        return AbstractC7527j.m7840f(c7518a, (int) c7518a.f23841o0);
    }

    /* JADX INFO: renamed from: r */
    public static Object m16190r(InterfaceC15066B interfaceC15066B, C7715h c7715h, C7716i c7716i) {
        C15085k c15085k = (C15085k) interfaceC15066B;
        C7518a c7518aM16206k = c15085k.m16206k();
        c7518aM16206k.getClass();
        C7524g c7524gM7824m = c7518aM16206k.m7824m(1);
        int i10 = c7524gM7824m.f23856c;
        byte[] bArr = c7524gM7824m.f23854a;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i10, bArr.length - i10);
        AbstractC16544l.m18091d(byteBufferWrap);
        c7715h.invoke(byteBufferWrap);
        int iPosition = byteBufferWrap.position() - i10;
        if (iPosition == 1) {
            c7524gM7824m.f23856c += iPosition;
            c7518aM16206k.f23841o0 += (long) iPosition;
        } else {
            if (iPosition < 0 || iPosition > c7524gM7824m.m7827a()) {
                StringBuilder sbM11057o = AbstractC10763a.m11057o(iPosition, "Invalid number of bytes written: ", ". Should be in 0..");
                sbM11057o.append(c7524gM7824m.m7827a());
                throw new IllegalStateException(sbM11057o.toString().toString());
            }
            if (iPosition != 0) {
                c7524gM7824m.f23856c += iPosition;
                c7518aM16206k.f23841o0 += (long) iPosition;
            } else if (AbstractC7527j.m7839e(c7524gM7824m)) {
                c7518aM16206k.m7820e();
            }
        }
        Object objM16203h = c15085k.m16203h(c7716i);
        return objM16203h == EnumC19250a.f61036Y ? objM16203h : C17296C.f55119a;
    }

    /* JADX INFO: renamed from: s */
    public static final Object m16191s(InterfaceC15066B interfaceC15066B, byte[] bArr, int i10, int i11, AbstractC19687c abstractC19687c) throws Throwable {
        C15085k c15085k = (C15085k) interfaceC15066B;
        c15085k.m16206k().m7815P(bArr, i10, i11);
        Object objM16179g = m16179g(c15085k, abstractC19687c);
        return objM16179g == EnumC19250a.f61036Y ? objM16179g : C17296C.f55119a;
    }

    /* JADX INFO: renamed from: t */
    public static final Object m16192t(InterfaceC15066B interfaceC15066B, InterfaceC7526i interfaceC7526i, AbstractC19687c abstractC19687c) throws Throwable {
        C15085k c15085k = (C15085k) interfaceC15066B;
        c15085k.m16206k().m7822k(interfaceC7526i);
        Object objM16179g = m16179g(c15085k, abstractC19687c);
        return objM16179g == EnumC19250a.f61036Y ? objM16179g : C17296C.f55119a;
    }

    /* JADX INFO: renamed from: u */
    public static final C11234e m16193u(InterfaceC0571F interfaceC0571F, InterfaceC18776i coroutineContext, InterfaceC1439n interfaceC1439n) {
        AbstractC16544l.m18094g(interfaceC0571F, "<this>");
        AbstractC16544l.m18094g(coroutineContext, "coroutineContext");
        C15085k c15085k = new C15085k(false);
        C0564B0 c0564b0M1156D = AbstractC0575H.m1156D(interfaceC0571F, coroutineContext, null, new C15069E(interfaceC1439n, c15085k, null), 2);
        c0564b0M1156D.mo1271H0(new C0386f(c15085k, 25));
        return new C11234e(c15085k, 24, c0564b0M1156D);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ C11234e m16194v(InterfaceC0571F interfaceC0571F, InterfaceC18776i interfaceC18776i, InterfaceC1439n interfaceC1439n, int i10) {
        if ((i10 & 1) != 0) {
            interfaceC18776i = C18777j.f59682Y;
        }
        return m16193u(interfaceC0571F, interfaceC18776i, interfaceC1439n);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    public static final Object m16182j(InterfaceC15088n interfaceC15088n, AbstractC19687c abstractC19687c) throws Throwable {
        C15092r c15092r;
        C7518a c7518a;
        if (abstractC19687c instanceof C15092r) {
            c15092r = (C15092r) abstractC19687c;
            int i10 = c15092r.f46894p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c15092r.f46894p0 = i10 - Integer.MIN_VALUE;
            } else {
                c15092r = new C15092r(abstractC19687c);
            }
        } else {
            c15092r = new C15092r(abstractC19687c);
        }
        Object obj = c15092r.f46893o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c15092r.f46894p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            c7518a = new C7518a();
        } else {
            if (i11 != 1) {
                throw new IllegalStateException(anhfj.EQBCMaR);
            }
            C7518a c7518a2 = c15092r.f46892Z;
            InterfaceC15088n interfaceC15088n2 = c15092r.f46891Y;
            AbstractC9233X.m9807c(obj);
            c7518a = c7518a2;
            interfaceC15088n = interfaceC15088n2;
        }
        while (!interfaceC15088n.mo1141e()) {
            c7518a.m7822k(interfaceC15088n.mo1139c());
            c15092r.f46891Y = interfaceC15088n;
            c15092r.f46892Z = c7518a;
            c15092r.f46894p0 = 1;
            if (interfaceC15088n.mo1140d(1, c15092r) == enumC19250a) {
                return enumC19250a;
            }
        }
        Throwable thMo1137a = interfaceC15088n.mo1137a();
        if (thMo1137a == null) {
            return c7518a;
        }
        throw thMo1137a;
    }
}
