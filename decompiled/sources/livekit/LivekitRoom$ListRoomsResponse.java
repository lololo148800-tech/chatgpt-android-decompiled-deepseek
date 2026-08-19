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
import p793ho.C14810p3;
import p793ho.InterfaceC14585G2;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitRoom$ListRoomsResponse extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitRoom$ListRoomsResponse DEFAULT_INSTANCE;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int ROOMS_FIELD_NUMBER = 1;
    private InterfaceC12172m0 rooms_ = AbstractC12133Z.emptyProtobufList();

    static {
        LivekitRoom$ListRoomsResponse livekitRoom$ListRoomsResponse = new LivekitRoom$ListRoomsResponse();
        DEFAULT_INSTANCE = livekitRoom$ListRoomsResponse;
        AbstractC12133Z.registerDefaultInstance(LivekitRoom$ListRoomsResponse.class, livekitRoom$ListRoomsResponse);
    }

    private LivekitRoom$ListRoomsResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRooms(Iterable<? extends LivekitModels$Room> iterable) {
        ensureRoomsIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.rooms_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRooms(LivekitModels$Room livekitModels$Room) {
        livekitModels$Room.getClass();
        ensureRoomsIsMutable();
        this.rooms_.add(livekitModels$Room);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRooms() {
        this.rooms_ = AbstractC12133Z.emptyProtobufList();
    }

    private void ensureRoomsIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.rooms_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.rooms_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    public static LivekitRoom$ListRoomsResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14810p3 newBuilder() {
        return (C14810p3) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRoom$ListRoomsResponse parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRoom$ListRoomsResponse) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRoom$ListRoomsResponse parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRoom$ListRoomsResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRooms(int i10) {
        ensureRoomsIsMutable();
        this.rooms_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRooms(int i10, LivekitModels$Room livekitModels$Room) {
        livekitModels$Room.getClass();
        ensureRoomsIsMutable();
        this.rooms_.set(i10, livekitModels$Room);
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"rooms_", LivekitModels$Room.class});
            case 3:
                return new LivekitRoom$ListRoomsResponse();
            case 4:
                return new C14810p3(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitRoom$ListRoomsResponse.class) {
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

    public LivekitModels$Room getRooms(int i10) {
        return (LivekitModels$Room) this.rooms_.get(i10);
    }

    public int getRoomsCount() {
        return this.rooms_.size();
    }

    public List<LivekitModels$Room> getRoomsList() {
        return this.rooms_;
    }

    public InterfaceC14585G2 getRoomsOrBuilder(int i10) {
        return (InterfaceC14585G2) this.rooms_.get(i10);
    }

    public List<? extends InterfaceC14585G2> getRoomsOrBuilderList() {
        return this.rooms_;
    }

    public static C14810p3 newBuilder(LivekitRoom$ListRoomsResponse livekitRoom$ListRoomsResponse) {
        return (C14810p3) DEFAULT_INSTANCE.createBuilder(livekitRoom$ListRoomsResponse);
    }

    public static LivekitRoom$ListRoomsResponse parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRoom$ListRoomsResponse) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRoom$ListRoomsResponse parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitRoom$ListRoomsResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitRoom$ListRoomsResponse parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitRoom$ListRoomsResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRooms(int i10, LivekitModels$Room livekitModels$Room) {
        livekitModels$Room.getClass();
        ensureRoomsIsMutable();
        this.rooms_.add(i10, livekitModels$Room);
    }

    public static LivekitRoom$ListRoomsResponse parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitRoom$ListRoomsResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitRoom$ListRoomsResponse parseFrom(byte[] bArr) {
        return (LivekitRoom$ListRoomsResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRoom$ListRoomsResponse parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitRoom$ListRoomsResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitRoom$ListRoomsResponse parseFrom(InputStream inputStream) {
        return (LivekitRoom$ListRoomsResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRoom$ListRoomsResponse parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRoom$ListRoomsResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRoom$ListRoomsResponse parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitRoom$ListRoomsResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitRoom$ListRoomsResponse parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitRoom$ListRoomsResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
