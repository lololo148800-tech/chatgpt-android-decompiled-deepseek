package p708dh;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: dh.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C13154h extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f41757Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C13158l f41758Z;

    /* JADX INFO: renamed from: o0 */
    public int f41759o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13154h(C13158l c13158l, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f41758Z = c13158l;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f41757Y = obj;
        this.f41759o0 |= Integer.MIN_VALUE;
        return this.f41758Z.m14822c(this);
    }
}
