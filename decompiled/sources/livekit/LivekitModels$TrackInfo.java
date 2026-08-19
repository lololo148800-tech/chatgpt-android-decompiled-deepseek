package livekit;

import com.google.protobuf.AbstractC12133Z;
import com.google.protobuf.AbstractC12138b;
import com.google.protobuf.AbstractC12141c;
import com.google.protobuf.AbstractC12171m;
import com.google.protobuf.AbstractC12186r;
import com.google.protobuf.C12087F;
import com.google.protobuf.C12123U;
import com.google.protobuf.C12142c0;
import com.google.protobuf.C12166k0;
import com.google.protobuf.EnumC12131Y;
import com.google.protobuf.InterfaceC12124U0;
import com.google.protobuf.InterfaceC12160i0;
import com.google.protobuf.InterfaceC12163j0;
import com.google.protobuf.InterfaceC12172m0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import p499U9.C7591u;
import p793ho.C14668U2;
import p793ho.C14674V2;
import p793ho.EnumC14679W1;
import p793ho.EnumC14686X2;
import p793ho.EnumC14692Y2;
import p793ho.EnumC14781l2;
import p793ho.InterfaceC14639P2;
import p793ho.InterfaceC14680W2;
import p793ho.InterfaceC14754h3;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitModels$TrackInfo extends AbstractC12133Z implements InterfaceC14680W2 {
    public static final int AUDIO_FEATURES_FIELD_NUMBER = 19;
    public static final int CODECS_FIELD_NUMBER = 13;
    private static final LivekitModels$TrackInfo DEFAULT_INSTANCE;
    public static final int DISABLE_DTX_FIELD_NUMBER = 8;
    public static final int DISABLE_RED_FIELD_NUMBER = 15;
    public static final int ENCRYPTION_FIELD_NUMBER = 16;
    public static final int HEIGHT_FIELD_NUMBER = 6;
    public static final int LAYERS_FIELD_NUMBER = 10;
    public static final int MID_FIELD_NUMBER = 12;
    public static final int MIME_TYPE_FIELD_NUMBER = 11;
    public static final int MUTED_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_NUMBER = 3;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int SID_FIELD_NUMBER = 1;
    public static final int SIMULCAST_FIELD_NUMBER = 7;
    public static final int SOURCE_FIELD_NUMBER = 9;
    public static final int STEREO_FIELD_NUMBER = 14;
    public static final int STREAM_FIELD_NUMBER = 17;
    public static final int TYPE_FIELD_NUMBER = 2;
    public static final int VERSION_FIELD_NUMBER = 18;
    public static final int WIDTH_FIELD_NUMBER = 5;
    private static final InterfaceC12163j0 audioFeatures_converter_ = new C7591u(28);
    private int audioFeaturesMemoizedSerializedSize;
    private boolean disableDtx_;
    private boolean disableRed_;
    private int encryption_;
    private int height_;
    private boolean muted_;
    private boolean simulcast_;
    private int source_;
    private boolean stereo_;
    private int type_;
    private LivekitModels$TimedVersion version_;
    private int width_;
    private String sid_ = "";
    private String name_ = "";
    private InterfaceC12172m0 layers_ = AbstractC12133Z.emptyProtobufList();
    private String mimeType_ = "";
    private String mid_ = "";
    private InterfaceC12172m0 codecs_ = AbstractC12133Z.emptyProtobufList();
    private String stream_ = "";
    private InterfaceC12160i0 audioFeatures_ = AbstractC12133Z.emptyIntList();

    static {
        LivekitModels$TrackInfo livekitModels$TrackInfo = new LivekitModels$TrackInfo();
        DEFAULT_INSTANCE = livekitModels$TrackInfo;
        AbstractC12133Z.registerDefaultInstance(LivekitModels$TrackInfo.class, livekitModels$TrackInfo);
    }

    private LivekitModels$TrackInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAudioFeatures(Iterable<? extends EnumC14679W1> iterable) {
        ensureAudioFeaturesIsMutable();
        for (EnumC14679W1 enumC14679W1 : iterable) {
            ((C12142c0) this.audioFeatures_).m13938j(enumC14679W1.getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAudioFeaturesValue(Iterable<Integer> iterable) {
        ensureAudioFeaturesIsMutable();
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            ((C12142c0) this.audioFeatures_).m13938j(it.next().intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCodecs(Iterable<? extends LivekitModels$SimulcastCodecInfo> iterable) {
        ensureCodecsIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.codecs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLayers(Iterable<? extends LivekitModels$VideoLayer> iterable) {
        ensureLayersIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.layers_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAudioFeatures(EnumC14679W1 enumC14679W1) {
        enumC14679W1.getClass();
        ensureAudioFeaturesIsMutable();
        ((C12142c0) this.audioFeatures_).m13938j(enumC14679W1.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAudioFeaturesValue(int i10) {
        ensureAudioFeaturesIsMutable();
        ((C12142c0) this.audioFeatures_).m13938j(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCodecs(LivekitModels$SimulcastCodecInfo livekitModels$SimulcastCodecInfo) {
        livekitModels$SimulcastCodecInfo.getClass();
        ensureCodecsIsMutable();
        this.codecs_.add(livekitModels$SimulcastCodecInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLayers(LivekitModels$VideoLayer livekitModels$VideoLayer) {
        livekitModels$VideoLayer.getClass();
        ensureLayersIsMutable();
        this.layers_.add(livekitModels$VideoLayer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAudioFeatures() {
        this.audioFeatures_ = AbstractC12133Z.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCodecs() {
        this.codecs_ = AbstractC12133Z.emptyProtobufList();
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
    public void clearMid() {
        this.mid_ = getDefaultInstance().getMid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMimeType() {
        this.mimeType_ = getDefaultInstance().getMimeType();
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
    public void clearSimulcast() {
        this.simulcast_ = false;
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
    public void clearVersion() {
        this.version_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWidth() {
        this.width_ = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void ensureAudioFeaturesIsMutable() {
        InterfaceC12160i0 interfaceC12160i0 = this.audioFeatures_;
        if (((AbstractC12141c) interfaceC12160i0).f37021Y) {
            return;
        }
        this.audioFeatures_ = AbstractC12133Z.mutableCopy(interfaceC12160i0);
    }

    private void ensureCodecsIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.codecs_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.codecs_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    private void ensureLayersIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.layers_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.layers_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    public static LivekitModels$TrackInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVersion(LivekitModels$TimedVersion livekitModels$TimedVersion) {
        livekitModels$TimedVersion.getClass();
        LivekitModels$TimedVersion livekitModels$TimedVersion2 = this.version_;
        if (livekitModels$TimedVersion2 == null || livekitModels$TimedVersion2 == LivekitModels$TimedVersion.getDefaultInstance()) {
            this.version_ = livekitModels$TimedVersion;
            return;
        }
        C14668U2 c14668u2NewBuilder = LivekitModels$TimedVersion.newBuilder(this.version_);
        c14668u2NewBuilder.m13865f(livekitModels$TimedVersion);
        this.version_ = (LivekitModels$TimedVersion) c14668u2NewBuilder.m13862c();
    }

    public static C14674V2 newBuilder() {
        return (C14674V2) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitModels$TrackInfo parseDelimitedFrom(InputStream inputStream) {
        return (LivekitModels$TrackInfo) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$TrackInfo parseFrom(ByteBuffer byteBuffer) {
        return (LivekitModels$TrackInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeCodecs(int i10) {
        ensureCodecsIsMutable();
        this.codecs_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLayers(int i10) {
        ensureLayersIsMutable();
        this.layers_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAudioFeatures(int i10, EnumC14679W1 enumC14679W1) {
        enumC14679W1.getClass();
        ensureAudioFeaturesIsMutable();
        ((C12142c0) this.audioFeatures_).m13941q(i10, enumC14679W1.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAudioFeaturesValue(int i10, int i11) {
        ensureAudioFeaturesIsMutable();
        ((C12142c0) this.audioFeatures_).m13941q(i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCodecs(int i10, LivekitModels$SimulcastCodecInfo livekitModels$SimulcastCodecInfo) {
        livekitModels$SimulcastCodecInfo.getClass();
        ensureCodecsIsMutable();
        this.codecs_.set(i10, livekitModels$SimulcastCodecInfo);
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
    public void setSimulcast(boolean z6) {
        this.simulcast_ = z6;
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
    public void setVersion(LivekitModels$TimedVersion livekitModels$TimedVersion) {
        livekitModels$TimedVersion.getClass();
        this.version_ = livekitModels$TimedVersion;
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
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0013\u0000\u0000\u0001\u0013\u0013\u0000\u0003\u0000\u0001Ȉ\u0002\f\u0003Ȉ\u0004\u0007\u0005\u000b\u0006\u000b\u0007\u0007\b\u0007\t\f\n\u001b\u000bȈ\fȈ\r\u001b\u000e\u0007\u000f\u0007\u0010\f\u0011Ȉ\u0012\t\u0013,", new Object[]{"sid_", "type_", "name_", "muted_", "width_", "height_", "simulcast_", "disableDtx_", "source_", "layers_", LivekitModels$VideoLayer.class, "mimeType_", "mid_", "codecs_", LivekitModels$SimulcastCodecInfo.class, "stereo_", "disableRed_", "encryption_", "stream_", "version_", "audioFeatures_"});
            case 3:
                return new LivekitModels$TrackInfo();
            case 4:
                return new C14674V2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitModels$TrackInfo.class) {
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

    public EnumC14679W1 getAudioFeatures(int i10) {
        EnumC14679W1 enumC14679W1M16044a = EnumC14679W1.m16044a(((C12142c0) this.audioFeatures_).m13940p(i10));
        return enumC14679W1M16044a == null ? EnumC14679W1.UNRECOGNIZED : enumC14679W1M16044a;
    }

    public int getAudioFeaturesCount() {
        return this.audioFeatures_.size();
    }

    public List<EnumC14679W1> getAudioFeaturesList() {
        return new C12166k0(this.audioFeatures_, audioFeatures_converter_);
    }

    public int getAudioFeaturesValue(int i10) {
        return ((C12142c0) this.audioFeatures_).m13940p(i10);
    }

    public List<Integer> getAudioFeaturesValueList() {
        return this.audioFeatures_;
    }

    public LivekitModels$SimulcastCodecInfo getCodecs(int i10) {
        return (LivekitModels$SimulcastCodecInfo) this.codecs_.get(i10);
    }

    public int getCodecsCount() {
        return this.codecs_.size();
    }

    public List<LivekitModels$SimulcastCodecInfo> getCodecsList() {
        return this.codecs_;
    }

    public InterfaceC14639P2 getCodecsOrBuilder(int i10) {
        return (InterfaceC14639P2) this.codecs_.get(i10);
    }

    public List<? extends InterfaceC14639P2> getCodecsOrBuilderList() {
        return this.codecs_;
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

    public boolean getSimulcast() {
        return this.simulcast_;
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

    public LivekitModels$TimedVersion getVersion() {
        LivekitModels$TimedVersion livekitModels$TimedVersion = this.version_;
        return livekitModels$TimedVersion == null ? LivekitModels$TimedVersion.getDefaultInstance() : livekitModels$TimedVersion;
    }

    public int getWidth() {
        return this.width_;
    }

    public boolean hasVersion() {
        return this.version_ != null;
    }

    public static C14674V2 newBuilder(LivekitModels$TrackInfo livekitModels$TrackInfo) {
        return (C14674V2) DEFAULT_INSTANCE.createBuilder(livekitModels$TrackInfo);
    }

    public static LivekitModels$TrackInfo parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitModels$TrackInfo) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitModels$TrackInfo parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitModels$TrackInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitModels$TrackInfo parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitModels$TrackInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCodecs(int i10, LivekitModels$SimulcastCodecInfo livekitModels$SimulcastCodecInfo) {
        livekitModels$SimulcastCodecInfo.getClass();
        ensureCodecsIsMutable();
        this.codecs_.add(i10, livekitModels$SimulcastCodecInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLayers(int i10, LivekitModels$VideoLayer livekitModels$VideoLayer) {
        livekitModels$VideoLayer.getClass();
        ensureLayersIsMutable();
        this.layers_.add(i10, livekitModels$VideoLayer);
    }

    public static LivekitModels$TrackInfo parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitModels$TrackInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitModels$TrackInfo parseFrom(byte[] bArr) {
        return (LivekitModels$TrackInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitModels$TrackInfo parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitModels$TrackInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitModels$TrackInfo parseFrom(InputStream inputStream) {
        return (LivekitModels$TrackInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$TrackInfo parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitModels$TrackInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitModels$TrackInfo parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitModels$TrackInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitModels$TrackInfo parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitModels$TrackInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
