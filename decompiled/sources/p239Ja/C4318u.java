package p239Ja;

import android.view.View;
import android.widget.AdapterView;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import p999s.C19285B0;
import p999s.C19300J;
import p999s.C19306M;

/* JADX INFO: renamed from: Ja.u */
/* JADX INFO: loaded from: classes.dex */
public final class C4318u implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f14080Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f14081Z;

    public /* synthetic */ C4318u(Object obj, int i10) {
        this.f14080Y = i10;
        this.f14081Z = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        Object item;
        switch (this.f14080Y) {
            case 0:
                MaterialAutoCompleteTextView materialAutoCompleteTextView = (MaterialAutoCompleteTextView) this.f14081Z;
                if (i10 < 0) {
                    C19285B0 c19285b0 = materialAutoCompleteTextView.f36703s0;
                    item = !c19285b0.f61106L0.isShowing() ? null : c19285b0.f61109o0.getSelectedItem();
                } else {
                    item = materialAutoCompleteTextView.getAdapter().getItem(i10);
                }
                MaterialAutoCompleteTextView.m13653a(materialAutoCompleteTextView, item);
                AdapterView.OnItemClickListener onItemClickListener = materialAutoCompleteTextView.getOnItemClickListener();
                C19285B0 c19285b1 = materialAutoCompleteTextView.f36703s0;
                if (onItemClickListener != null) {
                    if (view == null || i10 < 0) {
                        view = c19285b1.f61106L0.isShowing() ? c19285b1.f61109o0.getSelectedView() : null;
                        i10 = !c19285b1.f61106L0.isShowing() ? -1 : c19285b1.f61109o0.getSelectedItemPosition();
                        j10 = !c19285b1.f61106L0.isShowing() ? Long.MIN_VALUE : c19285b1.f61109o0.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(c19285b1.f61109o0, view, i10, j10);
                }
                c19285b1.dismiss();
                break;
            default:
                C19300J c19300j = (C19300J) this.f14081Z;
                c19300j.f61149T0.setSelection(i10);
                C19306M c19306m = c19300j.f61149T0;
                if (c19306m.getOnItemClickListener() != null) {
                    c19306m.performItemClick(view, i10, c19300j.f61146Q0.getItemId(i10));
                }
                c19300j.dismiss();
                break;
        }
    }
}
