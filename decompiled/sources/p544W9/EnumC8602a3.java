package p544W9;

/* JADX INFO: renamed from: W9.a3 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC8602a3 implements InterfaceC8604b {
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
    public final int f26436Y;

    EnumC8602a3(int i10) {
        this.f26436Y = i10;
    }

    @Override // p544W9.InterfaceC8604b
    /* JADX INFO: renamed from: a */
    public final int mo9258a() {
        return this.f26436Y;
    }
}
