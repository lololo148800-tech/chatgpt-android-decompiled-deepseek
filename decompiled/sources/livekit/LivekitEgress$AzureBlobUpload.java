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
import p793ho.C14730e0;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitEgress$AzureBlobUpload extends AbstractC12133Z implements InterfaceC12094H0 {
    public static final int ACCOUNT_KEY_FIELD_NUMBER = 2;
    public static final int ACCOUNT_NAME_FIELD_NUMBER = 1;
    public static final int CONTAINER_NAME_FIELD_NUMBER = 3;
    private static final LivekitEgress$AzureBlobUpload DEFAULT_INSTANCE;
    private static volatile InterfaceC12124U0 PARSER;
    private String accountName_ = "";
    private String accountKey_ = "";
    private String containerName_ = "";

    static {
        LivekitEgress$AzureBlobUpload livekitEgress$AzureBlobUpload = new LivekitEgress$AzureBlobUpload();
        DEFAULT_INSTANCE = livekitEgress$AzureBlobUpload;
        AbstractC12133Z.registerDefaultInstance(LivekitEgress$AzureBlobUpload.class, livekitEgress$AzureBlobUpload);
    }

    private LivekitEgress$AzureBlobUpload() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccountKey() {
        this.accountKey_ = getDefaultInstance().getAccountKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccountName() {
        this.accountName_ = getDefaultInstance().getAccountName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContainerName() {
        this.containerName_ = getDefaultInstance().getContainerName();
    }

    public static LivekitEgress$AzureBlobUpload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14730e0 newBuilder() {
        return (C14730e0) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitEgress$AzureBlobUpload parseDelimitedFrom(InputStream inputStream) {
        return (LivekitEgress$AzureBlobUpload) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$AzureBlobUpload parseFrom(ByteBuffer byteBuffer) {
        return (LivekitEgress$AzureBlobUpload) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccountKey(String str) {
        str.getClass();
        this.accountKey_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccountKeyBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.accountKey_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccountName(String str) {
        str.getClass();
        this.accountName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccountNameBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.accountName_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContainerName(String str) {
        str.getClass();
        this.containerName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContainerNameBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.containerName_ = abstractC12171m.m14012w();
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"accountName_", "accountKey_", "containerName_"});
            case 3:
                return new LivekitEgress$AzureBlobUpload();
            case 4:
                return new C14730e0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitEgress$AzureBlobUpload.class) {
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

    public String getAccountKey() {
        return this.accountKey_;
    }

    public AbstractC12171m getAccountKeyBytes() {
        return AbstractC12171m.m14011m(this.accountKey_);
    }

    public String getAccountName() {
        return this.accountName_;
    }

    public AbstractC12171m getAccountNameBytes() {
        return AbstractC12171m.m14011m(this.accountName_);
    }

    public String getContainerName() {
        return this.containerName_;
    }

    public AbstractC12171m getContainerNameBytes() {
        return AbstractC12171m.m14011m(this.containerName_);
    }

    public static C14730e0 newBuilder(LivekitEgress$AzureBlobUpload livekitEgress$AzureBlobUpload) {
        return (C14730e0) DEFAULT_INSTANCE.createBuilder(livekitEgress$AzureBlobUpload);
    }

    public static LivekitEgress$AzureBlobUpload parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitEgress$AzureBlobUpload) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitEgress$AzureBlobUpload parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitEgress$AzureBlobUpload) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitEgress$AzureBlobUpload parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitEgress$AzureBlobUpload) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitEgress$AzureBlobUpload parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitEgress$AzureBlobUpload) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitEgress$AzureBlobUpload parseFrom(byte[] bArr) {
        return (LivekitEgress$AzureBlobUpload) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitEgress$AzureBlobUpload parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitEgress$AzureBlobUpload) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitEgress$AzureBlobUpload parseFrom(InputStream inputStream) {
        return (LivekitEgress$AzureBlobUpload) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$AzureBlobUpload parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitEgress$AzureBlobUpload) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitEgress$AzureBlobUpload parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitEgress$AzureBlobUpload) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitEgress$AzureBlobUpload parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitEgress$AzureBlobUpload) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
