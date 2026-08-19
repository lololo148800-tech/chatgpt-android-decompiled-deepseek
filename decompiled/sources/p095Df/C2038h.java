package p095Df;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p103Dn.InterfaceC2186j;
import p792hl.AbstractC14527b;
import p972qm.InterfaceC18770c;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Df.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C2038h extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f6245Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f6246Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC2186j f6247o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2038h(InterfaceC2186j interfaceC2186j, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f6247o0 = interfaceC2186j;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C2038h c2038h = new C2038h(this.f6247o0, interfaceC18770c);
        c2038h.f6246Z = obj;
        return c2038h;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2038h) create((AbstractC14527b) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0043  */
    /* JADX WARN: Code duplicated, block: B:20:0x0050 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    /* JADX WARN: Code duplicated, block: B:25:0x005a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0075 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0056 -> B:24:0x0058). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0073 -> B:24:0x0058). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // sm.AbstractC19685a
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            rm.a r0 = p996rm.EnumC19250a.f61036Y
            int r1 = r7.f6245Y
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2b
            if (r1 == r4) goto L27
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            java.lang.Object r1 = r7.f6246Z
            io.ktor.utils.io.n r1 = (io.ktor.utils.p815io.InterfaceC15088n) r1
            p571X9.AbstractC9233X.m9807c(r8)
            goto L58
        L17:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1f:
            java.lang.Object r1 = r7.f6246Z
            io.ktor.utils.io.n r1 = (io.ktor.utils.p815io.InterfaceC15088n) r1
            p571X9.AbstractC9233X.m9807c(r8)
            goto L54
        L27:
            p571X9.AbstractC9233X.m9807c(r8)
            goto L3b
        L2b:
            p571X9.AbstractC9233X.m9807c(r8)
            java.lang.Object r8 = r7.f6246Z
            hl.b r8 = (p792hl.AbstractC14527b) r8
            r7.f6245Y = r4
            java.lang.Object r8 = p544W9.AbstractC8565U2.m9226a(r8, r7)
            if (r8 != r0) goto L3b
            return r0
        L3b:
            io.ktor.utils.io.n r8 = (io.ktor.utils.p815io.InterfaceC15088n) r8
        L3d:
            boolean r1 = r8.mo1141e()
            if (r1 != 0) goto L76
            r7.f6246Z = r8
            r7.f6245Y = r3
            r1 = 2147483647(0x7fffffff, float:NaN)
            java.lang.Object r1 = io.ktor.utils.p815io.AbstractC15070F.m16187o(r8, r1, r7)
            if (r1 != r0) goto L51
            return r0
        L51:
            r6 = r1
            r1 = r8
            r8 = r6
        L54:
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L5a
        L58:
            r8 = r1
            goto L3d
        L5a:
            bo.o r4 = p929oi.AbstractC18201b.f58034a
            r4.getClass()
            Df.f r5 = p095Df.C2037g.Companion
            kotlinx.serialization.KSerializer r5 = r5.serializer()
            java.lang.Object r8 = r4.m12903b(r8, r5)
            r7.f6246Z = r1
            r7.f6245Y = r2
            Dn.j r4 = r7.f6247o0
            java.lang.Object r8 = r4.mo395a(r8, r7)
            if (r8 != r0) goto L58
            return r0
        L76:
            mm.C r8 = mm.C17296C.f55119a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p095Df.C2038h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
