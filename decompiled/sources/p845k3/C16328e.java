package p845k3;

import p049Bm.InterfaceC1439n;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: k3.e */
/* JADX INFO: loaded from: classes.dex */
public final class C16328e extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public InterfaceC1439n f50655Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f50656Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16329f f50657o0;

    /* JADX INFO: renamed from: p0 */
    public int f50658p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16328e(C16329f c16329f, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f50657o0 = c16329f;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f50656Z = obj;
        this.f50658p0 |= Integer.MIN_VALUE;
        return this.f50657o0.m17922d(null, null, null, null, this);
    }
}
