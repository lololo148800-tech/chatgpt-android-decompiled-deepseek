package p787he;

import p403Qd.C6636i;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: he.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C14486o extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C14459O f45642Y;

    /* JADX INFO: renamed from: Z */
    public C6636i f45643Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f45644o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C14459O f45645p0;

    /* JADX INFO: renamed from: q0 */
    public int f45646q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14486o(C14459O c14459o, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f45645p0 = c14459o;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f45644o0 = obj;
        this.f45646q0 |= Integer.MIN_VALUE;
        return this.f45645p0.m15980i(this);
    }
}
