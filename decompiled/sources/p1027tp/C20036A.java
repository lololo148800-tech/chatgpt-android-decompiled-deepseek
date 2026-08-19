package p1027tp;

import p817j$.util.Objects;

/* JADX INFO: renamed from: tp.A */
/* JADX INFO: loaded from: classes2.dex */
public final class C20036A extends AbstractC20056V {

    /* JADX INFO: renamed from: b */
    public final String f63455b;

    /* JADX INFO: renamed from: c */
    public final C20057a f63456c;

    public C20036A(String str) {
        C20057a c20057a = C20057a.f63546Z;
        Objects.requireNonNull(str, "name == null");
        this.f63455b = str;
        this.f63456c = c20057a;
    }

    @Override // p1027tp.AbstractC20056V
    /* JADX INFO: renamed from: a */
    public final void mo20858a(C20045J c20045j, Object obj) {
        if (obj == null) {
            return;
        }
        this.f63456c.getClass();
        String string = obj.toString();
        if (string == null) {
            return;
        }
        c20045j.m20862b(this.f63455b, string);
    }
}
