package p823j3;

import android.content.Context;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: j3.p */
/* JADX INFO: loaded from: classes.dex */
public final class C16094p extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C16095q f49853Y;

    /* JADX INFO: renamed from: Z */
    public Context f49854Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f49855o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C16095q f49856p0;

    /* JADX INFO: renamed from: q0 */
    public int f49857q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16094p(C16095q c16095q, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f49856p0 = c16095q;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f49855o0 = obj;
        this.f49857q0 |= Integer.MIN_VALUE;
        return this.f49856p0.m17651b(null, null, this);
    }
}
