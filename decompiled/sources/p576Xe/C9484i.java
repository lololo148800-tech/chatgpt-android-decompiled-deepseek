package p576Xe;

import java.io.Serializable;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Xe.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C9484i extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C9473F f28552Y;

    /* JADX INFO: renamed from: Z */
    public Serializable f28553Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f28554o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C9473F f28555p0;

    /* JADX INFO: renamed from: q0 */
    public int f28556q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9484i(C9473F c9473f, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f28555p0 = c9473f;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f28554o0 = obj;
        this.f28556q0 |= Integer.MIN_VALUE;
        return this.f28555p0.m10006e(null, this);
    }
}
