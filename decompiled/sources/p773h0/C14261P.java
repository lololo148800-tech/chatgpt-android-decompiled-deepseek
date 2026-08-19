package p773h0;

import p894n0.C17402h;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: h0.P */
/* JADX INFO: loaded from: classes.dex */
public final class C14261P extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C14265U f44752Y;

    /* JADX INFO: renamed from: Z */
    public C17402h f44753Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f44754o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C14265U f44755p0;

    /* JADX INFO: renamed from: q0 */
    public int f44756q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14261P(C14265U c14265u, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f44755p0 = c14265u;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f44754o0 = obj;
        this.f44756q0 |= Integer.MIN_VALUE;
        return C14265U.m15558K0(this.f44755p0, this);
    }
}
