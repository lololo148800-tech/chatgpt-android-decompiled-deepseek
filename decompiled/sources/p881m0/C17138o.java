package p881m0;

/* JADX INFO: renamed from: m0.o */
/* JADX INFO: loaded from: classes.dex */
public final class C17138o implements InterfaceC17139p {

    /* JADX INFO: renamed from: Z */
    public static final C17138o f54800Z = new C17138o(0);

    /* JADX INFO: renamed from: o0 */
    public static final C17138o f54801o0 = new C17138o(1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f54802Y;

    public /* synthetic */ C17138o(int i10) {
        this.f54802Y = i10;
    }

    @Override // p881m0.InterfaceC17139p
    /* JADX INFO: renamed from: a */
    public final int mo18903a(int i10, int i11, int i12, int i13, int i14, int i15) {
        switch (this.f54802Y) {
            case 0:
                return (((i10 - i12) - i13) / 2) - (i11 / 2);
            default:
                return 0;
        }
    }

    public final String toString() {
        switch (this.f54802Y) {
            case 0:
                return "Center";
            default:
                return "Start";
        }
    }
}
