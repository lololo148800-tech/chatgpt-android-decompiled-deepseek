package livekit;

import com.google.protobuf.AbstractC12133Z;
import com.google.protobuf.AbstractC12171m;
import com.google.protobuf.AbstractC12186r;
import com.google.protobuf.C12087F;
import com.google.protobuf.C12123U;
import com.google.protobuf.EnumC12131Y;
import com.google.protobuf.InterfaceC12094H0;
import com.google.protobuf.InterfaceC12124U0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p793ho.C14578F1;
import p793ho.EnumC14571E1;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitInternal$ICEConfig extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitInternal$ICEConfig DEFAULT_INSTANCE;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int PREFERENCE_PUBLISHER_FIELD_NUMBER = 2;
    public static final int PREFERENCE_SUBSCRIBER_FIELD_NUMBER = 1;
    private int preferencePublisher_;
    private int preferenceSubscriber_;

    static {
        LivekitInternal$ICEConfig livekitInternal$ICEConfig = new LivekitInternal$ICEConfig();
        DEFAULT_INSTANCE = livekitInternal$ICEConfig;
        AbstractC12133Z.registerDefaultInstance(LivekitInternal$ICEConfig.class, livekitInternal$ICEConfig);
    }

    private LivekitInternal$ICEConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPreferencePublisher() {
        this.preferencePublisher_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPreferenceSubscriber() {
        this.preferenceSubscriber_ = 0;
    }

    public static LivekitInternal$ICEConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14578F1 newBuilder() {
        return (C14578F1) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitInternal$ICEConfig parseDelimitedFrom(InputStream inputStream) {
        return (LivekitInternal$ICEConfig) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitInternal$ICEConfig parseFrom(ByteBuffer byteBuffer) {
        return (LivekitInternal$ICEConfig) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreferencePublisher(EnumC14571E1 enumC14571E1) {
        this.preferencePublisher_ = enumC14571E1.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreferencePublisherValue(int i10) {
        this.preferencePublisher_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreferenceSubscriber(EnumC14571E1 enumC14571E1) {
        this.preferenceSubscriber_ = enumC14571E1.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreferenceSubscriberValue(int i10) {
        this.preferenceSubscriber_ = i10;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\f", new Object[]{"preferenceSubscriber_", "preferencePublisher_"});
            case 3:
                return new LivekitInternal$ICEConfig();
            case 4:
                return new C14578F1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitInternal$ICEConfig.class) {
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

    public EnumC14571E1 getPreferencePublisher() {
        EnumC14571E1 enumC14571E1M16041a = EnumC14571E1.m16041a(this.preferencePublisher_);
        return enumC14571E1M16041a == null ? EnumC14571E1.UNRECOGNIZED : enumC14571E1M16041a;
    }

    public int getPreferencePublisherValue() {
        return this.preferencePublisher_;
    }

    public EnumC14571E1 getPreferenceSubscriber() {
        EnumC14571E1 enumC14571E1M16041a = EnumC14571E1.m16041a(this.preferenceSubscriber_);
        return enumC14571E1M16041a == null ? EnumC14571E1.UNRECOGNIZED : enumC14571E1M16041a;
    }

    public int getPreferenceSubscriberValue() {
        return this.preferenceSubscriber_;
    }

    public static C14578F1 newBuilder(LivekitInternal$ICEConfig livekitInternal$ICEConfig) {
        return (C14578F1) DEFAULT_INSTANCE.createBuilder(livekitInternal$ICEConfig);
    }

    public static LivekitInternal$ICEConfig parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitInternal$ICEConfig) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitInternal$ICEConfig parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitInternal$ICEConfig) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitInternal$ICEConfig parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitInternal$ICEConfig) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitInternal$ICEConfig parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitInternal$ICEConfig) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitInternal$ICEConfig parseFrom(byte[] bArr) {
        return (LivekitInternal$ICEConfig) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitInternal$ICEConfig parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitInternal$ICEConfig) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitInternal$ICEConfig parseFrom(InputStream inputStream) {
        return (LivekitInternal$ICEConfig) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitInternal$ICEConfig parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitInternal$ICEConfig) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitInternal$ICEConfig parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitInternal$ICEConfig) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitInternal$ICEConfig parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitInternal$ICEConfig) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
