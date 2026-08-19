package p330N4;

import android.view.View;
import android.view.ViewGroup;
import com.openai.chatgpt.R;

/* JADX INFO: renamed from: N4.K */
/* JADX INFO: loaded from: classes.dex */
public final class C5645K extends AbstractC5674y {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ViewGroup f18339a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f18340b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f18341c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC5648N f18342d;

    public C5645K(AbstractC5648N abstractC5648N, ViewGroup viewGroup, View view, View view2) {
        this.f18342d = abstractC5648N;
        this.f18339a = viewGroup;
        this.f18340b = view;
        this.f18341c = view2;
    }

    @Override // p330N4.AbstractC5674y, p330N4.InterfaceC5672w
    /* JADX INFO: renamed from: a */
    public final void mo6066a() {
        this.f18339a.getOverlay().remove(this.f18340b);
    }

    @Override // p330N4.AbstractC5674y, p330N4.InterfaceC5672w
    /* JADX INFO: renamed from: d */
    public final void mo6069d() {
        View view = this.f18340b;
        if (view.getParent() == null) {
            this.f18339a.getOverlay().add(view);
        } else {
            this.f18342d.cancel();
        }
    }

    @Override // p330N4.InterfaceC5672w
    /* JADX INFO: renamed from: e */
    public final void mo6070e(AbstractC5673x abstractC5673x) {
        this.f18341c.setTag(R.id.save_overlay_view, null);
        this.f18339a.getOverlay().remove(this.f18340b);
        abstractC5673x.m6106w(this);
    }
}
