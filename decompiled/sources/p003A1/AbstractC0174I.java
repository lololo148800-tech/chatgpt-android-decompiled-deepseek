package p003A1;

import android.R;
import p056C2.C1511e;
import p056C2.C1512f;
import p156G1.AbstractC2962i;
import p156G1.C2954a;
import p156G1.C2968o;

/* JADX INFO: renamed from: A1.I */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0174I {
    /* JADX INFO: renamed from: a */
    public static final void m555a(C1512f c1512f, C2968o c2968o) {
        if (AbstractC0240d0.m790a(c2968o)) {
            Object obj = c2968o.f8889d.f8880Y.get(AbstractC2962i.f8860g);
            if (obj == null) {
                obj = null;
            }
            C2954a c2954a = (C2954a) obj;
            if (c2954a != null) {
                c1512f.m2213b(new C1511e(R.id.accessibilityActionSetProgress, c2954a.f8837a));
            }
        }
    }
}
