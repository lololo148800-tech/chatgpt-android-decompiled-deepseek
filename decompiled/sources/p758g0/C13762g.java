package p758g0;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p077Cn.C1736d;
import p077Cn.InterfaceC1747o;
import p349O0.InterfaceC5985X;
import p972qm.InterfaceC18770c;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: g0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C13762g extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public C1736d f43450Y;

    /* JADX INFO: renamed from: Z */
    public int f43451Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f43452o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC1747o f43453p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C13756d f43454q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ InterfaceC5985X f43455r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ InterfaceC5985X f43456s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13762g(InterfaceC1747o interfaceC1747o, C13756d c13756d, InterfaceC5985X interfaceC5985X, InterfaceC5985X interfaceC5985X2, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f43453p0 = interfaceC1747o;
        this.f43454q0 = c13756d;
        this.f43455r0 = interfaceC5985X;
        this.f43456s0 = interfaceC5985X2;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C13762g c13762g = new C13762g(this.f43453p0, this.f43454q0, this.f43455r0, this.f43456s0, interfaceC18770c);
        c13762g.f43452o0 = obj;
        return c13762g;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C13762g) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0035 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x003e  */
    /* JADX WARN: Code duplicated, block: B:16:0x004c  */
    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0033 -> B:12:0x0036). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x0035
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // sm.AbstractC19685a
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            rm.a r0 = p996rm.EnumC19250a.f61036Y
            int r1 = r12.f43451Z
            Cn.o r2 = r12.f43453p0
            r3 = 1
            if (r1 == 0) goto L1d
            if (r1 != r3) goto L15
            Cn.d r1 = r12.f43450Y
            java.lang.Object r4 = r12.f43452o0
            An.F r4 = (p025An.InterfaceC0571F) r4
            p571X9.AbstractC9233X.m9807c(r13)
            goto L36
        L15:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1d:
            p571X9.AbstractC9233X.m9807c(r13)
            java.lang.Object r13 = r12.f43452o0
            An.F r13 = (p025An.InterfaceC0571F) r13
            Cn.d r1 = r2.iterator()
            r4 = r13
        L29:
            r12.f43452o0 = r4
            r12.f43450Y = r1
            r12.f43451Z = r3
            java.lang.Object r13 = r1.m2525b(r12)
            if (r13 != r0) goto L36
            return r0
        L36:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L62
            java.lang.Object r13 = r1.m2526c()
            java.lang.Object r5 = r2.mo2519i()
            java.lang.Object r5 = p077Cn.C1750r.m2560b(r5)
            if (r5 != 0) goto L4e
            r7 = r13
            goto L4f
        L4e:
            r7 = r5
        L4f:
            g0.f r13 = new g0.f
            O0.X r10 = r12.f43456s0
            O0.X r9 = r12.f43455r0
            g0.d r8 = r12.f43454q0
            r11 = 0
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            r5 = 3
            r6 = 0
            p025An.AbstractC0575H.m1156D(r4, r6, r6, r13, r5)
            goto L29
        L62:
            mm.C r13 = mm.C17296C.f55119a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p758g0.C13762g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
