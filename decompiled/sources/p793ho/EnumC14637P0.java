package p793ho;

import com.google.protobuf.InterfaceC12151f0;

/* JADX INFO: renamed from: ho.P0 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC14637P0 implements InterfaceC12151f0 {
    INDEX(0),
    TIMESTAMP(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: Y */
    public final int f45952Y;

    EnumC14637P0(int i10) {
        this.f45952Y = i10;
    }

    @Override // com.google.protobuf.InterfaceC12151f0
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f45952Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
