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
import p793ho.C14828s0;
import p793ho.InterfaceC14835t0;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitEgress$FileInfo extends AbstractC12133Z implements InterfaceC14835t0 {
    private static final LivekitEgress$FileInfo DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 6;
    public static final int ENDED_AT_FIELD_NUMBER = 3;
    public static final int FILENAME_FIELD_NUMBER = 1;
    public static final int LOCATION_FIELD_NUMBER = 5;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int SIZE_FIELD_NUMBER = 4;
    public static final int STARTED_AT_FIELD_NUMBER = 2;
    private long duration_;
    private long endedAt_;
    private String filename_ = "";
    private String location_ = "";
    private long size_;
    private long startedAt_;

    static {
        LivekitEgress$FileInfo livekitEgress$FileInfo = new LivekitEgress$FileInfo();
        DEFAULT_INSTANCE = livekitEgress$FileInfo;
        AbstractC12133Z.registerDefaultInstance(LivekitEgress$FileInfo.class, livekitEgress$FileInfo);
    }

    private LivekitEgress$FileInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDuration() {
        this.duration_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndedAt() {
        this.endedAt_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFilename() {
        this.filename_ = getDefaultInstance().getFilename();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocation() {
        this.location_ = getDefaultInstance().getLocation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSize() {
        this.size_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartedAt() {
        this.startedAt_ = 0L;
    }

    public static LivekitEgress$FileInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14828s0 newBuilder() {
        return (C14828s0) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitEgress$FileInfo parseDelimitedFrom(InputStream inputStream) {
        return (LivekitEgress$FileInfo) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$FileInfo parseFrom(ByteBuffer byteBuffer) {
        return (LivekitEgress$FileInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDuration(long j10) {
        this.duration_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndedAt(long j10) {
        this.endedAt_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFilename(String str) {
        str.getClass();
        this.filename_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFilenameBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.filename_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocation(String str) {
        str.getClass();
        this.location_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocationBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.location_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSize(long j10) {
        this.size_ = j10;
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
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0002\u0004\u0002\u0005Ȉ\u0006\u0002", new Object[]{"filename_", "startedAt_", "endedAt_", "size_", "location_", "duration_"});
            case 3:
                return new LivekitEgress$FileInfo();
            case 4:
                return new C14828s0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitEgress$FileInfo.class) {
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

    public long getDuration() {
        return this.duration_;
    }

    public long getEndedAt() {
        return this.endedAt_;
    }

    public String getFilename() {
        return this.filename_;
    }

    public AbstractC12171m getFilenameBytes() {
        return AbstractC12171m.m14011m(this.filename_);
    }

    public String getLocation() {
        return this.location_;
    }

    public AbstractC12171m getLocationBytes() {
        return AbstractC12171m.m14011m(this.location_);
    }

    public long getSize() {
        return this.size_;
    }

    public long getStartedAt() {
        return this.startedAt_;
    }

    public static C14828s0 newBuilder(LivekitEgress$FileInfo livekitEgress$FileInfo) {
        return (C14828s0) DEFAULT_INSTANCE.createBuilder(livekitEgress$FileInfo);
    }

    public static LivekitEgress$FileInfo parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitEgress$FileInfo) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitEgress$FileInfo parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitEgress$FileInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitEgress$FileInfo parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitEgress$FileInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitEgress$FileInfo parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitEgress$FileInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitEgress$FileInfo parseFrom(byte[] bArr) {
        return (LivekitEgress$FileInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitEgress$FileInfo parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitEgress$FileInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitEgress$FileInfo parseFrom(InputStream inputStream) {
        return (LivekitEgress$FileInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$FileInfo parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitEgress$FileInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitEgress$FileInfo parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitEgress$FileInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitEgress$FileInfo parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitEgress$FileInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
