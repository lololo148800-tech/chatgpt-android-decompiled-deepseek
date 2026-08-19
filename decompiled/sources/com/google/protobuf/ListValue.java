package com.google.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ListValue extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final ListValue DEFAULT_INSTANCE;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private InterfaceC12172m0 values_ = AbstractC12133Z.emptyProtobufList();

    static {
        ListValue listValue = new ListValue();
        DEFAULT_INSTANCE = listValue;
        AbstractC12133Z.registerDefaultInstance(ListValue.class, listValue);
    }

    private ListValue() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllValues(Iterable<? extends Value> iterable) {
        ensureValuesIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.values_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addValues(Value value) {
        value.getClass();
        ensureValuesIsMutable();
        this.values_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValues() {
        this.values_ = AbstractC12133Z.emptyProtobufList();
    }

    private void ensureValuesIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.values_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.values_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    public static ListValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C12202w0 newBuilder() {
        return (C12202w0) DEFAULT_INSTANCE.createBuilder();
    }

    public static ListValue parseDelimitedFrom(InputStream inputStream) {
        return (ListValue) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ListValue parseFrom(ByteBuffer byteBuffer) {
        return (ListValue) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeValues(int i10) {
        ensureValuesIsMutable();
        this.values_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValues(int i10, Value value) {
        value.getClass();
        ensureValuesIsMutable();
        this.values_.set(i10, value);
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"values_", Value.class});
            case 3:
                return new ListValue();
            case 4:
                return new C12202w0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (ListValue.class) {
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

    public Value getValues(int i10) {
        return (Value) this.values_.get(i10);
    }

    public int getValuesCount() {
        return this.values_.size();
    }

    public List<Value> getValuesList() {
        return this.values_;
    }

    public InterfaceC12086E1 getValuesOrBuilder(int i10) {
        return (InterfaceC12086E1) this.values_.get(i10);
    }

    public List<? extends InterfaceC12086E1> getValuesOrBuilderList() {
        return this.values_;
    }

    public static C12202w0 newBuilder(ListValue listValue) {
        return (C12202w0) DEFAULT_INSTANCE.createBuilder(listValue);
    }

    public static ListValue parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (ListValue) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static ListValue parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (ListValue) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static ListValue parseFrom(AbstractC12171m abstractC12171m) {
        return (ListValue) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addValues(int i10, Value value) {
        value.getClass();
        ensureValuesIsMutable();
        this.values_.add(i10, value);
    }

    public static ListValue parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (ListValue) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static ListValue parseFrom(byte[] bArr) {
        return (ListValue) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ListValue parseFrom(byte[] bArr, C12087F c12087f) {
        return (ListValue) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static ListValue parseFrom(InputStream inputStream) {
        return (ListValue) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ListValue parseFrom(InputStream inputStream, C12087F c12087f) {
        return (ListValue) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static ListValue parseFrom(AbstractC12186r abstractC12186r) {
        return (ListValue) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static ListValue parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (ListValue) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
