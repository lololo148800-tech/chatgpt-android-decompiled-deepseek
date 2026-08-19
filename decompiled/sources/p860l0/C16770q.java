package p860l0;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: l0.q */
/* JADX INFO: loaded from: classes.dex */
public final class C16770q extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C16782u f53812Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f53813Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16782u f53814o0;

    /* JADX INFO: renamed from: p0 */
    public int f53815p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16770q(C16782u c16782u, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f53814o0 = c16782u;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f53813Z = obj;
        this.f53815p0 |= Integer.MIN_VALUE;
        return this.f53814o0.m18547a(null, null, null, this);
    }
}
