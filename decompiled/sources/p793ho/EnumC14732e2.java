package p793ho;

import com.google.protobuf.InterfaceC12151f0;

/* JADX INFO: renamed from: ho.e2 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC14732e2 implements InterfaceC12151f0 {
    POOR(0),
    GOOD(1),
    EXCELLENT(2),
    LOST(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: Y */
    public final int f46084Y;

    EnumC14732e2(int i10) {
        this.f46084Y = i10;
    }

    @Override // com.google.protobuf.InterfaceC12151f0
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f46084Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
