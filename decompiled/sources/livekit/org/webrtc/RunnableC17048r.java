package livekit.org.webrtc;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: livekit.org.webrtc.r */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC17048r implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f54509Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ ByteBuffer f54510Z;

    public /* synthetic */ RunnableC17048r(int i10, ByteBuffer byteBuffer) {
        this.f54509Y = i10;
        this.f54510Z = byteBuffer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f54509Y) {
            case 0:
                JniCommon.nativeFreeByteBuffer(this.f54510Z);
                break;
            default:
                JniCommon.nativeFreeByteBuffer(this.f54510Z);
                break;
        }
    }
}
