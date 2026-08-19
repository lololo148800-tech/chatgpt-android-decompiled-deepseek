package livekit;

import com.google.protobuf.AbstractC12133Z;
import com.google.protobuf.AbstractC12171m;
import com.google.protobuf.AbstractC12186r;
import com.google.protobuf.C12087F;
import com.google.protobuf.C12123U;
import com.google.protobuf.EnumC12131Y;
import com.google.protobuf.InterfaceC12094H0;
import com.google.protobuf.InterfaceC12124U0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p793ho.C14596I1;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitInternal$NodeStats extends AbstractC12133Z implements InterfaceC12094H0 {
    public static final int BYTES_IN_FIELD_NUMBER = 7;
    public static final int BYTES_IN_PER_SEC_FIELD_NUMBER = 12;
    public static final int BYTES_OUT_FIELD_NUMBER = 8;
    public static final int BYTES_OUT_PER_SEC_FIELD_NUMBER = 13;
    public static final int CPU_LOAD_FIELD_NUMBER = 21;
    private static final LivekitInternal$NodeStats DEFAULT_INSTANCE;
    public static final int FORWARD_JITTER_FIELD_NUMBER = 49;
    public static final int FORWARD_LATENCY_FIELD_NUMBER = 48;
    public static final int LOAD_AVG_LAST15MIN_FIELD_NUMBER = 20;
    public static final int LOAD_AVG_LAST1MIN_FIELD_NUMBER = 18;
    public static final int LOAD_AVG_LAST5MIN_FIELD_NUMBER = 19;
    public static final int MEMORY_LOAD_FIELD_NUMBER = 33;
    public static final int MEMORY_TOTAL_FIELD_NUMBER = 34;
    public static final int MEMORY_USED_FIELD_NUMBER = 35;
    public static final int NACK_PER_SEC_FIELD_NUMBER = 16;
    public static final int NACK_TOTAL_FIELD_NUMBER = 11;
    public static final int NUM_CLIENTS_FIELD_NUMBER = 4;
    public static final int NUM_CPUS_FIELD_NUMBER = 17;
    public static final int NUM_ROOMS_FIELD_NUMBER = 3;
    public static final int NUM_TRACKS_IN_FIELD_NUMBER = 5;
    public static final int NUM_TRACKS_OUT_FIELD_NUMBER = 6;
    public static final int NUM_TRACK_PUBLISH_ATTEMPTS_FIELD_NUMBER = 36;
    public static final int NUM_TRACK_PUBLISH_SUCCESS_FIELD_NUMBER = 38;
    public static final int NUM_TRACK_SUBSCRIBE_ATTEMPTS_FIELD_NUMBER = 40;
    public static final int NUM_TRACK_SUBSCRIBE_SUCCESS_FIELD_NUMBER = 42;
    public static final int PACKETS_IN_FIELD_NUMBER = 9;
    public static final int PACKETS_IN_PER_SEC_FIELD_NUMBER = 14;
    public static final int PACKETS_OUT_FIELD_NUMBER = 10;
    public static final int PACKETS_OUT_PER_SEC_FIELD_NUMBER = 15;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int PARTICIPANT_RTC_CONNECTED_FIELD_NUMBER = 44;
    public static final int PARTICIPANT_RTC_CONNECTED_PER_SEC_FIELD_NUMBER = 45;
    public static final int PARTICIPANT_RTC_INIT_FIELD_NUMBER = 46;
    public static final int PARTICIPANT_RTC_INIT_PER_SEC_FIELD_NUMBER = 47;
    public static final int PARTICIPANT_SIGNAL_CONNECTED_FIELD_NUMBER = 26;
    public static final int PARTICIPANT_SIGNAL_CONNECTED_PER_SEC_FIELD_NUMBER = 27;
    public static final int RETRANSMIT_BYTES_OUT_FIELD_NUMBER = 22;
    public static final int RETRANSMIT_BYTES_OUT_PER_SEC_FIELD_NUMBER = 24;
    public static final int RETRANSMIT_PACKETS_OUT_FIELD_NUMBER = 23;
    public static final int RETRANSMIT_PACKETS_OUT_PER_SEC_FIELD_NUMBER = 25;
    public static final int STARTED_AT_FIELD_NUMBER = 1;
    public static final int SYS_PACKETS_DROPPED_FIELD_NUMBER = 29;
    public static final int SYS_PACKETS_DROPPED_PCT_PER_SEC_FIELD_NUMBER = 32;
    public static final int SYS_PACKETS_DROPPED_PER_SEC_FIELD_NUMBER = 31;
    public static final int SYS_PACKETS_OUT_FIELD_NUMBER = 28;
    public static final int SYS_PACKETS_OUT_PER_SEC_FIELD_NUMBER = 30;
    public static final int TRACK_PUBLISH_ATTEMPTS_PER_SEC_FIELD_NUMBER = 37;
    public static final int TRACK_PUBLISH_SUCCESS_PER_SEC_FIELD_NUMBER = 39;
    public static final int TRACK_SUBSCRIBE_ATTEMPTS_PER_SEC_FIELD_NUMBER = 41;
    public static final int TRACK_SUBSCRIBE_SUCCESS_PER_SEC_FIELD_NUMBER = 43;
    public static final int UPDATED_AT_FIELD_NUMBER = 2;
    private float bytesInPerSec_;
    private long bytesIn_;
    private float bytesOutPerSec_;
    private long bytesOut_;
    private float cpuLoad_;
    private int forwardJitter_;
    private int forwardLatency_;
    private float loadAvgLast15Min_;
    private float loadAvgLast1Min_;
    private float loadAvgLast5Min_;
    private float memoryLoad_;
    private long memoryTotal_;
    private long memoryUsed_;
    private float nackPerSec_;
    private long nackTotal_;
    private int numClients_;
    private int numCpus_;
    private int numRooms_;
    private int numTrackPublishAttempts_;
    private int numTrackPublishSuccess_;
    private int numTrackSubscribeAttempts_;
    private int numTrackSubscribeSuccess_;
    private int numTracksIn_;
    private int numTracksOut_;
    private float packetsInPerSec_;
    private long packetsIn_;
    private float packetsOutPerSec_;
    private long packetsOut_;
    private float participantRtcConnectedPerSec_;
    private long participantRtcConnected_;
    private float participantRtcInitPerSec_;
    private long participantRtcInit_;
    private float participantSignalConnectedPerSec_;
    private long participantSignalConnected_;
    private float retransmitBytesOutPerSec_;
    private long retransmitBytesOut_;
    private float retransmitPacketsOutPerSec_;
    private long retransmitPacketsOut_;
    private long startedAt_;
    private float sysPacketsDroppedPctPerSec_;
    private float sysPacketsDroppedPerSec_;
    private int sysPacketsDropped_;
    private float sysPacketsOutPerSec_;
    private int sysPacketsOut_;
    private float trackPublishAttemptsPerSec_;
    private float trackPublishSuccessPerSec_;
    private float trackSubscribeAttemptsPerSec_;
    private float trackSubscribeSuccessPerSec_;
    private long updatedAt_;

    static {
        LivekitInternal$NodeStats livekitInternal$NodeStats = new LivekitInternal$NodeStats();
        DEFAULT_INSTANCE = livekitInternal$NodeStats;
        AbstractC12133Z.registerDefaultInstance(LivekitInternal$NodeStats.class, livekitInternal$NodeStats);
    }

    private LivekitInternal$NodeStats() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBytesIn() {
        this.bytesIn_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBytesInPerSec() {
        this.bytesInPerSec_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBytesOut() {
        this.bytesOut_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBytesOutPerSec() {
        this.bytesOutPerSec_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCpuLoad() {
        this.cpuLoad_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearForwardJitter() {
        this.forwardJitter_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearForwardLatency() {
        this.forwardLatency_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLoadAvgLast15Min() {
        this.loadAvgLast15Min_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLoadAvgLast1Min() {
        this.loadAvgLast1Min_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLoadAvgLast5Min() {
        this.loadAvgLast5Min_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMemoryLoad() {
        this.memoryLoad_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMemoryTotal() {
        this.memoryTotal_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMemoryUsed() {
        this.memoryUsed_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNackPerSec() {
        this.nackPerSec_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNackTotal() {
        this.nackTotal_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumClients() {
        this.numClients_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumCpus() {
        this.numCpus_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumRooms() {
        this.numRooms_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumTrackPublishAttempts() {
        this.numTrackPublishAttempts_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumTrackPublishSuccess() {
        this.numTrackPublishSuccess_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumTrackSubscribeAttempts() {
        this.numTrackSubscribeAttempts_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumTrackSubscribeSuccess() {
        this.numTrackSubscribeSuccess_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumTracksIn() {
        this.numTracksIn_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumTracksOut() {
        this.numTracksOut_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPacketsIn() {
        this.packetsIn_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPacketsInPerSec() {
        this.packetsInPerSec_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPacketsOut() {
        this.packetsOut_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPacketsOutPerSec() {
        this.packetsOutPerSec_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipantRtcConnected() {
        this.participantRtcConnected_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipantRtcConnectedPerSec() {
        this.participantRtcConnectedPerSec_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipantRtcInit() {
        this.participantRtcInit_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipantRtcInitPerSec() {
        this.participantRtcInitPerSec_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipantSignalConnected() {
        this.participantSignalConnected_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipantSignalConnectedPerSec() {
        this.participantSignalConnectedPerSec_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRetransmitBytesOut() {
        this.retransmitBytesOut_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRetransmitBytesOutPerSec() {
        this.retransmitBytesOutPerSec_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRetransmitPacketsOut() {
        this.retransmitPacketsOut_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRetransmitPacketsOutPerSec() {
        this.retransmitPacketsOutPerSec_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartedAt() {
        this.startedAt_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSysPacketsDropped() {
        this.sysPacketsDropped_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSysPacketsDroppedPctPerSec() {
        this.sysPacketsDroppedPctPerSec_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSysPacketsDroppedPerSec() {
        this.sysPacketsDroppedPerSec_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSysPacketsOut() {
        this.sysPacketsOut_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSysPacketsOutPerSec() {
        this.sysPacketsOutPerSec_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackPublishAttemptsPerSec() {
        this.trackPublishAttemptsPerSec_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackPublishSuccessPerSec() {
        this.trackPublishSuccessPerSec_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackSubscribeAttemptsPerSec() {
        this.trackSubscribeAttemptsPerSec_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackSubscribeSuccessPerSec() {
        this.trackSubscribeSuccessPerSec_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpdatedAt() {
        this.updatedAt_ = 0L;
    }

    public static LivekitInternal$NodeStats getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14596I1 newBuilder() {
        return (C14596I1) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitInternal$NodeStats parseDelimitedFrom(InputStream inputStream) {
        return (LivekitInternal$NodeStats) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitInternal$NodeStats parseFrom(ByteBuffer byteBuffer) {
        return (LivekitInternal$NodeStats) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBytesIn(long j10) {
        this.bytesIn_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBytesInPerSec(float f10) {
        this.bytesInPerSec_ = f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBytesOut(long j10) {
        this.bytesOut_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBytesOutPerSec(float f10) {
        this.bytesOutPerSec_ = f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCpuLoad(float f10) {
        this.cpuLoad_ = f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setForwardJitter(int i10) {
        this.forwardJitter_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setForwardLatency(int i10) {
        this.forwardLatency_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLoadAvgLast15Min(float f10) {
        this.loadAvgLast15Min_ = f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLoadAvgLast1Min(float f10) {
        this.loadAvgLast1Min_ = f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLoadAvgLast5Min(float f10) {
        this.loadAvgLast5Min_ = f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMemoryLoad(float f10) {
        this.memoryLoad_ = f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMemoryTotal(long j10) {
        this.memoryTotal_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMemoryUsed(long j10) {
        this.memoryUsed_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNackPerSec(float f10) {
        this.nackPerSec_ = f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNackTotal(long j10) {
        this.nackTotal_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumClients(int i10) {
        this.numClients_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumCpus(int i10) {
        this.numCpus_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumRooms(int i10) {
        this.numRooms_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumTrackPublishAttempts(int i10) {
        this.numTrackPublishAttempts_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumTrackPublishSuccess(int i10) {
        this.numTrackPublishSuccess_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumTrackSubscribeAttempts(int i10) {
        this.numTrackSubscribeAttempts_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumTrackSubscribeSuccess(int i10) {
        this.numTrackSubscribeSuccess_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumTracksIn(int i10) {
        this.numTracksIn_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumTracksOut(int i10) {
        this.numTracksOut_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPacketsIn(long j10) {
        this.packetsIn_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPacketsInPerSec(float f10) {
        this.packetsInPerSec_ = f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPacketsOut(long j10) {
        this.packetsOut_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPacketsOutPerSec(float f10) {
        this.packetsOutPerSec_ = f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipantRtcConnected(long j10) {
        this.participantRtcConnected_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipantRtcConnectedPerSec(float f10) {
        this.participantRtcConnectedPerSec_ = f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipantRtcInit(long j10) {
        this.participantRtcInit_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipantRtcInitPerSec(float f10) {
        this.participantRtcInitPerSec_ = f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipantSignalConnected(long j10) {
        this.participantSignalConnected_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipantSignalConnectedPerSec(float f10) {
        this.participantSignalConnectedPerSec_ = f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRetransmitBytesOut(long j10) {
        this.retransmitBytesOut_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRetransmitBytesOutPerSec(float f10) {
        this.retransmitBytesOutPerSec_ = f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRetransmitPacketsOut(long j10) {
        this.retransmitPacketsOut_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRetransmitPacketsOutPerSec(float f10) {
        this.retransmitPacketsOutPerSec_ = f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartedAt(long j10) {
        this.startedAt_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSysPacketsDropped(int i10) {
        this.sysPacketsDropped_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSysPacketsDroppedPctPerSec(float f10) {
        this.sysPacketsDroppedPctPerSec_ = f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSysPacketsDroppedPerSec(float f10) {
        this.sysPacketsDroppedPerSec_ = f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSysPacketsOut(int i10) {
        this.sysPacketsOut_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSysPacketsOutPerSec(float f10) {
        this.sysPacketsOutPerSec_ = f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackPublishAttemptsPerSec(float f10) {
        this.trackPublishAttemptsPerSec_ = f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackPublishSuccessPerSec(float f10) {
        this.trackPublishSuccessPerSec_ = f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackSubscribeAttemptsPerSec(float f10) {
        this.trackSubscribeAttemptsPerSec_ = f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackSubscribeSuccessPerSec(float f10) {
        this.trackSubscribeSuccessPerSec_ = f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdatedAt(long j10) {
        this.updatedAt_ = j10;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u00001\u0000\u0000\u000111\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0004\u0004\u0004\u0005\u0004\u0006\u0004\u0007\u0003\b\u0003\t\u0003\n\u0003\u000b\u0003\f\u0001\r\u0001\u000e\u0001\u000f\u0001\u0010\u0001\u0011\u000b\u0012\u0001\u0013\u0001\u0014\u0001\u0015\u0001\u0016\u0003\u0017\u0003\u0018\u0001\u0019\u0001\u001a\u0003\u001b\u0001\u001c\u000b\u001d\u000b\u001e\u0001\u001f\u0001 \u0001!\u0001\"\u0003#\u0003$\u0004%\u0001&\u0004'\u0001(\u0004)\u0001*\u0004+\u0001,\u0003-\u0001.\u0003/\u00010\u000b1\u000b", new Object[]{"startedAt_", "updatedAt_", "numRooms_", "numClients_", "numTracksIn_", "numTracksOut_", "bytesIn_", "bytesOut_", "packetsIn_", "packetsOut_", "nackTotal_", "bytesInPerSec_", "bytesOutPerSec_", "packetsInPerSec_", "packetsOutPerSec_", "nackPerSec_", "numCpus_", "loadAvgLast1Min_", "loadAvgLast5Min_", "loadAvgLast15Min_", "cpuLoad_", "retransmitBytesOut_", "retransmitPacketsOut_", "retransmitBytesOutPerSec_", "retransmitPacketsOutPerSec_", "participantSignalConnected_", "participantSignalConnectedPerSec_", "sysPacketsOut_", "sysPacketsDropped_", "sysPacketsOutPerSec_", "sysPacketsDroppedPerSec_", "sysPacketsDroppedPctPerSec_", "memoryLoad_", "memoryTotal_", "memoryUsed_", "numTrackPublishAttempts_", "trackPublishAttemptsPerSec_", "numTrackPublishSuccess_", "trackPublishSuccessPerSec_", "numTrackSubscribeAttempts_", "trackSubscribeAttemptsPerSec_", "numTrackSubscribeSuccess_", "trackSubscribeSuccessPerSec_", "participantRtcConnected_", "participantRtcConnectedPerSec_", "participantRtcInit_", "participantRtcInitPerSec_", "forwardLatency_", "forwardJitter_"});
            case 3:
                return new LivekitInternal$NodeStats();
            case 4:
                return new C14596I1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitInternal$NodeStats.class) {
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

    public long getBytesIn() {
        return this.bytesIn_;
    }

    public float getBytesInPerSec() {
        return this.bytesInPerSec_;
    }

    public long getBytesOut() {
        return this.bytesOut_;
    }

    public float getBytesOutPerSec() {
        return this.bytesOutPerSec_;
    }

    public float getCpuLoad() {
        return this.cpuLoad_;
    }

    public int getForwardJitter() {
        return this.forwardJitter_;
    }

    public int getForwardLatency() {
        return this.forwardLatency_;
    }

    public float getLoadAvgLast15Min() {
        return this.loadAvgLast15Min_;
    }

    public float getLoadAvgLast1Min() {
        return this.loadAvgLast1Min_;
    }

    public float getLoadAvgLast5Min() {
        return this.loadAvgLast5Min_;
    }

    public float getMemoryLoad() {
        return this.memoryLoad_;
    }

    public long getMemoryTotal() {
        return this.memoryTotal_;
    }

    public long getMemoryUsed() {
        return this.memoryUsed_;
    }

    public float getNackPerSec() {
        return this.nackPerSec_;
    }

    public long getNackTotal() {
        return this.nackTotal_;
    }

    public int getNumClients() {
        return this.numClients_;
    }

    public int getNumCpus() {
        return this.numCpus_;
    }

    public int getNumRooms() {
        return this.numRooms_;
    }

    public int getNumTrackPublishAttempts() {
        return this.numTrackPublishAttempts_;
    }

    public int getNumTrackPublishSuccess() {
        return this.numTrackPublishSuccess_;
    }

    public int getNumTrackSubscribeAttempts() {
        return this.numTrackSubscribeAttempts_;
    }

    public int getNumTrackSubscribeSuccess() {
        return this.numTrackSubscribeSuccess_;
    }

    public int getNumTracksIn() {
        return this.numTracksIn_;
    }

    public int getNumTracksOut() {
        return this.numTracksOut_;
    }

    public long getPacketsIn() {
        return this.packetsIn_;
    }

    public float getPacketsInPerSec() {
        return this.packetsInPerSec_;
    }

    public long getPacketsOut() {
        return this.packetsOut_;
    }

    public float getPacketsOutPerSec() {
        return this.packetsOutPerSec_;
    }

    public long getParticipantRtcConnected() {
        return this.participantRtcConnected_;
    }

    public float getParticipantRtcConnectedPerSec() {
        return this.participantRtcConnectedPerSec_;
    }

    public long getParticipantRtcInit() {
        return this.participantRtcInit_;
    }

    public float getParticipantRtcInitPerSec() {
        return this.participantRtcInitPerSec_;
    }

    public long getParticipantSignalConnected() {
        return this.participantSignalConnected_;
    }

    public float getParticipantSignalConnectedPerSec() {
        return this.participantSignalConnectedPerSec_;
    }

    public long getRetransmitBytesOut() {
        return this.retransmitBytesOut_;
    }

    public float getRetransmitBytesOutPerSec() {
        return this.retransmitBytesOutPerSec_;
    }

    public long getRetransmitPacketsOut() {
        return this.retransmitPacketsOut_;
    }

    public float getRetransmitPacketsOutPerSec() {
        return this.retransmitPacketsOutPerSec_;
    }

    public long getStartedAt() {
        return this.startedAt_;
    }

    public int getSysPacketsDropped() {
        return this.sysPacketsDropped_;
    }

    public float getSysPacketsDroppedPctPerSec() {
        return this.sysPacketsDroppedPctPerSec_;
    }

    public float getSysPacketsDroppedPerSec() {
        return this.sysPacketsDroppedPerSec_;
    }

    public int getSysPacketsOut() {
        return this.sysPacketsOut_;
    }

    public float getSysPacketsOutPerSec() {
        return this.sysPacketsOutPerSec_;
    }

    public float getTrackPublishAttemptsPerSec() {
        return this.trackPublishAttemptsPerSec_;
    }

    public float getTrackPublishSuccessPerSec() {
        return this.trackPublishSuccessPerSec_;
    }

    public float getTrackSubscribeAttemptsPerSec() {
        return this.trackSubscribeAttemptsPerSec_;
    }

    public float getTrackSubscribeSuccessPerSec() {
        return this.trackSubscribeSuccessPerSec_;
    }

    public long getUpdatedAt() {
        return this.updatedAt_;
    }

    public static C14596I1 newBuilder(LivekitInternal$NodeStats livekitInternal$NodeStats) {
        return (C14596I1) DEFAULT_INSTANCE.createBuilder(livekitInternal$NodeStats);
    }

    public static LivekitInternal$NodeStats parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitInternal$NodeStats) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitInternal$NodeStats parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitInternal$NodeStats) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitInternal$NodeStats parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitInternal$NodeStats) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitInternal$NodeStats parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitInternal$NodeStats) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitInternal$NodeStats parseFrom(byte[] bArr) {
        return (LivekitInternal$NodeStats) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitInternal$NodeStats parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitInternal$NodeStats) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitInternal$NodeStats parseFrom(InputStream inputStream) {
        return (LivekitInternal$NodeStats) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitInternal$NodeStats parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitInternal$NodeStats) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitInternal$NodeStats parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitInternal$NodeStats) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitInternal$NodeStats parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitInternal$NodeStats) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
