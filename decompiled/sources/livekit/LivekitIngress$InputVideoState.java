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
import p793ho.C14543A1;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitIngress$InputVideoState extends AbstractC12133Z implements InterfaceC12094H0 {
    public static final int AVERAGE_BITRATE_FIELD_NUMBER = 2;
    private static final LivekitIngress$InputVideoState DEFAULT_INSTANCE;
    public static final int FRAMERATE_FIELD_NUMBER = 5;
    public static final int HEIGHT_FIELD_NUMBER = 4;
    public static final int MIME_TYPE_FIELD_NUMBER = 1;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int WIDTH_FIELD_NUMBER = 3;
    private int averageBitrate_;
    private double framerate_;
    private int height_;
    private String mimeType_ = "";
    private int width_;

    static {
        LivekitIngress$InputVideoState livekitIngress$InputVideoState = new LivekitIngress$InputVideoState();
        DEFAULT_INSTANCE = livekitIngress$InputVideoState;
        AbstractC12133Z.registerDefaultInstance(LivekitIngress$InputVideoState.class, livekitIngress$InputVideoState);
    }

    private LivekitIngress$InputVideoState() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAverageBitrate() {
        this.averageBitrate_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFramerate() {
        this.framerate_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeight() {
        this.height_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMimeType() {
        this.mimeType_ = getDefaultInstance().getMimeType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWidth() {
        this.width_ = 0;
    }

    public static LivekitIngress$InputVideoState getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14543A1 newBuilder() {
        return (C14543A1) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitIngress$InputVideoState parseDelimitedFrom(InputStream inputStream) {
        return (LivekitIngress$InputVideoState) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitIngress$InputVideoState parseFrom(ByteBuffer byteBuffer) {
        return (LivekitIngress$InputVideoState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAverageBitrate(int i10) {
        this.averageBitrate_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFramerate(double d10) {
        this.framerate_ = d10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeight(int i10) {
        this.height_ = i10;
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
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\u000b\u0003\u000b\u0004\u000b\u0005\u0000", new Object[]{"mimeType_", "averageBitrate_", "width_", "height_", "framerate_"});
            case 3:
                return new LivekitIngress$InputVideoState();
            case 4:
                return new C14543A1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitIngress$InputVideoState.class) {
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

    public double getFramerate() {
        return this.framerate_;
    }

    public int getHeight() {
        return this.height_;
    }

    public String getMimeType() {
        return this.mimeType_;
    }

    public AbstractC12171m getMimeTypeBytes() {
        return AbstractC12171m.m14011m(this.mimeType_);
    }

    public int getWidth() {
        return this.width_;
    }

    public static C14543A1 newBuilder(LivekitIngress$InputVideoState livekitIngress$InputVideoState) {
        return (C14543A1) DEFAULT_INSTANCE.createBuilder(livekitIngress$InputVideoState);
    }

    public static LivekitIngress$InputVideoState parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitIngress$InputVideoState) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitIngress$InputVideoState parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitIngress$InputVideoState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitIngress$InputVideoState parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitIngress$InputVideoState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitIngress$InputVideoState parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitIngress$InputVideoState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitIngress$InputVideoState parseFrom(byte[] bArr) {
        return (LivekitIngress$InputVideoState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitIngress$InputVideoState parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitIngress$InputVideoState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitIngress$InputVideoState parseFrom(InputStream inputStream) {
        return (LivekitIngress$InputVideoState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitIngress$InputVideoState parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitIngress$InputVideoState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitIngress$InputVideoState parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitIngress$InputVideoState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitIngress$InputVideoState parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitIngress$InputVideoState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
