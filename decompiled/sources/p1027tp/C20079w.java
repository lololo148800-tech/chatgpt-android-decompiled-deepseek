package p1027tp;

import java.lang.reflect.Array;
import java.util.Iterator;

/* JADX INFO: renamed from: tp.w */
/* JADX INFO: loaded from: classes2.dex */
public final class C20079w extends AbstractC20056V {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f63588b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC20056V f63589c;

    public /* synthetic */ C20079w(AbstractC20056V abstractC20056V, int i10) {
        this.f63588b = i10;
        this.f63589c = abstractC20056V;
    }

    @Override // p1027tp.AbstractC20056V
    /* JADX INFO: renamed from: a */
    public final void mo20858a(C20045J c20045j, Object obj) {
        switch (this.f63588b) {
            case 0:
                Iterable iterable = (Iterable) obj;
                if (iterable != null) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        this.f63589c.mo20858a(c20045j, it.next());
                    }
                    break;
                }
                break;
            default:
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i10 = 0; i10 < length; i10++) {
                        this.f63589c.mo20858a(c20045j, Array.get(obj, i10));
                    }
                    break;
                }
                break;
        }
    }
}
