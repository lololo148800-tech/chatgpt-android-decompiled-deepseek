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
import p793ho.C14877z0;
import p793ho.InterfaceC14542A0;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitEgress$ImagesInfo extends AbstractC12133Z implements InterfaceC14542A0 {
    private static final LivekitEgress$ImagesInfo DEFAULT_INSTANCE;
    public static final int ENDED_AT_FIELD_NUMBER = 3;
    public static final int FILENAME_PREFIX_FIELD_NUMBER = 4;
    public static final int IMAGE_COUNT_FIELD_NUMBER = 1;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int STARTED_AT_FIELD_NUMBER = 2;
    private long endedAt_;
    private String filenamePrefix_ = "";
    private long imageCount_;
    private long startedAt_;

    static {
        LivekitEgress$ImagesInfo livekitEgress$ImagesInfo = new LivekitEgress$ImagesInfo();
        DEFAULT_INSTANCE = livekitEgress$ImagesInfo;
        AbstractC12133Z.registerDefaultInstance(LivekitEgress$ImagesInfo.class, livekitEgress$ImagesInfo);
    }

    private LivekitEgress$ImagesInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndedAt() {
        this.endedAt_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFilenamePrefix() {
        this.filenamePrefix_ = getDefaultInstance().getFilenamePrefix();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImageCount() {
        this.imageCount_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartedAt() {
        this.startedAt_ = 0L;
    }

    public static LivekitEgress$ImagesInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14877z0 newBuilder() {
        return (C14877z0) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitEgress$ImagesInfo parseDelimitedFrom(InputStream inputStream) {
        return (LivekitEgress$ImagesInfo) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$ImagesInfo parseFrom(ByteBuffer byteBuffer) {
        return (LivekitEgress$ImagesInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndedAt(long j10) {
        this.endedAt_ = j10;
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
    public void setImageCount(long j10) {
        this.imageCount_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartedAt(long j10) {
        this.startedAt_ = j10;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0002\u0004Ȉ", new Object[]{"imageCount_", "startedAt_", "endedAt_", "filenamePrefix_"});
            case 3:
                return new LivekitEgress$ImagesInfo();
            case 4:
                return new C14877z0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitEgress$ImagesInfo.class) {
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

    public long getEndedAt() {
        return this.endedAt_;
    }

    public String getFilenamePrefix() {
        return this.filenamePrefix_;
    }

    public AbstractC12171m getFilenamePrefixBytes() {
        return AbstractC12171m.m14011m(this.filenamePrefix_);
    }

    public long getImageCount() {
        return this.imageCount_;
    }

    public long getStartedAt() {
        return this.startedAt_;
    }

    public static C14877z0 newBuilder(LivekitEgress$ImagesInfo livekitEgress$ImagesInfo) {
        return (C14877z0) DEFAULT_INSTANCE.createBuilder(livekitEgress$ImagesInfo);
    }

    public static LivekitEgress$ImagesInfo parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitEgress$ImagesInfo) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitEgress$ImagesInfo parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitEgress$ImagesInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitEgress$ImagesInfo parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitEgress$ImagesInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitEgress$ImagesInfo parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitEgress$ImagesInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitEgress$ImagesInfo parseFrom(byte[] bArr) {
        return (LivekitEgress$ImagesInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitEgress$ImagesInfo parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitEgress$ImagesInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitEgress$ImagesInfo parseFrom(InputStream inputStream) {
        return (LivekitEgress$ImagesInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$ImagesInfo parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitEgress$ImagesInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitEgress$ImagesInfo parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitEgress$ImagesInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitEgress$ImagesInfo parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitEgress$ImagesInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
