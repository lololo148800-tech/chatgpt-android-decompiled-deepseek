package p1103xa;

/* JADX INFO: renamed from: xa.f */
/* JADX INFO: loaded from: classes.dex */
public final class C21165f extends AbstractC21166g {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f67264e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C21169j f67265f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21165f(C21169j c21169j, int i10) {
        super(c21169j);
        this.f67264e = i10;
        this.f67265f = c21169j;
    }

    @Override // p1103xa.AbstractC21166g
    /* JADX INFO: renamed from: a */
    public final float mo21594a() {
        switch (this.f67264e) {
            case 0:
                C21169j c21169j = this.f67265f;
                return c21169j.f67288h + c21169j.f67289i;
            case 1:
                C21169j c21169j2 = this.f67265f;
                return c21169j2.f67288h + c21169j2.f67290j;
            default:
                return this.f67265f.f67288h;
        }
    }
}
