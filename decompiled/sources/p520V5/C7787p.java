package p520V5;

/* JADX INFO: renamed from: V5.p */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7787p implements InterfaceC7793v {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f24614a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C7794w f24615b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f24616c;

    public /* synthetic */ C7787p(C7794w c7794w, int i10, int i11) {
        this.f24614a = i11;
        this.f24615b = c7794w;
        this.f24616c = i10;
    }

    @Override // p520V5.InterfaceC7793v
    public final void run() {
        switch (this.f24614a) {
            case 0:
                this.f24615b.m8067o(this.f24616c);
                break;
            case 1:
                this.f24615b.m8070r(this.f24616c);
                break;
            default:
                this.f24615b.m8066n(this.f24616c);
                break;
        }
    }
}
