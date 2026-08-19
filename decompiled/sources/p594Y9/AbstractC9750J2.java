package p594Y9;

import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p279L1.VOxZ.sVoFrD;
import p446S6.C7023b;
import p826j6.C16137F;
import p919o8.C18023x0;

/* JADX INFO: renamed from: Y9.J2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9750J2 {
    /* JADX INFO: renamed from: a */
    public abstract void mo8085a(C7023b c7023b);

    /* JADX INFO: renamed from: c */
    public abstract boolean mo8086c(C16137F c16137f);

    /* JADX INFO: renamed from: b */
    public static C18023x0 m10347b(C3676s c3676s) {
        try {
            AbstractC3673p abstractC3673pM4395w = c3676s.m4395w(sVoFrD.vugoHLT);
            return new C18023x0(abstractC3673pM4395w != null ? AbstractC9792Q2.m10409a(abstractC3673pM4395w.m4390m()) : null);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Display", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Display", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Display", e12);
        }
    }
}
