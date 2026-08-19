package p674c5;

import android.content.ComponentName;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.util.Log;
import p444S4.C7011q;

/* JADX INFO: renamed from: c5.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11655h {

    /* JADX INFO: renamed from: a */
    public static final String f35300a = C7011q.m7409f("PackageManagerHelper");

    /* JADX INFO: renamed from: a */
    public static void m13018a(Context context, Class cls, boolean z6) {
        String str = f35300a;
        try {
            int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, cls.getName()));
            boolean z10 = false;
            if (componentEnabledSetting != 0 && componentEnabledSetting == 1) {
                z10 = true;
            }
            if (z6 == z10) {
                C7011q.m7408d().m7410a(str, "Skipping component enablement for ".concat(cls.getName()));
                return;
            }
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z6 ? 1 : 2, 1);
            C7011q c7011qM7408d = C7011q.m7408d();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append(Separators.f31991SP);
            sb2.append(z6 ? "enabled" : "disabled");
            c7011qM7408d.m7410a(str, sb2.toString());
        } catch (Exception e10) {
            C7011q c7011qM7408d2 = C7011q.m7408d();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(cls.getName());
            sb3.append("could not be ");
            sb3.append(z6 ? "enabled" : "disabled");
            String string = sb3.toString();
            if (c7011qM7408d2.f22422a <= 3) {
                Log.d(str, string, e10);
            }
        }
    }
}
