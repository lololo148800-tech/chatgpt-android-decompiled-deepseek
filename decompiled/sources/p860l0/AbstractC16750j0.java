package p860l0;

import kotlin.jvm.internal.C16524A;
import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p003A1.InterfaceC0161D1;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p080D0.C1811j0;
import p1014t1.AbstractC19736m;
import p1014t1.C19723A;
import p1014t1.C19729f;
import p1014t1.C19731h;
import p1014t1.C19737n;
import p1014t1.C19738o;
import p1014t1.C19748y;
import p229J0.C4144v0;
import p292Lg.C5033e;
import p544W9.AbstractC8717t4;
import p571X9.AbstractC9233X;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: l0.j0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC16750j0 {

    /* JADX INFO: renamed from: a */
    public static final float f53729a = ((float) 0.125d) / 18;

    /* JADX WARN: Code duplicated, block: B:25:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:28:0x00bb A[LOOP:0: B:24:0x00a6->B:28:0x00bb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x00c2 A[EDGE_INSN: B:67:0x00c2->B:30:0x00c2 BREAK  A[LOOP:0: B:24:0x00a6->B:28:0x00bb], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0137 -> B:60:0x013b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: b */
    public static final java.lang.Object m18518b(p1014t1.C19748y r17, long r18, int r20, p860l0.C16732d0 r21, sm.AbstractC19685a r22) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p860l0.AbstractC16750j0.m18518b(t1.y, long, int, l0.d0, sm.a):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: c */
    public static final Object m18519c(C19748y c19748y, long j10, AbstractC19687c abstractC19687c) {
        C16714W c16714w;
        Object obj;
        C19738o c19738o;
        C16525B c16525b;
        if (abstractC19687c instanceof C16714W) {
            c16714w = (C16714W) abstractC19687c;
            int i10 = c16714w.f53551p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c16714w.f53551p0 = i10 - Integer.MIN_VALUE;
            } else {
                c16714w = new C16714W(abstractC19687c);
            }
        } else {
            c16714w = new C16714W(abstractC19687c);
        }
        Object obj2 = c16714w.f53550o0;
        Object obj3 = EnumC19250a.f61036Y;
        int i11 = c16714w.f53551p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj2);
            if (m18528l(c19748y.f62527q0.f62440E0, j10)) {
                return null;
            }
            ?? r12 = c19748y.f62527q0.f62440E0.f62460a;
            int size = r12.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    obj = null;
                    break;
                }
                obj = r12.get(i12);
                if (C19737n.m20689a(((C19738o) obj).f62478a, j10)) {
                    break;
                }
                i12++;
            }
            c19738o = (C19738o) obj;
            if (c19738o == null) {
                return null;
            }
            C16525B c16525b2 = new C16525B();
            C16525B c16525b3 = new C16525B();
            c16525b3.f51262Y = c19738o;
            long jMo499b = c19748y.m20697d().mo499b();
            try {
                InterfaceC1439n c16716x = new C16716X(c16525b3, c16525b2, null);
                c16714w.f53548Y = c19738o;
                c16714w.f53549Z = c16525b2;
                c16714w.f53551p0 = 1;
                if (c19748y.m20698e(jMo499b, c16716x, c16714w) == obj3) {
                    return obj3;
                }
                return null;
            } catch (C19731h unused) {
                c16525b = c16525b2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c16525b = c16714w.f53549Z;
            c19738o = c16714w.f53548Y;
            try {
                AbstractC9233X.m9807c(obj2);
                return null;
            } catch (C19731h unused2) {
            }
        }
        C19738o c19738o2 = (C19738o) c16525b.f51262Y;
        return c19738o2 == null ? c19738o : c19738o2;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:30:0x00bb A[LOOP:0: B:26:0x00a6->B:30:0x00bb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:70:0x00c2 A[EDGE_INSN: B:70:0x00c2->B:32:0x00c2 BREAK  A[LOOP:0: B:26:0x00a6->B:30:0x00bb], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x012e -> B:63:0x0136). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: d */
    public static final java.lang.Object m18520d(p1014t1.C19748y r17, long r18, p003A1.C0227a r20, sm.AbstractC19685a r21) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p860l0.AbstractC16750j0.m18520d(t1.y, long, A1.a, sm.a):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:28:0x00bb A[LOOP:0: B:24:0x00a6->B:28:0x00bb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x00c2 A[EDGE_INSN: B:67:0x00c2->B:30:0x00c2 BREAK  A[LOOP:0: B:24:0x00a6->B:28:0x00bb], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0137 -> B:60:0x013b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: e */
    public static final java.lang.Object m18521e(p1014t1.C19748y r17, long r18, int r20, p860l0.C16732d0 r21, sm.AbstractC19685a r22) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p860l0.AbstractC16750j0.m18521e(t1.y, long, int, l0.d0, sm.a):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b9 A[LOOP:0: B:24:0x00a4->B:28:0x00b9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x00c0 A[EDGE_INSN: B:67:0x00c0->B:30:0x00c0 BREAK  A[LOOP:0: B:24:0x00a4->B:28:0x00b9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0135 -> B:60:0x0139). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: f */
    public static final java.lang.Object m18522f(p1014t1.C19748y r17, long r18, p547Wc.C8805o r20, sm.AbstractC19685a r21) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p860l0.AbstractC16750j0.m18522f(t1.y, long, Wc.o, sm.a):java.lang.Object");
    }

    /* JADX INFO: renamed from: g */
    public static final Object m18523g(C19723A c19723a, InterfaceC1436k interfaceC1436k, InterfaceC1426a interfaceC1426a, InterfaceC1426a interfaceC1426a2, InterfaceC1439n interfaceC1439n, AbstractC19687c abstractC19687c) {
        Object objM9428b = AbstractC8717t4.m9428b(c19723a, new C16729c0(C16726b0.f53606o0, new C16524A(), null, new C5033e(2, interfaceC1436k), interfaceC1439n, interfaceC1426a2, new C1811j0(9, interfaceC1426a), null), abstractC19687c);
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        C17296C c17296c = C17296C.f55119a;
        if (objM9428b != enumC19250a) {
            objM9428b = c17296c;
        }
        return objM9428b == enumC19250a ? objM9428b : c17296c;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Object m18524h(C19723A c19723a, C4144v0 c4144v0, InterfaceC1426a interfaceC1426a, InterfaceC1439n interfaceC1439n, AbstractC19694j abstractC19694j, int i10) {
        InterfaceC1436k interfaceC1436k = c4144v0;
        if ((i10 & 1) != 0) {
            interfaceC1436k = C16725b.f53598q0;
        }
        return m18523g(c19723a, interfaceC1436k, interfaceC1426a, C16726b0.f53605Z, interfaceC1439n, abstractC19694j);
    }

    /* JADX INFO: renamed from: i */
    public static Object m18525i(C19723A c19723a, InterfaceC1426a interfaceC1426a, InterfaceC1439n interfaceC1439n, AbstractC19694j abstractC19694j) {
        Object objM9428b = AbstractC8717t4.m9428b(c19723a, new C16735e0(C16725b.f53599r0, interfaceC1439n, interfaceC1426a, C16726b0.f53607p0, null), abstractC19694j);
        return objM9428b == EnumC19250a.f61036Y ? objM9428b : C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0044 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x004c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0052  */
    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0042 -> B:18:0x0045). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: j */
    public static final java.lang.Object m18526j(p1014t1.C19748y r4, long r5, p049Bm.InterfaceC1436k r7, sm.AbstractC19687c r8) {
        /*
            boolean r0 = r8 instanceof p860l0.C16741g0
            if (r0 == 0) goto L13
            r0 = r8
            l0.g0 r0 = (p860l0.C16741g0) r0
            int r1 = r0.f53690p0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53690p0 = r1
            goto L18
        L13:
            l0.g0 r0 = new l0.g0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f53689o0
            rm.a r1 = p996rm.EnumC19250a.f61036Y
            int r2 = r0.f53690p0
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            Bm.k r4 = r0.f53688Z
            t1.y r5 = r0.f53687Y
            p571X9.AbstractC9233X.m9807c(r8)
            r7 = r4
            r4 = r5
            goto L45
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            p571X9.AbstractC9233X.m9807c(r8)
        L38:
            r0.f53687Y = r4
            r0.f53688Z = r7
            r0.f53690p0 = r3
            java.lang.Object r8 = m18517a(r4, r5, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            t1.o r8 = (p1014t1.C19738o) r8
            if (r8 != 0) goto L4c
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L4c:
            boolean r5 = p1014t1.AbstractC19736m.m20681c(r8)
            if (r5 == 0) goto L55
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L55:
            r7.invoke(r8)
            long r5 = r8.f62478a
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: p860l0.AbstractC16750j0.m18526j(t1.y, long, Bm.k, sm.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0088  */
    /* JADX WARN: Code duplicated, block: B:28:0x009d A[LOOP:0: B:24:0x0086->B:28:0x009d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:71:0x00a7 A[EDGE_INSN: B:71:0x00a7->B:30:0x00a7 BREAK  A[LOOP:0: B:24:0x0086->B:28:0x009d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0077 -> B:23:0x007d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: k */
    public static final java.lang.Object m18527k(p1014t1.C19748y r18, long r19, p049Bm.InterfaceC1436k r21, sm.AbstractC19685a r22) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p860l0.AbstractC16750j0.m18527k(t1.y, long, Bm.k, sm.a):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: l */
    public static final boolean m18528l(C19729f c19729f, long j10) {
        Object obj;
        ?? r6 = c19729f.f62460a;
        int size = r6.size();
        boolean z6 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = r6.get(i10);
            if (C19737n.m20689a(((C19738o) obj).f62478a, j10)) {
                break;
            }
            i10++;
        }
        C19738o c19738o = (C19738o) obj;
        if (c19738o != null && c19738o.f62481d) {
            z6 = true;
        }
        return true ^ z6;
    }

    /* JADX INFO: renamed from: m */
    public static final float m18529m(InterfaceC0161D1 interfaceC0161D1, int i10) {
        return AbstractC19736m.m20683e(i10, 2) ? interfaceC0161D1.mo503f() * f53729a : interfaceC0161D1.mo503f();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0088  */
    /* JADX WARN: Code duplicated, block: B:29:0x009c A[LOOP:0: B:25:0x0086->B:29:0x009c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:71:0x00a5 A[EDGE_INSN: B:71:0x00a5->B:31:0x00a5 BREAK  A[LOOP:0: B:25:0x0086->B:29:0x009c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0078 -> B:24:0x007d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: n */
    public static final java.lang.Object m18530n(p1014t1.C19748y r18, long r19, p049Bm.InterfaceC1436k r21, sm.AbstractC19685a r22) {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p860l0.AbstractC16750j0.m18530n(t1.y, long, Bm.k, sm.a):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0081 A[LOOP:0: B:23:0x006d->B:27:0x0081, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x0085 A[EDGE_INSN: B:54:0x0085->B:29:0x0085 BREAK  A[LOOP:0: B:23:0x006d->B:27:0x0081], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005e -> B:22:0x0063). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public static final java.lang.Object m18517a(p1014t1.C19748y r17, long r18, sm.AbstractC19687c r20) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p860l0.AbstractC16750j0.m18517a(t1.y, long, sm.c):java.lang.Object");
    }
}
