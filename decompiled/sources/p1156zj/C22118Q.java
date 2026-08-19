package p1156zj;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.openai.chatgpt.R;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.styling.TextBasedComponentStyle;
import fk.C13690k;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.C0644w;
import p046Bk.ViewOnClickListenerC1332J;
import p084D4.AbstractC1893Q;
import p084D4.AbstractC1933p0;
import p099Dj.C2067e;
import p1039ud.C20198o;
import p1110xk.AbstractC21295r;
import p1120y4.C21382i;
import p1132yk.AbstractC21548b;
import p396Q4.InterfaceC6571a;
import p523V9.AbstractC8040Z5;
import p571X9.AbstractC9106B3;
import p571X9.AbstractC9123E2;

/* JADX INFO: renamed from: zj.Q */
/* JADX INFO: loaded from: classes3.dex */
public final class C22118Q extends AbstractC1893Q {

    /* JADX INFO: renamed from: d */
    public final ArrayList f69921d;

    /* JADX INFO: renamed from: e */
    public final StepStyles.GovernmentIdStepStyle f69922e;

    /* JADX INFO: renamed from: f */
    public final NextStep.GovernmentId.AssetConfig.SelectPage f69923f;

    /* JADX INFO: renamed from: g */
    public final C20198o f69924g;

    /* JADX INFO: renamed from: i */
    public final boolean f69926i;

    /* JADX INFO: renamed from: h */
    public final HashMap f69925h = new HashMap();

    /* JADX INFO: renamed from: j */
    public boolean f69927j = true;

    public C22118Q(Context context, ArrayList arrayList, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, NextStep.GovernmentId.AssetConfig.SelectPage selectPage, C20198o c20198o) {
        this.f69921d = arrayList;
        this.f69922e = governmentIdStepStyle;
        this.f69923f = selectPage;
        this.f69924g = c20198o;
        this.f69926i = !AbstractC8040Z5.m8406b(context, R.attr.personaGovIdSelectHideIcon);
    }

    @Override // p084D4.AbstractC1893Q
    /* JADX INFO: renamed from: a */
    public final int mo2898a() {
        return this.f69921d.size();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003d  */
    @Override // p084D4.AbstractC1893Q
    /* JADX INFO: renamed from: d */
    public final void mo2901d(AbstractC1933p0 abstractC1933p0, int i10) {
        UiComponentConfig.RemoteImage iconPassport;
        int i11;
        Drawable drawableMutate;
        Integer governmentIdIconFillColor;
        Integer governmentIdIconStrokeColor;
        C22203w c22203w = (C22203w) this.f69921d.get(i10);
        C2067e c2067e = (C2067e) ((C13690k) abstractC1933p0).f43189u;
        c2067e.f6340e.setText(c22203w.f70391o0);
        EnumC22136Z0 enumC22136Z0 = c22203w.f70389Y;
        int iOrdinal = enumC22136Z0.ordinal();
        NextStep.GovernmentId.AssetConfig.SelectPage selectPage = this.f69923f;
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        throw new C0644w();
                    }
                    if (selectPage == null || (iconPassport = selectPage.getIconNationalId()) == null) {
                        if (selectPage != null) {
                            iconPassport = selectPage.getIconGovernmentId();
                        } else {
                            iconPassport = null;
                        }
                    }
                } else if (selectPage != null) {
                    iconPassport = selectPage.getIconDriversLicense();
                } else {
                    iconPassport = null;
                }
            } else if (selectPage != null) {
                iconPassport = selectPage.getIconGovernmentId();
            } else {
                iconPassport = null;
            }
        } else if (selectPage != null) {
            iconPassport = selectPage.getIconPassport();
        } else {
            iconPassport = null;
        }
        ConstraintLayout constraintLayout = c2067e.f6339d;
        Object tag = constraintLayout.getTag(R.id.pi2_remote_image_view);
        View view = tag instanceof View ? (View) tag : null;
        if (view != null) {
            constraintLayout.removeView(view);
        }
        TextView textView = c2067e.f6340e;
        boolean z6 = this.f69926i;
        ConstraintLayout constraintLayout2 = c2067e.f6336a;
        if (z6) {
            ImageView imageView = c2067e.f6338c;
            if (iconPassport != null) {
                constraintLayout.setTag(R.id.pi2_remote_image_view, AbstractC21548b.m21828a(iconPassport, constraintLayout, true));
                imageView.setVisibility(8);
                textView.setPaddingRelative((int) C21382i.m21761a(8.0d), textView.getPaddingTop(), textView.getPaddingEnd(), textView.getPaddingBottom());
            } else {
                imageView.setVisibility(0);
                HashMap map = this.f69925h;
                if (map.get(Integer.valueOf(i10)) != null) {
                    imageView.setImageDrawable((Drawable) map.get(Integer.valueOf(i10)));
                } else {
                    int iOrdinal2 = enumC22136Z0.ordinal();
                    if (iOrdinal2 == 0) {
                        i11 = R.drawable.pi2_governmentid_world;
                    } else if (iOrdinal2 == 1) {
                        i11 = R.drawable.pi2_governmentid_card;
                    } else if (iOrdinal2 == 2) {
                        i11 = R.drawable.pi2_governmentid_flag;
                    } else {
                        if (iOrdinal2 != 3) {
                            throw new C0644w();
                        }
                        i11 = R.drawable.pi2_governmentid_house;
                    }
                    Drawable drawableM9636b = AbstractC9106B3.m9636b(constraintLayout2.getContext(), i11);
                    if (drawableM9636b != null) {
                        StepStyles.GovernmentIdStepStyle governmentIdStepStyle = this.f69922e;
                        Integer numValueOf = (governmentIdStepStyle == null || (governmentIdIconStrokeColor = governmentIdStepStyle.getGovernmentIdIconStrokeColor()) == null) ? null : Integer.valueOf(governmentIdIconStrokeColor.intValue());
                        Integer numValueOf2 = (governmentIdStepStyle == null || (governmentIdIconFillColor = governmentIdStepStyle.getGovernmentIdIconFillColor()) == null) ? null : Integer.valueOf(governmentIdIconFillColor.intValue());
                        Context context = constraintLayout2.getContext();
                        AbstractC16544l.m18093f(context, "getContext(...)");
                        ArrayList arrayList = new ArrayList();
                        if (numValueOf != null) {
                            drawableM9636b.mutate().setTint(numValueOf.intValue());
                        }
                        Drawable drawableM9636b2 = AbstractC9106B3.m9636b(context, R.drawable.pi2_governmentid_circle_background);
                        if (numValueOf2 != null && drawableM9636b2 != null && (drawableMutate = drawableM9636b2.mutate()) != null) {
                            drawableMutate.setTint(numValueOf2.intValue());
                        }
                        if (drawableM9636b2 != null) {
                            arrayList.add(drawableM9636b2);
                        }
                        arrayList.add(drawableM9636b);
                        Drawable drawableMutate2 = new LayerDrawable((Drawable[]) arrayList.toArray(new Drawable[0])).mutate();
                        AbstractC16544l.m18093f(drawableMutate2, "mutate(...)");
                        imageView.setImageDrawable(drawableMutate2);
                        Integer numValueOf3 = Integer.valueOf(i10);
                        Drawable drawable = imageView.getDrawable();
                        AbstractC16544l.m18093f(drawable, "getDrawable(...)");
                        map.put(numValueOf3, drawable);
                    }
                }
                textView.setPaddingRelative((int) C21382i.m21761a(8.0d), textView.getPaddingTop(), textView.getPaddingEnd(), textView.getPaddingBottom());
            }
        } else {
            constraintLayout.setVisibility(8);
            textView.setPaddingRelative(0, textView.getPaddingTop(), textView.getPaddingEnd(), textView.getPaddingBottom());
        }
        constraintLayout2.setOnClickListener(new ViewOnClickListenerC1332J(this, 7, c22203w));
        constraintLayout2.setEnabled(this.f69927j);
    }

    @Override // p084D4.AbstractC1893Q
    /* JADX INFO: renamed from: e */
    public final AbstractC1933p0 mo2902e(ViewGroup parent, int i10) {
        Double governmentIdSelectOptionMinRowHeight;
        Integer backgroundColorValue;
        Integer chevronColor;
        TextBasedComponentStyle governmentIdVerticalOptionTextStyle;
        AbstractC16544l.m18094g(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.pi2_governmentid_idlist, parent, false);
        int i11 = R.id.chevron;
        ImageView imageView = (ImageView) AbstractC9123E2.m9654b(viewInflate, R.id.chevron);
        if (imageView != null) {
            i11 = R.id.icon;
            ImageView imageView2 = (ImageView) AbstractC9123E2.m9654b(viewInflate, R.id.icon);
            if (imageView2 != null) {
                i11 = R.id.icon_container;
                ConstraintLayout constraintLayout = (ConstraintLayout) AbstractC9123E2.m9654b(viewInflate, R.id.icon_container);
                if (constraintLayout != null) {
                    i11 = R.id.label;
                    TextView textView = (TextView) AbstractC9123E2.m9654b(viewInflate, R.id.label);
                    if (textView != null) {
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate;
                        C13690k c13690k = new C13690k(new C2067e(constraintLayout2, imageView, imageView2, constraintLayout, textView, constraintLayout2));
                        InterfaceC6571a interfaceC6571a = c13690k.f43189u;
                        AbstractC16544l.m18093f(interfaceC6571a, "<get-binding>(...)");
                        C2067e c2067e = (C2067e) interfaceC6571a;
                        StepStyles.GovernmentIdStepStyle governmentIdStepStyle = this.f69922e;
                        if (governmentIdStepStyle != null && (governmentIdVerticalOptionTextStyle = governmentIdStepStyle.getGovernmentIdVerticalOptionTextStyle()) != null) {
                            AbstractC21295r.m21637c(c2067e.f6340e, governmentIdVerticalOptionTextStyle);
                        }
                        if (governmentIdStepStyle != null && (chevronColor = governmentIdStepStyle.getChevronColor()) != null) {
                            c2067e.f6337b.setColorFilter(chevronColor.intValue());
                        }
                        if (governmentIdStepStyle != null && (backgroundColorValue = governmentIdStepStyle.getBackgroundColorValue()) != null) {
                            int iIntValue = backgroundColorValue.intValue();
                            Integer activeOptionBackgroundColorValue = governmentIdStepStyle.getActiveOptionBackgroundColorValue();
                            if (activeOptionBackgroundColorValue != null) {
                                c2067e.f6336a.setBackground(new RippleDrawable(new ColorStateList(new int[][]{new int[0]}, new int[]{activeOptionBackgroundColorValue.intValue()}), new ColorDrawable(iIntValue), null));
                            }
                        }
                        if (governmentIdStepStyle != null && (governmentIdSelectOptionMinRowHeight = governmentIdStepStyle.getGovernmentIdSelectOptionMinRowHeight()) != null) {
                            c2067e.f6341f.setMinHeight((int) C21382i.m21761a(governmentIdSelectOptionMinRowHeight.doubleValue()));
                        }
                        return c13690k;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
