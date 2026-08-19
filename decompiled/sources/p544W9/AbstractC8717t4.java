package p544W9;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1014t1.C19723A;
import p860l0.C16667D0;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;

/* JADX INFO: renamed from: W9.t4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8717t4 {
    /* JADX WARN: Code duplicated, block: B:23:0x0064  */
    /* JADX WARN: Code duplicated, block: B:26:0x006f A[LOOP:0: B:22:0x0062->B:26:0x006f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x004c A[EDGE_INSN: B:31:0x004c->B:18:0x004c BREAK  A[LOOP:0: B:22:0x0062->B:26:0x006f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0056 -> B:21:0x0059). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public static final java.lang.Object m9427a(p1014t1.C19748y r7, sm.AbstractC19685a r8) {
        /*
            boolean r0 = r8 instanceof p860l0.C16664C0
            if (r0 == 0) goto L13
            r0 = r8
            l0.C0 r0 = (p860l0.C16664C0) r0
            int r1 = r0.f53367o0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53367o0 = r1
            goto L18
        L13:
            l0.C0 r0 = new l0.C0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f53366Z
            rm.a r1 = p996rm.EnumC19250a.f61036Y
            int r2 = r0.f53367o0
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            t1.y r7 = r0.f53365Y
            p571X9.AbstractC9233X.m9807c(r8)
            goto L59
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            p571X9.AbstractC9233X.m9807c(r8)
            t1.A r8 = r7.f62527q0
            t1.f r8 = r8.f62440E0
            java.lang.Object r8 = r8.f62460a
            int r2 = r8.size()
            r5 = r4
        L40:
            if (r5 >= r2) goto L75
            java.lang.Object r6 = r8.get(r5)
            t1.o r6 = (p1014t1.C19738o) r6
            boolean r6 = r6.f62481d
            if (r6 == 0) goto L72
        L4c:
            t1.g r8 = p1014t1.EnumC19730g.f62467o0
            r0.f53365Y = r7
            r0.f53367o0 = r3
            java.lang.Object r8 = r7.m20695a(r8, r0)
            if (r8 != r1) goto L59
            return r1
        L59:
            t1.f r8 = (p1014t1.C19729f) r8
            java.lang.Object r8 = r8.f62460a
            int r2 = r8.size()
            r5 = r4
        L62:
            if (r5 >= r2) goto L75
            java.lang.Object r6 = r8.get(r5)
            t1.o r6 = (p1014t1.C19738o) r6
            boolean r6 = r6.f62481d
            if (r6 == 0) goto L6f
            goto L4c
        L6f:
            int r5 = r5 + 1
            goto L62
        L72:
            int r5 = r5 + 1
            goto L40
        L75:
            mm.C r7 = mm.C17296C.f55119a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p544W9.AbstractC8717t4.m9427a(t1.y, sm.a):java.lang.Object");
    }

    /* JADX INFO: renamed from: b */
    public static final Object m9428b(C19723A c19723a, InterfaceC1439n interfaceC1439n, InterfaceC18770c interfaceC18770c) {
        Object objM20667K0 = c19723a.m20667K0(new C16667D0(interfaceC18770c.getContext(), interfaceC1439n, null), interfaceC18770c);
        return objM20667K0 == EnumC19250a.f61036Y ? objM20667K0 : C17296C.f55119a;
    }
}
