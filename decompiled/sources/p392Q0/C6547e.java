package p392Q0;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1091wn.C21030k;
import p972qm.InterfaceC18770c;
import sm.AbstractC19692h;

/* JADX INFO: renamed from: Q0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C6547e extends AbstractC19692h implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public Object[] f21185Z;

    /* JADX INFO: renamed from: o0 */
    public long[] f21186o0;

    /* JADX INFO: renamed from: p0 */
    public int f21187p0;

    /* JADX INFO: renamed from: q0 */
    public int f21188q0;

    /* JADX INFO: renamed from: r0 */
    public int f21189r0;

    /* JADX INFO: renamed from: s0 */
    public int f21190s0;

    /* JADX INFO: renamed from: t0 */
    public long f21191t0;

    /* JADX INFO: renamed from: u0 */
    public int f21192u0;

    /* JADX INFO: renamed from: v0 */
    public /* synthetic */ Object f21193v0;

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ C6548f f21194w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6547e(C6548f c6548f, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f21194w0 = c6548f;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C6547e c6547e = new C6547e(this.f21194w0, interfaceC18770c);
        c6547e.f21193v0 = obj;
        return c6547e;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C6547e) create((C21030k) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0051  */
    /* JADX WARN: Code duplicated, block: B:20:0x008d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x008f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0095  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004f -> B:22:0x0093). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0051 -> B:14:0x0062). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006b -> B:19:0x008a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // sm.AbstractC19685a
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = 1
            rm.a r2 = p996rm.EnumC19250a.f61036Y
            int r3 = r0.f21192u0
            r4 = 0
            r5 = 8
            if (r3 == 0) goto L2c
            if (r3 != r1) goto L24
            int r3 = r0.f21190s0
            int r6 = r0.f21189r0
            long r7 = r0.f21191t0
            int r9 = r0.f21188q0
            int r10 = r0.f21187p0
            long[] r11 = r0.f21186o0
            java.lang.Object[] r12 = r0.f21185Z
            java.lang.Object r13 = r0.f21193v0
            wn.k r13 = (p1091wn.C21030k) r13
            p571X9.AbstractC9233X.m9807c(r21)
            goto L8a
        L24:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2c:
            p571X9.AbstractC9233X.m9807c(r21)
            java.lang.Object r3 = r0.f21193v0
            wn.k r3 = (p1091wn.C21030k) r3
            Q0.f r6 = r0.f21194w0
            d0.G r6 = r6.f21195Y
            java.lang.Object[] r7 = r6.f41144b
            long[] r6 = r6.f41143a
            int r8 = r6.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L97
            r9 = r4
        L41:
            r10 = r6[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L93
            int r12 = r9 - r8
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r3
            r3 = r4
            r18 = r10
            r11 = r6
            r10 = r8
            r6 = r12
            r12 = r7
            r7 = r18
        L62:
            if (r3 >= r6) goto L8d
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r7
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L8a
            int r4 = r9 << 3
            int r4 = r4 + r3
            r4 = r12[r4]
            r0.f21193v0 = r13
            r0.f21185Z = r12
            r0.f21186o0 = r11
            r0.f21187p0 = r10
            r0.f21188q0 = r9
            r0.f21191t0 = r7
            r0.f21189r0 = r6
            r0.f21190s0 = r3
            r0.f21192u0 = r1
            r13.m21482c(r4, r0)
            rm.a r1 = p996rm.EnumC19250a.f61036Y
            return r2
        L8a:
            long r7 = r7 >> r5
            int r3 = r3 + r1
            goto L62
        L8d:
            if (r6 != r5) goto L97
            r8 = r10
            r6 = r11
            r7 = r12
            r3 = r13
        L93:
            if (r9 == r8) goto L97
            int r9 = r9 + r1
            goto L41
        L97:
            mm.C r1 = mm.C17296C.f55119a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p392Q0.C6547e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
