package p273Kl;

import io.livekit.android.room.C15102a;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.org.webrtc.DataChannel;
import mm.C17296C;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: Kl.J */
/* JADX INFO: loaded from: classes3.dex */
public final class C4726J extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C15102a f15366Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4726J(C15102a c15102a) {
        super(1);
        this.f15366Y = c15102a;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        DataChannel dataChannel = (DataChannel) obj;
        AbstractC16544l.m18094g(dataChannel, "dataChannel");
        String strLabel = dataChannel.label();
        boolean zM18089b = AbstractC16544l.m18089b(strLabel, "_reliable");
        C15102a c15102a = this.f15366Y;
        if (!zM18089b) {
            if (AbstractC16544l.m18089b(strLabel, "_lossy")) {
                c15102a.f46963w = dataChannel;
            }
            return C17296C.f55119a;
        }
        c15102a.f46961u = dataChannel;
        dataChannel.registerObserver(new C4720G(c15102a, dataChannel));
        return C17296C.f55119a;
    }
}
