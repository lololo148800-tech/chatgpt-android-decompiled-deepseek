package p905nd;

import java.util.Map;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: nd.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C17581i extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public Object f56246Y;

    /* JADX INFO: renamed from: Z */
    public Map f56247Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f56248o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C17589q f56249p0;

    /* JADX INFO: renamed from: q0 */
    public int f56250q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17581i(C17589q c17589q, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f56249p0 = c17589q;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f56248o0 = obj;
        this.f56250q0 |= Integer.MIN_VALUE;
        return this.f56249p0.m19222h(null, null, null, null, this);
    }
}
