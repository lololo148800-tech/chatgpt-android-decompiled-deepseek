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
import p793ho.C14559C3;
import p793ho.InterfaceC14844u2;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitRoom$UpdateSubscriptionsRequest extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitRoom$UpdateSubscriptionsRequest DEFAULT_INSTANCE;
    public static final int IDENTITY_FIELD_NUMBER = 2;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int PARTICIPANT_TRACKS_FIELD_NUMBER = 5;
    public static final int ROOM_FIELD_NUMBER = 1;
    public static final int SUBSCRIBE_FIELD_NUMBER = 4;
    public static final int TRACK_SIDS_FIELD_NUMBER = 3;
    private boolean subscribe_;
    private String room_ = "";
    private String identity_ = "";
    private InterfaceC12172m0 trackSids_ = AbstractC12133Z.emptyProtobufList();
    private InterfaceC12172m0 participantTracks_ = AbstractC12133Z.emptyProtobufList();

    static {
        LivekitRoom$UpdateSubscriptionsRequest livekitRoom$UpdateSubscriptionsRequest = new LivekitRoom$UpdateSubscriptionsRequest();
        DEFAULT_INSTANCE = livekitRoom$UpdateSubscriptionsRequest;
        AbstractC12133Z.registerDefaultInstance(LivekitRoom$UpdateSubscriptionsRequest.class, livekitRoom$UpdateSubscriptionsRequest);
    }

    private LivekitRoom$UpdateSubscriptionsRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllParticipantTracks(Iterable<? extends LivekitModels$ParticipantTracks> iterable) {
        ensureParticipantTracksIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.participantTracks_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTrackSids(Iterable<String> iterable) {
        ensureTrackSidsIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.trackSids_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addParticipantTracks(LivekitModels$ParticipantTracks livekitModels$ParticipantTracks) {
        livekitModels$ParticipantTracks.getClass();
        ensureParticipantTracksIsMutable();
        this.participantTracks_.add(livekitModels$ParticipantTracks);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTrackSids(String str) {
        str.getClass();
        ensureTrackSidsIsMutable();
        this.trackSids_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTrackSidsBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        ensureTrackSidsIsMutable();
        this.trackSids_.add(abstractC12171m.m14012w());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIdentity() {
        this.identity_ = getDefaultInstance().getIdentity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipantTracks() {
        this.participantTracks_ = AbstractC12133Z.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoom() {
        this.room_ = getDefaultInstance().getRoom();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubscribe() {
        this.subscribe_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackSids() {
        this.trackSids_ = AbstractC12133Z.emptyProtobufList();
    }

    private void ensureParticipantTracksIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.participantTracks_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.participantTracks_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    private void ensureTrackSidsIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.trackSids_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.trackSids_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    public static LivekitRoom$UpdateSubscriptionsRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14559C3 newBuilder() {
        return (C14559C3) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRoom$UpdateSubscriptionsRequest parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRoom$UpdateSubscriptionsRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRoom$UpdateSubscriptionsRequest parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRoom$UpdateSubscriptionsRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeParticipantTracks(int i10) {
        ensureParticipantTracksIsMutable();
        this.participantTracks_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdentity(String str) {
        str.getClass();
        this.identity_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdentityBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.identity_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipantTracks(int i10, LivekitModels$ParticipantTracks livekitModels$ParticipantTracks) {
        livekitModels$ParticipantTracks.getClass();
        ensureParticipantTracksIsMutable();
        this.participantTracks_.set(i10, livekitModels$ParticipantTracks);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoom(String str) {
        str.getClass();
        this.room_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoomBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.room_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubscribe(boolean z6) {
        this.subscribe_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackSids(int i10, String str) {
        str.getClass();
        ensureTrackSidsIsMutable();
        this.trackSids_.set(i10, str);
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003Ț\u0004\u0007\u0005\u001b", new Object[]{"room_", "identity_", "trackSids_", "subscribe_", "participantTracks_", LivekitModels$ParticipantTracks.class});
            case 3:
                return new LivekitRoom$UpdateSubscriptionsRequest();
            case 4:
                return new C14559C3(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitRoom$UpdateSubscriptionsRequest.class) {
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

    public String getIdentity() {
        return this.identity_;
    }

    public AbstractC12171m getIdentityBytes() {
        return AbstractC12171m.m14011m(this.identity_);
    }

    public LivekitModels$ParticipantTracks getParticipantTracks(int i10) {
        return (LivekitModels$ParticipantTracks) this.participantTracks_.get(i10);
    }

    public int getParticipantTracksCount() {
        return this.participantTracks_.size();
    }

    public List<LivekitModels$ParticipantTracks> getParticipantTracksList() {
        return this.participantTracks_;
    }

    public InterfaceC14844u2 getParticipantTracksOrBuilder(int i10) {
        return (InterfaceC14844u2) this.participantTracks_.get(i10);
    }

    public List<? extends InterfaceC14844u2> getParticipantTracksOrBuilderList() {
        return this.participantTracks_;
    }

    public String getRoom() {
        return this.room_;
    }

    public AbstractC12171m getRoomBytes() {
        return AbstractC12171m.m14011m(this.room_);
    }

    public boolean getSubscribe() {
        return this.subscribe_;
    }

    public String getTrackSids(int i10) {
        return (String) this.trackSids_.get(i10);
    }

    public AbstractC12171m getTrackSidsBytes(int i10) {
        return AbstractC12171m.m14011m((String) this.trackSids_.get(i10));
    }

    public int getTrackSidsCount() {
        return this.trackSids_.size();
    }

    public List<String> getTrackSidsList() {
        return this.trackSids_;
    }

    public static C14559C3 newBuilder(LivekitRoom$UpdateSubscriptionsRequest livekitRoom$UpdateSubscriptionsRequest) {
        return (C14559C3) DEFAULT_INSTANCE.createBuilder(livekitRoom$UpdateSubscriptionsRequest);
    }

    public static LivekitRoom$UpdateSubscriptionsRequest parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRoom$UpdateSubscriptionsRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRoom$UpdateSubscriptionsRequest parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitRoom$UpdateSubscriptionsRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitRoom$UpdateSubscriptionsRequest parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitRoom$UpdateSubscriptionsRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addParticipantTracks(int i10, LivekitModels$ParticipantTracks livekitModels$ParticipantTracks) {
        livekitModels$ParticipantTracks.getClass();
        ensureParticipantTracksIsMutable();
        this.participantTracks_.add(i10, livekitModels$ParticipantTracks);
    }

    public static LivekitRoom$UpdateSubscriptionsRequest parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitRoom$UpdateSubscriptionsRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitRoom$UpdateSubscriptionsRequest parseFrom(byte[] bArr) {
        return (LivekitRoom$UpdateSubscriptionsRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRoom$UpdateSubscriptionsRequest parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitRoom$UpdateSubscriptionsRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitRoom$UpdateSubscriptionsRequest parseFrom(InputStream inputStream) {
        return (LivekitRoom$UpdateSubscriptionsRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRoom$UpdateSubscriptionsRequest parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRoom$UpdateSubscriptionsRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRoom$UpdateSubscriptionsRequest parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitRoom$UpdateSubscriptionsRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitRoom$UpdateSubscriptionsRequest parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitRoom$UpdateSubscriptionsRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
