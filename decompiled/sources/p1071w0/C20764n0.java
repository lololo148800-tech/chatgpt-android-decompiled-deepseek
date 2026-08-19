package p1071w0;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1014t1.C19738o;
import p1014t1.C19748y;
import p972qm.InterfaceC18770c;
import sm.AbstractC19692h;

/* JADX INFO: renamed from: w0.n0 */
/* JADX INFO: loaded from: classes.dex */
public final class C20764n0 extends AbstractC19692h implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public C19738o f65906Z;

    /* JADX INFO: renamed from: o0 */
    public int f65907o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f65908p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC20772r0 f65909q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20764n0(InterfaceC20772r0 interfaceC20772r0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f65909q0 = interfaceC20772r0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C20764n0 c20764n0 = new C20764n0(this.f65909q0, interfaceC18770c);
        c20764n0.f65908p0 = obj;
        return c20764n0;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C20764n0) create((C19748y) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0051 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x005d  */
    /* JADX WARN: Code duplicated, block: B:21:0x006d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0072 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004f -> B:17:0x0052). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:29:0x0072
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // sm.AbstractC19685a
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            rm.a r0 = p996rm.EnumC19250a.f61036Y
            int r1 = r12.f65907o0
            r2 = 1
            r3 = 2
            w0.r0 r4 = r12.f65909q0
            if (r1 == 0) goto L28
            if (r1 == r2) goto L20
            if (r1 != r3) goto L18
            t1.o r1 = r12.f65906Z
            java.lang.Object r2 = r12.f65908p0
            t1.y r2 = (p1014t1.C19748y) r2
            p571X9.AbstractC9233X.m9807c(r13)
            goto L52
        L18:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L20:
            java.lang.Object r1 = r12.f65908p0
            t1.y r1 = (p1014t1.C19748y) r1
            p571X9.AbstractC9233X.m9807c(r13)
            goto L3c
        L28:
            p571X9.AbstractC9233X.m9807c(r13)
            java.lang.Object r13 = r12.f65908p0
            r1 = r13
            t1.y r1 = (p1014t1.C19748y) r1
            r12.f65908p0 = r1
            r12.f65907o0 = r2
            r13 = 0
            java.lang.Object r13 = p860l0.AbstractC16689K1.m18506c(r1, r13, r12, r3)
            if (r13 != r0) goto L3c
            return r0
        L3c:
            t1.o r13 = (p1014t1.C19738o) r13
            long r5 = r13.f62480c
            r4.mo467d()
            r2 = r1
            r1 = r13
        L45:
            r12.f65908p0 = r2
            r12.f65906Z = r1
            r12.f65907o0 = r3
            java.lang.Object r13 = p911o0.AbstractC17792x.m19522e(r2, r12)
            if (r13 != r0) goto L52
            return r0
        L52:
            t1.f r13 = (p1014t1.C19729f) r13
            java.lang.Object r13 = r13.f62460a
            int r5 = r13.size()
            r6 = 0
        L5b:
            if (r6 >= r5) goto L75
            java.lang.Object r7 = r13.get(r6)
            t1.o r7 = (p1014t1.C19738o) r7
            long r8 = r7.f62478a
            long r10 = r1.f62478a
            boolean r8 = p1014t1.C19737n.m20689a(r8, r10)
            if (r8 == 0) goto L72
            boolean r7 = r7.f62481d
            if (r7 == 0) goto L72
            goto L45
        L72:
            int r6 = r6 + 1
            goto L5b
        L75:
            r4.mo466c()
            mm.C r13 = mm.C17296C.f55119a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p1071w0.C20764n0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
