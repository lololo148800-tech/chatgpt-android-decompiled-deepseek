package livekit;

import com.google.protobuf.AbstractC12133Z;
import com.google.protobuf.AbstractC12138b;
import com.google.protobuf.AbstractC12141c;
import com.google.protobuf.AbstractC12171m;
import com.google.protobuf.AbstractC12186r;
import com.google.protobuf.C12087F;
import com.google.protobuf.C12123U;
import com.google.protobuf.EnumC12131Y;
import com.google.protobuf.InterfaceC12124U0;
import com.google.protobuf.InterfaceC12172m0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p793ho.C14881z4;
import p793ho.InterfaceC14546A4;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitRtc$TrackPermission extends AbstractC12133Z implements InterfaceC14546A4 {
    public static final int ALL_TRACKS_FIELD_NUMBER = 2;
    private static final LivekitRtc$TrackPermission DEFAULT_INSTANCE;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int PARTICIPANT_IDENTITY_FIELD_NUMBER = 4;
    public static final int PARTICIPANT_SID_FIELD_NUMBER = 1;
    public static final int TRACK_SIDS_FIELD_NUMBER = 3;
    private boolean allTracks_;
    private String participantSid_ = "";
    private InterfaceC12172m0 trackSids_ = AbstractC12133Z.emptyProtobufList();
    private String participantIdentity_ = "";

    static {
        LivekitRtc$TrackPermission livekitRtc$TrackPermission = new LivekitRtc$TrackPermission();
        DEFAULT_INSTANCE = livekitRtc$TrackPermission;
        AbstractC12133Z.registerDefaultInstance(LivekitRtc$TrackPermission.class, livekitRtc$TrackPermission);
    }

    private LivekitRtc$TrackPermission() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTrackSids(Iterable<String> iterable) {
        ensureTrackSidsIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.trackSids_);
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
    public void clearAllTracks() {
        this.allTracks_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipantIdentity() {
        this.participantIdentity_ = getDefaultInstance().getParticipantIdentity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipantSid() {
        this.participantSid_ = getDefaultInstance().getParticipantSid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackSids() {
        this.trackSids_ = AbstractC12133Z.emptyProtobufList();
    }

    private void ensureTrackSidsIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.trackSids_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.trackSids_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    public static LivekitRtc$TrackPermission getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14881z4 newBuilder() {
        return (C14881z4) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$TrackPermission parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$TrackPermission) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$TrackPermission parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$TrackPermission) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllTracks(boolean z6) {
        this.allTracks_ = z6;
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
    public void setParticipantSid(String str) {
        str.getClass();
        this.participantSid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipantSidBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.participantSid_ = abstractC12171m.m14012w();
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
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\u0007\u0003Ț\u0004Ȉ", new Object[]{"participantSid_", "allTracks_", "trackSids_", "participantIdentity_"});
            case 3:
                return new LivekitRtc$TrackPermission();
            case 4:
                return new C14881z4(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitRtc$TrackPermission.class) {
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

    public boolean getAllTracks() {
        return this.allTracks_;
    }

    public String getParticipantIdentity() {
        return this.participantIdentity_;
    }

    public AbstractC12171m getParticipantIdentityBytes() {
        return AbstractC12171m.m14011m(this.participantIdentity_);
    }

    public String getParticipantSid() {
        return this.participantSid_;
    }

    public AbstractC12171m getParticipantSidBytes() {
        return AbstractC12171m.m14011m(this.participantSid_);
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

    public static C14881z4 newBuilder(LivekitRtc$TrackPermission livekitRtc$TrackPermission) {
        return (C14881z4) DEFAULT_INSTANCE.createBuilder(livekitRtc$TrackPermission);
    }

    public static LivekitRtc$TrackPermission parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$TrackPermission) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$TrackPermission parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitRtc$TrackPermission) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitRtc$TrackPermission parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitRtc$TrackPermission) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitRtc$TrackPermission parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitRtc$TrackPermission) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitRtc$TrackPermission parseFrom(byte[] bArr) {
        return (LivekitRtc$TrackPermission) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$TrackPermission parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitRtc$TrackPermission) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitRtc$TrackPermission parseFrom(InputStream inputStream) {
        return (LivekitRtc$TrackPermission) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$TrackPermission parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$TrackPermission) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$TrackPermission parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitRtc$TrackPermission) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitRtc$TrackPermission parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitRtc$TrackPermission) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
