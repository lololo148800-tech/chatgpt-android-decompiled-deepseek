package p993rj;

import p001A.C0042V0;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: rj.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C19041c extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C0042V0 f60698Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f60699Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C0042V0 f60700o0;

    /* JADX INFO: renamed from: p0 */
    public int f60701p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19041c(C0042V0 c0042v0, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f60700o0 = c0042v0;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f60699Z = obj;
        this.f60701p0 |= Integer.MIN_VALUE;
        return this.f60700o0.mo221o(this);
    }
}
