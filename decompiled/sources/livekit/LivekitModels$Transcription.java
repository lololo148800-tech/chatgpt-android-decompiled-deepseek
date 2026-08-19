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
import p793ho.C14698Z2;
import p793ho.InterfaceC14712b3;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitModels$Transcription extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitModels$Transcription DEFAULT_INSTANCE;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int SEGMENTS_FIELD_NUMBER = 4;
    public static final int TRACK_ID_FIELD_NUMBER = 3;
    public static final int TRANSCRIBED_PARTICIPANT_IDENTITY_FIELD_NUMBER = 2;
    private String transcribedParticipantIdentity_ = "";
    private String trackId_ = "";
    private InterfaceC12172m0 segments_ = AbstractC12133Z.emptyProtobufList();

    static {
        LivekitModels$Transcription livekitModels$Transcription = new LivekitModels$Transcription();
        DEFAULT_INSTANCE = livekitModels$Transcription;
        AbstractC12133Z.registerDefaultInstance(LivekitModels$Transcription.class, livekitModels$Transcription);
    }

    private LivekitModels$Transcription() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSegments(Iterable<? extends LivekitModels$TranscriptionSegment> iterable) {
        ensureSegmentsIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.segments_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSegments(LivekitModels$TranscriptionSegment livekitModels$TranscriptionSegment) {
        livekitModels$TranscriptionSegment.getClass();
        ensureSegmentsIsMutable();
        this.segments_.add(livekitModels$TranscriptionSegment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSegments() {
        this.segments_ = AbstractC12133Z.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackId() {
        this.trackId_ = getDefaultInstance().getTrackId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTranscribedParticipantIdentity() {
        this.transcribedParticipantIdentity_ = getDefaultInstance().getTranscribedParticipantIdentity();
    }

    private void ensureSegmentsIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.segments_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.segments_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    public static LivekitModels$Transcription getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14698Z2 newBuilder() {
        return (C14698Z2) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitModels$Transcription parseDelimitedFrom(InputStream inputStream) {
        return (LivekitModels$Transcription) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$Transcription parseFrom(ByteBuffer byteBuffer) {
        return (LivekitModels$Transcription) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSegments(int i10) {
        ensureSegmentsIsMutable();
        this.segments_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSegments(int i10, LivekitModels$TranscriptionSegment livekitModels$TranscriptionSegment) {
        livekitModels$TranscriptionSegment.getClass();
        ensureSegmentsIsMutable();
        this.segments_.set(i10, livekitModels$TranscriptionSegment);
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
    public void setTranscribedParticipantIdentity(String str) {
        str.getClass();
        this.transcribedParticipantIdentity_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTranscribedParticipantIdentityBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.transcribedParticipantIdentity_ = abstractC12171m.m14012w();
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0002\u0004\u0003\u0000\u0001\u0000\u0002Ȉ\u0003Ȉ\u0004\u001b", new Object[]{"transcribedParticipantIdentity_", "trackId_", "segments_", LivekitModels$TranscriptionSegment.class});
            case 3:
                return new LivekitModels$Transcription();
            case 4:
                return new C14698Z2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitModels$Transcription.class) {
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

    public LivekitModels$TranscriptionSegment getSegments(int i10) {
        return (LivekitModels$TranscriptionSegment) this.segments_.get(i10);
    }

    public int getSegmentsCount() {
        return this.segments_.size();
    }

    public List<LivekitModels$TranscriptionSegment> getSegmentsList() {
        return this.segments_;
    }

    public InterfaceC14712b3 getSegmentsOrBuilder(int i10) {
        return (InterfaceC14712b3) this.segments_.get(i10);
    }

    public List<? extends InterfaceC14712b3> getSegmentsOrBuilderList() {
        return this.segments_;
    }

    public String getTrackId() {
        return this.trackId_;
    }

    public AbstractC12171m getTrackIdBytes() {
        return AbstractC12171m.m14011m(this.trackId_);
    }

    public String getTranscribedParticipantIdentity() {
        return this.transcribedParticipantIdentity_;
    }

    public AbstractC12171m getTranscribedParticipantIdentityBytes() {
        return AbstractC12171m.m14011m(this.transcribedParticipantIdentity_);
    }

    public static C14698Z2 newBuilder(LivekitModels$Transcription livekitModels$Transcription) {
        return (C14698Z2) DEFAULT_INSTANCE.createBuilder(livekitModels$Transcription);
    }

    public static LivekitModels$Transcription parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitModels$Transcription) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitModels$Transcription parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitModels$Transcription) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitModels$Transcription parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitModels$Transcription) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSegments(int i10, LivekitModels$TranscriptionSegment livekitModels$TranscriptionSegment) {
        livekitModels$TranscriptionSegment.getClass();
        ensureSegmentsIsMutable();
        this.segments_.add(i10, livekitModels$TranscriptionSegment);
    }

    public static LivekitModels$Transcription parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitModels$Transcription) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitModels$Transcription parseFrom(byte[] bArr) {
        return (LivekitModels$Transcription) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitModels$Transcription parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitModels$Transcription) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitModels$Transcription parseFrom(InputStream inputStream) {
        return (LivekitModels$Transcription) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$Transcription parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitModels$Transcription) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitModels$Transcription parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitModels$Transcription) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitModels$Transcription parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitModels$Transcription) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
