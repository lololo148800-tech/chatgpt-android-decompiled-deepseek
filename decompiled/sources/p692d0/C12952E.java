package p692d0;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1091wn.C21030k;
import p491U0.C7535c;
import p972qm.InterfaceC18770c;
import sm.AbstractC19692h;

/* JADX INFO: renamed from: d0.E */
/* JADX INFO: loaded from: classes.dex */
public final class C12952E extends AbstractC19692h implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public C7535c f41129Z;

    /* JADX INFO: renamed from: o0 */
    public C12954G f41130o0;

    /* JADX INFO: renamed from: p0 */
    public long[] f41131p0;

    /* JADX INFO: renamed from: q0 */
    public int f41132q0;

    /* JADX INFO: renamed from: r0 */
    public int f41133r0;

    /* JADX INFO: renamed from: s0 */
    public int f41134s0;

    /* JADX INFO: renamed from: t0 */
    public int f41135t0;

    /* JADX INFO: renamed from: u0 */
    public long f41136u0;

    /* JADX INFO: renamed from: v0 */
    public int f41137v0;

    /* JADX INFO: renamed from: w0 */
    public /* synthetic */ Object f41138w0;

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ C12954G f41139x0;

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ C7535c f41140y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12952E(C12954G c12954g, C7535c c7535c, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f41139x0 = c12954g;
        this.f41140y0 = c7535c;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C12952E c12952e = new C12952E(this.f41139x0, this.f41140y0, interfaceC18770c);
        c12952e.f41138w0 = obj;
        return c12952e;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C12952E) create((C21030k) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0052  */
    /* JADX WARN: Code duplicated, block: B:20:0x0096 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0098  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0050 -> B:22:0x009e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0052 -> B:14:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006e -> B:19:0x0093). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // sm.AbstractC19685a
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            r1 = 1
            rm.a r2 = p996rm.EnumC19250a.f61036Y
            int r3 = r0.f41137v0
            r4 = 0
            r5 = 8
            if (r3 == 0) goto L2f
            if (r3 != r1) goto L27
            int r3 = r0.f41135t0
            int r6 = r0.f41134s0
            long r7 = r0.f41136u0
            int r9 = r0.f41133r0
            int r10 = r0.f41132q0
            long[] r11 = r0.f41131p0
            d0.G r12 = r0.f41130o0
            U0.c r13 = r0.f41129Z
            java.lang.Object r14 = r0.f41138w0
            wn.k r14 = (p1091wn.C21030k) r14
            p571X9.AbstractC9233X.m9807c(r22)
            goto L93
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2f:
            p571X9.AbstractC9233X.m9807c(r22)
            java.lang.Object r3 = r0.f41138w0
            wn.k r3 = (p1091wn.C21030k) r3
            d0.G r6 = r0.f41139x0
            long[] r7 = r6.f41143a
            int r8 = r7.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto La2
            U0.c r9 = r0.f41140y0
            r10 = r4
        L42:
            r11 = r7[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L9e
            int r13 = r10 - r8
            int r13 = ~r13
            int r13 = r13 >>> 31
            int r13 = 8 - r13
            r14 = r3
            r3 = r4
            r19 = r11
            r12 = r6
            r11 = r7
            r6 = r13
            r13 = r9
            r9 = r10
            r10 = r8
            r7 = r19
        L65:
            if (r3 >= r6) goto L96
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r7
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L93
            int r4 = r9 << 3
            int r4 = r4 + r3
            r13.f23885Z = r4
            java.lang.Object[] r5 = r12.f41144b
            r4 = r5[r4]
            r0.f41138w0 = r14
            r0.f41129Z = r13
            r0.f41130o0 = r12
            r0.f41131p0 = r11
            r0.f41132q0 = r10
            r0.f41133r0 = r9
            r0.f41136u0 = r7
            r0.f41134s0 = r6
            r0.f41135t0 = r3
            r0.f41137v0 = r1
            r14.m21482c(r4, r0)
            rm.a r1 = p996rm.EnumC19250a.f61036Y
            return r2
        L93:
            long r7 = r7 >> r5
            int r3 = r3 + r1
            goto L65
        L96:
            if (r6 != r5) goto La2
            r8 = r10
            r7 = r11
            r6 = r12
            r3 = r14
            r10 = r9
            r9 = r13
        L9e:
            if (r10 == r8) goto La2
            int r10 = r10 + r1
            goto L42
        La2:
            mm.C r1 = mm.C17296C.f55119a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p692d0.C12952E.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
