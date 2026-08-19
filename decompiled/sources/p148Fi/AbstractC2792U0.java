package p148Fi;

import kotlin.jvm.internal.AbstractC16544l;
import om.C18238e;
import p046Bk.C1342O;

/* JADX INFO: renamed from: Fi.U0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2792U0 {

    /* JADX INFO: renamed from: a */
    public static final C1342O f8519a = new C1342O(3);

    /* JADX INFO: renamed from: a */
    public static final boolean m3710a(AbstractC2829i1 abstractC2829i1) {
        AbstractC16544l.m18094g(abstractC2829i1, "<this>");
        return !(abstractC2829i1.equals(C2798X0.f8527a) ? true : abstractC2829i1.equals(C2820f1.f8553a));
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m3711b(AbstractC2829i1 abstractC2829i1) {
        AbstractC16544l.m18094g(abstractC2829i1, "<this>");
        return !(abstractC2829i1.equals(C2798X0.f8527a) ? true : abstractC2829i1 instanceof AbstractC2805a1 ? true : abstractC2829i1.equals(C2820f1.f8553a) ? true : abstractC2829i1.equals(C2796W0.f8522a));
    }

    /* JADX INFO: renamed from: c */
    public static final C2864y0 m3712c(String str) {
        C18238e c18238e = new C18238e();
        c18238e.put("logger.name", str);
        c18238e.put("logger.category", "Voice");
        return new C2864y0(c18238e.m19755b());
    }
}
