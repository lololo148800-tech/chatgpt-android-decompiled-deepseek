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
import p793ho.C14787m1;
import p793ho.EnumC14673V1;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitIngress$IngressAudioEncodingOptions extends AbstractC12133Z implements InterfaceC12094H0 {
    public static final int AUDIO_CODEC_FIELD_NUMBER = 1;
    public static final int BITRATE_FIELD_NUMBER = 2;
    public static final int CHANNELS_FIELD_NUMBER = 4;
    private static final LivekitIngress$IngressAudioEncodingOptions DEFAULT_INSTANCE;
    public static final int DISABLE_DTX_FIELD_NUMBER = 3;
    private static volatile InterfaceC12124U0 PARSER;
    private int audioCodec_;
    private int bitrate_;
    private int channels_;
    private boolean disableDtx_;

    static {
        LivekitIngress$IngressAudioEncodingOptions livekitIngress$IngressAudioEncodingOptions = new LivekitIngress$IngressAudioEncodingOptions();
        DEFAULT_INSTANCE = livekitIngress$IngressAudioEncodingOptions;
        AbstractC12133Z.registerDefaultInstance(LivekitIngress$IngressAudioEncodingOptions.class, livekitIngress$IngressAudioEncodingOptions);
    }

    private LivekitIngress$IngressAudioEncodingOptions() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAudioCodec() {
        this.audioCodec_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBitrate() {
        this.bitrate_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChannels() {
        this.channels_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisableDtx() {
        this.disableDtx_ = false;
    }

    public static LivekitIngress$IngressAudioEncodingOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14787m1 newBuilder() {
        return (C14787m1) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitIngress$IngressAudioEncodingOptions parseDelimitedFrom(InputStream inputStream) {
        return (LivekitIngress$IngressAudioEncodingOptions) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitIngress$IngressAudioEncodingOptions parseFrom(ByteBuffer byteBuffer) {
        return (LivekitIngress$IngressAudioEncodingOptions) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
    public void setBitrate(int i10) {
        this.bitrate_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChannels(int i10) {
        this.channels_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisableDtx(boolean z6) {
        this.disableDtx_ = z6;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002\u000b\u0003\u0007\u0004\u000b", new Object[]{"audioCodec_", "bitrate_", "disableDtx_", "channels_"});
            case 3:
                return new LivekitIngress$IngressAudioEncodingOptions();
            case 4:
                return new C14787m1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitIngress$IngressAudioEncodingOptions.class) {
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

    public EnumC14673V1 getAudioCodec() {
        EnumC14673V1 enumC14673V1M16043a = EnumC14673V1.m16043a(this.audioCodec_);
        return enumC14673V1M16043a == null ? EnumC14673V1.UNRECOGNIZED : enumC14673V1M16043a;
    }

    public int getAudioCodecValue() {
        return this.audioCodec_;
    }

    public int getBitrate() {
        return this.bitrate_;
    }

    public int getChannels() {
        return this.channels_;
    }

    public boolean getDisableDtx() {
        return this.disableDtx_;
    }

    public static C14787m1 newBuilder(LivekitIngress$IngressAudioEncodingOptions livekitIngress$IngressAudioEncodingOptions) {
        return (C14787m1) DEFAULT_INSTANCE.createBuilder(livekitIngress$IngressAudioEncodingOptions);
    }

    public static LivekitIngress$IngressAudioEncodingOptions parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitIngress$IngressAudioEncodingOptions) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitIngress$IngressAudioEncodingOptions parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitIngress$IngressAudioEncodingOptions) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitIngress$IngressAudioEncodingOptions parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitIngress$IngressAudioEncodingOptions) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitIngress$IngressAudioEncodingOptions parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitIngress$IngressAudioEncodingOptions) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitIngress$IngressAudioEncodingOptions parseFrom(byte[] bArr) {
        return (LivekitIngress$IngressAudioEncodingOptions) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitIngress$IngressAudioEncodingOptions parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitIngress$IngressAudioEncodingOptions) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitIngress$IngressAudioEncodingOptions parseFrom(InputStream inputStream) {
        return (LivekitIngress$IngressAudioEncodingOptions) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitIngress$IngressAudioEncodingOptions parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitIngress$IngressAudioEncodingOptions) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitIngress$IngressAudioEncodingOptions parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitIngress$IngressAudioEncodingOptions) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitIngress$IngressAudioEncodingOptions parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitIngress$IngressAudioEncodingOptions) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
