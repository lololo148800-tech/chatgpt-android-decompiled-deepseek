package p999s;

import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.widget.TextView;

/* JADX INFO: renamed from: s.a0 */
/* JADX INFO: loaded from: classes.dex */
public class C19334a0 extends AbstractC19340c0 {
    @Override // p999s.AbstractC19340c0
    /* JADX INFO: renamed from: a */
    public void mo20433a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection((TextDirectionHeuristic) C19343d0.m20448e(textView, TextDirectionHeuristics.FIRSTSTRONG_LTR, "getTextDirectionHeuristic"));
    }
}
