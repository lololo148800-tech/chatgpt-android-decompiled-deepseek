package p792hl;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: hl.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C14531f extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f45796Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C14535j f45797Z;

    /* JADX INFO: renamed from: o0 */
    public int f45798o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14531f(C14535j c14535j, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f45797Z = c14535j;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f45796Y = obj;
        this.f45798o0 |= Integer.MIN_VALUE;
        return this.f45797Z.m16036a(null, this);
    }
}
