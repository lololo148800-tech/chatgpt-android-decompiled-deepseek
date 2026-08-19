package p793ho;

import com.google.protobuf.InterfaceC12151f0;

/* JADX INFO: renamed from: ho.v0 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC14849v0 implements InterfaceC12151f0 {
    IMAGE_SUFFIX_INDEX(0),
    IMAGE_SUFFIX_TIMESTAMP(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: Y */
    public final int f46325Y;

    EnumC14849v0(int i10) {
        this.f46325Y = i10;
    }

    @Override // com.google.protobuf.InterfaceC12151f0
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f46325Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
