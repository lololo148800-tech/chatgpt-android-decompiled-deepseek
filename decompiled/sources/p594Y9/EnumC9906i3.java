package p594Y9;

/* JADX INFO: renamed from: Y9.i3 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC9906i3 implements InterfaceC9723F {
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
    public final int f29429Y;

    EnumC9906i3(int i10) {
        this.f29429Y = i10;
    }

    @Override // p594Y9.InterfaceC9723F
    /* JADX INFO: renamed from: a */
    public final int mo10315a() {
        return this.f29429Y;
    }
}
