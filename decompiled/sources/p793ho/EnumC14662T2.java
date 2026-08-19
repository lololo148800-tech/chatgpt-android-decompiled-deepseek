package p793ho;

import com.google.protobuf.InterfaceC12151f0;

/* JADX INFO: renamed from: ho.T2 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC14662T2 implements InterfaceC12151f0 {
    SE_UNKNOWN(0),
    SE_CODEC_UNSUPPORTED(1),
    SE_TRACK_NOTFOUND(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: Y */
    public final int f45959Y;

    EnumC14662T2(int i10) {
        this.f45959Y = i10;
    }

    @Override // com.google.protobuf.InterfaceC12151f0
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f45959Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
