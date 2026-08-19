package livekit;

import com.google.protobuf.AbstractC12133Z;
import com.google.protobuf.AbstractC12171m;
import com.google.protobuf.AbstractC12186r;
import com.google.protobuf.C12087F;
import com.google.protobuf.C12123U;
import com.google.protobuf.EnumC12131Y;
import com.google.protobuf.InterfaceC12094H0;
import com.google.protobuf.InterfaceC12124U0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p793ho.C14814q0;
import p793ho.EnumC14673V1;
import p793ho.EnumC14733e3;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitEgress$EncodingOptions extends AbstractC12133Z implements InterfaceC12094H0 {
    public static final int AUDIO_BITRATE_FIELD_NUMBER = 6;
    public static final int AUDIO_CODEC_FIELD_NUMBER = 5;
    public static final int AUDIO_FREQUENCY_FIELD_NUMBER = 7;
    public static final int AUDIO_QUALITY_FIELD_NUMBER = 11;
    private static final LivekitEgress$EncodingOptions DEFAULT_INSTANCE;
    public static final int DEPTH_FIELD_NUMBER = 3;
    public static final int FRAMERATE_FIELD_NUMBER = 4;
    public static final int HEIGHT_FIELD_NUMBER = 2;
    public static final int KEY_FRAME_INTERVAL_FIELD_NUMBER = 10;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int VIDEO_BITRATE_FIELD_NUMBER = 9;
    public static final int VIDEO_CODEC_FIELD_NUMBER = 8;
    public static final int VIDEO_QUALITY_FIELD_NUMBER = 12;
    public static final int WIDTH_FIELD_NUMBER = 1;
    private int audioBitrate_;
    private int audioCodec_;
    private int audioFrequency_;
    private int audioQuality_;
    private int depth_;
    private int framerate_;
    private int height_;
    private double keyFrameInterval_;
    private int videoBitrate_;
    private int videoCodec_;
    private int videoQuality_;
    private int width_;

    static {
        LivekitEgress$EncodingOptions livekitEgress$EncodingOptions = new LivekitEgress$EncodingOptions();
        DEFAULT_INSTANCE = livekitEgress$EncodingOptions;
        AbstractC12133Z.registerDefaultInstance(LivekitEgress$EncodingOptions.class, livekitEgress$EncodingOptions);
    }

    private LivekitEgress$EncodingOptions() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAudioBitrate() {
        this.audioBitrate_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAudioCodec() {
        this.audioCodec_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAudioFrequency() {
        this.audioFrequency_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAudioQuality() {
        this.audioQuality_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDepth() {
        this.depth_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFramerate() {
        this.framerate_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeight() {
        this.height_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKeyFrameInterval() {
        this.keyFrameInterval_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVideoBitrate() {
        this.videoBitrate_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVideoCodec() {
        this.videoCodec_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVideoQuality() {
        this.videoQuality_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWidth() {
        this.width_ = 0;
    }

    public static LivekitEgress$EncodingOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14814q0 newBuilder() {
        return (C14814q0) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitEgress$EncodingOptions parseDelimitedFrom(InputStream inputStream) {
        return (LivekitEgress$EncodingOptions) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$EncodingOptions parseFrom(ByteBuffer byteBuffer) {
        return (LivekitEgress$EncodingOptions) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAudioBitrate(int i10) {
        this.audioBitrate_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAudioCodec(EnumC14673V1 enumC14673V1) {
        this.audioCodec_ = enumC14673V1.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAudioCodecValue(int i10) {
        this.audioCodec_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAudioFrequency(int i10) {
        this.audioFrequency_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAudioQuality(int i10) {
        this.audioQuality_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDepth(int i10) {
        this.depth_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFramerate(int i10) {
        this.framerate_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeight(int i10) {
        this.height_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyFrameInterval(double d10) {
        this.keyFrameInterval_ = d10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoBitrate(int i10) {
        this.videoBitrate_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoCodec(EnumC14733e3 enumC14733e3) {
        this.videoCodec_ = enumC14733e3.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoCodecValue(int i10) {
        this.videoCodec_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoQuality(int i10) {
        this.videoQuality_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWidth(int i10) {
        this.width_ = i10;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0000\u0001\f\f\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004\u0005\f\u0006\u0004\u0007\u0004\b\f\t\u0004\n\u0000\u000b\u0004\f\u0004", new Object[]{"width_", "height_", "depth_", "framerate_", "audioCodec_", "audioBitrate_", "audioFrequency_", "videoCodec_", "videoBitrate_", "keyFrameInterval_", "audioQuality_", "videoQuality_"});
            case 3:
                return new LivekitEgress$EncodingOptions();
            case 4:
                return new C14814q0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitEgress$EncodingOptions.class) {
                        try {
                            c12123u = PARSER;
                            if (c12123u == null) {
                                c12123u = new C12123U();
                                PARSER = c12123u;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                }
                return c12123u;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public int getAudioBitrate() {
        return this.audioBitrate_;
    }

    public EnumC14673V1 getAudioCodec() {
        EnumC14673V1 enumC14673V1M16043a = EnumC14673V1.m16043a(this.audioCodec_);
        return enumC14673V1M16043a == null ? EnumC14673V1.UNRECOGNIZED : enumC14673V1M16043a;
    }

    public int getAudioCodecValue() {
        return this.audioCodec_;
    }

    public int getAudioFrequency() {
        return this.audioFrequency_;
    }

    public int getAudioQuality() {
        return this.audioQuality_;
    }

    public int getDepth() {
        return this.depth_;
    }

    public int getFramerate() {
        return this.framerate_;
    }

    public int getHeight() {
        return this.height_;
    }

    public double getKeyFrameInterval() {
        return this.keyFrameInterval_;
    }

    public int getVideoBitrate() {
        return this.videoBitrate_;
    }

    public EnumC14733e3 getVideoCodec() {
        EnumC14733e3 enumC14733e3M16048a = EnumC14733e3.m16048a(this.videoCodec_);
        return enumC14733e3M16048a == null ? EnumC14733e3.UNRECOGNIZED : enumC14733e3M16048a;
    }

    public int getVideoCodecValue() {
        return this.videoCodec_;
    }

    public int getVideoQuality() {
        return this.videoQuality_;
    }

    public int getWidth() {
        return this.width_;
    }

    public static C14814q0 newBuilder(LivekitEgress$EncodingOptions livekitEgress$EncodingOptions) {
        return (C14814q0) DEFAULT_INSTANCE.createBuilder(livekitEgress$EncodingOptions);
    }

    public static LivekitEgress$EncodingOptions parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitEgress$EncodingOptions) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitEgress$EncodingOptions parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitEgress$EncodingOptions) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitEgress$EncodingOptions parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitEgress$EncodingOptions) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitEgress$EncodingOptions parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitEgress$EncodingOptions) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitEgress$EncodingOptions parseFrom(byte[] bArr) {
        return (LivekitEgress$EncodingOptions) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitEgress$EncodingOptions parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitEgress$EncodingOptions) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitEgress$EncodingOptions parseFrom(InputStream inputStream) {
        return (LivekitEgress$EncodingOptions) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$EncodingOptions parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitEgress$EncodingOptions) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitEgress$EncodingOptions parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitEgress$EncodingOptions) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitEgress$EncodingOptions parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitEgress$EncodingOptions) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
