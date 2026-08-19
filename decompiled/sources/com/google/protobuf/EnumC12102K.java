package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.K */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC12102K implements InterfaceC12151f0 {
    TYPE_UNKNOWN(0),
    TYPE_DOUBLE(1),
    TYPE_FLOAT(2),
    TYPE_INT64(3),
    TYPE_UINT64(4),
    TYPE_INT32(5),
    TYPE_FIXED64(6),
    TYPE_FIXED32(7),
    TYPE_BOOL(8),
    TYPE_STRING(9),
    TYPE_GROUP(10),
    f36943y0(11),
    TYPE_BYTES(12),
    TYPE_UINT32(13),
    TYPE_ENUM(14),
    TYPE_SFIXED32(15),
    TYPE_SFIXED64(16),
    TYPE_SINT32(17),
    TYPE_SINT64(18),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: Y */
    public final int f36945Y;

    EnumC12102K(int i10) {
        this.f36945Y = i10;
    }

    @Override // com.google.protobuf.InterfaceC12151f0
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f36945Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
