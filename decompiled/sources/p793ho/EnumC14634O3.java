package p793ho;

import com.google.protobuf.InterfaceC12151f0;

/* JADX INFO: renamed from: ho.O3 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC14634O3 implements InterfaceC12151f0 {
    DISCONNECT(0),
    RESUME(1),
    RECONNECT(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: Y */
    public final int f45947Y;

    EnumC14634O3(int i10) {
        this.f45947Y = i10;
    }

    @Override // com.google.protobuf.InterfaceC12151f0
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f45947Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
