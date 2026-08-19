package p273Kl;

import io.livekit.android.room.C15102a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Kl.V */
/* JADX INFO: loaded from: classes3.dex */
public final class C4749V extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C15102a f15469Y;

    /* JADX INFO: renamed from: Z */
    public Object f15470Z;

    /* JADX INFO: renamed from: o0 */
    public long f15471o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f15472p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C15102a f15473q0;

    /* JADX INFO: renamed from: r0 */
    public int f15474r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4749V(C15102a c15102a, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f15473q0 = c15102a;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f15472p0 = obj;
        this.f15474r0 |= Integer.MIN_VALUE;
        return this.f15473q0.m16213e(null, this);
    }
}
