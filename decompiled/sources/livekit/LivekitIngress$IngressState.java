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
import p793ho.C14543A1;
import p793ho.C14836t1;
import p793ho.C14878z1;
import p793ho.EnumC14843u1;
import p793ho.InterfaceC14680W2;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitIngress$IngressState extends AbstractC12133Z implements InterfaceC12094H0 {
    public static final int AUDIO_FIELD_NUMBER = 4;
    private static final LivekitIngress$IngressState DEFAULT_INSTANCE;
    public static final int ENDED_AT_FIELD_NUMBER = 8;
    public static final int ERROR_FIELD_NUMBER = 2;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int RESOURCE_ID_FIELD_NUMBER = 9;
    public static final int ROOM_ID_FIELD_NUMBER = 5;
    public static final int STARTED_AT_FIELD_NUMBER = 7;
    public static final int STATUS_FIELD_NUMBER = 1;
    public static final int TRACKS_FIELD_NUMBER = 6;
    public static final int UPDATED_AT_FIELD_NUMBER = 10;
    public static final int VIDEO_FIELD_NUMBER = 3;
    private LivekitIngress$InputAudioState audio_;
    private long endedAt_;
    private long startedAt_;
    private int status_;
    private long updatedAt_;
    private LivekitIngress$InputVideoState video_;
    private String error_ = "";
    private String roomId_ = "";
    private String resourceId_ = "";
    private InterfaceC12172m0 tracks_ = AbstractC12133Z.emptyProtobufList();

    static {
        LivekitIngress$IngressState livekitIngress$IngressState = new LivekitIngress$IngressState();
        DEFAULT_INSTANCE = livekitIngress$IngressState;
        AbstractC12133Z.registerDefaultInstance(LivekitIngress$IngressState.class, livekitIngress$IngressState);
    }

    private LivekitIngress$IngressState() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTracks(Iterable<? extends LivekitModels$TrackInfo> iterable) {
        ensureTracksIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.tracks_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTracks(LivekitModels$TrackInfo livekitModels$TrackInfo) {
        livekitModels$TrackInfo.getClass();
        ensureTracksIsMutable();
        this.tracks_.add(livekitModels$TrackInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAudio() {
        this.audio_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndedAt() {
        this.endedAt_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearError() {
        this.error_ = getDefaultInstance().getError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResourceId() {
        this.resourceId_ = getDefaultInstance().getResourceId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoomId() {
        this.roomId_ = getDefaultInstance().getRoomId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartedAt() {
        this.startedAt_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTracks() {
        this.tracks_ = AbstractC12133Z.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpdatedAt() {
        this.updatedAt_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVideo() {
        this.video_ = null;
    }

    private void ensureTracksIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.tracks_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.tracks_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    public static LivekitIngress$IngressState getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAudio(LivekitIngress$InputAudioState livekitIngress$InputAudioState) {
        livekitIngress$InputAudioState.getClass();
        LivekitIngress$InputAudioState livekitIngress$InputAudioState2 = this.audio_;
        if (livekitIngress$InputAudioState2 == null || livekitIngress$InputAudioState2 == LivekitIngress$InputAudioState.getDefaultInstance()) {
            this.audio_ = livekitIngress$InputAudioState;
            return;
        }
        C14878z1 c14878z1NewBuilder = LivekitIngress$InputAudioState.newBuilder(this.audio_);
        c14878z1NewBuilder.m13865f(livekitIngress$InputAudioState);
        this.audio_ = (LivekitIngress$InputAudioState) c14878z1NewBuilder.m13862c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVideo(LivekitIngress$InputVideoState livekitIngress$InputVideoState) {
        livekitIngress$InputVideoState.getClass();
        LivekitIngress$InputVideoState livekitIngress$InputVideoState2 = this.video_;
        if (livekitIngress$InputVideoState2 == null || livekitIngress$InputVideoState2 == LivekitIngress$InputVideoState.getDefaultInstance()) {
            this.video_ = livekitIngress$InputVideoState;
            return;
        }
        C14543A1 c14543a1NewBuilder = LivekitIngress$InputVideoState.newBuilder(this.video_);
        c14543a1NewBuilder.m13865f(livekitIngress$InputVideoState);
        this.video_ = (LivekitIngress$InputVideoState) c14543a1NewBuilder.m13862c();
    }

    public static C14836t1 newBuilder() {
        return (C14836t1) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitIngress$IngressState parseDelimitedFrom(InputStream inputStream) {
        return (LivekitIngress$IngressState) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitIngress$IngressState parseFrom(ByteBuffer byteBuffer) {
        return (LivekitIngress$IngressState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTracks(int i10) {
        ensureTracksIsMutable();
        this.tracks_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAudio(LivekitIngress$InputAudioState livekitIngress$InputAudioState) {
        livekitIngress$InputAudioState.getClass();
        this.audio_ = livekitIngress$InputAudioState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndedAt(long j10) {
        this.endedAt_ = j10;
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
    public void setResourceId(String str) {
        str.getClass();
        this.resourceId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResourceIdBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.resourceId_ = abstractC12171m.m14012w();
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
    public void setStartedAt(long j10) {
        this.startedAt_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(EnumC14843u1 enumC14843u1) {
        this.status_ = enumC14843u1.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatusValue(int i10) {
        this.status_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTracks(int i10, LivekitModels$TrackInfo livekitModels$TrackInfo) {
        livekitModels$TrackInfo.getClass();
        ensureTracksIsMutable();
        this.tracks_.set(i10, livekitModels$TrackInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdatedAt(long j10) {
        this.updatedAt_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideo(LivekitIngress$InputVideoState livekitIngress$InputVideoState) {
        livekitIngress$InputVideoState.getClass();
        this.video_ = livekitIngress$InputVideoState;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003\t\u0004\t\u0005Ȉ\u0006\u001b\u0007\u0002\b\u0002\tȈ\n\u0002", new Object[]{"status_", "error_", "video_", "audio_", "roomId_", "tracks_", LivekitModels$TrackInfo.class, "startedAt_", "endedAt_", "resourceId_", "updatedAt_"});
            case 3:
                return new LivekitIngress$IngressState();
            case 4:
                return new C14836t1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitIngress$IngressState.class) {
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

    public LivekitIngress$InputAudioState getAudio() {
        LivekitIngress$InputAudioState livekitIngress$InputAudioState = this.audio_;
        return livekitIngress$InputAudioState == null ? LivekitIngress$InputAudioState.getDefaultInstance() : livekitIngress$InputAudioState;
    }

    public long getEndedAt() {
        return this.endedAt_;
    }

    public String getError() {
        return this.error_;
    }

    public AbstractC12171m getErrorBytes() {
        return AbstractC12171m.m14011m(this.error_);
    }

    public String getResourceId() {
        return this.resourceId_;
    }

    public AbstractC12171m getResourceIdBytes() {
        return AbstractC12171m.m14011m(this.resourceId_);
    }

    public String getRoomId() {
        return this.roomId_;
    }

    public AbstractC12171m getRoomIdBytes() {
        return AbstractC12171m.m14011m(this.roomId_);
    }

    public long getStartedAt() {
        return this.startedAt_;
    }

    public EnumC14843u1 getStatus() {
        EnumC14843u1 enumC14843u1;
        int i10 = this.status_;
        if (i10 == 0) {
            enumC14843u1 = EnumC14843u1.ENDPOINT_INACTIVE;
        } else if (i10 == 1) {
            enumC14843u1 = EnumC14843u1.ENDPOINT_BUFFERING;
        } else if (i10 == 2) {
            enumC14843u1 = EnumC14843u1.ENDPOINT_PUBLISHING;
        } else if (i10 != 3) {
            enumC14843u1 = i10 != 4 ? null : EnumC14843u1.ENDPOINT_COMPLETE;
        } else {
            enumC14843u1 = EnumC14843u1.ENDPOINT_ERROR;
        }
        return enumC14843u1 == null ? EnumC14843u1.UNRECOGNIZED : enumC14843u1;
    }

    public int getStatusValue() {
        return this.status_;
    }

    public LivekitModels$TrackInfo getTracks(int i10) {
        return (LivekitModels$TrackInfo) this.tracks_.get(i10);
    }

    public int getTracksCount() {
        return this.tracks_.size();
    }

    public List<LivekitModels$TrackInfo> getTracksList() {
        return this.tracks_;
    }

    public InterfaceC14680W2 getTracksOrBuilder(int i10) {
        return (InterfaceC14680W2) this.tracks_.get(i10);
    }

    public List<? extends InterfaceC14680W2> getTracksOrBuilderList() {
        return this.tracks_;
    }

    public long getUpdatedAt() {
        return this.updatedAt_;
    }

    public LivekitIngress$InputVideoState getVideo() {
        LivekitIngress$InputVideoState livekitIngress$InputVideoState = this.video_;
        return livekitIngress$InputVideoState == null ? LivekitIngress$InputVideoState.getDefaultInstance() : livekitIngress$InputVideoState;
    }

    public boolean hasAudio() {
        return this.audio_ != null;
    }

    public boolean hasVideo() {
        return this.video_ != null;
    }

    public static C14836t1 newBuilder(LivekitIngress$IngressState livekitIngress$IngressState) {
        return (C14836t1) DEFAULT_INSTANCE.createBuilder(livekitIngress$IngressState);
    }

    public static LivekitIngress$IngressState parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitIngress$IngressState) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitIngress$IngressState parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitIngress$IngressState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitIngress$IngressState parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitIngress$IngressState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTracks(int i10, LivekitModels$TrackInfo livekitModels$TrackInfo) {
        livekitModels$TrackInfo.getClass();
        ensureTracksIsMutable();
        this.tracks_.add(i10, livekitModels$TrackInfo);
    }

    public static LivekitIngress$IngressState parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitIngress$IngressState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitIngress$IngressState parseFrom(byte[] bArr) {
        return (LivekitIngress$IngressState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitIngress$IngressState parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitIngress$IngressState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitIngress$IngressState parseFrom(InputStream inputStream) {
        return (LivekitIngress$IngressState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitIngress$IngressState parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitIngress$IngressState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitIngress$IngressState parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitIngress$IngressState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitIngress$IngressState parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitIngress$IngressState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
