package com.google.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class Field extends AbstractC12133Z implements InterfaceC12108M {
    public static final int CARDINALITY_FIELD_NUMBER = 2;
    private static final Field DEFAULT_INSTANCE;
    public static final int DEFAULT_VALUE_FIELD_NUMBER = 11;
    public static final int JSON_NAME_FIELD_NUMBER = 10;
    public static final int KIND_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 4;
    public static final int NUMBER_FIELD_NUMBER = 3;
    public static final int ONEOF_INDEX_FIELD_NUMBER = 7;
    public static final int OPTIONS_FIELD_NUMBER = 9;
    public static final int PACKED_FIELD_NUMBER = 8;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 6;
    private int cardinality_;
    private int kind_;
    private int number_;
    private int oneofIndex_;
    private boolean packed_;
    private String name_ = "";
    private String typeUrl_ = "";
    private InterfaceC12172m0 options_ = AbstractC12133Z.emptyProtobufList();
    private String jsonName_ = "";
    private String defaultValue_ = "";

    static {
        Field field = new Field();
        DEFAULT_INSTANCE = field;
        AbstractC12133Z.registerDefaultInstance(Field.class, field);
    }

    private Field() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOptions(Iterable<? extends Option> iterable) {
        ensureOptionsIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(option);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCardinality() {
        this.cardinality_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDefaultValue() {
        this.defaultValue_ = getDefaultInstance().getDefaultValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJsonName() {
        this.jsonName_ = getDefaultInstance().getJsonName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKind() {
        this.kind_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumber() {
        this.number_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOneofIndex() {
        this.oneofIndex_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptions() {
        this.options_ = AbstractC12133Z.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPacked() {
        this.packed_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTypeUrl() {
        this.typeUrl_ = getDefaultInstance().getTypeUrl();
    }

    private void ensureOptionsIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.options_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.options_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    public static Field getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C12096I newBuilder() {
        return (C12096I) DEFAULT_INSTANCE.createBuilder();
    }

    public static Field parseDelimitedFrom(InputStream inputStream) {
        return (Field) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Field parseFrom(ByteBuffer byteBuffer) {
        return (Field) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeOptions(int i10) {
        ensureOptionsIsMutable();
        this.options_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCardinality(EnumC12099J enumC12099J) {
        this.cardinality_ = enumC12099J.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCardinalityValue(int i10) {
        this.cardinality_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultValue(String str) {
        str.getClass();
        this.defaultValue_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultValueBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.defaultValue_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJsonName(String str) {
        str.getClass();
        this.jsonName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJsonNameBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.jsonName_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKind(EnumC12102K enumC12102K) {
        this.kind_ = enumC12102K.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKindValue(int i10) {
        this.kind_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.name_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumber(int i10) {
        this.number_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOneofIndex(int i10) {
        this.oneofIndex_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOptions(int i10, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.set(i10, option);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPacked(boolean z6) {
        this.packed_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeUrl(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeUrlBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.typeUrl_ = abstractC12171m.m14012w();
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\u000b\n\u0000\u0001\u0000\u0001\f\u0002\f\u0003\u0004\u0004Ȉ\u0006Ȉ\u0007\u0004\b\u0007\t\u001b\nȈ\u000bȈ", new Object[]{"kind_", "cardinality_", "number_", "name_", "typeUrl_", "oneofIndex_", "packed_", "options_", Option.class, "jsonName_", "defaultValue_"});
            case 3:
                return new Field();
            case 4:
                return new C12096I(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (Field.class) {
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

    public EnumC12099J getCardinality() {
        EnumC12099J enumC12099J;
        int i10 = this.cardinality_;
        if (i10 == 0) {
            enumC12099J = EnumC12099J.CARDINALITY_UNKNOWN;
        } else if (i10 == 1) {
            enumC12099J = EnumC12099J.CARDINALITY_OPTIONAL;
        } else if (i10 != 2) {
            enumC12099J = i10 != 3 ? null : EnumC12099J.CARDINALITY_REPEATED;
        } else {
            enumC12099J = EnumC12099J.CARDINALITY_REQUIRED;
        }
        return enumC12099J == null ? EnumC12099J.UNRECOGNIZED : enumC12099J;
    }

    public int getCardinalityValue() {
        return this.cardinality_;
    }

    public String getDefaultValue() {
        return this.defaultValue_;
    }

    public AbstractC12171m getDefaultValueBytes() {
        return AbstractC12171m.m14011m(this.defaultValue_);
    }

    public String getJsonName() {
        return this.jsonName_;
    }

    public AbstractC12171m getJsonNameBytes() {
        return AbstractC12171m.m14011m(this.jsonName_);
    }

    public EnumC12102K getKind() {
        EnumC12102K enumC12102K;
        switch (this.kind_) {
            case 0:
                enumC12102K = EnumC12102K.TYPE_UNKNOWN;
                break;
            case 1:
                enumC12102K = EnumC12102K.TYPE_DOUBLE;
                break;
            case 2:
                enumC12102K = EnumC12102K.TYPE_FLOAT;
                break;
            case 3:
                enumC12102K = EnumC12102K.TYPE_INT64;
                break;
            case 4:
                enumC12102K = EnumC12102K.TYPE_UINT64;
                break;
            case 5:
                enumC12102K = EnumC12102K.TYPE_INT32;
                break;
            case 6:
                enumC12102K = EnumC12102K.TYPE_FIXED64;
                break;
            case 7:
                enumC12102K = EnumC12102K.TYPE_FIXED32;
                break;
            case 8:
                enumC12102K = EnumC12102K.TYPE_BOOL;
                break;
            case 9:
                enumC12102K = EnumC12102K.TYPE_STRING;
                break;
            case 10:
                enumC12102K = EnumC12102K.TYPE_GROUP;
                break;
            case 11:
                enumC12102K = EnumC12102K.f36943y0;
                break;
            case 12:
                enumC12102K = EnumC12102K.TYPE_BYTES;
                break;
            case 13:
                enumC12102K = EnumC12102K.TYPE_UINT32;
                break;
            case 14:
                enumC12102K = EnumC12102K.TYPE_ENUM;
                break;
            case 15:
                enumC12102K = EnumC12102K.TYPE_SFIXED32;
                break;
            case 16:
                enumC12102K = EnumC12102K.TYPE_SFIXED64;
                break;
            case 17:
                enumC12102K = EnumC12102K.TYPE_SINT32;
                break;
            case 18:
                enumC12102K = EnumC12102K.TYPE_SINT64;
                break;
            default:
                enumC12102K = null;
                break;
        }
        return enumC12102K == null ? EnumC12102K.UNRECOGNIZED : enumC12102K;
    }

    public int getKindValue() {
        return this.kind_;
    }

    public String getName() {
        return this.name_;
    }

    public AbstractC12171m getNameBytes() {
        return AbstractC12171m.m14011m(this.name_);
    }

    public int getNumber() {
        return this.number_;
    }

    public int getOneofIndex() {
        return this.oneofIndex_;
    }

    public Option getOptions(int i10) {
        return (Option) this.options_.get(i10);
    }

    public int getOptionsCount() {
        return this.options_.size();
    }

    public List<Option> getOptionsList() {
        return this.options_;
    }

    public InterfaceC12122T0 getOptionsOrBuilder(int i10) {
        return (InterfaceC12122T0) this.options_.get(i10);
    }

    public List<? extends InterfaceC12122T0> getOptionsOrBuilderList() {
        return this.options_;
    }

    public boolean getPacked() {
        return this.packed_;
    }

    public String getTypeUrl() {
        return this.typeUrl_;
    }

    public AbstractC12171m getTypeUrlBytes() {
        return AbstractC12171m.m14011m(this.typeUrl_);
    }

    public static C12096I newBuilder(Field field) {
        return (C12096I) DEFAULT_INSTANCE.createBuilder(field);
    }

    public static Field parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (Field) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static Field parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (Field) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static Field parseFrom(AbstractC12171m abstractC12171m) {
        return (Field) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(int i10, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(i10, option);
    }

    public static Field parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (Field) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static Field parseFrom(byte[] bArr) {
        return (Field) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Field parseFrom(byte[] bArr, C12087F c12087f) {
        return (Field) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static Field parseFrom(InputStream inputStream) {
        return (Field) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Field parseFrom(InputStream inputStream, C12087F c12087f) {
        return (Field) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static Field parseFrom(AbstractC12186r abstractC12186r) {
        return (Field) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static Field parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (Field) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
