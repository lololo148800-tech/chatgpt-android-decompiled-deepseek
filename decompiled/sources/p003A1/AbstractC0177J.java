package p003A1;

import android.R;
import java.util.LinkedHashMap;
import p056C2.C1511e;
import p056C2.C1512f;
import p156G1.AbstractC2962i;
import p156G1.C2954a;
import p156G1.C2968o;
import p156G1.C2974u;

/* JADX INFO: renamed from: A1.J */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0177J {
    /* JADX INFO: renamed from: a */
    public static final void m558a(C1512f c1512f, C2968o c2968o) {
        if (AbstractC0240d0.m790a(c2968o)) {
            C2974u c2974u = AbstractC2962i.f8876w;
            LinkedHashMap linkedHashMap = c2968o.f8889d.f8880Y;
            Object obj = linkedHashMap.get(c2974u);
            if (obj == null) {
                obj = null;
            }
            C2954a c2954a = (C2954a) obj;
            if (c2954a != null) {
                c1512f.m2213b(new C1511e(R.id.accessibilityActionPageUp, c2954a.f8837a));
            }
            Object obj2 = linkedHashMap.get(AbstractC2962i.f8878y);
            if (obj2 == null) {
                obj2 = null;
            }
            C2954a c2954a2 = (C2954a) obj2;
            if (c2954a2 != null) {
                c1512f.m2213b(new C1511e(R.id.accessibilityActionPageDown, c2954a2.f8837a));
            }
            Object obj3 = linkedHashMap.get(AbstractC2962i.f8877x);
            if (obj3 == null) {
                obj3 = null;
            }
            C2954a c2954a3 = (C2954a) obj3;
            if (c2954a3 != null) {
                c1512f.m2213b(new C1511e(R.id.accessibilityActionPageLeft, c2954a3.f8837a));
            }
            Object obj4 = linkedHashMap.get(AbstractC2962i.f8879z);
            C2954a c2954a4 = (C2954a) (obj4 != null ? obj4 : null);
            if (c2954a4 != null) {
                c1512f.m2213b(new C1511e(R.id.accessibilityActionPageRight, c2954a4.f8837a));
            }
        }
    }
}
