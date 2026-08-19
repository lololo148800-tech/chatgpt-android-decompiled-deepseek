package p594Y9;

import androidx.fragment.app.OwC.wNrQXvwLiB;
import kotlin.jvm.internal.AbstractC16544l;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p474T8.InterfaceC7269g;
import p507Uh.C7679e;
import p507Uh.InterfaceC7683i;
import p893n.AbstractActivityC17375g;
import p919o8.C17993n0;

/* JADX INFO: renamed from: Y9.Y */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9836Y {
    /* JADX INFO: renamed from: a */
    public static final C7679e m10482a(InterfaceC7269g accompanistState, InterfaceC7683i previouslyRequestedPermissions, AbstractActivityC17375g activity) {
        AbstractC16544l.m18094g(activity, "activity");
        AbstractC16544l.m18094g(accompanistState, "accompanistState");
        AbstractC16544l.m18094g(previouslyRequestedPermissions, "previouslyRequestedPermissions");
        return new C7679e(accompanistState, previouslyRequestedPermissions, activity);
    }

    /* JADX INFO: renamed from: b */
    public static C17993n0 m10483b(C3676s c3676s) {
        try {
            AbstractC3673p abstractC3673pM4395w = c3676s.m4395w(wNrQXvwLiB.JsbEtxKkX);
            String strMo4384r = abstractC3673pM4395w != null ? abstractC3673pM4395w.mo4384r() : null;
            AbstractC3673p abstractC3673pM4395w2 = c3676s.m4395w("carrier_name");
            return new C17993n0(strMo4384r, abstractC3673pM4395w2 != null ? abstractC3673pM4395w2.mo4384r() : null);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Cellular", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Cellular", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Cellular", e12);
        }
    }
}
