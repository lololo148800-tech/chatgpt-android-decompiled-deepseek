package p925oe;

import p275Kn.C4816c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: oe.J */
/* JADX INFO: loaded from: classes3.dex */
public final class C18085J extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public Object f57690Y;

    /* JADX INFO: renamed from: Z */
    public C4816c f57691Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f57692o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C18086K f57693p0;

    /* JADX INFO: renamed from: q0 */
    public int f57694q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18085J(C18086K c18086k, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f57693p0 = c18086k;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f57692o0 = obj;
        this.f57694q0 |= Integer.MIN_VALUE;
        return this.f57693p0.m19709e(null, this);
    }
}
