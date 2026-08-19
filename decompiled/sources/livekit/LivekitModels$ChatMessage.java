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
import p793ho.C14685X1;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitModels$ChatMessage extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitModels$ChatMessage DEFAULT_INSTANCE;
    public static final int DELETED_FIELD_NUMBER = 5;
    public static final int EDIT_TIMESTAMP_FIELD_NUMBER = 3;
    public static final int GENERATED_FIELD_NUMBER = 6;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int MESSAGE_FIELD_NUMBER = 4;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int TIMESTAMP_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean deleted_;
    private long editTimestamp_;
    private boolean generated_;
    private String id_ = "";
    private String message_ = "";
    private long timestamp_;

    static {
        LivekitModels$ChatMessage livekitModels$ChatMessage = new LivekitModels$ChatMessage();
        DEFAULT_INSTANCE = livekitModels$ChatMessage;
        AbstractC12133Z.registerDefaultInstance(LivekitModels$ChatMessage.class, livekitModels$ChatMessage);
    }

    private LivekitModels$ChatMessage() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeleted() {
        this.deleted_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEditTimestamp() {
        this.bitField0_ &= -2;
        this.editTimestamp_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGenerated() {
        this.generated_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessage() {
        this.message_ = getDefaultInstance().getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.timestamp_ = 0L;
    }

    public static LivekitModels$ChatMessage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14685X1 newBuilder() {
        return (C14685X1) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitModels$ChatMessage parseDelimitedFrom(InputStream inputStream) {
        return (LivekitModels$ChatMessage) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$ChatMessage parseFrom(ByteBuffer byteBuffer) {
        return (LivekitModels$ChatMessage) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeleted(boolean z6) {
        this.deleted_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEditTimestamp(long j10) {
        this.bitField0_ |= 1;
        this.editTimestamp_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGenerated(boolean z6) {
        this.generated_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        str.getClass();
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.id_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessage(String str) {
        str.getClass();
        this.message_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.message_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestamp(long j10) {
        this.timestamp_ = j10;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003ဂ\u0000\u0004Ȉ\u0005\u0007\u0006\u0007", new Object[]{"bitField0_", "id_", "timestamp_", "editTimestamp_", "message_", "deleted_", "generated_"});
            case 3:
                return new LivekitModels$ChatMessage();
            case 4:
                return new C14685X1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitModels$ChatMessage.class) {
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

    public boolean getDeleted() {
        return this.deleted_;
    }

    public long getEditTimestamp() {
        return this.editTimestamp_;
    }

    public boolean getGenerated() {
        return this.generated_;
    }

    public String getId() {
        return this.id_;
    }

    public AbstractC12171m getIdBytes() {
        return AbstractC12171m.m14011m(this.id_);
    }

    public String getMessage() {
        return this.message_;
    }

    public AbstractC12171m getMessageBytes() {
        return AbstractC12171m.m14011m(this.message_);
    }

    public long getTimestamp() {
        return this.timestamp_;
    }

    public boolean hasEditTimestamp() {
        return (this.bitField0_ & 1) != 0;
    }

    public static C14685X1 newBuilder(LivekitModels$ChatMessage livekitModels$ChatMessage) {
        return (C14685X1) DEFAULT_INSTANCE.createBuilder(livekitModels$ChatMessage);
    }

    public static LivekitModels$ChatMessage parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitModels$ChatMessage) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitModels$ChatMessage parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitModels$ChatMessage) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitModels$ChatMessage parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitModels$ChatMessage) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitModels$ChatMessage parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitModels$ChatMessage) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitModels$ChatMessage parseFrom(byte[] bArr) {
        return (LivekitModels$ChatMessage) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitModels$ChatMessage parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitModels$ChatMessage) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitModels$ChatMessage parseFrom(InputStream inputStream) {
        return (LivekitModels$ChatMessage) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$ChatMessage parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitModels$ChatMessage) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitModels$ChatMessage parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitModels$ChatMessage) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitModels$ChatMessage parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitModels$ChatMessage) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
