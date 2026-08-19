package livekit;

import com.google.protobuf.AbstractC12133Z;
import com.google.protobuf.AbstractC12171m;
import com.google.protobuf.AbstractC12186r;
import com.google.protobuf.C12087F;
import com.google.protobuf.C12123U;
import com.google.protobuf.EnumC12131Y;
import com.google.protobuf.InterfaceC12094H0;
import com.google.protobuf.InterfaceC12124U0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p793ho.C14674V2;
import p793ho.C14824r3;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitRoom$MuteRoomTrackResponse extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitRoom$MuteRoomTrackResponse DEFAULT_INSTANCE;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int TRACK_FIELD_NUMBER = 1;
    private LivekitModels$TrackInfo track_;

    static {
        LivekitRoom$MuteRoomTrackResponse livekitRoom$MuteRoomTrackResponse = new LivekitRoom$MuteRoomTrackResponse();
        DEFAULT_INSTANCE = livekitRoom$MuteRoomTrackResponse;
        AbstractC12133Z.registerDefaultInstance(LivekitRoom$MuteRoomTrackResponse.class, livekitRoom$MuteRoomTrackResponse);
    }

    private LivekitRoom$MuteRoomTrackResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrack() {
        this.track_ = null;
    }

    public static LivekitRoom$MuteRoomTrackResponse getDefaultInstance() {
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

    public static C14824r3 newBuilder() {
        return (C14824r3) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRoom$MuteRoomTrackResponse parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRoom$MuteRoomTrackResponse) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRoom$MuteRoomTrackResponse parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRoom$MuteRoomTrackResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"track_"});
            case 3:
                return new LivekitRoom$MuteRoomTrackResponse();
            case 4:
                return new C14824r3(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitRoom$MuteRoomTrackResponse.class) {
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

    public LivekitModels$TrackInfo getTrack() {
        LivekitModels$TrackInfo livekitModels$TrackInfo = this.track_;
        return livekitModels$TrackInfo == null ? LivekitModels$TrackInfo.getDefaultInstance() : livekitModels$TrackInfo;
    }

    public boolean hasTrack() {
        return this.track_ != null;
    }

    public static C14824r3 newBuilder(LivekitRoom$MuteRoomTrackResponse livekitRoom$MuteRoomTrackResponse) {
        return (C14824r3) DEFAULT_INSTANCE.createBuilder(livekitRoom$MuteRoomTrackResponse);
    }

    public static LivekitRoom$MuteRoomTrackResponse parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRoom$MuteRoomTrackResponse) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRoom$MuteRoomTrackResponse parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitRoom$MuteRoomTrackResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitRoom$MuteRoomTrackResponse parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitRoom$MuteRoomTrackResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitRoom$MuteRoomTrackResponse parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitRoom$MuteRoomTrackResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitRoom$MuteRoomTrackResponse parseFrom(byte[] bArr) {
        return (LivekitRoom$MuteRoomTrackResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRoom$MuteRoomTrackResponse parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitRoom$MuteRoomTrackResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitRoom$MuteRoomTrackResponse parseFrom(InputStream inputStream) {
        return (LivekitRoom$MuteRoomTrackResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRoom$MuteRoomTrackResponse parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRoom$MuteRoomTrackResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRoom$MuteRoomTrackResponse parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitRoom$MuteRoomTrackResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitRoom$MuteRoomTrackResponse parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitRoom$MuteRoomTrackResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
