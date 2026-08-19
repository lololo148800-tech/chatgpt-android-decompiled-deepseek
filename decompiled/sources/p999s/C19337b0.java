package p999s;

import android.text.StaticLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: s.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C19337b0 extends C19334a0 {
    @Override // p999s.C19334a0, p999s.AbstractC19340c0
    /* JADX INFO: renamed from: a */
    public void mo20433a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // p999s.AbstractC19340c0
    /* JADX INFO: renamed from: b */
    public boolean mo20434b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
