package p557Wl;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.org.webrtc.VideoCodecStatus;
import livekit.org.webrtc.VideoEncoder;
import livekit.org.webrtc.VideoFrame;
import p117Eb.CallableC2378h;
import p470T4.CallableC7240e;

/* JADX INFO: renamed from: Wl.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C8964t implements VideoEncoder {

    /* JADX INFO: renamed from: a */
    public final VideoEncoder f27396a;

    /* JADX INFO: renamed from: b */
    public final ExecutorService f27397b;

    /* JADX INFO: renamed from: c */
    public VideoEncoder.Settings f27398c;

    public C8964t(VideoEncoder videoEncoder) {
        this.f27396a = videoEncoder;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        AbstractC16544l.m18093f(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        this.f27397b = executorServiceNewSingleThreadExecutor;
    }

    @Override // livekit.org.webrtc.VideoEncoder
    public final long createNative(final long j10) throws ExecutionException, InterruptedException {
        Object obj = this.f27397b.submit(new Callable() { // from class: Wl.s
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C8964t this$0 = this.f27394a;
                AbstractC16544l.m18094g(this$0, "this$0");
                return Long.valueOf(this$0.f27396a.createNative(j10));
            }
        }).get();
        AbstractC16544l.m18093f(obj, "get(...)");
        return ((Number) obj).longValue();
    }

    @Override // livekit.org.webrtc.VideoEncoder
    public final VideoCodecStatus encode(VideoFrame frame, VideoEncoder.EncodeInfo encodeInfo) throws ExecutionException, InterruptedException {
        AbstractC16544l.m18094g(frame, "frame");
        Object obj = this.f27397b.submit(new CallableC7240e(this, frame, encodeInfo, 1)).get();
        AbstractC16544l.m18093f(obj, "get(...)");
        return (VideoCodecStatus) obj;
    }

    @Override // livekit.org.webrtc.VideoEncoder
    public final VideoEncoder.EncoderInfo getEncoderInfo() throws ExecutionException, InterruptedException {
        Object obj = this.f27397b.submit(new CallableC8961q(this, 3)).get();
        AbstractC16544l.m18093f(obj, "get(...)");
        return (VideoEncoder.EncoderInfo) obj;
    }

    @Override // livekit.org.webrtc.VideoEncoder
    public final String getImplementationName() throws ExecutionException, InterruptedException {
        Object obj = this.f27397b.submit(new CallableC8961q(this, 1)).get();
        AbstractC16544l.m18093f(obj, "get(...)");
        return (String) obj;
    }

    @Override // livekit.org.webrtc.VideoEncoder
    public final VideoEncoder.ResolutionBitrateLimits[] getResolutionBitrateLimits() throws ExecutionException, InterruptedException {
        Object obj = this.f27397b.submit(new CallableC8961q(this, 2)).get();
        AbstractC16544l.m18093f(obj, "get(...)");
        return (VideoEncoder.ResolutionBitrateLimits[]) obj;
    }

    @Override // livekit.org.webrtc.VideoEncoder
    public final VideoEncoder.ScalingSettings getScalingSettings() throws ExecutionException, InterruptedException {
        Object obj = this.f27397b.submit(new CallableC8961q(this, 0)).get();
        AbstractC16544l.m18093f(obj, "get(...)");
        return (VideoEncoder.ScalingSettings) obj;
    }

    @Override // livekit.org.webrtc.VideoEncoder
    public final VideoCodecStatus initEncode(VideoEncoder.Settings settings, VideoEncoder.Callback callback) throws ExecutionException, InterruptedException {
        AbstractC16544l.m18094g(settings, "settings");
        this.f27398c = settings;
        Object obj = this.f27397b.submit(new CallableC7240e(this, settings, callback, 2)).get();
        AbstractC16544l.m18093f(obj, "get(...)");
        return (VideoCodecStatus) obj;
    }

    @Override // livekit.org.webrtc.VideoEncoder
    public final boolean isHardwareEncoder() throws ExecutionException, InterruptedException {
        Object obj = this.f27397b.submit(new CallableC8961q(this, 4)).get();
        AbstractC16544l.m18093f(obj, "get(...)");
        return ((Boolean) obj).booleanValue();
    }

    @Override // livekit.org.webrtc.VideoEncoder
    public final VideoCodecStatus release() throws ExecutionException, InterruptedException {
        Object obj = this.f27397b.submit(new CallableC8961q(this, 5)).get();
        AbstractC16544l.m18093f(obj, "get(...)");
        return (VideoCodecStatus) obj;
    }

    @Override // livekit.org.webrtc.VideoEncoder
    public final VideoCodecStatus setRateAllocation(final VideoEncoder.BitrateAllocation bitrateAllocation, final int i10) throws ExecutionException, InterruptedException {
        Object obj = this.f27397b.submit(new Callable() { // from class: Wl.r
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C8964t this$0 = this.f27391a;
                AbstractC16544l.m18094g(this$0, "this$0");
                return this$0.f27396a.setRateAllocation(bitrateAllocation, i10);
            }
        }).get();
        AbstractC16544l.m18093f(obj, "get(...)");
        return (VideoCodecStatus) obj;
    }

    @Override // livekit.org.webrtc.VideoEncoder
    public final VideoCodecStatus setRates(VideoEncoder.RateControlParameters rateControlParameters) throws ExecutionException, InterruptedException {
        Object obj = this.f27397b.submit(new CallableC2378h(this, 2, rateControlParameters)).get();
        AbstractC16544l.m18093f(obj, "get(...)");
        return (VideoCodecStatus) obj;
    }
}
