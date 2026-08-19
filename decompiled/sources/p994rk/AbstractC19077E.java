package p994rk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.openai.chatgpt.R;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.styling.StyleElements;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1120y4.C21382i;
import p310M9.C5311e;
import p571X9.AbstractC9123E2;
import p822j2.C16056m;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: rk.E */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC19077E {
    /* JADX INFO: renamed from: a */
    public static final LinearLayout m20297a(C19074D c19074d, C5311e c5311e, ArrayList arrayList, List children) {
        Double dp2;
        Double dp3;
        Double dp4;
        Double dp5;
        Double dp6;
        AbstractC16544l.m18094g(c19074d, "<this>");
        AbstractC16544l.m18094g(children, "children");
        Context context = (Context) c5311e.f17484Z;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.pi2_ui_footer, (ViewGroup) null, false);
        int i10 = R.id.footer_begin_margin;
        if (((Guideline) AbstractC9123E2.m9654b(viewInflate, R.id.footer_begin_margin)) != null) {
            LinearLayout linearLayout = (LinearLayout) viewInflate;
            int i11 = R.id.footer_container_inner;
            ConstraintLayout constraintLayout = (ConstraintLayout) AbstractC9123E2.m9654b(viewInflate, R.id.footer_container_inner);
            if (constraintLayout != null) {
                i11 = R.id.footer_end_margin;
                if (((Guideline) AbstractC9123E2.m9654b(viewInflate, R.id.footer_end_margin)) != null) {
                    i11 = R.id.hairline;
                    View viewM9654b = AbstractC9123E2.m9654b(viewInflate, R.id.hairline);
                    if (viewM9654b != null) {
                        UiComponentConfig.Footer footer = c19074d.f60751Y;
                        Integer backgroundColor = footer.getBackgroundColor();
                        if (backgroundColor != null) {
                            linearLayout.setBackgroundColor(backgroundColor.intValue());
                        }
                        StyleElements.DPSizeSet padding = footer.getPadding();
                        if (padding != null) {
                            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.startEndMargin);
                            StyleElements.DPSize left = padding.getLeft();
                            int iM21761a = (left == null || (dp6 = left.getDp()) == null) ? 0 : (int) C21382i.m21761a(dp6.doubleValue());
                            if (iM21761a < dimensionPixelOffset) {
                                iM21761a = dimensionPixelOffset;
                            }
                            StyleElements.DPSize right = padding.getRight();
                            int iM21761a2 = (right == null || (dp5 = right.getDp()) == null) ? 0 : (int) C21382i.m21761a(dp5.doubleValue());
                            if (iM21761a2 >= dimensionPixelOffset) {
                                dimensionPixelOffset = iM21761a2;
                            }
                            StyleElements.DPSize top = padding.getTop();
                            int iM21761a3 = (top == null || (dp4 = top.getDp()) == null) ? 0 : (int) C21382i.m21761a(dp4.doubleValue());
                            StyleElements.DPSize bottom = padding.getBottom();
                            constraintLayout.setPadding(iM21761a, iM21761a3, dimensionPixelOffset, (bottom == null || (dp3 = bottom.getDp()) == null) ? 0 : (int) C21382i.m21761a(dp3.doubleValue()));
                        }
                        StyleElements.DPSizeSet borderWidth = footer.getBorderWidth();
                        if (borderWidth != null) {
                            ViewGroup.LayoutParams layoutParams = viewM9654b.getLayoutParams();
                            if (layoutParams == null) {
                                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                            }
                            StyleElements.DPSize top2 = borderWidth.getTop();
                            layoutParams.height = (top2 == null || (dp2 = top2.getDp()) == null) ? 0 : (int) C21382i.m21761a(dp2.doubleValue());
                            viewM9654b.setLayoutParams(layoutParams);
                        } else {
                            ViewGroup.LayoutParams layoutParams2 = viewM9654b.getLayoutParams();
                            if (layoutParams2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                            }
                            layoutParams2.height = (int) C21382i.m21761a(1.0d);
                            viewM9654b.setLayoutParams(layoutParams2);
                        }
                        C16056m c16056m = new C16056m();
                        c16056m.m17636c(constraintLayout);
                        List<View> list = children;
                        ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(list, 10));
                        for (View view : list) {
                            view.setId(View.generateViewId());
                            view.setSaveEnabled(false);
                            constraintLayout.addView(view);
                            arrayList2.add(Integer.valueOf(view.getId()));
                        }
                        AbstractC19157d2.m20310b(constraintLayout, c16056m, arrayList, arrayList2, StyleElements.PositionType.CENTER, 0);
                        c16056m.m17634a(constraintLayout);
                        AbstractC16544l.m18093f(linearLayout, "getRoot(...)");
                        return linearLayout;
                    }
                }
            }
            i10 = i11;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }
}
