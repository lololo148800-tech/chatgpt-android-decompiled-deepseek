package livekit;

import com.google.protobuf.AbstractC12133Z;
import com.google.protobuf.AbstractC12138b;
import com.google.protobuf.AbstractC12171m;
import com.google.protobuf.AbstractC12186r;
import com.google.protobuf.C12087F;
import com.google.protobuf.C12123U;
import com.google.protobuf.C12167k1;
import com.google.protobuf.EnumC12131Y;
import com.google.protobuf.InterfaceC12124U0;
import com.google.protobuf.Timestamp;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p793ho.C14558C2;
import p793ho.C14579F2;
import p793ho.C14582G;
import p793ho.C14588H;
import p793ho.C14674V2;
import p793ho.C14704a2;
import p793ho.C14751h0;
import p793ho.C14802o2;
import p793ho.C14815q1;
import p793ho.EnumC14600J;
import p793ho.EnumC14761i3;
import p793ho.InterfaceC14594I;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitAnalytics$AnalyticsEvent extends AbstractC12133Z implements InterfaceC14594I {
    public static final int ANALYTICS_KEY_FIELD_NUMBER = 10;
    public static final int CLIENT_INFO_FIELD_NUMBER = 11;
    public static final int CLIENT_META_FIELD_NUMBER = 12;
    private static final LivekitAnalytics$AnalyticsEvent DEFAULT_INSTANCE;
    public static final int EGRESS_FIELD_NUMBER = 17;
    public static final int EGRESS_ID_FIELD_NUMBER = 13;
    public static final int ERROR_FIELD_NUMBER = 20;
    public static final int ID_FIELD_NUMBER = 25;
    public static final int INGRESS_FIELD_NUMBER = 18;
    public static final int INGRESS_ID_FIELD_NUMBER = 19;
    public static final int MAX_SUBSCRIBED_VIDEO_QUALITY_FIELD_NUMBER = 14;
    public static final int MIME_FIELD_NUMBER = 16;
    public static final int NODE_ID_FIELD_NUMBER = 24;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int PARTICIPANT_FIELD_NUMBER = 6;
    public static final int PARTICIPANT_ID_FIELD_NUMBER = 5;
    public static final int PUBLISHER_FIELD_NUMBER = 15;
    public static final int ROOM_FIELD_NUMBER = 4;
    public static final int ROOM_ID_FIELD_NUMBER = 3;
    public static final int RTP_STATS_FIELD_NUMBER = 21;
    public static final int TIMESTAMP_FIELD_NUMBER = 2;
    public static final int TRACK_FIELD_NUMBER = 8;
    public static final int TRACK_ID_FIELD_NUMBER = 7;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int VIDEO_LAYER_FIELD_NUMBER = 22;
    private LivekitModels$ClientInfo clientInfo_;
    private LivekitAnalytics$AnalyticsClientMeta clientMeta_;
    private LivekitEgress$EgressInfo egress_;
    private LivekitIngress$IngressInfo ingress_;
    private int maxSubscribedVideoQuality_;
    private LivekitModels$ParticipantInfo participant_;
    private LivekitModels$ParticipantInfo publisher_;
    private LivekitModels$Room room_;
    private LivekitModels$RTPStats rtpStats_;
    private Timestamp timestamp_;
    private LivekitModels$TrackInfo track_;
    private int type_;
    private int videoLayer_;
    private String id_ = "";
    private String roomId_ = "";
    private String participantId_ = "";
    private String trackId_ = "";
    private String analyticsKey_ = "";
    private String egressId_ = "";
    private String ingressId_ = "";
    private String mime_ = "";
    private String error_ = "";
    private String nodeId_ = "";

    static {
        LivekitAnalytics$AnalyticsEvent livekitAnalytics$AnalyticsEvent = new LivekitAnalytics$AnalyticsEvent();
        DEFAULT_INSTANCE = livekitAnalytics$AnalyticsEvent;
        AbstractC12133Z.registerDefaultInstance(LivekitAnalytics$AnalyticsEvent.class, livekitAnalytics$AnalyticsEvent);
    }

    private LivekitAnalytics$AnalyticsEvent() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAnalyticsKey() {
        this.analyticsKey_ = getDefaultInstance().getAnalyticsKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientInfo() {
        this.clientInfo_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientMeta() {
        this.clientMeta_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEgress() {
        this.egress_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEgressId() {
        this.egressId_ = getDefaultInstance().getEgressId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearError() {
        this.error_ = getDefaultInstance().getError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIngress() {
        this.ingress_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIngressId() {
        this.ingressId_ = getDefaultInstance().getIngressId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxSubscribedVideoQuality() {
        this.maxSubscribedVideoQuality_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMime() {
        this.mime_ = getDefaultInstance().getMime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNodeId() {
        this.nodeId_ = getDefaultInstance().getNodeId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipant() {
        this.participant_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipantId() {
        this.participantId_ = getDefaultInstance().getParticipantId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPublisher() {
        this.publisher_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoom() {
        this.room_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoomId() {
        this.roomId_ = getDefaultInstance().getRoomId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRtpStats() {
        this.rtpStats_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.timestamp_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrack() {
        this.track_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackId() {
        this.trackId_ = getDefaultInstance().getTrackId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVideoLayer() {
        this.videoLayer_ = 0;
    }

    public static LivekitAnalytics$AnalyticsEvent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeClientInfo(LivekitModels$ClientInfo livekitModels$ClientInfo) {
        livekitModels$ClientInfo.getClass();
        LivekitModels$ClientInfo livekitModels$ClientInfo2 = this.clientInfo_;
        if (livekitModels$ClientInfo2 == null || livekitModels$ClientInfo2 == LivekitModels$ClientInfo.getDefaultInstance()) {
            this.clientInfo_ = livekitModels$ClientInfo;
            return;
        }
        C14704a2 c14704a2NewBuilder = LivekitModels$ClientInfo.newBuilder(this.clientInfo_);
        c14704a2NewBuilder.m13865f(livekitModels$ClientInfo);
        this.clientInfo_ = (LivekitModels$ClientInfo) c14704a2NewBuilder.m13862c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeClientMeta(LivekitAnalytics$AnalyticsClientMeta livekitAnalytics$AnalyticsClientMeta) {
        livekitAnalytics$AnalyticsClientMeta.getClass();
        LivekitAnalytics$AnalyticsClientMeta livekitAnalytics$AnalyticsClientMeta2 = this.clientMeta_;
        if (livekitAnalytics$AnalyticsClientMeta2 == null || livekitAnalytics$AnalyticsClientMeta2 == LivekitAnalytics$AnalyticsClientMeta.getDefaultInstance()) {
            this.clientMeta_ = livekitAnalytics$AnalyticsClientMeta;
            return;
        }
        C14582G c14582gNewBuilder = LivekitAnalytics$AnalyticsClientMeta.newBuilder(this.clientMeta_);
        c14582gNewBuilder.m13865f(livekitAnalytics$AnalyticsClientMeta);
        this.clientMeta_ = (LivekitAnalytics$AnalyticsClientMeta) c14582gNewBuilder.m13862c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEgress(LivekitEgress$EgressInfo livekitEgress$EgressInfo) {
        livekitEgress$EgressInfo.getClass();
        LivekitEgress$EgressInfo livekitEgress$EgressInfo2 = this.egress_;
        if (livekitEgress$EgressInfo2 == null || livekitEgress$EgressInfo2 == LivekitEgress$EgressInfo.getDefaultInstance()) {
            this.egress_ = livekitEgress$EgressInfo;
            return;
        }
        C14751h0 c14751h0NewBuilder = LivekitEgress$EgressInfo.newBuilder(this.egress_);
        c14751h0NewBuilder.m13865f(livekitEgress$EgressInfo);
        this.egress_ = (LivekitEgress$EgressInfo) c14751h0NewBuilder.m13862c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeIngress(LivekitIngress$IngressInfo livekitIngress$IngressInfo) {
        livekitIngress$IngressInfo.getClass();
        LivekitIngress$IngressInfo livekitIngress$IngressInfo2 = this.ingress_;
        if (livekitIngress$IngressInfo2 == null || livekitIngress$IngressInfo2 == LivekitIngress$IngressInfo.getDefaultInstance()) {
            this.ingress_ = livekitIngress$IngressInfo;
            return;
        }
        C14815q1 c14815q1NewBuilder = LivekitIngress$IngressInfo.newBuilder(this.ingress_);
        c14815q1NewBuilder.m13865f(livekitIngress$IngressInfo);
        this.ingress_ = (LivekitIngress$IngressInfo) c14815q1NewBuilder.m13862c();
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
    public void mergePublisher(LivekitModels$ParticipantInfo livekitModels$ParticipantInfo) {
        livekitModels$ParticipantInfo.getClass();
        LivekitModels$ParticipantInfo livekitModels$ParticipantInfo2 = this.publisher_;
        if (livekitModels$ParticipantInfo2 == null || livekitModels$ParticipantInfo2 == LivekitModels$ParticipantInfo.getDefaultInstance()) {
            this.publisher_ = livekitModels$ParticipantInfo;
            return;
        }
        C14802o2 c14802o2NewBuilder = LivekitModels$ParticipantInfo.newBuilder(this.publisher_);
        c14802o2NewBuilder.m13865f(livekitModels$ParticipantInfo);
        this.publisher_ = (LivekitModels$ParticipantInfo) c14802o2NewBuilder.m13862c();
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
    public void mergeRtpStats(LivekitModels$RTPStats livekitModels$RTPStats) {
        livekitModels$RTPStats.getClass();
        LivekitModels$RTPStats livekitModels$RTPStats2 = this.rtpStats_;
        if (livekitModels$RTPStats2 == null || livekitModels$RTPStats2 == LivekitModels$RTPStats.getDefaultInstance()) {
            this.rtpStats_ = livekitModels$RTPStats;
            return;
        }
        C14558C2 c14558c2NewBuilder = LivekitModels$RTPStats.newBuilder(this.rtpStats_);
        c14558c2NewBuilder.m13865f(livekitModels$RTPStats);
        this.rtpStats_ = (LivekitModels$RTPStats) c14558c2NewBuilder.m13862c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTimestamp(Timestamp timestamp) {
        timestamp.getClass();
        Timestamp timestamp2 = this.timestamp_;
        if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
            this.timestamp_ = timestamp;
            return;
        }
        C12167k1 c12167k1NewBuilder = Timestamp.newBuilder(this.timestamp_);
        c12167k1NewBuilder.m13865f(timestamp);
        this.timestamp_ = (Timestamp) c12167k1NewBuilder.m13862c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTrack(LivekitModels$TrackInfo livekitModels$TrackInfo) {
        livekitModels$TrackInfo.getClass();
        LivekitModels$TrackInfo livekitModels$TrackInfo2 = this.track_;
        if (livekitModels$TrackInfo2 == null || livekitModels$TrackInfo2 == LivekitModels$TrackInfo.getDefaultInstance()) {
            this.track_ = livekitModels$TrackInfo;
            return;
        }
        C14674V2 c14674v2NewBuilder = LivekitModels$TrackInfo.newBuilder(this.track_);
        c14674v2NewBuilder.m13865f(livekitModels$TrackInfo);
        this.track_ = (LivekitModels$TrackInfo) c14674v2NewBuilder.m13862c();
    }

    public static C14588H newBuilder() {
        return (C14588H) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitAnalytics$AnalyticsEvent parseDelimitedFrom(InputStream inputStream) {
        return (LivekitAnalytics$AnalyticsEvent) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAnalytics$AnalyticsEvent parseFrom(ByteBuffer byteBuffer) {
        return (LivekitAnalytics$AnalyticsEvent) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnalyticsKey(String str) {
        str.getClass();
        this.analyticsKey_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnalyticsKeyBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.analyticsKey_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientInfo(LivekitModels$ClientInfo livekitModels$ClientInfo) {
        livekitModels$ClientInfo.getClass();
        this.clientInfo_ = livekitModels$ClientInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientMeta(LivekitAnalytics$AnalyticsClientMeta livekitAnalytics$AnalyticsClientMeta) {
        livekitAnalytics$AnalyticsClientMeta.getClass();
        this.clientMeta_ = livekitAnalytics$AnalyticsClientMeta;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEgress(LivekitEgress$EgressInfo livekitEgress$EgressInfo) {
        livekitEgress$EgressInfo.getClass();
        this.egress_ = livekitEgress$EgressInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEgressId(String str) {
        str.getClass();
        this.egressId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEgressIdBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.egressId_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setError(String str) {
        str.getClass();
        this.error_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.error_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        str.getClass();
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.id_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIngress(LivekitIngress$IngressInfo livekitIngress$IngressInfo) {
        livekitIngress$IngressInfo.getClass();
        this.ingress_ = livekitIngress$IngressInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIngressId(String str) {
        str.getClass();
        this.ingressId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIngressIdBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.ingressId_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxSubscribedVideoQuality(EnumC14761i3 enumC14761i3) {
        this.maxSubscribedVideoQuality_ = enumC14761i3.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxSubscribedVideoQualityValue(int i10) {
        this.maxSubscribedVideoQuality_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMime(String str) {
        str.getClass();
        this.mime_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMimeBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.mime_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNodeId(String str) {
        str.getClass();
        this.nodeId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNodeIdBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.nodeId_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipant(LivekitModels$ParticipantInfo livekitModels$ParticipantInfo) {
        livekitModels$ParticipantInfo.getClass();
        this.participant_ = livekitModels$ParticipantInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipantId(String str) {
        str.getClass();
        this.participantId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipantIdBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.participantId_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPublisher(LivekitModels$ParticipantInfo livekitModels$ParticipantInfo) {
        livekitModels$ParticipantInfo.getClass();
        this.publisher_ = livekitModels$ParticipantInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoom(LivekitModels$Room livekitModels$Room) {
        livekitModels$Room.getClass();
        this.room_ = livekitModels$Room;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoomId(String str) {
        str.getClass();
        this.roomId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoomIdBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.roomId_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRtpStats(LivekitModels$RTPStats livekitModels$RTPStats) {
        livekitModels$RTPStats.getClass();
        this.rtpStats_ = livekitModels$RTPStats;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestamp(Timestamp timestamp) {
        timestamp.getClass();
        this.timestamp_ = timestamp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrack(LivekitModels$TrackInfo livekitModels$TrackInfo) {
        livekitModels$TrackInfo.getClass();
        this.track_ = livekitModels$TrackInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackId(String str) {
        str.getClass();
        this.trackId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackIdBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.trackId_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(EnumC14600J enumC14600J) {
        this.type_ = enumC14600J.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i10) {
        this.type_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoLayer(int i10) {
        this.videoLayer_ = i10;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0017\u0000\u0000\u0001\u0019\u0017\u0000\u0000\u0000\u0001\f\u0002\t\u0003Ȉ\u0004\t\u0005Ȉ\u0006\t\u0007Ȉ\b\t\nȈ\u000b\t\f\t\rȈ\u000e\f\u000f\t\u0010Ȉ\u0011\t\u0012\t\u0013Ȉ\u0014Ȉ\u0015\t\u0016\u0004\u0018Ȉ\u0019Ȉ", new Object[]{"type_", "timestamp_", "roomId_", "room_", "participantId_", "participant_", "trackId_", "track_", "analyticsKey_", "clientInfo_", "clientMeta_", "egressId_", "maxSubscribedVideoQuality_", "publisher_", "mime_", "egress_", "ingress_", "ingressId_", "error_", "rtpStats_", "videoLayer_", "nodeId_", "id_"});
            case 3:
                return new LivekitAnalytics$AnalyticsEvent();
            case 4:
                return new C14588H(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitAnalytics$AnalyticsEvent.class) {
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

    public String getAnalyticsKey() {
        return this.analyticsKey_;
    }

    public AbstractC12171m getAnalyticsKeyBytes() {
        return AbstractC12171m.m14011m(this.analyticsKey_);
    }

    public LivekitModels$ClientInfo getClientInfo() {
        LivekitModels$ClientInfo livekitModels$ClientInfo = this.clientInfo_;
        return livekitModels$ClientInfo == null ? LivekitModels$ClientInfo.getDefaultInstance() : livekitModels$ClientInfo;
    }

    public LivekitAnalytics$AnalyticsClientMeta getClientMeta() {
        LivekitAnalytics$AnalyticsClientMeta livekitAnalytics$AnalyticsClientMeta = this.clientMeta_;
        return livekitAnalytics$AnalyticsClientMeta == null ? LivekitAnalytics$AnalyticsClientMeta.getDefaultInstance() : livekitAnalytics$AnalyticsClientMeta;
    }

    public LivekitEgress$EgressInfo getEgress() {
        LivekitEgress$EgressInfo livekitEgress$EgressInfo = this.egress_;
        return livekitEgress$EgressInfo == null ? LivekitEgress$EgressInfo.getDefaultInstance() : livekitEgress$EgressInfo;
    }

    public String getEgressId() {
        return this.egressId_;
    }

    public AbstractC12171m getEgressIdBytes() {
        return AbstractC12171m.m14011m(this.egressId_);
    }

    public String getError() {
        return this.error_;
    }

    public AbstractC12171m getErrorBytes() {
        return AbstractC12171m.m14011m(this.error_);
    }

    public String getId() {
        return this.id_;
    }

    public AbstractC12171m getIdBytes() {
        return AbstractC12171m.m14011m(this.id_);
    }

    public LivekitIngress$IngressInfo getIngress() {
        LivekitIngress$IngressInfo livekitIngress$IngressInfo = this.ingress_;
        return livekitIngress$IngressInfo == null ? LivekitIngress$IngressInfo.getDefaultInstance() : livekitIngress$IngressInfo;
    }

    public String getIngressId() {
        return this.ingressId_;
    }

    public AbstractC12171m getIngressIdBytes() {
        return AbstractC12171m.m14011m(this.ingressId_);
    }

    public EnumC14761i3 getMaxSubscribedVideoQuality() {
        EnumC14761i3 enumC14761i3M16050a = EnumC14761i3.m16050a(this.maxSubscribedVideoQuality_);
        return enumC14761i3M16050a == null ? EnumC14761i3.UNRECOGNIZED : enumC14761i3M16050a;
    }

    public int getMaxSubscribedVideoQualityValue() {
        return this.maxSubscribedVideoQuality_;
    }

    public String getMime() {
        return this.mime_;
    }

    public AbstractC12171m getMimeBytes() {
        return AbstractC12171m.m14011m(this.mime_);
    }

    public String getNodeId() {
        return this.nodeId_;
    }

    public AbstractC12171m getNodeIdBytes() {
        return AbstractC12171m.m14011m(this.nodeId_);
    }

    public LivekitModels$ParticipantInfo getParticipant() {
        LivekitModels$ParticipantInfo livekitModels$ParticipantInfo = this.participant_;
        return livekitModels$ParticipantInfo == null ? LivekitModels$ParticipantInfo.getDefaultInstance() : livekitModels$ParticipantInfo;
    }

    public String getParticipantId() {
        return this.participantId_;
    }

    public AbstractC12171m getParticipantIdBytes() {
        return AbstractC12171m.m14011m(this.participantId_);
    }

    public LivekitModels$ParticipantInfo getPublisher() {
        LivekitModels$ParticipantInfo livekitModels$ParticipantInfo = this.publisher_;
        return livekitModels$ParticipantInfo == null ? LivekitModels$ParticipantInfo.getDefaultInstance() : livekitModels$ParticipantInfo;
    }

    public LivekitModels$Room getRoom() {
        LivekitModels$Room livekitModels$Room = this.room_;
        return livekitModels$Room == null ? LivekitModels$Room.getDefaultInstance() : livekitModels$Room;
    }

    public String getRoomId() {
        return this.roomId_;
    }

    public AbstractC12171m getRoomIdBytes() {
        return AbstractC12171m.m14011m(this.roomId_);
    }

    public LivekitModels$RTPStats getRtpStats() {
        LivekitModels$RTPStats livekitModels$RTPStats = this.rtpStats_;
        return livekitModels$RTPStats == null ? LivekitModels$RTPStats.getDefaultInstance() : livekitModels$RTPStats;
    }

    public Timestamp getTimestamp() {
        Timestamp timestamp = this.timestamp_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public LivekitModels$TrackInfo getTrack() {
        LivekitModels$TrackInfo livekitModels$TrackInfo = this.track_;
        return livekitModels$TrackInfo == null ? LivekitModels$TrackInfo.getDefaultInstance() : livekitModels$TrackInfo;
    }

    public String getTrackId() {
        return this.trackId_;
    }

    public AbstractC12171m getTrackIdBytes() {
        return AbstractC12171m.m14011m(this.trackId_);
    }

    public EnumC14600J getType() {
        EnumC14600J enumC14600J;
        switch (this.type_) {
            case 0:
                enumC14600J = EnumC14600J.ROOM_CREATED;
                break;
            case 1:
                enumC14600J = EnumC14600J.ROOM_ENDED;
                break;
            case 2:
                enumC14600J = EnumC14600J.PARTICIPANT_JOINED;
                break;
            case 3:
                enumC14600J = EnumC14600J.PARTICIPANT_LEFT;
                break;
            case 4:
                enumC14600J = EnumC14600J.TRACK_PUBLISHED;
                break;
            case 5:
                enumC14600J = EnumC14600J.TRACK_UNPUBLISHED;
                break;
            case 6:
                enumC14600J = EnumC14600J.TRACK_SUBSCRIBED;
                break;
            case 7:
                enumC14600J = EnumC14600J.TRACK_UNSUBSCRIBED;
                break;
            case 8:
            case 9:
            default:
                enumC14600J = null;
                break;
            case 10:
                enumC14600J = EnumC14600J.TRACK_PUBLISHED_UPDATE;
                break;
            case 11:
                enumC14600J = EnumC14600J.PARTICIPANT_ACTIVE;
                break;
            case 12:
                enumC14600J = EnumC14600J.EGRESS_STARTED;
                break;
            case 13:
                enumC14600J = EnumC14600J.EGRESS_ENDED;
                break;
            case 14:
                enumC14600J = EnumC14600J.TRACK_MAX_SUBSCRIBED_VIDEO_QUALITY;
                break;
            case 15:
                enumC14600J = EnumC14600J.RECONNECTED;
                break;
            case 16:
                enumC14600J = EnumC14600J.INGRESS_STARTED;
                break;
            case 17:
                enumC14600J = EnumC14600J.INGRESS_ENDED;
                break;
            case 18:
                enumC14600J = EnumC14600J.INGRESS_CREATED;
                break;
            case 19:
                enumC14600J = EnumC14600J.INGRESS_DELETED;
                break;
            case 20:
                enumC14600J = EnumC14600J.TRACK_PUBLISH_REQUESTED;
                break;
            case 21:
                enumC14600J = EnumC14600J.TRACK_SUBSCRIBE_REQUESTED;
                break;
            case 22:
                enumC14600J = EnumC14600J.PARTICIPANT_RESUMED;
                break;
            case 23:
                enumC14600J = EnumC14600J.TRACK_MUTED;
                break;
            case 24:
                enumC14600J = EnumC14600J.TRACK_UNMUTED;
                break;
            case 25:
                enumC14600J = EnumC14600J.TRACK_SUBSCRIBE_FAILED;
                break;
            case 26:
                enumC14600J = EnumC14600J.TRACK_PUBLISH_STATS;
                break;
            case 27:
                enumC14600J = EnumC14600J.TRACK_SUBSCRIBE_STATS;
                break;
            case 28:
                enumC14600J = EnumC14600J.EGRESS_UPDATED;
                break;
            case 29:
                enumC14600J = EnumC14600J.INGRESS_UPDATED;
                break;
        }
        return enumC14600J == null ? EnumC14600J.UNRECOGNIZED : enumC14600J;
    }

    public int getTypeValue() {
        return this.type_;
    }

    public int getVideoLayer() {
        return this.videoLayer_;
    }

    public boolean hasClientInfo() {
        return this.clientInfo_ != null;
    }

    public boolean hasClientMeta() {
        return this.clientMeta_ != null;
    }

    public boolean hasEgress() {
        return this.egress_ != null;
    }

    public boolean hasIngress() {
        return this.ingress_ != null;
    }

    public boolean hasParticipant() {
        return this.participant_ != null;
    }

    public boolean hasPublisher() {
        return this.publisher_ != null;
    }

    public boolean hasRoom() {
        return this.room_ != null;
    }

    public boolean hasRtpStats() {
        return this.rtpStats_ != null;
    }

    public boolean hasTimestamp() {
        return this.timestamp_ != null;
    }

    public boolean hasTrack() {
        return this.track_ != null;
    }

    public static C14588H newBuilder(LivekitAnalytics$AnalyticsEvent livekitAnalytics$AnalyticsEvent) {
        return (C14588H) DEFAULT_INSTANCE.createBuilder(livekitAnalytics$AnalyticsEvent);
    }

    public static LivekitAnalytics$AnalyticsEvent parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitAnalytics$AnalyticsEvent) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitAnalytics$AnalyticsEvent parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitAnalytics$AnalyticsEvent) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitAnalytics$AnalyticsEvent parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitAnalytics$AnalyticsEvent) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitAnalytics$AnalyticsEvent parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitAnalytics$AnalyticsEvent) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitAnalytics$AnalyticsEvent parseFrom(byte[] bArr) {
        return (LivekitAnalytics$AnalyticsEvent) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitAnalytics$AnalyticsEvent parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitAnalytics$AnalyticsEvent) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitAnalytics$AnalyticsEvent parseFrom(InputStream inputStream) {
        return (LivekitAnalytics$AnalyticsEvent) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAnalytics$AnalyticsEvent parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitAnalytics$AnalyticsEvent) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitAnalytics$AnalyticsEvent parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitAnalytics$AnalyticsEvent) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitAnalytics$AnalyticsEvent parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitAnalytics$AnalyticsEvent) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
