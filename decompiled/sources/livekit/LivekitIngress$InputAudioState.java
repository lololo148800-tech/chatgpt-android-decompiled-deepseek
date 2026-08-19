package livekit;

import com.google.protobuf.AbstractC12133Z;
import com.google.protobuf.AbstractC12138b;
import com.google.protobuf.AbstractC12171m;
import com.google.protobuf.AbstractC12186r;
import com.google.protobuf.C12087F;
import com.google.protobuf.C12123U;
import com.google.protobuf.EnumC12131Y;
import com.google.protobuf.InterfaceC12094H0;
import com.google.protobuf.InterfaceC12124U0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p793ho.C14878z1;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitIngress$InputAudioState extends AbstractC12133Z implements InterfaceC12094H0 {
    public static final int AVERAGE_BITRATE_FIELD_NUMBER = 2;
    public static final int CHANNELS_FIELD_NUMBER = 3;
    private static final LivekitIngress$InputAudioState DEFAULT_INSTANCE;
    public static final int MIME_TYPE_FIELD_NUMBER = 1;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int SAMPLE_RATE_FIELD_NUMBER = 4;
    private int averageBitrate_;
    private int channels_;
    private String mimeType_ = "";
    private int sampleRate_;

    static {
        LivekitIngress$InputAudioState livekitIngress$InputAudioState = new LivekitIngress$InputAudioState();
        DEFAULT_INSTANCE = livekitIngress$InputAudioState;
        AbstractC12133Z.registerDefaultInstance(LivekitIngress$InputAudioState.class, livekitIngress$InputAudioState);
    }

    private LivekitIngress$InputAudioState() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAverageBitrate() {
        this.averageBitrate_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChannels() {
        this.channels_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMimeType() {
        this.mimeType_ = getDefaultInstance().getMimeType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSampleRate() {
        this.sampleRate_ = 0;
    }

    public static LivekitIngress$InputAudioState getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14878z1 newBuilder() {
        return (C14878z1) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitIngress$InputAudioState parseDelimitedFrom(InputStream inputStream) {
        return (LivekitIngress$InputAudioState) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitIngress$InputAudioState parseFrom(ByteBuffer byteBuffer) {
        return (LivekitIngress$InputAudioState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAverageBitrate(int i10) {
        this.averageBitrate_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChannels(int i10) {
        this.channels_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMimeType(String str) {
        str.getClass();
        this.mimeType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMimeTypeBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.mimeType_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSampleRate(int i10) {
        this.sampleRate_ = i10;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u000b\u0003\u000b\u0004\u000b", new Object[]{"mimeType_", "averageBitrate_", "channels_", "sampleRate_"});
            case 3:
                return new LivekitIngress$InputAudioState();
            case 4:
                return new C14878z1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitIngress$InputAudioState.class) {
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

    public int getAverageBitrate() {
        return this.averageBitrate_;
    }

    public int getChannels() {
        return this.channels_;
    }

    public String getMimeType() {
        return this.mimeType_;
    }

    public AbstractC12171m getMimeTypeBytes() {
        return AbstractC12171m.m14011m(this.mimeType_);
    }

    public int getSampleRate() {
        return this.sampleRate_;
    }

    public static C14878z1 newBuilder(LivekitIngress$InputAudioState livekitIngress$InputAudioState) {
        return (C14878z1) DEFAULT_INSTANCE.createBuilder(livekitIngress$InputAudioState);
    }

    public static LivekitIngress$InputAudioState parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitIngress$InputAudioState) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitIngress$InputAudioState parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitIngress$InputAudioState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitIngress$InputAudioState parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitIngress$InputAudioState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitIngress$InputAudioState parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitIngress$InputAudioState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitIngress$InputAudioState parseFrom(byte[] bArr) {
        return (LivekitIngress$InputAudioState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitIngress$InputAudioState parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitIngress$InputAudioState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitIngress$InputAudioState parseFrom(InputStream inputStream) {
        return (LivekitIngress$InputAudioState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitIngress$InputAudioState parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitIngress$InputAudioState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitIngress$InputAudioState parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitIngress$InputAudioState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitIngress$InputAudioState parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitIngress$InputAudioState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
