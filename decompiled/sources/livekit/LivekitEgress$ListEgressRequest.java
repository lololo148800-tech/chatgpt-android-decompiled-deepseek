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
import p793ho.C14549B0;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitEgress$ListEgressRequest extends AbstractC12133Z implements InterfaceC12094H0 {
    public static final int ACTIVE_FIELD_NUMBER = 3;
    private static final LivekitEgress$ListEgressRequest DEFAULT_INSTANCE;
    public static final int EGRESS_ID_FIELD_NUMBER = 2;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int ROOM_NAME_FIELD_NUMBER = 1;
    private boolean active_;
    private String roomName_ = "";
    private String egressId_ = "";

    static {
        LivekitEgress$ListEgressRequest livekitEgress$ListEgressRequest = new LivekitEgress$ListEgressRequest();
        DEFAULT_INSTANCE = livekitEgress$ListEgressRequest;
        AbstractC12133Z.registerDefaultInstance(LivekitEgress$ListEgressRequest.class, livekitEgress$ListEgressRequest);
    }

    private LivekitEgress$ListEgressRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActive() {
        this.active_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEgressId() {
        this.egressId_ = getDefaultInstance().getEgressId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoomName() {
        this.roomName_ = getDefaultInstance().getRoomName();
    }

    public static LivekitEgress$ListEgressRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14549B0 newBuilder() {
        return (C14549B0) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitEgress$ListEgressRequest parseDelimitedFrom(InputStream inputStream) {
        return (LivekitEgress$ListEgressRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$ListEgressRequest parseFrom(ByteBuffer byteBuffer) {
        return (LivekitEgress$ListEgressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActive(boolean z6) {
        this.active_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEgressId(String str) {
        str.getClass();
        this.egressId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEgressIdBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.egressId_ = abstractC12171m.m14012w();
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

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007", new Object[]{"roomName_", "egressId_", "active_"});
            case 3:
                return new LivekitEgress$ListEgressRequest();
            case 4:
                return new C14549B0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitEgress$ListEgressRequest.class) {
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

    public boolean getActive() {
        return this.active_;
    }

    public String getEgressId() {
        return this.egressId_;
    }

    public AbstractC12171m getEgressIdBytes() {
        return AbstractC12171m.m14011m(this.egressId_);
    }

    public String getRoomName() {
        return this.roomName_;
    }

    public AbstractC12171m getRoomNameBytes() {
        return AbstractC12171m.m14011m(this.roomName_);
    }

    public static C14549B0 newBuilder(LivekitEgress$ListEgressRequest livekitEgress$ListEgressRequest) {
        return (C14549B0) DEFAULT_INSTANCE.createBuilder(livekitEgress$ListEgressRequest);
    }

    public static LivekitEgress$ListEgressRequest parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitEgress$ListEgressRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitEgress$ListEgressRequest parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitEgress$ListEgressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitEgress$ListEgressRequest parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitEgress$ListEgressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitEgress$ListEgressRequest parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitEgress$ListEgressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitEgress$ListEgressRequest parseFrom(byte[] bArr) {
        return (LivekitEgress$ListEgressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitEgress$ListEgressRequest parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitEgress$ListEgressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitEgress$ListEgressRequest parseFrom(InputStream inputStream) {
        return (LivekitEgress$ListEgressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$ListEgressRequest parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitEgress$ListEgressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitEgress$ListEgressRequest parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitEgress$ListEgressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitEgress$ListEgressRequest parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitEgress$ListEgressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
