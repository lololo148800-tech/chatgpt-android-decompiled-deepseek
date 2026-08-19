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
import p793ho.C14791m5;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitSip$SIPDispatchRuleIndividual extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitSip$SIPDispatchRuleIndividual DEFAULT_INSTANCE;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int PIN_FIELD_NUMBER = 2;
    public static final int ROOM_PREFIX_FIELD_NUMBER = 1;
    private String roomPrefix_ = "";
    private String pin_ = "";

    static {
        LivekitSip$SIPDispatchRuleIndividual livekitSip$SIPDispatchRuleIndividual = new LivekitSip$SIPDispatchRuleIndividual();
        DEFAULT_INSTANCE = livekitSip$SIPDispatchRuleIndividual;
        AbstractC12133Z.registerDefaultInstance(LivekitSip$SIPDispatchRuleIndividual.class, livekitSip$SIPDispatchRuleIndividual);
    }

    private LivekitSip$SIPDispatchRuleIndividual() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPin() {
        this.pin_ = getDefaultInstance().getPin();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoomPrefix() {
        this.roomPrefix_ = getDefaultInstance().getRoomPrefix();
    }

    public static LivekitSip$SIPDispatchRuleIndividual getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14791m5 newBuilder() {
        return (C14791m5) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitSip$SIPDispatchRuleIndividual parseDelimitedFrom(InputStream inputStream) {
        return (LivekitSip$SIPDispatchRuleIndividual) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitSip$SIPDispatchRuleIndividual parseFrom(ByteBuffer byteBuffer) {
        return (LivekitSip$SIPDispatchRuleIndividual) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPin(String str) {
        str.getClass();
        this.pin_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPinBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.pin_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoomPrefix(String str) {
        str.getClass();
        this.roomPrefix_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoomPrefixBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.roomPrefix_ = abstractC12171m.m14012w();
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"roomPrefix_", "pin_"});
            case 3:
                return new LivekitSip$SIPDispatchRuleIndividual();
            case 4:
                return new C14791m5(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitSip$SIPDispatchRuleIndividual.class) {
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

    public String getPin() {
        return this.pin_;
    }

    public AbstractC12171m getPinBytes() {
        return AbstractC12171m.m14011m(this.pin_);
    }

    public String getRoomPrefix() {
        return this.roomPrefix_;
    }

    public AbstractC12171m getRoomPrefixBytes() {
        return AbstractC12171m.m14011m(this.roomPrefix_);
    }

    public static C14791m5 newBuilder(LivekitSip$SIPDispatchRuleIndividual livekitSip$SIPDispatchRuleIndividual) {
        return (C14791m5) DEFAULT_INSTANCE.createBuilder(livekitSip$SIPDispatchRuleIndividual);
    }

    public static LivekitSip$SIPDispatchRuleIndividual parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitSip$SIPDispatchRuleIndividual) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitSip$SIPDispatchRuleIndividual parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitSip$SIPDispatchRuleIndividual) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitSip$SIPDispatchRuleIndividual parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitSip$SIPDispatchRuleIndividual) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitSip$SIPDispatchRuleIndividual parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitSip$SIPDispatchRuleIndividual) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitSip$SIPDispatchRuleIndividual parseFrom(byte[] bArr) {
        return (LivekitSip$SIPDispatchRuleIndividual) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitSip$SIPDispatchRuleIndividual parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitSip$SIPDispatchRuleIndividual) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitSip$SIPDispatchRuleIndividual parseFrom(InputStream inputStream) {
        return (LivekitSip$SIPDispatchRuleIndividual) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitSip$SIPDispatchRuleIndividual parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitSip$SIPDispatchRuleIndividual) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitSip$SIPDispatchRuleIndividual parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitSip$SIPDispatchRuleIndividual) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitSip$SIPDispatchRuleIndividual parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitSip$SIPDispatchRuleIndividual) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
