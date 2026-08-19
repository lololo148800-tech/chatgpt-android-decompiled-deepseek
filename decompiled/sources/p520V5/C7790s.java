package p520V5;

/* JADX INFO: renamed from: V5.s */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7790s implements InterfaceC7793v {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C7794w f24624a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f24625b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f24626c;

    public /* synthetic */ C7790s(C7794w c7794w, int i10, int i11) {
        this.f24624a = c7794w;
        this.f24625b = i10;
        this.f24626c = i11;
    }

    @Override // p520V5.InterfaceC7793v
    public final void run() {
        C7794w c7794w = this.f24624a;
        C7781j c7781j = c7794w.f24658Y;
        int i10 = this.f24625b;
        int i11 = this.f24626c;
        if (c7781j == null) {
            c7794w.f24668r0.add(new C7790s(c7794w, i10, i11));
        } else {
            c7794w.f24660Z.m15923i(i10, i11 + 0.99f);
        }
    }
}
