package p120Ee;

import java.util.Iterator;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Ee.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C2421o extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C2423q f7524Y;

    /* JADX INFO: renamed from: Z */
    public Iterator f7525Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f7526o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C2423q f7527p0;

    /* JADX INFO: renamed from: q0 */
    public int f7528q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2421o(C2423q c2423q, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f7527p0 = c2423q;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f7526o0 = obj;
        this.f7528q0 |= Integer.MIN_VALUE;
        return C2423q.m3577b(this.f7527p0, null, this);
    }
}
