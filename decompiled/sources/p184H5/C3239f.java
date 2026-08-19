package p184H5;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: H5.f */
/* JADX INFO: loaded from: classes.dex */
public final class C3239f extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C3244k f9850Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f9851Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C3241h f9852o0;

    /* JADX INFO: renamed from: p0 */
    public int f9853p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3239f(C3241h c3241h, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f9852o0 = c3241h;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f9851Z = obj;
        this.f9853p0 |= Integer.MIN_VALUE;
        return this.f9852o0.m4131d(null, this);
    }
}
