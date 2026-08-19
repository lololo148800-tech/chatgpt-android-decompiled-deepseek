package p860l0;

import mm.InterfaceC17302e;
import p049Bm.InterfaceC1426a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: l0.M1 */
/* JADX INFO: loaded from: classes.dex */
public final class C16695M1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C16698N1 f53492Y;

    /* JADX INFO: renamed from: Z */
    public InterfaceC17302e f53493Z;

    /* JADX INFO: renamed from: o0 */
    public InterfaceC1426a f53494o0;

    /* JADX INFO: renamed from: p0 */
    public float f53495p0;

    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ Object f53496q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C16698N1 f53497r0;

    /* JADX INFO: renamed from: s0 */
    public int f53498s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16695M1(C16698N1 c16698n1, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f53497r0 = c16698n1;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f53496q0 = obj;
        this.f53498s0 |= Integer.MIN_VALUE;
        return this.f53497r0.m18511a(null, null, this);
    }
}
