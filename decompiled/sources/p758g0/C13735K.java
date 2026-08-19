package p758g0;

import kotlin.jvm.internal.C16557y;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p349O0.InterfaceC5985X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: g0.K */
/* JADX INFO: loaded from: classes.dex */
public final class C13735K extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public C16557y f43314Y;

    /* JADX INFO: renamed from: Z */
    public int f43315Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f43316o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC5985X f43317p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C13736L f43318q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13735K(InterfaceC5985X interfaceC5985X, C13736L c13736l, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f43317p0 = interfaceC5985X;
        this.f43318q0 = c13736l;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C13735K c13735k = new C13735K(this.f43317p0, this.f43318q0, interfaceC18770c);
        c13735k.f43316o0 = obj;
        return c13735k;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        ((C13735K) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        return EnumC19250a.f61036Y;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0054 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:16:0x005c  */
    /* JADX WARN: Code duplicated, block: B:18:0x0079 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x005a -> B:11:0x003a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0077 -> B:11:0x003a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // sm.AbstractC19685a
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            rm.a r0 = p996rm.EnumC19250a.f61036Y
            int r1 = r11.f43315Z
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L2a
            if (r1 == r2) goto L1f
            if (r1 != r3) goto L17
            kotlin.jvm.internal.y r1 = r11.f43314Y
            java.lang.Object r4 = r11.f43316o0
            An.F r4 = (p025An.InterfaceC0571F) r4
            p571X9.AbstractC9233X.m9807c(r12)
            r12 = r4
            goto L3a
        L17:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1f:
            kotlin.jvm.internal.y r1 = r11.f43314Y
            java.lang.Object r4 = r11.f43316o0
            An.F r4 = (p025An.InterfaceC0571F) r4
            p571X9.AbstractC9233X.m9807c(r12)
            r12 = r4
            goto L55
        L2a:
            p571X9.AbstractC9233X.m9807c(r12)
            java.lang.Object r12 = r11.f43316o0
            An.F r12 = (p025An.InterfaceC0571F) r12
            kotlin.jvm.internal.y r1 = new kotlin.jvm.internal.y
            r1.<init>()
            r4 = 1065353216(0x3f800000, float:1.0)
            r1.f51286Y = r4
        L3a:
            Bj.e r4 = new Bj.e
            O0.X r6 = r11.f43317p0
            g0.L r7 = r11.f43318q0
            r10 = 22
            r5 = r4
            r8 = r1
            r9 = r12
            r5.<init>(r6, r7, r8, r9, r10)
            r11.f43316o0 = r12
            r11.f43314Y = r1
            r11.f43315Z = r2
            java.lang.Object r4 = p758g0.AbstractC13758e.m15257v(r4, r11)
            if (r4 != r0) goto L55
            return r0
        L55:
            float r4 = r1.f51286Y
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 != 0) goto L3a
            e8.H r4 = new e8.H
            r5 = 8
            r4.<init>(r12, r5)
            Dn.z0 r4 = p349O0.C5997d.m6441a0(r4)
            g0.J r5 = new g0.J
            r6 = 0
            r5.<init>(r3, r6)
            r11.f43316o0 = r12
            r11.f43314Y = r1
            r11.f43315Z = r3
            java.lang.Object r4 = p103Dn.AbstractC2124C.m3220s(r4, r5, r11)
            if (r4 != r0) goto L3a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p758g0.C13735K.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
