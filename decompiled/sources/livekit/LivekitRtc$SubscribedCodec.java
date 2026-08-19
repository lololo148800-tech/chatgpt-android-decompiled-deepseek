package livekit;

import com.google.protobuf.AbstractC12133Z;
import com.google.protobuf.AbstractC12138b;
import com.google.protobuf.AbstractC12141c;
import com.google.protobuf.AbstractC12171m;
import com.google.protobuf.AbstractC12186r;
import com.google.protobuf.C12087F;
import com.google.protobuf.C12123U;
import com.google.protobuf.EnumC12131Y;
import com.google.protobuf.InterfaceC12124U0;
import com.google.protobuf.InterfaceC12172m0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p793ho.C14818q4;
import p793ho.InterfaceC14825r4;
import p793ho.InterfaceC14839t4;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitRtc$SubscribedCodec extends AbstractC12133Z implements InterfaceC14825r4 {
    public static final int CODEC_FIELD_NUMBER = 1;
    private static final LivekitRtc$SubscribedCodec DEFAULT_INSTANCE;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int QUALITIES_FIELD_NUMBER = 2;
    private String codec_ = "";
    private InterfaceC12172m0 qualities_ = AbstractC12133Z.emptyProtobufList();

    static {
        LivekitRtc$SubscribedCodec livekitRtc$SubscribedCodec = new LivekitRtc$SubscribedCodec();
        DEFAULT_INSTANCE = livekitRtc$SubscribedCodec;
        AbstractC12133Z.registerDefaultInstance(LivekitRtc$SubscribedCodec.class, livekitRtc$SubscribedCodec);
    }

    private LivekitRtc$SubscribedCodec() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllQualities(Iterable<? extends LivekitRtc$SubscribedQuality> iterable) {
        ensureQualitiesIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.qualities_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addQualities(LivekitRtc$SubscribedQuality livekitRtc$SubscribedQuality) {
        livekitRtc$SubscribedQuality.getClass();
        ensureQualitiesIsMutable();
        this.qualities_.add(livekitRtc$SubscribedQuality);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCodec() {
        this.codec_ = getDefaultInstance().getCodec();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQualities() {
        this.qualities_ = AbstractC12133Z.emptyProtobufList();
    }

    private void ensureQualitiesIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.qualities_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.qualities_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    public static LivekitRtc$SubscribedCodec getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14818q4 newBuilder() {
        return (C14818q4) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$SubscribedCodec parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$SubscribedCodec) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$SubscribedCodec parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$SubscribedCodec) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeQualities(int i10) {
        ensureQualitiesIsMutable();
        this.qualities_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCodec(String str) {
        str.getClass();
        this.codec_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCodecBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.codec_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQualities(int i10, LivekitRtc$SubscribedQuality livekitRtc$SubscribedQuality) {
        livekitRtc$SubscribedQuality.getClass();
        ensureQualitiesIsMutable();
        this.qualities_.set(i10, livekitRtc$SubscribedQuality);
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"codec_", "qualities_", LivekitRtc$SubscribedQuality.class});
            case 3:
                return new LivekitRtc$SubscribedCodec();
            case 4:
                return new C14818q4(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitRtc$SubscribedCodec.class) {
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

    public String getCodec() {
        return this.codec_;
    }

    public AbstractC12171m getCodecBytes() {
        return AbstractC12171m.m14011m(this.codec_);
    }

    public LivekitRtc$SubscribedQuality getQualities(int i10) {
        return (LivekitRtc$SubscribedQuality) this.qualities_.get(i10);
    }

    public int getQualitiesCount() {
        return this.qualities_.size();
    }

    public List<LivekitRtc$SubscribedQuality> getQualitiesList() {
        return this.qualities_;
    }

    public InterfaceC14839t4 getQualitiesOrBuilder(int i10) {
        return (InterfaceC14839t4) this.qualities_.get(i10);
    }

    public List<? extends InterfaceC14839t4> getQualitiesOrBuilderList() {
        return this.qualities_;
    }

    public static C14818q4 newBuilder(LivekitRtc$SubscribedCodec livekitRtc$SubscribedCodec) {
        return (C14818q4) DEFAULT_INSTANCE.createBuilder(livekitRtc$SubscribedCodec);
    }

    public static LivekitRtc$SubscribedCodec parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$SubscribedCodec) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$SubscribedCodec parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitRtc$SubscribedCodec) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitRtc$SubscribedCodec parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitRtc$SubscribedCodec) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addQualities(int i10, LivekitRtc$SubscribedQuality livekitRtc$SubscribedQuality) {
        livekitRtc$SubscribedQuality.getClass();
        ensureQualitiesIsMutable();
        this.qualities_.add(i10, livekitRtc$SubscribedQuality);
    }

    public static LivekitRtc$SubscribedCodec parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitRtc$SubscribedCodec) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitRtc$SubscribedCodec parseFrom(byte[] bArr) {
        return (LivekitRtc$SubscribedCodec) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$SubscribedCodec parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitRtc$SubscribedCodec) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitRtc$SubscribedCodec parseFrom(InputStream inputStream) {
        return (LivekitRtc$SubscribedCodec) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$SubscribedCodec parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$SubscribedCodec) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$SubscribedCodec parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitRtc$SubscribedCodec) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitRtc$SubscribedCodec parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitRtc$SubscribedCodec) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
