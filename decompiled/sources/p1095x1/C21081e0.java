package p1095x1;

/* JADX INFO: renamed from: x1.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C21081e0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC21087h0 f67001a;

    /* JADX INFO: renamed from: b */
    public C21053G f67002b;

    /* JADX INFO: renamed from: c */
    public final C21079d0 f67003c = new C21079d0(this, 2);

    /* JADX INFO: renamed from: d */
    public final C21079d0 f67004d = new C21079d0(this, 0);

    /* JADX INFO: renamed from: e */
    public final C21079d0 f67005e = new C21079d0(this, 1);

    public C21081e0(InterfaceC21087h0 interfaceC21087h0) {
        this.f67001a = interfaceC21087h0;
    }

    /* JADX INFO: renamed from: a */
    public final C21053G m21572a() {
        C21053G c21053g = this.f67002b;
        if (c21053g != null) {
            return c21053g;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }
}
