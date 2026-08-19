package p468T2;

/* JADX INFO: renamed from: T2.o */
/* JADX INFO: loaded from: classes.dex */
public final class C7223o implements InterfaceC7222n {

    /* JADX INFO: renamed from: Y */
    public final int f22908Y;

    /* JADX INFO: renamed from: Z */
    public int f22909Z = -1;

    /* JADX INFO: renamed from: o0 */
    public int f22910o0 = -1;

    public C7223o(int i10) {
        this.f22908Y = i10;
    }

    @Override // p468T2.InterfaceC7222n
    /* JADX INFO: renamed from: b */
    public final boolean mo5356b(CharSequence charSequence, int i10, int i11, C7230v c7230v) {
        int i12 = this.f22908Y;
        if (i10 > i12 || i12 >= i11) {
            return i11 <= i12;
        }
        this.f22909Z = i10;
        this.f22910o0 = i11;
        return false;
    }

    @Override // p468T2.InterfaceC7222n
    /* JADX INFO: renamed from: a */
    public final Object mo5355a() {
        return this;
    }
}
