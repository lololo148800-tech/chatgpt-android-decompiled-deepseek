package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.j1 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC12164j1 implements InterfaceC12151f0 {
    SYNTAX_PROTO2(0),
    SYNTAX_PROTO3(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: Y */
    public final int f37041Y;

    EnumC12164j1(int i10) {
        this.f37041Y = i10;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC12164j1 m13998a(int i10) {
        if (i10 == 0) {
            return SYNTAX_PROTO2;
        }
        if (i10 != 1) {
            return null;
        }
        return SYNTAX_PROTO3;
    }

    @Override // com.google.protobuf.InterfaceC12151f0
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f37041Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
