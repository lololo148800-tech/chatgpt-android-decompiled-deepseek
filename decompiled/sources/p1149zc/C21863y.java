package p1149zc;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: zc.y */
/* JADX INFO: loaded from: classes3.dex */
public final class C21863y extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f69332Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractC21864z f69333Z;

    /* JADX INFO: renamed from: o0 */
    public int f69334o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21863y(AbstractC21864z abstractC21864z, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f69333Z = abstractC21864z;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f69332Y = obj;
        this.f69334o0 |= Integer.MIN_VALUE;
        return this.f69333Z.m22317a(this);
    }
}
