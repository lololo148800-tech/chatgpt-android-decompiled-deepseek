package p103Dn;

import p077Cn.InterfaceC1758z;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Dn.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C2170b extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public InterfaceC1758z f6651Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f6652Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C2172c f6653o0;

    /* JADX INFO: renamed from: p0 */
    public int f6654p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2170b(C2172c c2172c, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f6653o0 = c2172c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f6652Z = obj;
        this.f6654p0 |= Integer.MIN_VALUE;
        return this.f6653o0.mo3253g(null, this);
    }
}
