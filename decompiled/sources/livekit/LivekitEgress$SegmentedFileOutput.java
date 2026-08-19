package livekit;

import com.google.protobuf.AbstractC12133Z;
import com.google.protobuf.AbstractC12138b;
import com.google.protobuf.AbstractC12171m;
import com.google.protobuf.AbstractC12186r;
import com.google.protobuf.C12087F;
import com.google.protobuf.C12123U;
import com.google.protobuf.EnumC12131Y;
import com.google.protobuf.InterfaceC12124U0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p793ho.C14601J0;
import p793ho.C14613L0;
import p793ho.C14695Z;
import p793ho.C14730e0;
import p793ho.C14842u0;
import p793ho.EnumC14619M0;
import p793ho.EnumC14631O0;
import p793ho.EnumC14637P0;
import p793ho.InterfaceC14625N0;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitEgress$SegmentedFileOutput extends AbstractC12133Z implements InterfaceC14625N0 {
    public static final int ALIOSS_FIELD_NUMBER = 9;
    public static final int AZURE_FIELD_NUMBER = 7;
    private static final LivekitEgress$SegmentedFileOutput DEFAULT_INSTANCE;
    public static final int DISABLE_MANIFEST_FIELD_NUMBER = 8;
    public static final int FILENAME_PREFIX_FIELD_NUMBER = 2;
    public static final int FILENAME_SUFFIX_FIELD_NUMBER = 10;
    public static final int GCP_FIELD_NUMBER = 6;
    public static final int LIVE_PLAYLIST_NAME_FIELD_NUMBER = 11;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int PLAYLIST_NAME_FIELD_NUMBER = 3;
    public static final int PROTOCOL_FIELD_NUMBER = 1;
    public static final int S3_FIELD_NUMBER = 5;
    public static final int SEGMENT_DURATION_FIELD_NUMBER = 4;
    private boolean disableManifest_;
    private int filenameSuffix_;
    private Object output_;
    private int protocol_;
    private int segmentDuration_;
    private int outputCase_ = 0;
    private String filenamePrefix_ = "";
    private String playlistName_ = "";
    private String livePlaylistName_ = "";

    static {
        LivekitEgress$SegmentedFileOutput livekitEgress$SegmentedFileOutput = new LivekitEgress$SegmentedFileOutput();
        DEFAULT_INSTANCE = livekitEgress$SegmentedFileOutput;
        AbstractC12133Z.registerDefaultInstance(LivekitEgress$SegmentedFileOutput.class, livekitEgress$SegmentedFileOutput);
    }

    private LivekitEgress$SegmentedFileOutput() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAliOSS() {
        if (this.outputCase_ == 9) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAzure() {
        if (this.outputCase_ == 7) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisableManifest() {
        this.disableManifest_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFilenamePrefix() {
        this.filenamePrefix_ = getDefaultInstance().getFilenamePrefix();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFilenameSuffix() {
        this.filenameSuffix_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGcp() {
        if (this.outputCase_ == 6) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLivePlaylistName() {
        this.livePlaylistName_ = getDefaultInstance().getLivePlaylistName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOutput() {
        this.outputCase_ = 0;
        this.output_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlaylistName() {
        this.playlistName_ = getDefaultInstance().getPlaylistName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProtocol() {
        this.protocol_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearS3() {
        if (this.outputCase_ == 5) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSegmentDuration() {
        this.segmentDuration_ = 0;
    }

    public static LivekitEgress$SegmentedFileOutput getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAliOSS(LivekitEgress$AliOSSUpload livekitEgress$AliOSSUpload) {
        livekitEgress$AliOSSUpload.getClass();
        if (this.outputCase_ != 9 || this.output_ == LivekitEgress$AliOSSUpload.getDefaultInstance()) {
            this.output_ = livekitEgress$AliOSSUpload;
        } else {
            C14695Z c14695zNewBuilder = LivekitEgress$AliOSSUpload.newBuilder((LivekitEgress$AliOSSUpload) this.output_);
            c14695zNewBuilder.m13865f(livekitEgress$AliOSSUpload);
            this.output_ = c14695zNewBuilder.m13862c();
        }
        this.outputCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAzure(LivekitEgress$AzureBlobUpload livekitEgress$AzureBlobUpload) {
        livekitEgress$AzureBlobUpload.getClass();
        if (this.outputCase_ != 7 || this.output_ == LivekitEgress$AzureBlobUpload.getDefaultInstance()) {
            this.output_ = livekitEgress$AzureBlobUpload;
        } else {
            C14730e0 c14730e0NewBuilder = LivekitEgress$AzureBlobUpload.newBuilder((LivekitEgress$AzureBlobUpload) this.output_);
            c14730e0NewBuilder.m13865f(livekitEgress$AzureBlobUpload);
            this.output_ = c14730e0NewBuilder.m13862c();
        }
        this.outputCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGcp(LivekitEgress$GCPUpload livekitEgress$GCPUpload) {
        livekitEgress$GCPUpload.getClass();
        if (this.outputCase_ != 6 || this.output_ == LivekitEgress$GCPUpload.getDefaultInstance()) {
            this.output_ = livekitEgress$GCPUpload;
        } else {
            C14842u0 c14842u0NewBuilder = LivekitEgress$GCPUpload.newBuilder((LivekitEgress$GCPUpload) this.output_);
            c14842u0NewBuilder.m13865f(livekitEgress$GCPUpload);
            this.output_ = c14842u0NewBuilder.m13862c();
        }
        this.outputCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeS3(LivekitEgress$S3Upload livekitEgress$S3Upload) {
        livekitEgress$S3Upload.getClass();
        if (this.outputCase_ != 5 || this.output_ == LivekitEgress$S3Upload.getDefaultInstance()) {
            this.output_ = livekitEgress$S3Upload;
        } else {
            C14601J0 c14601j0NewBuilder = LivekitEgress$S3Upload.newBuilder((LivekitEgress$S3Upload) this.output_);
            c14601j0NewBuilder.m13865f(livekitEgress$S3Upload);
            this.output_ = c14601j0NewBuilder.m13862c();
        }
        this.outputCase_ = 5;
    }

    public static C14613L0 newBuilder() {
        return (C14613L0) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitEgress$SegmentedFileOutput parseDelimitedFrom(InputStream inputStream) {
        return (LivekitEgress$SegmentedFileOutput) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$SegmentedFileOutput parseFrom(ByteBuffer byteBuffer) {
        return (LivekitEgress$SegmentedFileOutput) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAliOSS(LivekitEgress$AliOSSUpload livekitEgress$AliOSSUpload) {
        livekitEgress$AliOSSUpload.getClass();
        this.output_ = livekitEgress$AliOSSUpload;
        this.outputCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAzure(LivekitEgress$AzureBlobUpload livekitEgress$AzureBlobUpload) {
        livekitEgress$AzureBlobUpload.getClass();
        this.output_ = livekitEgress$AzureBlobUpload;
        this.outputCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisableManifest(boolean z6) {
        this.disableManifest_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFilenamePrefix(String str) {
        str.getClass();
        this.filenamePrefix_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFilenamePrefixBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.filenamePrefix_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFilenameSuffix(EnumC14637P0 enumC14637P0) {
        this.filenameSuffix_ = enumC14637P0.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFilenameSuffixValue(int i10) {
        this.filenameSuffix_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGcp(LivekitEgress$GCPUpload livekitEgress$GCPUpload) {
        livekitEgress$GCPUpload.getClass();
        this.output_ = livekitEgress$GCPUpload;
        this.outputCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLivePlaylistName(String str) {
        str.getClass();
        this.livePlaylistName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLivePlaylistNameBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.livePlaylistName_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaylistName(String str) {
        str.getClass();
        this.playlistName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaylistNameBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.playlistName_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProtocol(EnumC14631O0 enumC14631O0) {
        this.protocol_ = enumC14631O0.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProtocolValue(int i10) {
        this.protocol_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setS3(LivekitEgress$S3Upload livekitEgress$S3Upload) {
        livekitEgress$S3Upload.getClass();
        this.output_ = livekitEgress$S3Upload;
        this.outputCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSegmentDuration(int i10) {
        this.segmentDuration_ = i10;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0001\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004\u000b\u0005<\u0000\u0006<\u0000\u0007<\u0000\b\u0007\t<\u0000\n\f\u000bȈ", new Object[]{"output_", "outputCase_", "protocol_", "filenamePrefix_", "playlistName_", "segmentDuration_", LivekitEgress$S3Upload.class, LivekitEgress$GCPUpload.class, LivekitEgress$AzureBlobUpload.class, "disableManifest_", LivekitEgress$AliOSSUpload.class, "filenameSuffix_", "livePlaylistName_"});
            case 3:
                return new LivekitEgress$SegmentedFileOutput();
            case 4:
                return new C14613L0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitEgress$SegmentedFileOutput.class) {
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

    public LivekitEgress$AliOSSUpload getAliOSS() {
        return this.outputCase_ == 9 ? (LivekitEgress$AliOSSUpload) this.output_ : LivekitEgress$AliOSSUpload.getDefaultInstance();
    }

    public LivekitEgress$AzureBlobUpload getAzure() {
        return this.outputCase_ == 7 ? (LivekitEgress$AzureBlobUpload) this.output_ : LivekitEgress$AzureBlobUpload.getDefaultInstance();
    }

    public boolean getDisableManifest() {
        return this.disableManifest_;
    }

    public String getFilenamePrefix() {
        return this.filenamePrefix_;
    }

    public AbstractC12171m getFilenamePrefixBytes() {
        return AbstractC12171m.m14011m(this.filenamePrefix_);
    }

    public EnumC14637P0 getFilenameSuffix() {
        EnumC14637P0 enumC14637P0;
        int i10 = this.filenameSuffix_;
        if (i10 != 0) {
            enumC14637P0 = i10 != 1 ? null : EnumC14637P0.TIMESTAMP;
        } else {
            enumC14637P0 = EnumC14637P0.INDEX;
        }
        return enumC14637P0 == null ? EnumC14637P0.UNRECOGNIZED : enumC14637P0;
    }

    public int getFilenameSuffixValue() {
        return this.filenameSuffix_;
    }

    public LivekitEgress$GCPUpload getGcp() {
        return this.outputCase_ == 6 ? (LivekitEgress$GCPUpload) this.output_ : LivekitEgress$GCPUpload.getDefaultInstance();
    }

    public String getLivePlaylistName() {
        return this.livePlaylistName_;
    }

    public AbstractC12171m getLivePlaylistNameBytes() {
        return AbstractC12171m.m14011m(this.livePlaylistName_);
    }

    public EnumC14619M0 getOutputCase() {
        int i10 = this.outputCase_;
        if (i10 == 0) {
            return EnumC14619M0.f45913q0;
        }
        if (i10 == 9) {
            return EnumC14619M0.f45912p0;
        }
        if (i10 == 5) {
            return EnumC14619M0.f45909Y;
        }
        if (i10 == 6) {
            return EnumC14619M0.f45910Z;
        }
        if (i10 != 7) {
            return null;
        }
        return EnumC14619M0.f45911o0;
    }

    public String getPlaylistName() {
        return this.playlistName_;
    }

    public AbstractC12171m getPlaylistNameBytes() {
        return AbstractC12171m.m14011m(this.playlistName_);
    }

    public EnumC14631O0 getProtocol() {
        EnumC14631O0 enumC14631O0;
        int i10 = this.protocol_;
        if (i10 != 0) {
            enumC14631O0 = i10 != 1 ? null : EnumC14631O0.HLS_PROTOCOL;
        } else {
            enumC14631O0 = EnumC14631O0.DEFAULT_SEGMENTED_FILE_PROTOCOL;
        }
        return enumC14631O0 == null ? EnumC14631O0.UNRECOGNIZED : enumC14631O0;
    }

    public int getProtocolValue() {
        return this.protocol_;
    }

    public LivekitEgress$S3Upload getS3() {
        return this.outputCase_ == 5 ? (LivekitEgress$S3Upload) this.output_ : LivekitEgress$S3Upload.getDefaultInstance();
    }

    public int getSegmentDuration() {
        return this.segmentDuration_;
    }

    public boolean hasAliOSS() {
        return this.outputCase_ == 9;
    }

    public boolean hasAzure() {
        return this.outputCase_ == 7;
    }

    public boolean hasGcp() {
        return this.outputCase_ == 6;
    }

    public boolean hasS3() {
        return this.outputCase_ == 5;
    }

    public static C14613L0 newBuilder(LivekitEgress$SegmentedFileOutput livekitEgress$SegmentedFileOutput) {
        return (C14613L0) DEFAULT_INSTANCE.createBuilder(livekitEgress$SegmentedFileOutput);
    }

    public static LivekitEgress$SegmentedFileOutput parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitEgress$SegmentedFileOutput) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitEgress$SegmentedFileOutput parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitEgress$SegmentedFileOutput) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitEgress$SegmentedFileOutput parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitEgress$SegmentedFileOutput) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitEgress$SegmentedFileOutput parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitEgress$SegmentedFileOutput) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitEgress$SegmentedFileOutput parseFrom(byte[] bArr) {
        return (LivekitEgress$SegmentedFileOutput) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitEgress$SegmentedFileOutput parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitEgress$SegmentedFileOutput) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitEgress$SegmentedFileOutput parseFrom(InputStream inputStream) {
        return (LivekitEgress$SegmentedFileOutput) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$SegmentedFileOutput parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitEgress$SegmentedFileOutput) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitEgress$SegmentedFileOutput parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitEgress$SegmentedFileOutput) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitEgress$SegmentedFileOutput parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitEgress$SegmentedFileOutput) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
