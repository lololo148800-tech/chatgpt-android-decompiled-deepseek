package livekit;

import com.google.protobuf.AbstractC12133Z;
import com.google.protobuf.AbstractC12138b;
import com.google.protobuf.AbstractC12141c;
import com.google.protobuf.AbstractC12171m;
import com.google.protobuf.AbstractC12186r;
import com.google.protobuf.C12087F;
import com.google.protobuf.C12123U;
import com.google.protobuf.EnumC12131Y;
import com.google.protobuf.InterfaceC12094H0;
import com.google.protobuf.InterfaceC12124U0;
import com.google.protobuf.InterfaceC12172m0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p793ho.C14850v1;
import p793ho.EnumC14733e3;
import p793ho.InterfaceC14754h3;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitIngress$IngressVideoEncodingOptions extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitIngress$IngressVideoEncodingOptions DEFAULT_INSTANCE;
    public static final int FRAME_RATE_FIELD_NUMBER = 2;
    public static final int LAYERS_FIELD_NUMBER = 3;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int VIDEO_CODEC_FIELD_NUMBER = 1;
    private double frameRate_;
    private InterfaceC12172m0 layers_ = AbstractC12133Z.emptyProtobufList();
    private int videoCodec_;

    static {
        LivekitIngress$IngressVideoEncodingOptions livekitIngress$IngressVideoEncodingOptions = new LivekitIngress$IngressVideoEncodingOptions();
        DEFAULT_INSTANCE = livekitIngress$IngressVideoEncodingOptions;
        AbstractC12133Z.registerDefaultInstance(LivekitIngress$IngressVideoEncodingOptions.class, livekitIngress$IngressVideoEncodingOptions);
    }

    private LivekitIngress$IngressVideoEncodingOptions() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLayers(Iterable<? extends LivekitModels$VideoLayer> iterable) {
        ensureLayersIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.layers_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLayers(LivekitModels$VideoLayer livekitModels$VideoLayer) {
        livekitModels$VideoLayer.getClass();
        ensureLayersIsMutable();
        this.layers_.add(livekitModels$VideoLayer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFrameRate() {
        this.frameRate_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLayers() {
        this.layers_ = AbstractC12133Z.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVideoCodec() {
        this.videoCodec_ = 0;
    }

    private void ensureLayersIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.layers_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.layers_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    public static LivekitIngress$IngressVideoEncodingOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14850v1 newBuilder() {
        return (C14850v1) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitIngress$IngressVideoEncodingOptions parseDelimitedFrom(InputStream inputStream) {
        return (LivekitIngress$IngressVideoEncodingOptions) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitIngress$IngressVideoEncodingOptions parseFrom(ByteBuffer byteBuffer) {
        return (LivekitIngress$IngressVideoEncodingOptions) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLayers(int i10) {
        ensureLayersIsMutable();
        this.layers_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFrameRate(double d10) {
        this.frameRate_ = d10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLayers(int i10, LivekitModels$VideoLayer livekitModels$VideoLayer) {
        livekitModels$VideoLayer.getClass();
        ensureLayersIsMutable();
        this.layers_.set(i10, livekitModels$VideoLayer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoCodec(EnumC14733e3 enumC14733e3) {
        this.videoCodec_ = enumC14733e3.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoCodecValue(int i10) {
        this.videoCodec_ = i10;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\f\u0002\u0000\u0003\u001b", new Object[]{"videoCodec_", "frameRate_", "layers_", LivekitModels$VideoLayer.class});
            case 3:
                return new LivekitIngress$IngressVideoEncodingOptions();
            case 4:
                return new C14850v1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitIngress$IngressVideoEncodingOptions.class) {
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

    public double getFrameRate() {
        return this.frameRate_;
    }

    public LivekitModels$VideoLayer getLayers(int i10) {
        return (LivekitModels$VideoLayer) this.layers_.get(i10);
    }

    public int getLayersCount() {
        return this.layers_.size();
    }

    public List<LivekitModels$VideoLayer> getLayersList() {
        return this.layers_;
    }

    public InterfaceC14754h3 getLayersOrBuilder(int i10) {
        return (InterfaceC14754h3) this.layers_.get(i10);
    }

    public List<? extends InterfaceC14754h3> getLayersOrBuilderList() {
        return this.layers_;
    }

    public EnumC14733e3 getVideoCodec() {
        EnumC14733e3 enumC14733e3M16048a = EnumC14733e3.m16048a(this.videoCodec_);
        return enumC14733e3M16048a == null ? EnumC14733e3.UNRECOGNIZED : enumC14733e3M16048a;
    }

    public int getVideoCodecValue() {
        return this.videoCodec_;
    }

    public static C14850v1 newBuilder(LivekitIngress$IngressVideoEncodingOptions livekitIngress$IngressVideoEncodingOptions) {
        return (C14850v1) DEFAULT_INSTANCE.createBuilder(livekitIngress$IngressVideoEncodingOptions);
    }

    public static LivekitIngress$IngressVideoEncodingOptions parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitIngress$IngressVideoEncodingOptions) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitIngress$IngressVideoEncodingOptions parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitIngress$IngressVideoEncodingOptions) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitIngress$IngressVideoEncodingOptions parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitIngress$IngressVideoEncodingOptions) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLayers(int i10, LivekitModels$VideoLayer livekitModels$VideoLayer) {
        livekitModels$VideoLayer.getClass();
        ensureLayersIsMutable();
        this.layers_.add(i10, livekitModels$VideoLayer);
    }

    public static LivekitIngress$IngressVideoEncodingOptions parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitIngress$IngressVideoEncodingOptions) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitIngress$IngressVideoEncodingOptions parseFrom(byte[] bArr) {
        return (LivekitIngress$IngressVideoEncodingOptions) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitIngress$IngressVideoEncodingOptions parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitIngress$IngressVideoEncodingOptions) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitIngress$IngressVideoEncodingOptions parseFrom(InputStream inputStream) {
        return (LivekitIngress$IngressVideoEncodingOptions) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitIngress$IngressVideoEncodingOptions parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitIngress$IngressVideoEncodingOptions) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitIngress$IngressVideoEncodingOptions parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitIngress$IngressVideoEncodingOptions) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitIngress$IngressVideoEncodingOptions parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitIngress$IngressVideoEncodingOptions) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
