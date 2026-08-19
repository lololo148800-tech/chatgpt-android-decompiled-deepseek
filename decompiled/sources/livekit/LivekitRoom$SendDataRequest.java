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
import p793ho.C14866x3;
import p793ho.EnumC14746g2;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitRoom$SendDataRequest extends AbstractC12133Z implements InterfaceC12094H0 {
    public static final int DATA_FIELD_NUMBER = 2;
    private static final LivekitRoom$SendDataRequest DEFAULT_INSTANCE;
    public static final int DESTINATION_IDENTITIES_FIELD_NUMBER = 6;
    public static final int DESTINATION_SIDS_FIELD_NUMBER = 4;
    public static final int KIND_FIELD_NUMBER = 3;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int ROOM_FIELD_NUMBER = 1;
    public static final int TOPIC_FIELD_NUMBER = 5;
    private int bitField0_;
    private int kind_;
    private String room_ = "";
    private AbstractC12171m data_ = AbstractC12171m.f37047Z;
    private InterfaceC12172m0 destinationSids_ = AbstractC12133Z.emptyProtobufList();
    private InterfaceC12172m0 destinationIdentities_ = AbstractC12133Z.emptyProtobufList();
    private String topic_ = "";

    static {
        LivekitRoom$SendDataRequest livekitRoom$SendDataRequest = new LivekitRoom$SendDataRequest();
        DEFAULT_INSTANCE = livekitRoom$SendDataRequest;
        AbstractC12133Z.registerDefaultInstance(LivekitRoom$SendDataRequest.class, livekitRoom$SendDataRequest);
    }

    private LivekitRoom$SendDataRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDestinationIdentities(Iterable<String> iterable) {
        ensureDestinationIdentitiesIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.destinationIdentities_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDestinationSids(Iterable<String> iterable) {
        ensureDestinationSidsIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.destinationSids_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDestinationIdentities(String str) {
        str.getClass();
        ensureDestinationIdentitiesIsMutable();
        this.destinationIdentities_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDestinationIdentitiesBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        ensureDestinationIdentitiesIsMutable();
        this.destinationIdentities_.add(abstractC12171m.m14012w());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDestinationSids(String str) {
        str.getClass();
        ensureDestinationSidsIsMutable();
        this.destinationSids_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDestinationSidsBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        ensureDestinationSidsIsMutable();
        this.destinationSids_.add(abstractC12171m.m14012w());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearData() {
        this.data_ = getDefaultInstance().getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestinationIdentities() {
        this.destinationIdentities_ = AbstractC12133Z.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestinationSids() {
        this.destinationSids_ = AbstractC12133Z.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKind() {
        this.kind_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoom() {
        this.room_ = getDefaultInstance().getRoom();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTopic() {
        this.bitField0_ &= -2;
        this.topic_ = getDefaultInstance().getTopic();
    }

    private void ensureDestinationIdentitiesIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.destinationIdentities_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.destinationIdentities_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    private void ensureDestinationSidsIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.destinationSids_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.destinationSids_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    public static LivekitRoom$SendDataRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14866x3 newBuilder() {
        return (C14866x3) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRoom$SendDataRequest parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRoom$SendDataRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRoom$SendDataRequest parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRoom$SendDataRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setData(AbstractC12171m abstractC12171m) {
        abstractC12171m.getClass();
        this.data_ = abstractC12171m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestinationIdentities(int i10, String str) {
        str.getClass();
        ensureDestinationIdentitiesIsMutable();
        this.destinationIdentities_.set(i10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestinationSids(int i10, String str) {
        str.getClass();
        ensureDestinationSidsIsMutable();
        this.destinationSids_.set(i10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKind(EnumC14746g2 enumC14746g2) {
        this.kind_ = enumC14746g2.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKindValue(int i10) {
        this.kind_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoom(String str) {
        str.getClass();
        this.room_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoomBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.room_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTopic(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.topic_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTopicBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.topic_ = abstractC12171m.m14012w();
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001Ȉ\u0002\n\u0003\f\u0004Ț\u0005ለ\u0000\u0006Ț", new Object[]{"bitField0_", "room_", "data_", "kind_", "destinationSids_", "topic_", "destinationIdentities_"});
            case 3:
                return new LivekitRoom$SendDataRequest();
            case 4:
                return new C14866x3(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitRoom$SendDataRequest.class) {
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

    public AbstractC12171m getData() {
        return this.data_;
    }

    public String getDestinationIdentities(int i10) {
        return (String) this.destinationIdentities_.get(i10);
    }

    public AbstractC12171m getDestinationIdentitiesBytes(int i10) {
        return AbstractC12171m.m14011m((String) this.destinationIdentities_.get(i10));
    }

    public int getDestinationIdentitiesCount() {
        return this.destinationIdentities_.size();
    }

    public List<String> getDestinationIdentitiesList() {
        return this.destinationIdentities_;
    }

    @Deprecated
    public String getDestinationSids(int i10) {
        return (String) this.destinationSids_.get(i10);
    }

    @Deprecated
    public AbstractC12171m getDestinationSidsBytes(int i10) {
        return AbstractC12171m.m14011m((String) this.destinationSids_.get(i10));
    }

    @Deprecated
    public int getDestinationSidsCount() {
        return this.destinationSids_.size();
    }

    @Deprecated
    public List<String> getDestinationSidsList() {
        return this.destinationSids_;
    }

    public EnumC14746g2 getKind() {
        EnumC14746g2 enumC14746g2;
        int i10 = this.kind_;
        if (i10 != 0) {
            enumC14746g2 = i10 != 1 ? null : EnumC14746g2.LOSSY;
        } else {
            enumC14746g2 = EnumC14746g2.RELIABLE;
        }
        return enumC14746g2 == null ? EnumC14746g2.UNRECOGNIZED : enumC14746g2;
    }

    public int getKindValue() {
        return this.kind_;
    }

    public String getRoom() {
        return this.room_;
    }

    public AbstractC12171m getRoomBytes() {
        return AbstractC12171m.m14011m(this.room_);
    }

    public String getTopic() {
        return this.topic_;
    }

    public AbstractC12171m getTopicBytes() {
        return AbstractC12171m.m14011m(this.topic_);
    }

    public boolean hasTopic() {
        return (this.bitField0_ & 1) != 0;
    }

    public static C14866x3 newBuilder(LivekitRoom$SendDataRequest livekitRoom$SendDataRequest) {
        return (C14866x3) DEFAULT_INSTANCE.createBuilder(livekitRoom$SendDataRequest);
    }

    public static LivekitRoom$SendDataRequest parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRoom$SendDataRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRoom$SendDataRequest parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitRoom$SendDataRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitRoom$SendDataRequest parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitRoom$SendDataRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitRoom$SendDataRequest parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitRoom$SendDataRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitRoom$SendDataRequest parseFrom(byte[] bArr) {
        return (LivekitRoom$SendDataRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRoom$SendDataRequest parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitRoom$SendDataRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitRoom$SendDataRequest parseFrom(InputStream inputStream) {
        return (LivekitRoom$SendDataRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRoom$SendDataRequest parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRoom$SendDataRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRoom$SendDataRequest parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitRoom$SendDataRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitRoom$SendDataRequest parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitRoom$SendDataRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
