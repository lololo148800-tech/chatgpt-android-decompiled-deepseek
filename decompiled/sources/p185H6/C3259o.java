package p185H6;

import p792hl.AbstractC14527b;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: H6.o */
/* JADX INFO: loaded from: classes.dex */
public final class C3259o extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public AbstractC14527b f9922Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f9923Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C3260p f9924o0;

    /* JADX INFO: renamed from: p0 */
    public int f9925p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3259o(C3260p c3260p, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f9924o0 = c3260p;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f9923Z = obj;
        this.f9925p0 |= Integer.MIN_VALUE;
        return this.f9924o0.mo4137w(null, this);
    }
}
