package p793ho;

import com.google.protobuf.InterfaceC12151f0;

/* JADX INFO: renamed from: ho.W1 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC14679W1 implements InterfaceC12151f0 {
    TF_STEREO(0),
    TF_NO_DTX(1),
    TF_AUTO_GAIN_CONTROL(2),
    TF_ECHO_CANCELLATION(3),
    TF_NOISE_SUPPRESSION(4),
    TF_ENHANCED_NOISE_CANCELLATION(5),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: Y */
    public final int f45980Y;

    EnumC14679W1(int i10) {
        this.f45980Y = i10;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC14679W1 m16044a(int i10) {
        if (i10 == 0) {
            return TF_STEREO;
        }
        if (i10 == 1) {
            return TF_NO_DTX;
        }
        if (i10 == 2) {
            return TF_AUTO_GAIN_CONTROL;
        }
        if (i10 == 3) {
            return TF_ECHO_CANCELLATION;
        }
        if (i10 == 4) {
            return TF_NOISE_SUPPRESSION;
        }
        if (i10 != 5) {
            return null;
        }
        return TF_ENHANCED_NOISE_CANCELLATION;
    }

    @Override // com.google.protobuf.InterfaceC12151f0
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f45980Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
