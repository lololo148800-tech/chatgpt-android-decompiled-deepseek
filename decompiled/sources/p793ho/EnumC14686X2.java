package p793ho;

import com.google.protobuf.InterfaceC12151f0;

/* JADX INFO: renamed from: ho.X2 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC14686X2 implements InterfaceC12151f0 {
    UNKNOWN(0),
    CAMERA(1),
    MICROPHONE(2),
    SCREEN_SHARE(3),
    SCREEN_SHARE_AUDIO(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: Y */
    public final int f45988Y;

    EnumC14686X2(int i10) {
        this.f45988Y = i10;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC14686X2 m16045a(int i10) {
        if (i10 == 0) {
            return UNKNOWN;
        }
        if (i10 == 1) {
            return CAMERA;
        }
        if (i10 == 2) {
            return MICROPHONE;
        }
        if (i10 == 3) {
            return SCREEN_SHARE;
        }
        if (i10 != 4) {
            return null;
        }
        return SCREEN_SHARE_AUDIO;
    }

    @Override // com.google.protobuf.InterfaceC12151f0
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f45988Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
