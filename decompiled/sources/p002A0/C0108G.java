package p002A0;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: A0.G */
/* JADX INFO: loaded from: classes.dex */
public final class C0108G extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C0120T f466Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f467Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C0120T f468o0;

    /* JADX INFO: renamed from: p0 */
    public int f469p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0108G(C0120T c0120t, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f468o0 = c0120t;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f467Z = obj;
        this.f469p0 |= Integer.MIN_VALUE;
        return this.f468o0.m415t(this);
    }
}
