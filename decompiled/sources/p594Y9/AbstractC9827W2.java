package p594Y9;

import kotlin.jvm.internal.AbstractC16544l;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p364Oh.C6240n;
import p576Xe.C9473F;
import p576Xe.C9478c;
import p919o8.C17916M0;
import sh.C19647y;

/* JADX INFO: renamed from: Y9.W2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9827W2 {
    /* JADX INFO: renamed from: a */
    public static C9478c m10468a(C9473F c9473f, boolean z6, int i10) {
        if ((i10 & 2) != 0) {
            z6 = false;
        }
        return new C9478c(c9473f.f28512b.m7286b(new C19647y(), new C6240n()), z6);
    }

    /* JADX INFO: renamed from: b */
    public static C17916M0 m10469b(C3676s c3676s) {
        try {
            Number sessionSampleRate = c3676s.m4395w("session_sample_rate").mo4383q();
            AbstractC3673p abstractC3673pM4395w = c3676s.m4395w("session_replay_sample_rate");
            Number numberMo4383q = abstractC3673pM4395w != null ? abstractC3673pM4395w.mo4383q() : null;
            AbstractC16544l.m18093f(sessionSampleRate, "sessionSampleRate");
            return new C17916M0(sessionSampleRate, numberMo4383q);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Configuration", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Configuration", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Configuration", e12);
        }
    }
}
