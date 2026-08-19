package com.google.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class BytesValue extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final BytesValue DEFAULT_INSTANCE;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private AbstractC12171m value_ = AbstractC12171m.f37047Z;

    static {
        BytesValue bytesValue = new BytesValue();
        DEFAULT_INSTANCE = bytesValue;
        AbstractC12133Z.registerDefaultInstance(BytesValue.class, bytesValue);
    }

    private BytesValue() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = getDefaultInstance().getValue();
    }

    public static BytesValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C12174n newBuilder() {
        return (C12174n) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: of */
    public static BytesValue m13726of(AbstractC12171m abstractC12171m) {
        C12174n c12174nNewBuilder = newBuilder();
        c12174nNewBuilder.m13863d();
        ((BytesValue) c12174nNewBuilder.f36981Z).setValue(abstractC12171m);
        return (BytesValue) c12174nNewBuilder.m13861b();
    }

    public static BytesValue parseDelimitedFrom(InputStream inputStream) {
        return (BytesValue) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BytesValue parseFrom(ByteBuffer byteBuffer) {
        return (BytesValue) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(AbstractC12171m abstractC12171m) {
        abstractC12171m.getClass();
        this.value_ = abstractC12171m;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"value_"});
            case 3:
                return new BytesValue();
            case 4:
                return new C12174n(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (BytesValue.class) {
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

    public AbstractC12171m getValue() {
        return this.value_;
    }

    public static C12174n newBuilder(BytesValue bytesValue) {
        return (C12174n) DEFAULT_INSTANCE.createBuilder(bytesValue);
    }

    public static BytesValue parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (BytesValue) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static BytesValue parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (BytesValue) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static BytesValue parseFrom(AbstractC12171m abstractC12171m) {
        return (BytesValue) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static BytesValue parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (BytesValue) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static BytesValue parseFrom(byte[] bArr) {
        return (BytesValue) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BytesValue parseFrom(byte[] bArr, C12087F c12087f) {
        return (BytesValue) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static BytesValue parseFrom(InputStream inputStream) {
        return (BytesValue) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BytesValue parseFrom(InputStream inputStream, C12087F c12087f) {
        return (BytesValue) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static BytesValue parseFrom(AbstractC12186r abstractC12186r) {
        return (BytesValue) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static BytesValue parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (BytesValue) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
