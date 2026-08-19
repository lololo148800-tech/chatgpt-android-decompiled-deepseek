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
import p793ho.C14773k1;
import p793ho.C14801o1;
import p793ho.C14864x1;
import p793ho.EnumC14829s1;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitIngress$CreateIngressRequest extends AbstractC12133Z implements InterfaceC12094H0 {
    public static final int AUDIO_FIELD_NUMBER = 6;
    public static final int BYPASS_TRANSCODING_FIELD_NUMBER = 8;
    private static final LivekitIngress$CreateIngressRequest DEFAULT_INSTANCE;
    public static final int ENABLE_TRANSCODING_FIELD_NUMBER = 11;
    public static final int INPUT_TYPE_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int PARTICIPANT_IDENTITY_FIELD_NUMBER = 4;
    public static final int PARTICIPANT_METADATA_FIELD_NUMBER = 10;
    public static final int PARTICIPANT_NAME_FIELD_NUMBER = 5;
    public static final int ROOM_NAME_FIELD_NUMBER = 3;
    public static final int URL_FIELD_NUMBER = 9;
    public static final int VIDEO_FIELD_NUMBER = 7;
    private LivekitIngress$IngressAudioOptions audio_;
    private int bitField0_;
    private boolean bypassTranscoding_;
    private boolean enableTranscoding_;
    private int inputType_;
    private LivekitIngress$IngressVideoOptions video_;
    private String url_ = "";
    private String name_ = "";
    private String roomName_ = "";
    private String participantIdentity_ = "";
    private String participantName_ = "";
    private String participantMetadata_ = "";

    static {
        LivekitIngress$CreateIngressRequest livekitIngress$CreateIngressRequest = new LivekitIngress$CreateIngressRequest();
        DEFAULT_INSTANCE = livekitIngress$CreateIngressRequest;
        AbstractC12133Z.registerDefaultInstance(LivekitIngress$CreateIngressRequest.class, livekitIngress$CreateIngressRequest);
    }

    private LivekitIngress$CreateIngressRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAudio() {
        this.audio_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBypassTranscoding() {
        this.bypassTranscoding_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnableTranscoding() {
        this.bitField0_ &= -2;
        this.enableTranscoding_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInputType() {
        this.inputType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipantIdentity() {
        this.participantIdentity_ = getDefaultInstance().getParticipantIdentity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipantMetadata() {
        this.participantMetadata_ = getDefaultInstance().getParticipantMetadata();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipantName() {
        this.participantName_ = getDefaultInstance().getParticipantName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoomName() {
        this.roomName_ = getDefaultInstance().getRoomName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrl() {
        this.url_ = getDefaultInstance().getUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVideo() {
        this.video_ = null;
    }

    public static LivekitIngress$CreateIngressRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAudio(LivekitIngress$IngressAudioOptions livekitIngress$IngressAudioOptions) {
        livekitIngress$IngressAudioOptions.getClass();
        LivekitIngress$IngressAudioOptions livekitIngress$IngressAudioOptions2 = this.audio_;
        if (livekitIngress$IngressAudioOptions2 == null || livekitIngress$IngressAudioOptions2 == LivekitIngress$IngressAudioOptions.getDefaultInstance()) {
            this.audio_ = livekitIngress$IngressAudioOptions;
            return;
        }
        C14801o1 c14801o1NewBuilder = LivekitIngress$IngressAudioOptions.newBuilder(this.audio_);
        c14801o1NewBuilder.m13865f(livekitIngress$IngressAudioOptions);
        this.audio_ = (LivekitIngress$IngressAudioOptions) c14801o1NewBuilder.m13862c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVideo(LivekitIngress$IngressVideoOptions livekitIngress$IngressVideoOptions) {
        livekitIngress$IngressVideoOptions.getClass();
        LivekitIngress$IngressVideoOptions livekitIngress$IngressVideoOptions2 = this.video_;
        if (livekitIngress$IngressVideoOptions2 == null || livekitIngress$IngressVideoOptions2 == LivekitIngress$IngressVideoOptions.getDefaultInstance()) {
            this.video_ = livekitIngress$IngressVideoOptions;
            return;
        }
        C14864x1 c14864x1NewBuilder = LivekitIngress$IngressVideoOptions.newBuilder(this.video_);
        c14864x1NewBuilder.m13865f(livekitIngress$IngressVideoOptions);
        this.video_ = (LivekitIngress$IngressVideoOptions) c14864x1NewBuilder.m13862c();
    }

    public static C14773k1 newBuilder() {
        return (C14773k1) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitIngress$CreateIngressRequest parseDelimitedFrom(InputStream inputStream) {
        return (LivekitIngress$CreateIngressRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitIngress$CreateIngressRequest parseFrom(ByteBuffer byteBuffer) {
        return (LivekitIngress$CreateIngressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAudio(LivekitIngress$IngressAudioOptions livekitIngress$IngressAudioOptions) {
        livekitIngress$IngressAudioOptions.getClass();
        this.audio_ = livekitIngress$IngressAudioOptions;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBypassTranscoding(boolean z6) {
        this.bypassTranscoding_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnableTranscoding(boolean z6) {
        this.bitField0_ |= 1;
        this.enableTranscoding_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInputType(EnumC14829s1 enumC14829s1) {
        this.inputType_ = enumC14829s1.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInputTypeValue(int i10) {
        this.inputType_ = i10;
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
    public void setParticipantIdentity(String str) {
        str.getClass();
        this.participantIdentity_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipantIdentityBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.participantIdentity_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipantMetadata(String str) {
        str.getClass();
        this.participantMetadata_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipantMetadataBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.participantMetadata_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipantName(String str) {
        str.getClass();
        this.participantName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipantNameBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.participantName_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoomName(String str) {
        str.getClass();
        this.roomName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoomNameBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.roomName_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrl(String str) {
        str.getClass();
        this.url_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrlBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.url_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideo(LivekitIngress$IngressVideoOptions livekitIngress$IngressVideoOptions) {
        livekitIngress$IngressVideoOptions.getClass();
        this.video_ = livekitIngress$IngressVideoOptions;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\t\u0007\t\b\u0007\tȈ\nȈ\u000bဇ\u0000", new Object[]{"bitField0_", "inputType_", "name_", "roomName_", "participantIdentity_", "participantName_", "audio_", "video_", "bypassTranscoding_", "url_", "participantMetadata_", "enableTranscoding_"});
            case 3:
                return new LivekitIngress$CreateIngressRequest();
            case 4:
                return new C14773k1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitIngress$CreateIngressRequest.class) {
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

    public LivekitIngress$IngressAudioOptions getAudio() {
        LivekitIngress$IngressAudioOptions livekitIngress$IngressAudioOptions = this.audio_;
        return livekitIngress$IngressAudioOptions == null ? LivekitIngress$IngressAudioOptions.getDefaultInstance() : livekitIngress$IngressAudioOptions;
    }

    @Deprecated
    public boolean getBypassTranscoding() {
        return this.bypassTranscoding_;
    }

    public boolean getEnableTranscoding() {
        return this.enableTranscoding_;
    }

    public EnumC14829s1 getInputType() {
        EnumC14829s1 enumC14829s1M16056a = EnumC14829s1.m16056a(this.inputType_);
        return enumC14829s1M16056a == null ? EnumC14829s1.UNRECOGNIZED : enumC14829s1M16056a;
    }

    public int getInputTypeValue() {
        return this.inputType_;
    }

    public String getName() {
        return this.name_;
    }

    public AbstractC12171m getNameBytes() {
        return AbstractC12171m.m14011m(this.name_);
    }

    public String getParticipantIdentity() {
        return this.participantIdentity_;
    }

    public AbstractC12171m getParticipantIdentityBytes() {
        return AbstractC12171m.m14011m(this.participantIdentity_);
    }

    public String getParticipantMetadata() {
        return this.participantMetadata_;
    }

    public AbstractC12171m getParticipantMetadataBytes() {
        return AbstractC12171m.m14011m(this.participantMetadata_);
    }

    public String getParticipantName() {
        return this.participantName_;
    }

    public AbstractC12171m getParticipantNameBytes() {
        return AbstractC12171m.m14011m(this.participantName_);
    }

    public String getRoomName() {
        return this.roomName_;
    }

    public AbstractC12171m getRoomNameBytes() {
        return AbstractC12171m.m14011m(this.roomName_);
    }

    public String getUrl() {
        return this.url_;
    }

    public AbstractC12171m getUrlBytes() {
        return AbstractC12171m.m14011m(this.url_);
    }

    public LivekitIngress$IngressVideoOptions getVideo() {
        LivekitIngress$IngressVideoOptions livekitIngress$IngressVideoOptions = this.video_;
        return livekitIngress$IngressVideoOptions == null ? LivekitIngress$IngressVideoOptions.getDefaultInstance() : livekitIngress$IngressVideoOptions;
    }

    public boolean hasAudio() {
        return this.audio_ != null;
    }

    public boolean hasEnableTranscoding() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasVideo() {
        return this.video_ != null;
    }

    public static C14773k1 newBuilder(LivekitIngress$CreateIngressRequest livekitIngress$CreateIngressRequest) {
        return (C14773k1) DEFAULT_INSTANCE.createBuilder(livekitIngress$CreateIngressRequest);
    }

    public static LivekitIngress$CreateIngressRequest parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitIngress$CreateIngressRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitIngress$CreateIngressRequest parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitIngress$CreateIngressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitIngress$CreateIngressRequest parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitIngress$CreateIngressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitIngress$CreateIngressRequest parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitIngress$CreateIngressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitIngress$CreateIngressRequest parseFrom(byte[] bArr) {
        return (LivekitIngress$CreateIngressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitIngress$CreateIngressRequest parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitIngress$CreateIngressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitIngress$CreateIngressRequest parseFrom(InputStream inputStream) {
        return (LivekitIngress$CreateIngressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitIngress$CreateIngressRequest parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitIngress$CreateIngressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitIngress$CreateIngressRequest parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitIngress$CreateIngressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitIngress$CreateIngressRequest parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitIngress$CreateIngressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
