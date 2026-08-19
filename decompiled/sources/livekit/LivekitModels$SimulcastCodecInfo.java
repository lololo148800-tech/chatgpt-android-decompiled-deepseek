package livekit;

import com.google.protobuf.AbstractC12133Z;
import com.google.protobuf.AbstractC12138b;
import com.google.protobuf.AbstractC12141c;
import com.google.protobuf.AbstractC12171m;
import com.google.protobuf.AbstractC12186r;
import com.google.protobuf.C12087F;
import com.google.protobuf.C12123U;
import com.google.protobuf.EnumC12131Y;
import com.google.protobuf.InterfaceC12124U0;
import com.google.protobuf.InterfaceC12172m0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p793ho.C14633O2;
import p793ho.InterfaceC14639P2;
import p793ho.InterfaceC14754h3;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitModels$SimulcastCodecInfo extends AbstractC12133Z implements InterfaceC14639P2 {
    public static final int CID_FIELD_NUMBER = 3;
    private static final LivekitModels$SimulcastCodecInfo DEFAULT_INSTANCE;
    public static final int LAYERS_FIELD_NUMBER = 4;
    public static final int MID_FIELD_NUMBER = 2;
    public static final int MIME_TYPE_FIELD_NUMBER = 1;
    private static volatile InterfaceC12124U0 PARSER;
    private String mimeType_ = "";
    private String mid_ = "";
    private String cid_ = "";
    private InterfaceC12172m0 layers_ = AbstractC12133Z.emptyProtobufList();

    static {
        LivekitModels$SimulcastCodecInfo livekitModels$SimulcastCodecInfo = new LivekitModels$SimulcastCodecInfo();
        DEFAULT_INSTANCE = livekitModels$SimulcastCodecInfo;
        AbstractC12133Z.registerDefaultInstance(LivekitModels$SimulcastCodecInfo.class, livekitModels$SimulcastCodecInfo);
    }

    private LivekitModels$SimulcastCodecInfo() {
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
    public void clearCid() {
        this.cid_ = getDefaultInstance().getCid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLayers() {
        this.layers_ = AbstractC12133Z.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMid() {
        this.mid_ = getDefaultInstance().getMid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMimeType() {
        this.mimeType_ = getDefaultInstance().getMimeType();
    }

    private void ensureLayersIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.layers_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.layers_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    public static LivekitModels$SimulcastCodecInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14633O2 newBuilder() {
        return (C14633O2) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitModels$SimulcastCodecInfo parseDelimitedFrom(InputStream inputStream) {
        return (LivekitModels$SimulcastCodecInfo) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$SimulcastCodecInfo parseFrom(ByteBuffer byteBuffer) {
        return (LivekitModels$SimulcastCodecInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
    public void setCid(String str) {
        str.getClass();
        this.cid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCidBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.cid_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLayers(int i10, LivekitModels$VideoLayer livekitModels$VideoLayer) {
        livekitModels$VideoLayer.getClass();
        ensureLayersIsMutable();
        this.layers_.set(i10, livekitModels$VideoLayer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMid(String str) {
        str.getClass();
        this.mid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMidBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.mid_ = abstractC12171m.m14012w();
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

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u001b", new Object[]{"mimeType_", "mid_", "cid_", "layers_", LivekitModels$VideoLayer.class});
            case 3:
                return new LivekitModels$SimulcastCodecInfo();
            case 4:
                return new C14633O2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitModels$SimulcastCodecInfo.class) {
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

    public String getCid() {
        return this.cid_;
    }

    public AbstractC12171m getCidBytes() {
        return AbstractC12171m.m14011m(this.cid_);
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

    public String getMid() {
        return this.mid_;
    }

    public AbstractC12171m getMidBytes() {
        return AbstractC12171m.m14011m(this.mid_);
    }

    public String getMimeType() {
        return this.mimeType_;
    }

    public AbstractC12171m getMimeTypeBytes() {
        return AbstractC12171m.m14011m(this.mimeType_);
    }

    public static C14633O2 newBuilder(LivekitModels$SimulcastCodecInfo livekitModels$SimulcastCodecInfo) {
        return (C14633O2) DEFAULT_INSTANCE.createBuilder(livekitModels$SimulcastCodecInfo);
    }

    public static LivekitModels$SimulcastCodecInfo parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitModels$SimulcastCodecInfo) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitModels$SimulcastCodecInfo parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitModels$SimulcastCodecInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitModels$SimulcastCodecInfo parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitModels$SimulcastCodecInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLayers(int i10, LivekitModels$VideoLayer livekitModels$VideoLayer) {
        livekitModels$VideoLayer.getClass();
        ensureLayersIsMutable();
        this.layers_.add(i10, livekitModels$VideoLayer);
    }

    public static LivekitModels$SimulcastCodecInfo parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitModels$SimulcastCodecInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitModels$SimulcastCodecInfo parseFrom(byte[] bArr) {
        return (LivekitModels$SimulcastCodecInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitModels$SimulcastCodecInfo parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitModels$SimulcastCodecInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitModels$SimulcastCodecInfo parseFrom(InputStream inputStream) {
        return (LivekitModels$SimulcastCodecInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$SimulcastCodecInfo parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitModels$SimulcastCodecInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitModels$SimulcastCodecInfo parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitModels$SimulcastCodecInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitModels$SimulcastCodecInfo parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitModels$SimulcastCodecInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
