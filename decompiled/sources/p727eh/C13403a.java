package p727eh;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: eh.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C13403a extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C13404b f42458Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f42459Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C13404b f42460o0;

    /* JADX INFO: renamed from: p0 */
    public int f42461p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13403a(C13404b c13404b, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f42460o0 = c13404b;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f42459Z = obj;
        this.f42461p0 |= Integer.MIN_VALUE;
        return this.f42460o0.mo4158a(this);
    }
}
