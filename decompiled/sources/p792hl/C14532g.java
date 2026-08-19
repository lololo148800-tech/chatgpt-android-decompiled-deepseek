package p792hl;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: hl.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C14532g extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public Object f45799Y;

    /* JADX INFO: renamed from: Z */
    public Object f45800Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f45801o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C14535j f45802p0;

    /* JADX INFO: renamed from: q0 */
    public int f45803q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14532g(C14535j c14535j, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f45802p0 = c14535j;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f45801o0 = obj;
        this.f45803q0 |= Integer.MIN_VALUE;
        return this.f45802p0.m16037b(null, this);
    }
}
