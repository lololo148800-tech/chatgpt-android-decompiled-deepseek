package livekit;

import com.google.protobuf.AbstractC12133Z;
import com.google.protobuf.AbstractC12138b;
import com.google.protobuf.AbstractC12171m;
import com.google.protobuf.AbstractC12186r;
import com.google.protobuf.C12087F;
import com.google.protobuf.C12123U;
import com.google.protobuf.EnumC12131Y;
import com.google.protobuf.InterfaceC12094H0;
import com.google.protobuf.InterfaceC12124U0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p793ho.C14601J0;
import p793ho.C14695Z;
import p793ho.C14730e0;
import p793ho.C14737f0;
import p793ho.C14842u0;
import p793ho.EnumC14744g0;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitEgress$DirectFileOutput extends AbstractC12133Z implements InterfaceC12094H0 {
    public static final int ALIOSS_FIELD_NUMBER = 6;
    public static final int AZURE_FIELD_NUMBER = 4;
    private static final LivekitEgress$DirectFileOutput DEFAULT_INSTANCE;
    public static final int DISABLE_MANIFEST_FIELD_NUMBER = 5;
    public static final int FILEPATH_FIELD_NUMBER = 1;
    public static final int GCP_FIELD_NUMBER = 3;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int S3_FIELD_NUMBER = 2;
    private boolean disableManifest_;
    private Object output_;
    private int outputCase_ = 0;
    private String filepath_ = "";

    static {
        LivekitEgress$DirectFileOutput livekitEgress$DirectFileOutput = new LivekitEgress$DirectFileOutput();
        DEFAULT_INSTANCE = livekitEgress$DirectFileOutput;
        AbstractC12133Z.registerDefaultInstance(LivekitEgress$DirectFileOutput.class, livekitEgress$DirectFileOutput);
    }

    private LivekitEgress$DirectFileOutput() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAliOSS() {
        if (this.outputCase_ == 6) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAzure() {
        if (this.outputCase_ == 4) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisableManifest() {
        this.disableManifest_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFilepath() {
        this.filepath_ = getDefaultInstance().getFilepath();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGcp() {
        if (this.outputCase_ == 3) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOutput() {
        this.outputCase_ = 0;
        this.output_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearS3() {
        if (this.outputCase_ == 2) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    public static LivekitEgress$DirectFileOutput getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAliOSS(LivekitEgress$AliOSSUpload livekitEgress$AliOSSUpload) {
        livekitEgress$AliOSSUpload.getClass();
        if (this.outputCase_ != 6 || this.output_ == LivekitEgress$AliOSSUpload.getDefaultInstance()) {
            this.output_ = livekitEgress$AliOSSUpload;
        } else {
            C14695Z c14695zNewBuilder = LivekitEgress$AliOSSUpload.newBuilder((LivekitEgress$AliOSSUpload) this.output_);
            c14695zNewBuilder.m13865f(livekitEgress$AliOSSUpload);
            this.output_ = c14695zNewBuilder.m13862c();
        }
        this.outputCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAzure(LivekitEgress$AzureBlobUpload livekitEgress$AzureBlobUpload) {
        livekitEgress$AzureBlobUpload.getClass();
        if (this.outputCase_ != 4 || this.output_ == LivekitEgress$AzureBlobUpload.getDefaultInstance()) {
            this.output_ = livekitEgress$AzureBlobUpload;
        } else {
            C14730e0 c14730e0NewBuilder = LivekitEgress$AzureBlobUpload.newBuilder((LivekitEgress$AzureBlobUpload) this.output_);
            c14730e0NewBuilder.m13865f(livekitEgress$AzureBlobUpload);
            this.output_ = c14730e0NewBuilder.m13862c();
        }
        this.outputCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGcp(LivekitEgress$GCPUpload livekitEgress$GCPUpload) {
        livekitEgress$GCPUpload.getClass();
        if (this.outputCase_ != 3 || this.output_ == LivekitEgress$GCPUpload.getDefaultInstance()) {
            this.output_ = livekitEgress$GCPUpload;
        } else {
            C14842u0 c14842u0NewBuilder = LivekitEgress$GCPUpload.newBuilder((LivekitEgress$GCPUpload) this.output_);
            c14842u0NewBuilder.m13865f(livekitEgress$GCPUpload);
            this.output_ = c14842u0NewBuilder.m13862c();
        }
        this.outputCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeS3(LivekitEgress$S3Upload livekitEgress$S3Upload) {
        livekitEgress$S3Upload.getClass();
        if (this.outputCase_ != 2 || this.output_ == LivekitEgress$S3Upload.getDefaultInstance()) {
            this.output_ = livekitEgress$S3Upload;
        } else {
            C14601J0 c14601j0NewBuilder = LivekitEgress$S3Upload.newBuilder((LivekitEgress$S3Upload) this.output_);
            c14601j0NewBuilder.m13865f(livekitEgress$S3Upload);
            this.output_ = c14601j0NewBuilder.m13862c();
        }
        this.outputCase_ = 2;
    }

    public static C14737f0 newBuilder() {
        return (C14737f0) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitEgress$DirectFileOutput parseDelimitedFrom(InputStream inputStream) {
        return (LivekitEgress$DirectFileOutput) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$DirectFileOutput parseFrom(ByteBuffer byteBuffer) {
        return (LivekitEgress$DirectFileOutput) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAliOSS(LivekitEgress$AliOSSUpload livekitEgress$AliOSSUpload) {
        livekitEgress$AliOSSUpload.getClass();
        this.output_ = livekitEgress$AliOSSUpload;
        this.outputCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAzure(LivekitEgress$AzureBlobUpload livekitEgress$AzureBlobUpload) {
        livekitEgress$AzureBlobUpload.getClass();
        this.output_ = livekitEgress$AzureBlobUpload;
        this.outputCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisableManifest(boolean z6) {
        this.disableManifest_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFilepath(String str) {
        str.getClass();
        this.filepath_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFilepathBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.filepath_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGcp(LivekitEgress$GCPUpload livekitEgress$GCPUpload) {
        livekitEgress$GCPUpload.getClass();
        this.output_ = livekitEgress$GCPUpload;
        this.outputCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setS3(LivekitEgress$S3Upload livekitEgress$S3Upload) {
        livekitEgress$S3Upload.getClass();
        this.output_ = livekitEgress$S3Upload;
        this.outputCase_ = 2;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005\u0007\u0006<\u0000", new Object[]{"output_", "outputCase_", "filepath_", LivekitEgress$S3Upload.class, LivekitEgress$GCPUpload.class, LivekitEgress$AzureBlobUpload.class, "disableManifest_", LivekitEgress$AliOSSUpload.class});
            case 3:
                return new LivekitEgress$DirectFileOutput();
            case 4:
                return new C14737f0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitEgress$DirectFileOutput.class) {
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
        return this.outputCase_ == 6 ? (LivekitEgress$AliOSSUpload) this.output_ : LivekitEgress$AliOSSUpload.getDefaultInstance();
    }

    public LivekitEgress$AzureBlobUpload getAzure() {
        return this.outputCase_ == 4 ? (LivekitEgress$AzureBlobUpload) this.output_ : LivekitEgress$AzureBlobUpload.getDefaultInstance();
    }

    public boolean getDisableManifest() {
        return this.disableManifest_;
    }

    public String getFilepath() {
        return this.filepath_;
    }

    public AbstractC12171m getFilepathBytes() {
        return AbstractC12171m.m14011m(this.filepath_);
    }

    public LivekitEgress$GCPUpload getGcp() {
        return this.outputCase_ == 3 ? (LivekitEgress$GCPUpload) this.output_ : LivekitEgress$GCPUpload.getDefaultInstance();
    }

    public EnumC14744g0 getOutputCase() {
        int i10 = this.outputCase_;
        if (i10 == 0) {
            return EnumC14744g0.f46121q0;
        }
        if (i10 == 6) {
            return EnumC14744g0.f46120p0;
        }
        if (i10 == 2) {
            return EnumC14744g0.f46117Y;
        }
        if (i10 == 3) {
            return EnumC14744g0.f46118Z;
        }
        if (i10 != 4) {
            return null;
        }
        return EnumC14744g0.f46119o0;
    }

    public LivekitEgress$S3Upload getS3() {
        return this.outputCase_ == 2 ? (LivekitEgress$S3Upload) this.output_ : LivekitEgress$S3Upload.getDefaultInstance();
    }

    public boolean hasAliOSS() {
        return this.outputCase_ == 6;
    }

    public boolean hasAzure() {
        return this.outputCase_ == 4;
    }

    public boolean hasGcp() {
        return this.outputCase_ == 3;
    }

    public boolean hasS3() {
        return this.outputCase_ == 2;
    }

    public static C14737f0 newBuilder(LivekitEgress$DirectFileOutput livekitEgress$DirectFileOutput) {
        return (C14737f0) DEFAULT_INSTANCE.createBuilder(livekitEgress$DirectFileOutput);
    }

    public static LivekitEgress$DirectFileOutput parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitEgress$DirectFileOutput) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitEgress$DirectFileOutput parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitEgress$DirectFileOutput) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitEgress$DirectFileOutput parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitEgress$DirectFileOutput) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitEgress$DirectFileOutput parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitEgress$DirectFileOutput) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitEgress$DirectFileOutput parseFrom(byte[] bArr) {
        return (LivekitEgress$DirectFileOutput) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitEgress$DirectFileOutput parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitEgress$DirectFileOutput) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitEgress$DirectFileOutput parseFrom(InputStream inputStream) {
        return (LivekitEgress$DirectFileOutput) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$DirectFileOutput parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitEgress$DirectFileOutput) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitEgress$DirectFileOutput parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitEgress$DirectFileOutput) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitEgress$DirectFileOutput parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitEgress$DirectFileOutput) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
