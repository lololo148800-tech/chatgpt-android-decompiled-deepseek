package livekit.org.webrtc;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class EncodedImage implements RefCounted {
    public final ByteBuffer buffer;
    public final long captureTimeMs;
    public final long captureTimeNs;
    public final int encodedHeight;
    public final int encodedWidth;
    public final FrameType frameType;

    /* JADX INFO: renamed from: qp */
    public final Integer f54463qp;
    private final RefCountDelegate refCountDelegate;
    public final int rotation;

    public static class Builder {
        private ByteBuffer buffer;
        private long captureTimeNs;
        private int encodedHeight;
        private int encodedWidth;
        private FrameType frameType;

        /* JADX INFO: renamed from: qp */
        private Integer f54464qp;
        private Runnable releaseCallback;
        private int rotation;

        public /* synthetic */ Builder(int i10) {
            this();
        }

        public EncodedImage createEncodedImage() {
            return new EncodedImage(this.buffer, this.releaseCallback, this.encodedWidth, this.encodedHeight, this.captureTimeNs, this.frameType, this.rotation, this.f54464qp, 0);
        }

        public Builder setBuffer(ByteBuffer byteBuffer, Runnable runnable) {
            this.buffer = byteBuffer;
            this.releaseCallback = runnable;
            return this;
        }

        @Deprecated
        public Builder setCaptureTimeMs(long j10) {
            this.captureTimeNs = TimeUnit.MILLISECONDS.toNanos(j10);
            return this;
        }

        public Builder setCaptureTimeNs(long j10) {
            this.captureTimeNs = j10;
            return this;
        }

        public Builder setEncodedHeight(int i10) {
            this.encodedHeight = i10;
            return this;
        }

        public Builder setEncodedWidth(int i10) {
            this.encodedWidth = i10;
            return this;
        }

        public Builder setFrameType(FrameType frameType) {
            this.frameType = frameType;
            return this;
        }

        public Builder setQp(Integer num) {
            this.f54464qp = num;
            return this;
        }

        public Builder setRotation(int i10) {
            this.rotation = i10;
            return this;
        }

        private Builder() {
        }
    }

    public enum FrameType {
        EmptyFrame(0),
        VideoFrameKey(3),
        VideoFrameDelta(4);

        private final int nativeIndex;

        FrameType(int i10) {
            this.nativeIndex = i10;
        }

        public static FrameType fromNativeIndex(int i10) {
            for (FrameType frameType : values()) {
                if (frameType.getNative() == i10) {
                    return frameType;
                }
            }
            throw new IllegalArgumentException(AbstractC10763a.m11048f(i10, "Unknown native frame type: "));
        }

        public int getNative() {
            return this.nativeIndex;
        }
    }

    public /* synthetic */ EncodedImage(ByteBuffer byteBuffer, Runnable runnable, int i10, int i11, long j10, FrameType frameType, int i12, Integer num, int i13) {
        this(byteBuffer, runnable, i10, i11, j10, frameType, i12, num);
    }

    public static Builder builder() {
        return new Builder(0);
    }

    private ByteBuffer getBuffer() {
        return this.buffer;
    }

    private long getCaptureTimeNs() {
        return this.captureTimeNs;
    }

    private int getEncodedHeight() {
        return this.encodedHeight;
    }

    private int getEncodedWidth() {
        return this.encodedWidth;
    }

    private int getFrameType() {
        return this.frameType.getNative();
    }

    private Integer getQp() {
        return this.f54463qp;
    }

    private int getRotation() {
        return this.rotation;
    }

    @Override // livekit.org.webrtc.RefCounted
    public void release() {
        this.refCountDelegate.release();
    }

    @Override // livekit.org.webrtc.RefCounted
    public void retain() {
        this.refCountDelegate.retain();
    }

    private EncodedImage(ByteBuffer byteBuffer, Runnable runnable, int i10, int i11, long j10, FrameType frameType, int i12, Integer num) {
        this.buffer = byteBuffer;
        this.encodedWidth = i10;
        this.encodedHeight = i11;
        this.captureTimeMs = TimeUnit.NANOSECONDS.toMillis(j10);
        this.captureTimeNs = j10;
        this.frameType = frameType;
        this.rotation = i12;
        this.f54463qp = num;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }
}
