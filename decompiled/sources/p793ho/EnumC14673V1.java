package p793ho;

import com.google.protobuf.InterfaceC12151f0;

/* JADX INFO: renamed from: ho.V1 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC14673V1 implements InterfaceC12151f0 {
    DEFAULT_AC(0),
    OPUS(1),
    AAC(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: Y */
    public final int f45971Y;

    EnumC14673V1(int i10) {
        this.f45971Y = i10;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC14673V1 m16043a(int i10) {
        if (i10 == 0) {
            return DEFAULT_AC;
        }
        if (i10 == 1) {
            return OPUS;
        }
        if (i10 != 2) {
            return null;
        }
        return AAC;
    }

    @Override // com.google.protobuf.InterfaceC12151f0
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f45971Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
