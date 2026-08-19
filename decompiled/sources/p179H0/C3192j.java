package p179H0;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: H0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C3192j extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f9626Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C3193k f9627Z;

    /* JADX INFO: renamed from: o0 */
    public int f9628o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3192j(C3193k c3193k, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f9627Z = c3193k;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f9626Y = obj;
        this.f9628o0 |= Integer.MIN_VALUE;
        return this.f9627Z.mo4040p0(0L, this);
    }
}
