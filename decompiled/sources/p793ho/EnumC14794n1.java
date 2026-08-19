package p793ho;

import com.google.protobuf.InterfaceC12151f0;

/* JADX INFO: renamed from: ho.n1 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC14794n1 implements InterfaceC12151f0 {
    OPUS_STEREO_96KBPS(0),
    OPUS_MONO_64KBS(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: Y */
    public final int f46250Y;

    EnumC14794n1(int i10) {
        this.f46250Y = i10;
    }

    @Override // com.google.protobuf.InterfaceC12151f0
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f46250Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
