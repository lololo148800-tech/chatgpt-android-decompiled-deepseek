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
import p793ho.C14740f3;
import p793ho.EnumC14691Y1;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitModels$VideoConfiguration extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitModels$VideoConfiguration DEFAULT_INSTANCE;
    public static final int HARDWARE_ENCODER_FIELD_NUMBER = 1;
    private static volatile InterfaceC12124U0 PARSER;
    private int hardwareEncoder_;

    static {
        LivekitModels$VideoConfiguration livekitModels$VideoConfiguration = new LivekitModels$VideoConfiguration();
        DEFAULT_INSTANCE = livekitModels$VideoConfiguration;
        AbstractC12133Z.registerDefaultInstance(LivekitModels$VideoConfiguration.class, livekitModels$VideoConfiguration);
    }

    private LivekitModels$VideoConfiguration() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHardwareEncoder() {
        this.hardwareEncoder_ = 0;
    }

    public static LivekitModels$VideoConfiguration getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14740f3 newBuilder() {
        return (C14740f3) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitModels$VideoConfiguration parseDelimitedFrom(InputStream inputStream) {
        return (LivekitModels$VideoConfiguration) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$VideoConfiguration parseFrom(ByteBuffer byteBuffer) {
        return (LivekitModels$VideoConfiguration) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHardwareEncoder(EnumC14691Y1 enumC14691Y1) {
        this.hardwareEncoder_ = enumC14691Y1.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHardwareEncoderValue(int i10) {
        this.hardwareEncoder_ = i10;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"hardwareEncoder_"});
            case 3:
                return new LivekitModels$VideoConfiguration();
            case 4:
                return new C14740f3(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitModels$VideoConfiguration.class) {
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

    public EnumC14691Y1 getHardwareEncoder() {
        EnumC14691Y1 enumC14691Y1M16046a = EnumC14691Y1.m16046a(this.hardwareEncoder_);
        return enumC14691Y1M16046a == null ? EnumC14691Y1.UNRECOGNIZED : enumC14691Y1M16046a;
    }

    public int getHardwareEncoderValue() {
        return this.hardwareEncoder_;
    }

    public static C14740f3 newBuilder(LivekitModels$VideoConfiguration livekitModels$VideoConfiguration) {
        return (C14740f3) DEFAULT_INSTANCE.createBuilder(livekitModels$VideoConfiguration);
    }

    public static LivekitModels$VideoConfiguration parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitModels$VideoConfiguration) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitModels$VideoConfiguration parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitModels$VideoConfiguration) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitModels$VideoConfiguration parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitModels$VideoConfiguration) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitModels$VideoConfiguration parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitModels$VideoConfiguration) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitModels$VideoConfiguration parseFrom(byte[] bArr) {
        return (LivekitModels$VideoConfiguration) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitModels$VideoConfiguration parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitModels$VideoConfiguration) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitModels$VideoConfiguration parseFrom(InputStream inputStream) {
        return (LivekitModels$VideoConfiguration) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$VideoConfiguration parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitModels$VideoConfiguration) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitModels$VideoConfiguration parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitModels$VideoConfiguration) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitModels$VideoConfiguration parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitModels$VideoConfiguration) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
