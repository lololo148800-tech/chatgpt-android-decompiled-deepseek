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
import p793ho.C14702a0;
import p793ho.C14814q0;
import p793ho.EnumC14709b0;
import p793ho.EnumC14821r0;
import p793ho.InterfaceC14625N0;
import p793ho.InterfaceC14800o0;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitEgress$AutoParticipantEgress extends AbstractC12133Z implements InterfaceC12094H0 {
    public static final int ADVANCED_FIELD_NUMBER = 2;
    private static final LivekitEgress$AutoParticipantEgress DEFAULT_INSTANCE;
    public static final int FILE_OUTPUTS_FIELD_NUMBER = 3;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int PRESET_FIELD_NUMBER = 1;
    public static final int SEGMENT_OUTPUTS_FIELD_NUMBER = 4;
    private Object options_;
    private int optionsCase_ = 0;
    private InterfaceC12172m0 fileOutputs_ = AbstractC12133Z.emptyProtobufList();
    private InterfaceC12172m0 segmentOutputs_ = AbstractC12133Z.emptyProtobufList();

    static {
        LivekitEgress$AutoParticipantEgress livekitEgress$AutoParticipantEgress = new LivekitEgress$AutoParticipantEgress();
        DEFAULT_INSTANCE = livekitEgress$AutoParticipantEgress;
        AbstractC12133Z.registerDefaultInstance(LivekitEgress$AutoParticipantEgress.class, livekitEgress$AutoParticipantEgress);
    }

    private LivekitEgress$AutoParticipantEgress() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFileOutputs(Iterable<? extends LivekitEgress$EncodedFileOutput> iterable) {
        ensureFileOutputsIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.fileOutputs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSegmentOutputs(Iterable<? extends LivekitEgress$SegmentedFileOutput> iterable) {
        ensureSegmentOutputsIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.segmentOutputs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFileOutputs(LivekitEgress$EncodedFileOutput livekitEgress$EncodedFileOutput) {
        livekitEgress$EncodedFileOutput.getClass();
        ensureFileOutputsIsMutable();
        this.fileOutputs_.add(livekitEgress$EncodedFileOutput);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSegmentOutputs(LivekitEgress$SegmentedFileOutput livekitEgress$SegmentedFileOutput) {
        livekitEgress$SegmentedFileOutput.getClass();
        ensureSegmentOutputsIsMutable();
        this.segmentOutputs_.add(livekitEgress$SegmentedFileOutput);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdvanced() {
        if (this.optionsCase_ == 2) {
            this.optionsCase_ = 0;
            this.options_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFileOutputs() {
        this.fileOutputs_ = AbstractC12133Z.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptions() {
        this.optionsCase_ = 0;
        this.options_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPreset() {
        if (this.optionsCase_ == 1) {
            this.optionsCase_ = 0;
            this.options_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSegmentOutputs() {
        this.segmentOutputs_ = AbstractC12133Z.emptyProtobufList();
    }

    private void ensureFileOutputsIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.fileOutputs_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.fileOutputs_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    private void ensureSegmentOutputsIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.segmentOutputs_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.segmentOutputs_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    public static LivekitEgress$AutoParticipantEgress getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAdvanced(LivekitEgress$EncodingOptions livekitEgress$EncodingOptions) {
        livekitEgress$EncodingOptions.getClass();
        if (this.optionsCase_ != 2 || this.options_ == LivekitEgress$EncodingOptions.getDefaultInstance()) {
            this.options_ = livekitEgress$EncodingOptions;
        } else {
            C14814q0 c14814q0NewBuilder = LivekitEgress$EncodingOptions.newBuilder((LivekitEgress$EncodingOptions) this.options_);
            c14814q0NewBuilder.m13865f(livekitEgress$EncodingOptions);
            this.options_ = c14814q0NewBuilder.m13862c();
        }
        this.optionsCase_ = 2;
    }

    public static C14702a0 newBuilder() {
        return (C14702a0) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitEgress$AutoParticipantEgress parseDelimitedFrom(InputStream inputStream) {
        return (LivekitEgress$AutoParticipantEgress) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$AutoParticipantEgress parseFrom(ByteBuffer byteBuffer) {
        return (LivekitEgress$AutoParticipantEgress) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
    public void removeSegmentOutputs(int i10) {
        ensureSegmentOutputsIsMutable();
        this.segmentOutputs_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdvanced(LivekitEgress$EncodingOptions livekitEgress$EncodingOptions) {
        livekitEgress$EncodingOptions.getClass();
        this.options_ = livekitEgress$EncodingOptions;
        this.optionsCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileOutputs(int i10, LivekitEgress$EncodedFileOutput livekitEgress$EncodedFileOutput) {
        livekitEgress$EncodedFileOutput.getClass();
        ensureFileOutputsIsMutable();
        this.fileOutputs_.set(i10, livekitEgress$EncodedFileOutput);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreset(EnumC14821r0 enumC14821r0) {
        this.options_ = Integer.valueOf(enumC14821r0.getNumber());
        this.optionsCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPresetValue(int i10) {
        this.optionsCase_ = 1;
        this.options_ = Integer.valueOf(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSegmentOutputs(int i10, LivekitEgress$SegmentedFileOutput livekitEgress$SegmentedFileOutput) {
        livekitEgress$SegmentedFileOutput.getClass();
        ensureSegmentOutputsIsMutable();
        this.segmentOutputs_.set(i10, livekitEgress$SegmentedFileOutput);
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0002\u0000\u0001?\u0000\u0002<\u0000\u0003\u001b\u0004\u001b", new Object[]{"options_", "optionsCase_", LivekitEgress$EncodingOptions.class, "fileOutputs_", LivekitEgress$EncodedFileOutput.class, "segmentOutputs_", LivekitEgress$SegmentedFileOutput.class});
            case 3:
                return new LivekitEgress$AutoParticipantEgress();
            case 4:
                return new C14702a0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitEgress$AutoParticipantEgress.class) {
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
        return this.optionsCase_ == 2 ? (LivekitEgress$EncodingOptions) this.options_ : LivekitEgress$EncodingOptions.getDefaultInstance();
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

    public EnumC14709b0 getOptionsCase() {
        int i10 = this.optionsCase_;
        if (i10 == 0) {
            return EnumC14709b0.f46021o0;
        }
        if (i10 == 1) {
            return EnumC14709b0.f46019Y;
        }
        if (i10 != 2) {
            return null;
        }
        return EnumC14709b0.f46020Z;
    }

    public EnumC14821r0 getPreset() {
        if (this.optionsCase_ != 1) {
            return EnumC14821r0.H264_720P_30;
        }
        EnumC14821r0 enumC14821r0M16055a = EnumC14821r0.m16055a(((Integer) this.options_).intValue());
        return enumC14821r0M16055a == null ? EnumC14821r0.UNRECOGNIZED : enumC14821r0M16055a;
    }

    public int getPresetValue() {
        if (this.optionsCase_ == 1) {
            return ((Integer) this.options_).intValue();
        }
        return 0;
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

    public boolean hasAdvanced() {
        return this.optionsCase_ == 2;
    }

    public boolean hasPreset() {
        return this.optionsCase_ == 1;
    }

    public static C14702a0 newBuilder(LivekitEgress$AutoParticipantEgress livekitEgress$AutoParticipantEgress) {
        return (C14702a0) DEFAULT_INSTANCE.createBuilder(livekitEgress$AutoParticipantEgress);
    }

    public static LivekitEgress$AutoParticipantEgress parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitEgress$AutoParticipantEgress) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitEgress$AutoParticipantEgress parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitEgress$AutoParticipantEgress) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitEgress$AutoParticipantEgress parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitEgress$AutoParticipantEgress) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFileOutputs(int i10, LivekitEgress$EncodedFileOutput livekitEgress$EncodedFileOutput) {
        livekitEgress$EncodedFileOutput.getClass();
        ensureFileOutputsIsMutable();
        this.fileOutputs_.add(i10, livekitEgress$EncodedFileOutput);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSegmentOutputs(int i10, LivekitEgress$SegmentedFileOutput livekitEgress$SegmentedFileOutput) {
        livekitEgress$SegmentedFileOutput.getClass();
        ensureSegmentOutputsIsMutable();
        this.segmentOutputs_.add(i10, livekitEgress$SegmentedFileOutput);
    }

    public static LivekitEgress$AutoParticipantEgress parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitEgress$AutoParticipantEgress) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitEgress$AutoParticipantEgress parseFrom(byte[] bArr) {
        return (LivekitEgress$AutoParticipantEgress) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitEgress$AutoParticipantEgress parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitEgress$AutoParticipantEgress) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitEgress$AutoParticipantEgress parseFrom(InputStream inputStream) {
        return (LivekitEgress$AutoParticipantEgress) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$AutoParticipantEgress parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitEgress$AutoParticipantEgress) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitEgress$AutoParticipantEgress parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitEgress$AutoParticipantEgress) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitEgress$AutoParticipantEgress parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitEgress$AutoParticipantEgress) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
