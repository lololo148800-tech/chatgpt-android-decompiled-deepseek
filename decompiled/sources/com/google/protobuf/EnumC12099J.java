package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.J */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC12099J implements InterfaceC12151f0 {
    CARDINALITY_UNKNOWN(0),
    CARDINALITY_OPTIONAL(1),
    CARDINALITY_REQUIRED(2),
    CARDINALITY_REPEATED(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: Y */
    public final int f36896Y;

    EnumC12099J(int i10) {
        this.f36896Y = i10;
    }

    @Override // com.google.protobuf.InterfaceC12151f0
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f36896Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
