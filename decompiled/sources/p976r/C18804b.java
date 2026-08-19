package p976r;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import p999s.AbstractViewOnTouchListenerC19375r0;
import p999s.C19345e;
import p999s.C19348f;
import p999s.C19354h;
import p999s.C19356i;

/* JADX INFO: renamed from: r.b */
/* JADX INFO: loaded from: classes.dex */
public final class C18804b extends AbstractViewOnTouchListenerC19375r0 {

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ int f59798v0 = 0;

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ View f59799w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18804b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f59799w0 = actionMenuItemView;
    }

    @Override // p999s.AbstractViewOnTouchListenerC19375r0
    /* JADX INFO: renamed from: b */
    public final InterfaceC18800B mo20109b() {
        C19345e c19345e;
        switch (this.f59798v0) {
            case 0:
                AbstractC18805c abstractC18805c = ((ActionMenuItemView) this.f59799w0).f32144A0;
                if (abstractC18805c == null || (c19345e = ((C19348f) abstractC18805c).f61280a.f61292F0) == null) {
                    return null;
                }
                return c19345e.m20142a();
            default:
                C19345e c19345e2 = ((C19354h) this.f59799w0).f61286r0.f61291E0;
                if (c19345e2 == null) {
                    return null;
                }
                return c19345e2.m20142a();
        }
    }

    @Override // p999s.AbstractViewOnTouchListenerC19375r0
    /* JADX INFO: renamed from: c */
    public final boolean mo20110c() {
        InterfaceC18800B interfaceC18800BMo20109b;
        switch (this.f59798v0) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f59799w0;
                InterfaceC18813k interfaceC18813k = actionMenuItemView.f32153y0;
                return interfaceC18813k != null && interfaceC18813k.mo11129a(actionMenuItemView.f32150v0) && (interfaceC18800BMo20109b = mo20109b()) != null && interfaceC18800BMo20109b.mo20082a();
            default:
                ((C19354h) this.f59799w0).f61286r0.m20461l();
                return true;
        }
    }

    @Override // p999s.AbstractViewOnTouchListenerC19375r0
    /* JADX INFO: renamed from: d */
    public boolean mo20111d() {
        switch (this.f59798v0) {
            case 1:
                C19356i c19356i = ((C19354h) this.f59799w0).f61286r0;
                if (c19356i.f61293G0 != null) {
                    return false;
                }
                c19356i.m20459f();
                return true;
            default:
                return super.mo20111d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18804b(C19354h c19354h, C19354h c19354h2) {
        super(c19354h2);
        this.f59799w0 = c19354h;
    }
}
