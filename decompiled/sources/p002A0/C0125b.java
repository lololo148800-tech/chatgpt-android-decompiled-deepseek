package p002A0;

import mm.C17296C;
import p001A.C0095w0;
import p049Bm.InterfaceC1439n;
import p1014t1.C19738o;
import p1014t1.C19748y;
import p972qm.InterfaceC18770c;
import sm.AbstractC19692h;

/* JADX INFO: renamed from: A0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0125b extends AbstractC19692h implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public C19738o f530Z;

    /* JADX INFO: renamed from: o0 */
    public int f531o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f532p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C0095w0 f533q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C0112K f534r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0125b(C0095w0 c0095w0, C0112K c0112k, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f533q0 = c0095w0;
        this.f534r0 = c0112k;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C0125b c0125b = new C0125b(this.f533q0, this.f534r0, interfaceC18770c);
        c0125b.f532p0 = obj;
        return c0125b;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0125b) create((C19748y) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0084 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x0090  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a5 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0082 -> B:25:0x0085). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:27:0x0090
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // sm.AbstractC19685a
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            rm.a r0 = p996rm.EnumC19250a.f61036Y
            int r1 = r12.f531o0
            A0.K r2 = r12.f534r0
            r3 = 1
            r4 = 2
            if (r1 == 0) goto L28
            if (r1 == r3) goto L20
            if (r1 != r4) goto L18
            t1.o r1 = r12.f530Z
            java.lang.Object r3 = r12.f532p0
            t1.y r3 = (p1014t1.C19748y) r3
            p571X9.AbstractC9233X.m9807c(r13)
            goto L85
        L18:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L20:
            java.lang.Object r1 = r12.f532p0
            t1.y r1 = (p1014t1.C19748y) r1
            p571X9.AbstractC9233X.m9807c(r13)
            goto L3c
        L28:
            p571X9.AbstractC9233X.m9807c(r13)
            java.lang.Object r13 = r12.f532p0
            r1 = r13
            t1.y r1 = (p1014t1.C19748y) r1
            r12.f532p0 = r1
            r12.f531o0 = r3
            r13 = 0
            java.lang.Object r13 = p860l0.AbstractC16689K1.m18506c(r1, r13, r12, r4)
            if (r13 != r0) goto L3c
            return r0
        L3c:
            t1.o r13 = (p1014t1.C19738o) r13
            long r5 = r13.f62480c
            A.w0 r3 = r12.f533q0
            java.lang.Object r5 = r3.f411o0
            A0.T r5 = (p002A0.C0120T) r5
            x1.s r6 = r5.m412q()
            if (r6 == 0) goto L53
            r7 = 0
            long r6 = r6.mo21520d(r7)
            goto L58
        L53:
            r6 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
        L58:
            g1.b r8 = new g1.b
            r8.<init>(r6)
            O0.f0 r6 = r5.f511m
            r6.setValue(r8)
            boolean r3 = r3.f410Z
            if (r3 == 0) goto L69
            w0.S r6 = p1071w0.EnumC20729S.f65725Z
            goto L6b
        L69:
            w0.S r6 = p1071w0.EnumC20729S.f65726o0
        L6b:
            long r7 = r5.m410o(r3)
            long r7 = p080D0.AbstractC1783Q.m2572a(r7)
            r5.m420y(r6, r7)
            r3 = r1
            r1 = r13
        L78:
            r12.f532p0 = r3
            r12.f530Z = r1
            r12.f531o0 = r4
            java.lang.Object r13 = p911o0.AbstractC17792x.m19522e(r3, r12)
            if (r13 != r0) goto L85
            return r0
        L85:
            t1.f r13 = (p1014t1.C19729f) r13
            java.lang.Object r13 = r13.f62460a
            int r5 = r13.size()
            r6 = 0
        L8e:
            if (r6 >= r5) goto La8
            java.lang.Object r7 = r13.get(r6)
            t1.o r7 = (p1014t1.C19738o) r7
            long r8 = r7.f62478a
            long r10 = r1.f62478a
            boolean r8 = p1014t1.C19737n.m20689a(r8, r10)
            if (r8 == 0) goto La5
            boolean r7 = r7.f62481d
            if (r7 == 0) goto La5
            goto L78
        La5:
            int r6 = r6 + 1
            goto L8e
        La8:
            r2.invoke()
            mm.C r13 = mm.C17296C.f55119a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p002A0.C0125b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
