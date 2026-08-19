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
import p793ho.C14575E5;
import p793ho.C14579F2;
import p793ho.C14674V2;
import p793ho.C14751h0;
import p793ho.C14802o2;
import p793ho.C14815q1;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitWebhook$WebhookEvent extends AbstractC12133Z implements InterfaceC12094H0 {
    public static final int CREATED_AT_FIELD_NUMBER = 7;
    private static final LivekitWebhook$WebhookEvent DEFAULT_INSTANCE;
    public static final int EGRESS_INFO_FIELD_NUMBER = 9;
    public static final int EVENT_FIELD_NUMBER = 1;
    public static final int ID_FIELD_NUMBER = 6;
    public static final int INGRESS_INFO_FIELD_NUMBER = 10;
    public static final int NUM_DROPPED_FIELD_NUMBER = 11;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int PARTICIPANT_FIELD_NUMBER = 3;
    public static final int ROOM_FIELD_NUMBER = 2;
    public static final int TRACK_FIELD_NUMBER = 8;
    private long createdAt_;
    private LivekitEgress$EgressInfo egressInfo_;
    private String event_ = "";
    private String id_ = "";
    private LivekitIngress$IngressInfo ingressInfo_;
    private int numDropped_;
    private LivekitModels$ParticipantInfo participant_;
    private LivekitModels$Room room_;
    private LivekitModels$TrackInfo track_;

    static {
        LivekitWebhook$WebhookEvent livekitWebhook$WebhookEvent = new LivekitWebhook$WebhookEvent();
        DEFAULT_INSTANCE = livekitWebhook$WebhookEvent;
        AbstractC12133Z.registerDefaultInstance(LivekitWebhook$WebhookEvent.class, livekitWebhook$WebhookEvent);
    }

    private LivekitWebhook$WebhookEvent() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreatedAt() {
        this.createdAt_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEgressInfo() {
        this.egressInfo_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEvent() {
        this.event_ = getDefaultInstance().getEvent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIngressInfo() {
        this.ingressInfo_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumDropped() {
        this.numDropped_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipant() {
        this.participant_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoom() {
        this.room_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrack() {
        this.track_ = null;
    }

    public static LivekitWebhook$WebhookEvent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEgressInfo(LivekitEgress$EgressInfo livekitEgress$EgressInfo) {
        livekitEgress$EgressInfo.getClass();
        LivekitEgress$EgressInfo livekitEgress$EgressInfo2 = this.egressInfo_;
        if (livekitEgress$EgressInfo2 == null || livekitEgress$EgressInfo2 == LivekitEgress$EgressInfo.getDefaultInstance()) {
            this.egressInfo_ = livekitEgress$EgressInfo;
            return;
        }
        C14751h0 c14751h0NewBuilder = LivekitEgress$EgressInfo.newBuilder(this.egressInfo_);
        c14751h0NewBuilder.m13865f(livekitEgress$EgressInfo);
        this.egressInfo_ = (LivekitEgress$EgressInfo) c14751h0NewBuilder.m13862c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeIngressInfo(LivekitIngress$IngressInfo livekitIngress$IngressInfo) {
        livekitIngress$IngressInfo.getClass();
        LivekitIngress$IngressInfo livekitIngress$IngressInfo2 = this.ingressInfo_;
        if (livekitIngress$IngressInfo2 == null || livekitIngress$IngressInfo2 == LivekitIngress$IngressInfo.getDefaultInstance()) {
            this.ingressInfo_ = livekitIngress$IngressInfo;
            return;
        }
        C14815q1 c14815q1NewBuilder = LivekitIngress$IngressInfo.newBuilder(this.ingressInfo_);
        c14815q1NewBuilder.m13865f(livekitIngress$IngressInfo);
        this.ingressInfo_ = (LivekitIngress$IngressInfo) c14815q1NewBuilder.m13862c();
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

    public static C14575E5 newBuilder() {
        return (C14575E5) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitWebhook$WebhookEvent parseDelimitedFrom(InputStream inputStream) {
        return (LivekitWebhook$WebhookEvent) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitWebhook$WebhookEvent parseFrom(ByteBuffer byteBuffer) {
        return (LivekitWebhook$WebhookEvent) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreatedAt(long j10) {
        this.createdAt_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEgressInfo(LivekitEgress$EgressInfo livekitEgress$EgressInfo) {
        livekitEgress$EgressInfo.getClass();
        this.egressInfo_ = livekitEgress$EgressInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEvent(String str) {
        str.getClass();
        this.event_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.event_ = abstractC12171m.m14012w();
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
    public void setIngressInfo(LivekitIngress$IngressInfo livekitIngress$IngressInfo) {
        livekitIngress$IngressInfo.getClass();
        this.ingressInfo_ = livekitIngress$IngressInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumDropped(int i10) {
        this.numDropped_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipant(LivekitModels$ParticipantInfo livekitModels$ParticipantInfo) {
        livekitModels$ParticipantInfo.getClass();
        this.participant_ = livekitModels$ParticipantInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoom(LivekitModels$Room livekitModels$Room) {
        livekitModels$Room.getClass();
        this.room_ = livekitModels$Room;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrack(LivekitModels$TrackInfo livekitModels$TrackInfo) {
        livekitModels$TrackInfo.getClass();
        this.track_ = livekitModels$TrackInfo;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\u000b\t\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0003\t\u0006Ȉ\u0007\u0002\b\t\t\t\n\t\u000b\u0004", new Object[]{"event_", "room_", "participant_", "id_", "createdAt_", "track_", "egressInfo_", "ingressInfo_", "numDropped_"});
            case 3:
                return new LivekitWebhook$WebhookEvent();
            case 4:
                return new C14575E5(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitWebhook$WebhookEvent.class) {
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

    public long getCreatedAt() {
        return this.createdAt_;
    }

    public LivekitEgress$EgressInfo getEgressInfo() {
        LivekitEgress$EgressInfo livekitEgress$EgressInfo = this.egressInfo_;
        return livekitEgress$EgressInfo == null ? LivekitEgress$EgressInfo.getDefaultInstance() : livekitEgress$EgressInfo;
    }

    public String getEvent() {
        return this.event_;
    }

    public AbstractC12171m getEventBytes() {
        return AbstractC12171m.m14011m(this.event_);
    }

    public String getId() {
        return this.id_;
    }

    public AbstractC12171m getIdBytes() {
        return AbstractC12171m.m14011m(this.id_);
    }

    public LivekitIngress$IngressInfo getIngressInfo() {
        LivekitIngress$IngressInfo livekitIngress$IngressInfo = this.ingressInfo_;
        return livekitIngress$IngressInfo == null ? LivekitIngress$IngressInfo.getDefaultInstance() : livekitIngress$IngressInfo;
    }

    public int getNumDropped() {
        return this.numDropped_;
    }

    public LivekitModels$ParticipantInfo getParticipant() {
        LivekitModels$ParticipantInfo livekitModels$ParticipantInfo = this.participant_;
        return livekitModels$ParticipantInfo == null ? LivekitModels$ParticipantInfo.getDefaultInstance() : livekitModels$ParticipantInfo;
    }

    public LivekitModels$Room getRoom() {
        LivekitModels$Room livekitModels$Room = this.room_;
        return livekitModels$Room == null ? LivekitModels$Room.getDefaultInstance() : livekitModels$Room;
    }

    public LivekitModels$TrackInfo getTrack() {
        LivekitModels$TrackInfo livekitModels$TrackInfo = this.track_;
        return livekitModels$TrackInfo == null ? LivekitModels$TrackInfo.getDefaultInstance() : livekitModels$TrackInfo;
    }

    public boolean hasEgressInfo() {
        return this.egressInfo_ != null;
    }

    public boolean hasIngressInfo() {
        return this.ingressInfo_ != null;
    }

    public boolean hasParticipant() {
        return this.participant_ != null;
    }

    public boolean hasRoom() {
        return this.room_ != null;
    }

    public boolean hasTrack() {
        return this.track_ != null;
    }

    public static C14575E5 newBuilder(LivekitWebhook$WebhookEvent livekitWebhook$WebhookEvent) {
        return (C14575E5) DEFAULT_INSTANCE.createBuilder(livekitWebhook$WebhookEvent);
    }

    public static LivekitWebhook$WebhookEvent parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitWebhook$WebhookEvent) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitWebhook$WebhookEvent parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitWebhook$WebhookEvent) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitWebhook$WebhookEvent parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitWebhook$WebhookEvent) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitWebhook$WebhookEvent parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitWebhook$WebhookEvent) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitWebhook$WebhookEvent parseFrom(byte[] bArr) {
        return (LivekitWebhook$WebhookEvent) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitWebhook$WebhookEvent parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitWebhook$WebhookEvent) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitWebhook$WebhookEvent parseFrom(InputStream inputStream) {
        return (LivekitWebhook$WebhookEvent) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitWebhook$WebhookEvent parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitWebhook$WebhookEvent) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitWebhook$WebhookEvent parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitWebhook$WebhookEvent) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitWebhook$WebhookEvent parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitWebhook$WebhookEvent) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
