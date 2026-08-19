package p1001s1;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: s1.e */
/* JADX INFO: loaded from: classes.dex */
public final class C19435e extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C19437g f61626Y;

    /* JADX INFO: renamed from: Z */
    public long f61627Z;

    /* JADX INFO: renamed from: o0 */
    public long f61628o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f61629p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C19437g f61630q0;

    /* JADX INFO: renamed from: r0 */
    public int f61631r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19435e(C19437g c19437g, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f61630q0 = c19437g;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f61629p0 = obj;
        this.f61631r0 |= Integer.MIN_VALUE;
        return this.f61630q0.mo4039V(0L, 0L, this);
    }
}
