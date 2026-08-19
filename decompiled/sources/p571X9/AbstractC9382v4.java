package p571X9;

import android.content.Context;
import androidx.fragment.app.OwC.wNrQXvwLiB;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import kotlin.jvm.internal.AbstractC16544l;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p492U1.C7539d;
import p492U1.C7547l;
import p516V1.AbstractC7738b;
import p516V1.InterfaceC7737a;
import p919o8.C17906J;

/* JADX INFO: renamed from: X9.v4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9382v4 {
    /* JADX INFO: renamed from: a */
    public static final C7539d m9955a(Context context) {
        float f10 = context.getResources().getConfiguration().fontScale;
        float f11 = context.getResources().getDisplayMetrics().density;
        InterfaceC7737a interfaceC7737aM8002a = AbstractC7738b.m8002a(f10);
        if (interfaceC7737aM8002a == null) {
            interfaceC7737aM8002a = new C7547l(f10);
        }
        return new C7539d(f11, f10, interfaceC7737aM8002a);
    }

    /* JADX INFO: renamed from: b */
    public static C17906J m9956b(C3676s c3676s) {
        String str = wNrQXvwLiB.IqRGpCZnBJhl;
        try {
            String strMo4384r = c3676s.m4395w(str).mo4384r();
            String name = c3676s.m4395w(DiagnosticsEntry.NAME_KEY).mo4384r();
            boolean zMo4380f = c3676s.m4395w("is_system").mo4380f();
            AbstractC3673p abstractC3673pM4395w = c3676s.m4395w("load_address");
            String strMo4384r2 = abstractC3673pM4395w != null ? abstractC3673pM4395w.mo4384r() : null;
            AbstractC3673p abstractC3673pM4395w2 = c3676s.m4395w("max_address");
            String strMo4384r3 = abstractC3673pM4395w2 != null ? abstractC3673pM4395w2.mo4384r() : null;
            AbstractC3673p abstractC3673pM4395w3 = c3676s.m4395w("arch");
            String strMo4384r4 = abstractC3673pM4395w3 != null ? abstractC3673pM4395w3.mo4384r() : null;
            AbstractC16544l.m18093f(strMo4384r, str);
            AbstractC16544l.m18093f(name, "name");
            return new C17906J(strMo4384r, name, zMo4380f, strMo4384r2, strMo4384r3, strMo4384r4);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type BinaryImage", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type BinaryImage", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type BinaryImage", e12);
        }
    }
}
