package p881m0;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: m0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C17131h extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f54778Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C17133j f54779Z;

    /* JADX INFO: renamed from: o0 */
    public int f54780o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17131h(C17133j c17133j, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f54779Z = c17133j;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f54778Y = obj;
        this.f54780o0 |= Integer.MIN_VALUE;
        return this.f54779Z.m18899d(null, 0.0f, null, this);
    }
}
