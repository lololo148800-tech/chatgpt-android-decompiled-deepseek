package p793ho;

import com.google.protobuf.InterfaceC12151f0;

/* JADX INFO: renamed from: ho.j */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC14764j implements InterfaceC12151f0 {
    JT_ROOM(0),
    JT_PUBLISHER(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: Y */
    public final int f46184Y;

    EnumC14764j(int i10) {
        this.f46184Y = i10;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC14764j m16051a(int i10) {
        if (i10 == 0) {
            return JT_ROOM;
        }
        if (i10 != 1) {
            return null;
        }
        return JT_PUBLISHER;
    }

    @Override // com.google.protobuf.InterfaceC12151f0
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f46184Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
