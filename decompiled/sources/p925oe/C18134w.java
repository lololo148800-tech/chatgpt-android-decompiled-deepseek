package p925oe;

import p403Qd.C6636i;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: oe.w */
/* JADX INFO: loaded from: classes3.dex */
public final class C18134w extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public Object f57858Y;

    /* JADX INFO: renamed from: Z */
    public C6636i f57859Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f57860o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C18077B f57861p0;

    /* JADX INFO: renamed from: q0 */
    public int f57862q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18134w(C18077B c18077b, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f57861p0 = c18077b;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f57860o0 = obj;
        this.f57862q0 |= Integer.MIN_VALUE;
        return this.f57861p0.m19700e(null, this);
    }
}
