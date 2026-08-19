package p544W9;

import kotlin.jvm.internal.AbstractC16544l;
import p323Mm.InterfaceC5500g;

/* JADX INFO: renamed from: W9.K3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8507K3 {
    /* JADX INFO: renamed from: a */
    public static final int m9168a(InterfaceC5500g interfaceC5500g) {
        AbstractC16544l.m18094g(interfaceC5500g, "<this>");
        return interfaceC5500g.mo5916a().size();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x0086 A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002d, B:27:0x007e, B:29:0x0086, B:24:0x006d, B:23:0x0067), top: B:44:0x0021, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007b -> B:27:0x007e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: b */
    public static final java.lang.Object m9169b(sm.AbstractC19687c r9) {
        /*
            boolean r0 = r9 instanceof p823j3.C16081c
            if (r0 == 0) goto L13
            r0 = r9
            j3.c r0 = (p823j3.C16081c) r0
            int r1 = r0.f49803r0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49803r0 = r1
            goto L18
        L13:
            j3.c r0 = new j3.c
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f49802q0
            rm.a r1 = p996rm.EnumC19250a.f61036Y
            int r2 = r0.f49803r0
            r3 = 0
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 != r4) goto L33
            Cn.d r2 = r0.f49801p0
            Cn.B r6 = r0.f49800o0
            Y0.e r7 = r0.f49799Z
            java.util.concurrent.atomic.AtomicBoolean r8 = r0.f49798Y
            p571X9.AbstractC9233X.m9807c(r9)     // Catch: java.lang.Throwable -> L31
            goto L7e
        L31:
            r9 = move-exception
            goto L9c
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3b:
            p571X9.AbstractC9233X.m9807c(r9)
            r9 = 6
            Cn.k r6 = p523V9.AbstractC8017W3.m8337a(r4, r9, r5)
            java.util.concurrent.atomic.AtomicBoolean r9 = new java.util.concurrent.atomic.AtomicBoolean
            r9.<init>(r3)
            g0.m0 r2 = new g0.m0
            r7 = 15
            r2.<init>(r9, r7, r6)
            java.lang.Object r7 = p586Y0.AbstractC9562n.f28759b
            monitor-enter(r7)
            java.lang.Object r8 = p586Y0.AbstractC9562n.f28765h     // Catch: java.lang.Throwable -> La7
            java.util.Collection r8 = (java.util.Collection) r8     // Catch: java.lang.Throwable -> La7
            java.util.ArrayList r8 = p909nm.AbstractC17680n.m19362l0(r8, r2)     // Catch: java.lang.Throwable -> La7
            p586Y0.AbstractC9562n.f28765h = r8     // Catch: java.lang.Throwable -> La7
            monitor-exit(r7)
            p586Y0.AbstractC9562n.m10077a()
            Ja.j r7 = new Ja.j
            r8 = 13
            r7.<init>(r2, r8)
            Cn.d r2 = new Cn.d     // Catch: java.lang.Throwable -> L31
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L31
            r8 = r9
        L6d:
            r0.f49798Y = r8     // Catch: java.lang.Throwable -> L31
            r0.f49799Z = r7     // Catch: java.lang.Throwable -> L31
            r0.f49800o0 = r6     // Catch: java.lang.Throwable -> L31
            r0.f49801p0 = r2     // Catch: java.lang.Throwable -> L31
            r0.f49803r0 = r4     // Catch: java.lang.Throwable -> L31
            java.lang.Object r9 = r2.m2525b(r0)     // Catch: java.lang.Throwable -> L31
            if (r9 != r1) goto L7e
            return r1
        L7e:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L31
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L31
            if (r9 == 0) goto L93
            java.lang.Object r9 = r2.m2526c()     // Catch: java.lang.Throwable -> L31
            mm.C r9 = (mm.C17296C) r9     // Catch: java.lang.Throwable -> L31
            r8.set(r3)     // Catch: java.lang.Throwable -> L31
            p586Y0.AbstractC9567s.m10113i()     // Catch: java.lang.Throwable -> L31
            goto L6d
        L93:
            r6.mo2516e(r5)     // Catch: java.lang.Throwable -> La2
            r7.dispose()
            mm.C r9 = mm.C17296C.f55119a
            return r9
        L9c:
            throw r9     // Catch: java.lang.Throwable -> L9d
        L9d:
            r0 = move-exception
            p523V9.AbstractC8024X3.m8364b(r6, r9)     // Catch: java.lang.Throwable -> La2
            throw r0     // Catch: java.lang.Throwable -> La2
        La2:
            r9 = move-exception
            r7.dispose()
            throw r9
        La7:
            r9 = move-exception
            monitor-exit(r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p544W9.AbstractC8507K3.m9169b(sm.c):java.lang.Object");
    }
}
