package p628Zk;

import java.util.Iterator;
import p857kl.C16452T;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Zk.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C10414m extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C10416o f30866Y;

    /* JADX INFO: renamed from: Z */
    public C16452T f30867Z;

    /* JADX INFO: renamed from: o0 */
    public Iterator f30868o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f30869p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C10416o f30870q0;

    /* JADX INFO: renamed from: r0 */
    public int f30871r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10414m(C10416o c10416o, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f30870q0 = c10416o;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f30869p0 = obj;
        this.f30871r0 |= Integer.MIN_VALUE;
        return this.f30870q0.m10904k(null, this);
    }
}
