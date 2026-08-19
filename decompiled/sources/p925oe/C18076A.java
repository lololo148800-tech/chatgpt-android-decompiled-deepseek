package p925oe;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: oe.A */
/* JADX INFO: loaded from: classes3.dex */
public final class C18076A extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C18077B f57649Y;

    /* JADX INFO: renamed from: Z */
    public String f57650Z;

    /* JADX INFO: renamed from: o0 */
    public String f57651o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f57652p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C18077B f57653q0;

    /* JADX INFO: renamed from: r0 */
    public int f57654r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18076A(C18077B c18077b, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f57653q0 = c18077b;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f57652p0 = obj;
        this.f57654r0 |= Integer.MIN_VALUE;
        return this.f57653q0.m19704i(null, null, this);
    }
}
