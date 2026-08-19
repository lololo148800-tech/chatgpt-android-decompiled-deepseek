package com.google.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class Api extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final Api DEFAULT_INSTANCE;
    public static final int METHODS_FIELD_NUMBER = 2;
    public static final int MIXINS_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    public static final int VERSION_FIELD_NUMBER = 4;
    private SourceContext sourceContext_;
    private int syntax_;
    private String name_ = "";
    private InterfaceC12172m0 methods_ = AbstractC12133Z.emptyProtobufList();
    private InterfaceC12172m0 options_ = AbstractC12133Z.emptyProtobufList();
    private String version_ = "";
    private InterfaceC12172m0 mixins_ = AbstractC12133Z.emptyProtobufList();

    static {
        Api api = new Api();
        DEFAULT_INSTANCE = api;
        AbstractC12133Z.registerDefaultInstance(Api.class, api);
    }

    private Api() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMethods(Iterable<? extends Method> iterable) {
        ensureMethodsIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.methods_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMixins(Iterable<? extends Mixin> iterable) {
        ensureMixinsIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.mixins_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOptions(Iterable<? extends Option> iterable) {
        ensureOptionsIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMethods(Method method) {
        method.getClass();
        ensureMethodsIsMutable();
        this.methods_.add(method);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMixins(Mixin mixin) {
        mixin.getClass();
        ensureMixinsIsMutable();
        this.mixins_.add(mixin);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(option);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMethods() {
        this.methods_ = AbstractC12133Z.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMixins() {
        this.mixins_ = AbstractC12133Z.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptions() {
        this.options_ = AbstractC12133Z.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSourceContext() {
        this.sourceContext_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSyntax() {
        this.syntax_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = getDefaultInstance().getVersion();
    }

    private void ensureMethodsIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.methods_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.methods_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    private void ensureMixinsIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.mixins_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.mixins_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    private void ensureOptionsIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.options_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.options_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    public static Api getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSourceContext(SourceContext sourceContext) {
        sourceContext.getClass();
        SourceContext sourceContext2 = this.sourceContext_;
        if (sourceContext2 == null || sourceContext2 == SourceContext.getDefaultInstance()) {
            this.sourceContext_ = sourceContext;
            return;
        }
        C12152f1 c12152f1NewBuilder = SourceContext.newBuilder(this.sourceContext_);
        c12152f1NewBuilder.m13865f(sourceContext);
        this.sourceContext_ = (SourceContext) c12152f1NewBuilder.m13862c();
    }

    public static C12150f newBuilder() {
        return (C12150f) DEFAULT_INSTANCE.createBuilder();
    }

    public static Api parseDelimitedFrom(InputStream inputStream) {
        return (Api) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Api parseFrom(ByteBuffer byteBuffer) {
        return (Api) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMethods(int i10) {
        ensureMethodsIsMutable();
        this.methods_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMixins(int i10) {
        ensureMixinsIsMutable();
        this.mixins_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeOptions(int i10) {
        ensureOptionsIsMutable();
        this.options_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMethods(int i10, Method method) {
        method.getClass();
        ensureMethodsIsMutable();
        this.methods_.set(i10, method);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMixins(int i10, Mixin mixin) {
        mixin.getClass();
        ensureMixinsIsMutable();
        this.mixins_.set(i10, mixin);
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
    public void setOptions(int i10, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.set(i10, option);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceContext(SourceContext sourceContext) {
        sourceContext.getClass();
        this.sourceContext_ = sourceContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSyntax(EnumC12164j1 enumC12164j1) {
        this.syntax_ = enumC12164j1.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSyntaxValue(int i10) {
        this.syntax_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersion(String str) {
        str.getClass();
        this.version_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersionBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.version_ = abstractC12171m.m14012w();
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004Ȉ\u0005\t\u0006\u001b\u0007\f", new Object[]{"name_", "methods_", Method.class, "options_", Option.class, "version_", "sourceContext_", "mixins_", Mixin.class, "syntax_"});
            case 3:
                return new Api();
            case 4:
                return new C12150f(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (Api.class) {
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

    public Method getMethods(int i10) {
        return (Method) this.methods_.get(i10);
    }

    public int getMethodsCount() {
        return this.methods_.size();
    }

    public List<Method> getMethodsList() {
        return this.methods_;
    }

    public InterfaceC12109M0 getMethodsOrBuilder(int i10) {
        return (InterfaceC12109M0) this.methods_.get(i10);
    }

    public List<? extends InterfaceC12109M0> getMethodsOrBuilderList() {
        return this.methods_;
    }

    public Mixin getMixins(int i10) {
        return (Mixin) this.mixins_.get(i10);
    }

    public int getMixinsCount() {
        return this.mixins_.size();
    }

    public List<Mixin> getMixinsList() {
        return this.mixins_;
    }

    public InterfaceC12113O0 getMixinsOrBuilder(int i10) {
        return (InterfaceC12113O0) this.mixins_.get(i10);
    }

    public List<? extends InterfaceC12113O0> getMixinsOrBuilderList() {
        return this.mixins_;
    }

    public String getName() {
        return this.name_;
    }

    public AbstractC12171m getNameBytes() {
        return AbstractC12171m.m14011m(this.name_);
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

    public SourceContext getSourceContext() {
        SourceContext sourceContext = this.sourceContext_;
        return sourceContext == null ? SourceContext.getDefaultInstance() : sourceContext;
    }

    public EnumC12164j1 getSyntax() {
        EnumC12164j1 enumC12164j1M13998a = EnumC12164j1.m13998a(this.syntax_);
        return enumC12164j1M13998a == null ? EnumC12164j1.UNRECOGNIZED : enumC12164j1M13998a;
    }

    public int getSyntaxValue() {
        return this.syntax_;
    }

    public String getVersion() {
        return this.version_;
    }

    public AbstractC12171m getVersionBytes() {
        return AbstractC12171m.m14011m(this.version_);
    }

    public boolean hasSourceContext() {
        return this.sourceContext_ != null;
    }

    public static C12150f newBuilder(Api api) {
        return (C12150f) DEFAULT_INSTANCE.createBuilder(api);
    }

    public static Api parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (Api) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static Api parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (Api) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static Api parseFrom(AbstractC12171m abstractC12171m) {
        return (Api) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMethods(int i10, Method method) {
        method.getClass();
        ensureMethodsIsMutable();
        this.methods_.add(i10, method);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMixins(int i10, Mixin mixin) {
        mixin.getClass();
        ensureMixinsIsMutable();
        this.mixins_.add(i10, mixin);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(int i10, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(i10, option);
    }

    public static Api parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (Api) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static Api parseFrom(byte[] bArr) {
        return (Api) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Api parseFrom(byte[] bArr, C12087F c12087f) {
        return (Api) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static Api parseFrom(InputStream inputStream) {
        return (Api) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Api parseFrom(InputStream inputStream, C12087F c12087f) {
        return (Api) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static Api parseFrom(AbstractC12186r abstractC12186r) {
        return (Api) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static Api parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (Api) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
