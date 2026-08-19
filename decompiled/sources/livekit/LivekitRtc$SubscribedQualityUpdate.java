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
import p793ho.C14846u4;
import p793ho.InterfaceC14825r4;
import p793ho.InterfaceC14839t4;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitRtc$SubscribedQualityUpdate extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitRtc$SubscribedQualityUpdate DEFAULT_INSTANCE;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int SUBSCRIBED_CODECS_FIELD_NUMBER = 3;
    public static final int SUBSCRIBED_QUALITIES_FIELD_NUMBER = 2;
    public static final int TRACK_SID_FIELD_NUMBER = 1;
    private String trackSid_ = "";
    private InterfaceC12172m0 subscribedQualities_ = AbstractC12133Z.emptyProtobufList();
    private InterfaceC12172m0 subscribedCodecs_ = AbstractC12133Z.emptyProtobufList();

    static {
        LivekitRtc$SubscribedQualityUpdate livekitRtc$SubscribedQualityUpdate = new LivekitRtc$SubscribedQualityUpdate();
        DEFAULT_INSTANCE = livekitRtc$SubscribedQualityUpdate;
        AbstractC12133Z.registerDefaultInstance(LivekitRtc$SubscribedQualityUpdate.class, livekitRtc$SubscribedQualityUpdate);
    }

    private LivekitRtc$SubscribedQualityUpdate() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSubscribedCodecs(Iterable<? extends LivekitRtc$SubscribedCodec> iterable) {
        ensureSubscribedCodecsIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.subscribedCodecs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSubscribedQualities(Iterable<? extends LivekitRtc$SubscribedQuality> iterable) {
        ensureSubscribedQualitiesIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.subscribedQualities_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSubscribedCodecs(LivekitRtc$SubscribedCodec livekitRtc$SubscribedCodec) {
        livekitRtc$SubscribedCodec.getClass();
        ensureSubscribedCodecsIsMutable();
        this.subscribedCodecs_.add(livekitRtc$SubscribedCodec);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSubscribedQualities(LivekitRtc$SubscribedQuality livekitRtc$SubscribedQuality) {
        livekitRtc$SubscribedQuality.getClass();
        ensureSubscribedQualitiesIsMutable();
        this.subscribedQualities_.add(livekitRtc$SubscribedQuality);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubscribedCodecs() {
        this.subscribedCodecs_ = AbstractC12133Z.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubscribedQualities() {
        this.subscribedQualities_ = AbstractC12133Z.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackSid() {
        this.trackSid_ = getDefaultInstance().getTrackSid();
    }

    private void ensureSubscribedCodecsIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.subscribedCodecs_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.subscribedCodecs_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    private void ensureSubscribedQualitiesIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.subscribedQualities_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.subscribedQualities_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    public static LivekitRtc$SubscribedQualityUpdate getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14846u4 newBuilder() {
        return (C14846u4) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$SubscribedQualityUpdate parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$SubscribedQualityUpdate) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$SubscribedQualityUpdate parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$SubscribedQualityUpdate) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSubscribedCodecs(int i10) {
        ensureSubscribedCodecsIsMutable();
        this.subscribedCodecs_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSubscribedQualities(int i10) {
        ensureSubscribedQualitiesIsMutable();
        this.subscribedQualities_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubscribedCodecs(int i10, LivekitRtc$SubscribedCodec livekitRtc$SubscribedCodec) {
        livekitRtc$SubscribedCodec.getClass();
        ensureSubscribedCodecsIsMutable();
        this.subscribedCodecs_.set(i10, livekitRtc$SubscribedCodec);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubscribedQualities(int i10, LivekitRtc$SubscribedQuality livekitRtc$SubscribedQuality) {
        livekitRtc$SubscribedQuality.getClass();
        ensureSubscribedQualitiesIsMutable();
        this.subscribedQualities_.set(i10, livekitRtc$SubscribedQuality);
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
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001Ȉ\u0002\u001b\u0003\u001b", new Object[]{"trackSid_", "subscribedQualities_", LivekitRtc$SubscribedQuality.class, "subscribedCodecs_", LivekitRtc$SubscribedCodec.class});
            case 3:
                return new LivekitRtc$SubscribedQualityUpdate();
            case 4:
                return new C14846u4(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitRtc$SubscribedQualityUpdate.class) {
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

    public LivekitRtc$SubscribedCodec getSubscribedCodecs(int i10) {
        return (LivekitRtc$SubscribedCodec) this.subscribedCodecs_.get(i10);
    }

    public int getSubscribedCodecsCount() {
        return this.subscribedCodecs_.size();
    }

    public List<LivekitRtc$SubscribedCodec> getSubscribedCodecsList() {
        return this.subscribedCodecs_;
    }

    public InterfaceC14825r4 getSubscribedCodecsOrBuilder(int i10) {
        return (InterfaceC14825r4) this.subscribedCodecs_.get(i10);
    }

    public List<? extends InterfaceC14825r4> getSubscribedCodecsOrBuilderList() {
        return this.subscribedCodecs_;
    }

    public LivekitRtc$SubscribedQuality getSubscribedQualities(int i10) {
        return (LivekitRtc$SubscribedQuality) this.subscribedQualities_.get(i10);
    }

    public int getSubscribedQualitiesCount() {
        return this.subscribedQualities_.size();
    }

    public List<LivekitRtc$SubscribedQuality> getSubscribedQualitiesList() {
        return this.subscribedQualities_;
    }

    public InterfaceC14839t4 getSubscribedQualitiesOrBuilder(int i10) {
        return (InterfaceC14839t4) this.subscribedQualities_.get(i10);
    }

    public List<? extends InterfaceC14839t4> getSubscribedQualitiesOrBuilderList() {
        return this.subscribedQualities_;
    }

    public String getTrackSid() {
        return this.trackSid_;
    }

    public AbstractC12171m getTrackSidBytes() {
        return AbstractC12171m.m14011m(this.trackSid_);
    }

    public static C14846u4 newBuilder(LivekitRtc$SubscribedQualityUpdate livekitRtc$SubscribedQualityUpdate) {
        return (C14846u4) DEFAULT_INSTANCE.createBuilder(livekitRtc$SubscribedQualityUpdate);
    }

    public static LivekitRtc$SubscribedQualityUpdate parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$SubscribedQualityUpdate) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$SubscribedQualityUpdate parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitRtc$SubscribedQualityUpdate) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitRtc$SubscribedQualityUpdate parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitRtc$SubscribedQualityUpdate) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSubscribedCodecs(int i10, LivekitRtc$SubscribedCodec livekitRtc$SubscribedCodec) {
        livekitRtc$SubscribedCodec.getClass();
        ensureSubscribedCodecsIsMutable();
        this.subscribedCodecs_.add(i10, livekitRtc$SubscribedCodec);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSubscribedQualities(int i10, LivekitRtc$SubscribedQuality livekitRtc$SubscribedQuality) {
        livekitRtc$SubscribedQuality.getClass();
        ensureSubscribedQualitiesIsMutable();
        this.subscribedQualities_.add(i10, livekitRtc$SubscribedQuality);
    }

    public static LivekitRtc$SubscribedQualityUpdate parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitRtc$SubscribedQualityUpdate) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitRtc$SubscribedQualityUpdate parseFrom(byte[] bArr) {
        return (LivekitRtc$SubscribedQualityUpdate) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$SubscribedQualityUpdate parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitRtc$SubscribedQualityUpdate) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitRtc$SubscribedQualityUpdate parseFrom(InputStream inputStream) {
        return (LivekitRtc$SubscribedQualityUpdate) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$SubscribedQualityUpdate parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$SubscribedQualityUpdate) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$SubscribedQualityUpdate parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitRtc$SubscribedQualityUpdate) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitRtc$SubscribedQualityUpdate parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitRtc$SubscribedQualityUpdate) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
