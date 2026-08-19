package p925oe;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: oe.u */
/* JADX INFO: loaded from: classes3.dex */
public final class C18132u extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public Object f57847Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f57848Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C18077B f57849o0;

    /* JADX INFO: renamed from: p0 */
    public int f57850p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18132u(C18077B c18077b, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f57849o0 = c18077b;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f57848Z = obj;
        this.f57850p0 |= Integer.MIN_VALUE;
        return this.f57849o0.m19698c(null, this);
    }
}
