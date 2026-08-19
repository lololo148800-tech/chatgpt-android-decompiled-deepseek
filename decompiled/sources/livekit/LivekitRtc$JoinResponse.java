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
import p793ho.C14579F2;
import p793ho.C14621M2;
import p793ho.C14628N3;
import p793ho.C14697Z1;
import p793ho.C14802o2;
import p793ho.InterfaceC14622M3;
import p793ho.InterfaceC14725d2;
import p793ho.InterfaceC14823r2;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitRtc$JoinResponse extends AbstractC12133Z implements InterfaceC12094H0 {
    public static final int ALTERNATIVE_URL_FIELD_NUMBER = 7;
    public static final int CLIENT_CONFIGURATION_FIELD_NUMBER = 8;
    private static final LivekitRtc$JoinResponse DEFAULT_INSTANCE;
    public static final int ENABLED_PUBLISH_CODECS_FIELD_NUMBER = 14;
    public static final int FAST_PUBLISH_FIELD_NUMBER = 15;
    public static final int ICE_SERVERS_FIELD_NUMBER = 5;
    public static final int OTHER_PARTICIPANTS_FIELD_NUMBER = 3;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int PARTICIPANT_FIELD_NUMBER = 2;
    public static final int PING_INTERVAL_FIELD_NUMBER = 11;
    public static final int PING_TIMEOUT_FIELD_NUMBER = 10;
    public static final int ROOM_FIELD_NUMBER = 1;
    public static final int SERVER_INFO_FIELD_NUMBER = 12;
    public static final int SERVER_REGION_FIELD_NUMBER = 9;
    public static final int SERVER_VERSION_FIELD_NUMBER = 4;
    public static final int SIF_TRAILER_FIELD_NUMBER = 13;
    public static final int SUBSCRIBER_PRIMARY_FIELD_NUMBER = 6;
    private LivekitModels$ClientConfiguration clientConfiguration_;
    private boolean fastPublish_;
    private LivekitModels$ParticipantInfo participant_;
    private int pingInterval_;
    private int pingTimeout_;
    private LivekitModels$Room room_;
    private LivekitModels$ServerInfo serverInfo_;
    private boolean subscriberPrimary_;
    private InterfaceC12172m0 otherParticipants_ = AbstractC12133Z.emptyProtobufList();
    private String serverVersion_ = "";
    private InterfaceC12172m0 iceServers_ = AbstractC12133Z.emptyProtobufList();
    private String alternativeUrl_ = "";
    private String serverRegion_ = "";
    private AbstractC12171m sifTrailer_ = AbstractC12171m.f37047Z;
    private InterfaceC12172m0 enabledPublishCodecs_ = AbstractC12133Z.emptyProtobufList();

    static {
        LivekitRtc$JoinResponse livekitRtc$JoinResponse = new LivekitRtc$JoinResponse();
        DEFAULT_INSTANCE = livekitRtc$JoinResponse;
        AbstractC12133Z.registerDefaultInstance(LivekitRtc$JoinResponse.class, livekitRtc$JoinResponse);
    }

    private LivekitRtc$JoinResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEnabledPublishCodecs(Iterable<? extends LivekitModels$Codec> iterable) {
        ensureEnabledPublishCodecsIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.enabledPublishCodecs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllIceServers(Iterable<? extends LivekitRtc$ICEServer> iterable) {
        ensureIceServersIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.iceServers_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOtherParticipants(Iterable<? extends LivekitModels$ParticipantInfo> iterable) {
        ensureOtherParticipantsIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.otherParticipants_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEnabledPublishCodecs(LivekitModels$Codec livekitModels$Codec) {
        livekitModels$Codec.getClass();
        ensureEnabledPublishCodecsIsMutable();
        this.enabledPublishCodecs_.add(livekitModels$Codec);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addIceServers(LivekitRtc$ICEServer livekitRtc$ICEServer) {
        livekitRtc$ICEServer.getClass();
        ensureIceServersIsMutable();
        this.iceServers_.add(livekitRtc$ICEServer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOtherParticipants(LivekitModels$ParticipantInfo livekitModels$ParticipantInfo) {
        livekitModels$ParticipantInfo.getClass();
        ensureOtherParticipantsIsMutable();
        this.otherParticipants_.add(livekitModels$ParticipantInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlternativeUrl() {
        this.alternativeUrl_ = getDefaultInstance().getAlternativeUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientConfiguration() {
        this.clientConfiguration_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnabledPublishCodecs() {
        this.enabledPublishCodecs_ = AbstractC12133Z.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFastPublish() {
        this.fastPublish_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIceServers() {
        this.iceServers_ = AbstractC12133Z.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOtherParticipants() {
        this.otherParticipants_ = AbstractC12133Z.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipant() {
        this.participant_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPingInterval() {
        this.pingInterval_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPingTimeout() {
        this.pingTimeout_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoom() {
        this.room_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServerInfo() {
        this.serverInfo_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServerRegion() {
        this.serverRegion_ = getDefaultInstance().getServerRegion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServerVersion() {
        this.serverVersion_ = getDefaultInstance().getServerVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSifTrailer() {
        this.sifTrailer_ = getDefaultInstance().getSifTrailer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubscriberPrimary() {
        this.subscriberPrimary_ = false;
    }

    private void ensureEnabledPublishCodecsIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.enabledPublishCodecs_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.enabledPublishCodecs_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    private void ensureIceServersIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.iceServers_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.iceServers_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    private void ensureOtherParticipantsIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.otherParticipants_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.otherParticipants_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    public static LivekitRtc$JoinResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeClientConfiguration(LivekitModels$ClientConfiguration livekitModels$ClientConfiguration) {
        livekitModels$ClientConfiguration.getClass();
        LivekitModels$ClientConfiguration livekitModels$ClientConfiguration2 = this.clientConfiguration_;
        if (livekitModels$ClientConfiguration2 == null || livekitModels$ClientConfiguration2 == LivekitModels$ClientConfiguration.getDefaultInstance()) {
            this.clientConfiguration_ = livekitModels$ClientConfiguration;
            return;
        }
        C14697Z1 c14697z1NewBuilder = LivekitModels$ClientConfiguration.newBuilder(this.clientConfiguration_);
        c14697z1NewBuilder.m13865f(livekitModels$ClientConfiguration);
        this.clientConfiguration_ = (LivekitModels$ClientConfiguration) c14697z1NewBuilder.m13862c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParticipant(LivekitModels$ParticipantInfo livekitModels$ParticipantInfo) {
        livekitModels$ParticipantInfo.getClass();
        LivekitModels$ParticipantInfo livekitModels$ParticipantInfo2 = this.participant_;
        if (livekitModels$ParticipantInfo2 == null || livekitModels$ParticipantInfo2 == LivekitModels$ParticipantInfo.getDefaultInstance()) {
            this.participant_ = livekitModels$ParticipantInfo;
            return;
        }
        C14802o2 c14802o2NewBuilder = LivekitModels$ParticipantInfo.newBuilder(this.participant_);
        c14802o2NewBuilder.m13865f(livekitModels$ParticipantInfo);
        this.participant_ = (LivekitModels$ParticipantInfo) c14802o2NewBuilder.m13862c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRoom(LivekitModels$Room livekitModels$Room) {
        livekitModels$Room.getClass();
        LivekitModels$Room livekitModels$Room2 = this.room_;
        if (livekitModels$Room2 == null || livekitModels$Room2 == LivekitModels$Room.getDefaultInstance()) {
            this.room_ = livekitModels$Room;
            return;
        }
        C14579F2 c14579f2NewBuilder = LivekitModels$Room.newBuilder(this.room_);
        c14579f2NewBuilder.m13865f(livekitModels$Room);
        this.room_ = (LivekitModels$Room) c14579f2NewBuilder.m13862c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeServerInfo(LivekitModels$ServerInfo livekitModels$ServerInfo) {
        livekitModels$ServerInfo.getClass();
        LivekitModels$ServerInfo livekitModels$ServerInfo2 = this.serverInfo_;
        if (livekitModels$ServerInfo2 == null || livekitModels$ServerInfo2 == LivekitModels$ServerInfo.getDefaultInstance()) {
            this.serverInfo_ = livekitModels$ServerInfo;
            return;
        }
        C14621M2 c14621m2NewBuilder = LivekitModels$ServerInfo.newBuilder(this.serverInfo_);
        c14621m2NewBuilder.m13865f(livekitModels$ServerInfo);
        this.serverInfo_ = (LivekitModels$ServerInfo) c14621m2NewBuilder.m13862c();
    }

    public static C14628N3 newBuilder() {
        return (C14628N3) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$JoinResponse parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$JoinResponse) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$JoinResponse parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$JoinResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEnabledPublishCodecs(int i10) {
        ensureEnabledPublishCodecsIsMutable();
        this.enabledPublishCodecs_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeIceServers(int i10) {
        ensureIceServersIsMutable();
        this.iceServers_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeOtherParticipants(int i10) {
        ensureOtherParticipantsIsMutable();
        this.otherParticipants_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlternativeUrl(String str) {
        str.getClass();
        this.alternativeUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlternativeUrlBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.alternativeUrl_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientConfiguration(LivekitModels$ClientConfiguration livekitModels$ClientConfiguration) {
        livekitModels$ClientConfiguration.getClass();
        this.clientConfiguration_ = livekitModels$ClientConfiguration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnabledPublishCodecs(int i10, LivekitModels$Codec livekitModels$Codec) {
        livekitModels$Codec.getClass();
        ensureEnabledPublishCodecsIsMutable();
        this.enabledPublishCodecs_.set(i10, livekitModels$Codec);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFastPublish(boolean z6) {
        this.fastPublish_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIceServers(int i10, LivekitRtc$ICEServer livekitRtc$ICEServer) {
        livekitRtc$ICEServer.getClass();
        ensureIceServersIsMutable();
        this.iceServers_.set(i10, livekitRtc$ICEServer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOtherParticipants(int i10, LivekitModels$ParticipantInfo livekitModels$ParticipantInfo) {
        livekitModels$ParticipantInfo.getClass();
        ensureOtherParticipantsIsMutable();
        this.otherParticipants_.set(i10, livekitModels$ParticipantInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipant(LivekitModels$ParticipantInfo livekitModels$ParticipantInfo) {
        livekitModels$ParticipantInfo.getClass();
        this.participant_ = livekitModels$ParticipantInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPingInterval(int i10) {
        this.pingInterval_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPingTimeout(int i10) {
        this.pingTimeout_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoom(LivekitModels$Room livekitModels$Room) {
        livekitModels$Room.getClass();
        this.room_ = livekitModels$Room;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerInfo(LivekitModels$ServerInfo livekitModels$ServerInfo) {
        livekitModels$ServerInfo.getClass();
        this.serverInfo_ = livekitModels$ServerInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerRegion(String str) {
        str.getClass();
        this.serverRegion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerRegionBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.serverRegion_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerVersion(String str) {
        str.getClass();
        this.serverVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerVersionBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.serverVersion_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSifTrailer(AbstractC12171m abstractC12171m) {
        abstractC12171m.getClass();
        this.sifTrailer_ = abstractC12171m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubscriberPrimary(boolean z6) {
        this.subscriberPrimary_ = z6;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000f\u0000\u0000\u0001\u000f\u000f\u0000\u0003\u0000\u0001\t\u0002\t\u0003\u001b\u0004Ȉ\u0005\u001b\u0006\u0007\u0007Ȉ\b\t\tȈ\n\u0004\u000b\u0004\f\t\r\n\u000e\u001b\u000f\u0007", new Object[]{"room_", "participant_", "otherParticipants_", LivekitModels$ParticipantInfo.class, "serverVersion_", "iceServers_", LivekitRtc$ICEServer.class, "subscriberPrimary_", "alternativeUrl_", "clientConfiguration_", "serverRegion_", "pingTimeout_", "pingInterval_", "serverInfo_", "sifTrailer_", "enabledPublishCodecs_", LivekitModels$Codec.class, "fastPublish_"});
            case 3:
                return new LivekitRtc$JoinResponse();
            case 4:
                return new C14628N3(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitRtc$JoinResponse.class) {
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

    public String getAlternativeUrl() {
        return this.alternativeUrl_;
    }

    public AbstractC12171m getAlternativeUrlBytes() {
        return AbstractC12171m.m14011m(this.alternativeUrl_);
    }

    public LivekitModels$ClientConfiguration getClientConfiguration() {
        LivekitModels$ClientConfiguration livekitModels$ClientConfiguration = this.clientConfiguration_;
        return livekitModels$ClientConfiguration == null ? LivekitModels$ClientConfiguration.getDefaultInstance() : livekitModels$ClientConfiguration;
    }

    public LivekitModels$Codec getEnabledPublishCodecs(int i10) {
        return (LivekitModels$Codec) this.enabledPublishCodecs_.get(i10);
    }

    public int getEnabledPublishCodecsCount() {
        return this.enabledPublishCodecs_.size();
    }

    public List<LivekitModels$Codec> getEnabledPublishCodecsList() {
        return this.enabledPublishCodecs_;
    }

    public InterfaceC14725d2 getEnabledPublishCodecsOrBuilder(int i10) {
        return (InterfaceC14725d2) this.enabledPublishCodecs_.get(i10);
    }

    public List<? extends InterfaceC14725d2> getEnabledPublishCodecsOrBuilderList() {
        return this.enabledPublishCodecs_;
    }

    public boolean getFastPublish() {
        return this.fastPublish_;
    }

    public LivekitRtc$ICEServer getIceServers(int i10) {
        return (LivekitRtc$ICEServer) this.iceServers_.get(i10);
    }

    public int getIceServersCount() {
        return this.iceServers_.size();
    }

    public List<LivekitRtc$ICEServer> getIceServersList() {
        return this.iceServers_;
    }

    public InterfaceC14622M3 getIceServersOrBuilder(int i10) {
        return (InterfaceC14622M3) this.iceServers_.get(i10);
    }

    public List<? extends InterfaceC14622M3> getIceServersOrBuilderList() {
        return this.iceServers_;
    }

    public LivekitModels$ParticipantInfo getOtherParticipants(int i10) {
        return (LivekitModels$ParticipantInfo) this.otherParticipants_.get(i10);
    }

    public int getOtherParticipantsCount() {
        return this.otherParticipants_.size();
    }

    public List<LivekitModels$ParticipantInfo> getOtherParticipantsList() {
        return this.otherParticipants_;
    }

    public InterfaceC14823r2 getOtherParticipantsOrBuilder(int i10) {
        return (InterfaceC14823r2) this.otherParticipants_.get(i10);
    }

    public List<? extends InterfaceC14823r2> getOtherParticipantsOrBuilderList() {
        return this.otherParticipants_;
    }

    public LivekitModels$ParticipantInfo getParticipant() {
        LivekitModels$ParticipantInfo livekitModels$ParticipantInfo = this.participant_;
        return livekitModels$ParticipantInfo == null ? LivekitModels$ParticipantInfo.getDefaultInstance() : livekitModels$ParticipantInfo;
    }

    public int getPingInterval() {
        return this.pingInterval_;
    }

    public int getPingTimeout() {
        return this.pingTimeout_;
    }

    public LivekitModels$Room getRoom() {
        LivekitModels$Room livekitModels$Room = this.room_;
        return livekitModels$Room == null ? LivekitModels$Room.getDefaultInstance() : livekitModels$Room;
    }

    public LivekitModels$ServerInfo getServerInfo() {
        LivekitModels$ServerInfo livekitModels$ServerInfo = this.serverInfo_;
        return livekitModels$ServerInfo == null ? LivekitModels$ServerInfo.getDefaultInstance() : livekitModels$ServerInfo;
    }

    public String getServerRegion() {
        return this.serverRegion_;
    }

    public AbstractC12171m getServerRegionBytes() {
        return AbstractC12171m.m14011m(this.serverRegion_);
    }

    public String getServerVersion() {
        return this.serverVersion_;
    }

    public AbstractC12171m getServerVersionBytes() {
        return AbstractC12171m.m14011m(this.serverVersion_);
    }

    public AbstractC12171m getSifTrailer() {
        return this.sifTrailer_;
    }

    public boolean getSubscriberPrimary() {
        return this.subscriberPrimary_;
    }

    public boolean hasClientConfiguration() {
        return this.clientConfiguration_ != null;
    }

    public boolean hasParticipant() {
        return this.participant_ != null;
    }

    public boolean hasRoom() {
        return this.room_ != null;
    }

    public boolean hasServerInfo() {
        return this.serverInfo_ != null;
    }

    public static C14628N3 newBuilder(LivekitRtc$JoinResponse livekitRtc$JoinResponse) {
        return (C14628N3) DEFAULT_INSTANCE.createBuilder(livekitRtc$JoinResponse);
    }

    public static LivekitRtc$JoinResponse parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$JoinResponse) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$JoinResponse parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitRtc$JoinResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitRtc$JoinResponse parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitRtc$JoinResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEnabledPublishCodecs(int i10, LivekitModels$Codec livekitModels$Codec) {
        livekitModels$Codec.getClass();
        ensureEnabledPublishCodecsIsMutable();
        this.enabledPublishCodecs_.add(i10, livekitModels$Codec);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addIceServers(int i10, LivekitRtc$ICEServer livekitRtc$ICEServer) {
        livekitRtc$ICEServer.getClass();
        ensureIceServersIsMutable();
        this.iceServers_.add(i10, livekitRtc$ICEServer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOtherParticipants(int i10, LivekitModels$ParticipantInfo livekitModels$ParticipantInfo) {
        livekitModels$ParticipantInfo.getClass();
        ensureOtherParticipantsIsMutable();
        this.otherParticipants_.add(i10, livekitModels$ParticipantInfo);
    }

    public static LivekitRtc$JoinResponse parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitRtc$JoinResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitRtc$JoinResponse parseFrom(byte[] bArr) {
        return (LivekitRtc$JoinResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$JoinResponse parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitRtc$JoinResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitRtc$JoinResponse parseFrom(InputStream inputStream) {
        return (LivekitRtc$JoinResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$JoinResponse parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$JoinResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$JoinResponse parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitRtc$JoinResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitRtc$JoinResponse parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitRtc$JoinResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
