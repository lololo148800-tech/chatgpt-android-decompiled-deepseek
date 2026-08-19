package p793ho;

import com.google.protobuf.InterfaceC12151f0;

/* JADX INFO: renamed from: ho.p0 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC14807p0 implements InterfaceC12151f0 {
    DEFAULT_FILETYPE(0),
    MP4(1),
    OGG(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: Y */
    public final int f46265Y;

    EnumC14807p0(int i10) {
        this.f46265Y = i10;
    }

    @Override // com.google.protobuf.InterfaceC12151f0
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f46265Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
