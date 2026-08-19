package p925oe;

import gd.C13969n2;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: oe.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C18105c extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f57752Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C18077B f57753Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f57754o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C13969n2 f57755p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18105c(C18077B c18077b, String str, C13969n2 c13969n2, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f57753Z = c18077b;
        this.f57754o0 = str;
        this.f57755p0 = c13969n2;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C18105c(this.f57753Z, this.f57754o0, this.f57755p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        ((C18105c) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        return EnumC19250a.f61036Y;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0028 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:16:0x003f A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x003d -> B:11:0x001c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:4:0x0008
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // sm.AbstractC19685a
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            rm.a r0 = p996rm.EnumC19250a.f61036Y
            int r1 = r6.f57752Y
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L19
            if (r1 == r3) goto L15
            if (r1 != r2) goto Ld
            goto L19
        Ld:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L15:
            p571X9.AbstractC9233X.m9807c(r7)
            goto L29
        L19:
            p571X9.AbstractC9233X.m9807c(r7)
        L1c:
            r6.f57752Y = r3
            oe.B r7 = r6.f57753Z
            java.lang.String r1 = r6.f57754o0
            java.lang.Object r7 = r7.m19698c(r1, r6)
            if (r7 != r0) goto L29
            return r0
        L29:
            gd.i r7 = gd.C13946i.f43998d
            gd.n2 r1 = r6.f57755p0
            java.lang.Object r7 = r1.m15477a(r7)
            java.lang.Number r7 = (java.lang.Number) r7
            long r4 = r7.longValue()
            r6.f57752Y = r2
            java.lang.Object r7 = p025An.AbstractC0575H.m1184m(r4, r6)
            if (r7 != r0) goto L1c
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p925oe.C18105c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
