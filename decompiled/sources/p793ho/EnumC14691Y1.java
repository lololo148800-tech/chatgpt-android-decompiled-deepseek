package p793ho;

import com.google.protobuf.InterfaceC12151f0;

/* JADX INFO: renamed from: ho.Y1 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC14691Y1 implements InterfaceC12151f0 {
    UNSET(0),
    DISABLED(1),
    ENABLED(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: Y */
    public final int f45999Y;

    EnumC14691Y1(int i10) {
        this.f45999Y = i10;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC14691Y1 m16046a(int i10) {
        if (i10 == 0) {
            return UNSET;
        }
        if (i10 == 1) {
            return DISABLED;
        }
        if (i10 != 2) {
            return null;
        }
        return ENABLED;
    }

    @Override // com.google.protobuf.InterfaceC12151f0
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f45999Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
