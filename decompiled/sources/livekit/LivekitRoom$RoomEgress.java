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
import p793ho.C14583G0;
import p793ho.C14702a0;
import p793ho.C14716c0;
import p793ho.C14852v3;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitRoom$RoomEgress extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitRoom$RoomEgress DEFAULT_INSTANCE;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int PARTICIPANT_FIELD_NUMBER = 3;
    public static final int ROOM_FIELD_NUMBER = 1;
    public static final int TRACKS_FIELD_NUMBER = 2;
    private LivekitEgress$AutoParticipantEgress participant_;
    private LivekitEgress$RoomCompositeEgressRequest room_;
    private LivekitEgress$AutoTrackEgress tracks_;

    static {
        LivekitRoom$RoomEgress livekitRoom$RoomEgress = new LivekitRoom$RoomEgress();
        DEFAULT_INSTANCE = livekitRoom$RoomEgress;
        AbstractC12133Z.registerDefaultInstance(LivekitRoom$RoomEgress.class, livekitRoom$RoomEgress);
    }

    private LivekitRoom$RoomEgress() {
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
    public void clearTracks() {
        this.tracks_ = null;
    }

    public static LivekitRoom$RoomEgress getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParticipant(LivekitEgress$AutoParticipantEgress livekitEgress$AutoParticipantEgress) {
        livekitEgress$AutoParticipantEgress.getClass();
        LivekitEgress$AutoParticipantEgress livekitEgress$AutoParticipantEgress2 = this.participant_;
        if (livekitEgress$AutoParticipantEgress2 == null || livekitEgress$AutoParticipantEgress2 == LivekitEgress$AutoParticipantEgress.getDefaultInstance()) {
            this.participant_ = livekitEgress$AutoParticipantEgress;
            return;
        }
        C14702a0 c14702a0NewBuilder = LivekitEgress$AutoParticipantEgress.newBuilder(this.participant_);
        c14702a0NewBuilder.m13865f(livekitEgress$AutoParticipantEgress);
        this.participant_ = (LivekitEgress$AutoParticipantEgress) c14702a0NewBuilder.m13862c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRoom(LivekitEgress$RoomCompositeEgressRequest livekitEgress$RoomCompositeEgressRequest) {
        livekitEgress$RoomCompositeEgressRequest.getClass();
        LivekitEgress$RoomCompositeEgressRequest livekitEgress$RoomCompositeEgressRequest2 = this.room_;
        if (livekitEgress$RoomCompositeEgressRequest2 == null || livekitEgress$RoomCompositeEgressRequest2 == LivekitEgress$RoomCompositeEgressRequest.getDefaultInstance()) {
            this.room_ = livekitEgress$RoomCompositeEgressRequest;
            return;
        }
        C14583G0 c14583g0NewBuilder = LivekitEgress$RoomCompositeEgressRequest.newBuilder(this.room_);
        c14583g0NewBuilder.m13865f(livekitEgress$RoomCompositeEgressRequest);
        this.room_ = (LivekitEgress$RoomCompositeEgressRequest) c14583g0NewBuilder.m13862c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTracks(LivekitEgress$AutoTrackEgress livekitEgress$AutoTrackEgress) {
        livekitEgress$AutoTrackEgress.getClass();
        LivekitEgress$AutoTrackEgress livekitEgress$AutoTrackEgress2 = this.tracks_;
        if (livekitEgress$AutoTrackEgress2 == null || livekitEgress$AutoTrackEgress2 == LivekitEgress$AutoTrackEgress.getDefaultInstance()) {
            this.tracks_ = livekitEgress$AutoTrackEgress;
            return;
        }
        C14716c0 c14716c0NewBuilder = LivekitEgress$AutoTrackEgress.newBuilder(this.tracks_);
        c14716c0NewBuilder.m13865f(livekitEgress$AutoTrackEgress);
        this.tracks_ = (LivekitEgress$AutoTrackEgress) c14716c0NewBuilder.m13862c();
    }

    public static C14852v3 newBuilder() {
        return (C14852v3) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRoom$RoomEgress parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRoom$RoomEgress) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRoom$RoomEgress parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRoom$RoomEgress) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipant(LivekitEgress$AutoParticipantEgress livekitEgress$AutoParticipantEgress) {
        livekitEgress$AutoParticipantEgress.getClass();
        this.participant_ = livekitEgress$AutoParticipantEgress;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoom(LivekitEgress$RoomCompositeEgressRequest livekitEgress$RoomCompositeEgressRequest) {
        livekitEgress$RoomCompositeEgressRequest.getClass();
        this.room_ = livekitEgress$RoomCompositeEgressRequest;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTracks(LivekitEgress$AutoTrackEgress livekitEgress$AutoTrackEgress) {
        livekitEgress$AutoTrackEgress.getClass();
        this.tracks_ = livekitEgress$AutoTrackEgress;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t", new Object[]{"room_", "tracks_", "participant_"});
            case 3:
                return new LivekitRoom$RoomEgress();
            case 4:
                return new C14852v3(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitRoom$RoomEgress.class) {
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

    public LivekitEgress$AutoParticipantEgress getParticipant() {
        LivekitEgress$AutoParticipantEgress livekitEgress$AutoParticipantEgress = this.participant_;
        return livekitEgress$AutoParticipantEgress == null ? LivekitEgress$AutoParticipantEgress.getDefaultInstance() : livekitEgress$AutoParticipantEgress;
    }

    public LivekitEgress$RoomCompositeEgressRequest getRoom() {
        LivekitEgress$RoomCompositeEgressRequest livekitEgress$RoomCompositeEgressRequest = this.room_;
        return livekitEgress$RoomCompositeEgressRequest == null ? LivekitEgress$RoomCompositeEgressRequest.getDefaultInstance() : livekitEgress$RoomCompositeEgressRequest;
    }

    public LivekitEgress$AutoTrackEgress getTracks() {
        LivekitEgress$AutoTrackEgress livekitEgress$AutoTrackEgress = this.tracks_;
        return livekitEgress$AutoTrackEgress == null ? LivekitEgress$AutoTrackEgress.getDefaultInstance() : livekitEgress$AutoTrackEgress;
    }

    public boolean hasParticipant() {
        return this.participant_ != null;
    }

    public boolean hasRoom() {
        return this.room_ != null;
    }

    public boolean hasTracks() {
        return this.tracks_ != null;
    }

    public static C14852v3 newBuilder(LivekitRoom$RoomEgress livekitRoom$RoomEgress) {
        return (C14852v3) DEFAULT_INSTANCE.createBuilder(livekitRoom$RoomEgress);
    }

    public static LivekitRoom$RoomEgress parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRoom$RoomEgress) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRoom$RoomEgress parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitRoom$RoomEgress) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitRoom$RoomEgress parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitRoom$RoomEgress) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitRoom$RoomEgress parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitRoom$RoomEgress) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitRoom$RoomEgress parseFrom(byte[] bArr) {
        return (LivekitRoom$RoomEgress) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRoom$RoomEgress parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitRoom$RoomEgress) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitRoom$RoomEgress parseFrom(InputStream inputStream) {
        return (LivekitRoom$RoomEgress) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRoom$RoomEgress parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRoom$RoomEgress) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRoom$RoomEgress parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitRoom$RoomEgress) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitRoom$RoomEgress parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitRoom$RoomEgress) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
