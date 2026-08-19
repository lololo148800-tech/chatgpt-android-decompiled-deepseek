package p793ho;

import com.google.protobuf.InterfaceC12151f0;

/* JADX INFO: renamed from: ho.s1 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC14829s1 implements InterfaceC12151f0 {
    RTMP_INPUT(0),
    WHIP_INPUT(1),
    URL_INPUT(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: Y */
    public final int f46302Y;

    EnumC14829s1(int i10) {
        this.f46302Y = i10;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC14829s1 m16056a(int i10) {
        if (i10 == 0) {
            return RTMP_INPUT;
        }
        if (i10 == 1) {
            return WHIP_INPUT;
        }
        if (i10 != 2) {
            return null;
        }
        return URL_INPUT;
    }

    @Override // com.google.protobuf.InterfaceC12151f0
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f46302Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
