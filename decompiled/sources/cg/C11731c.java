package cg;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: cg.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C11731c extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f35574Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C11745q f35575Z;

    /* JADX INFO: renamed from: o0 */
    public int f35576o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11731c(C11745q c11745q, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f35575Z = c11745q;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f35574Y = obj;
        this.f35576o0 |= Integer.MIN_VALUE;
        return this.f35575Z.m13036b(null, this);
    }
}
