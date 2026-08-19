package ch;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: ch.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C11753g extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C11757k f35634Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f35635Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C11757k f35636o0;

    /* JADX INFO: renamed from: p0 */
    public int f35637p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11753g(C11757k c11757k, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f35636o0 = c11757k;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f35635Z = obj;
        this.f35637p0 |= Integer.MIN_VALUE;
        return this.f35636o0.m13050a(this);
    }
}
