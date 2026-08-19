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
import p793ho.C14586G3;
import p793ho.EnumC14732e2;
import p793ho.InterfaceC14592H3;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitRtc$ConnectionQualityInfo extends AbstractC12133Z implements InterfaceC14592H3 {
    private static final LivekitRtc$ConnectionQualityInfo DEFAULT_INSTANCE;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int PARTICIPANT_SID_FIELD_NUMBER = 1;
    public static final int QUALITY_FIELD_NUMBER = 2;
    public static final int SCORE_FIELD_NUMBER = 3;
    private String participantSid_ = "";
    private int quality_;
    private float score_;

    static {
        LivekitRtc$ConnectionQualityInfo livekitRtc$ConnectionQualityInfo = new LivekitRtc$ConnectionQualityInfo();
        DEFAULT_INSTANCE = livekitRtc$ConnectionQualityInfo;
        AbstractC12133Z.registerDefaultInstance(LivekitRtc$ConnectionQualityInfo.class, livekitRtc$ConnectionQualityInfo);
    }

    private LivekitRtc$ConnectionQualityInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipantSid() {
        this.participantSid_ = getDefaultInstance().getParticipantSid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuality() {
        this.quality_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScore() {
        this.score_ = 0.0f;
    }

    public static LivekitRtc$ConnectionQualityInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14586G3 newBuilder() {
        return (C14586G3) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$ConnectionQualityInfo parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$ConnectionQualityInfo) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$ConnectionQualityInfo parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$ConnectionQualityInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipantSid(String str) {
        str.getClass();
        this.participantSid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipantSidBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.participantSid_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuality(EnumC14732e2 enumC14732e2) {
        this.quality_ = enumC14732e2.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQualityValue(int i10) {
        this.quality_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScore(float f10) {
        this.score_ = f10;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u0001", new Object[]{"participantSid_", "quality_", "score_"});
            case 3:
                return new LivekitRtc$ConnectionQualityInfo();
            case 4:
                return new C14586G3(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitRtc$ConnectionQualityInfo.class) {
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

    public String getParticipantSid() {
        return this.participantSid_;
    }

    public AbstractC12171m getParticipantSidBytes() {
        return AbstractC12171m.m14011m(this.participantSid_);
    }

    public EnumC14732e2 getQuality() {
        EnumC14732e2 enumC14732e2;
        int i10 = this.quality_;
        if (i10 == 0) {
            enumC14732e2 = EnumC14732e2.POOR;
        } else if (i10 == 1) {
            enumC14732e2 = EnumC14732e2.GOOD;
        } else if (i10 != 2) {
            enumC14732e2 = i10 != 3 ? null : EnumC14732e2.LOST;
        } else {
            enumC14732e2 = EnumC14732e2.EXCELLENT;
        }
        return enumC14732e2 == null ? EnumC14732e2.UNRECOGNIZED : enumC14732e2;
    }

    public int getQualityValue() {
        return this.quality_;
    }

    public float getScore() {
        return this.score_;
    }

    public static C14586G3 newBuilder(LivekitRtc$ConnectionQualityInfo livekitRtc$ConnectionQualityInfo) {
        return (C14586G3) DEFAULT_INSTANCE.createBuilder(livekitRtc$ConnectionQualityInfo);
    }

    public static LivekitRtc$ConnectionQualityInfo parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$ConnectionQualityInfo) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$ConnectionQualityInfo parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitRtc$ConnectionQualityInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitRtc$ConnectionQualityInfo parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitRtc$ConnectionQualityInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitRtc$ConnectionQualityInfo parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitRtc$ConnectionQualityInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitRtc$ConnectionQualityInfo parseFrom(byte[] bArr) {
        return (LivekitRtc$ConnectionQualityInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$ConnectionQualityInfo parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitRtc$ConnectionQualityInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitRtc$ConnectionQualityInfo parseFrom(InputStream inputStream) {
        return (LivekitRtc$ConnectionQualityInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$ConnectionQualityInfo parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$ConnectionQualityInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$ConnectionQualityInfo parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitRtc$ConnectionQualityInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitRtc$ConnectionQualityInfo parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitRtc$ConnectionQualityInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
