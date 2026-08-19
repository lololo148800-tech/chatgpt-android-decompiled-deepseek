package p351O2;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p658b5.C11238i;
import p972qm.InterfaceC18770c;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: O2.l */
/* JADX INFO: loaded from: classes.dex */
public final class C6098l extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public C6104r f19839Y;

    /* JADX INFO: renamed from: Z */
    public int f19840Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C11238i f19841o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6098l(C11238i c11238i, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f19841o0 = c11238i;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C6098l(this.f19841o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C6098l) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0047 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:17:0x0053 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x005e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0051 -> B:18:0x0054). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // sm.AbstractC19685a
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            rm.a r0 = p996rm.EnumC19250a.f61036Y
            int r1 = r6.f19840Z
            r2 = 2
            r3 = 1
            b5.i r4 = r6.f19841o0
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            p571X9.AbstractC9233X.m9807c(r7)
            goto L54
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            O2.r r1 = r6.f19839Y
            p571X9.AbstractC9233X.m9807c(r7)
            goto L48
        L20:
            p571X9.AbstractC9233X.m9807c(r7)
            java.lang.Object r7 = r4.f34011p0
            java.util.concurrent.atomic.AtomicInteger r7 = (java.util.concurrent.atomic.AtomicInteger) r7
            int r7 = r7.get()
            if (r7 <= 0) goto L61
        L2d:
            java.lang.Object r7 = r4.f34008Y
            An.F r7 = (p025An.InterfaceC0571F) r7
            p025An.AbstractC0575H.m1186o(r7)
            java.lang.Object r7 = r4.f34009Z
            r1 = r7
            O2.r r1 = (p351O2.C6104r) r1
            r6.f19839Y = r1
            r6.f19840Z = r3
            java.lang.Object r7 = r4.f34010o0
            Cn.k r7 = (p077Cn.C1743k) r7
            java.lang.Object r7 = r7.mo2514c(r6)
            if (r7 != r0) goto L48
            return r0
        L48:
            r5 = 0
            r6.f19839Y = r5
            r6.f19840Z = r2
            java.lang.Object r7 = r1.invoke(r7, r6)
            if (r7 != r0) goto L54
            return r0
        L54:
            java.lang.Object r7 = r4.f34011p0
            java.util.concurrent.atomic.AtomicInteger r7 = (java.util.concurrent.atomic.AtomicInteger) r7
            int r7 = r7.decrementAndGet()
            if (r7 != 0) goto L2d
            mm.C r7 = mm.C17296C.f55119a
            return r7
        L61:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p351O2.C6098l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
