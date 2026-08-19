package p571X9;

import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p492U1.C7538c;
import p919o8.C17912L;

/* JADX INFO: renamed from: X9.x4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9394x4 {
    /* JADX INFO: renamed from: a */
    public static C7538c m9976a() {
        return new C7538c(1.0f, 1.0f);
    }

    /* JADX INFO: renamed from: b */
    public static C17912L m9977b(C3676s c3676s) {
        try {
            AbstractC3673p abstractC3673pM4395w = c3676s.m4395w("technology");
            String strMo4384r = abstractC3673pM4395w != null ? abstractC3673pM4395w.mo4384r() : null;
            AbstractC3673p abstractC3673pM4395w2 = c3676s.m4395w("carrier_name");
            return new C17912L(strMo4384r, abstractC3673pM4395w2 != null ? abstractC3673pM4395w2.mo4384r() : null);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Cellular", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Cellular", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Cellular", e12);
        }
    }
}
