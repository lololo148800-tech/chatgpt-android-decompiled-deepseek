package p504Ue;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: Ue.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C7632b extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f24131Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C7634d f24132Z;

    /* JADX INFO: renamed from: o0 */
    public int f24133o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7632b(C7634d c7634d, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f24132Z = c7634d;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f24131Y = obj;
        this.f24133o0 |= Integer.MIN_VALUE;
        return this.f24132Z.m7969b(null, this);
    }
}
