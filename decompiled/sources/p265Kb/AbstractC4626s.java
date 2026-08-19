package p265Kb;

import java.lang.reflect.AccessibleObject;

/* JADX INFO: renamed from: Kb.s */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4626s {

    /* JADX INFO: renamed from: a */
    public static final AbstractC4626s f15074a;

    static {
        AbstractC4626s c4624q;
        if (AbstractC4616i.f15045a >= 9) {
            try {
                c4624q = new C4624q(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
            } catch (NoSuchMethodException unused) {
                c4624q = null;
            }
        } else {
            c4624q = null;
        }
        if (c4624q == null) {
            c4624q = new C4625r();
        }
        f15074a = c4624q;
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo5372a(Object obj, AccessibleObject accessibleObject);
}
