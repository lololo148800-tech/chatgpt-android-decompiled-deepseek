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
import p793ho.C14569E;
import p793ho.InterfaceC14576F;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitAgentDispatch$RoomAgentDispatch extends AbstractC12133Z implements InterfaceC14576F {
    public static final int AGENT_NAME_FIELD_NUMBER = 1;
    private static final LivekitAgentDispatch$RoomAgentDispatch DEFAULT_INSTANCE;
    public static final int METADATA_FIELD_NUMBER = 2;
    private static volatile InterfaceC12124U0 PARSER;
    private String agentName_ = "";
    private String metadata_ = "";

    static {
        LivekitAgentDispatch$RoomAgentDispatch livekitAgentDispatch$RoomAgentDispatch = new LivekitAgentDispatch$RoomAgentDispatch();
        DEFAULT_INSTANCE = livekitAgentDispatch$RoomAgentDispatch;
        AbstractC12133Z.registerDefaultInstance(LivekitAgentDispatch$RoomAgentDispatch.class, livekitAgentDispatch$RoomAgentDispatch);
    }

    private LivekitAgentDispatch$RoomAgentDispatch() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAgentName() {
        this.agentName_ = getDefaultInstance().getAgentName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetadata() {
        this.metadata_ = getDefaultInstance().getMetadata();
    }

    public static LivekitAgentDispatch$RoomAgentDispatch getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14569E newBuilder() {
        return (C14569E) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitAgentDispatch$RoomAgentDispatch parseDelimitedFrom(InputStream inputStream) {
        return (LivekitAgentDispatch$RoomAgentDispatch) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAgentDispatch$RoomAgentDispatch parseFrom(ByteBuffer byteBuffer) {
        return (LivekitAgentDispatch$RoomAgentDispatch) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAgentName(String str) {
        str.getClass();
        this.agentName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAgentNameBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.agentName_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetadata(String str) {
        str.getClass();
        this.metadata_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetadataBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.metadata_ = abstractC12171m.m14012w();
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"agentName_", "metadata_"});
            case 3:
                return new LivekitAgentDispatch$RoomAgentDispatch();
            case 4:
                return new C14569E(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitAgentDispatch$RoomAgentDispatch.class) {
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

    public String getAgentName() {
        return this.agentName_;
    }

    public AbstractC12171m getAgentNameBytes() {
        return AbstractC12171m.m14011m(this.agentName_);
    }

    public String getMetadata() {
        return this.metadata_;
    }

    public AbstractC12171m getMetadataBytes() {
        return AbstractC12171m.m14011m(this.metadata_);
    }

    public static C14569E newBuilder(LivekitAgentDispatch$RoomAgentDispatch livekitAgentDispatch$RoomAgentDispatch) {
        return (C14569E) DEFAULT_INSTANCE.createBuilder(livekitAgentDispatch$RoomAgentDispatch);
    }

    public static LivekitAgentDispatch$RoomAgentDispatch parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitAgentDispatch$RoomAgentDispatch) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitAgentDispatch$RoomAgentDispatch parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitAgentDispatch$RoomAgentDispatch) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitAgentDispatch$RoomAgentDispatch parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitAgentDispatch$RoomAgentDispatch) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitAgentDispatch$RoomAgentDispatch parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitAgentDispatch$RoomAgentDispatch) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitAgentDispatch$RoomAgentDispatch parseFrom(byte[] bArr) {
        return (LivekitAgentDispatch$RoomAgentDispatch) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitAgentDispatch$RoomAgentDispatch parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitAgentDispatch$RoomAgentDispatch) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitAgentDispatch$RoomAgentDispatch parseFrom(InputStream inputStream) {
        return (LivekitAgentDispatch$RoomAgentDispatch) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAgentDispatch$RoomAgentDispatch parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitAgentDispatch$RoomAgentDispatch) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitAgentDispatch$RoomAgentDispatch parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitAgentDispatch$RoomAgentDispatch) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitAgentDispatch$RoomAgentDispatch parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitAgentDispatch$RoomAgentDispatch) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
