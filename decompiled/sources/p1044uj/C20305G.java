package p1044uj;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.openai.chatgpt.R;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.p687ui.ThemeableLottieAnimationView;
import fk.C13690k;
import kotlin.jvm.internal.AbstractC16544l;
import p007A5.AbstractC0371f;
import p021Aj.ViewOnClickListenerC0529n;
import p025An.C0644w;
import p046Bk.ViewOnClickListenerC1332J;
import p084D4.AbstractC1893Q;
import p084D4.AbstractC1933p0;
import p1039ud.C20198o;
import p1065vj.C20630b;
import p1065vj.C20632d;
import p1075w5.C20830h;
import p1110xk.AbstractC21284g;
import p1110xk.AbstractC21295r;
import p1120y4.C21382i;
import p1144z5.C21797a;
import p279L1.VOxZ.sVoFrD;
import p396Q4.InterfaceC6571a;
import p520V5.AbstractC7785n;
import p520V5.C7764B;
import p520V5.C7781j;
import p571X9.AbstractC9123E2;
import p864l5.C16826m;
import p864l5.InterfaceC16818e;
import p909nm.C17689w;

/* JADX INFO: renamed from: uj.G */
/* JADX INFO: loaded from: classes3.dex */
public final class C20305G extends AbstractC1893Q {

    /* JADX INFO: renamed from: d */
    public final InterfaceC16818e f64187d;

    /* JADX INFO: renamed from: e */
    public final C20347l0 f64188e;

    /* JADX INFO: renamed from: f */
    public final StepStyles.DocumentStepStyle f64189f;

    /* JADX INFO: renamed from: g */
    public final LayoutInflater f64190g;

    /* JADX INFO: renamed from: h */
    public Object f64191h;

    /* JADX INFO: renamed from: i */
    public C20198o f64192i;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // p084D4.AbstractC1893Q
    /* JADX INFO: renamed from: a */
    public final int mo2898a() {
        return this.f64191h.size();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // p084D4.AbstractC1893Q
    /* JADX INFO: renamed from: c */
    public final int mo2900c(int i10) {
        AbstractC20303E abstractC20303E = (AbstractC20303E) this.f64191h.get(i10);
        if (abstractC20303E instanceof C20299A) {
            return R.layout.pi2_document_review_add_document_tile;
        }
        if (abstractC20303E instanceof AbstractC20302D) {
            return R.layout.pi2_document_review_document_tile;
        }
        throw new C0644w();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // p084D4.AbstractC1893Q
    /* JADX INFO: renamed from: d */
    public final void mo2901d(AbstractC1933p0 abstractC1933p0, int i10) {
        AbstractC20303E abstractC20303E = (AbstractC20303E) this.f64191h.get(i10);
        if (abstractC20303E instanceof C20299A) {
            C20630b c20630b = (C20630b) ((C13690k) abstractC1933p0).f43189u;
            c20630b.f65476b.setEnabled(((C20299A) abstractC20303E).f64177a);
            c20630b.f65476b.setOnClickListener(new ViewOnClickListenerC0529n(this, 11));
            return;
        }
        if (abstractC20303E instanceof AbstractC20302D) {
            C20632d c20632d = (C20632d) ((C13690k) abstractC1933p0).f43189u;
            c20632d.f65491g.setOnClickListener(new ViewOnClickListenerC1332J(this, 5, (AbstractC20302D) abstractC20303E));
            ImageView imageView = c20632d.f65488d;
            AbstractC0371f.m1003c(imageView).m21440a();
            imageView.setImageDrawable(null);
            AbstractC20302D abstractC20302D = (AbstractC20302D) abstractC20303E;
            boolean z6 = abstractC20302D instanceof C20300B;
            TextView textView = c20632d.f65487c;
            ThemeableLottieAnimationView themeableLottieAnimationView = c20632d.f65491g;
            CircularProgressIndicator circularProgressIndicator = c20632d.f65490f;
            if (z6) {
                C20300B c20300b = (C20300B) abstractC20303E;
                imageView.setVisibility(c20300b.f64179b.f64303o0 < 100 ? 4 : 0);
                themeableLottieAnimationView.setVisibility(8);
                textView.setText(c20300b.f64178a.getName());
                C20336g c20336g = c20300b.f64179b;
                circularProgressIndicator.setVisibility(c20336g.f64303o0 < 100 ? 0 : 8);
                circularProgressIndicator.setProgress(c20336g.f64303o0);
                return;
            }
            if (abstractC20302D instanceof C20301C) {
                imageView.setVisibility(0);
                boolean zM18089b = AbstractC16544l.m18089b(((C20301C) abstractC20302D).f64184d, "application/pdf");
                InterfaceC16818e interfaceC16818e = this.f64187d;
                if (zM18089b) {
                    Integer numValueOf = Integer.valueOf(R.drawable.pi2_ic_file_pdf);
                    C20830h c20830h = new C20830h(imageView.getContext());
                    c20830h.f66187c = numValueOf;
                    c20830h.m21438d(imageView);
                    c20830h.m21437c(100, 100);
                    ((C16826m) interfaceC16818e).m18564b(c20830h.m21435a());
                } else {
                    String str = ((C20301C) abstractC20303E).f64181a;
                    C20830h c20830h2 = new C20830h(imageView.getContext());
                    c20830h2.f66187c = str;
                    c20830h2.m21438d(imageView);
                    c20830h2.f66193i = new C21797a(100);
                    c20830h2.f66193i = new C21797a(100);
                    c20830h2.m21437c(500, 500);
                    ((C16826m) interfaceC16818e).m18564b(c20830h2.m21435a());
                }
                circularProgressIndicator.setVisibility(8);
                themeableLottieAnimationView.setVisibility(0);
                textView.setText(((C20301C) abstractC20303E).f64182b);
            }
        }
    }

    @Override // p084D4.AbstractC1893Q
    /* JADX INFO: renamed from: e */
    public final AbstractC1933p0 mo2902e(ViewGroup parent, int i10) {
        C13690k c13690k;
        C7781j c7781j;
        C7781j c7781j2;
        AbstractC16544l.m18094g(parent, "parent");
        View viewInflate = this.f64190g.inflate(i10, parent, false);
        StepStyles.DocumentStepStyle documentStepStyle = this.f64189f;
        int i11 = R.id.card_view;
        if (i10 == R.layout.pi2_document_review_add_document_tile) {
            ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) AbstractC9123E2.m9654b(viewInflate, R.id.add_button);
            if (themeableLottieAnimationView != null) {
                MaterialCardView materialCardView = (MaterialCardView) AbstractC9123E2.m9654b(viewInflate, R.id.card_view);
                if (materialCardView != null) {
                    c13690k = new C13690k(new C20630b((ConstraintLayout) viewInflate, themeableLottieAnimationView, materialCardView));
                    InterfaceC6571a interfaceC6571a = c13690k.f43189u;
                    C20630b c20630b = (C20630b) interfaceC6571a;
                    Context context = c20630b.f65475a.getContext();
                    C7764B c7764bM8047e = AbstractC7785n.m8047e(R.raw.pi2_add_document_button, context, AbstractC7785n.m8052j(context, R.raw.pi2_add_document_button));
                    if (c7764bM8047e != null && (c7781j2 = c7764bM8047e.f24539a) != null) {
                        c20630b.f65476b.setComposition(c7781j2);
                    }
                    AbstractC16544l.m18093f(interfaceC6571a, "<get-binding>(...)");
                    C20630b c20630b2 = (C20630b) interfaceC6571a;
                    if (documentStepStyle != null) {
                        Double imagePreviewBorderRadius = documentStepStyle.getImagePreviewBorderRadius();
                        MaterialCardView materialCardView2 = c20630b2.f65477c;
                        if (imagePreviewBorderRadius != null) {
                            materialCardView2.setRadius((float) C21382i.m21761a(imagePreviewBorderRadius.doubleValue()));
                        }
                        Double imagePreviewBorderWidth = documentStepStyle.getImagePreviewBorderWidth();
                        if (imagePreviewBorderWidth != null) {
                            materialCardView2.setStrokeWidth((int) Math.ceil(C21382i.m21761a(imagePreviewBorderWidth.doubleValue())));
                        }
                        Integer imagePreviewBorderColor = documentStepStyle.getImagePreviewBorderColor();
                        if (imagePreviewBorderColor != null) {
                            materialCardView2.setStrokeColor(imagePreviewBorderColor.intValue());
                        }
                        Integer imagePreviewMainAreaFillColor = documentStepStyle.getImagePreviewMainAreaFillColor();
                        ThemeableLottieAnimationView themeableLottieAnimationView2 = c20630b2.f65476b;
                        if (imagePreviewMainAreaFillColor != null) {
                            themeableLottieAnimationView2.setBackgroundColor(imagePreviewMainAreaFillColor.intValue());
                        }
                        AbstractC21284g.m21628d(themeableLottieAnimationView2, documentStepStyle.getImagePreviewPlusIconStrokeColor(), documentStepStyle.getImagePreviewPlusIconFillColor(), null, new String[]{"#FFFFFF"}, new String[]{"#5B3FD3"}, new String[0]);
                    }
                }
            } else {
                i11 = R.id.add_button;
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
        }
        if (i10 != R.layout.pi2_document_review_document_tile) {
            throw new IllegalStateException(("Unknown view type " + i10).toString());
        }
        MaterialCardView materialCardView3 = (MaterialCardView) AbstractC9123E2.m9654b(viewInflate, R.id.card_view);
        if (materialCardView3 != null) {
            i11 = R.id.filename_view;
            TextView textView = (TextView) AbstractC9123E2.m9654b(viewInflate, R.id.filename_view);
            if (textView != null) {
                i11 = R.id.image_view;
                ImageView imageView = (ImageView) AbstractC9123E2.m9654b(viewInflate, R.id.image_view);
                if (imageView != null) {
                    i11 = R.id.image_view_container;
                    LinearLayout linearLayout = (LinearLayout) AbstractC9123E2.m9654b(viewInflate, R.id.image_view_container);
                    if (linearLayout != null) {
                        i11 = R.id.loading_animation;
                        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) AbstractC9123E2.m9654b(viewInflate, R.id.loading_animation);
                        if (circularProgressIndicator != null) {
                            i11 = R.id.remove_button;
                            ThemeableLottieAnimationView themeableLottieAnimationView3 = (ThemeableLottieAnimationView) AbstractC9123E2.m9654b(viewInflate, R.id.remove_button);
                            if (themeableLottieAnimationView3 != null) {
                                c13690k = new C13690k(new C20632d((ConstraintLayout) viewInflate, materialCardView3, textView, imageView, linearLayout, circularProgressIndicator, themeableLottieAnimationView3));
                                InterfaceC6571a interfaceC6571a2 = c13690k.f43189u;
                                C20632d c20632d = (C20632d) interfaceC6571a2;
                                Context context2 = c20632d.f65485a.getContext();
                                C7764B c7764bM8047e2 = AbstractC7785n.m8047e(R.raw.pi2_remove_document_button, context2, AbstractC7785n.m8052j(context2, R.raw.pi2_remove_document_button));
                                if (c7764bM8047e2 != null && (c7781j = c7764bM8047e2.f24539a) != null) {
                                    c20632d.f65491g.setComposition(c7781j);
                                }
                                AbstractC16544l.m18093f(interfaceC6571a2, "<get-binding>(...)");
                                C20632d c20632d2 = (C20632d) interfaceC6571a2;
                                if (documentStepStyle != null) {
                                    Integer strokeColorValue = documentStepStyle.getStrokeColorValue();
                                    CircularProgressIndicator circularProgressIndicator2 = c20632d2.f65490f;
                                    if (strokeColorValue != null) {
                                        circularProgressIndicator2.setIndicatorColor(strokeColorValue.intValue());
                                    }
                                    Integer fillColorValue = documentStepStyle.getFillColorValue();
                                    if (fillColorValue != null) {
                                        circularProgressIndicator2.setTrackColor(fillColorValue.intValue());
                                    }
                                    Integer imagePreviewCropAreaFillColor = documentStepStyle.getImagePreviewCropAreaFillColor();
                                    if (imagePreviewCropAreaFillColor != null) {
                                        c20632d2.f65488d.setBackgroundColor(imagePreviewCropAreaFillColor.intValue());
                                    }
                                    Double imagePreviewBorderRadius2 = documentStepStyle.getImagePreviewBorderRadius();
                                    MaterialCardView materialCardView4 = c20632d2.f65486b;
                                    if (imagePreviewBorderRadius2 != null) {
                                        materialCardView4.setRadius((float) C21382i.m21761a(imagePreviewBorderRadius2.doubleValue()));
                                    }
                                    Double imagePreviewBorderWidth2 = documentStepStyle.getImagePreviewBorderWidth();
                                    if (imagePreviewBorderWidth2 != null) {
                                        materialCardView4.setStrokeWidth((int) Math.ceil(C21382i.m21761a(imagePreviewBorderWidth2.doubleValue())));
                                    }
                                    Integer imagePreviewBorderColor2 = documentStepStyle.getImagePreviewBorderColor();
                                    if (imagePreviewBorderColor2 != null) {
                                        materialCardView4.setStrokeColor(imagePreviewBorderColor2.intValue());
                                    }
                                    TextBasedComponentStyle imageNameStyleValue = documentStepStyle.getImageNameStyleValue();
                                    if (imageNameStyleValue != null) {
                                        AbstractC21295r.m21637c(c20632d2.f65487c, imageNameStyleValue);
                                    }
                                    Integer imagePreviewMainAreaFillColor2 = documentStepStyle.getImagePreviewMainAreaFillColor();
                                    if (imagePreviewMainAreaFillColor2 != null) {
                                        c20632d2.f65489e.setBackgroundColor(imagePreviewMainAreaFillColor2.intValue());
                                    }
                                    AbstractC21284g.m21628d(c20632d2.f65491g, documentStepStyle.getImagePreviewXIconStrokeColor(), documentStepStyle.getImagePreviewXIconFillColor(), null, new String[]{"#6B6D82"}, new String[]{"#FFFFFF"}, new String[0]);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
        return c13690k;
    }

    public C20305G(Context context, InterfaceC16818e interfaceC16818e, C20347l0 c20347l0, StepStyles.DocumentStepStyle documentStepStyle) {
        AbstractC16544l.m18094g(interfaceC16818e, sVoFrD.BpcFyUTe);
        this.f64187d = interfaceC16818e;
        this.f64188e = c20347l0;
        this.f64189f = documentStepStyle;
        this.f64190g = LayoutInflater.from(context);
        this.f64191h = C17689w.f56480Y;
    }
}
