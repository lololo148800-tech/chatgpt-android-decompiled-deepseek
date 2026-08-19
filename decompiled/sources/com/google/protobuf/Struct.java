package com.google.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Map;
import p817j$.util.DesugarCollections;

/* JADX INFO: loaded from: classes3.dex */
public final class Struct extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final Struct DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static volatile InterfaceC12124U0 PARSER;
    private C12076B0 fields_ = C12076B0.f36868Z;

    static {
        Struct struct = new Struct();
        DEFAULT_INSTANCE = struct;
        AbstractC12133Z.registerDefaultInstance(Struct.class, struct);
    }

    private Struct() {
    }

    public static Struct getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Value> getMutableFieldsMap() {
        return internalGetMutableFields();
    }

    private C12076B0 internalGetFields() {
        return this.fields_;
    }

    private C12076B0 internalGetMutableFields() {
        C12076B0 c12076b0 = this.fields_;
        if (!c12076b0.f36869Y) {
            this.fields_ = c12076b0.m13719c();
        }
        return this.fields_;
    }

    public static C12158h1 newBuilder() {
        return (C12158h1) DEFAULT_INSTANCE.createBuilder();
    }

    public static Struct parseDelimitedFrom(InputStream inputStream) {
        return (Struct) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Struct parseFrom(ByteBuffer byteBuffer) {
        return (Struct) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public boolean containsFields(String str) {
        str.getClass();
        return internalGetFields().containsKey(str);
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"fields_", AbstractC12161i1.f37035a});
            case 3:
                return new Struct();
            case 4:
                return new C12158h1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (Struct.class) {
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

    @Deprecated
    public Map<String, Value> getFields() {
        return getFieldsMap();
    }

    public int getFieldsCount() {
        return internalGetFields().size();
    }

    public Map<String, Value> getFieldsMap() {
        return DesugarCollections.unmodifiableMap(internalGetFields());
    }

    public Value getFieldsOrDefault(String str, Value value) {
        str.getClass();
        C12076B0 c12076b0InternalGetFields = internalGetFields();
        return c12076b0InternalGetFields.containsKey(str) ? (Value) c12076b0InternalGetFields.get(str) : value;
    }

    public Value getFieldsOrThrow(String str) {
        str.getClass();
        C12076B0 c12076b0InternalGetFields = internalGetFields();
        if (c12076b0InternalGetFields.containsKey(str)) {
            return (Value) c12076b0InternalGetFields.get(str);
        }
        throw new IllegalArgumentException();
    }

    public static C12158h1 newBuilder(Struct struct) {
        return (C12158h1) DEFAULT_INSTANCE.createBuilder(struct);
    }

    public static Struct parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (Struct) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static Struct parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (Struct) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static Struct parseFrom(AbstractC12171m abstractC12171m) {
        return (Struct) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static Struct parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (Struct) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static Struct parseFrom(byte[] bArr) {
        return (Struct) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Struct parseFrom(byte[] bArr, C12087F c12087f) {
        return (Struct) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static Struct parseFrom(InputStream inputStream) {
        return (Struct) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Struct parseFrom(InputStream inputStream, C12087F c12087f) {
        return (Struct) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static Struct parseFrom(AbstractC12186r abstractC12186r) {
        return (Struct) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static Struct parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (Struct) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
