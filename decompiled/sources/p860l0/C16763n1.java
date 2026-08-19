package p860l0;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1014t1.C19738o;
import p1014t1.C19748y;
import p972qm.InterfaceC18770c;
import sm.AbstractC19692h;

/* JADX INFO: renamed from: l0.n1 */
/* JADX INFO: loaded from: classes.dex */
public final class C16763n1 extends AbstractC19692h implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public long f53785Z;

    /* JADX INFO: renamed from: o0 */
    public int f53786o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f53787p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C19738o f53788q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16763n1(C19738o c19738o, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f53788q0 = c19738o;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C16763n1 c16763n1 = new C16763n1(this.f53788q0, interfaceC18770c);
        c16763n1.f53787p0 = obj;
        return c16763n1;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16763n1) create((C19748y) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0040 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0049 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003e -> B:12:0x0041). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // sm.AbstractC19685a
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            rm.a r0 = p996rm.EnumC19250a.f61036Y
            int r1 = r7.f53786o0
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            long r3 = r7.f53785Z
            java.lang.Object r1 = r7.f53787p0
            t1.y r1 = (p1014t1.C19748y) r1
            p571X9.AbstractC9233X.m9807c(r8)
            goto L41
        L13:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1b:
            p571X9.AbstractC9233X.m9807c(r8)
            java.lang.Object r8 = r7.f53787p0
            t1.y r8 = (p1014t1.C19748y) r8
            t1.o r1 = r7.f53788q0
            long r3 = r1.f62479b
            A1.D1 r1 = r8.m20697d()
            r1.getClass()
            r5 = 40
            long r5 = r5 + r3
            r1 = r8
            r3 = r5
        L32:
            r7.f53787p0 = r1
            r7.f53785Z = r3
            r7.f53786o0 = r2
            r8 = 0
            r5 = 3
            java.lang.Object r8 = p860l0.AbstractC16689K1.m18506c(r1, r8, r7, r5)
            if (r8 != r0) goto L41
            return r0
        L41:
            t1.o r8 = (p1014t1.C19738o) r8
            long r5 = r8.f62479b
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 < 0) goto L32
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p860l0.C16763n1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
