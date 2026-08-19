package p1139z0;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p025An.InterfaceC0627n0;
import p049Bm.InterfaceC1439n;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: z0.z */
/* JADX INFO: loaded from: classes.dex */
public final class C21653z extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f68622Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC0627n0 f68623Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C21575B f68624o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21653z(InterfaceC0627n0 interfaceC0627n0, C21575B c21575b, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f68623Z = interfaceC0627n0;
        this.f68624o0 = c21575b;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C21653z(this.f68623Z, this.f68624o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        ((C21653z) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        return EnumC19250a.f61036Y;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0049 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x0057 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0055 -> B:21:0x003a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:23:0x0049
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // sm.AbstractC19685a
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            rm.a r0 = p996rm.EnumC19250a.f61036Y
            int r1 = r9.f68622Y
            r2 = 0
            r3 = 500(0x1f4, double:2.47E-321)
            r5 = 3
            r6 = 2
            r7 = 1
            z0.B r8 = r9.f68624o0
            if (r1 == 0) goto L2a
            if (r1 == r7) goto L26
            if (r1 == r6) goto L22
            if (r1 != r5) goto L1a
            p571X9.AbstractC9233X.m9807c(r10)     // Catch: java.lang.Throwable -> L18
            goto L3a
        L18:
            r10 = move-exception
            goto L58
        L1a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L22:
            p571X9.AbstractC9233X.m9807c(r10)     // Catch: java.lang.Throwable -> L18
            goto L4a
        L26:
            p571X9.AbstractC9233X.m9807c(r10)
            goto L3a
        L2a:
            p571X9.AbstractC9233X.m9807c(r10)
            An.n0 r10 = r9.f68623Z
            if (r10 == 0) goto L3a
            r9.f68622Y = r7
            java.lang.Object r10 = p025An.AbstractC0575H.m1182k(r10, r9)
            if (r10 != r0) goto L3a
            return r0
        L3a:
            O0.b0 r10 = r8.f68322b     // Catch: java.lang.Throwable -> L18
            r1 = 1065353216(0x3f800000, float:1.0)
            r10.m6410h(r1)     // Catch: java.lang.Throwable -> L18
            r9.f68622Y = r6     // Catch: java.lang.Throwable -> L18
            java.lang.Object r10 = p025An.AbstractC0575H.m1184m(r3, r9)     // Catch: java.lang.Throwable -> L18
            if (r10 != r0) goto L4a
            return r0
        L4a:
            O0.b0 r10 = r8.f68322b     // Catch: java.lang.Throwable -> L18
            r10.m6410h(r2)     // Catch: java.lang.Throwable -> L18
            r9.f68622Y = r5     // Catch: java.lang.Throwable -> L18
            java.lang.Object r10 = p025An.AbstractC0575H.m1184m(r3, r9)     // Catch: java.lang.Throwable -> L18
            if (r10 != r0) goto L3a
            return r0
        L58:
            O0.b0 r0 = r8.f68322b
            r0.m6410h(r2)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p1139z0.C21653z.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
