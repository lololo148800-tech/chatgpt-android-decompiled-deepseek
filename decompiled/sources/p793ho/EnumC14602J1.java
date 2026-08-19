package p793ho;

import com.google.protobuf.InterfaceC12151f0;

/* JADX INFO: renamed from: ho.J1 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC14602J1 implements InterfaceC12151f0 {
    SERVER(0),
    CONTROLLER(1),
    MEDIA(2),
    TURN(4),
    SWEEPER(5),
    DIRECTOR(6),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: Y */
    public final int f45903Y;

    EnumC14602J1(int i10) {
        this.f45903Y = i10;
    }

    @Override // com.google.protobuf.InterfaceC12151f0
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f45903Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
