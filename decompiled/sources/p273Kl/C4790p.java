package p273Kl;

import livekit.org.webrtc.SessionDescription;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Kl.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C4790p extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public Object f15622Y;

    /* JADX INFO: renamed from: Z */
    public SessionDescription f15623Z;

    /* JADX INFO: renamed from: o0 */
    public SessionDescription f15624o0;

    /* JADX INFO: renamed from: p0 */
    public boolean f15625p0;

    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ Object f15626q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C4808y f15627r0;

    /* JADX INFO: renamed from: s0 */
    public int f15628s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4790p(C4808y c4808y, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f15627r0 = c4808y;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f15626q0 = obj;
        this.f15628s0 |= Integer.MIN_VALUE;
        return this.f15627r0.m5441e(null, null, false, this);
    }
}
