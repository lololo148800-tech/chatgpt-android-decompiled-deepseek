package p773h0;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: h0.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C14278d0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f44793Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C14280e0 f44794Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14278d0(C14280e0 c14280e0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f44794Z = c14280e0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C14278d0(this.f44794Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        ((C14278d0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        return EnumC19250a.f61036Y;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021  */
    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    /* JADX WARN: Code duplicated, block: B:15:0x002d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:18:0x0032  */
    /* JADX WARN: Code duplicated, block: B:20:0x004a A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0030 -> B:11:0x0021). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0048 -> B:21:0x004b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:18:0x0032
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // sm.AbstractC19685a
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            rm.a r0 = p996rm.EnumC19250a.f61036Y
            int r1 = r7.f44793Y
            r2 = 2
            r3 = 1
            h0.e0 r4 = r7.f44794Z
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            p571X9.AbstractC9233X.m9807c(r8)
            goto L4b
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            p571X9.AbstractC9233X.m9807c(r8)
            goto L2e
        L1e:
            p571X9.AbstractC9233X.m9807c(r8)
        L21:
            Cn.k r8 = r4.f44814Q0
            if (r8 == 0) goto L2e
            r7.f44793Y = r3
            java.lang.Object r8 = r8.mo2514c(r7)
            if (r8 != r0) goto L2e
            return r0
        L2e:
            h0.p0 r8 = r4.f44809L0
            if (r8 == 0) goto L21
            h0.r r8 = p773h0.C14305r.f44909p0
            r7.f44793Y = r2
            qm.i r1 = r7.getContext()
            O0.T r1 = p349O0.C5997d.m6424K(r1)
            Bk.y0 r5 = new Bk.y0
            r6 = 1
            r5.<init>(r6, r8)
            java.lang.Object r8 = r1.mo876v0(r5, r7)
            if (r8 != r0) goto L4b
            return r0
        L4b:
            h0.p0 r8 = r4.f44809L0
            if (r8 == 0) goto L21
            h0.r0 r8 = (p773h0.C14306r0) r8
            r8.m15599d()
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: p773h0.C14278d0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
