package p520V5;

/* JADX INFO: renamed from: V5.o */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7786o implements InterfaceC7793v {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f24611a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C7794w f24612b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f24613c;

    public /* synthetic */ C7786o(C7794w c7794w, String str, int i10) {
        this.f24611a = i10;
        this.f24612b = c7794w;
        this.f24613c = str;
    }

    @Override // p520V5.InterfaceC7793v
    public final void run() {
        switch (this.f24611a) {
            case 0:
                this.f24612b.m8069q(this.f24613c);
                break;
            case 1:
                this.f24612b.m8068p(this.f24613c);
                break;
            default:
                this.f24612b.m8071s(this.f24613c);
                break;
        }
    }
}
