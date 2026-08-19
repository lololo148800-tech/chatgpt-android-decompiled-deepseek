package p273Kl;

import io.livekit.android.room.C15102a;
import livekit.LivekitModels$DataPacket;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Kl.o0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4789o0 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C15102a f15617Y;

    /* JADX INFO: renamed from: Z */
    public LivekitModels$DataPacket f15618Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f15619o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C15102a f15620p0;

    /* JADX INFO: renamed from: q0 */
    public int f15621q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4789o0(C15102a c15102a, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f15620p0 = c15102a;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f15619o0 = obj;
        this.f15621q0 |= Integer.MIN_VALUE;
        return this.f15620p0.m16218j(null, this);
    }
}
