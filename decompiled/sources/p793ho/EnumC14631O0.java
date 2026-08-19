package p793ho;

import com.google.protobuf.InterfaceC12151f0;

/* JADX INFO: renamed from: ho.O0 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC14631O0 implements InterfaceC12151f0 {
    DEFAULT_SEGMENTED_FILE_PROTOCOL(0),
    HLS_PROTOCOL(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: Y */
    public final int f45925Y;

    EnumC14631O0(int i10) {
        this.f45925Y = i10;
    }

    @Override // com.google.protobuf.InterfaceC12151f0
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f45925Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
