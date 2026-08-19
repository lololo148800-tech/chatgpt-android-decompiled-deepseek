package p1039ud;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: ud.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C20191h extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C20192i f63936Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f63937Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C20192i f63938o0;

    /* JADX INFO: renamed from: p0 */
    public int f63939p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20191h(C20192i c20192i, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f63938o0 = c20192i;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f63937Z = obj;
        this.f63939p0 |= Integer.MIN_VALUE;
        return this.f63938o0.m21009a(this);
    }
}
