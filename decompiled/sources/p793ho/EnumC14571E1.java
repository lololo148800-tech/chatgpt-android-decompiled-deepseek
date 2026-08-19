package p793ho;

import com.google.protobuf.InterfaceC12151f0;

/* JADX INFO: renamed from: ho.E1 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC14571E1 implements InterfaceC12151f0 {
    ICT_NONE(0),
    ICT_TCP(1),
    ICT_TLS(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: Y */
    public final int f45833Y;

    EnumC14571E1(int i10) {
        this.f45833Y = i10;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC14571E1 m16041a(int i10) {
        if (i10 == 0) {
            return ICT_NONE;
        }
        if (i10 == 1) {
            return ICT_TCP;
        }
        if (i10 != 2) {
            return null;
        }
        return ICT_TLS;
    }

    @Override // com.google.protobuf.InterfaceC12151f0
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f45833Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
