package p878lo;

import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p972qm.InterfaceC18770c;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: lo.t */
/* JADX INFO: loaded from: classes2.dex */
public final class C17111t extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public C16525B f54685Y;

    /* JADX INFO: renamed from: Z */
    public int f54686Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f54687o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C16525B f54688p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C17116y f54689q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17111t(C16525B c16525b, C17116y c17116y, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f54688p0 = c16525b;
        this.f54689q0 = c17116y;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C17111t c17111t = new C17111t(this.f54688p0, this.f54689q0, interfaceC18770c);
        c17111t.f54687o0 = obj;
        return c17111t;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C17111t) create((C17097f) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    /* JADX WARN: Code duplicated, block: B:13:0x002e  */
    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    /* JADX WARN: Code duplicated, block: B:16:0x0034  */
    /* JADX WARN: Code duplicated, block: B:19:0x004f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0050  */
    /* JADX WARN: Code duplicated, block: B:22:0x0057  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0050 -> B:21:0x0053). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // sm.AbstractC19685a
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            rm.a r0 = p996rm.EnumC19250a.f61036Y
            int r1 = r11.f54686Z
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            kotlin.jvm.internal.B r1 = r11.f54685Y
            java.lang.Object r3 = r11.f54687o0
            lo.f r3 = (p878lo.C17097f) r3
            p571X9.AbstractC9233X.m9807c(r12)
            goto L53
        L13:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1b:
            p571X9.AbstractC9233X.m9807c(r12)
            java.lang.Object r12 = r11.f54687o0
            lo.f r12 = (p878lo.C17097f) r12
        L22:
            kotlin.jvm.internal.B r1 = r11.f54688p0
            java.lang.Object r3 = r1.f51262Y
            boolean r4 = r3 instanceof p878lo.C17103l
            if (r4 == 0) goto L57
            boolean r4 = r3 instanceof p878lo.C17103l
            if (r4 == 0) goto L31
            lo.l r3 = (p878lo.C17103l) r3
            goto L32
        L31:
            r3 = 0
        L32:
            if (r3 == 0) goto L3f
            r5 = 0
            long r7 = r3.f54655a
            float r4 = r3.f54656b
            r9 = 6
            r3 = r12
            p775h2.AbstractC14376f.m15833L(r3, r4, r5, r7, r9)
        L3f:
            lo.y r3 = r11.f54689q0
            Cn.k r3 = r3.f54711I0
            r11.f54687o0 = r12
            r11.f54685Y = r1
            r11.f54686Z = r2
            java.lang.Object r3 = r3.mo2514c(r11)
            if (r3 != r0) goto L50
            return r0
        L50:
            r10 = r3
            r3 = r12
            r12 = r10
        L53:
            r1.f51262Y = r12
            r12 = r3
            goto L22
        L57:
            mm.C r12 = mm.C17296C.f55119a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p878lo.C17111t.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
