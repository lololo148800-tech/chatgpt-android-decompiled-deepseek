package com.google.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class FieldMask extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final FieldMask DEFAULT_INSTANCE;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int PATHS_FIELD_NUMBER = 1;
    private InterfaceC12172m0 paths_ = AbstractC12133Z.emptyProtobufList();

    static {
        FieldMask fieldMask = new FieldMask();
        DEFAULT_INSTANCE = fieldMask;
        AbstractC12133Z.registerDefaultInstance(FieldMask.class, fieldMask);
    }

    private FieldMask() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPaths(Iterable<String> iterable) {
        ensurePathsIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.paths_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPaths(String str) {
        str.getClass();
        ensurePathsIsMutable();
        this.paths_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPathsBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        ensurePathsIsMutable();
        this.paths_.add(abstractC12171m.m14012w());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPaths() {
        this.paths_ = AbstractC12133Z.emptyProtobufList();
    }

    private void ensurePathsIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.paths_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.paths_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    public static FieldMask getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C12105L newBuilder() {
        return (C12105L) DEFAULT_INSTANCE.createBuilder();
    }

    public static FieldMask parseDelimitedFrom(InputStream inputStream) {
        return (FieldMask) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FieldMask parseFrom(ByteBuffer byteBuffer) {
        return (FieldMask) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPaths(int i10, String str) {
        str.getClass();
        ensurePathsIsMutable();
        this.paths_.set(i10, str);
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"paths_"});
            case 3:
                return new FieldMask();
            case 4:
                return new C12105L(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (FieldMask.class) {
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

    public String getPaths(int i10) {
        return (String) this.paths_.get(i10);
    }

    public AbstractC12171m getPathsBytes(int i10) {
        return AbstractC12171m.m14011m((String) this.paths_.get(i10));
    }

    public int getPathsCount() {
        return this.paths_.size();
    }

    public List<String> getPathsList() {
        return this.paths_;
    }

    public static C12105L newBuilder(FieldMask fieldMask) {
        return (C12105L) DEFAULT_INSTANCE.createBuilder(fieldMask);
    }

    public static FieldMask parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (FieldMask) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static FieldMask parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (FieldMask) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static FieldMask parseFrom(AbstractC12171m abstractC12171m) {
        return (FieldMask) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static FieldMask parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (FieldMask) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static FieldMask parseFrom(byte[] bArr) {
        return (FieldMask) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FieldMask parseFrom(byte[] bArr, C12087F c12087f) {
        return (FieldMask) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static FieldMask parseFrom(InputStream inputStream) {
        return (FieldMask) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FieldMask parseFrom(InputStream inputStream, C12087F c12087f) {
        return (FieldMask) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static FieldMask parseFrom(AbstractC12186r abstractC12186r) {
        return (FieldMask) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static FieldMask parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (FieldMask) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
