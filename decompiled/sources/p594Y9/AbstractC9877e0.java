package p594Y9;

import android.gov.nist.javax.sip.header.ParameterNames;
import android.text.InputFilter;
import kotlin.jvm.internal.AbstractC16544l;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p919o8.C18008s0;

/* JADX INFO: renamed from: Y9.e0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9877e0 {
    /* JADX INFO: renamed from: a */
    public static C18008s0 m10532a(C3676s c3676s) {
        try {
            String id2 = c3676s.m4395w(ParameterNames.f31999ID).mo4384r();
            AbstractC16544l.m18093f(id2, "id");
            return new C18008s0(id2);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type ContainerView", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type ContainerView", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type ContainerView", e12);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract InputFilter[] mo8004b(InputFilter[] inputFilterArr);

    /* JADX INFO: renamed from: c */
    public abstract void mo8005c(boolean z6);

    /* JADX INFO: renamed from: d */
    public abstract void mo8006d(boolean z6);
}
