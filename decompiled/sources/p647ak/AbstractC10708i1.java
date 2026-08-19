package p647ak;

import android.content.Context;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import p045Bj.C1311i;
import p080D0.C1825q0;
import p523V9.AbstractC8012V5;
import p523V9.AbstractC8215v5;
import p531Vj.AbstractC8367f0;
import p531Vj.EnumC8334D;
import p729ej.C13421l;
import p729ej.C13430u;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: ak.i1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10708i1 {
    /* JADX INFO: renamed from: a */
    public static final AbstractC10712k0 m11027a(C13430u c13430u, boolean z6) {
        AbstractC16544l.m18094g(c13430u, "<this>");
        return z6 ? (AbstractC10712k0) c13430u.f42521b : ((AbstractC10712k0) c13430u.f42521b).mo11014i();
    }

    /* JADX INFO: renamed from: b */
    public static final C1311i m11028b(C13421l c13421l) {
        AbstractC16544l.m18094g(c13421l, "<this>");
        return new C1311i(c13421l, 3);
    }

    /* JADX INFO: renamed from: c */
    public static final void m11029c(C13421l c13421l) {
        AbstractC16544l.m18094g(c13421l, "<this>");
        c13421l.f42503Y.mo3400l().mo3393B(AbstractC8215v5.m8840b(new C10671U0(1, 4)));
    }

    /* JADX INFO: renamed from: d */
    public static final void m11030d(Context context, C13421l renderContext, C10730t0 renderProps, boolean z6) {
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(renderContext, "renderContext");
        AbstractC16544l.m18094g(renderProps, "renderProps");
        ArrayList arrayListM19384m = AbstractC17681o.m19384m(EnumC8334D.f25983Y);
        if (z6 && AbstractC8012V5.m8333f(context) && renderProps.f31904v.f40860e) {
            arrayListM19384m.add(EnumC8334D.f25984Z);
        }
        ArrayList arrayListM8938a = AbstractC8367f0.m8938a(context, arrayListM19384m);
        if (arrayListM8938a.isEmpty()) {
            return;
        }
        renderContext.f42503Y.mo3400l().mo3393B(AbstractC8215v5.m8840b(new C1825q0(5, arrayListM8938a)));
    }

    /* JADX INFO: renamed from: e */
    public static final C10742z0 m11031e(C10730t0 c10730t0) {
        AbstractC16544l.m18094g(c10730t0, "<this>");
        NextStep.Selfie.AssetConfig assetConfig = c10730t0.f31905w;
        NextStep.Selfie.AssetConfig.RecordPage recordPage = assetConfig.getRecordPage();
        UiComponentConfig.RemoteImage selfieLeftPictograph = recordPage != null ? recordPage.getSelfieLeftPictograph() : null;
        NextStep.Selfie.AssetConfig.RecordPage recordPage2 = assetConfig.getRecordPage();
        return new C10742z0(selfieLeftPictograph, recordPage2 != null ? recordPage2.getSelfieRightPictograph() : null);
    }
}
