package p769gj;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.openai.chatgpt.R;
import com.squareup.workflow1.p685ui.WorkflowViewStub;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;

/* JADX INFO: renamed from: gj.I */
/* JADX INFO: loaded from: classes3.dex */
public final class C14155I extends FrameLayout {

    /* JADX INFO: renamed from: o0 */
    public final WorkflowViewStub f44520o0;

    /* JADX INFO: renamed from: p0 */
    public SparseArray f44521p0;

    public C14155I(Context context) {
        super(context, null);
        if (getId() == -1) {
            setId(R.id.workflow_layout);
        }
        WorkflowViewStub workflowViewStub = new WorkflowViewStub(context, null, 14);
        workflowViewStub.setUpdatesVisibility(false);
        addView(workflowViewStub, new ViewGroup.LayoutParams(-1, -1));
        this.f44520o0 = workflowViewStub;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        C17296C c17296c = null;
        C14152F c14152f = parcelable instanceof C14152F ? (C14152F) parcelable : null;
        if (c14152f != null) {
            this.f44521p0 = c14152f.f44509Y;
            super.onRestoreInstanceState(((C14152F) parcelable).getSuperState());
            c17296c = C17296C.f55119a;
        }
        if (c17296c == null) {
            super.onRestoreInstanceState(super.onSaveInstanceState());
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        AbstractC16544l.m18091d(parcelableOnSaveInstanceState);
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f44520o0.getActual().saveHierarchyState(sparseArray);
        return new C14152F(parcelableOnSaveInstanceState, sparseArray);
    }
}
