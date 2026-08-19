package p982r5;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: r5.f */
/* JADX INFO: loaded from: classes.dex */
public final class C18878f extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C18880h f60163Y;

    /* JADX INFO: renamed from: Z */
    public C18882j f60164Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f60165o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C18880h f60166p0;

    /* JADX INFO: renamed from: q0 */
    public int f60167q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18878f(C18880h c18880h, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f60166p0 = c18880h;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f60165o0 = obj;
        this.f60167q0 |= Integer.MIN_VALUE;
        return this.f60166p0.m20199d(null, this);
    }
}
