package p730ek;

import android.graphics.PointF;
import com.withpersona.sdk2.inquiry.selfie.view.SelfieOverlayView;
import com.withpersona.sdk2.inquiry.shared.p687ui.ThemeableLottieAnimationView;
import hk.C14525c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1426a;
import p099Dj.C2069g;
import p520V5.C7794w;
import p520V5.InterfaceC7763A;
import p640a6.C10510e;
import p909nm.AbstractC17680n;
import p931ok.C18231l;

/* JADX INFO: renamed from: ek.c */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C13438c {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42541a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f42542b;

    public /* synthetic */ C13438c(Object obj, int i10) {
        this.f42541a = i10;
        this.f42542b = obj;
    }

    /* JADX INFO: renamed from: a */
    public final void m14966a() {
        int i10 = 1;
        Object obj = this.f42542b;
        switch (this.f42541a) {
            case 0:
                int i11 = SelfieOverlayView.f40876S0;
                SelfieOverlayView this$0 = (SelfieOverlayView) obj;
                AbstractC16544l.m18094g(this$0, "this$0");
                ArrayList arrayList = this$0.f40885O0;
                List listM19322C0 = AbstractC17680n.m19322C0(arrayList);
                arrayList.clear();
                Iterator it = listM19322C0.iterator();
                while (it.hasNext()) {
                    ((InterfaceC1426a) it.next()).invoke();
                }
                break;
            case 1:
                int i12 = ThemeableLottieAnimationView.f40894H0;
                ThemeableLottieAnimationView this$1 = (ThemeableLottieAnimationView) obj;
                AbstractC16544l.m18094g(this$1, "this$0");
                C10510e c10510e = new C10510e("**");
                PointF pointF = InterfaceC7763A.f24513a;
                C18231l c18231l = new C18231l(this$1, 0);
                C7794w c7794w = this$1.f35936v0;
                c7794w.m8054a(c10510e, 1, c18231l);
                c7794w.m8054a(new C10510e("**"), 2, new C18231l(this$1, i10));
                break;
            case 2:
                ((ThemeableLottieAnimationView) ((C14525c) obj).f45778c).m13144f();
                break;
            default:
                C2069g this_with = (C2069g) obj;
                AbstractC16544l.m18094g(this_with, "$this_with");
                this_with.f6366o.setProgress(1.0f);
                break;
        }
    }
}
