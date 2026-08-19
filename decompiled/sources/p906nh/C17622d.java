package p906nh;

import java.io.Closeable;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: nh.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C17622d extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public Closeable f56388Y;

    /* JADX INFO: renamed from: Z */
    public Object f56389Z;

    /* JADX INFO: renamed from: o0 */
    public C17626h f56390o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f56391p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C17625g f56392q0;

    /* JADX INFO: renamed from: r0 */
    public int f56393r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17622d(C17625g c17625g, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f56392q0 = c17625g;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f56391p0 = obj;
        this.f56393r0 |= Integer.MIN_VALUE;
        return this.f56392q0.m19230e(this);
    }
}
