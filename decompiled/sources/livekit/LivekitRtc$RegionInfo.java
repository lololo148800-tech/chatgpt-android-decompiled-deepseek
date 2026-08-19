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
import p793ho.C14675V3;
import p793ho.InterfaceC14681W3;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitRtc$RegionInfo extends AbstractC12133Z implements InterfaceC14681W3 {
    private static final LivekitRtc$RegionInfo DEFAULT_INSTANCE;
    public static final int DISTANCE_FIELD_NUMBER = 3;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int REGION_FIELD_NUMBER = 1;
    public static final int URL_FIELD_NUMBER = 2;
    private long distance_;
    private String region_ = "";
    private String url_ = "";

    static {
        LivekitRtc$RegionInfo livekitRtc$RegionInfo = new LivekitRtc$RegionInfo();
        DEFAULT_INSTANCE = livekitRtc$RegionInfo;
        AbstractC12133Z.registerDefaultInstance(LivekitRtc$RegionInfo.class, livekitRtc$RegionInfo);
    }

    private LivekitRtc$RegionInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDistance() {
        this.distance_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRegion() {
        this.region_ = getDefaultInstance().getRegion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrl() {
        this.url_ = getDefaultInstance().getUrl();
    }

    public static LivekitRtc$RegionInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14675V3 newBuilder() {
        return (C14675V3) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$RegionInfo parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$RegionInfo) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$RegionInfo parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$RegionInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDistance(long j10) {
        this.distance_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegion(String str) {
        str.getClass();
        this.region_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegionBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.region_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrl(String str) {
        str.getClass();
        this.url_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrlBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.url_ = abstractC12171m.m14012w();
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002", new Object[]{"region_", "url_", "distance_"});
            case 3:
                return new LivekitRtc$RegionInfo();
            case 4:
                return new C14675V3(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitRtc$RegionInfo.class) {
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

    public long getDistance() {
        return this.distance_;
    }

    public String getRegion() {
        return this.region_;
    }

    public AbstractC12171m getRegionBytes() {
        return AbstractC12171m.m14011m(this.region_);
    }

    public String getUrl() {
        return this.url_;
    }

    public AbstractC12171m getUrlBytes() {
        return AbstractC12171m.m14011m(this.url_);
    }

    public static C14675V3 newBuilder(LivekitRtc$RegionInfo livekitRtc$RegionInfo) {
        return (C14675V3) DEFAULT_INSTANCE.createBuilder(livekitRtc$RegionInfo);
    }

    public static LivekitRtc$RegionInfo parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$RegionInfo) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$RegionInfo parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitRtc$RegionInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitRtc$RegionInfo parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitRtc$RegionInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitRtc$RegionInfo parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitRtc$RegionInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitRtc$RegionInfo parseFrom(byte[] bArr) {
        return (LivekitRtc$RegionInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$RegionInfo parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitRtc$RegionInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitRtc$RegionInfo parseFrom(InputStream inputStream) {
        return (LivekitRtc$RegionInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$RegionInfo parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$RegionInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$RegionInfo parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitRtc$RegionInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitRtc$RegionInfo parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitRtc$RegionInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
