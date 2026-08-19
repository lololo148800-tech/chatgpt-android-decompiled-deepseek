package p427Rc;

import p275Kn.C4816c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Rc.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C6857n extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C6861r f22011Y;

    /* JADX INFO: renamed from: Z */
    public C4816c f22012Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f22013o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C6861r f22014p0;

    /* JADX INFO: renamed from: q0 */
    public int f22015q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6857n(C6861r c6861r, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f22014p0 = c6861r;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f22013o0 = obj;
        this.f22015q0 |= Integer.MIN_VALUE;
        return this.f22014p0.m7282a(this);
    }
}
