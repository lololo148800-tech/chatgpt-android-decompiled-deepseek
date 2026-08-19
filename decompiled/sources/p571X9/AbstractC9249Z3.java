package p571X9;

import android.gov.nist.javax.sip.header.ParameterNames;
import kotlin.jvm.internal.AbstractC16544l;
import p204I1.C3573D;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p467T1.C7200j;
import p919o8.C17986l;
import p946pc.C18321F;
import p988rc.C18930r;

/* JADX INFO: renamed from: X9.Z3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9249Z3 {
    /* JADX INFO: renamed from: a */
    public static C17986l m9824a(C3676s c3676s) {
        try {
            String id2 = c3676s.m4395w(ParameterNames.f31999ID).mo4384r();
            AbstractC16544l.m18093f(id2, "id");
            return new C17986l(id2);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type ContainerView", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type ContainerView", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type ContainerView", e12);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final C18321F m9825b() {
        return new C18321F(null, null, new C18930r(null, new C3573D(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, C7200j.f22864c, null, 61439), 127), 127);
    }
}
