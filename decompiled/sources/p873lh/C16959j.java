package p873lh;

import p324Mn.C5551u;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: lh.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C16959j extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C16961l f54429Y;

    /* JADX INFO: renamed from: Z */
    public C5551u f54430Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f54431o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C16961l f54432p0;

    /* JADX INFO: renamed from: q0 */
    public int f54433q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16959j(C16961l c16961l, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f54432p0 = c16961l;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f54431o0 = obj;
        this.f54433q0 |= Integer.MIN_VALUE;
        return this.f54432p0.m18596g(this);
    }
}
