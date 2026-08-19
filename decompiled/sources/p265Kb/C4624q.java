package p265Kb;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: Kb.q */
/* JADX INFO: loaded from: classes.dex */
public final class C4624q extends AbstractC4626s {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Method f15073b;

    public C4624q(Method method) {
        this.f15073b = method;
    }

    @Override // p265Kb.AbstractC4626s
    /* JADX INFO: renamed from: a */
    public final boolean mo5372a(Object obj, AccessibleObject accessibleObject) {
        try {
            return ((Boolean) this.f15073b.invoke(accessibleObject, obj)).booleanValue();
        } catch (Exception e10) {
            throw new RuntimeException("Failed invoking canAccess", e10);
        }
    }
}
