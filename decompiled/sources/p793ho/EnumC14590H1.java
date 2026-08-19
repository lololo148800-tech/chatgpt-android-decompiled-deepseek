package p793ho;

import com.google.protobuf.InterfaceC12151f0;

/* JADX INFO: renamed from: ho.H1 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC14590H1 implements InterfaceC12151f0 {
    STARTING_UP(0),
    SERVING(1),
    SHUTTING_DOWN(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: Y */
    public final int f45857Y;

    EnumC14590H1(int i10) {
        this.f45857Y = i10;
    }

    @Override // com.google.protobuf.InterfaceC12151f0
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f45857Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
