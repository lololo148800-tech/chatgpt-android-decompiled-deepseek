package p059C5;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: C5.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1598p extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f4477Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C1600r f4478Z;

    /* JADX INFO: renamed from: o0 */
    public int f4479o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1598p(C1600r c1600r, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f4478Z = c1600r;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f4477Y = obj;
        this.f4479o0 |= Integer.MIN_VALUE;
        return this.f4478Z.mo2445a(this);
    }
}
