package p104Do;

import java.util.List;
import p078Co.InterfaceC1760b;
import p1113xn.AbstractC21322p;
import p523V9.AbstractC8038Z3;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: Do.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C2221b implements InterfaceC1760b {

    /* JADX INFO: renamed from: b */
    public static final C2221b f6803b = new C2221b(0);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6804a;

    public /* synthetic */ C2221b(int i10) {
        this.f6804a = i10;
    }

    @Override // p078Co.InterfaceC1760b
    /* JADX INFO: renamed from: d */
    public final Object mo2570d(Object obj, Object obj2) {
        switch (this.f6804a) {
            case 0:
                Object objM19343S = AbstractC17680n.m19343S(AbstractC8038Z3.m8396e(obj));
                Object objM19344T = AbstractC17680n.m19344T(1, AbstractC8038Z3.m8396e(obj));
                if (objM19344T instanceof String) {
                    return Boolean.valueOf(AbstractC21322p.m21667A((CharSequence) objM19344T, String.valueOf(objM19343S), false));
                }
                return objM19344T instanceof List ? Boolean.valueOf(((List) objM19344T).contains(objM19343S)) : Boolean.FALSE;
            default:
                return AbstractC17680n.m19343S(AbstractC8038Z3.m8396e(obj));
        }
    }
}
