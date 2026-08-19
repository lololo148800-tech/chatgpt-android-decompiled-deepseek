package p587Y1;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p972qm.InterfaceC18770c;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Y1.f */
/* JADX INFO: loaded from: classes.dex */
public final class C9580f extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f28834Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f28835Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C9592r f28836o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9580f(C9592r c9592r, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f28836o0 = c9592r;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C9580f c9580f = new C9580f(this.f28836o0, interfaceC18770c);
        c9580f.f28835Z = obj;
        return c9580f;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C9580f) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    /* JADX WARN: Code duplicated, block: B:13:0x003b  */
    /* JADX WARN: Code duplicated, block: B:14:0x0048  */
    /* JADX WARN: Code duplicated, block: B:16:0x0054 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0067  */
    /* JADX WARN: Code duplicated, block: B:21:0x006b  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // sm.AbstractC19685a
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            rm.a r0 = p996rm.EnumC19250a.f61036Y
            int r1 = r8.f28834Y
            r2 = 1
            if (r1 == 0) goto L19
            if (r1 != r2) goto L11
            java.lang.Object r1 = r8.f28835Z
            An.F r1 = (p025An.InterfaceC0571F) r1
            p571X9.AbstractC9233X.m9807c(r9)
            goto L55
        L11:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L19:
            p571X9.AbstractC9233X.m9807c(r9)
            java.lang.Object r9 = r8.f28835Z
            An.F r9 = (p025An.InterfaceC0571F) r9
            r1 = r9
        L21:
            boolean r9 = p025An.AbstractC0575H.m1196y(r1)
            if (r9 == 0) goto L6f
            Y1.b r9 = p587Y1.C9576b.f28821o0
            r8.f28835Z = r1
            r8.f28834Y = r2
            qm.i r3 = r8.getContext()
            A1.X0 r4 = p003A1.C0219X0.f847Y
            qm.g r3 = r3.get(r4)
            A1.Y0 r3 = (p003A1.InterfaceC0222Y0) r3
            if (r3 != 0) goto L48
            qm.i r3 = r8.getContext()
            O0.T r3 = p349O0.C5997d.m6424K(r3)
            java.lang.Object r9 = r3.mo876v0(r9, r8)
            goto L52
        L48:
            A1.Z0 r9 = new A1.Z0
            r4 = 0
            r9.<init>(r2, r4)
            java.lang.Object r9 = r3.m691j0()
        L52:
            if (r9 != r0) goto L55
            return r0
        L55:
            Y1.r r9 = r8.f28836o0
            int[] r3 = r9.f28878O0
            r4 = 0
            r5 = r3[r4]
            r6 = r3[r2]
            android.view.View r7 = r9.f28882z0
            r7.getLocationOnScreen(r3)
            r4 = r3[r4]
            if (r5 != r4) goto L6b
            r3 = r3[r2]
            if (r6 == r3) goto L21
        L6b:
            r9.m10139m()
            goto L21
        L6f:
            mm.C r9 = mm.C17296C.f55119a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p587Y1.C9580f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
