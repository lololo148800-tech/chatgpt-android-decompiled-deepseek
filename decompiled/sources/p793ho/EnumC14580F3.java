package p793ho;

import com.google.protobuf.InterfaceC12151f0;

/* JADX INFO: renamed from: ho.F3 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC14580F3 implements InterfaceC12151f0 {
    UDP(0),
    TCP(1),
    TLS(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: Y */
    public final int f45847Y;

    EnumC14580F3(int i10) {
        this.f45847Y = i10;
    }

    @Override // com.google.protobuf.InterfaceC12151f0
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f45847Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
