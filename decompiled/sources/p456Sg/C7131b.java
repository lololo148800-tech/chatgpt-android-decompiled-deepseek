package p456Sg;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: Sg.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C7131b extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f22689Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C7132c f22690Z;

    /* JADX INFO: renamed from: o0 */
    public int f22691o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7131b(C7132c c7132c, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f22690Z = c7132c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f22689Y = obj;
        this.f22691o0 |= Integer.MIN_VALUE;
        return this.f22690Z.m7523b(null, false, this);
    }
}
