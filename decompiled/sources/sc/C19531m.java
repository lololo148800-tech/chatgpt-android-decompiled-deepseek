package sc;

import p860l0.C16685J0;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: sc.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C19531m extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f62044Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C16685J0 f62045Z;

    /* JADX INFO: renamed from: o0 */
    public int f62046o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19531m(C16685J0 c16685j0, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f62045Z = c16685j0;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f62044Y = obj;
        this.f62046o0 |= Integer.MIN_VALUE;
        return this.f62045Z.m18501a(this);
    }
}
