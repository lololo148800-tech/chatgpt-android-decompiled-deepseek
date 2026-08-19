package p793ho;

import com.google.protobuf.InterfaceC12151f0;

/* JADX INFO: renamed from: ho.m2 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC14788m2 implements InterfaceC12151f0 {
    IC_DEFAULT(0),
    f46231o0(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: Y */
    public final int f46234Y;

    EnumC14788m2(int i10) {
        this.f46234Y = i10;
    }

    @Override // com.google.protobuf.InterfaceC12151f0
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f46234Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
