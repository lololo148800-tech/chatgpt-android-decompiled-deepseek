package p030B2;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: renamed from: B2.F */
/* JADX INFO: loaded from: classes.dex */
public final class C0725F extends AbstractC0727H {

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f2083q0;

    public C0725F(int i10, Class cls, int i11, int i12, int i13) {
        this.f2083q0 = i13;
        this.f2085Y = i10;
        this.f2088p0 = cls;
        this.f2087o0 = i11;
        this.f2086Z = i12;
    }

    @Override // p030B2.AbstractC0727H
    /* JADX INFO: renamed from: c */
    public final Object mo1534c(View view) {
        switch (this.f2083q0) {
            case 0:
                return Boolean.valueOf(AbstractC0733N.m1563c(view));
            case 1:
                return AbstractC0733N.m1561a(view);
            default:
                return Boolean.valueOf(AbstractC0733N.m1562b(view));
        }
    }

    @Override // p030B2.AbstractC0727H
    /* JADX INFO: renamed from: d */
    public final void mo1535d(View view, Object obj) {
        switch (this.f2083q0) {
            case 0:
                AbstractC0733N.m1566f(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                AbstractC0733N.m1565e(view, (CharSequence) obj);
                break;
            default:
                AbstractC0733N.m1564d(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // p030B2.AbstractC0727H
    /* JADX INFO: renamed from: g */
    public final boolean mo1536g(Object obj, Object obj2) {
        switch (this.f2083q0) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
    }
}
