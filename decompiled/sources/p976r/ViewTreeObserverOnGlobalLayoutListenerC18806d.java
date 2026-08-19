package p976r;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import p999s.C19295G0;
import p999s.C19300J;
import p999s.C19306M;

/* JADX INFO: renamed from: r.d */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC18806d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f59800Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f59801Z;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC18806d(Object obj, int i10) {
        this.f59800Y = i10;
        this.f59801Z = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f59800Y) {
            case 0:
                ViewOnKeyListenerC18808f viewOnKeyListenerC18808f = (ViewOnKeyListenerC18808f) this.f59801Z;
                if (viewOnKeyListenerC18808f.mo20082a()) {
                    ArrayList arrayList = viewOnKeyListenerC18808f.f59823t0;
                    if (arrayList.size() > 0 && !((C18807e) arrayList.get(0)).f59802a.f61105K0) {
                        View view = viewOnKeyListenerC18808f.f59805A0;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((C18807e) it.next()).f59802a.mo20083f();
                            }
                        } else {
                            viewOnKeyListenerC18808f.dismiss();
                        }
                        break;
                    }
                }
                break;
            case 1:
                ViewOnKeyListenerC18801C viewOnKeyListenerC18801C = (ViewOnKeyListenerC18801C) this.f59801Z;
                if (viewOnKeyListenerC18801C.mo20082a()) {
                    C19295G0 c19295g0 = viewOnKeyListenerC18801C.f59773t0;
                    if (!c19295g0.f61105K0) {
                        View view2 = viewOnKeyListenerC18801C.f59778y0;
                        if (view2 != null && view2.isShown()) {
                            c19295g0.mo20083f();
                        } else {
                            viewOnKeyListenerC18801C.dismiss();
                        }
                    }
                }
                break;
            case 2:
                C19306M c19306m = (C19306M) this.f59801Z;
                if (!c19306m.getInternalPopup().mo20364a()) {
                    c19306m.f61175t0.mo20373l(c19306m.getTextDirection(), c19306m.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = c19306m.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
                break;
            default:
                C19300J c19300j = (C19300J) this.f59801Z;
                C19306M c19306m2 = c19300j.f61149T0;
                c19300j.getClass();
                if (c19306m2.isAttachedToWindow() && c19306m2.getGlobalVisibleRect(c19300j.f61147R0)) {
                    c19300j.m20376q();
                    c19300j.mo20083f();
                } else {
                    c19300j.dismiss();
                }
                break;
        }
    }
}
