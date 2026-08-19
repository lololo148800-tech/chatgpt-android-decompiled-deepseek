package p647ak;

import kotlin.jvm.internal.C16556x;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p729ej.C13421l;
import p972qm.InterfaceC18770c;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: ak.d1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10693d1 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f31766Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C16556x f31767Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C13421l f31768o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C10696e1 f31769p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10693d1(C16556x c16556x, C13421l c13421l, C10696e1 c10696e1, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f31767Z = c16556x;
        this.f31768o0 = c13421l;
        this.f31769p0 = c10696e1;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C10693d1(this.f31767Z, this.f31768o0, this.f31769p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C10693d1) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001e  */
    /* JADX WARN: Code duplicated, block: B:13:0x0028 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0026 -> B:14:0x0029). Please report as a decompilation issue!!! */
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
            int r1 = r6.f31766Y
            kotlin.jvm.internal.x r2 = r6.f31767Z
            r3 = 1
            if (r1 == 0) goto L17
            if (r1 != r3) goto Lf
            p571X9.AbstractC9233X.m9807c(r7)
            goto L29
        Lf:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L17:
            p571X9.AbstractC9233X.m9807c(r7)
        L1a:
            boolean r7 = r2.f51285Y
            if (r7 == 0) goto L41
            r6.f31766Y = r3
            r4 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r7 = p025An.AbstractC0575H.m1184m(r4, r6)
            if (r7 != r0) goto L29
            return r0
        L29:
            ej.l r7 = r6.f31768o0
            ej.a r7 = r7.f42503Y
            ej.i r7 = r7.mo3400l()
            D0.U r1 = new D0.U
            r4 = 1
            r1.<init>(r2, r4)
            ak.e1 r4 = r6.f31769p0
            ej.b r1 = p523V9.AbstractC8215v5.m8839a(r4, r1)
            r7.mo3393B(r1)
            goto L1a
        L41:
            mm.C r7 = mm.C17296C.f55119a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p647ak.C10693d1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
