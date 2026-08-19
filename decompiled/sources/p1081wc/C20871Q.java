package p1081wc;

import p985r9.C18903m;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: wc.Q */
/* JADX INFO: loaded from: classes3.dex */
public final class C20871Q extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C20873T f66441Y;

    /* JADX INFO: renamed from: Z */
    public C18903m f66442Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f66443o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C20873T f66444p0;

    /* JADX INFO: renamed from: q0 */
    public int f66445q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20871Q(C20873T c20873t, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f66444p0 = c20873t;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f66443o0 = obj;
        this.f66445q0 |= Integer.MIN_VALUE;
        return this.f66444p0.mo4158a(this);
    }
}
