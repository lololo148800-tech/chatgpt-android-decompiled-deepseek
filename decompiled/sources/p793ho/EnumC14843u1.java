package p793ho;

import com.google.protobuf.InterfaceC12151f0;

/* JADX INFO: renamed from: ho.u1 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC14843u1 implements InterfaceC12151f0 {
    ENDPOINT_INACTIVE(0),
    ENDPOINT_BUFFERING(1),
    ENDPOINT_PUBLISHING(2),
    ENDPOINT_ERROR(3),
    ENDPOINT_COMPLETE(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: Y */
    public final int f46320Y;

    EnumC14843u1(int i10) {
        this.f46320Y = i10;
    }

    @Override // com.google.protobuf.InterfaceC12151f0
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f46320Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
