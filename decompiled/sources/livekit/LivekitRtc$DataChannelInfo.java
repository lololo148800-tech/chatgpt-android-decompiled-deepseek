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
import p793ho.C14604J3;
import p793ho.EnumC14748g4;
import p793ho.InterfaceC14610K3;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitRtc$DataChannelInfo extends AbstractC12133Z implements InterfaceC14610K3 {
    private static final LivekitRtc$DataChannelInfo DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 2;
    public static final int LABEL_FIELD_NUMBER = 1;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int TARGET_FIELD_NUMBER = 3;
    private int id_;
    private String label_ = "";
    private int target_;

    static {
        LivekitRtc$DataChannelInfo livekitRtc$DataChannelInfo = new LivekitRtc$DataChannelInfo();
        DEFAULT_INSTANCE = livekitRtc$DataChannelInfo;
        AbstractC12133Z.registerDefaultInstance(LivekitRtc$DataChannelInfo.class, livekitRtc$DataChannelInfo);
    }

    private LivekitRtc$DataChannelInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLabel() {
        this.label_ = getDefaultInstance().getLabel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTarget() {
        this.target_ = 0;
    }

    public static LivekitRtc$DataChannelInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14604J3 newBuilder() {
        return (C14604J3) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$DataChannelInfo parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$DataChannelInfo) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$DataChannelInfo parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$DataChannelInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(int i10) {
        this.id_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLabel(String str) {
        str.getClass();
        this.label_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLabelBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.label_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTarget(EnumC14748g4 enumC14748g4) {
        this.target_ = enumC14748g4.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTargetValue(int i10) {
        this.target_ = i10;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u000b\u0003\f", new Object[]{"label_", "id_", "target_"});
            case 3:
                return new LivekitRtc$DataChannelInfo();
            case 4:
                return new C14604J3(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitRtc$DataChannelInfo.class) {
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

    public int getId() {
        return this.id_;
    }

    public String getLabel() {
        return this.label_;
    }

    public AbstractC12171m getLabelBytes() {
        return AbstractC12171m.m14011m(this.label_);
    }

    public EnumC14748g4 getTarget() {
        EnumC14748g4 enumC14748g4;
        int i10 = this.target_;
        if (i10 != 0) {
            enumC14748g4 = i10 != 1 ? null : EnumC14748g4.SUBSCRIBER;
        } else {
            enumC14748g4 = EnumC14748g4.PUBLISHER;
        }
        return enumC14748g4 == null ? EnumC14748g4.UNRECOGNIZED : enumC14748g4;
    }

    public int getTargetValue() {
        return this.target_;
    }

    public static C14604J3 newBuilder(LivekitRtc$DataChannelInfo livekitRtc$DataChannelInfo) {
        return (C14604J3) DEFAULT_INSTANCE.createBuilder(livekitRtc$DataChannelInfo);
    }

    public static LivekitRtc$DataChannelInfo parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$DataChannelInfo) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$DataChannelInfo parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitRtc$DataChannelInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitRtc$DataChannelInfo parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitRtc$DataChannelInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitRtc$DataChannelInfo parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitRtc$DataChannelInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitRtc$DataChannelInfo parseFrom(byte[] bArr) {
        return (LivekitRtc$DataChannelInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$DataChannelInfo parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitRtc$DataChannelInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitRtc$DataChannelInfo parseFrom(InputStream inputStream) {
        return (LivekitRtc$DataChannelInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$DataChannelInfo parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$DataChannelInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$DataChannelInfo parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitRtc$DataChannelInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitRtc$DataChannelInfo parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitRtc$DataChannelInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
