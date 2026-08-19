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
import p793ho.C14548B;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitAgentDispatch$DeleteAgentDispatchRequest extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitAgentDispatch$DeleteAgentDispatchRequest DEFAULT_INSTANCE;
    public static final int DISPATCH_ID_FIELD_NUMBER = 1;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int ROOM_FIELD_NUMBER = 2;
    private String dispatchId_ = "";
    private String room_ = "";

    static {
        LivekitAgentDispatch$DeleteAgentDispatchRequest livekitAgentDispatch$DeleteAgentDispatchRequest = new LivekitAgentDispatch$DeleteAgentDispatchRequest();
        DEFAULT_INSTANCE = livekitAgentDispatch$DeleteAgentDispatchRequest;
        AbstractC12133Z.registerDefaultInstance(LivekitAgentDispatch$DeleteAgentDispatchRequest.class, livekitAgentDispatch$DeleteAgentDispatchRequest);
    }

    private LivekitAgentDispatch$DeleteAgentDispatchRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDispatchId() {
        this.dispatchId_ = getDefaultInstance().getDispatchId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoom() {
        this.room_ = getDefaultInstance().getRoom();
    }

    public static LivekitAgentDispatch$DeleteAgentDispatchRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14548B newBuilder() {
        return (C14548B) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitAgentDispatch$DeleteAgentDispatchRequest parseDelimitedFrom(InputStream inputStream) {
        return (LivekitAgentDispatch$DeleteAgentDispatchRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAgentDispatch$DeleteAgentDispatchRequest parseFrom(ByteBuffer byteBuffer) {
        return (LivekitAgentDispatch$DeleteAgentDispatchRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDispatchId(String str) {
        str.getClass();
        this.dispatchId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDispatchIdBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.dispatchId_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoom(String str) {
        str.getClass();
        this.room_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoomBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.room_ = abstractC12171m.m14012w();
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"dispatchId_", "room_"});
            case 3:
                return new LivekitAgentDispatch$DeleteAgentDispatchRequest();
            case 4:
                return new C14548B(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitAgentDispatch$DeleteAgentDispatchRequest.class) {
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

    public String getDispatchId() {
        return this.dispatchId_;
    }

    public AbstractC12171m getDispatchIdBytes() {
        return AbstractC12171m.m14011m(this.dispatchId_);
    }

    public String getRoom() {
        return this.room_;
    }

    public AbstractC12171m getRoomBytes() {
        return AbstractC12171m.m14011m(this.room_);
    }

    public static C14548B newBuilder(LivekitAgentDispatch$DeleteAgentDispatchRequest livekitAgentDispatch$DeleteAgentDispatchRequest) {
        return (C14548B) DEFAULT_INSTANCE.createBuilder(livekitAgentDispatch$DeleteAgentDispatchRequest);
    }

    public static LivekitAgentDispatch$DeleteAgentDispatchRequest parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitAgentDispatch$DeleteAgentDispatchRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitAgentDispatch$DeleteAgentDispatchRequest parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitAgentDispatch$DeleteAgentDispatchRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitAgentDispatch$DeleteAgentDispatchRequest parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitAgentDispatch$DeleteAgentDispatchRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitAgentDispatch$DeleteAgentDispatchRequest parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitAgentDispatch$DeleteAgentDispatchRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitAgentDispatch$DeleteAgentDispatchRequest parseFrom(byte[] bArr) {
        return (LivekitAgentDispatch$DeleteAgentDispatchRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitAgentDispatch$DeleteAgentDispatchRequest parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitAgentDispatch$DeleteAgentDispatchRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitAgentDispatch$DeleteAgentDispatchRequest parseFrom(InputStream inputStream) {
        return (LivekitAgentDispatch$DeleteAgentDispatchRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAgentDispatch$DeleteAgentDispatchRequest parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitAgentDispatch$DeleteAgentDispatchRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitAgentDispatch$DeleteAgentDispatchRequest parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitAgentDispatch$DeleteAgentDispatchRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitAgentDispatch$DeleteAgentDispatchRequest parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitAgentDispatch$DeleteAgentDispatchRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
