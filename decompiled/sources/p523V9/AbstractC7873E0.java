package p523V9;

import android.gov.nist.javax.sip.header.ParameterNames;
import kotlin.jvm.internal.AbstractC16544l;
import p1008s8.C19482k;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p658b5.C11239j;
import p658b5.C11245p;

/* JADX INFO: renamed from: V9.E0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7873E0 {
    /* JADX INFO: renamed from: a */
    public static C19482k m8150a(C3676s c3676s) {
        try {
            String id2 = c3676s.m4395w(ParameterNames.f31999ID).mo4384r();
            AbstractC16544l.m18093f(id2, "id");
            return new C19482k(id2);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Action", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Action", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Action", e12);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final C11239j m8151b(C11245p c11245p) {
        AbstractC16544l.m18094g(c11245p, "<this>");
        return new C11239j(c11245p.f34041a, c11245p.f34060t);
    }
}
