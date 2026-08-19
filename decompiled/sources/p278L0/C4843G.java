package p278L0;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1014t1.C19748y;
import p1014t1.EnumC19730g;
import p229J0.C3899D4;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19692h;

/* JADX INFO: renamed from: L0.G */
/* JADX INFO: loaded from: classes.dex */
public final class C4843G extends AbstractC19692h implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public EnumC19730g f15765Z;

    /* JADX INFO: renamed from: o0 */
    public int f15766o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f15767p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC0571F f15768q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C3899D4 f15769r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4843G(InterfaceC0571F interfaceC0571F, C3899D4 c3899d4, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f15768q0 = interfaceC0571F;
        this.f15769r0 = c3899d4;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C4843G c4843g = new C4843G(this.f15768q0, this.f15769r0, interfaceC18770c);
        c4843g.f15767p0 = obj;
        return c4843g;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        ((C4843G) create((C19748y) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        return EnumC19250a.f61036Y;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0031 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0046  */
    /* JADX WARN: Code duplicated, block: B:16:0x0051  */
    /* JADX WARN: Code duplicated, block: B:17:0x005e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0065  */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002f -> B:12:0x0032). Please report as a decompilation issue!!! */
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
            int r1 = r7.f15766o0
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            t1.g r1 = r7.f15765Z
            java.lang.Object r3 = r7.f15767p0
            t1.y r3 = (p1014t1.C19748y) r3
            p571X9.AbstractC9233X.m9807c(r8)
            goto L32
        L13:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1b:
            p571X9.AbstractC9233X.m9807c(r8)
            java.lang.Object r8 = r7.f15767p0
            t1.y r8 = (p1014t1.C19748y) r8
            t1.g r1 = p1014t1.EnumC19730g.f62466Z
            r3 = r8
        L25:
            r7.f15767p0 = r3
            r7.f15765Z = r1
            r7.f15766o0 = r2
            java.lang.Object r8 = r3.m20695a(r1, r7)
            if (r8 != r0) goto L32
            return r0
        L32:
            t1.f r8 = (p1014t1.C19729f) r8
            java.lang.Object r4 = r8.f62460a
            r5 = 0
            java.lang.Object r4 = r4.get(r5)
            t1.o r4 = (p1014t1.C19738o) r4
            int r4 = r4.f62486i
            r5 = 2
            boolean r4 = p1014t1.AbstractC19736m.m20683e(r4, r5)
            if (r4 == 0) goto L25
            int r8 = r8.f62464e
            r4 = 4
            boolean r4 = p1014t1.AbstractC19736m.m20682d(r8, r4)
            J0.D4 r5 = r7.f15769r0
            if (r4 == 0) goto L5e
            L0.F r8 = new L0.F
            r4 = 0
            r8.<init>(r5, r4)
            r5 = 3
            An.F r6 = r7.f15768q0
            p025An.AbstractC0575H.m1156D(r6, r4, r4, r8, r5)
            goto L25
        L5e:
            r4 = 5
            boolean r8 = p1014t1.AbstractC19736m.m20682d(r8, r4)
            if (r8 == 0) goto L25
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            g0.P r4 = r5.f11883c
            O0.f0 r4 = r4.f43331c
            r4.setValue(r8)
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: p278L0.C4843G.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
