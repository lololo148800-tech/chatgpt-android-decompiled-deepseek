package com.google.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class BoolValue extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final BoolValue DEFAULT_INSTANCE;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private boolean value_;

    static {
        BoolValue boolValue = new BoolValue();
        DEFAULT_INSTANCE = boolValue;
        AbstractC12133Z.registerDefaultInstance(BoolValue.class, boolValue);
    }

    private BoolValue() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = false;
    }

    public static BoolValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C12156h newBuilder() {
        return (C12156h) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: of */
    public static BoolValue m13725of(boolean z6) {
        C12156h c12156hNewBuilder = newBuilder();
        c12156hNewBuilder.m13863d();
        ((BoolValue) c12156hNewBuilder.f36981Z).setValue(z6);
        return (BoolValue) c12156hNewBuilder.m13861b();
    }

    public static BoolValue parseDelimitedFrom(InputStream inputStream) {
        return (BoolValue) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BoolValue parseFrom(ByteBuffer byteBuffer) {
        return (BoolValue) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(boolean z6) {
        this.value_ = z6;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"value_"});
            case 3:
                return new BoolValue();
            case 4:
                return new C12156h(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (BoolValue.class) {
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

    public boolean getValue() {
        return this.value_;
    }

    public static C12156h newBuilder(BoolValue boolValue) {
        return (C12156h) DEFAULT_INSTANCE.createBuilder(boolValue);
    }

    public static BoolValue parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (BoolValue) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static BoolValue parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (BoolValue) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static BoolValue parseFrom(AbstractC12171m abstractC12171m) {
        return (BoolValue) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static BoolValue parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (BoolValue) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static BoolValue parseFrom(byte[] bArr) {
        return (BoolValue) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BoolValue parseFrom(byte[] bArr, C12087F c12087f) {
        return (BoolValue) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static BoolValue parseFrom(InputStream inputStream) {
        return (BoolValue) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BoolValue parseFrom(InputStream inputStream, C12087F c12087f) {
        return (BoolValue) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static BoolValue parseFrom(AbstractC12186r abstractC12186r) {
        return (BoolValue) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static BoolValue parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (BoolValue) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
