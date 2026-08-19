package p544W9;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.net.Uri;
import android.os.Build;
import kotlin.jvm.internal.AbstractC16544l;
import p030B2.AbstractC0767l;
import p1053v3.p1054lN.IGDwkYw;
import p1140z1.AbstractC21690f;
import p1140z1.InterfaceC21704m;
import p323Mm.InterfaceC5500g;
import p635a1.AbstractC10458p;
import p693d1.C12989b;

/* JADX INFO: renamed from: W9.J3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8501J3 {
    /* JADX INFO: renamed from: b */
    public static final void m9166b(InterfaceC21704m interfaceC21704m, C12989b c12989b) {
        Activity activity;
        if (Build.VERSION.SDK_INT < 24) {
            return;
        }
        ClipData clipData = c12989b.f41241a.getClipData();
        int itemCount = clipData.getItemCount();
        for (int i10 = 0; i10 < itemCount; i10++) {
            Uri uri = clipData.getItemAt(i10).getUri();
            if (uri != null && AbstractC16544l.m18089b(uri.getScheme(), "content")) {
                if (((AbstractC10458p) interfaceC21704m).f30960Y.f30972y0) {
                    Context context = AbstractC21690f.m22219x(interfaceC21704m).getContext();
                    while (true) {
                        if (!(context instanceof ContextWrapper)) {
                            activity = null;
                            break;
                        } else {
                            if (context instanceof Activity) {
                                activity = (Activity) context;
                                break;
                            }
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    }
                    if (activity != null && Build.VERSION.SDK_INT >= 24) {
                        AbstractC0767l.m1711f(activity, c12989b.f41241a);
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m9165a(InterfaceC5500g interfaceC5500g, Object[] objArr) {
        AbstractC16544l.m18094g(objArr, IGDwkYw.JXhUjfusQTN);
        if (AbstractC8507K3.m9168a(interfaceC5500g) == objArr.length) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("Callable expects ");
        sb2.append(AbstractC8507K3.m9168a(interfaceC5500g));
        sb2.append(" arguments, but ");
        throw new IllegalArgumentException(AbstractC10763a.m11056n(sb2, objArr.length, " were provided."));
    }
}
