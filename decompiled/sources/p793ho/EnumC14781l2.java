package p793ho;

import com.google.protobuf.InterfaceC12151f0;

/* JADX INFO: renamed from: ho.l2 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC14781l2 implements InterfaceC12151f0 {
    NONE(0),
    GCM(1),
    CUSTOM(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: Y */
    public final int f46229Y;

    EnumC14781l2(int i10) {
        this.f46229Y = i10;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC14781l2 m16053a(int i10) {
        if (i10 == 0) {
            return NONE;
        }
        if (i10 == 1) {
            return GCM;
        }
        if (i10 != 2) {
            return null;
        }
        return CUSTOM;
    }

    @Override // com.google.protobuf.InterfaceC12151f0
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f46229Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
