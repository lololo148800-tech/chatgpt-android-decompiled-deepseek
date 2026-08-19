package p349O0;

import p003A1.C0296v0;
import p049Bm.InterfaceC1436k;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: O0.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6004g0 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C0296v0 f19494Y;

    /* JADX INFO: renamed from: Z */
    public InterfaceC1436k f19495Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f19496o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C0296v0 f19497p0;

    /* JADX INFO: renamed from: q0 */
    public int f19498q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6004g0(C0296v0 c0296v0, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f19497p0 = c0296v0;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f19496o0 = obj;
        this.f19498q0 |= Integer.MIN_VALUE;
        return this.f19497p0.mo876v0(null, this);
    }
}
