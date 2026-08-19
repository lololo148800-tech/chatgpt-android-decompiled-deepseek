package p432Rh;

import p049Bm.InterfaceC1436k;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Rh.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C6891d extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public Throwable f22089Y;

    /* JADX INFO: renamed from: Z */
    public InterfaceC1436k f22090Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f22091o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C6892e f22092p0;

    /* JADX INFO: renamed from: q0 */
    public int f22093q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6891d(C6892e c6892e, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f22092p0 = c6892e;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f22091o0 = obj;
        this.f22093q0 |= Integer.MIN_VALUE;
        return this.f22092p0.m7287b(null, null, this);
    }
}
