package livekit;

import com.google.protobuf.AbstractC12133Z;
import com.google.protobuf.AbstractC12138b;
import com.google.protobuf.AbstractC12141c;
import com.google.protobuf.AbstractC12171m;
import com.google.protobuf.AbstractC12186r;
import com.google.protobuf.C12087F;
import com.google.protobuf.C12123U;
import com.google.protobuf.C12167k1;
import com.google.protobuf.EnumC12131Y;
import com.google.protobuf.InterfaceC12124U0;
import com.google.protobuf.InterfaceC12172m0;
import com.google.protobuf.Timestamp;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p174Gk.uSfJ.HpucjswO;
import p793ho.C14642Q;
import p793ho.EnumC14689Y;
import p793ho.InterfaceC14653S;
import p793ho.InterfaceC14671V;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitAnalytics$AnalyticsStat extends AbstractC12133Z implements InterfaceC14653S {
    public static final int ANALYTICS_KEY_FIELD_NUMBER = 1;
    private static final LivekitAnalytics$AnalyticsStat DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 14;
    public static final int KIND_FIELD_NUMBER = 2;
    public static final int MEDIAN_SCORE_FIELD_NUMBER = 13;
    public static final int MIME_FIELD_NUMBER = 11;
    public static final int MIN_SCORE_FIELD_NUMBER = 12;
    public static final int NODE_FIELD_NUMBER = 4;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int PARTICIPANT_ID_FIELD_NUMBER = 7;
    public static final int ROOM_ID_FIELD_NUMBER = 5;
    public static final int ROOM_NAME_FIELD_NUMBER = 6;
    public static final int SCORE_FIELD_NUMBER = 9;
    public static final int STREAMS_FIELD_NUMBER = 10;
    public static final int TIME_STAMP_FIELD_NUMBER = 3;
    public static final int TRACK_ID_FIELD_NUMBER = 8;
    private int kind_;
    private float medianScore_;
    private float minScore_;
    private float score_;
    private Timestamp timeStamp_;
    private String id_ = "";
    private String analyticsKey_ = "";
    private String node_ = "";
    private String roomId_ = "";
    private String roomName_ = "";
    private String participantId_ = "";
    private String trackId_ = "";
    private InterfaceC12172m0 streams_ = AbstractC12133Z.emptyProtobufList();
    private String mime_ = "";

    static {
        LivekitAnalytics$AnalyticsStat livekitAnalytics$AnalyticsStat = new LivekitAnalytics$AnalyticsStat();
        DEFAULT_INSTANCE = livekitAnalytics$AnalyticsStat;
        AbstractC12133Z.registerDefaultInstance(LivekitAnalytics$AnalyticsStat.class, livekitAnalytics$AnalyticsStat);
    }

    private LivekitAnalytics$AnalyticsStat() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllStreams(Iterable<? extends LivekitAnalytics$AnalyticsStream> iterable) {
        ensureStreamsIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.streams_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStreams(LivekitAnalytics$AnalyticsStream livekitAnalytics$AnalyticsStream) {
        livekitAnalytics$AnalyticsStream.getClass();
        ensureStreamsIsMutable();
        this.streams_.add(livekitAnalytics$AnalyticsStream);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAnalyticsKey() {
        this.analyticsKey_ = getDefaultInstance().getAnalyticsKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKind() {
        this.kind_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMedianScore() {
        this.medianScore_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMime() {
        this.mime_ = getDefaultInstance().getMime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMinScore() {
        this.minScore_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNode() {
        this.node_ = getDefaultInstance().getNode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipantId() {
        this.participantId_ = getDefaultInstance().getParticipantId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoomId() {
        this.roomId_ = getDefaultInstance().getRoomId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoomName() {
        this.roomName_ = getDefaultInstance().getRoomName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScore() {
        this.score_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStreams() {
        this.streams_ = AbstractC12133Z.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeStamp() {
        this.timeStamp_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackId() {
        this.trackId_ = getDefaultInstance().getTrackId();
    }

    private void ensureStreamsIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.streams_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.streams_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    public static LivekitAnalytics$AnalyticsStat getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTimeStamp(Timestamp timestamp) {
        timestamp.getClass();
        Timestamp timestamp2 = this.timeStamp_;
        if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
            this.timeStamp_ = timestamp;
            return;
        }
        C12167k1 c12167k1NewBuilder = Timestamp.newBuilder(this.timeStamp_);
        c12167k1NewBuilder.m13865f(timestamp);
        this.timeStamp_ = (Timestamp) c12167k1NewBuilder.m13862c();
    }

    public static C14642Q newBuilder() {
        return (C14642Q) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitAnalytics$AnalyticsStat parseDelimitedFrom(InputStream inputStream) {
        return (LivekitAnalytics$AnalyticsStat) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAnalytics$AnalyticsStat parseFrom(ByteBuffer byteBuffer) {
        return (LivekitAnalytics$AnalyticsStat) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeStreams(int i10) {
        ensureStreamsIsMutable();
        this.streams_.remove(i10);
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
    public void setKind(EnumC14689Y enumC14689Y) {
        this.kind_ = enumC14689Y.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKindValue(int i10) {
        this.kind_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMedianScore(float f10) {
        this.medianScore_ = f10;
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
    public void setMinScore(float f10) {
        this.minScore_ = f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNode(String str) {
        str.getClass();
        this.node_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNodeBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.node_ = abstractC12171m.m14012w();
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
    public void setScore(float f10) {
        this.score_ = f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStreams(int i10, LivekitAnalytics$AnalyticsStream livekitAnalytics$AnalyticsStream) {
        livekitAnalytics$AnalyticsStream.getClass();
        ensureStreamsIsMutable();
        this.streams_.set(i10, livekitAnalytics$AnalyticsStream);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeStamp(Timestamp timestamp) {
        timestamp.getClass();
        this.timeStamp_ = timestamp;
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

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000e\u0000\u0000\u0001\u000e\u000e\u0000\u0001\u0000\u0001Ȉ\u0002\f\u0003\t\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\t\u0001\n\u001b\u000bȈ\f\u0001\r\u0001\u000eȈ", new Object[]{"analyticsKey_", "kind_", "timeStamp_", HpucjswO.uTAuzU, "roomId_", "roomName_", "participantId_", "trackId_", "score_", "streams_", LivekitAnalytics$AnalyticsStream.class, "mime_", "minScore_", "medianScore_", "id_"});
            case 3:
                return new LivekitAnalytics$AnalyticsStat();
            case 4:
                return new C14642Q(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitAnalytics$AnalyticsStat.class) {
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

    public String getId() {
        return this.id_;
    }

    public AbstractC12171m getIdBytes() {
        return AbstractC12171m.m14011m(this.id_);
    }

    public EnumC14689Y getKind() {
        EnumC14689Y enumC14689Y;
        int i10 = this.kind_;
        if (i10 != 0) {
            enumC14689Y = i10 != 1 ? null : EnumC14689Y.DOWNSTREAM;
        } else {
            enumC14689Y = EnumC14689Y.UPSTREAM;
        }
        return enumC14689Y == null ? EnumC14689Y.UNRECOGNIZED : enumC14689Y;
    }

    public int getKindValue() {
        return this.kind_;
    }

    public float getMedianScore() {
        return this.medianScore_;
    }

    public String getMime() {
        return this.mime_;
    }

    public AbstractC12171m getMimeBytes() {
        return AbstractC12171m.m14011m(this.mime_);
    }

    public float getMinScore() {
        return this.minScore_;
    }

    public String getNode() {
        return this.node_;
    }

    public AbstractC12171m getNodeBytes() {
        return AbstractC12171m.m14011m(this.node_);
    }

    public String getParticipantId() {
        return this.participantId_;
    }

    public AbstractC12171m getParticipantIdBytes() {
        return AbstractC12171m.m14011m(this.participantId_);
    }

    public String getRoomId() {
        return this.roomId_;
    }

    public AbstractC12171m getRoomIdBytes() {
        return AbstractC12171m.m14011m(this.roomId_);
    }

    public String getRoomName() {
        return this.roomName_;
    }

    public AbstractC12171m getRoomNameBytes() {
        return AbstractC12171m.m14011m(this.roomName_);
    }

    public float getScore() {
        return this.score_;
    }

    public LivekitAnalytics$AnalyticsStream getStreams(int i10) {
        return (LivekitAnalytics$AnalyticsStream) this.streams_.get(i10);
    }

    public int getStreamsCount() {
        return this.streams_.size();
    }

    public List<LivekitAnalytics$AnalyticsStream> getStreamsList() {
        return this.streams_;
    }

    public InterfaceC14671V getStreamsOrBuilder(int i10) {
        return (InterfaceC14671V) this.streams_.get(i10);
    }

    public List<? extends InterfaceC14671V> getStreamsOrBuilderList() {
        return this.streams_;
    }

    public Timestamp getTimeStamp() {
        Timestamp timestamp = this.timeStamp_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public String getTrackId() {
        return this.trackId_;
    }

    public AbstractC12171m getTrackIdBytes() {
        return AbstractC12171m.m14011m(this.trackId_);
    }

    public boolean hasTimeStamp() {
        return this.timeStamp_ != null;
    }

    public static C14642Q newBuilder(LivekitAnalytics$AnalyticsStat livekitAnalytics$AnalyticsStat) {
        return (C14642Q) DEFAULT_INSTANCE.createBuilder(livekitAnalytics$AnalyticsStat);
    }

    public static LivekitAnalytics$AnalyticsStat parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitAnalytics$AnalyticsStat) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitAnalytics$AnalyticsStat parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitAnalytics$AnalyticsStat) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitAnalytics$AnalyticsStat parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitAnalytics$AnalyticsStat) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStreams(int i10, LivekitAnalytics$AnalyticsStream livekitAnalytics$AnalyticsStream) {
        livekitAnalytics$AnalyticsStream.getClass();
        ensureStreamsIsMutable();
        this.streams_.add(i10, livekitAnalytics$AnalyticsStream);
    }

    public static LivekitAnalytics$AnalyticsStat parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitAnalytics$AnalyticsStat) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitAnalytics$AnalyticsStat parseFrom(byte[] bArr) {
        return (LivekitAnalytics$AnalyticsStat) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitAnalytics$AnalyticsStat parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitAnalytics$AnalyticsStat) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitAnalytics$AnalyticsStat parseFrom(InputStream inputStream) {
        return (LivekitAnalytics$AnalyticsStat) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAnalytics$AnalyticsStat parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitAnalytics$AnalyticsStat) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitAnalytics$AnalyticsStat parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitAnalytics$AnalyticsStat) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitAnalytics$AnalyticsStat parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitAnalytics$AnalyticsStat) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
