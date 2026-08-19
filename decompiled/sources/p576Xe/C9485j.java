package p576Xe;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: Xe.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C9485j extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f28557Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C9473F f28558Z;

    /* JADX INFO: renamed from: o0 */
    public int f28559o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9485j(C9473F c9473f, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f28558Z = c9473f;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f28557Y = obj;
        this.f28559o0 |= Integer.MIN_VALUE;
        return this.f28558Z.m10007f(null, this);
    }
}
