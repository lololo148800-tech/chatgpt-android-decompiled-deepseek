package p787he;

import p428Rd.InterfaceC6866e;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: he.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C14478g extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public Object f45607Y;

    /* JADX INFO: renamed from: Z */
    public String f45608Z;

    /* JADX INFO: renamed from: o0 */
    public InterfaceC6866e f45609o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f45610p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C14459O f45611q0;

    /* JADX INFO: renamed from: r0 */
    public int f45612r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14478g(C14459O c14459o, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f45611q0 = c14459o;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f45610p0 = obj;
        this.f45612r0 |= Integer.MIN_VALUE;
        return this.f45611q0.m15976e(null, null, this);
    }
}
