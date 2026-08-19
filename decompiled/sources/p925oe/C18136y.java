package p925oe;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: oe.y */
/* JADX INFO: loaded from: classes3.dex */
public final class C18136y extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f57869Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C18077B f57870Z;

    /* JADX INFO: renamed from: o0 */
    public int f57871o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18136y(C18077B c18077b, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f57870Z = c18077b;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f57869Y = obj;
        this.f57871o0 |= Integer.MIN_VALUE;
        return this.f57870Z.m19702g(null, this);
    }
}
