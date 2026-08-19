package com.google.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class Int32Value extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final Int32Value DEFAULT_INSTANCE;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int value_;

    static {
        Int32Value int32Value = new Int32Value();
        DEFAULT_INSTANCE = int32Value;
        AbstractC12133Z.registerDefaultInstance(Int32Value.class, int32Value);
    }

    private Int32Value() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = 0;
    }

    public static Int32Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C12136a0 newBuilder() {
        return (C12136a0) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: of */
    public static Int32Value m13751of(int i10) {
        C12136a0 c12136a0NewBuilder = newBuilder();
        c12136a0NewBuilder.m13863d();
        ((Int32Value) c12136a0NewBuilder.f36981Z).setValue(i10);
        return (Int32Value) c12136a0NewBuilder.m13861b();
    }

    public static Int32Value parseDelimitedFrom(InputStream inputStream) {
        return (Int32Value) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Int32Value parseFrom(ByteBuffer byteBuffer) {
        return (Int32Value) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(int i10) {
        this.value_ = i10;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"value_"});
            case 3:
                return new Int32Value();
            case 4:
                return new C12136a0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (Int32Value.class) {
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

    public int getValue() {
        return this.value_;
    }

    public static C12136a0 newBuilder(Int32Value int32Value) {
        return (C12136a0) DEFAULT_INSTANCE.createBuilder(int32Value);
    }

    public static Int32Value parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (Int32Value) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static Int32Value parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (Int32Value) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static Int32Value parseFrom(AbstractC12171m abstractC12171m) {
        return (Int32Value) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static Int32Value parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (Int32Value) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static Int32Value parseFrom(byte[] bArr) {
        return (Int32Value) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Int32Value parseFrom(byte[] bArr, C12087F c12087f) {
        return (Int32Value) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static Int32Value parseFrom(InputStream inputStream) {
        return (Int32Value) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Int32Value parseFrom(InputStream inputStream, C12087F c12087f) {
        return (Int32Value) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static Int32Value parseFrom(AbstractC12186r abstractC12186r) {
        return (Int32Value) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static Int32Value parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (Int32Value) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
