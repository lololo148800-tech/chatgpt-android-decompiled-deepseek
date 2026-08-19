package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.R0 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC12118R0 implements InterfaceC12151f0 {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: Y */
    public final int f36977Y;

    EnumC12118R0(int i10) {
        this.f36977Y = i10;
    }

    @Override // com.google.protobuf.InterfaceC12151f0
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f36977Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
