package p1044uj;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.styling.StyleElements;
import hk.C14524b;
import kotlin.jvm.internal.AbstractC16544l;
import p283L5.C4952r;
import p310M9.C5311e;
import p571X9.AbstractC9345p3;
import p769gj.C14183y;
import p769gj.InterfaceC14170l;
import pk.C18500e;

/* JADX INFO: renamed from: uj.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C20346l implements InterfaceC14170l {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C18500e f64336a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C14524b f64337b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C20348m f64338c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C5311e f64339d;

    public C20346l(C18500e c18500e, C14524b c14524b, C20348m c20348m, C5311e c5311e) {
        this.f64336a = c18500e;
        this.f64337b = c14524b;
        this.f64338c = c20348m;
        this.f64339d = c5311e;
    }

    @Override // p769gj.InterfaceC14170l
    /* JADX INFO: renamed from: a */
    public final void mo1133a(Object rendering, C14183y viewEnvironment) {
        StepStyles.StepBackgroundColorStyle backgroundColor;
        StyleElements.SimpleElementColor base;
        StyleElements.SimpleElementColorValue base2;
        AbstractC16544l.m18094g(rendering, "rendering");
        AbstractC16544l.m18094g(viewEnvironment, "viewEnvironment");
        C18500e c18500e = this.f64336a;
        StepStyles.UiStepStyle uiStepStyle = c18500e.f58961Z;
        Integer value = (uiStepStyle == null || (backgroundColor = uiStepStyle.getBackgroundColor()) == null || (base = backgroundColor.getBase()) == null || (base2 = base.getBase()) == null) ? null : base2.getValue();
        C14524b c14524b = this.f64337b;
        if (value != null) {
            int iIntValue = value.intValue();
            c14524b.f45771a.setBackgroundColor(iIntValue);
            AbstractC9345p3.m9937a(viewEnvironment, iIntValue);
        }
        Context context = c14524b.f45771a.getContext();
        AbstractC16544l.m18093f(context, "getContext(...)");
        StepStyles.UiStepStyle uiStepStyle2 = c18500e.f58961Z;
        Drawable drawableBackgroundImageDrawable = uiStepStyle2 != null ? uiStepStyle2.backgroundImageDrawable(context) : null;
        if (drawableBackgroundImageDrawable != null) {
            c14524b.f45771a.setBackground(drawableBackgroundImageDrawable);
            c14524b.f45774d.setBackgroundColor(0);
        }
        this.f64338c.mo985d(c14524b, rendering, viewEnvironment, ((C4952r) this.f64339d.f17484Z).f16155a);
    }
}
