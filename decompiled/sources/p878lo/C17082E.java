package p878lo;

import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p972qm.InterfaceC18770c;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: lo.E */
/* JADX INFO: loaded from: classes2.dex */
public final class C17082E extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public C16525B f54591Y;

    /* JADX INFO: renamed from: Z */
    public C16525B f54592Z;

    /* JADX INFO: renamed from: o0 */
    public int f54593o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f54594p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C17087J f54595q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17082E(C17087J c17087j, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f54595q0 = c17087j;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C17082E c17082e = new C17082E(this.f54595q0, interfaceC18770c);
        c17082e.f54594p0 = obj;
        return c17082e;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C17082E) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0052 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0053  */
    /* JADX WARN: Code duplicated, block: B:24:0x0075 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    /* JADX WARN: Code duplicated, block: B:28:0x007e A[Catch: CancellationException -> 0x0037, TryCatch #0 {CancellationException -> 0x0037, blocks: (B:26:0x0078, B:28:0x007e, B:31:0x0084, B:33:0x009c), top: B:40:0x0078 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0081  */
    /* JADX WARN: Code duplicated, block: B:31:0x0084 A[Catch: CancellationException -> 0x0037, TryCatch #0 {CancellationException -> 0x0037, blocks: (B:26:0x0078, B:28:0x007e, B:31:0x0084, B:33:0x009c), top: B:40:0x0078 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x009c A[Catch: CancellationException -> 0x0037, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0037, blocks: (B:26:0x0078, B:28:0x007e, B:31:0x0084, B:33:0x009c), top: B:40:0x0078 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:42:0x005e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0076 -> B:40:0x0078). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // sm.AbstractC19685a
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            rm.a r0 = p996rm.EnumC19250a.f61036Y
            int r1 = r10.f54593o0
            r2 = 0
            r3 = 2
            r4 = 1
            lo.J r5 = r10.f54595q0
            if (r1 == 0) goto L30
            if (r1 == r4) goto L24
            if (r1 != r3) goto L1c
            kotlin.jvm.internal.B r1 = r10.f54591Y
            java.lang.Object r6 = r10.f54594p0
            An.F r6 = (p025An.InterfaceC0571F) r6
            p571X9.AbstractC9233X.m9807c(r11)     // Catch: java.util.concurrent.CancellationException -> L1a
            r11 = r6
            goto L78
        L1a:
            r11 = r6
            goto L37
        L1c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L24:
            kotlin.jvm.internal.B r1 = r10.f54592Z
            kotlin.jvm.internal.B r6 = r10.f54591Y
            java.lang.Object r7 = r10.f54594p0
            An.F r7 = (p025An.InterfaceC0571F) r7
            p571X9.AbstractC9233X.m9807c(r11)
            goto L56
        L30:
            p571X9.AbstractC9233X.m9807c(r11)
            java.lang.Object r11 = r10.f54594p0
            An.F r11 = (p025An.InterfaceC0571F) r11
        L37:
            boolean r1 = p025An.AbstractC0575H.m1196y(r11)
            if (r1 == 0) goto Lac
            kotlin.jvm.internal.B r1 = new kotlin.jvm.internal.B
            r1.<init>()
            Cn.k r6 = r5.f54615H0
            r10.f54594p0 = r11
            r10.f54591Y = r1
            r10.f54592Z = r1
            r10.f54593o0 = r4
            java.lang.Object r6 = r6.mo2514c(r10)
            if (r6 != r0) goto L53
            return r0
        L53:
            r7 = r11
            r11 = r6
            r6 = r1
        L56:
            r1.f51262Y = r11
            java.lang.Object r11 = r6.f51262Y
            boolean r11 = r11 instanceof p878lo.C17078A
            if (r11 == 0) goto Laa
            b5.i r11 = r5.f54609B0     // Catch: java.util.concurrent.CancellationException -> Laa
            h0.g0 r1 = p773h0.EnumC14284g0.f44822Z     // Catch: java.util.concurrent.CancellationException -> Laa
            lo.D r8 = new lo.D     // Catch: java.util.concurrent.CancellationException -> Laa
            r8.<init>(r6, r5, r2)     // Catch: java.util.concurrent.CancellationException -> Laa
            r10.f54594p0 = r7     // Catch: java.util.concurrent.CancellationException -> Laa
            r10.f54591Y = r6     // Catch: java.util.concurrent.CancellationException -> Laa
            r10.f54592Z = r2     // Catch: java.util.concurrent.CancellationException -> Laa
            r10.f54593o0 = r3     // Catch: java.util.concurrent.CancellationException -> Laa
            java.lang.Object r11 = r11.m12542I0(r1, r8, r10)     // Catch: java.util.concurrent.CancellationException -> Laa
            if (r11 != r0) goto L76
            return r0
        L76:
            r1 = r6
            r11 = r7
        L78:
            java.lang.Object r1 = r1.f51262Y     // Catch: java.util.concurrent.CancellationException -> L37
            boolean r6 = r1 instanceof p878lo.C17079B     // Catch: java.util.concurrent.CancellationException -> L37
            if (r6 == 0) goto L81
            lo.B r1 = (p878lo.C17079B) r1     // Catch: java.util.concurrent.CancellationException -> L37
            goto L82
        L81:
            r1 = r2
        L82:
            if (r1 == 0) goto L37
            lo.I r6 = r5.f54614G0     // Catch: java.util.concurrent.CancellationException -> L37
            long r7 = r1.f54570a     // Catch: java.util.concurrent.CancellationException -> L37
            r6.getClass()     // Catch: java.util.concurrent.CancellationException -> L37
            lo.J r1 = r6.f54608Z     // Catch: java.util.concurrent.CancellationException -> L37
            ko.J r1 = r1.f54612E0     // Catch: java.util.concurrent.CancellationException -> L37
            r1.getClass()     // Catch: java.util.concurrent.CancellationException -> L37
            ko.N r1 = r1.f51161Z     // Catch: java.util.concurrent.CancellationException -> L37
            ko.C r6 = r1.f51169B0     // Catch: java.util.concurrent.CancellationException -> L37
            boolean r6 = r6.m18057j()     // Catch: java.util.concurrent.CancellationException -> L37
            if (r6 == 0) goto L37
            An.F r6 = r1.m10935y0()     // Catch: java.util.concurrent.CancellationException -> L37
            ko.M r9 = new ko.M     // Catch: java.util.concurrent.CancellationException -> L37
            r9.<init>(r1, r7, r2)     // Catch: java.util.concurrent.CancellationException -> L37
            r1 = 3
            p025An.AbstractC0575H.m1156D(r6, r2, r2, r9, r1)     // Catch: java.util.concurrent.CancellationException -> L37
            goto L37
        Laa:
            r11 = r7
            goto L37
        Lac:
            mm.C r11 = mm.C17296C.f55119a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p878lo.C17082E.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
