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
import p793ho.C14553B4;
import p793ho.C14674V2;
import p793ho.InterfaceC14560C4;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitRtc$TrackPublishedResponse extends AbstractC12133Z implements InterfaceC14560C4 {
    public static final int CID_FIELD_NUMBER = 1;
    private static final LivekitRtc$TrackPublishedResponse DEFAULT_INSTANCE;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int TRACK_FIELD_NUMBER = 2;
    private String cid_ = "";
    private LivekitModels$TrackInfo track_;

    static {
        LivekitRtc$TrackPublishedResponse livekitRtc$TrackPublishedResponse = new LivekitRtc$TrackPublishedResponse();
        DEFAULT_INSTANCE = livekitRtc$TrackPublishedResponse;
        AbstractC12133Z.registerDefaultInstance(LivekitRtc$TrackPublishedResponse.class, livekitRtc$TrackPublishedResponse);
    }

    private LivekitRtc$TrackPublishedResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCid() {
        this.cid_ = getDefaultInstance().getCid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrack() {
        this.track_ = null;
    }

    public static LivekitRtc$TrackPublishedResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTrack(LivekitModels$TrackInfo livekitModels$TrackInfo) {
        livekitModels$TrackInfo.getClass();
        LivekitModels$TrackInfo livekitModels$TrackInfo2 = this.track_;
        if (livekitModels$TrackInfo2 == null || livekitModels$TrackInfo2 == LivekitModels$TrackInfo.getDefaultInstance()) {
            this.track_ = livekitModels$TrackInfo;
            return;
        }
        C14674V2 c14674v2NewBuilder = LivekitModels$TrackInfo.newBuilder(this.track_);
        c14674v2NewBuilder.m13865f(livekitModels$TrackInfo);
        this.track_ = (LivekitModels$TrackInfo) c14674v2NewBuilder.m13862c();
    }

    public static C14553B4 newBuilder() {
        return (C14553B4) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$TrackPublishedResponse parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$TrackPublishedResponse) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$TrackPublishedResponse parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$TrackPublishedResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCid(String str) {
        str.getClass();
        this.cid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCidBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.cid_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrack(LivekitModels$TrackInfo livekitModels$TrackInfo) {
        livekitModels$TrackInfo.getClass();
        this.track_ = livekitModels$TrackInfo;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"cid_", "track_"});
            case 3:
                return new LivekitRtc$TrackPublishedResponse();
            case 4:
                return new C14553B4(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitRtc$TrackPublishedResponse.class) {
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

    public String getCid() {
        return this.cid_;
    }

    public AbstractC12171m getCidBytes() {
        return AbstractC12171m.m14011m(this.cid_);
    }

    public LivekitModels$TrackInfo getTrack() {
        LivekitModels$TrackInfo livekitModels$TrackInfo = this.track_;
        return livekitModels$TrackInfo == null ? LivekitModels$TrackInfo.getDefaultInstance() : livekitModels$TrackInfo;
    }

    public boolean hasTrack() {
        return this.track_ != null;
    }

    public static C14553B4 newBuilder(LivekitRtc$TrackPublishedResponse livekitRtc$TrackPublishedResponse) {
        return (C14553B4) DEFAULT_INSTANCE.createBuilder(livekitRtc$TrackPublishedResponse);
    }

    public static LivekitRtc$TrackPublishedResponse parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$TrackPublishedResponse) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$TrackPublishedResponse parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitRtc$TrackPublishedResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitRtc$TrackPublishedResponse parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitRtc$TrackPublishedResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitRtc$TrackPublishedResponse parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitRtc$TrackPublishedResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitRtc$TrackPublishedResponse parseFrom(byte[] bArr) {
        return (LivekitRtc$TrackPublishedResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$TrackPublishedResponse parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitRtc$TrackPublishedResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitRtc$TrackPublishedResponse parseFrom(InputStream inputStream) {
        return (LivekitRtc$TrackPublishedResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$TrackPublishedResponse parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$TrackPublishedResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$TrackPublishedResponse parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitRtc$TrackPublishedResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitRtc$TrackPublishedResponse parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitRtc$TrackPublishedResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
