package p080D0;

import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1014t1.C19748y;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19692h;

/* JADX INFO: renamed from: D0.N */
/* JADX INFO: loaded from: classes.dex */
public final class C1780N extends AbstractC19692h implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public int f5094Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f5095o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC1436k f5096p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1780N(InterfaceC1436k interfaceC1436k, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f5096p0 = interfaceC1436k;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C1780N c1780n = new C1780N(this.f5096p0, interfaceC18770c);
        c1780n.f5095o0 = obj;
        return c1780n;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        ((C1780N) create((C19748y) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        return EnumC19250a.f61036Y;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002d A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:12:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x002d
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // sm.AbstractC19685a
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            rm.a r0 = p996rm.EnumC19250a.f61036Y
            int r1 = r4.f5094Z
            r2 = 1
            if (r1 == 0) goto L19
            if (r1 != r2) goto L11
            java.lang.Object r1 = r4.f5095o0
            t1.y r1 = (p1014t1.C19748y) r1
            p571X9.AbstractC9233X.m9807c(r5)
            goto L2e
        L11:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L19:
            p571X9.AbstractC9233X.m9807c(r5)
            java.lang.Object r5 = r4.f5095o0
            t1.y r5 = (p1014t1.C19748y) r5
            r1 = r5
        L21:
            t1.g r5 = p1014t1.EnumC19730g.f62465Y
            r4.f5095o0 = r1
            r4.f5094Z = r2
            java.lang.Object r5 = r1.m20695a(r5, r4)
            if (r5 != r0) goto L2e
            return r0
        L2e:
            t1.f r5 = (p1014t1.C19729f) r5
            boolean r5 = p080D0.AbstractC1807h0.m2608C(r5)
            r5 = r5 ^ r2
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            Bm.k r3 = r4.f5096p0
            r3.invoke(r5)
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: p080D0.C1780N.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
