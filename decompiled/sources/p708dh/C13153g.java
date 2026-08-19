package p708dh;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: dh.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C13153g extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f41754Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C13158l f41755Z;

    /* JADX INFO: renamed from: o0 */
    public int f41756o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13153g(C13158l c13158l, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f41755Z = c13158l;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f41754Y = obj;
        this.f41756o0 |= Integer.MIN_VALUE;
        return this.f41755Z.m14821b(this);
    }
}
