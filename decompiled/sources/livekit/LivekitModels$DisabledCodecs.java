package livekit;

import com.google.protobuf.AbstractC12133Z;
import com.google.protobuf.AbstractC12138b;
import com.google.protobuf.AbstractC12141c;
import com.google.protobuf.AbstractC12171m;
import com.google.protobuf.AbstractC12186r;
import com.google.protobuf.C12087F;
import com.google.protobuf.C12123U;
import com.google.protobuf.EnumC12131Y;
import com.google.protobuf.InterfaceC12094H0;
import com.google.protobuf.InterfaceC12124U0;
import com.google.protobuf.InterfaceC12172m0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p793ho.C14760i2;
import p793ho.InterfaceC14725d2;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitModels$DisabledCodecs extends AbstractC12133Z implements InterfaceC12094H0 {
    public static final int CODECS_FIELD_NUMBER = 1;
    private static final LivekitModels$DisabledCodecs DEFAULT_INSTANCE;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int PUBLISH_FIELD_NUMBER = 2;
    private InterfaceC12172m0 codecs_ = AbstractC12133Z.emptyProtobufList();
    private InterfaceC12172m0 publish_ = AbstractC12133Z.emptyProtobufList();

    static {
        LivekitModels$DisabledCodecs livekitModels$DisabledCodecs = new LivekitModels$DisabledCodecs();
        DEFAULT_INSTANCE = livekitModels$DisabledCodecs;
        AbstractC12133Z.registerDefaultInstance(LivekitModels$DisabledCodecs.class, livekitModels$DisabledCodecs);
    }

    private LivekitModels$DisabledCodecs() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCodecs(Iterable<? extends LivekitModels$Codec> iterable) {
        ensureCodecsIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.codecs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPublish(Iterable<? extends LivekitModels$Codec> iterable) {
        ensurePublishIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.publish_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCodecs(LivekitModels$Codec livekitModels$Codec) {
        livekitModels$Codec.getClass();
        ensureCodecsIsMutable();
        this.codecs_.add(livekitModels$Codec);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPublish(LivekitModels$Codec livekitModels$Codec) {
        livekitModels$Codec.getClass();
        ensurePublishIsMutable();
        this.publish_.add(livekitModels$Codec);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCodecs() {
        this.codecs_ = AbstractC12133Z.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPublish() {
        this.publish_ = AbstractC12133Z.emptyProtobufList();
    }

    private void ensureCodecsIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.codecs_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.codecs_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    private void ensurePublishIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.publish_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.publish_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    public static LivekitModels$DisabledCodecs getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14760i2 newBuilder() {
        return (C14760i2) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitModels$DisabledCodecs parseDelimitedFrom(InputStream inputStream) {
        return (LivekitModels$DisabledCodecs) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$DisabledCodecs parseFrom(ByteBuffer byteBuffer) {
        return (LivekitModels$DisabledCodecs) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeCodecs(int i10) {
        ensureCodecsIsMutable();
        this.codecs_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePublish(int i10) {
        ensurePublishIsMutable();
        this.publish_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCodecs(int i10, LivekitModels$Codec livekitModels$Codec) {
        livekitModels$Codec.getClass();
        ensureCodecsIsMutable();
        this.codecs_.set(i10, livekitModels$Codec);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPublish(int i10, LivekitModels$Codec livekitModels$Codec) {
        livekitModels$Codec.getClass();
        ensurePublishIsMutable();
        this.publish_.set(i10, livekitModels$Codec);
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"codecs_", LivekitModels$Codec.class, "publish_", LivekitModels$Codec.class});
            case 3:
                return new LivekitModels$DisabledCodecs();
            case 4:
                return new C14760i2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitModels$DisabledCodecs.class) {
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

    public LivekitModels$Codec getCodecs(int i10) {
        return (LivekitModels$Codec) this.codecs_.get(i10);
    }

    public int getCodecsCount() {
        return this.codecs_.size();
    }

    public List<LivekitModels$Codec> getCodecsList() {
        return this.codecs_;
    }

    public InterfaceC14725d2 getCodecsOrBuilder(int i10) {
        return (InterfaceC14725d2) this.codecs_.get(i10);
    }

    public List<? extends InterfaceC14725d2> getCodecsOrBuilderList() {
        return this.codecs_;
    }

    public LivekitModels$Codec getPublish(int i10) {
        return (LivekitModels$Codec) this.publish_.get(i10);
    }

    public int getPublishCount() {
        return this.publish_.size();
    }

    public List<LivekitModels$Codec> getPublishList() {
        return this.publish_;
    }

    public InterfaceC14725d2 getPublishOrBuilder(int i10) {
        return (InterfaceC14725d2) this.publish_.get(i10);
    }

    public List<? extends InterfaceC14725d2> getPublishOrBuilderList() {
        return this.publish_;
    }

    public static C14760i2 newBuilder(LivekitModels$DisabledCodecs livekitModels$DisabledCodecs) {
        return (C14760i2) DEFAULT_INSTANCE.createBuilder(livekitModels$DisabledCodecs);
    }

    public static LivekitModels$DisabledCodecs parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitModels$DisabledCodecs) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitModels$DisabledCodecs parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitModels$DisabledCodecs) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitModels$DisabledCodecs parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitModels$DisabledCodecs) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCodecs(int i10, LivekitModels$Codec livekitModels$Codec) {
        livekitModels$Codec.getClass();
        ensureCodecsIsMutable();
        this.codecs_.add(i10, livekitModels$Codec);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPublish(int i10, LivekitModels$Codec livekitModels$Codec) {
        livekitModels$Codec.getClass();
        ensurePublishIsMutable();
        this.publish_.add(i10, livekitModels$Codec);
    }

    public static LivekitModels$DisabledCodecs parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitModels$DisabledCodecs) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitModels$DisabledCodecs parseFrom(byte[] bArr) {
        return (LivekitModels$DisabledCodecs) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitModels$DisabledCodecs parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitModels$DisabledCodecs) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitModels$DisabledCodecs parseFrom(InputStream inputStream) {
        return (LivekitModels$DisabledCodecs) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$DisabledCodecs parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitModels$DisabledCodecs) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitModels$DisabledCodecs parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitModels$DisabledCodecs) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitModels$DisabledCodecs parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitModels$DisabledCodecs) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
