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
import p793ho.C14613L0;
import p793ho.C14684X0;
import p793ho.C14703a1;
import p793ho.C14786m0;
import p793ho.C14814q0;
import p793ho.EnumC14710b1;
import p793ho.EnumC14717c1;
import p793ho.EnumC14821r0;
import p793ho.InterfaceC14625N0;
import p793ho.InterfaceC14690Y0;
import p793ho.InterfaceC14800o0;
import p793ho.InterfaceC14870y0;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitEgress$TrackCompositeEgressRequest extends AbstractC12133Z implements InterfaceC12094H0 {
    public static final int ADVANCED_FIELD_NUMBER = 7;
    public static final int AUDIO_TRACK_ID_FIELD_NUMBER = 2;
    private static final LivekitEgress$TrackCompositeEgressRequest DEFAULT_INSTANCE;
    public static final int FILE_FIELD_NUMBER = 4;
    public static final int FILE_OUTPUTS_FIELD_NUMBER = 11;
    public static final int IMAGE_OUTPUTS_FIELD_NUMBER = 14;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int PRESET_FIELD_NUMBER = 6;
    public static final int ROOM_NAME_FIELD_NUMBER = 1;
    public static final int SEGMENTS_FIELD_NUMBER = 8;
    public static final int SEGMENT_OUTPUTS_FIELD_NUMBER = 13;
    public static final int STREAM_FIELD_NUMBER = 5;
    public static final int STREAM_OUTPUTS_FIELD_NUMBER = 12;
    public static final int VIDEO_TRACK_ID_FIELD_NUMBER = 3;
    private Object options_;
    private Object output_;
    private int outputCase_ = 0;
    private int optionsCase_ = 0;
    private String roomName_ = "";
    private String audioTrackId_ = "";
    private String videoTrackId_ = "";
    private InterfaceC12172m0 fileOutputs_ = AbstractC12133Z.emptyProtobufList();
    private InterfaceC12172m0 streamOutputs_ = AbstractC12133Z.emptyProtobufList();
    private InterfaceC12172m0 segmentOutputs_ = AbstractC12133Z.emptyProtobufList();
    private InterfaceC12172m0 imageOutputs_ = AbstractC12133Z.emptyProtobufList();

    static {
        LivekitEgress$TrackCompositeEgressRequest livekitEgress$TrackCompositeEgressRequest = new LivekitEgress$TrackCompositeEgressRequest();
        DEFAULT_INSTANCE = livekitEgress$TrackCompositeEgressRequest;
        AbstractC12133Z.registerDefaultInstance(LivekitEgress$TrackCompositeEgressRequest.class, livekitEgress$TrackCompositeEgressRequest);
    }

    private LivekitEgress$TrackCompositeEgressRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFileOutputs(Iterable<? extends LivekitEgress$EncodedFileOutput> iterable) {
        ensureFileOutputsIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.fileOutputs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllImageOutputs(Iterable<? extends LivekitEgress$ImageOutput> iterable) {
        ensureImageOutputsIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.imageOutputs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSegmentOutputs(Iterable<? extends LivekitEgress$SegmentedFileOutput> iterable) {
        ensureSegmentOutputsIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.segmentOutputs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllStreamOutputs(Iterable<? extends LivekitEgress$StreamOutput> iterable) {
        ensureStreamOutputsIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.streamOutputs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFileOutputs(LivekitEgress$EncodedFileOutput livekitEgress$EncodedFileOutput) {
        livekitEgress$EncodedFileOutput.getClass();
        ensureFileOutputsIsMutable();
        this.fileOutputs_.add(livekitEgress$EncodedFileOutput);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addImageOutputs(LivekitEgress$ImageOutput livekitEgress$ImageOutput) {
        livekitEgress$ImageOutput.getClass();
        ensureImageOutputsIsMutable();
        this.imageOutputs_.add(livekitEgress$ImageOutput);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSegmentOutputs(LivekitEgress$SegmentedFileOutput livekitEgress$SegmentedFileOutput) {
        livekitEgress$SegmentedFileOutput.getClass();
        ensureSegmentOutputsIsMutable();
        this.segmentOutputs_.add(livekitEgress$SegmentedFileOutput);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStreamOutputs(LivekitEgress$StreamOutput livekitEgress$StreamOutput) {
        livekitEgress$StreamOutput.getClass();
        ensureStreamOutputsIsMutable();
        this.streamOutputs_.add(livekitEgress$StreamOutput);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdvanced() {
        if (this.optionsCase_ == 7) {
            this.optionsCase_ = 0;
            this.options_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAudioTrackId() {
        this.audioTrackId_ = getDefaultInstance().getAudioTrackId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFile() {
        if (this.outputCase_ == 4) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFileOutputs() {
        this.fileOutputs_ = AbstractC12133Z.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImageOutputs() {
        this.imageOutputs_ = AbstractC12133Z.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptions() {
        this.optionsCase_ = 0;
        this.options_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOutput() {
        this.outputCase_ = 0;
        this.output_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPreset() {
        if (this.optionsCase_ == 6) {
            this.optionsCase_ = 0;
            this.options_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoomName() {
        this.roomName_ = getDefaultInstance().getRoomName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSegmentOutputs() {
        this.segmentOutputs_ = AbstractC12133Z.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSegments() {
        if (this.outputCase_ == 8) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStream() {
        if (this.outputCase_ == 5) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStreamOutputs() {
        this.streamOutputs_ = AbstractC12133Z.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVideoTrackId() {
        this.videoTrackId_ = getDefaultInstance().getVideoTrackId();
    }

    private void ensureFileOutputsIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.fileOutputs_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.fileOutputs_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    private void ensureImageOutputsIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.imageOutputs_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.imageOutputs_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    private void ensureSegmentOutputsIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.segmentOutputs_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.segmentOutputs_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    private void ensureStreamOutputsIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.streamOutputs_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.streamOutputs_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    public static LivekitEgress$TrackCompositeEgressRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAdvanced(LivekitEgress$EncodingOptions livekitEgress$EncodingOptions) {
        livekitEgress$EncodingOptions.getClass();
        if (this.optionsCase_ != 7 || this.options_ == LivekitEgress$EncodingOptions.getDefaultInstance()) {
            this.options_ = livekitEgress$EncodingOptions;
        } else {
            C14814q0 c14814q0NewBuilder = LivekitEgress$EncodingOptions.newBuilder((LivekitEgress$EncodingOptions) this.options_);
            c14814q0NewBuilder.m13865f(livekitEgress$EncodingOptions);
            this.options_ = c14814q0NewBuilder.m13862c();
        }
        this.optionsCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFile(LivekitEgress$EncodedFileOutput livekitEgress$EncodedFileOutput) {
        livekitEgress$EncodedFileOutput.getClass();
        if (this.outputCase_ != 4 || this.output_ == LivekitEgress$EncodedFileOutput.getDefaultInstance()) {
            this.output_ = livekitEgress$EncodedFileOutput;
        } else {
            C14786m0 c14786m0NewBuilder = LivekitEgress$EncodedFileOutput.newBuilder((LivekitEgress$EncodedFileOutput) this.output_);
            c14786m0NewBuilder.m13865f(livekitEgress$EncodedFileOutput);
            this.output_ = c14786m0NewBuilder.m13862c();
        }
        this.outputCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSegments(LivekitEgress$SegmentedFileOutput livekitEgress$SegmentedFileOutput) {
        livekitEgress$SegmentedFileOutput.getClass();
        if (this.outputCase_ != 8 || this.output_ == LivekitEgress$SegmentedFileOutput.getDefaultInstance()) {
            this.output_ = livekitEgress$SegmentedFileOutput;
        } else {
            C14613L0 c14613l0NewBuilder = LivekitEgress$SegmentedFileOutput.newBuilder((LivekitEgress$SegmentedFileOutput) this.output_);
            c14613l0NewBuilder.m13865f(livekitEgress$SegmentedFileOutput);
            this.output_ = c14613l0NewBuilder.m13862c();
        }
        this.outputCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStream(LivekitEgress$StreamOutput livekitEgress$StreamOutput) {
        livekitEgress$StreamOutput.getClass();
        if (this.outputCase_ != 5 || this.output_ == LivekitEgress$StreamOutput.getDefaultInstance()) {
            this.output_ = livekitEgress$StreamOutput;
        } else {
            C14684X0 c14684x0NewBuilder = LivekitEgress$StreamOutput.newBuilder((LivekitEgress$StreamOutput) this.output_);
            c14684x0NewBuilder.m13865f(livekitEgress$StreamOutput);
            this.output_ = c14684x0NewBuilder.m13862c();
        }
        this.outputCase_ = 5;
    }

    public static C14703a1 newBuilder() {
        return (C14703a1) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitEgress$TrackCompositeEgressRequest parseDelimitedFrom(InputStream inputStream) {
        return (LivekitEgress$TrackCompositeEgressRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$TrackCompositeEgressRequest parseFrom(ByteBuffer byteBuffer) {
        return (LivekitEgress$TrackCompositeEgressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeFileOutputs(int i10) {
        ensureFileOutputsIsMutable();
        this.fileOutputs_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeImageOutputs(int i10) {
        ensureImageOutputsIsMutable();
        this.imageOutputs_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSegmentOutputs(int i10) {
        ensureSegmentOutputsIsMutable();
        this.segmentOutputs_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeStreamOutputs(int i10) {
        ensureStreamOutputsIsMutable();
        this.streamOutputs_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdvanced(LivekitEgress$EncodingOptions livekitEgress$EncodingOptions) {
        livekitEgress$EncodingOptions.getClass();
        this.options_ = livekitEgress$EncodingOptions;
        this.optionsCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAudioTrackId(String str) {
        str.getClass();
        this.audioTrackId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAudioTrackIdBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.audioTrackId_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFile(LivekitEgress$EncodedFileOutput livekitEgress$EncodedFileOutput) {
        livekitEgress$EncodedFileOutput.getClass();
        this.output_ = livekitEgress$EncodedFileOutput;
        this.outputCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileOutputs(int i10, LivekitEgress$EncodedFileOutput livekitEgress$EncodedFileOutput) {
        livekitEgress$EncodedFileOutput.getClass();
        ensureFileOutputsIsMutable();
        this.fileOutputs_.set(i10, livekitEgress$EncodedFileOutput);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageOutputs(int i10, LivekitEgress$ImageOutput livekitEgress$ImageOutput) {
        livekitEgress$ImageOutput.getClass();
        ensureImageOutputsIsMutable();
        this.imageOutputs_.set(i10, livekitEgress$ImageOutput);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreset(EnumC14821r0 enumC14821r0) {
        this.options_ = Integer.valueOf(enumC14821r0.getNumber());
        this.optionsCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPresetValue(int i10) {
        this.optionsCase_ = 6;
        this.options_ = Integer.valueOf(i10);
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
    public void setSegmentOutputs(int i10, LivekitEgress$SegmentedFileOutput livekitEgress$SegmentedFileOutput) {
        livekitEgress$SegmentedFileOutput.getClass();
        ensureSegmentOutputsIsMutable();
        this.segmentOutputs_.set(i10, livekitEgress$SegmentedFileOutput);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSegments(LivekitEgress$SegmentedFileOutput livekitEgress$SegmentedFileOutput) {
        livekitEgress$SegmentedFileOutput.getClass();
        this.output_ = livekitEgress$SegmentedFileOutput;
        this.outputCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStream(LivekitEgress$StreamOutput livekitEgress$StreamOutput) {
        livekitEgress$StreamOutput.getClass();
        this.output_ = livekitEgress$StreamOutput;
        this.outputCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStreamOutputs(int i10, LivekitEgress$StreamOutput livekitEgress$StreamOutput) {
        livekitEgress$StreamOutput.getClass();
        ensureStreamOutputsIsMutable();
        this.streamOutputs_.set(i10, livekitEgress$StreamOutput);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoTrackId(String str) {
        str.getClass();
        this.videoTrackId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoTrackIdBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.videoTrackId_ = abstractC12171m.m14012w();
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0002\u0000\u0001\u000e\f\u0000\u0004\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004<\u0000\u0005<\u0000\u0006?\u0001\u0007<\u0001\b<\u0000\u000b\u001b\f\u001b\r\u001b\u000e\u001b", new Object[]{"output_", "outputCase_", "options_", "optionsCase_", "roomName_", "audioTrackId_", "videoTrackId_", LivekitEgress$EncodedFileOutput.class, LivekitEgress$StreamOutput.class, LivekitEgress$EncodingOptions.class, LivekitEgress$SegmentedFileOutput.class, "fileOutputs_", LivekitEgress$EncodedFileOutput.class, "streamOutputs_", LivekitEgress$StreamOutput.class, "segmentOutputs_", LivekitEgress$SegmentedFileOutput.class, "imageOutputs_", LivekitEgress$ImageOutput.class});
            case 3:
                return new LivekitEgress$TrackCompositeEgressRequest();
            case 4:
                return new C14703a1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitEgress$TrackCompositeEgressRequest.class) {
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

    public LivekitEgress$EncodingOptions getAdvanced() {
        return this.optionsCase_ == 7 ? (LivekitEgress$EncodingOptions) this.options_ : LivekitEgress$EncodingOptions.getDefaultInstance();
    }

    public String getAudioTrackId() {
        return this.audioTrackId_;
    }

    public AbstractC12171m getAudioTrackIdBytes() {
        return AbstractC12171m.m14011m(this.audioTrackId_);
    }

    @Deprecated
    public LivekitEgress$EncodedFileOutput getFile() {
        return this.outputCase_ == 4 ? (LivekitEgress$EncodedFileOutput) this.output_ : LivekitEgress$EncodedFileOutput.getDefaultInstance();
    }

    public LivekitEgress$EncodedFileOutput getFileOutputs(int i10) {
        return (LivekitEgress$EncodedFileOutput) this.fileOutputs_.get(i10);
    }

    public int getFileOutputsCount() {
        return this.fileOutputs_.size();
    }

    public List<LivekitEgress$EncodedFileOutput> getFileOutputsList() {
        return this.fileOutputs_;
    }

    public InterfaceC14800o0 getFileOutputsOrBuilder(int i10) {
        return (InterfaceC14800o0) this.fileOutputs_.get(i10);
    }

    public List<? extends InterfaceC14800o0> getFileOutputsOrBuilderList() {
        return this.fileOutputs_;
    }

    public LivekitEgress$ImageOutput getImageOutputs(int i10) {
        return (LivekitEgress$ImageOutput) this.imageOutputs_.get(i10);
    }

    public int getImageOutputsCount() {
        return this.imageOutputs_.size();
    }

    public List<LivekitEgress$ImageOutput> getImageOutputsList() {
        return this.imageOutputs_;
    }

    public InterfaceC14870y0 getImageOutputsOrBuilder(int i10) {
        return (InterfaceC14870y0) this.imageOutputs_.get(i10);
    }

    public List<? extends InterfaceC14870y0> getImageOutputsOrBuilderList() {
        return this.imageOutputs_;
    }

    public EnumC14710b1 getOptionsCase() {
        int i10 = this.optionsCase_;
        if (i10 == 0) {
            return EnumC14710b1.f46025o0;
        }
        if (i10 == 6) {
            return EnumC14710b1.f46023Y;
        }
        if (i10 != 7) {
            return null;
        }
        return EnumC14710b1.f46024Z;
    }

    public EnumC14717c1 getOutputCase() {
        int i10 = this.outputCase_;
        if (i10 == 0) {
            return EnumC14717c1.f46047p0;
        }
        if (i10 == 8) {
            return EnumC14717c1.f46046o0;
        }
        if (i10 == 4) {
            return EnumC14717c1.f46044Y;
        }
        if (i10 != 5) {
            return null;
        }
        return EnumC14717c1.f46045Z;
    }

    public EnumC14821r0 getPreset() {
        if (this.optionsCase_ != 6) {
            return EnumC14821r0.H264_720P_30;
        }
        EnumC14821r0 enumC14821r0M16055a = EnumC14821r0.m16055a(((Integer) this.options_).intValue());
        return enumC14821r0M16055a == null ? EnumC14821r0.UNRECOGNIZED : enumC14821r0M16055a;
    }

    public int getPresetValue() {
        if (this.optionsCase_ == 6) {
            return ((Integer) this.options_).intValue();
        }
        return 0;
    }

    public String getRoomName() {
        return this.roomName_;
    }

    public AbstractC12171m getRoomNameBytes() {
        return AbstractC12171m.m14011m(this.roomName_);
    }

    public LivekitEgress$SegmentedFileOutput getSegmentOutputs(int i10) {
        return (LivekitEgress$SegmentedFileOutput) this.segmentOutputs_.get(i10);
    }

    public int getSegmentOutputsCount() {
        return this.segmentOutputs_.size();
    }

    public List<LivekitEgress$SegmentedFileOutput> getSegmentOutputsList() {
        return this.segmentOutputs_;
    }

    public InterfaceC14625N0 getSegmentOutputsOrBuilder(int i10) {
        return (InterfaceC14625N0) this.segmentOutputs_.get(i10);
    }

    public List<? extends InterfaceC14625N0> getSegmentOutputsOrBuilderList() {
        return this.segmentOutputs_;
    }

    @Deprecated
    public LivekitEgress$SegmentedFileOutput getSegments() {
        return this.outputCase_ == 8 ? (LivekitEgress$SegmentedFileOutput) this.output_ : LivekitEgress$SegmentedFileOutput.getDefaultInstance();
    }

    @Deprecated
    public LivekitEgress$StreamOutput getStream() {
        return this.outputCase_ == 5 ? (LivekitEgress$StreamOutput) this.output_ : LivekitEgress$StreamOutput.getDefaultInstance();
    }

    public LivekitEgress$StreamOutput getStreamOutputs(int i10) {
        return (LivekitEgress$StreamOutput) this.streamOutputs_.get(i10);
    }

    public int getStreamOutputsCount() {
        return this.streamOutputs_.size();
    }

    public List<LivekitEgress$StreamOutput> getStreamOutputsList() {
        return this.streamOutputs_;
    }

    public InterfaceC14690Y0 getStreamOutputsOrBuilder(int i10) {
        return (InterfaceC14690Y0) this.streamOutputs_.get(i10);
    }

    public List<? extends InterfaceC14690Y0> getStreamOutputsOrBuilderList() {
        return this.streamOutputs_;
    }

    public String getVideoTrackId() {
        return this.videoTrackId_;
    }

    public AbstractC12171m getVideoTrackIdBytes() {
        return AbstractC12171m.m14011m(this.videoTrackId_);
    }

    public boolean hasAdvanced() {
        return this.optionsCase_ == 7;
    }

    @Deprecated
    public boolean hasFile() {
        return this.outputCase_ == 4;
    }

    public boolean hasPreset() {
        return this.optionsCase_ == 6;
    }

    @Deprecated
    public boolean hasSegments() {
        return this.outputCase_ == 8;
    }

    @Deprecated
    public boolean hasStream() {
        return this.outputCase_ == 5;
    }

    public static C14703a1 newBuilder(LivekitEgress$TrackCompositeEgressRequest livekitEgress$TrackCompositeEgressRequest) {
        return (C14703a1) DEFAULT_INSTANCE.createBuilder(livekitEgress$TrackCompositeEgressRequest);
    }

    public static LivekitEgress$TrackCompositeEgressRequest parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitEgress$TrackCompositeEgressRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitEgress$TrackCompositeEgressRequest parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitEgress$TrackCompositeEgressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitEgress$TrackCompositeEgressRequest parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitEgress$TrackCompositeEgressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFileOutputs(int i10, LivekitEgress$EncodedFileOutput livekitEgress$EncodedFileOutput) {
        livekitEgress$EncodedFileOutput.getClass();
        ensureFileOutputsIsMutable();
        this.fileOutputs_.add(i10, livekitEgress$EncodedFileOutput);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addImageOutputs(int i10, LivekitEgress$ImageOutput livekitEgress$ImageOutput) {
        livekitEgress$ImageOutput.getClass();
        ensureImageOutputsIsMutable();
        this.imageOutputs_.add(i10, livekitEgress$ImageOutput);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSegmentOutputs(int i10, LivekitEgress$SegmentedFileOutput livekitEgress$SegmentedFileOutput) {
        livekitEgress$SegmentedFileOutput.getClass();
        ensureSegmentOutputsIsMutable();
        this.segmentOutputs_.add(i10, livekitEgress$SegmentedFileOutput);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStreamOutputs(int i10, LivekitEgress$StreamOutput livekitEgress$StreamOutput) {
        livekitEgress$StreamOutput.getClass();
        ensureStreamOutputsIsMutable();
        this.streamOutputs_.add(i10, livekitEgress$StreamOutput);
    }

    public static LivekitEgress$TrackCompositeEgressRequest parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitEgress$TrackCompositeEgressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitEgress$TrackCompositeEgressRequest parseFrom(byte[] bArr) {
        return (LivekitEgress$TrackCompositeEgressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitEgress$TrackCompositeEgressRequest parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitEgress$TrackCompositeEgressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitEgress$TrackCompositeEgressRequest parseFrom(InputStream inputStream) {
        return (LivekitEgress$TrackCompositeEgressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$TrackCompositeEgressRequest parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitEgress$TrackCompositeEgressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitEgress$TrackCompositeEgressRequest parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitEgress$TrackCompositeEgressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitEgress$TrackCompositeEgressRequest parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitEgress$TrackCompositeEgressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
