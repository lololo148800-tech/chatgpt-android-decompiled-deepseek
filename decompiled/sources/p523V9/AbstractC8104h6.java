package p523V9;

import android.view.View;
import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;
import p1091wn.AbstractC21031l;
import p183H4.C3233h;
import p183H4.InterfaceC3232g;
import p759g1.AbstractC13799a;
import p759g1.C13802d;

/* JADX INFO: renamed from: V9.h6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8104h6 {
    /* JADX INFO: renamed from: b */
    public static final InterfaceC3232g m8583b(View view) {
        AbstractC16544l.m18094g(view, "<this>");
        return (InterfaceC3232g) AbstractC21031l.m21489m(AbstractC21031l.m21496t(AbstractC21031l.m21492p(C3233h.f9803Z, view), C3233h.f9804o0));
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m8584c(C13802d c13802d) {
        float fM15297b = AbstractC13799a.m15297b(c13802d.f43594e);
        long j10 = c13802d.f43594e;
        if (fM15297b == AbstractC13799a.m15298c(j10)) {
            float fM15297b2 = AbstractC13799a.m15297b(j10);
            long j11 = c13802d.f43595f;
            if (fM15297b2 == AbstractC13799a.m15297b(j11) && AbstractC13799a.m15297b(j10) == AbstractC13799a.m15298c(j11)) {
                float fM15297b3 = AbstractC13799a.m15297b(j10);
                long j12 = c13802d.f43596g;
                if (fM15297b3 == AbstractC13799a.m15297b(j12) && AbstractC13799a.m15297b(j10) == AbstractC13799a.m15298c(j12)) {
                    float fM15297b4 = AbstractC13799a.m15297b(j10);
                    long j13 = c13802d.f43597h;
                    if (fM15297b4 == AbstractC13799a.m15297b(j13) && AbstractC13799a.m15297b(j10) == AbstractC13799a.m15298c(j13)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static final void m8585d(View view, InterfaceC3232g interfaceC3232g) {
        AbstractC16544l.m18094g(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, interfaceC3232g);
    }
}
