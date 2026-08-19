package p925oe;

import java.util.List;
import p324Mn.C5551u;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: oe.E */
/* JADX INFO: loaded from: classes3.dex */
public final class C18080E extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C18086K f57667Y;

    /* JADX INFO: renamed from: Z */
    public List f57668Z;

    /* JADX INFO: renamed from: o0 */
    public C5551u f57669o0;

    /* JADX INFO: renamed from: p0 */
    public Object f57670p0;

    /* JADX INFO: renamed from: q0 */
    public int f57671q0;

    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ Object f57672r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C18086K f57673s0;

    /* JADX INFO: renamed from: t0 */
    public int f57674t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18080E(C18086K c18086k, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f57673s0 = c18086k;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f57672r0 = obj;
        this.f57674t0 |= Integer.MIN_VALUE;
        return this.f57673s0.m19706b(this);
    }
}
