package p594Y9;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import io.sentry.android.replay.C15309v;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC16544l;
import p046Bk.C1366a0;
import p049Bm.InterfaceC1426a;
import p931ok.AbstractC18223d;

/* JADX INFO: renamed from: Y9.C4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9710C4 {
    /* JADX INFO: renamed from: a */
    public static final void m10303a(BottomSheetBehavior bottomSheetBehavior, InterfaceC1426a interfaceC1426a, View bottomSheet, View view, View view2) {
        AbstractC16544l.m18094g(bottomSheetBehavior, "<this>");
        AbstractC16544l.m18094g(bottomSheet, "bottomSheet");
        C1366a0 c1366a0 = new C1366a0(interfaceC1426a, view2);
        ArrayList arrayList = bottomSheetBehavior.f36434X;
        if (!arrayList.contains(c1366a0)) {
            arrayList.add(c1366a0);
        }
        bottomSheetBehavior.f36421K = true;
        if (view != null) {
            bottomSheet = view;
        }
        AbstractC18223d.m19732b(bottomSheet, new C15309v(bottomSheet, 2));
    }

    /* JADX INFO: renamed from: b */
    public static AbstractList m10304b(List list, InterfaceC9882e5 interfaceC9882e5) {
        return list instanceof RandomAccess ? new C9968t(list, interfaceC9882e5) : new C9974u(list, interfaceC9882e5);
    }
}
