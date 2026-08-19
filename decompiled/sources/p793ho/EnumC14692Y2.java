package p793ho;

import com.google.protobuf.InterfaceC12151f0;

/* JADX INFO: renamed from: ho.Y2 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC14692Y2 implements InterfaceC12151f0 {
    AUDIO(0),
    VIDEO(1),
    DATA(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: Y */
    public final int f46005Y;

    EnumC14692Y2(int i10) {
        this.f46005Y = i10;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC14692Y2 m16047a(int i10) {
        if (i10 == 0) {
            return AUDIO;
        }
        if (i10 == 1) {
            return VIDEO;
        }
        if (i10 != 2) {
            return null;
        }
        return DATA;
    }

    @Override // com.google.protobuf.InterfaceC12151f0
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f46005Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
