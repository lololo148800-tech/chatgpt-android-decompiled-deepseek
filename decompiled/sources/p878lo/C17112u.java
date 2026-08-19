package p878lo;

import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p972qm.InterfaceC18770c;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: lo.u */
/* JADX INFO: loaded from: classes2.dex */
public final class C17112u extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public C16525B f54690Y;

    /* JADX INFO: renamed from: Z */
    public C16525B f54691Z;

    /* JADX INFO: renamed from: o0 */
    public int f54692o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f54693p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C17116y f54694q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17112u(C17116y c17116y, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f54694q0 = c17116y;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C17112u c17112u = new C17112u(this.f54694q0, interfaceC18770c);
        c17112u.f54693p0 = obj;
        return c17112u;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C17112u) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0052 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0053  */
    /* JADX WARN: Code duplicated, block: B:23:0x006f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0070  */
    /* JADX WARN: Code duplicated, block: B:27:0x0078 A[Catch: CancellationException -> 0x0037, TryCatch #0 {CancellationException -> 0x0037, blocks: (B:25:0x0072, B:27:0x0078, B:30:0x007e), top: B:36:0x0072 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x007b  */
    /* JADX WARN: Code duplicated, block: B:30:0x007e A[Catch: CancellationException -> 0x0037, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0037, blocks: (B:25:0x0072, B:27:0x0078, B:30:0x007e), top: B:36:0x0072 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0070 -> B:36:0x0072). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // sm.AbstractC19685a
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            rm.a r0 = p996rm.EnumC19250a.f61036Y
            int r1 = r9.f54692o0
            r2 = 2
            r3 = 1
            r4 = 0
            lo.y r5 = r9.f54694q0
            if (r1 == 0) goto L30
            if (r1 == r3) goto L24
            if (r1 != r2) goto L1c
            kotlin.jvm.internal.B r1 = r9.f54690Y
            java.lang.Object r6 = r9.f54693p0
            An.F r6 = (p025An.InterfaceC0571F) r6
            p571X9.AbstractC9233X.m9807c(r10)     // Catch: java.util.concurrent.CancellationException -> L1a
            r10 = r6
            goto L72
        L1a:
            r10 = r6
            goto L37
        L1c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L24:
            kotlin.jvm.internal.B r1 = r9.f54691Z
            kotlin.jvm.internal.B r6 = r9.f54690Y
            java.lang.Object r7 = r9.f54693p0
            An.F r7 = (p025An.InterfaceC0571F) r7
            p571X9.AbstractC9233X.m9807c(r10)
            goto L56
        L30:
            p571X9.AbstractC9233X.m9807c(r10)
            java.lang.Object r10 = r9.f54693p0
            An.F r10 = (p025An.InterfaceC0571F) r10
        L37:
            boolean r1 = p025An.AbstractC0575H.m1196y(r10)
            if (r1 == 0) goto L86
            kotlin.jvm.internal.B r1 = new kotlin.jvm.internal.B
            r1.<init>()
            Cn.k r6 = r5.f54711I0
            r9.f54693p0 = r10
            r9.f54690Y = r1
            r9.f54691Z = r1
            r9.f54692o0 = r3
            java.lang.Object r6 = r6.mo2514c(r9)
            if (r6 != r0) goto L53
            return r0
        L53:
            r7 = r10
            r10 = r6
            r6 = r1
        L56:
            r1.f51262Y = r10
            b5.i r10 = r5.f54709G0     // Catch: java.util.concurrent.CancellationException -> L84
            h0.g0 r1 = p773h0.EnumC14284g0.f44822Z     // Catch: java.util.concurrent.CancellationException -> L84
            lo.t r8 = new lo.t     // Catch: java.util.concurrent.CancellationException -> L84
            r8.<init>(r6, r5, r4)     // Catch: java.util.concurrent.CancellationException -> L84
            r9.f54693p0 = r7     // Catch: java.util.concurrent.CancellationException -> L84
            r9.f54690Y = r6     // Catch: java.util.concurrent.CancellationException -> L84
            r9.f54691Z = r4     // Catch: java.util.concurrent.CancellationException -> L84
            r9.f54692o0 = r2     // Catch: java.util.concurrent.CancellationException -> L84
            java.lang.Object r10 = r10.m12542I0(r1, r8, r9)     // Catch: java.util.concurrent.CancellationException -> L84
            if (r10 != r0) goto L70
            return r0
        L70:
            r1 = r6
            r10 = r7
        L72:
            java.lang.Object r1 = r1.f51262Y     // Catch: java.util.concurrent.CancellationException -> L37
            boolean r6 = r1 instanceof p878lo.C17102k     // Catch: java.util.concurrent.CancellationException -> L37
            if (r6 == 0) goto L7b
            lo.k r1 = (p878lo.C17102k) r1     // Catch: java.util.concurrent.CancellationException -> L37
            goto L7c
        L7b:
            r1 = r4
        L7c:
            if (r1 == 0) goto L37
            e8.H r1 = r5.f54708F0     // Catch: java.util.concurrent.CancellationException -> L37
            r1.invoke()     // Catch: java.util.concurrent.CancellationException -> L37
            goto L37
        L84:
            r10 = r7
            goto L37
        L86:
            mm.C r10 = mm.C17296C.f55119a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p878lo.C17112u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
