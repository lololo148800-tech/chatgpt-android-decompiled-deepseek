package replay;

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
import p1011sp.C19705e;

/* JADX INFO: loaded from: classes2.dex */
public final class CloudReplay$LoadReplayRequest extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final CloudReplay$LoadReplayRequest DEFAULT_INSTANCE;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int REPLAY_ID_FIELD_NUMBER = 1;
    public static final int ROOM_NAME_FIELD_NUMBER = 2;
    public static final int STARTING_PTS_FIELD_NUMBER = 3;
    private String replayId_ = "";
    private String roomName_ = "";
    private long startingPts_;

    static {
        CloudReplay$LoadReplayRequest cloudReplay$LoadReplayRequest = new CloudReplay$LoadReplayRequest();
        DEFAULT_INSTANCE = cloudReplay$LoadReplayRequest;
        AbstractC12133Z.registerDefaultInstance(CloudReplay$LoadReplayRequest.class, cloudReplay$LoadReplayRequest);
    }

    private CloudReplay$LoadReplayRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReplayId() {
        this.replayId_ = getDefaultInstance().getReplayId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoomName() {
        this.roomName_ = getDefaultInstance().getRoomName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartingPts() {
        this.startingPts_ = 0L;
    }

    public static CloudReplay$LoadReplayRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C19705e newBuilder() {
        return (C19705e) DEFAULT_INSTANCE.createBuilder();
    }

    public static CloudReplay$LoadReplayRequest parseDelimitedFrom(InputStream inputStream) {
        return (CloudReplay$LoadReplayRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CloudReplay$LoadReplayRequest parseFrom(ByteBuffer byteBuffer) {
        return (CloudReplay$LoadReplayRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReplayId(String str) {
        str.getClass();
        this.replayId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReplayIdBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.replayId_ = abstractC12171m.m14012w();
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
    public void setStartingPts(long j10) {
        this.startingPts_ = j10;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002", new Object[]{"replayId_", "roomName_", "startingPts_"});
            case 3:
                return new CloudReplay$LoadReplayRequest();
            case 4:
                return new C19705e(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (CloudReplay$LoadReplayRequest.class) {
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

    public String getReplayId() {
        return this.replayId_;
    }

    public AbstractC12171m getReplayIdBytes() {
        return AbstractC12171m.m14011m(this.replayId_);
    }

    public String getRoomName() {
        return this.roomName_;
    }

    public AbstractC12171m getRoomNameBytes() {
        return AbstractC12171m.m14011m(this.roomName_);
    }

    public long getStartingPts() {
        return this.startingPts_;
    }

    public static C19705e newBuilder(CloudReplay$LoadReplayRequest cloudReplay$LoadReplayRequest) {
        return (C19705e) DEFAULT_INSTANCE.createBuilder(cloudReplay$LoadReplayRequest);
    }

    public static CloudReplay$LoadReplayRequest parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (CloudReplay$LoadReplayRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static CloudReplay$LoadReplayRequest parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (CloudReplay$LoadReplayRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static CloudReplay$LoadReplayRequest parseFrom(AbstractC12171m abstractC12171m) {
        return (CloudReplay$LoadReplayRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static CloudReplay$LoadReplayRequest parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (CloudReplay$LoadReplayRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static CloudReplay$LoadReplayRequest parseFrom(byte[] bArr) {
        return (CloudReplay$LoadReplayRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CloudReplay$LoadReplayRequest parseFrom(byte[] bArr, C12087F c12087f) {
        return (CloudReplay$LoadReplayRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static CloudReplay$LoadReplayRequest parseFrom(InputStream inputStream) {
        return (CloudReplay$LoadReplayRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CloudReplay$LoadReplayRequest parseFrom(InputStream inputStream, C12087F c12087f) {
        return (CloudReplay$LoadReplayRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static CloudReplay$LoadReplayRequest parseFrom(AbstractC12186r abstractC12186r) {
        return (CloudReplay$LoadReplayRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static CloudReplay$LoadReplayRequest parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (CloudReplay$LoadReplayRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
