package p209I6;

import java.io.EOFException;
import java.util.Map;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: I6.g */
/* JADX INFO: loaded from: classes.dex */
public final class C3629g extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public Map f11061Y;

    /* JADX INFO: renamed from: Z */
    public int f11062Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C3630h f11063o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3629g(C3630h c3630h, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f11063o0 = c3630h;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C3629g(this.f11063o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) throws EOFException {
        ((C3629g) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        return EnumC19250a.f61036Y;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0043 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0041 -> B:12:0x0044). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x0043
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // sm.AbstractC19685a
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.io.EOFException {
        /*
            r6 = this;
            r0 = 1
            rm.a r1 = p996rm.EnumC19250a.f61036Y
            int r2 = r6.f11062Z
            I6.h r3 = r6.f11063o0
            if (r2 == 0) goto L1b
            if (r2 != r0) goto L13
            java.util.Map r2 = r6.f11061Y
            java.util.Map r2 = (java.util.Map) r2
            p571X9.AbstractC9233X.m9807c(r7)
            goto L44
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            p571X9.AbstractC9233X.m9807c(r7)
            mm.l r7 = new mm.l
            java.lang.String r2 = "type"
            java.lang.String r4 = "ping"
            r7.<init>(r2, r4)
            mm.l[] r2 = new mm.C17309l[r0]
            r4 = 0
            r2[r4] = r7
            java.util.LinkedHashMap r7 = p909nm.AbstractC17659D.m19246h(r2)
            r3.getClass()
            r2 = r7
        L34:
            long r4 = r3.f11066e
            r7 = r2
            java.util.Map r7 = (java.util.Map) r7
            r6.f11061Y = r7
            r6.f11062Z = r0
            java.lang.Object r7 = p025An.AbstractC0575H.m1184m(r4, r6)
            if (r7 != r1) goto L44
            return r1
        L44:
            I6.x r7 = r3.f11067f
            r3.m4334f(r2, r7)
            goto L34
        */
        throw new UnsupportedOperationException("Method not decompiled: p209I6.C3629g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
