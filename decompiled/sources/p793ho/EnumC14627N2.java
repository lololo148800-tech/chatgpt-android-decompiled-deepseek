package p793ho;

import com.google.protobuf.InterfaceC12151f0;

/* JADX INFO: renamed from: ho.N2 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC14627N2 implements InterfaceC12151f0 {
    Standard(0),
    Cloud(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: Y */
    public final int f45919Y;

    EnumC14627N2(int i10) {
        this.f45919Y = i10;
    }

    @Override // com.google.protobuf.InterfaceC12151f0
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f45919Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
