package p793ho;

import com.google.protobuf.InterfaceC12151f0;

/* JADX INFO: renamed from: ho.i3 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC14761i3 implements InterfaceC12151f0 {
    LOW(0),
    MEDIUM(1),
    HIGH(2),
    OFF(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: Y */
    public final int f46168Y;

    EnumC14761i3(int i10) {
        this.f46168Y = i10;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC14761i3 m16050a(int i10) {
        if (i10 == 0) {
            return LOW;
        }
        if (i10 == 1) {
            return MEDIUM;
        }
        if (i10 == 2) {
            return HIGH;
        }
        if (i10 != 3) {
            return null;
        }
        return OFF;
    }

    @Override // com.google.protobuf.InterfaceC12151f0
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f46168Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
