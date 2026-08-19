package livekit.org.webrtc;

/* JADX INFO: loaded from: classes2.dex */
public interface VideoEncoder {

    public static class BitrateAllocation {
        public final int[][] bitratesBbs;

        public BitrateAllocation(int[][] iArr) {
            this.bitratesBbs = iArr;
        }

        public int getSum() {
            int i10 = 0;
            for (int[] iArr : this.bitratesBbs) {
                for (int i11 : iArr) {
                    i10 += i11;
                }
            }
            return i10;
        }
    }

    public interface Callback {
        void onEncodedFrame(EncodedImage encodedImage, CodecSpecificInfo codecSpecificInfo);
    }

    public static class Capabilities {
        public final boolean lossNotification;

        public Capabilities(boolean z6) {
            this.lossNotification = z6;
        }
    }

    public static class CodecSpecificInfo {
    }

    public static class CodecSpecificInfoAV1 extends CodecSpecificInfo {
    }

    public static class CodecSpecificInfoH264 extends CodecSpecificInfo {
    }

    public static class CodecSpecificInfoVP8 extends CodecSpecificInfo {
    }

    public static class CodecSpecificInfoVP9 extends CodecSpecificInfo {
    }

    public static class EncodeInfo {
        public final EncodedImage.FrameType[] frameTypes;

        public EncodeInfo(EncodedImage.FrameType[] frameTypeArr) {
            this.frameTypes = frameTypeArr;
        }
    }

    public static class EncoderInfo {
        public final boolean applyAlignmentToAllSimulcastLayers;
        public final int requestedResolutionAlignment;

        public EncoderInfo(int i10, boolean z6) {
            this.requestedResolutionAlignment = i10;
            this.applyAlignmentToAllSimulcastLayers = z6;
        }

        public boolean getApplyAlignmentToAllSimulcastLayers() {
            return this.applyAlignmentToAllSimulcastLayers;
        }

        public int getRequestedResolutionAlignment() {
            return this.requestedResolutionAlignment;
        }
    }

    public static class RateControlParameters {
        public final BitrateAllocation bitrate;
        public final double framerateFps;

        public RateControlParameters(BitrateAllocation bitrateAllocation, double d10) {
            this.bitrate = bitrateAllocation;
            this.framerateFps = d10;
        }
    }

    public static class ResolutionBitrateLimits {
        public final int frameSizePixels;
        public final int maxBitrateBps;
        public final int minBitrateBps;
        public final int minStartBitrateBps;

        public ResolutionBitrateLimits(int i10, int i11, int i12, int i13) {
            this.frameSizePixels = i10;
            this.minStartBitrateBps = i11;
            this.minBitrateBps = i12;
            this.maxBitrateBps = i13;
        }

        public int getFrameSizePixels() {
            return this.frameSizePixels;
        }

        public int getMaxBitrateBps() {
            return this.maxBitrateBps;
        }

        public int getMinBitrateBps() {
            return this.minBitrateBps;
        }

        public int getMinStartBitrateBps() {
            return this.minStartBitrateBps;
        }
    }

    public static class Settings {
        public final boolean automaticResizeOn;
        public final Capabilities capabilities;
        public final int height;
        public final int maxFramerate;
        public final int numberOfCores;
        public final int numberOfSimulcastStreams;
        public final int startBitrate;
        public final int width;

        @Deprecated
        public Settings(int i10, int i11, int i12, int i13, int i14, int i15, boolean z6) {
            this(i10, i11, i12, i13, i14, i15, z6, new Capabilities(false));
        }

        public Settings(int i10, int i11, int i12, int i13, int i14, int i15, boolean z6, Capabilities capabilities) {
            this.numberOfCores = i10;
            this.width = i11;
            this.height = i12;
            this.startBitrate = i13;
            this.maxFramerate = i14;
            this.numberOfSimulcastStreams = i15;
            this.automaticResizeOn = z6;
            this.capabilities = capabilities;
        }
    }

    long createNative(long j10);

    VideoCodecStatus encode(VideoFrame videoFrame, EncodeInfo encodeInfo);

    EncoderInfo getEncoderInfo();

    String getImplementationName();

    ResolutionBitrateLimits[] getResolutionBitrateLimits();

    ScalingSettings getScalingSettings();

    VideoCodecStatus initEncode(Settings settings, Callback callback);

    boolean isHardwareEncoder();

    VideoCodecStatus release();

    VideoCodecStatus setRateAllocation(BitrateAllocation bitrateAllocation, int i10);

    VideoCodecStatus setRates(RateControlParameters rateControlParameters);

    public static class ScalingSettings {
        public static final ScalingSettings OFF = new ScalingSettings();
        public final Integer high;
        public final Integer low;

        /* JADX INFO: renamed from: on */
        public final boolean f54472on;

        public ScalingSettings(int i10, int i11) {
            this.f54472on = true;
            this.low = Integer.valueOf(i10);
            this.high = Integer.valueOf(i11);
        }

        public String toString() {
            if (!this.f54472on) {
                return "OFF";
            }
            return "[ " + this.low + ", " + this.high + " ]";
        }

        private ScalingSettings() {
            this.f54472on = false;
            this.low = null;
            this.high = null;
        }

        @Deprecated
        public ScalingSettings(boolean z6) {
            this.f54472on = z6;
            this.low = null;
            this.high = null;
        }

        @Deprecated
        public ScalingSettings(boolean z6, int i10, int i11) {
            this.f54472on = z6;
            this.low = Integer.valueOf(i10);
            this.high = Integer.valueOf(i11);
        }
    }
}
