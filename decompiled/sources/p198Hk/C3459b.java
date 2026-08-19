package p198Hk;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.openai.chatgpt.R;
import fo.C13713j;
import fo.ViewOnAttachStateChangeListenerC13712i;
import io.sentry.android.replay.C15300n;
import io.sentry.android.replay.InterfaceC15290f;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p025An.C0644w;
import p1113xn.AbstractC21322p;
import p174Gk.AbstractC3101c;

/* JADX INFO: renamed from: Hk.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C3459b extends ArrayList {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f10513Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f10514Z;

    public /* synthetic */ C3459b(Object obj, int i10) {
        this.f10513Y = i10;
        this.f10514Z = obj;
    }

    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, mm.i] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, mm.i] */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Object, mm.i] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, mm.i] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, mm.i] */
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) throws IllegalAccessException {
        int i10;
        Window window;
        Window.Callback callback;
        Field field;
        Object obj2 = this.f10514Z;
        switch (this.f10513Y) {
            case 0:
                View element = (View) obj;
                AbstractC16544l.m18094g(element, "element");
                for (C13713j c13713j : ((C3460c) obj2).f10515a) {
                    c13713j.getClass();
                    Object obj3 = AbstractC3101c.f9329a;
                    View rootView = element.getRootView();
                    Object obj4 = AbstractC3464g.f10530a;
                    AbstractC16544l.m18093f(rootView, "rootView");
                    ?? r6 = AbstractC3464g.f10530a;
                    Class cls = (Class) r6.getValue();
                    boolean z6 = false;
                    Window.Callback callback2 = null;
                    if (cls != null ? cls.isInstance(rootView) : false) {
                        i10 = 1;
                    } else {
                        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
                        if (!(layoutParams instanceof WindowManager.LayoutParams)) {
                            layoutParams = null;
                        }
                        WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) layoutParams;
                        i10 = 5;
                        if (layoutParams2 != null) {
                            CharSequence title = layoutParams2.getTitle();
                            if (AbstractC16544l.m18089b(title, "Toast")) {
                                i10 = 4;
                            } else if (AbstractC16544l.m18089b(title, (String) AbstractC3101c.f9329a.getValue()) || AbstractC16544l.m18089b(title, "TooltipPopup")) {
                                i10 = 3;
                            } else {
                                AbstractC16544l.m18093f(title, "title");
                                if (AbstractC21322p.m21699g0(title, "PopupWindow:")) {
                                    i10 = 2;
                                }
                            }
                        }
                    }
                    int iM24h = AbstractC0010F.m24h(i10);
                    if (iM24h == 0) {
                        View rootView2 = element.getRootView();
                        AbstractC16544l.m18093f(rootView2, "rootView");
                        Class cls2 = (Class) r6.getValue();
                        if (cls2 == null || !cls2.isInstance(rootView2) || (field = (Field) AbstractC3464g.f10531b.getValue()) == null) {
                            window = null;
                        } else {
                            Object obj5 = field.get(rootView2);
                            if (obj5 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type android.view.Window");
                            }
                            window = (Window) obj5;
                        }
                        if (window != null && (callback = window.getCallback()) != null) {
                            Object obj6 = AbstractC3462e.f10525Y;
                            while (callback != null) {
                                Class cls3 = (Class) AbstractC3462e.f10525Y.getValue();
                                if (cls3 != null ? cls3.isInstance(callback) : false) {
                                    Field field2 = (Field) AbstractC3462e.f10526Z.getValue();
                                    AbstractC16544l.m18091d(field2);
                                    callback = (Window.Callback) field2.get(callback);
                                } else {
                                    callback2 = callback;
                                }
                            }
                        }
                        if (!(callback2 instanceof Activity)) {
                            if (callback2 instanceof Dialog) {
                                Context context = element.getContext();
                                AbstractC16544l.m18090c(context, "rootView.context");
                                Context applicationContext = context.getApplicationContext();
                                AbstractC16544l.m18090c(applicationContext, "rootView.context.applicationContext");
                                z6 = applicationContext.getResources().getBoolean(R.bool.leak_canary_watcher_watch_dismissed_dialogs);
                            } else {
                                z6 = true;
                            }
                        }
                    } else if (iM24h != 1) {
                        if (iM24h != 2 && iM24h != 3 && iM24h != 4) {
                            throw new C0644w();
                        }
                        z6 = true;
                    }
                    if (z6) {
                        element.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC13712i(c13713j, element));
                    }
                }
                return super.add(element);
            default:
                View element2 = (View) obj;
                AbstractC16544l.m18094g(element2, "element");
                Iterator it = ((C15300n) obj2).f47793o0.iterator();
                while (it.hasNext()) {
                    ((InterfaceC15290f) it.next()).mo16513a(element2, true);
                }
                return super.add(element2);
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection elements) {
        switch (this.f10513Y) {
            case 1:
                AbstractC16544l.m18094g(elements, "elements");
                for (InterfaceC15290f interfaceC15290f : ((C15300n) this.f10514Z).f47793o0) {
                    Iterator it = elements.iterator();
                    while (it.hasNext()) {
                        interfaceC15290f.mo16513a((View) it.next(), true);
                    }
                }
                break;
        }
        return super.addAll(elements);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        switch (this.f10513Y) {
            case 0:
                if (obj instanceof View) {
                    return super.contains((View) obj);
                }
                return false;
            default:
                if (obj instanceof View) {
                    return super.contains((View) obj);
                }
                return false;
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        switch (this.f10513Y) {
            case 0:
                if (obj instanceof View) {
                    return super.indexOf((View) obj);
                }
                return -1;
            default:
                if (obj instanceof View) {
                    return super.indexOf((View) obj);
                }
                return -1;
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        switch (this.f10513Y) {
            case 0:
                if (obj instanceof View) {
                    return super.lastIndexOf((View) obj);
                }
                return -1;
            default:
                if (obj instanceof View) {
                    return super.lastIndexOf((View) obj);
                }
                return -1;
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        switch (this.f10513Y) {
            case 0:
                if (obj instanceof View) {
                    return super.remove((View) obj);
                }
                return false;
            default:
                if (obj instanceof View) {
                    return super.remove((View) obj);
                }
                return false;
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        switch (this.f10513Y) {
            case 0:
                Object objRemove = super.remove(i10);
                AbstractC16544l.m18093f(objRemove, "super.removeAt(index)");
                View view = (View) objRemove;
                Iterator it = ((C3460c) this.f10514Z).f10515a.iterator();
                while (it.hasNext()) {
                    ((C13713j) it.next()).getClass();
                }
                return view;
            default:
                Object objRemove2 = super.remove(i10);
                AbstractC16544l.m18093f(objRemove2, "super.removeAt(index)");
                View view2 = (View) objRemove2;
                Iterator it2 = ((C15300n) this.f10514Z).f47793o0.iterator();
                while (it2.hasNext()) {
                    ((InterfaceC15290f) it2.next()).mo16513a(view2, false);
                }
                return view2;
        }
    }
}
