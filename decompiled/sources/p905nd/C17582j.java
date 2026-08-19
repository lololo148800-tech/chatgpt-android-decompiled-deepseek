package p905nd;

import com.auth0.android.result.Credentials;
import ec.AbstractC13361c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: nd.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C17582j extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C17589q f56251Y;

    /* JADX INFO: renamed from: Z */
    public Credentials f56252Z;

    /* JADX INFO: renamed from: o0 */
    public AbstractC13361c f56253o0;

    /* JADX INFO: renamed from: p0 */
    public String f56254p0;

    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ Object f56255q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C17589q f56256r0;

    /* JADX INFO: renamed from: s0 */
    public int f56257s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17582j(C17589q c17589q, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f56256r0 = c17589q;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f56255q0 = obj;
        this.f56257s0 |= Integer.MIN_VALUE;
        return this.f56256r0.mo1085c(null, null, this);
    }
}
