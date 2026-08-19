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
import p793ho.C14623M4;
import p793ho.InterfaceC14754h3;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class LivekitRtc$UpdateVideoLayers extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitRtc$UpdateVideoLayers DEFAULT_INSTANCE;
    public static final int LAYERS_FIELD_NUMBER = 2;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int TRACK_SID_FIELD_NUMBER = 1;
    private String trackSid_ = "";
    private InterfaceC12172m0 layers_ = AbstractC12133Z.emptyProtobufList();

    static {
        LivekitRtc$UpdateVideoLayers livekitRtc$UpdateVideoLayers = new LivekitRtc$UpdateVideoLayers();
        DEFAULT_INSTANCE = livekitRtc$UpdateVideoLayers;
        AbstractC12133Z.registerDefaultInstance(LivekitRtc$UpdateVideoLayers.class, livekitRtc$UpdateVideoLayers);
    }

    private LivekitRtc$UpdateVideoLayers() {
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
    public void clearLayers() {
        this.layers_ = AbstractC12133Z.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackSid() {
        this.trackSid_ = getDefaultInstance().getTrackSid();
    }

    private void ensureLayersIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.layers_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.layers_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    public static LivekitRtc$UpdateVideoLayers getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14623M4 newBuilder() {
        return (C14623M4) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$UpdateVideoLayers parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$UpdateVideoLayers) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$UpdateVideoLayers parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$UpdateVideoLayers) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
    public void setLayers(int i10, LivekitModels$VideoLayer livekitModels$VideoLayer) {
        livekitModels$VideoLayer.getClass();
        ensureLayersIsMutable();
        this.layers_.set(i10, livekitModels$VideoLayer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackSid(String str) {
        str.getClass();
        this.trackSid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackSidBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.trackSid_ = abstractC12171m.m14012w();
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"trackSid_", "layers_", LivekitModels$VideoLayer.class});
            case 3:
                return new LivekitRtc$UpdateVideoLayers();
            case 4:
                return new C14623M4(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitRtc$UpdateVideoLayers.class) {
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

    public String getTrackSid() {
        return this.trackSid_;
    }

    public AbstractC12171m getTrackSidBytes() {
        return AbstractC12171m.m14011m(this.trackSid_);
    }

    public static C14623M4 newBuilder(LivekitRtc$UpdateVideoLayers livekitRtc$UpdateVideoLayers) {
        return (C14623M4) DEFAULT_INSTANCE.createBuilder(livekitRtc$UpdateVideoLayers);
    }

    public static LivekitRtc$UpdateVideoLayers parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$UpdateVideoLayers) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$UpdateVideoLayers parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitRtc$UpdateVideoLayers) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitRtc$UpdateVideoLayers parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitRtc$UpdateVideoLayers) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLayers(int i10, LivekitModels$VideoLayer livekitModels$VideoLayer) {
        livekitModels$VideoLayer.getClass();
        ensureLayersIsMutable();
        this.layers_.add(i10, livekitModels$VideoLayer);
    }

    public static LivekitRtc$UpdateVideoLayers parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitRtc$UpdateVideoLayers) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitRtc$UpdateVideoLayers parseFrom(byte[] bArr) {
        return (LivekitRtc$UpdateVideoLayers) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$UpdateVideoLayers parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitRtc$UpdateVideoLayers) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitRtc$UpdateVideoLayers parseFrom(InputStream inputStream) {
        return (LivekitRtc$UpdateVideoLayers) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$UpdateVideoLayers parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$UpdateVideoLayers) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$UpdateVideoLayers parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitRtc$UpdateVideoLayers) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitRtc$UpdateVideoLayers parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitRtc$UpdateVideoLayers) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
