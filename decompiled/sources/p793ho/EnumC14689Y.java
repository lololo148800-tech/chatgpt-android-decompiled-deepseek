package p793ho;

import com.google.protobuf.InterfaceC12151f0;

/* JADX INFO: renamed from: ho.Y */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC14689Y implements InterfaceC12151f0 {
    UPSTREAM(0),
    DOWNSTREAM(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: Y */
    public final int f45993Y;

    EnumC14689Y(int i10) {
        this.f45993Y = i10;
    }

    @Override // com.google.protobuf.InterfaceC12151f0
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f45993Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
