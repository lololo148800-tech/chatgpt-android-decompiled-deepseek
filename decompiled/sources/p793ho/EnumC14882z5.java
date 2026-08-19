package p793ho;

import com.google.protobuf.InterfaceC12151f0;

/* JADX INFO: renamed from: ho.z5 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC14882z5 implements InterfaceC12151f0 {
    SIP_TRANSPORT_AUTO(0),
    SIP_TRANSPORT_UDP(1),
    SIP_TRANSPORT_TCP(2),
    SIP_TRANSPORT_TLS(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: Y */
    public final int f46363Y;

    EnumC14882z5(int i10) {
        this.f46363Y = i10;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC14882z5 m16057a(int i10) {
        if (i10 == 0) {
            return SIP_TRANSPORT_AUTO;
        }
        if (i10 == 1) {
            return SIP_TRANSPORT_UDP;
        }
        if (i10 == 2) {
            return SIP_TRANSPORT_TCP;
        }
        if (i10 != 3) {
            return null;
        }
        return SIP_TRANSPORT_TLS;
    }

    @Override // com.google.protobuf.InterfaceC12151f0
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f46363Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
