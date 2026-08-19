package livekit;

import com.google.protobuf.AbstractC12133Z;
import com.google.protobuf.AbstractC12171m;
import com.google.protobuf.AbstractC12186r;
import com.google.protobuf.C12087F;
import com.google.protobuf.C12123U;
import com.google.protobuf.EnumC12131Y;
import com.google.protobuf.InterfaceC12124U0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p793ho.C14832s4;
import p793ho.EnumC14761i3;
import p793ho.InterfaceC14839t4;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitRtc$SubscribedQuality extends AbstractC12133Z implements InterfaceC14839t4 {
    private static final LivekitRtc$SubscribedQuality DEFAULT_INSTANCE;
    public static final int ENABLED_FIELD_NUMBER = 2;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int QUALITY_FIELD_NUMBER = 1;
    private boolean enabled_;
    private int quality_;

    static {
        LivekitRtc$SubscribedQuality livekitRtc$SubscribedQuality = new LivekitRtc$SubscribedQuality();
        DEFAULT_INSTANCE = livekitRtc$SubscribedQuality;
        AbstractC12133Z.registerDefaultInstance(LivekitRtc$SubscribedQuality.class, livekitRtc$SubscribedQuality);
    }

    private LivekitRtc$SubscribedQuality() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnabled() {
        this.enabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuality() {
        this.quality_ = 0;
    }

    public static LivekitRtc$SubscribedQuality getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14832s4 newBuilder() {
        return (C14832s4) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$SubscribedQuality parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$SubscribedQuality) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$SubscribedQuality parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$SubscribedQuality) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnabled(boolean z6) {
        this.enabled_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuality(EnumC14761i3 enumC14761i3) {
        this.quality_ = enumC14761i3.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQualityValue(int i10) {
        this.quality_ = i10;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0007", new Object[]{"quality_", "enabled_"});
            case 3:
                return new LivekitRtc$SubscribedQuality();
            case 4:
                return new C14832s4(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitRtc$SubscribedQuality.class) {
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

    public boolean getEnabled() {
        return this.enabled_;
    }

    public EnumC14761i3 getQuality() {
        EnumC14761i3 enumC14761i3M16050a = EnumC14761i3.m16050a(this.quality_);
        return enumC14761i3M16050a == null ? EnumC14761i3.UNRECOGNIZED : enumC14761i3M16050a;
    }

    public int getQualityValue() {
        return this.quality_;
    }

    public static C14832s4 newBuilder(LivekitRtc$SubscribedQuality livekitRtc$SubscribedQuality) {
        return (C14832s4) DEFAULT_INSTANCE.createBuilder(livekitRtc$SubscribedQuality);
    }

    public static LivekitRtc$SubscribedQuality parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$SubscribedQuality) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$SubscribedQuality parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitRtc$SubscribedQuality) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitRtc$SubscribedQuality parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitRtc$SubscribedQuality) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitRtc$SubscribedQuality parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitRtc$SubscribedQuality) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitRtc$SubscribedQuality parseFrom(byte[] bArr) {
        return (LivekitRtc$SubscribedQuality) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$SubscribedQuality parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitRtc$SubscribedQuality) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitRtc$SubscribedQuality parseFrom(InputStream inputStream) {
        return (LivekitRtc$SubscribedQuality) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$SubscribedQuality parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$SubscribedQuality) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$SubscribedQuality parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitRtc$SubscribedQuality) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitRtc$SubscribedQuality parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitRtc$SubscribedQuality) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
