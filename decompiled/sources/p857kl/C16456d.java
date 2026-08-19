package p857kl;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0235c;
import p909nm.C17689w;

/* JADX INFO: renamed from: kl.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C16456d extends AbstractC0235c {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f51059d = 0;

    static {
        C17689w c17689w = C17689w.f56480Y;
        new C16456d("file", c17689w);
        new C16456d("mixed", c17689w);
        new C16456d("attachment", c17689w);
        new C16456d("inline", c17689w);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16456d(String disposition, List parameters) {
        super(disposition, parameters);
        AbstractC16544l.m18094g(disposition, "disposition");
        AbstractC16544l.m18094g(parameters, "parameters");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C16456d) {
            C16456d c16456d = (C16456d) obj;
            if (AbstractC16544l.m18089b((String) this.f878b, (String) c16456d.f878b)) {
                if (AbstractC16544l.m18089b((List) this.f879c, (List) c16456d.f879c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((List) this.f879c).hashCode() + (((String) this.f878b).hashCode() * 31);
    }
}
