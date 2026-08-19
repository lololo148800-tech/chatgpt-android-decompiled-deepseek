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
import p793ho.C14563D0;
import p793ho.C14814q0;
import p793ho.EnumC14570E0;
import p793ho.EnumC14821r0;
import p793ho.InterfaceC14625N0;
import p793ho.InterfaceC14690Y0;
import p793ho.InterfaceC14800o0;
import p793ho.InterfaceC14870y0;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitEgress$ParticipantEgressRequest extends AbstractC12133Z implements InterfaceC12094H0 {
    public static final int ADVANCED_FIELD_NUMBER = 5;
    private static final LivekitEgress$ParticipantEgressRequest DEFAULT_INSTANCE;
    public static final int FILE_OUTPUTS_FIELD_NUMBER = 6;
    public static final int IDENTITY_FIELD_NUMBER = 2;
    public static final int IMAGE_OUTPUTS_FIELD_NUMBER = 9;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int PRESET_FIELD_NUMBER = 4;
    public static final int ROOM_NAME_FIELD_NUMBER = 1;
    public static final int SCREEN_SHARE_FIELD_NUMBER = 3;
    public static final int SEGMENT_OUTPUTS_FIELD_NUMBER = 8;
    public static final int STREAM_OUTPUTS_FIELD_NUMBER = 7;
    private Object options_;
    private boolean screenShare_;
    private int optionsCase_ = 0;
    private String roomName_ = "";
    private String identity_ = "";
    private InterfaceC12172m0 fileOutputs_ = AbstractC12133Z.emptyProtobufList();
    private InterfaceC12172m0 streamOutputs_ = AbstractC12133Z.emptyProtobufList();
    private InterfaceC12172m0 segmentOutputs_ = AbstractC12133Z.emptyProtobufList();
    private InterfaceC12172m0 imageOutputs_ = AbstractC12133Z.emptyProtobufList();

    static {
        LivekitEgress$ParticipantEgressRequest livekitEgress$ParticipantEgressRequest = new LivekitEgress$ParticipantEgressRequest();
        DEFAULT_INSTANCE = livekitEgress$ParticipantEgressRequest;
        AbstractC12133Z.registerDefaultInstance(LivekitEgress$ParticipantEgressRequest.class, livekitEgress$ParticipantEgressRequest);
    }

    private LivekitEgress$ParticipantEgressRequest() {
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
        if (this.optionsCase_ == 5) {
            this.optionsCase_ = 0;
            this.options_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFileOutputs() {
        this.fileOutputs_ = AbstractC12133Z.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIdentity() {
        this.identity_ = getDefaultInstance().getIdentity();
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
    public void clearPreset() {
        if (this.optionsCase_ == 4) {
            this.optionsCase_ = 0;
            this.options_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoomName() {
        this.roomName_ = getDefaultInstance().getRoomName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScreenShare() {
        this.screenShare_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSegmentOutputs() {
        this.segmentOutputs_ = AbstractC12133Z.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStreamOutputs() {
        this.streamOutputs_ = AbstractC12133Z.emptyProtobufList();
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

    public static LivekitEgress$ParticipantEgressRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAdvanced(LivekitEgress$EncodingOptions livekitEgress$EncodingOptions) {
        livekitEgress$EncodingOptions.getClass();
        if (this.optionsCase_ != 5 || this.options_ == LivekitEgress$EncodingOptions.getDefaultInstance()) {
            this.options_ = livekitEgress$EncodingOptions;
        } else {
            C14814q0 c14814q0NewBuilder = LivekitEgress$EncodingOptions.newBuilder((LivekitEgress$EncodingOptions) this.options_);
            c14814q0NewBuilder.m13865f(livekitEgress$EncodingOptions);
            this.options_ = c14814q0NewBuilder.m13862c();
        }
        this.optionsCase_ = 5;
    }

    public static C14563D0 newBuilder() {
        return (C14563D0) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitEgress$ParticipantEgressRequest parseDelimitedFrom(InputStream inputStream) {
        return (LivekitEgress$ParticipantEgressRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$ParticipantEgressRequest parseFrom(ByteBuffer byteBuffer) {
        return (LivekitEgress$ParticipantEgressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
        this.optionsCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileOutputs(int i10, LivekitEgress$EncodedFileOutput livekitEgress$EncodedFileOutput) {
        livekitEgress$EncodedFileOutput.getClass();
        ensureFileOutputsIsMutable();
        this.fileOutputs_.set(i10, livekitEgress$EncodedFileOutput);
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
    public void setImageOutputs(int i10, LivekitEgress$ImageOutput livekitEgress$ImageOutput) {
        livekitEgress$ImageOutput.getClass();
        ensureImageOutputsIsMutable();
        this.imageOutputs_.set(i10, livekitEgress$ImageOutput);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreset(EnumC14821r0 enumC14821r0) {
        this.options_ = Integer.valueOf(enumC14821r0.getNumber());
        this.optionsCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPresetValue(int i10) {
        this.optionsCase_ = 4;
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
    public void setScreenShare(boolean z6) {
        this.screenShare_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSegmentOutputs(int i10, LivekitEgress$SegmentedFileOutput livekitEgress$SegmentedFileOutput) {
        livekitEgress$SegmentedFileOutput.getClass();
        ensureSegmentOutputsIsMutable();
        this.segmentOutputs_.set(i10, livekitEgress$SegmentedFileOutput);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStreamOutputs(int i10, LivekitEgress$StreamOutput livekitEgress$StreamOutput) {
        livekitEgress$StreamOutput.getClass();
        ensureStreamOutputsIsMutable();
        this.streamOutputs_.set(i10, livekitEgress$StreamOutput);
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0001\u0000\u0001\t\t\u0000\u0004\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007\u0004?\u0000\u0005<\u0000\u0006\u001b\u0007\u001b\b\u001b\t\u001b", new Object[]{"options_", "optionsCase_", "roomName_", "identity_", "screenShare_", LivekitEgress$EncodingOptions.class, "fileOutputs_", LivekitEgress$EncodedFileOutput.class, "streamOutputs_", LivekitEgress$StreamOutput.class, "segmentOutputs_", LivekitEgress$SegmentedFileOutput.class, "imageOutputs_", LivekitEgress$ImageOutput.class});
            case 3:
                return new LivekitEgress$ParticipantEgressRequest();
            case 4:
                return new C14563D0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitEgress$ParticipantEgressRequest.class) {
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
        return this.optionsCase_ == 5 ? (LivekitEgress$EncodingOptions) this.options_ : LivekitEgress$EncodingOptions.getDefaultInstance();
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

    public String getIdentity() {
        return this.identity_;
    }

    public AbstractC12171m getIdentityBytes() {
        return AbstractC12171m.m14011m(this.identity_);
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

    public EnumC14570E0 getOptionsCase() {
        int i10 = this.optionsCase_;
        if (i10 == 0) {
            return EnumC14570E0.f45826o0;
        }
        if (i10 == 4) {
            return EnumC14570E0.f45824Y;
        }
        if (i10 != 5) {
            return null;
        }
        return EnumC14570E0.f45825Z;
    }

    public EnumC14821r0 getPreset() {
        if (this.optionsCase_ != 4) {
            return EnumC14821r0.H264_720P_30;
        }
        EnumC14821r0 enumC14821r0M16055a = EnumC14821r0.m16055a(((Integer) this.options_).intValue());
        return enumC14821r0M16055a == null ? EnumC14821r0.UNRECOGNIZED : enumC14821r0M16055a;
    }

    public int getPresetValue() {
        if (this.optionsCase_ == 4) {
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

    public boolean getScreenShare() {
        return this.screenShare_;
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

    public boolean hasAdvanced() {
        return this.optionsCase_ == 5;
    }

    public boolean hasPreset() {
        return this.optionsCase_ == 4;
    }

    public static C14563D0 newBuilder(LivekitEgress$ParticipantEgressRequest livekitEgress$ParticipantEgressRequest) {
        return (C14563D0) DEFAULT_INSTANCE.createBuilder(livekitEgress$ParticipantEgressRequest);
    }

    public static LivekitEgress$ParticipantEgressRequest parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitEgress$ParticipantEgressRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitEgress$ParticipantEgressRequest parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitEgress$ParticipantEgressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitEgress$ParticipantEgressRequest parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitEgress$ParticipantEgressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
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

    public static LivekitEgress$ParticipantEgressRequest parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitEgress$ParticipantEgressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitEgress$ParticipantEgressRequest parseFrom(byte[] bArr) {
        return (LivekitEgress$ParticipantEgressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitEgress$ParticipantEgressRequest parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitEgress$ParticipantEgressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitEgress$ParticipantEgressRequest parseFrom(InputStream inputStream) {
        return (LivekitEgress$ParticipantEgressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$ParticipantEgressRequest parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitEgress$ParticipantEgressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitEgress$ParticipantEgressRequest parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitEgress$ParticipantEgressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitEgress$ParticipantEgressRequest parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitEgress$ParticipantEgressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
