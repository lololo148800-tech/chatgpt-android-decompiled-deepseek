package livekit;

import com.google.protobuf.AbstractC12133Z;
import com.google.protobuf.AbstractC12171m;
import com.google.protobuf.AbstractC12186r;
import com.google.protobuf.C12087F;
import com.google.protobuf.C12123U;
import com.google.protobuf.EnumC12131Y;
import com.google.protobuf.InterfaceC12124U0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p793ho.C14747g3;
import p793ho.EnumC14761i3;
import p793ho.InterfaceC14754h3;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitModels$VideoLayer extends AbstractC12133Z implements InterfaceC14754h3 {
    public static final int BITRATE_FIELD_NUMBER = 4;
    private static final LivekitModels$VideoLayer DEFAULT_INSTANCE;
    public static final int HEIGHT_FIELD_NUMBER = 3;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int QUALITY_FIELD_NUMBER = 1;
    public static final int SSRC_FIELD_NUMBER = 5;
    public static final int WIDTH_FIELD_NUMBER = 2;
    private int bitrate_;
    private int height_;
    private int quality_;
    private int ssrc_;
    private int width_;

    static {
        LivekitModels$VideoLayer livekitModels$VideoLayer = new LivekitModels$VideoLayer();
        DEFAULT_INSTANCE = livekitModels$VideoLayer;
        AbstractC12133Z.registerDefaultInstance(LivekitModels$VideoLayer.class, livekitModels$VideoLayer);
    }

    private LivekitModels$VideoLayer() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBitrate() {
        this.bitrate_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeight() {
        this.height_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuality() {
        this.quality_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSsrc() {
        this.ssrc_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWidth() {
        this.width_ = 0;
    }

    public static LivekitModels$VideoLayer getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14747g3 newBuilder() {
        return (C14747g3) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitModels$VideoLayer parseDelimitedFrom(InputStream inputStream) {
        return (LivekitModels$VideoLayer) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$VideoLayer parseFrom(ByteBuffer byteBuffer) {
        return (LivekitModels$VideoLayer) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBitrate(int i10) {
        this.bitrate_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeight(int i10) {
        this.height_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuality(EnumC14761i3 enumC14761i3) {
        this.quality_ = enumC14761i3.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQualityValue(int i10) {
        this.quality_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSsrc(int i10) {
        this.ssrc_ = i10;
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
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002\u000b\u0003\u000b\u0004\u000b\u0005\u000b", new Object[]{"quality_", "width_", "height_", "bitrate_", "ssrc_"});
            case 3:
                return new LivekitModels$VideoLayer();
            case 4:
                return new C14747g3(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitModels$VideoLayer.class) {
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

    public int getBitrate() {
        return this.bitrate_;
    }

    public int getHeight() {
        return this.height_;
    }

    public EnumC14761i3 getQuality() {
        EnumC14761i3 enumC14761i3M16050a = EnumC14761i3.m16050a(this.quality_);
        return enumC14761i3M16050a == null ? EnumC14761i3.UNRECOGNIZED : enumC14761i3M16050a;
    }

    public int getQualityValue() {
        return this.quality_;
    }

    public int getSsrc() {
        return this.ssrc_;
    }

    public int getWidth() {
        return this.width_;
    }

    public static C14747g3 newBuilder(LivekitModels$VideoLayer livekitModels$VideoLayer) {
        return (C14747g3) DEFAULT_INSTANCE.createBuilder(livekitModels$VideoLayer);
    }

    public static LivekitModels$VideoLayer parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitModels$VideoLayer) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitModels$VideoLayer parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitModels$VideoLayer) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitModels$VideoLayer parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitModels$VideoLayer) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitModels$VideoLayer parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitModels$VideoLayer) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitModels$VideoLayer parseFrom(byte[] bArr) {
        return (LivekitModels$VideoLayer) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitModels$VideoLayer parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitModels$VideoLayer) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitModels$VideoLayer parseFrom(InputStream inputStream) {
        return (LivekitModels$VideoLayer) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$VideoLayer parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitModels$VideoLayer) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitModels$VideoLayer parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitModels$VideoLayer) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitModels$VideoLayer parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitModels$VideoLayer) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
