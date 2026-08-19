package p982r5;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: r5.i */
/* JADX INFO: loaded from: classes.dex */
public final class C18881i extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C18882j f60180Y;

    /* JADX INFO: renamed from: Z */
    public C18880h f60181Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f60182o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C18882j f60183p0;

    /* JADX INFO: renamed from: q0 */
    public int f60184q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18881i(C18882j c18882j, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f60183p0 = c18882j;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f60182o0 = obj;
        this.f60184q0 |= Integer.MIN_VALUE;
        return this.f60183p0.m20201b(null, this);
    }
}
