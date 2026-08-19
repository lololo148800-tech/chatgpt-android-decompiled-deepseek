package p787he;

import p479Td.C7351f0;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: he.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C14479h extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C14459O f45613Y;

    /* JADX INFO: renamed from: Z */
    public C7351f0 f45614Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f45615o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C14459O f45616p0;

    /* JADX INFO: renamed from: q0 */
    public int f45617q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14479h(C14459O c14459o, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f45616p0 = c14459o;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f45615o0 = obj;
        this.f45617q0 |= Integer.MIN_VALUE;
        return this.f45616p0.m15977f(null, this);
    }
}
