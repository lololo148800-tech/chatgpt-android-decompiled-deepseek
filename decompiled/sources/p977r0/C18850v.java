package p977r0;

import p049Bm.InterfaceC1439n;
import p773h0.EnumC14284g0;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: r0.v */
/* JADX INFO: loaded from: classes.dex */
public final class C18850v extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C18852x f60032Y;

    /* JADX INFO: renamed from: Z */
    public EnumC14284g0 f60033Z;

    /* JADX INFO: renamed from: o0 */
    public InterfaceC1439n f60034o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f60035p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C18852x f60036q0;

    /* JADX INFO: renamed from: r0 */
    public int f60037r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18850v(C18852x c18852x, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f60036q0 = c18852x;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f60035p0 = obj;
        this.f60037r0 |= Integer.MIN_VALUE;
        return this.f60036q0.mo5256b(null, null, this);
    }
}
