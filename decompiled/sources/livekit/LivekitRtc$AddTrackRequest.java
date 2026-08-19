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
import p793ho.C14573E3;
import p793ho.EnumC14686X2;
import p793ho.EnumC14692Y2;
import p793ho.EnumC14781l2;
import p793ho.InterfaceC14754h3;
import p793ho.InterfaceC14776k4;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitRtc$AddTrackRequest extends AbstractC12133Z implements InterfaceC12094H0 {
    public static final int CID_FIELD_NUMBER = 1;
    private static final LivekitRtc$AddTrackRequest DEFAULT_INSTANCE;
    public static final int DISABLE_DTX_FIELD_NUMBER = 7;
    public static final int DISABLE_RED_FIELD_NUMBER = 13;
    public static final int ENCRYPTION_FIELD_NUMBER = 14;
    public static final int HEIGHT_FIELD_NUMBER = 5;
    public static final int LAYERS_FIELD_NUMBER = 9;
    public static final int MUTED_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int SID_FIELD_NUMBER = 11;
    public static final int SIMULCAST_CODECS_FIELD_NUMBER = 10;
    public static final int SOURCE_FIELD_NUMBER = 8;
    public static final int STEREO_FIELD_NUMBER = 12;
    public static final int STREAM_FIELD_NUMBER = 15;
    public static final int TYPE_FIELD_NUMBER = 3;
    public static final int WIDTH_FIELD_NUMBER = 4;
    private boolean disableDtx_;
    private boolean disableRed_;
    private int encryption_;
    private int height_;
    private boolean muted_;
    private int source_;
    private boolean stereo_;
    private int type_;
    private int width_;
    private String cid_ = "";
    private String name_ = "";
    private InterfaceC12172m0 layers_ = AbstractC12133Z.emptyProtobufList();
    private InterfaceC12172m0 simulcastCodecs_ = AbstractC12133Z.emptyProtobufList();
    private String sid_ = "";
    private String stream_ = "";

    static {
        LivekitRtc$AddTrackRequest livekitRtc$AddTrackRequest = new LivekitRtc$AddTrackRequest();
        DEFAULT_INSTANCE = livekitRtc$AddTrackRequest;
        AbstractC12133Z.registerDefaultInstance(LivekitRtc$AddTrackRequest.class, livekitRtc$AddTrackRequest);
    }

    private LivekitRtc$AddTrackRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLayers(Iterable<? extends LivekitModels$VideoLayer> iterable) {
        ensureLayersIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.layers_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSimulcastCodecs(Iterable<? extends LivekitRtc$SimulcastCodec> iterable) {
        ensureSimulcastCodecsIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.simulcastCodecs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLayers(LivekitModels$VideoLayer livekitModels$VideoLayer) {
        livekitModels$VideoLayer.getClass();
        ensureLayersIsMutable();
        this.layers_.add(livekitModels$VideoLayer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSimulcastCodecs(LivekitRtc$SimulcastCodec livekitRtc$SimulcastCodec) {
        livekitRtc$SimulcastCodec.getClass();
        ensureSimulcastCodecsIsMutable();
        this.simulcastCodecs_.add(livekitRtc$SimulcastCodec);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCid() {
        this.cid_ = getDefaultInstance().getCid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisableDtx() {
        this.disableDtx_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisableRed() {
        this.disableRed_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEncryption() {
        this.encryption_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeight() {
        this.height_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLayers() {
        this.layers_ = AbstractC12133Z.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMuted() {
        this.muted_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSid() {
        this.sid_ = getDefaultInstance().getSid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSimulcastCodecs() {
        this.simulcastCodecs_ = AbstractC12133Z.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSource() {
        this.source_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStereo() {
        this.stereo_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStream() {
        this.stream_ = getDefaultInstance().getStream();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWidth() {
        this.width_ = 0;
    }

    private void ensureLayersIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.layers_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.layers_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    private void ensureSimulcastCodecsIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.simulcastCodecs_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.simulcastCodecs_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    public static LivekitRtc$AddTrackRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14573E3 newBuilder() {
        return (C14573E3) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$AddTrackRequest parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$AddTrackRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$AddTrackRequest parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$AddTrackRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
    public void removeSimulcastCodecs(int i10) {
        ensureSimulcastCodecsIsMutable();
        this.simulcastCodecs_.remove(i10);
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
    public void setDisableDtx(boolean z6) {
        this.disableDtx_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisableRed(boolean z6) {
        this.disableRed_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEncryption(EnumC14781l2 enumC14781l2) {
        this.encryption_ = enumC14781l2.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEncryptionValue(int i10) {
        this.encryption_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeight(int i10) {
        this.height_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLayers(int i10, LivekitModels$VideoLayer livekitModels$VideoLayer) {
        livekitModels$VideoLayer.getClass();
        ensureLayersIsMutable();
        this.layers_.set(i10, livekitModels$VideoLayer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMuted(boolean z6) {
        this.muted_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.name_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSid(String str) {
        str.getClass();
        this.sid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSidBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.sid_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSimulcastCodecs(int i10, LivekitRtc$SimulcastCodec livekitRtc$SimulcastCodec) {
        livekitRtc$SimulcastCodec.getClass();
        ensureSimulcastCodecsIsMutable();
        this.simulcastCodecs_.set(i10, livekitRtc$SimulcastCodec);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSource(EnumC14686X2 enumC14686X2) {
        this.source_ = enumC14686X2.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceValue(int i10) {
        this.source_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStereo(boolean z6) {
        this.stereo_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStream(String str) {
        str.getClass();
        this.stream_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStreamBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.stream_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(EnumC14692Y2 enumC14692Y2) {
        this.type_ = enumC14692Y2.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i10) {
        this.type_ = i10;
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
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000f\u0000\u0000\u0001\u000f\u000f\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003\f\u0004\u000b\u0005\u000b\u0006\u0007\u0007\u0007\b\f\t\u001b\n\u001b\u000bȈ\f\u0007\r\u0007\u000e\f\u000fȈ", new Object[]{"cid_", "name_", "type_", "width_", "height_", "muted_", "disableDtx_", "source_", "layers_", LivekitModels$VideoLayer.class, "simulcastCodecs_", LivekitRtc$SimulcastCodec.class, "sid_", "stereo_", "disableRed_", "encryption_", "stream_"});
            case 3:
                return new LivekitRtc$AddTrackRequest();
            case 4:
                return new C14573E3(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitRtc$AddTrackRequest.class) {
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

    public boolean getDisableDtx() {
        return this.disableDtx_;
    }

    public boolean getDisableRed() {
        return this.disableRed_;
    }

    public EnumC14781l2 getEncryption() {
        EnumC14781l2 enumC14781l2M16053a = EnumC14781l2.m16053a(this.encryption_);
        return enumC14781l2M16053a == null ? EnumC14781l2.UNRECOGNIZED : enumC14781l2M16053a;
    }

    public int getEncryptionValue() {
        return this.encryption_;
    }

    public int getHeight() {
        return this.height_;
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

    public boolean getMuted() {
        return this.muted_;
    }

    public String getName() {
        return this.name_;
    }

    public AbstractC12171m getNameBytes() {
        return AbstractC12171m.m14011m(this.name_);
    }

    public String getSid() {
        return this.sid_;
    }

    public AbstractC12171m getSidBytes() {
        return AbstractC12171m.m14011m(this.sid_);
    }

    public LivekitRtc$SimulcastCodec getSimulcastCodecs(int i10) {
        return (LivekitRtc$SimulcastCodec) this.simulcastCodecs_.get(i10);
    }

    public int getSimulcastCodecsCount() {
        return this.simulcastCodecs_.size();
    }

    public List<LivekitRtc$SimulcastCodec> getSimulcastCodecsList() {
        return this.simulcastCodecs_;
    }

    public InterfaceC14776k4 getSimulcastCodecsOrBuilder(int i10) {
        return (InterfaceC14776k4) this.simulcastCodecs_.get(i10);
    }

    public List<? extends InterfaceC14776k4> getSimulcastCodecsOrBuilderList() {
        return this.simulcastCodecs_;
    }

    public EnumC14686X2 getSource() {
        EnumC14686X2 enumC14686X2M16045a = EnumC14686X2.m16045a(this.source_);
        return enumC14686X2M16045a == null ? EnumC14686X2.UNRECOGNIZED : enumC14686X2M16045a;
    }

    public int getSourceValue() {
        return this.source_;
    }

    public boolean getStereo() {
        return this.stereo_;
    }

    public String getStream() {
        return this.stream_;
    }

    public AbstractC12171m getStreamBytes() {
        return AbstractC12171m.m14011m(this.stream_);
    }

    public EnumC14692Y2 getType() {
        EnumC14692Y2 enumC14692Y2M16047a = EnumC14692Y2.m16047a(this.type_);
        return enumC14692Y2M16047a == null ? EnumC14692Y2.UNRECOGNIZED : enumC14692Y2M16047a;
    }

    public int getTypeValue() {
        return this.type_;
    }

    public int getWidth() {
        return this.width_;
    }

    public static C14573E3 newBuilder(LivekitRtc$AddTrackRequest livekitRtc$AddTrackRequest) {
        return (C14573E3) DEFAULT_INSTANCE.createBuilder(livekitRtc$AddTrackRequest);
    }

    public static LivekitRtc$AddTrackRequest parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$AddTrackRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$AddTrackRequest parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitRtc$AddTrackRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitRtc$AddTrackRequest parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitRtc$AddTrackRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLayers(int i10, LivekitModels$VideoLayer livekitModels$VideoLayer) {
        livekitModels$VideoLayer.getClass();
        ensureLayersIsMutable();
        this.layers_.add(i10, livekitModels$VideoLayer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSimulcastCodecs(int i10, LivekitRtc$SimulcastCodec livekitRtc$SimulcastCodec) {
        livekitRtc$SimulcastCodec.getClass();
        ensureSimulcastCodecsIsMutable();
        this.simulcastCodecs_.add(i10, livekitRtc$SimulcastCodec);
    }

    public static LivekitRtc$AddTrackRequest parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitRtc$AddTrackRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitRtc$AddTrackRequest parseFrom(byte[] bArr) {
        return (LivekitRtc$AddTrackRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$AddTrackRequest parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitRtc$AddTrackRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitRtc$AddTrackRequest parseFrom(InputStream inputStream) {
        return (LivekitRtc$AddTrackRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$AddTrackRequest parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$AddTrackRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$AddTrackRequest parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitRtc$AddTrackRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitRtc$AddTrackRequest parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitRtc$AddTrackRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
