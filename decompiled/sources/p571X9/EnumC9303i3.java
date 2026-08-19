package p571X9;

/* JADX INFO: renamed from: X9.i3 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC9303i3 implements InterfaceC9102B {
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
    public final int f28105Y;

    EnumC9303i3(int i10) {
        this.f28105Y = i10;
    }

    @Override // p571X9.InterfaceC9102B
    /* JADX INFO: renamed from: a */
    public final int mo9634a() {
        return this.f28105Y;
    }
}
