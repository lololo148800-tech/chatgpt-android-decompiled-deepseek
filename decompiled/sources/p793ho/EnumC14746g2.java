package p793ho;

import com.google.protobuf.InterfaceC12151f0;

/* JADX INFO: renamed from: ho.g2 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC14746g2 implements InterfaceC12151f0 {
    RELIABLE(0),
    LOSSY(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: Y */
    public final int f46127Y;

    EnumC14746g2(int i10) {
        this.f46127Y = i10;
    }

    @Override // com.google.protobuf.InterfaceC12151f0
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f46127Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
