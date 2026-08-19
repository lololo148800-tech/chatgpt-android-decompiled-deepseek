package p1083we;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: we.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C20919e extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f66678Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C20921g f66679Z;

    /* JADX INFO: renamed from: o0 */
    public int f66680o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20919e(C20921g c20921g, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f66679Z = c20921g;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f66678Y = obj;
        this.f66680o0 |= Integer.MIN_VALUE;
        return this.f66679Z.m21456c(false, this);
    }
}
