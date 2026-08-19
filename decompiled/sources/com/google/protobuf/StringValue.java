package com.google.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class StringValue extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final StringValue DEFAULT_INSTANCE;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private String value_ = "";

    static {
        StringValue stringValue = new StringValue();
        DEFAULT_INSTANCE = stringValue;
        AbstractC12133Z.registerDefaultInstance(StringValue.class, stringValue);
    }

    private StringValue() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = getDefaultInstance().getValue();
    }

    public static StringValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C12155g1 newBuilder() {
        return (C12155g1) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: of */
    public static StringValue m13858of(String str) {
        C12155g1 c12155g1NewBuilder = newBuilder();
        c12155g1NewBuilder.m13863d();
        ((StringValue) c12155g1NewBuilder.f36981Z).setValue(str);
        return (StringValue) c12155g1NewBuilder.m13861b();
    }

    public static StringValue parseDelimitedFrom(InputStream inputStream) {
        return (StringValue) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static StringValue parseFrom(ByteBuffer byteBuffer) {
        return (StringValue) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(String str) {
        str.getClass();
        this.value_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValueBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.value_ = abstractC12171m.m14012w();
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"value_"});
            case 3:
                return new StringValue();
            case 4:
                return new C12155g1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (StringValue.class) {
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

    public String getValue() {
        return this.value_;
    }

    public AbstractC12171m getValueBytes() {
        return AbstractC12171m.m14011m(this.value_);
    }

    public static C12155g1 newBuilder(StringValue stringValue) {
        return (C12155g1) DEFAULT_INSTANCE.createBuilder(stringValue);
    }

    public static StringValue parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (StringValue) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static StringValue parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (StringValue) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static StringValue parseFrom(AbstractC12171m abstractC12171m) {
        return (StringValue) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static StringValue parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (StringValue) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static StringValue parseFrom(byte[] bArr) {
        return (StringValue) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static StringValue parseFrom(byte[] bArr, C12087F c12087f) {
        return (StringValue) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static StringValue parseFrom(InputStream inputStream) {
        return (StringValue) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static StringValue parseFrom(InputStream inputStream, C12087F c12087f) {
        return (StringValue) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static StringValue parseFrom(AbstractC12186r abstractC12186r) {
        return (StringValue) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static StringValue parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (StringValue) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
