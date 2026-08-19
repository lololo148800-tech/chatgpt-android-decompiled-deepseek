package p003A1;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p077Cn.C1736d;
import p077Cn.C1743k;
import p077Cn.InterfaceC1730B;
import p972qm.InterfaceC18770c;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: A1.U0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0210U0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public InterfaceC1730B f798Y;

    /* JADX INFO: renamed from: Z */
    public C1736d f799Z;

    /* JADX INFO: renamed from: o0 */
    public int f800o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C1743k f801p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0210U0(C1743k c1743k, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f801p0 = c1743k;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C0210U0(this.f801p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0210U0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0032 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x003b A[Catch: all -> 0x0011, TryCatch #1 {all -> 0x0011, blocks: (B:6:0x000d, B:17:0x0033, B:19:0x003b, B:20:0x0049, B:28:0x0060, B:14:0x0026, B:30:0x0063, B:31:0x0067, B:32:0x0068, B:13:0x0020, B:21:0x004a, B:23:0x0056), top: B:41:0x0005, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0056 A[Catch: all -> 0x005e, TRY_LEAVE, TryCatch #2 {, blocks: (B:21:0x004a, B:23:0x0056), top: B:43:0x004a, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0063 A[Catch: all -> 0x0011, TryCatch #1 {all -> 0x0011, blocks: (B:6:0x000d, B:17:0x0033, B:19:0x003b, B:20:0x0049, B:28:0x0060, B:14:0x0026, B:30:0x0063, B:31:0x0067, B:32:0x0068, B:13:0x0020, B:21:0x004a, B:23:0x0056), top: B:41:0x0005, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0030 -> B:17:0x0033). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // sm.AbstractC19685a
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            rm.a r0 = p996rm.EnumC19250a.f61036Y
            int r1 = r6.f800o0
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            Cn.d r1 = r6.f799Z
            Cn.B r3 = r6.f798Y
            p571X9.AbstractC9233X.m9807c(r7)     // Catch: java.lang.Throwable -> L11
            goto L33
        L11:
            r7 = move-exception
            goto L70
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            p571X9.AbstractC9233X.m9807c(r7)
            Cn.k r3 = r6.f801p0
            Cn.d r7 = new Cn.d     // Catch: java.lang.Throwable -> L11
            r7.<init>(r3)     // Catch: java.lang.Throwable -> L11
            r1 = r7
        L26:
            r6.f798Y = r3     // Catch: java.lang.Throwable -> L11
            r6.f799Z = r1     // Catch: java.lang.Throwable -> L11
            r6.f800o0 = r2     // Catch: java.lang.Throwable -> L11
            java.lang.Object r7 = r1.m2525b(r6)     // Catch: java.lang.Throwable -> L11
            if (r7 != r0) goto L33
            return r0
        L33:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L11
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L11
            if (r7 == 0) goto L69
            java.lang.Object r7 = r1.m2526c()     // Catch: java.lang.Throwable -> L11
            mm.C r7 = (mm.C17296C) r7     // Catch: java.lang.Throwable -> L11
            java.util.concurrent.atomic.AtomicBoolean r7 = p003A1.AbstractC0213V0.f811b     // Catch: java.lang.Throwable -> L11
            r4 = 0
            r7.set(r4)     // Catch: java.lang.Throwable -> L11
            java.lang.Object r7 = p586Y0.AbstractC9562n.f28759b     // Catch: java.lang.Throwable -> L11
            monitor-enter(r7)     // Catch: java.lang.Throwable -> L11
            java.util.concurrent.atomic.AtomicReference r5 = p586Y0.AbstractC9562n.f28766i     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Throwable -> L5e
            Y0.a r5 = (p586Y0.C9549a) r5     // Catch: java.lang.Throwable -> L5e
            d0.G r5 = r5.f28725h     // Catch: java.lang.Throwable -> L5e
            if (r5 == 0) goto L60
            boolean r5 = r5.m14631h()     // Catch: java.lang.Throwable -> L5e
            if (r5 != r2) goto L60
            r4 = r2
            goto L60
        L5e:
            r0 = move-exception
            goto L67
        L60:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L11
            if (r4 == 0) goto L26
            p586Y0.AbstractC9562n.m10077a()     // Catch: java.lang.Throwable -> L11
            goto L26
        L67:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L11
            throw r0     // Catch: java.lang.Throwable -> L11
        L69:
            r7 = 0
            r3.mo2516e(r7)
            mm.C r7 = mm.C17296C.f55119a
            return r7
        L70:
            throw r7     // Catch: java.lang.Throwable -> L71
        L71:
            r0 = move-exception
            p523V9.AbstractC8024X3.m8364b(r3, r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p003A1.C0210U0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
