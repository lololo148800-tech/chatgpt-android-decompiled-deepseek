package p817j$.time.zone;

import java.security.PrivilegedAction;
import java.util.ArrayList;

/* JADX INFO: renamed from: j$.time.zone.g */
/* JADX INFO: loaded from: classes4.dex */
final class C15647g implements PrivilegedAction {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ArrayList f48834a;

    C15647g(ArrayList arrayList) {
        this.f48834a = arrayList;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        String property = System.getProperty("java.time.zone.DefaultZoneRulesProvider");
        if (property != null) {
            try {
                AbstractC15649i abstractC15649i = (AbstractC15649i) AbstractC15649i.class.cast(Class.forName(property, true, AbstractC15649i.class.getClassLoader()).newInstance());
                AbstractC15649i.m17229e(abstractC15649i);
                this.f48834a.add(abstractC15649i);
                return null;
            } catch (Exception e10) {
                throw new Error(e10);
            }
        }
        AbstractC15649i.m17229e(new C15648h());
        return null;
    }
}
