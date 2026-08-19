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
import p793ho.C14667U1;
import p793ho.InterfaceC14656S2;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitModels$ActiveSpeakerUpdate extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitModels$ActiveSpeakerUpdate DEFAULT_INSTANCE;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int SPEAKERS_FIELD_NUMBER = 1;
    private InterfaceC12172m0 speakers_ = AbstractC12133Z.emptyProtobufList();

    static {
        LivekitModels$ActiveSpeakerUpdate livekitModels$ActiveSpeakerUpdate = new LivekitModels$ActiveSpeakerUpdate();
        DEFAULT_INSTANCE = livekitModels$ActiveSpeakerUpdate;
        AbstractC12133Z.registerDefaultInstance(LivekitModels$ActiveSpeakerUpdate.class, livekitModels$ActiveSpeakerUpdate);
    }

    private LivekitModels$ActiveSpeakerUpdate() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSpeakers(Iterable<? extends LivekitModels$SpeakerInfo> iterable) {
        ensureSpeakersIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.speakers_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSpeakers(LivekitModels$SpeakerInfo livekitModels$SpeakerInfo) {
        livekitModels$SpeakerInfo.getClass();
        ensureSpeakersIsMutable();
        this.speakers_.add(livekitModels$SpeakerInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpeakers() {
        this.speakers_ = AbstractC12133Z.emptyProtobufList();
    }

    private void ensureSpeakersIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.speakers_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.speakers_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    public static LivekitModels$ActiveSpeakerUpdate getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14667U1 newBuilder() {
        return (C14667U1) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitModels$ActiveSpeakerUpdate parseDelimitedFrom(InputStream inputStream) {
        return (LivekitModels$ActiveSpeakerUpdate) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$ActiveSpeakerUpdate parseFrom(ByteBuffer byteBuffer) {
        return (LivekitModels$ActiveSpeakerUpdate) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSpeakers(int i10) {
        ensureSpeakersIsMutable();
        this.speakers_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpeakers(int i10, LivekitModels$SpeakerInfo livekitModels$SpeakerInfo) {
        livekitModels$SpeakerInfo.getClass();
        ensureSpeakersIsMutable();
        this.speakers_.set(i10, livekitModels$SpeakerInfo);
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"speakers_", LivekitModels$SpeakerInfo.class});
            case 3:
                return new LivekitModels$ActiveSpeakerUpdate();
            case 4:
                return new C14667U1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitModels$ActiveSpeakerUpdate.class) {
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

    public LivekitModels$SpeakerInfo getSpeakers(int i10) {
        return (LivekitModels$SpeakerInfo) this.speakers_.get(i10);
    }

    public int getSpeakersCount() {
        return this.speakers_.size();
    }

    public List<LivekitModels$SpeakerInfo> getSpeakersList() {
        return this.speakers_;
    }

    public InterfaceC14656S2 getSpeakersOrBuilder(int i10) {
        return (InterfaceC14656S2) this.speakers_.get(i10);
    }

    public List<? extends InterfaceC14656S2> getSpeakersOrBuilderList() {
        return this.speakers_;
    }

    public static C14667U1 newBuilder(LivekitModels$ActiveSpeakerUpdate livekitModels$ActiveSpeakerUpdate) {
        return (C14667U1) DEFAULT_INSTANCE.createBuilder(livekitModels$ActiveSpeakerUpdate);
    }

    public static LivekitModels$ActiveSpeakerUpdate parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitModels$ActiveSpeakerUpdate) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitModels$ActiveSpeakerUpdate parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitModels$ActiveSpeakerUpdate) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitModels$ActiveSpeakerUpdate parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitModels$ActiveSpeakerUpdate) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSpeakers(int i10, LivekitModels$SpeakerInfo livekitModels$SpeakerInfo) {
        livekitModels$SpeakerInfo.getClass();
        ensureSpeakersIsMutable();
        this.speakers_.add(i10, livekitModels$SpeakerInfo);
    }

    public static LivekitModels$ActiveSpeakerUpdate parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitModels$ActiveSpeakerUpdate) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitModels$ActiveSpeakerUpdate parseFrom(byte[] bArr) {
        return (LivekitModels$ActiveSpeakerUpdate) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitModels$ActiveSpeakerUpdate parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitModels$ActiveSpeakerUpdate) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitModels$ActiveSpeakerUpdate parseFrom(InputStream inputStream) {
        return (LivekitModels$ActiveSpeakerUpdate) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$ActiveSpeakerUpdate parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitModels$ActiveSpeakerUpdate) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitModels$ActiveSpeakerUpdate parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitModels$ActiveSpeakerUpdate) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitModels$ActiveSpeakerUpdate parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitModels$ActiveSpeakerUpdate) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
