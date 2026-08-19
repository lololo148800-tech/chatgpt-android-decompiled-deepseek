package p995rl;

import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: rl.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C19245e extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f61008Y;

    /* JADX INFO: renamed from: Z */
    public int f61009Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C19246f f61010o0;

    /* JADX INFO: renamed from: p0 */
    public C19246f f61011p0;

    /* JADX INFO: renamed from: q0 */
    public Object f61012q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19245e(C19246f c19246f, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f61010o0 = c19246f;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f61008Y = obj;
        this.f61009Z |= Integer.MIN_VALUE;
        return this.f61010o0.mo395a(null, this);
    }
}
