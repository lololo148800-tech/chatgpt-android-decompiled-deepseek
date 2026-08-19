package p994rk;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.openai.chatgpt.R;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.styling.StyleElements;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1120y4.C21382i;
import p310M9.C5311e;
import p822j2.C16056m;
import p909nm.AbstractC17682p;
import uk.C20374d;

/* JADX INFO: renamed from: rk.M */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC19101M {
    /* JADX INFO: renamed from: a */
    public static final ConstraintLayout m20298a(C19095K c19095k, C5311e c5311e, ArrayList arrayList, List children) {
        ConstraintLayout constraintLayout;
        StyleElements.Axis axisValue;
        StyleElements.DPSize gapValue;
        Double dp2;
        AbstractC16544l.m18094g(c19095k, "<this>");
        AbstractC16544l.m18094g(children, "children");
        View viewInflate = ((LayoutInflater) c5311e.f17485o0).inflate(R.layout.pi2_ui_horizontal_stack, (ViewGroup) null, false);
        if (viewInflate == null) {
            throw new NullPointerException("rootView");
        }
        ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate;
        C20374d c20374d = new C20374d(constraintLayout2, 1);
        C16056m c16056m = new C16056m();
        c16056m.m17636c(constraintLayout2);
        List list = children;
        ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(list, 10));
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            constraintLayout = (ConstraintLayout) c20374d.f64428b;
            if (!zHasNext) {
                break;
            }
            View view = (View) it.next();
            view.setId(View.generateViewId());
            view.setSaveEnabled(false);
            constraintLayout.addView(view);
            arrayList2.add(Integer.valueOf(view.getId()));
        }
        UiComponentConfig.HorizontalStackComponentStyle styles = c19095k.f60781Y.getStyles();
        int iM21761a = (int) C21382i.m21761a((styles == null || (gapValue = styles.getGapValue()) == null || (dp2 = gapValue.getDp()) == null) ? 16.0d : dp2.doubleValue());
        if (styles == null || (axisValue = styles.getAxisValue()) == null) {
            axisValue = StyleElements.Axis.HORIZONTAL;
        }
        if (axisValue == StyleElements.Axis.HORIZONTAL) {
            AbstractC19157d2.m20309a(constraintLayout, c16056m, arrayList, arrayList2, styles != null ? styles.getChildSizesValue() : null, styles != null ? styles.getAlignmentValue() : null, iM21761a);
        } else {
            AbstractC19157d2.m20310b(constraintLayout, c16056m, arrayList, arrayList2, styles != null ? styles.getAlignmentValue() : null, iM21761a);
        }
        if (styles != null) {
            ((LinkedList) c5311e.f17486p0).add(new C19098L(c20374d, styles));
        }
        c16056m.m17634a(constraintLayout);
        return constraintLayout;
    }
}
