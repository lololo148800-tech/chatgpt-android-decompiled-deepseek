package livekit;

import com.google.protobuf.AbstractC12133Z;
import com.google.protobuf.AbstractC12171m;
import com.google.protobuf.AbstractC12186r;
import com.google.protobuf.C12087F;
import com.google.protobuf.C12123U;
import com.google.protobuf.EnumC12131Y;
import com.google.protobuf.InterfaceC12094H0;
import com.google.protobuf.InterfaceC12124U0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p793ho.C14726d3;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitModels$VP8MungerState extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitModels$VP8MungerState DEFAULT_INSTANCE;
    public static final int EXT_LAST_PICTURE_ID_FIELD_NUMBER = 1;
    public static final int KEY_IDX_USED_FIELD_NUMBER = 7;
    public static final int LAST_KEY_IDX_FIELD_NUMBER = 6;
    public static final int LAST_TL0_PIC_IDX_FIELD_NUMBER = 3;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int PICTURE_ID_USED_FIELD_NUMBER = 2;
    public static final int TID_USED_FIELD_NUMBER = 5;
    public static final int TL0_PIC_IDX_USED_FIELD_NUMBER = 4;
    private int extLastPictureId_;
    private boolean keyIdxUsed_;
    private int lastKeyIdx_;
    private int lastTl0PicIdx_;
    private boolean pictureIdUsed_;
    private boolean tidUsed_;
    private boolean tl0PicIdxUsed_;

    static {
        LivekitModels$VP8MungerState livekitModels$VP8MungerState = new LivekitModels$VP8MungerState();
        DEFAULT_INSTANCE = livekitModels$VP8MungerState;
        AbstractC12133Z.registerDefaultInstance(LivekitModels$VP8MungerState.class, livekitModels$VP8MungerState);
    }

    private LivekitModels$VP8MungerState() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtLastPictureId() {
        this.extLastPictureId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKeyIdxUsed() {
        this.keyIdxUsed_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastKeyIdx() {
        this.lastKeyIdx_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastTl0PicIdx() {
        this.lastTl0PicIdx_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPictureIdUsed() {
        this.pictureIdUsed_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTidUsed() {
        this.tidUsed_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTl0PicIdxUsed() {
        this.tl0PicIdxUsed_ = false;
    }

    public static LivekitModels$VP8MungerState getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14726d3 newBuilder() {
        return (C14726d3) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitModels$VP8MungerState parseDelimitedFrom(InputStream inputStream) {
        return (LivekitModels$VP8MungerState) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$VP8MungerState parseFrom(ByteBuffer byteBuffer) {
        return (LivekitModels$VP8MungerState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtLastPictureId(int i10) {
        this.extLastPictureId_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyIdxUsed(boolean z6) {
        this.keyIdxUsed_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastKeyIdx(int i10) {
        this.lastKeyIdx_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastTl0PicIdx(int i10) {
        this.lastTl0PicIdx_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPictureIdUsed(boolean z6) {
        this.pictureIdUsed_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTidUsed(boolean z6) {
        this.tidUsed_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTl0PicIdxUsed(boolean z6) {
        this.tl0PicIdxUsed_ = z6;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0002\u0007\u0003\u000b\u0004\u0007\u0005\u0007\u0006\u000b\u0007\u0007", new Object[]{"extLastPictureId_", "pictureIdUsed_", "lastTl0PicIdx_", "tl0PicIdxUsed_", "tidUsed_", "lastKeyIdx_", "keyIdxUsed_"});
            case 3:
                return new LivekitModels$VP8MungerState();
            case 4:
                return new C14726d3(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitModels$VP8MungerState.class) {
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

    public int getExtLastPictureId() {
        return this.extLastPictureId_;
    }

    public boolean getKeyIdxUsed() {
        return this.keyIdxUsed_;
    }

    public int getLastKeyIdx() {
        return this.lastKeyIdx_;
    }

    public int getLastTl0PicIdx() {
        return this.lastTl0PicIdx_;
    }

    public boolean getPictureIdUsed() {
        return this.pictureIdUsed_;
    }

    public boolean getTidUsed() {
        return this.tidUsed_;
    }

    public boolean getTl0PicIdxUsed() {
        return this.tl0PicIdxUsed_;
    }

    public static C14726d3 newBuilder(LivekitModels$VP8MungerState livekitModels$VP8MungerState) {
        return (C14726d3) DEFAULT_INSTANCE.createBuilder(livekitModels$VP8MungerState);
    }

    public static LivekitModels$VP8MungerState parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitModels$VP8MungerState) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitModels$VP8MungerState parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitModels$VP8MungerState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitModels$VP8MungerState parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitModels$VP8MungerState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitModels$VP8MungerState parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitModels$VP8MungerState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitModels$VP8MungerState parseFrom(byte[] bArr) {
        return (LivekitModels$VP8MungerState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitModels$VP8MungerState parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitModels$VP8MungerState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitModels$VP8MungerState parseFrom(InputStream inputStream) {
        return (LivekitModels$VP8MungerState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$VP8MungerState parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitModels$VP8MungerState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitModels$VP8MungerState parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitModels$VP8MungerState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitModels$VP8MungerState parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitModels$VP8MungerState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
