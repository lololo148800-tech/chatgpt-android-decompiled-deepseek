package p594Y9;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p025An.C0644w;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p541W6.C8432b;
import p541W6.C8433c;
import p919o8.AbstractC17962d;
import p919o8.C17952Z0;

/* JADX INFO: renamed from: Y9.o3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9942o3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f29492a = 1;

    /* JADX INFO: renamed from: a */
    public static C17952Z0 m10601a(C3676s c3676s) {
        try {
            String strMo4384r = c3676s.m4395w("operationType").mo4384r();
            AbstractC16544l.m18093f(strMo4384r, "jsonObject.get(\"operationType\").asString");
            for (int i10 : AbstractC0010F.m27k(3)) {
                if (AbstractC17962d.m19661v(i10).equals(strMo4384r)) {
                    AbstractC3673p abstractC3673pM4395w = c3676s.m4395w("operationName");
                    String strMo4384r2 = abstractC3673pM4395w != null ? abstractC3673pM4395w.mo4384r() : null;
                    AbstractC3673p abstractC3673pM4395w2 = c3676s.m4395w("payload");
                    String strMo4384r3 = abstractC3673pM4395w2 != null ? abstractC3673pM4395w2.mo4384r() : null;
                    AbstractC3673p abstractC3673pM4395w3 = c3676s.m4395w("variables");
                    return new C17952Z0(i10, strMo4384r2, strMo4384r3, abstractC3673pM4395w3 != null ? abstractC3673pM4395w3.mo4384r() : null);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Graphql", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Graphql", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Graphql", e12);
        }
    }

    public String toString() {
        switch (this.f29492a) {
            case 1:
                if (equals(C8433c.f26257b)) {
                    return "GET";
                }
                if (equals(C8432b.f26256d)) {
                    return "POST";
                }
                if (equals(C8432b.f26255c)) {
                    return "PATCH";
                }
                if (equals(C8432b.f26254b)) {
                    return "DELETE";
                }
                throw new C0644w();
            default:
                return super.toString();
        }
    }
}
