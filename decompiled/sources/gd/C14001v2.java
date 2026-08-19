package gd;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: gd.v2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14001v2 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C14005w2 f44074Y;

    /* JADX INFO: renamed from: Z */
    public AbstractC13881O1 f44075Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f44076o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C14005w2 f44077p0;

    /* JADX INFO: renamed from: q0 */
    public int f44078q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14001v2(C14005w2 c14005w2, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f44077p0 = c14005w2;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f44076o0 = obj;
        this.f44078q0 |= Integer.MIN_VALUE;
        return this.f44077p0.m15482b(null, this);
    }
}
