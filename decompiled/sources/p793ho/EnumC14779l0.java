package p793ho;

import com.google.protobuf.InterfaceC12151f0;

/* JADX INFO: renamed from: ho.l0 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC14779l0 implements InterfaceC12151f0 {
    EGRESS_STARTING(0),
    EGRESS_ACTIVE(1),
    EGRESS_ENDING(2),
    EGRESS_COMPLETE(3),
    EGRESS_FAILED(4),
    EGRESS_ABORTED(5),
    EGRESS_LIMIT_REACHED(6),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: Y */
    public final int f46223Y;

    EnumC14779l0(int i10) {
        this.f46223Y = i10;
    }

    @Override // com.google.protobuf.InterfaceC12151f0
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f46223Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
