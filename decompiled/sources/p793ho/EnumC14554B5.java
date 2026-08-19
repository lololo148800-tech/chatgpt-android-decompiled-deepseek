package p793ho;

import com.google.protobuf.InterfaceC12151f0;

/* JADX INFO: renamed from: ho.B5 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC14554B5 implements InterfaceC12151f0 {
    TRUNK_LEGACY(0),
    TRUNK_INBOUND(1),
    TRUNK_OUTBOUND(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: Y */
    public final int f45822Y;

    EnumC14554B5(int i10) {
        this.f45822Y = i10;
    }

    @Override // com.google.protobuf.InterfaceC12151f0
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f45822Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
