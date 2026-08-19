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
import p793ho.C14608K1;
import p793ho.C14702a0;
import p793ho.C14716c0;
import p793ho.C14851v2;
import p793ho.InterfaceC14576F;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitInternal$RoomInternal extends AbstractC12133Z implements InterfaceC12094H0 {
    public static final int AGENT_DISPATCHES_FIELD_NUMBER = 5;
    private static final LivekitInternal$RoomInternal DEFAULT_INSTANCE;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int PARTICIPANT_EGRESS_FIELD_NUMBER = 2;
    public static final int PLAYOUT_DELAY_FIELD_NUMBER = 3;
    public static final int REPLAY_ENABLED_FIELD_NUMBER = 6;
    public static final int SYNC_STREAMS_FIELD_NUMBER = 4;
    public static final int TRACK_EGRESS_FIELD_NUMBER = 1;
    private InterfaceC12172m0 agentDispatches_ = AbstractC12133Z.emptyProtobufList();
    private LivekitEgress$AutoParticipantEgress participantEgress_;
    private LivekitModels$PlayoutDelay playoutDelay_;
    private boolean replayEnabled_;
    private boolean syncStreams_;
    private LivekitEgress$AutoTrackEgress trackEgress_;

    static {
        LivekitInternal$RoomInternal livekitInternal$RoomInternal = new LivekitInternal$RoomInternal();
        DEFAULT_INSTANCE = livekitInternal$RoomInternal;
        AbstractC12133Z.registerDefaultInstance(LivekitInternal$RoomInternal.class, livekitInternal$RoomInternal);
    }

    private LivekitInternal$RoomInternal() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAgentDispatches(LivekitAgentDispatch$RoomAgentDispatch livekitAgentDispatch$RoomAgentDispatch) {
        livekitAgentDispatch$RoomAgentDispatch.getClass();
        ensureAgentDispatchesIsMutable();
        this.agentDispatches_.add(livekitAgentDispatch$RoomAgentDispatch);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAgentDispatches(Iterable<? extends LivekitAgentDispatch$RoomAgentDispatch> iterable) {
        ensureAgentDispatchesIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.agentDispatches_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAgentDispatches() {
        this.agentDispatches_ = AbstractC12133Z.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipantEgress() {
        this.participantEgress_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayoutDelay() {
        this.playoutDelay_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReplayEnabled() {
        this.replayEnabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSyncStreams() {
        this.syncStreams_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackEgress() {
        this.trackEgress_ = null;
    }

    private void ensureAgentDispatchesIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.agentDispatches_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.agentDispatches_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    public static LivekitInternal$RoomInternal getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParticipantEgress(LivekitEgress$AutoParticipantEgress livekitEgress$AutoParticipantEgress) {
        livekitEgress$AutoParticipantEgress.getClass();
        LivekitEgress$AutoParticipantEgress livekitEgress$AutoParticipantEgress2 = this.participantEgress_;
        if (livekitEgress$AutoParticipantEgress2 == null || livekitEgress$AutoParticipantEgress2 == LivekitEgress$AutoParticipantEgress.getDefaultInstance()) {
            this.participantEgress_ = livekitEgress$AutoParticipantEgress;
            return;
        }
        C14702a0 c14702a0NewBuilder = LivekitEgress$AutoParticipantEgress.newBuilder(this.participantEgress_);
        c14702a0NewBuilder.m13865f(livekitEgress$AutoParticipantEgress);
        this.participantEgress_ = (LivekitEgress$AutoParticipantEgress) c14702a0NewBuilder.m13862c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlayoutDelay(LivekitModels$PlayoutDelay livekitModels$PlayoutDelay) {
        livekitModels$PlayoutDelay.getClass();
        LivekitModels$PlayoutDelay livekitModels$PlayoutDelay2 = this.playoutDelay_;
        if (livekitModels$PlayoutDelay2 == null || livekitModels$PlayoutDelay2 == LivekitModels$PlayoutDelay.getDefaultInstance()) {
            this.playoutDelay_ = livekitModels$PlayoutDelay;
            return;
        }
        C14851v2 c14851v2NewBuilder = LivekitModels$PlayoutDelay.newBuilder(this.playoutDelay_);
        c14851v2NewBuilder.m13865f(livekitModels$PlayoutDelay);
        this.playoutDelay_ = (LivekitModels$PlayoutDelay) c14851v2NewBuilder.m13862c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTrackEgress(LivekitEgress$AutoTrackEgress livekitEgress$AutoTrackEgress) {
        livekitEgress$AutoTrackEgress.getClass();
        LivekitEgress$AutoTrackEgress livekitEgress$AutoTrackEgress2 = this.trackEgress_;
        if (livekitEgress$AutoTrackEgress2 == null || livekitEgress$AutoTrackEgress2 == LivekitEgress$AutoTrackEgress.getDefaultInstance()) {
            this.trackEgress_ = livekitEgress$AutoTrackEgress;
            return;
        }
        C14716c0 c14716c0NewBuilder = LivekitEgress$AutoTrackEgress.newBuilder(this.trackEgress_);
        c14716c0NewBuilder.m13865f(livekitEgress$AutoTrackEgress);
        this.trackEgress_ = (LivekitEgress$AutoTrackEgress) c14716c0NewBuilder.m13862c();
    }

    public static C14608K1 newBuilder() {
        return (C14608K1) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitInternal$RoomInternal parseDelimitedFrom(InputStream inputStream) {
        return (LivekitInternal$RoomInternal) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitInternal$RoomInternal parseFrom(ByteBuffer byteBuffer) {
        return (LivekitInternal$RoomInternal) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAgentDispatches(int i10) {
        ensureAgentDispatchesIsMutable();
        this.agentDispatches_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAgentDispatches(int i10, LivekitAgentDispatch$RoomAgentDispatch livekitAgentDispatch$RoomAgentDispatch) {
        livekitAgentDispatch$RoomAgentDispatch.getClass();
        ensureAgentDispatchesIsMutable();
        this.agentDispatches_.set(i10, livekitAgentDispatch$RoomAgentDispatch);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipantEgress(LivekitEgress$AutoParticipantEgress livekitEgress$AutoParticipantEgress) {
        livekitEgress$AutoParticipantEgress.getClass();
        this.participantEgress_ = livekitEgress$AutoParticipantEgress;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayoutDelay(LivekitModels$PlayoutDelay livekitModels$PlayoutDelay) {
        livekitModels$PlayoutDelay.getClass();
        this.playoutDelay_ = livekitModels$PlayoutDelay;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReplayEnabled(boolean z6) {
        this.replayEnabled_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSyncStreams(boolean z6) {
        this.syncStreams_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackEgress(LivekitEgress$AutoTrackEgress livekitEgress$AutoTrackEgress) {
        livekitEgress$AutoTrackEgress.getClass();
        this.trackEgress_ = livekitEgress$AutoTrackEgress;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001\t\u0002\t\u0003\t\u0004\u0007\u0005\u001b\u0006\u0007", new Object[]{"trackEgress_", "participantEgress_", "playoutDelay_", "syncStreams_", "agentDispatches_", LivekitAgentDispatch$RoomAgentDispatch.class, "replayEnabled_"});
            case 3:
                return new LivekitInternal$RoomInternal();
            case 4:
                return new C14608K1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitInternal$RoomInternal.class) {
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

    public LivekitAgentDispatch$RoomAgentDispatch getAgentDispatches(int i10) {
        return (LivekitAgentDispatch$RoomAgentDispatch) this.agentDispatches_.get(i10);
    }

    public int getAgentDispatchesCount() {
        return this.agentDispatches_.size();
    }

    public List<LivekitAgentDispatch$RoomAgentDispatch> getAgentDispatchesList() {
        return this.agentDispatches_;
    }

    public InterfaceC14576F getAgentDispatchesOrBuilder(int i10) {
        return (InterfaceC14576F) this.agentDispatches_.get(i10);
    }

    public List<? extends InterfaceC14576F> getAgentDispatchesOrBuilderList() {
        return this.agentDispatches_;
    }

    public LivekitEgress$AutoParticipantEgress getParticipantEgress() {
        LivekitEgress$AutoParticipantEgress livekitEgress$AutoParticipantEgress = this.participantEgress_;
        return livekitEgress$AutoParticipantEgress == null ? LivekitEgress$AutoParticipantEgress.getDefaultInstance() : livekitEgress$AutoParticipantEgress;
    }

    public LivekitModels$PlayoutDelay getPlayoutDelay() {
        LivekitModels$PlayoutDelay livekitModels$PlayoutDelay = this.playoutDelay_;
        return livekitModels$PlayoutDelay == null ? LivekitModels$PlayoutDelay.getDefaultInstance() : livekitModels$PlayoutDelay;
    }

    public boolean getReplayEnabled() {
        return this.replayEnabled_;
    }

    public boolean getSyncStreams() {
        return this.syncStreams_;
    }

    public LivekitEgress$AutoTrackEgress getTrackEgress() {
        LivekitEgress$AutoTrackEgress livekitEgress$AutoTrackEgress = this.trackEgress_;
        return livekitEgress$AutoTrackEgress == null ? LivekitEgress$AutoTrackEgress.getDefaultInstance() : livekitEgress$AutoTrackEgress;
    }

    public boolean hasParticipantEgress() {
        return this.participantEgress_ != null;
    }

    public boolean hasPlayoutDelay() {
        return this.playoutDelay_ != null;
    }

    public boolean hasTrackEgress() {
        return this.trackEgress_ != null;
    }

    public static C14608K1 newBuilder(LivekitInternal$RoomInternal livekitInternal$RoomInternal) {
        return (C14608K1) DEFAULT_INSTANCE.createBuilder(livekitInternal$RoomInternal);
    }

    public static LivekitInternal$RoomInternal parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitInternal$RoomInternal) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitInternal$RoomInternal parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitInternal$RoomInternal) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitInternal$RoomInternal parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitInternal$RoomInternal) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAgentDispatches(int i10, LivekitAgentDispatch$RoomAgentDispatch livekitAgentDispatch$RoomAgentDispatch) {
        livekitAgentDispatch$RoomAgentDispatch.getClass();
        ensureAgentDispatchesIsMutable();
        this.agentDispatches_.add(i10, livekitAgentDispatch$RoomAgentDispatch);
    }

    public static LivekitInternal$RoomInternal parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitInternal$RoomInternal) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitInternal$RoomInternal parseFrom(byte[] bArr) {
        return (LivekitInternal$RoomInternal) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitInternal$RoomInternal parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitInternal$RoomInternal) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitInternal$RoomInternal parseFrom(InputStream inputStream) {
        return (LivekitInternal$RoomInternal) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitInternal$RoomInternal parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitInternal$RoomInternal) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitInternal$RoomInternal parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitInternal$RoomInternal) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitInternal$RoomInternal parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitInternal$RoomInternal) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
