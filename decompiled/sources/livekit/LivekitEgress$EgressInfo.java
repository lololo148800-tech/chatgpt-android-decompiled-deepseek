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
import p793ho.C14563D0;
import p793ho.C14583G0;
import p793ho.C14643Q0;
import p793ho.C14672V0;
import p793ho.C14703a1;
import p793ho.C14724d1;
import p793ho.C14751h0;
import p793ho.C14752h1;
import p793ho.C14828s0;
import p793ho.EnumC14758i0;
import p793ho.EnumC14765j0;
import p793ho.EnumC14779l0;
import p793ho.InterfaceC14542A0;
import p793ho.InterfaceC14648R0;
import p793ho.InterfaceC14678W0;
import p793ho.InterfaceC14772k0;
import p793ho.InterfaceC14835t0;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitEgress$EgressInfo extends AbstractC12133Z implements InterfaceC14772k0 {
    private static final LivekitEgress$EgressInfo DEFAULT_INSTANCE;
    public static final int DETAILS_FIELD_NUMBER = 21;
    public static final int EGRESS_ID_FIELD_NUMBER = 1;
    public static final int ENDED_AT_FIELD_NUMBER = 11;
    public static final int ERROR_CODE_FIELD_NUMBER = 22;
    public static final int ERROR_FIELD_NUMBER = 9;
    public static final int FILE_FIELD_NUMBER = 8;
    public static final int FILE_RESULTS_FIELD_NUMBER = 16;
    public static final int IMAGE_RESULTS_FIELD_NUMBER = 20;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int PARTICIPANT_FIELD_NUMBER = 19;
    public static final int ROOM_COMPOSITE_FIELD_NUMBER = 4;
    public static final int ROOM_ID_FIELD_NUMBER = 2;
    public static final int ROOM_NAME_FIELD_NUMBER = 13;
    public static final int SEGMENTS_FIELD_NUMBER = 12;
    public static final int SEGMENT_RESULTS_FIELD_NUMBER = 17;
    public static final int STARTED_AT_FIELD_NUMBER = 10;
    public static final int STATUS_FIELD_NUMBER = 3;
    public static final int STREAM_FIELD_NUMBER = 7;
    public static final int STREAM_RESULTS_FIELD_NUMBER = 15;
    public static final int TRACK_COMPOSITE_FIELD_NUMBER = 5;
    public static final int TRACK_FIELD_NUMBER = 6;
    public static final int UPDATED_AT_FIELD_NUMBER = 18;
    public static final int WEB_FIELD_NUMBER = 14;
    private long endedAt_;
    private int errorCode_;
    private Object request_;
    private Object result_;
    private long startedAt_;
    private int status_;
    private long updatedAt_;
    private int requestCase_ = 0;
    private int resultCase_ = 0;
    private String egressId_ = "";
    private String roomId_ = "";
    private String roomName_ = "";
    private String details_ = "";
    private String error_ = "";
    private InterfaceC12172m0 streamResults_ = AbstractC12133Z.emptyProtobufList();
    private InterfaceC12172m0 fileResults_ = AbstractC12133Z.emptyProtobufList();
    private InterfaceC12172m0 segmentResults_ = AbstractC12133Z.emptyProtobufList();
    private InterfaceC12172m0 imageResults_ = AbstractC12133Z.emptyProtobufList();

    static {
        LivekitEgress$EgressInfo livekitEgress$EgressInfo = new LivekitEgress$EgressInfo();
        DEFAULT_INSTANCE = livekitEgress$EgressInfo;
        AbstractC12133Z.registerDefaultInstance(LivekitEgress$EgressInfo.class, livekitEgress$EgressInfo);
    }

    private LivekitEgress$EgressInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFileResults(Iterable<? extends LivekitEgress$FileInfo> iterable) {
        ensureFileResultsIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.fileResults_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllImageResults(Iterable<? extends LivekitEgress$ImagesInfo> iterable) {
        ensureImageResultsIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.imageResults_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSegmentResults(Iterable<? extends LivekitEgress$SegmentsInfo> iterable) {
        ensureSegmentResultsIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.segmentResults_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllStreamResults(Iterable<? extends LivekitEgress$StreamInfo> iterable) {
        ensureStreamResultsIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.streamResults_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFileResults(LivekitEgress$FileInfo livekitEgress$FileInfo) {
        livekitEgress$FileInfo.getClass();
        ensureFileResultsIsMutable();
        this.fileResults_.add(livekitEgress$FileInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addImageResults(LivekitEgress$ImagesInfo livekitEgress$ImagesInfo) {
        livekitEgress$ImagesInfo.getClass();
        ensureImageResultsIsMutable();
        this.imageResults_.add(livekitEgress$ImagesInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSegmentResults(LivekitEgress$SegmentsInfo livekitEgress$SegmentsInfo) {
        livekitEgress$SegmentsInfo.getClass();
        ensureSegmentResultsIsMutable();
        this.segmentResults_.add(livekitEgress$SegmentsInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStreamResults(LivekitEgress$StreamInfo livekitEgress$StreamInfo) {
        livekitEgress$StreamInfo.getClass();
        ensureStreamResultsIsMutable();
        this.streamResults_.add(livekitEgress$StreamInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDetails() {
        this.details_ = getDefaultInstance().getDetails();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEgressId() {
        this.egressId_ = getDefaultInstance().getEgressId();
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
    public void clearErrorCode() {
        this.errorCode_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFile() {
        if (this.resultCase_ == 8) {
            this.resultCase_ = 0;
            this.result_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFileResults() {
        this.fileResults_ = AbstractC12133Z.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImageResults() {
        this.imageResults_ = AbstractC12133Z.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipant() {
        if (this.requestCase_ == 19) {
            this.requestCase_ = 0;
            this.request_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequest() {
        this.requestCase_ = 0;
        this.request_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResult() {
        this.resultCase_ = 0;
        this.result_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoomComposite() {
        if (this.requestCase_ == 4) {
            this.requestCase_ = 0;
            this.request_ = null;
        }
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
    public void clearSegmentResults() {
        this.segmentResults_ = AbstractC12133Z.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSegments() {
        if (this.resultCase_ == 12) {
            this.resultCase_ = 0;
            this.result_ = null;
        }
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
    public void clearStream() {
        if (this.resultCase_ == 7) {
            this.resultCase_ = 0;
            this.result_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStreamResults() {
        this.streamResults_ = AbstractC12133Z.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrack() {
        if (this.requestCase_ == 6) {
            this.requestCase_ = 0;
            this.request_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackComposite() {
        if (this.requestCase_ == 5) {
            this.requestCase_ = 0;
            this.request_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpdatedAt() {
        this.updatedAt_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWeb() {
        if (this.requestCase_ == 14) {
            this.requestCase_ = 0;
            this.request_ = null;
        }
    }

    private void ensureFileResultsIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.fileResults_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.fileResults_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    private void ensureImageResultsIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.imageResults_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.imageResults_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    private void ensureSegmentResultsIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.segmentResults_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.segmentResults_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    private void ensureStreamResultsIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.streamResults_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.streamResults_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    public static LivekitEgress$EgressInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFile(LivekitEgress$FileInfo livekitEgress$FileInfo) {
        livekitEgress$FileInfo.getClass();
        if (this.resultCase_ != 8 || this.result_ == LivekitEgress$FileInfo.getDefaultInstance()) {
            this.result_ = livekitEgress$FileInfo;
        } else {
            C14828s0 c14828s0NewBuilder = LivekitEgress$FileInfo.newBuilder((LivekitEgress$FileInfo) this.result_);
            c14828s0NewBuilder.m13865f(livekitEgress$FileInfo);
            this.result_ = c14828s0NewBuilder.m13862c();
        }
        this.resultCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParticipant(LivekitEgress$ParticipantEgressRequest livekitEgress$ParticipantEgressRequest) {
        livekitEgress$ParticipantEgressRequest.getClass();
        if (this.requestCase_ != 19 || this.request_ == LivekitEgress$ParticipantEgressRequest.getDefaultInstance()) {
            this.request_ = livekitEgress$ParticipantEgressRequest;
        } else {
            C14563D0 c14563d0NewBuilder = LivekitEgress$ParticipantEgressRequest.newBuilder((LivekitEgress$ParticipantEgressRequest) this.request_);
            c14563d0NewBuilder.m13865f(livekitEgress$ParticipantEgressRequest);
            this.request_ = c14563d0NewBuilder.m13862c();
        }
        this.requestCase_ = 19;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRoomComposite(LivekitEgress$RoomCompositeEgressRequest livekitEgress$RoomCompositeEgressRequest) {
        livekitEgress$RoomCompositeEgressRequest.getClass();
        if (this.requestCase_ != 4 || this.request_ == LivekitEgress$RoomCompositeEgressRequest.getDefaultInstance()) {
            this.request_ = livekitEgress$RoomCompositeEgressRequest;
        } else {
            C14583G0 c14583g0NewBuilder = LivekitEgress$RoomCompositeEgressRequest.newBuilder((LivekitEgress$RoomCompositeEgressRequest) this.request_);
            c14583g0NewBuilder.m13865f(livekitEgress$RoomCompositeEgressRequest);
            this.request_ = c14583g0NewBuilder.m13862c();
        }
        this.requestCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSegments(LivekitEgress$SegmentsInfo livekitEgress$SegmentsInfo) {
        livekitEgress$SegmentsInfo.getClass();
        if (this.resultCase_ != 12 || this.result_ == LivekitEgress$SegmentsInfo.getDefaultInstance()) {
            this.result_ = livekitEgress$SegmentsInfo;
        } else {
            C14643Q0 c14643q0NewBuilder = LivekitEgress$SegmentsInfo.newBuilder((LivekitEgress$SegmentsInfo) this.result_);
            c14643q0NewBuilder.m13865f(livekitEgress$SegmentsInfo);
            this.result_ = c14643q0NewBuilder.m13862c();
        }
        this.resultCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStream(LivekitEgress$StreamInfoList livekitEgress$StreamInfoList) {
        livekitEgress$StreamInfoList.getClass();
        if (this.resultCase_ != 7 || this.result_ == LivekitEgress$StreamInfoList.getDefaultInstance()) {
            this.result_ = livekitEgress$StreamInfoList;
        } else {
            C14672V0 c14672v0NewBuilder = LivekitEgress$StreamInfoList.newBuilder((LivekitEgress$StreamInfoList) this.result_);
            c14672v0NewBuilder.m13865f(livekitEgress$StreamInfoList);
            this.result_ = c14672v0NewBuilder.m13862c();
        }
        this.resultCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTrack(LivekitEgress$TrackEgressRequest livekitEgress$TrackEgressRequest) {
        livekitEgress$TrackEgressRequest.getClass();
        if (this.requestCase_ != 6 || this.request_ == LivekitEgress$TrackEgressRequest.getDefaultInstance()) {
            this.request_ = livekitEgress$TrackEgressRequest;
        } else {
            C14724d1 c14724d1NewBuilder = LivekitEgress$TrackEgressRequest.newBuilder((LivekitEgress$TrackEgressRequest) this.request_);
            c14724d1NewBuilder.m13865f(livekitEgress$TrackEgressRequest);
            this.request_ = c14724d1NewBuilder.m13862c();
        }
        this.requestCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTrackComposite(LivekitEgress$TrackCompositeEgressRequest livekitEgress$TrackCompositeEgressRequest) {
        livekitEgress$TrackCompositeEgressRequest.getClass();
        if (this.requestCase_ != 5 || this.request_ == LivekitEgress$TrackCompositeEgressRequest.getDefaultInstance()) {
            this.request_ = livekitEgress$TrackCompositeEgressRequest;
        } else {
            C14703a1 c14703a1NewBuilder = LivekitEgress$TrackCompositeEgressRequest.newBuilder((LivekitEgress$TrackCompositeEgressRequest) this.request_);
            c14703a1NewBuilder.m13865f(livekitEgress$TrackCompositeEgressRequest);
            this.request_ = c14703a1NewBuilder.m13862c();
        }
        this.requestCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWeb(LivekitEgress$WebEgressRequest livekitEgress$WebEgressRequest) {
        livekitEgress$WebEgressRequest.getClass();
        if (this.requestCase_ != 14 || this.request_ == LivekitEgress$WebEgressRequest.getDefaultInstance()) {
            this.request_ = livekitEgress$WebEgressRequest;
        } else {
            C14752h1 c14752h1NewBuilder = LivekitEgress$WebEgressRequest.newBuilder((LivekitEgress$WebEgressRequest) this.request_);
            c14752h1NewBuilder.m13865f(livekitEgress$WebEgressRequest);
            this.request_ = c14752h1NewBuilder.m13862c();
        }
        this.requestCase_ = 14;
    }

    public static C14751h0 newBuilder() {
        return (C14751h0) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitEgress$EgressInfo parseDelimitedFrom(InputStream inputStream) {
        return (LivekitEgress$EgressInfo) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$EgressInfo parseFrom(ByteBuffer byteBuffer) {
        return (LivekitEgress$EgressInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeFileResults(int i10) {
        ensureFileResultsIsMutable();
        this.fileResults_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeImageResults(int i10) {
        ensureImageResultsIsMutable();
        this.imageResults_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSegmentResults(int i10) {
        ensureSegmentResultsIsMutable();
        this.segmentResults_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeStreamResults(int i10) {
        ensureStreamResultsIsMutable();
        this.streamResults_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDetails(String str) {
        str.getClass();
        this.details_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDetailsBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.details_ = abstractC12171m.m14012w();
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
    public void setErrorCode(int i10) {
        this.errorCode_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFile(LivekitEgress$FileInfo livekitEgress$FileInfo) {
        livekitEgress$FileInfo.getClass();
        this.result_ = livekitEgress$FileInfo;
        this.resultCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileResults(int i10, LivekitEgress$FileInfo livekitEgress$FileInfo) {
        livekitEgress$FileInfo.getClass();
        ensureFileResultsIsMutable();
        this.fileResults_.set(i10, livekitEgress$FileInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageResults(int i10, LivekitEgress$ImagesInfo livekitEgress$ImagesInfo) {
        livekitEgress$ImagesInfo.getClass();
        ensureImageResultsIsMutable();
        this.imageResults_.set(i10, livekitEgress$ImagesInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipant(LivekitEgress$ParticipantEgressRequest livekitEgress$ParticipantEgressRequest) {
        livekitEgress$ParticipantEgressRequest.getClass();
        this.request_ = livekitEgress$ParticipantEgressRequest;
        this.requestCase_ = 19;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoomComposite(LivekitEgress$RoomCompositeEgressRequest livekitEgress$RoomCompositeEgressRequest) {
        livekitEgress$RoomCompositeEgressRequest.getClass();
        this.request_ = livekitEgress$RoomCompositeEgressRequest;
        this.requestCase_ = 4;
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
    public void setSegmentResults(int i10, LivekitEgress$SegmentsInfo livekitEgress$SegmentsInfo) {
        livekitEgress$SegmentsInfo.getClass();
        ensureSegmentResultsIsMutable();
        this.segmentResults_.set(i10, livekitEgress$SegmentsInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSegments(LivekitEgress$SegmentsInfo livekitEgress$SegmentsInfo) {
        livekitEgress$SegmentsInfo.getClass();
        this.result_ = livekitEgress$SegmentsInfo;
        this.resultCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartedAt(long j10) {
        this.startedAt_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(EnumC14779l0 enumC14779l0) {
        this.status_ = enumC14779l0.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatusValue(int i10) {
        this.status_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStream(LivekitEgress$StreamInfoList livekitEgress$StreamInfoList) {
        livekitEgress$StreamInfoList.getClass();
        this.result_ = livekitEgress$StreamInfoList;
        this.resultCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStreamResults(int i10, LivekitEgress$StreamInfo livekitEgress$StreamInfo) {
        livekitEgress$StreamInfo.getClass();
        ensureStreamResultsIsMutable();
        this.streamResults_.set(i10, livekitEgress$StreamInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrack(LivekitEgress$TrackEgressRequest livekitEgress$TrackEgressRequest) {
        livekitEgress$TrackEgressRequest.getClass();
        this.request_ = livekitEgress$TrackEgressRequest;
        this.requestCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackComposite(LivekitEgress$TrackCompositeEgressRequest livekitEgress$TrackCompositeEgressRequest) {
        livekitEgress$TrackCompositeEgressRequest.getClass();
        this.request_ = livekitEgress$TrackCompositeEgressRequest;
        this.requestCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdatedAt(long j10) {
        this.updatedAt_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWeb(LivekitEgress$WebEgressRequest livekitEgress$WebEgressRequest) {
        livekitEgress$WebEgressRequest.getClass();
        this.request_ = livekitEgress$WebEgressRequest;
        this.requestCase_ = 14;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0016\u0002\u0000\u0001\u0016\u0016\u0000\u0004\u0000\u0001Ȉ\u0002Ȉ\u0003\f\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0001\b<\u0001\tȈ\n\u0002\u000b\u0002\f<\u0001\rȈ\u000e<\u0000\u000f\u001b\u0010\u001b\u0011\u001b\u0012\u0002\u0013<\u0000\u0014\u001b\u0015Ȉ\u0016\u0004", new Object[]{"request_", "requestCase_", "result_", "resultCase_", "egressId_", "roomId_", "status_", LivekitEgress$RoomCompositeEgressRequest.class, LivekitEgress$TrackCompositeEgressRequest.class, LivekitEgress$TrackEgressRequest.class, LivekitEgress$StreamInfoList.class, LivekitEgress$FileInfo.class, "error_", "startedAt_", "endedAt_", LivekitEgress$SegmentsInfo.class, "roomName_", LivekitEgress$WebEgressRequest.class, "streamResults_", LivekitEgress$StreamInfo.class, "fileResults_", LivekitEgress$FileInfo.class, "segmentResults_", LivekitEgress$SegmentsInfo.class, "updatedAt_", LivekitEgress$ParticipantEgressRequest.class, "imageResults_", LivekitEgress$ImagesInfo.class, "details_", "errorCode_"});
            case 3:
                return new LivekitEgress$EgressInfo();
            case 4:
                return new C14751h0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitEgress$EgressInfo.class) {
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

    public String getDetails() {
        return this.details_;
    }

    public AbstractC12171m getDetailsBytes() {
        return AbstractC12171m.m14011m(this.details_);
    }

    public String getEgressId() {
        return this.egressId_;
    }

    public AbstractC12171m getEgressIdBytes() {
        return AbstractC12171m.m14011m(this.egressId_);
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

    public int getErrorCode() {
        return this.errorCode_;
    }

    @Deprecated
    public LivekitEgress$FileInfo getFile() {
        return this.resultCase_ == 8 ? (LivekitEgress$FileInfo) this.result_ : LivekitEgress$FileInfo.getDefaultInstance();
    }

    public LivekitEgress$FileInfo getFileResults(int i10) {
        return (LivekitEgress$FileInfo) this.fileResults_.get(i10);
    }

    public int getFileResultsCount() {
        return this.fileResults_.size();
    }

    public List<LivekitEgress$FileInfo> getFileResultsList() {
        return this.fileResults_;
    }

    public InterfaceC14835t0 getFileResultsOrBuilder(int i10) {
        return (InterfaceC14835t0) this.fileResults_.get(i10);
    }

    public List<? extends InterfaceC14835t0> getFileResultsOrBuilderList() {
        return this.fileResults_;
    }

    public LivekitEgress$ImagesInfo getImageResults(int i10) {
        return (LivekitEgress$ImagesInfo) this.imageResults_.get(i10);
    }

    public int getImageResultsCount() {
        return this.imageResults_.size();
    }

    public List<LivekitEgress$ImagesInfo> getImageResultsList() {
        return this.imageResults_;
    }

    public InterfaceC14542A0 getImageResultsOrBuilder(int i10) {
        return (InterfaceC14542A0) this.imageResults_.get(i10);
    }

    public List<? extends InterfaceC14542A0> getImageResultsOrBuilderList() {
        return this.imageResults_;
    }

    public LivekitEgress$ParticipantEgressRequest getParticipant() {
        return this.requestCase_ == 19 ? (LivekitEgress$ParticipantEgressRequest) this.request_ : LivekitEgress$ParticipantEgressRequest.getDefaultInstance();
    }

    public EnumC14758i0 getRequestCase() {
        int i10 = this.requestCase_;
        if (i10 == 0) {
            return EnumC14758i0.f46156r0;
        }
        if (i10 == 14) {
            return EnumC14758i0.f46152Z;
        }
        if (i10 == 19) {
            return EnumC14758i0.f46153o0;
        }
        if (i10 == 4) {
            return EnumC14758i0.f46151Y;
        }
        if (i10 == 5) {
            return EnumC14758i0.f46154p0;
        }
        if (i10 != 6) {
            return null;
        }
        return EnumC14758i0.f46155q0;
    }

    public EnumC14765j0 getResultCase() {
        int i10 = this.resultCase_;
        if (i10 == 0) {
            return EnumC14765j0.f46188p0;
        }
        if (i10 == 12) {
            return EnumC14765j0.f46187o0;
        }
        if (i10 == 7) {
            return EnumC14765j0.f46185Y;
        }
        if (i10 != 8) {
            return null;
        }
        return EnumC14765j0.f46186Z;
    }

    public LivekitEgress$RoomCompositeEgressRequest getRoomComposite() {
        return this.requestCase_ == 4 ? (LivekitEgress$RoomCompositeEgressRequest) this.request_ : LivekitEgress$RoomCompositeEgressRequest.getDefaultInstance();
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

    public LivekitEgress$SegmentsInfo getSegmentResults(int i10) {
        return (LivekitEgress$SegmentsInfo) this.segmentResults_.get(i10);
    }

    public int getSegmentResultsCount() {
        return this.segmentResults_.size();
    }

    public List<LivekitEgress$SegmentsInfo> getSegmentResultsList() {
        return this.segmentResults_;
    }

    public InterfaceC14648R0 getSegmentResultsOrBuilder(int i10) {
        return (InterfaceC14648R0) this.segmentResults_.get(i10);
    }

    public List<? extends InterfaceC14648R0> getSegmentResultsOrBuilderList() {
        return this.segmentResults_;
    }

    @Deprecated
    public LivekitEgress$SegmentsInfo getSegments() {
        return this.resultCase_ == 12 ? (LivekitEgress$SegmentsInfo) this.result_ : LivekitEgress$SegmentsInfo.getDefaultInstance();
    }

    public long getStartedAt() {
        return this.startedAt_;
    }

    public EnumC14779l0 getStatus() {
        EnumC14779l0 enumC14779l0;
        switch (this.status_) {
            case 0:
                enumC14779l0 = EnumC14779l0.EGRESS_STARTING;
                break;
            case 1:
                enumC14779l0 = EnumC14779l0.EGRESS_ACTIVE;
                break;
            case 2:
                enumC14779l0 = EnumC14779l0.EGRESS_ENDING;
                break;
            case 3:
                enumC14779l0 = EnumC14779l0.EGRESS_COMPLETE;
                break;
            case 4:
                enumC14779l0 = EnumC14779l0.EGRESS_FAILED;
                break;
            case 5:
                enumC14779l0 = EnumC14779l0.EGRESS_ABORTED;
                break;
            case 6:
                enumC14779l0 = EnumC14779l0.EGRESS_LIMIT_REACHED;
                break;
            default:
                enumC14779l0 = null;
                break;
        }
        return enumC14779l0 == null ? EnumC14779l0.UNRECOGNIZED : enumC14779l0;
    }

    public int getStatusValue() {
        return this.status_;
    }

    @Deprecated
    public LivekitEgress$StreamInfoList getStream() {
        return this.resultCase_ == 7 ? (LivekitEgress$StreamInfoList) this.result_ : LivekitEgress$StreamInfoList.getDefaultInstance();
    }

    public LivekitEgress$StreamInfo getStreamResults(int i10) {
        return (LivekitEgress$StreamInfo) this.streamResults_.get(i10);
    }

    public int getStreamResultsCount() {
        return this.streamResults_.size();
    }

    public List<LivekitEgress$StreamInfo> getStreamResultsList() {
        return this.streamResults_;
    }

    public InterfaceC14678W0 getStreamResultsOrBuilder(int i10) {
        return (InterfaceC14678W0) this.streamResults_.get(i10);
    }

    public List<? extends InterfaceC14678W0> getStreamResultsOrBuilderList() {
        return this.streamResults_;
    }

    public LivekitEgress$TrackEgressRequest getTrack() {
        return this.requestCase_ == 6 ? (LivekitEgress$TrackEgressRequest) this.request_ : LivekitEgress$TrackEgressRequest.getDefaultInstance();
    }

    public LivekitEgress$TrackCompositeEgressRequest getTrackComposite() {
        return this.requestCase_ == 5 ? (LivekitEgress$TrackCompositeEgressRequest) this.request_ : LivekitEgress$TrackCompositeEgressRequest.getDefaultInstance();
    }

    public long getUpdatedAt() {
        return this.updatedAt_;
    }

    public LivekitEgress$WebEgressRequest getWeb() {
        return this.requestCase_ == 14 ? (LivekitEgress$WebEgressRequest) this.request_ : LivekitEgress$WebEgressRequest.getDefaultInstance();
    }

    @Deprecated
    public boolean hasFile() {
        return this.resultCase_ == 8;
    }

    public boolean hasParticipant() {
        return this.requestCase_ == 19;
    }

    public boolean hasRoomComposite() {
        return this.requestCase_ == 4;
    }

    @Deprecated
    public boolean hasSegments() {
        return this.resultCase_ == 12;
    }

    @Deprecated
    public boolean hasStream() {
        return this.resultCase_ == 7;
    }

    public boolean hasTrack() {
        return this.requestCase_ == 6;
    }

    public boolean hasTrackComposite() {
        return this.requestCase_ == 5;
    }

    public boolean hasWeb() {
        return this.requestCase_ == 14;
    }

    public static C14751h0 newBuilder(LivekitEgress$EgressInfo livekitEgress$EgressInfo) {
        return (C14751h0) DEFAULT_INSTANCE.createBuilder(livekitEgress$EgressInfo);
    }

    public static LivekitEgress$EgressInfo parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitEgress$EgressInfo) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitEgress$EgressInfo parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitEgress$EgressInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitEgress$EgressInfo parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitEgress$EgressInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFileResults(int i10, LivekitEgress$FileInfo livekitEgress$FileInfo) {
        livekitEgress$FileInfo.getClass();
        ensureFileResultsIsMutable();
        this.fileResults_.add(i10, livekitEgress$FileInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addImageResults(int i10, LivekitEgress$ImagesInfo livekitEgress$ImagesInfo) {
        livekitEgress$ImagesInfo.getClass();
        ensureImageResultsIsMutable();
        this.imageResults_.add(i10, livekitEgress$ImagesInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSegmentResults(int i10, LivekitEgress$SegmentsInfo livekitEgress$SegmentsInfo) {
        livekitEgress$SegmentsInfo.getClass();
        ensureSegmentResultsIsMutable();
        this.segmentResults_.add(i10, livekitEgress$SegmentsInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStreamResults(int i10, LivekitEgress$StreamInfo livekitEgress$StreamInfo) {
        livekitEgress$StreamInfo.getClass();
        ensureStreamResultsIsMutable();
        this.streamResults_.add(i10, livekitEgress$StreamInfo);
    }

    public static LivekitEgress$EgressInfo parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitEgress$EgressInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitEgress$EgressInfo parseFrom(byte[] bArr) {
        return (LivekitEgress$EgressInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitEgress$EgressInfo parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitEgress$EgressInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitEgress$EgressInfo parseFrom(InputStream inputStream) {
        return (LivekitEgress$EgressInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$EgressInfo parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitEgress$EgressInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitEgress$EgressInfo parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitEgress$EgressInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitEgress$EgressInfo parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitEgress$EgressInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
