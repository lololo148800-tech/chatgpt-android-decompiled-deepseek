package p523V9;

/* JADX INFO: renamed from: V9.R4 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC7980R4 implements InterfaceC7968Q {
    FORMAT_UNKNOWN(0),
    FORMAT_CODE_128(1),
    FORMAT_CODE_39(2),
    FORMAT_CODE_93(4),
    FORMAT_CODABAR(8),
    FORMAT_DATA_MATRIX(16),
    FORMAT_EAN_13(32),
    FORMAT_EAN_8(64),
    FORMAT_ITF(128),
    FORMAT_QR_CODE(256),
    FORMAT_UPC_A(512),
    FORMAT_UPC_E(1024),
    FORMAT_PDF417(2048),
    FORMAT_AZTEC(4096);


    /* JADX INFO: renamed from: Y */
    public final int f25245Y;

    EnumC7980R4(int i10) {
        this.f25245Y = i10;
    }

    @Override // p523V9.InterfaceC7968Q
    /* JADX INFO: renamed from: a */
    public final int mo8189a() {
        return this.f25245Y;
    }
}
