package p793ho;

import com.google.protobuf.InterfaceC12151f0;

/* JADX INFO: renamed from: ho.U0 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC14666U0 implements InterfaceC12151f0 {
    ACTIVE(0),
    FINISHED(1),
    FAILED(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: Y */
    public final int f45965Y;

    EnumC14666U0(int i10) {
        this.f45965Y = i10;
    }

    @Override // com.google.protobuf.InterfaceC12151f0
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f45965Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
