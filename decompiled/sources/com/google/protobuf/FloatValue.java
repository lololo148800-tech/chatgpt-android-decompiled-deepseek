package com.google.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class FloatValue extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final FloatValue DEFAULT_INSTANCE;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private float value_;

    static {
        FloatValue floatValue = new FloatValue();
        DEFAULT_INSTANCE = floatValue;
        AbstractC12133Z.registerDefaultInstance(FloatValue.class, floatValue);
    }

    private FloatValue() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = 0.0f;
    }

    public static FloatValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C12116Q newBuilder() {
        return (C12116Q) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: of */
    public static FloatValue m13739of(float f10) {
        C12116Q c12116qNewBuilder = newBuilder();
        c12116qNewBuilder.m13863d();
        ((FloatValue) c12116qNewBuilder.f36981Z).setValue(f10);
        return (FloatValue) c12116qNewBuilder.m13861b();
    }

    public static FloatValue parseDelimitedFrom(InputStream inputStream) {
        return (FloatValue) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FloatValue parseFrom(ByteBuffer byteBuffer) {
        return (FloatValue) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(float f10) {
        this.value_ = f10;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001", new Object[]{"value_"});
            case 3:
                return new FloatValue();
            case 4:
                return new C12116Q(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (FloatValue.class) {
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

    public float getValue() {
        return this.value_;
    }

    public static C12116Q newBuilder(FloatValue floatValue) {
        return (C12116Q) DEFAULT_INSTANCE.createBuilder(floatValue);
    }

    public static FloatValue parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (FloatValue) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static FloatValue parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (FloatValue) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static FloatValue parseFrom(AbstractC12171m abstractC12171m) {
        return (FloatValue) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static FloatValue parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (FloatValue) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static FloatValue parseFrom(byte[] bArr) {
        return (FloatValue) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FloatValue parseFrom(byte[] bArr, C12087F c12087f) {
        return (FloatValue) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static FloatValue parseFrom(InputStream inputStream) {
        return (FloatValue) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FloatValue parseFrom(InputStream inputStream, C12087F c12087f) {
        return (FloatValue) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static FloatValue parseFrom(AbstractC12186r abstractC12186r) {
        return (FloatValue) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static FloatValue parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (FloatValue) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
