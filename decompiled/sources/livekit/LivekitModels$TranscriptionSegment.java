package livekit;

import com.google.protobuf.AbstractC12133Z;
import com.google.protobuf.AbstractC12138b;
import com.google.protobuf.AbstractC12171m;
import com.google.protobuf.AbstractC12186r;
import com.google.protobuf.C12087F;
import com.google.protobuf.C12123U;
import com.google.protobuf.EnumC12131Y;
import com.google.protobuf.InterfaceC12124U0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p793ho.C14705a3;
import p793ho.InterfaceC14712b3;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitModels$TranscriptionSegment extends AbstractC12133Z implements InterfaceC14712b3 {
    private static final LivekitModels$TranscriptionSegment DEFAULT_INSTANCE;
    public static final int END_TIME_FIELD_NUMBER = 4;
    public static final int FINAL_FIELD_NUMBER = 5;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int LANGUAGE_FIELD_NUMBER = 6;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int START_TIME_FIELD_NUMBER = 3;
    public static final int TEXT_FIELD_NUMBER = 2;
    private long endTime_;
    private boolean final_;
    private long startTime_;
    private String id_ = "";
    private String text_ = "";
    private String language_ = "";

    static {
        LivekitModels$TranscriptionSegment livekitModels$TranscriptionSegment = new LivekitModels$TranscriptionSegment();
        DEFAULT_INSTANCE = livekitModels$TranscriptionSegment;
        AbstractC12133Z.registerDefaultInstance(LivekitModels$TranscriptionSegment.class, livekitModels$TranscriptionSegment);
    }

    private LivekitModels$TranscriptionSegment() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndTime() {
        this.endTime_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFinal() {
        this.final_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLanguage() {
        this.language_ = getDefaultInstance().getLanguage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartTime() {
        this.startTime_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearText() {
        this.text_ = getDefaultInstance().getText();
    }

    public static LivekitModels$TranscriptionSegment getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14705a3 newBuilder() {
        return (C14705a3) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitModels$TranscriptionSegment parseDelimitedFrom(InputStream inputStream) {
        return (LivekitModels$TranscriptionSegment) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$TranscriptionSegment parseFrom(ByteBuffer byteBuffer) {
        return (LivekitModels$TranscriptionSegment) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndTime(long j10) {
        this.endTime_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFinal(boolean z6) {
        this.final_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        str.getClass();
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.id_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguage(String str) {
        str.getClass();
        this.language_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguageBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.language_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartTime(long j10) {
        this.startTime_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setText(String str) {
        str.getClass();
        this.text_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.text_ = abstractC12171m.m14012w();
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0003\u0004\u0003\u0005\u0007\u0006Ȉ", new Object[]{"id_", "text_", "startTime_", "endTime_", "final_", "language_"});
            case 3:
                return new LivekitModels$TranscriptionSegment();
            case 4:
                return new C14705a3(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitModels$TranscriptionSegment.class) {
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

    public long getEndTime() {
        return this.endTime_;
    }

    public boolean getFinal() {
        return this.final_;
    }

    public String getId() {
        return this.id_;
    }

    public AbstractC12171m getIdBytes() {
        return AbstractC12171m.m14011m(this.id_);
    }

    public String getLanguage() {
        return this.language_;
    }

    public AbstractC12171m getLanguageBytes() {
        return AbstractC12171m.m14011m(this.language_);
    }

    public long getStartTime() {
        return this.startTime_;
    }

    public String getText() {
        return this.text_;
    }

    public AbstractC12171m getTextBytes() {
        return AbstractC12171m.m14011m(this.text_);
    }

    public static C14705a3 newBuilder(LivekitModels$TranscriptionSegment livekitModels$TranscriptionSegment) {
        return (C14705a3) DEFAULT_INSTANCE.createBuilder(livekitModels$TranscriptionSegment);
    }

    public static LivekitModels$TranscriptionSegment parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitModels$TranscriptionSegment) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitModels$TranscriptionSegment parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitModels$TranscriptionSegment) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitModels$TranscriptionSegment parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitModels$TranscriptionSegment) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitModels$TranscriptionSegment parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitModels$TranscriptionSegment) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitModels$TranscriptionSegment parseFrom(byte[] bArr) {
        return (LivekitModels$TranscriptionSegment) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitModels$TranscriptionSegment parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitModels$TranscriptionSegment) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitModels$TranscriptionSegment parseFrom(InputStream inputStream) {
        return (LivekitModels$TranscriptionSegment) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$TranscriptionSegment parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitModels$TranscriptionSegment) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitModels$TranscriptionSegment parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitModels$TranscriptionSegment) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitModels$TranscriptionSegment parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitModels$TranscriptionSegment) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
