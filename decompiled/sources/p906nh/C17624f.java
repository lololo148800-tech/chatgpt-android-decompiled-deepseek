package p906nh;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: nh.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C17624f extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f56398Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C17625g f56399Z;

    /* JADX INFO: renamed from: o0 */
    public int f56400o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17624f(C17625g c17625g, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f56399Z = c17625g;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f56398Y = obj;
        this.f56400o0 |= Integer.MIN_VALUE;
        return this.f56399Z.m19231k(this);
    }
}
