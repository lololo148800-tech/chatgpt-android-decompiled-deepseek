package p976r;

import android.view.ActionProvider;
import p784hb.C14437f;

/* JADX INFO: renamed from: r.o */
/* JADX INFO: loaded from: classes.dex */
public final class ActionProviderVisibilityListenerC18817o implements ActionProvider.VisibilityListener {

    /* JADX INFO: renamed from: a */
    public C14437f f59901a;

    /* JADX INFO: renamed from: b */
    public final ActionProvider f59902b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ MenuItemC18821s f59903c;

    public ActionProviderVisibilityListenerC18817o(MenuItemC18821s menuItemC18821s, ActionProvider actionProvider) {
        this.f59903c = menuItemC18821s;
        this.f59902b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z6) {
        C14437f c14437f = this.f59901a;
        if (c14437f != null) {
            MenuC18814l menuC18814l = ((C18816n) c14437f.f45413Y).f59888n;
            menuC18814l.f59852h = true;
            menuC18814l.m20127p(true);
        }
    }
}
