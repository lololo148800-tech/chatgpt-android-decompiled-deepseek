package p845k3;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: k3.d */
/* JADX INFO: loaded from: classes.dex */
public final class C16327d extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f50652Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C16329f f50653Z;

    /* JADX INFO: renamed from: o0 */
    public int f50654o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16327d(C16329f c16329f, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f50653Z = c16329f;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f50652Y = obj;
        this.f50654o0 |= Integer.MIN_VALUE;
        return this.f50653Z.m17921c(null, null, null, this);
    }
}
