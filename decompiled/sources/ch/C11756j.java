package ch;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: ch.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C11756j extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C11757k f35644Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f35645Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C11757k f35646o0;

    /* JADX INFO: renamed from: p0 */
    public int f35647p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11756j(C11757k c11757k, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f35646o0 = c11757k;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f35645Z = obj;
        this.f35647p0 |= Integer.MIN_VALUE;
        return this.f35646o0.m13052c(null, null, null, this);
    }
}
