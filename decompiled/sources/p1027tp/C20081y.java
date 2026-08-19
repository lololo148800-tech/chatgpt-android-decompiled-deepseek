package p1027tp;

import p817j$.util.Objects;

/* JADX INFO: renamed from: tp.y */
/* JADX INFO: loaded from: classes2.dex */
public final class C20081y extends AbstractC20056V {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f63593b;

    /* JADX INFO: renamed from: c */
    public final String f63594c;

    /* JADX INFO: renamed from: d */
    public final C20057a f63595d;

    /* JADX INFO: renamed from: e */
    public final boolean f63596e;

    public C20081y(String str, boolean z6, int i10) {
        this.f63593b = i10;
        switch (i10) {
            case 1:
                C20057a c20057a = C20057a.f63546Z;
                Objects.requireNonNull(str, "name == null");
                this.f63594c = str;
                this.f63595d = c20057a;
                this.f63596e = z6;
                break;
            default:
                C20057a c20057a2 = C20057a.f63546Z;
                Objects.requireNonNull(str, "name == null");
                this.f63594c = str;
                this.f63595d = c20057a2;
                this.f63596e = z6;
                break;
        }
    }

    @Override // p1027tp.AbstractC20056V
    /* JADX INFO: renamed from: a */
    public final void mo20858a(C20045J c20045j, Object obj) {
        switch (this.f63593b) {
            case 0:
                if (obj != null) {
                    this.f63595d.getClass();
                    String string = obj.toString();
                    if (string != null) {
                        c20045j.m20861a(this.f63594c, string, this.f63596e);
                        break;
                    }
                }
                break;
            default:
                if (obj != null) {
                    this.f63595d.getClass();
                    String string2 = obj.toString();
                    if (string2 != null) {
                        c20045j.m20864d(this.f63594c, string2, this.f63596e);
                        break;
                    }
                }
                break;
        }
    }
}
