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
import p793ho.C14724d1;
import p793ho.C14737f0;
import p793ho.EnumC14731e1;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitEgress$TrackEgressRequest extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitEgress$TrackEgressRequest DEFAULT_INSTANCE;
    public static final int FILE_FIELD_NUMBER = 3;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int ROOM_NAME_FIELD_NUMBER = 1;
    public static final int TRACK_ID_FIELD_NUMBER = 2;
    public static final int WEBSOCKET_URL_FIELD_NUMBER = 4;
    private Object output_;
    private int outputCase_ = 0;
    private String roomName_ = "";
    private String trackId_ = "";

    static {
        LivekitEgress$TrackEgressRequest livekitEgress$TrackEgressRequest = new LivekitEgress$TrackEgressRequest();
        DEFAULT_INSTANCE = livekitEgress$TrackEgressRequest;
        AbstractC12133Z.registerDefaultInstance(LivekitEgress$TrackEgressRequest.class, livekitEgress$TrackEgressRequest);
    }

    private LivekitEgress$TrackEgressRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFile() {
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
    public void clearRoomName() {
        this.roomName_ = getDefaultInstance().getRoomName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackId() {
        this.trackId_ = getDefaultInstance().getTrackId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWebsocketUrl() {
        if (this.outputCase_ == 4) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    public static LivekitEgress$TrackEgressRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFile(LivekitEgress$DirectFileOutput livekitEgress$DirectFileOutput) {
        livekitEgress$DirectFileOutput.getClass();
        if (this.outputCase_ != 3 || this.output_ == LivekitEgress$DirectFileOutput.getDefaultInstance()) {
            this.output_ = livekitEgress$DirectFileOutput;
        } else {
            C14737f0 c14737f0NewBuilder = LivekitEgress$DirectFileOutput.newBuilder((LivekitEgress$DirectFileOutput) this.output_);
            c14737f0NewBuilder.m13865f(livekitEgress$DirectFileOutput);
            this.output_ = c14737f0NewBuilder.m13862c();
        }
        this.outputCase_ = 3;
    }

    public static C14724d1 newBuilder() {
        return (C14724d1) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitEgress$TrackEgressRequest parseDelimitedFrom(InputStream inputStream) {
        return (LivekitEgress$TrackEgressRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$TrackEgressRequest parseFrom(ByteBuffer byteBuffer) {
        return (LivekitEgress$TrackEgressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFile(LivekitEgress$DirectFileOutput livekitEgress$DirectFileOutput) {
        livekitEgress$DirectFileOutput.getClass();
        this.output_ = livekitEgress$DirectFileOutput;
        this.outputCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoomName(String str) {
        str.getClass();
        this.roomName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoomNameBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.roomName_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackId(String str) {
        str.getClass();
        this.trackId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackIdBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.trackId_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWebsocketUrl(String str) {
        str.getClass();
        this.outputCase_ = 4;
        this.output_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWebsocketUrlBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.output_ = abstractC12171m.m14012w();
        this.outputCase_ = 4;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003<\u0000\u0004Ȼ\u0000", new Object[]{"output_", "outputCase_", "roomName_", "trackId_", LivekitEgress$DirectFileOutput.class});
            case 3:
                return new LivekitEgress$TrackEgressRequest();
            case 4:
                return new C14724d1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitEgress$TrackEgressRequest.class) {
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

    public LivekitEgress$DirectFileOutput getFile() {
        return this.outputCase_ == 3 ? (LivekitEgress$DirectFileOutput) this.output_ : LivekitEgress$DirectFileOutput.getDefaultInstance();
    }

    public EnumC14731e1 getOutputCase() {
        int i10 = this.outputCase_;
        if (i10 == 0) {
            return EnumC14731e1.f46076o0;
        }
        if (i10 == 3) {
            return EnumC14731e1.f46074Y;
        }
        if (i10 != 4) {
            return null;
        }
        return EnumC14731e1.f46075Z;
    }

    public String getRoomName() {
        return this.roomName_;
    }

    public AbstractC12171m getRoomNameBytes() {
        return AbstractC12171m.m14011m(this.roomName_);
    }

    public String getTrackId() {
        return this.trackId_;
    }

    public AbstractC12171m getTrackIdBytes() {
        return AbstractC12171m.m14011m(this.trackId_);
    }

    public String getWebsocketUrl() {
        return this.outputCase_ == 4 ? (String) this.output_ : "";
    }

    public AbstractC12171m getWebsocketUrlBytes() {
        return AbstractC12171m.m14011m(this.outputCase_ == 4 ? (String) this.output_ : "");
    }

    public boolean hasFile() {
        return this.outputCase_ == 3;
    }

    public boolean hasWebsocketUrl() {
        return this.outputCase_ == 4;
    }

    public static C14724d1 newBuilder(LivekitEgress$TrackEgressRequest livekitEgress$TrackEgressRequest) {
        return (C14724d1) DEFAULT_INSTANCE.createBuilder(livekitEgress$TrackEgressRequest);
    }

    public static LivekitEgress$TrackEgressRequest parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitEgress$TrackEgressRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitEgress$TrackEgressRequest parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitEgress$TrackEgressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitEgress$TrackEgressRequest parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitEgress$TrackEgressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitEgress$TrackEgressRequest parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitEgress$TrackEgressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitEgress$TrackEgressRequest parseFrom(byte[] bArr) {
        return (LivekitEgress$TrackEgressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitEgress$TrackEgressRequest parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitEgress$TrackEgressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitEgress$TrackEgressRequest parseFrom(InputStream inputStream) {
        return (LivekitEgress$TrackEgressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$TrackEgressRequest parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitEgress$TrackEgressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitEgress$TrackEgressRequest parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitEgress$TrackEgressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitEgress$TrackEgressRequest parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitEgress$TrackEgressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
