package p646aj;

import io.sentry.AbstractC15403m;
import io.sentry.android.replay.C15294h;
import io.sentry.android.replay.C15295i;
import java.io.File;
import java.io.FilenameFilter;
import kotlin.jvm.internal.AbstractC16544l;
import p1112xm.AbstractC21304h;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;

/* JADX INFO: renamed from: aj.d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10624d implements FilenameFilter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f31525a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f31526b;

    public /* synthetic */ C10624d(Object obj, int i10) {
        this.f31525a = i10;
        this.f31526b = obj;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String name) {
        switch (this.f31525a) {
            case 0:
                C10627g this$0 = (C10627g) this.f31526b;
                AbstractC16544l.m18094g(this$0, "this$0");
                AbstractC16544l.m18093f(name, "name");
                return AbstractC21322p.m21667A(name, this$0.f31533b, false) && !AbstractC21329w.m21725l(name, ".tmp", false);
            case 1:
                return ((AbstractC15403m) this.f31526b).mo16650a(name);
            default:
                C15294h c15294h = (C15294h) this.f31526b;
                AbstractC16544l.m18093f(name, "name");
                if (AbstractC21329w.m21725l(name, ".jpg", false)) {
                    File file2 = new File(file, name);
                    Long lM21738y = AbstractC21329w.m21738y(AbstractC21304h.m21643f(file2));
                    if (lM21738y != null) {
                        c15294h.f47778s0.add(new C15295i(file2, lM21738y.longValue(), null));
                    }
                }
                return false;
        }
    }
}
