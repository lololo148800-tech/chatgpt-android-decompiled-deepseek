package p1132yk;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import kotlin.jvm.internal.AbstractC16544l;
import p310M9.C5311e;
import p594Y9.AbstractC9722E4;
import p822j2.C16047d;
import p994rk.AbstractC19120S1;
import p994rk.C19094J1;

/* JADX INFO: renamed from: yk.b */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC21548b {
    /* JADX INFO: renamed from: a */
    public static final View m21828a(UiComponentConfig.RemoteImage remoteImage, ConstraintLayout container, boolean z6) {
        AbstractC16544l.m18094g(remoteImage, "<this>");
        AbstractC16544l.m18094g(container, "container");
        Context context = container.getContext();
        AbstractC16544l.m18093f(context, "getContext(...)");
        C5311e c5311e = new C5311e(context, 27);
        View viewM20302b = AbstractC19120S1.m20302b(new C19094J1(remoteImage), c5311e);
        container.addView(viewM20302b);
        ViewGroup.LayoutParams layoutParams = viewM20302b.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        C16047d c16047d = (C16047d) layoutParams;
        c16047d.f49545i = 0;
        c16047d.f49564t = 0;
        c16047d.f49566v = 0;
        if (z6) {
            c16047d.f49551l = 0;
        }
        viewM20302b.setLayoutParams(c16047d);
        AbstractC9722E4.m10313a(new C21547a(c5311e), container);
        return viewM20302b;
    }
}
