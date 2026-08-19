package p481Tf;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: Tf.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C7412q extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f23478Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C7415t f23479Z;

    /* JADX INFO: renamed from: o0 */
    public int f23480o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7412q(C7415t c7415t, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f23479Z = c7415t;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f23478Y = obj;
        this.f23480o0 |= Integer.MIN_VALUE;
        return this.f23479Z.m7799c(this);
    }
}
