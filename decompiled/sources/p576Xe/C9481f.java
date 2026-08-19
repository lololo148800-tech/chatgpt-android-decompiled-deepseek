package p576Xe;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: Xe.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C9481f extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C9473F f28536Y;

    /* JADX INFO: renamed from: Z */
    public String f28537Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f28538o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C9473F f28539p0;

    /* JADX INFO: renamed from: q0 */
    public int f28540q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9481f(C9473F c9473f, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f28539p0 = c9473f;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f28538o0 = obj;
        this.f28540q0 |= Integer.MIN_VALUE;
        return this.f28539p0.m10003b(null, this);
    }
}
