package p793ho;

import com.google.protobuf.InterfaceC12151f0;

/* JADX INFO: renamed from: ho.e3 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC14733e3 implements InterfaceC12151f0 {
    DEFAULT_VC(0),
    H264_BASELINE(1),
    H264_MAIN(2),
    H264_HIGH(3),
    VP8(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: Y */
    public final int f46092Y;

    EnumC14733e3(int i10) {
        this.f46092Y = i10;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC14733e3 m16048a(int i10) {
        if (i10 == 0) {
            return DEFAULT_VC;
        }
        if (i10 == 1) {
            return H264_BASELINE;
        }
        if (i10 == 2) {
            return H264_MAIN;
        }
        if (i10 == 3) {
            return H264_HIGH;
        }
        if (i10 != 4) {
            return null;
        }
        return VP8;
    }

    @Override // com.google.protobuf.InterfaceC12151f0
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f46092Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
