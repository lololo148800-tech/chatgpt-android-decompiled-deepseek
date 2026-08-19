package p787he;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: he.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C14477f extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f45604Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C14459O f45605Z;

    /* JADX INFO: renamed from: o0 */
    public int f45606o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14477f(C14459O c14459o, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f45605Z = c14459o;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f45604Y = obj;
        this.f45606o0 |= Integer.MIN_VALUE;
        return this.f45605Z.m15975d(null, this);
    }
}
