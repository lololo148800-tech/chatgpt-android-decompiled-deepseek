package p793ho;

import com.google.protobuf.InterfaceC12151f0;

/* JADX INFO: renamed from: ho.q2 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC14816q2 implements InterfaceC12151f0 {
    JOINING(0),
    JOINED(1),
    ACTIVE(2),
    DISCONNECTED(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: Y */
    public final int f46284Y;

    EnumC14816q2(int i10) {
        this.f46284Y = i10;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC14816q2 m16054a(int i10) {
        if (i10 == 0) {
            return JOINING;
        }
        if (i10 == 1) {
            return JOINED;
        }
        if (i10 == 2) {
            return ACTIVE;
        }
        if (i10 != 3) {
            return null;
        }
        return DISCONNECTED;
    }

    @Override // com.google.protobuf.InterfaceC12151f0
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f46284Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
