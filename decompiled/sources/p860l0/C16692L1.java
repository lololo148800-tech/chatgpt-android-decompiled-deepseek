package p860l0;

import mm.C17296C;
import p017Af.C0485p;
import p049Bm.InterfaceC1439n;
import p1014t1.C19748y;
import p972qm.InterfaceC18770c;
import sm.AbstractC19692h;

/* JADX INFO: renamed from: l0.L1 */
/* JADX INFO: loaded from: classes.dex */
public final class C16692L1 extends AbstractC19692h implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public float f53481Z;

    /* JADX INFO: renamed from: o0 */
    public float f53482o0;

    /* JADX INFO: renamed from: p0 */
    public float f53483p0;

    /* JADX INFO: renamed from: q0 */
    public long f53484q0;

    /* JADX INFO: renamed from: r0 */
    public int f53485r0;

    /* JADX INFO: renamed from: s0 */
    public int f53486s0;

    /* JADX INFO: renamed from: t0 */
    public int f53487t0;

    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ Object f53488u0;

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ boolean f53489v0;

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ C0485p f53490w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16692L1(boolean z6, C0485p c0485p, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f53489v0 = z6;
        this.f53490w0 = c0485p;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C16692L1 c16692l1 = new C16692L1(this.f53489v0, this.f53490w0, interfaceC18770c);
        c16692l1.f53488u0 = obj;
        return c16692l1;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16692L1) create((C19748y) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:23:0x00b0 A[LOOP:0: B:19:0x00a0->B:23:0x00b0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:91:0x00b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0094 -> B:18:0x0097). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // sm.AbstractC19685a
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p860l0.C16692L1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
