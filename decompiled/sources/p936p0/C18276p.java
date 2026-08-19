package p936p0;

import p049Bm.InterfaceC1439n;
import p773h0.EnumC14284g0;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: p0.p */
/* JADX INFO: loaded from: classes.dex */
public final class C18276p extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C18280t f58331Y;

    /* JADX INFO: renamed from: Z */
    public EnumC14284g0 f58332Z;

    /* JADX INFO: renamed from: o0 */
    public InterfaceC1439n f58333o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f58334p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C18280t f58335q0;

    /* JADX INFO: renamed from: r0 */
    public int f58336r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18276p(C18280t c18280t, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f58335q0 = c18280t;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f58334p0 = obj;
        this.f58336r0 |= Integer.MIN_VALUE;
        return this.f58335q0.mo5256b(null, null, this);
    }
}
