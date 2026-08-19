package p523V9;

/* JADX INFO: renamed from: V9.v4 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC8214v4 implements InterfaceC7968Q {
    UNKNOWN_FORMAT(0),
    NV16(1),
    NV21(2),
    YV12(3),
    YUV_420_888(7),
    /* JADX INFO: Fake field, exist only in values array */
    JPEG(8),
    BITMAP(4),
    /* JADX INFO: Fake field, exist only in values array */
    CM_SAMPLE_BUFFER_REF(5),
    /* JADX INFO: Fake field, exist only in values array */
    UI_IMAGE(6),
    /* JADX INFO: Fake field, exist only in values array */
    CV_PIXEL_BUFFER_REF(9);


    /* JADX INFO: renamed from: Y */
    public final int f25668Y;

    EnumC8214v4(int i10) {
        this.f25668Y = i10;
    }

    @Override // p523V9.InterfaceC7968Q
    /* JADX INFO: renamed from: a */
    public final int mo8189a() {
        return this.f25668Y;
    }
}
