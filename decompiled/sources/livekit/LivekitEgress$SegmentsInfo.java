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
import p793ho.C14643Q0;
import p793ho.InterfaceC14648R0;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitEgress$SegmentsInfo extends AbstractC12133Z implements InterfaceC14648R0 {
    private static final LivekitEgress$SegmentsInfo DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 2;
    public static final int ENDED_AT_FIELD_NUMBER = 7;
    public static final int LIVE_PLAYLIST_LOCATION_FIELD_NUMBER = 9;
    public static final int LIVE_PLAYLIST_NAME_FIELD_NUMBER = 8;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int PLAYLIST_LOCATION_FIELD_NUMBER = 4;
    public static final int PLAYLIST_NAME_FIELD_NUMBER = 1;
    public static final int SEGMENT_COUNT_FIELD_NUMBER = 5;
    public static final int SIZE_FIELD_NUMBER = 3;
    public static final int STARTED_AT_FIELD_NUMBER = 6;
    private long duration_;
    private long endedAt_;
    private long segmentCount_;
    private long size_;
    private long startedAt_;
    private String playlistName_ = "";
    private String livePlaylistName_ = "";
    private String playlistLocation_ = "";
    private String livePlaylistLocation_ = "";

    static {
        LivekitEgress$SegmentsInfo livekitEgress$SegmentsInfo = new LivekitEgress$SegmentsInfo();
        DEFAULT_INSTANCE = livekitEgress$SegmentsInfo;
        AbstractC12133Z.registerDefaultInstance(LivekitEgress$SegmentsInfo.class, livekitEgress$SegmentsInfo);
    }

    private LivekitEgress$SegmentsInfo() {
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
    public void clearLivePlaylistLocation() {
        this.livePlaylistLocation_ = getDefaultInstance().getLivePlaylistLocation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLivePlaylistName() {
        this.livePlaylistName_ = getDefaultInstance().getLivePlaylistName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlaylistLocation() {
        this.playlistLocation_ = getDefaultInstance().getPlaylistLocation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlaylistName() {
        this.playlistName_ = getDefaultInstance().getPlaylistName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSegmentCount() {
        this.segmentCount_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSize() {
        this.size_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartedAt() {
        this.startedAt_ = 0L;
    }

    public static LivekitEgress$SegmentsInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14643Q0 newBuilder() {
        return (C14643Q0) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitEgress$SegmentsInfo parseDelimitedFrom(InputStream inputStream) {
        return (LivekitEgress$SegmentsInfo) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$SegmentsInfo parseFrom(ByteBuffer byteBuffer) {
        return (LivekitEgress$SegmentsInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
    public void setLivePlaylistLocation(String str) {
        str.getClass();
        this.livePlaylistLocation_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLivePlaylistLocationBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.livePlaylistLocation_ = abstractC12171m.m14012w();
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
    public void setPlaylistLocation(String str) {
        str.getClass();
        this.playlistLocation_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaylistLocationBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.playlistLocation_ = abstractC12171m.m14012w();
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
    public void setSegmentCount(long j10) {
        this.segmentCount_ = j10;
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
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0002\u0004Ȉ\u0005\u0002\u0006\u0002\u0007\u0002\bȈ\tȈ", new Object[]{"playlistName_", "duration_", "size_", "playlistLocation_", "segmentCount_", "startedAt_", "endedAt_", "livePlaylistName_", "livePlaylistLocation_"});
            case 3:
                return new LivekitEgress$SegmentsInfo();
            case 4:
                return new C14643Q0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitEgress$SegmentsInfo.class) {
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

    public String getLivePlaylistLocation() {
        return this.livePlaylistLocation_;
    }

    public AbstractC12171m getLivePlaylistLocationBytes() {
        return AbstractC12171m.m14011m(this.livePlaylistLocation_);
    }

    public String getLivePlaylistName() {
        return this.livePlaylistName_;
    }

    public AbstractC12171m getLivePlaylistNameBytes() {
        return AbstractC12171m.m14011m(this.livePlaylistName_);
    }

    public String getPlaylistLocation() {
        return this.playlistLocation_;
    }

    public AbstractC12171m getPlaylistLocationBytes() {
        return AbstractC12171m.m14011m(this.playlistLocation_);
    }

    public String getPlaylistName() {
        return this.playlistName_;
    }

    public AbstractC12171m getPlaylistNameBytes() {
        return AbstractC12171m.m14011m(this.playlistName_);
    }

    public long getSegmentCount() {
        return this.segmentCount_;
    }

    public long getSize() {
        return this.size_;
    }

    public long getStartedAt() {
        return this.startedAt_;
    }

    public static C14643Q0 newBuilder(LivekitEgress$SegmentsInfo livekitEgress$SegmentsInfo) {
        return (C14643Q0) DEFAULT_INSTANCE.createBuilder(livekitEgress$SegmentsInfo);
    }

    public static LivekitEgress$SegmentsInfo parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitEgress$SegmentsInfo) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitEgress$SegmentsInfo parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitEgress$SegmentsInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitEgress$SegmentsInfo parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitEgress$SegmentsInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitEgress$SegmentsInfo parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitEgress$SegmentsInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitEgress$SegmentsInfo parseFrom(byte[] bArr) {
        return (LivekitEgress$SegmentsInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitEgress$SegmentsInfo parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitEgress$SegmentsInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitEgress$SegmentsInfo parseFrom(InputStream inputStream) {
        return (LivekitEgress$SegmentsInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$SegmentsInfo parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitEgress$SegmentsInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitEgress$SegmentsInfo parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitEgress$SegmentsInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitEgress$SegmentsInfo parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitEgress$SegmentsInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
