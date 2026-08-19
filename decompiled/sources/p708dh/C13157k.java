package p708dh;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: dh.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C13157k extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public Object f41771Y;

    /* JADX INFO: renamed from: Z */
    public boolean f41772Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f41773o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C13158l f41774p0;

    /* JADX INFO: renamed from: q0 */
    public int f41775q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13157k(C13158l c13158l, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f41774p0 = c13158l;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f41773o0 = obj;
        this.f41775q0 |= Integer.MIN_VALUE;
        return this.f41774p0.m14825f(false, this);
    }
}
