package p320Mj;

import com.withpersona.sdk2.inquiry.internal.fallbackmode.C12869g;
import mo.AbstractC17325B;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Mj.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C5453f extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C12869g f17804Y;

    /* JADX INFO: renamed from: Z */
    public AbstractC17325B f17805Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f17806o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C12869g f17807p0;

    /* JADX INFO: renamed from: q0 */
    public int f17808q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5453f(C12869g c12869g, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f17807p0 = c12869g;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f17806o0 = obj;
        this.f17808q0 |= Integer.MIN_VALUE;
        return this.f17807p0.mo5906a(null, null, this);
    }
}
