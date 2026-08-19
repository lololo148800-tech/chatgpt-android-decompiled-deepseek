package p753fh;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: fh.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C13648f extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f43108Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C13650h f43109Z;

    /* JADX INFO: renamed from: o0 */
    public int f43110o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13648f(C13650h c13650h, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f43109Z = c13650h;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f43108Y = obj;
        this.f43110o0 |= Integer.MIN_VALUE;
        return this.f43109Z.m15155b(false, this);
    }
}
