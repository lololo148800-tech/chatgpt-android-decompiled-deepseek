package p838jj;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.squareup.workflow1.p685ui.WorkflowViewStub;
import fo.ViewOnAttachStateChangeListenerC13712i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import mm.EnumC17307j;
import p183H4.InterfaceC3232g;
import p523V9.AbstractC7841A0;
import p544W9.AbstractC8559T2;
import p544W9.AbstractC8688p;
import p544W9.AbstractC8724v;
import p571X9.AbstractC9227W;
import p722e8.C13298H;
import p749fd.C13628m;
import p769gj.AbstractC14158L;
import p769gj.C14183y;
import p769gj.InterfaceC14167i;
import p791hj.C14522e;
import p791hj.InterfaceC14521d;
import p791hj.ViewOnAttachStateChangeListenerC14519b;
import p861l1.xapn.suYVq;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p909nm.C17689w;

/* JADX INFO: renamed from: jj.q */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC16236q extends FrameLayout {

    /* JADX INFO: renamed from: o0 */
    public final WorkflowViewStub f50357o0;

    /* JADX INFO: renamed from: p0 */
    public Object f50358p0;

    /* JADX INFO: renamed from: q0 */
    public final Object f50359q0;

    /* JADX INFO: renamed from: r0 */
    public final C14522e f50360r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC16236q(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        AbstractC16544l.m18094g(context, "context");
        WorkflowViewStub workflowViewStub = new WorkflowViewStub(context, null, 14);
        addView(workflowViewStub, new ViewGroup.LayoutParams(-1, -1));
        this.f50357o0 = workflowViewStub;
        this.f50358p0 = C17689w.f56480Y;
        this.f50359q0 = AbstractC9227W.m9799b(EnumC17307j.f55134Z, new C13298H(this, 24));
        this.f50360r0 = new C14522e(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mm.i] */
    public final InterfaceC14521d getParentLifecycleOwner() {
        return (InterfaceC14521d) this.f50359q0.getValue();
    }

    /* JADX INFO: renamed from: b */
    public abstract C16231l mo17806b(Object obj, C14183y c14183y);

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: c */
    public final void m17810c(InterfaceC16230k newScreen, C14183y viewEnvironment) {
        C16231l c16231lMo17806b;
        AbstractC16544l.m18094g(newScreen, "newScreen");
        AbstractC16544l.m18094g(viewEnvironment, "viewEnvironment");
        this.f50357o0.m14525a(newScreen.mo7185a(), viewEnvironment);
        ArrayList arrayList = new ArrayList();
        Iterator it = newScreen.mo7186c().iterator();
        int i10 = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            C14522e c14522e = this.f50360r0;
            if (!zHasNext) {
                Iterator it2 = AbstractC17680n.m19358h0(arrayList, (Collection) ((Iterable) this.f50358p0)).iterator();
                while (it2.hasNext()) {
                    ((C16231l) it2.next()).m17808a();
                }
                ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(arrayList, 10));
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    String str = ((C16231l) it3.next()).f50353e;
                    if (str == null) {
                        AbstractC16544l.m18103p("savedStateRegistryKey");
                        throw null;
                    }
                    arrayList2.add(str);
                }
                c14522e.m16029w(arrayList2);
                this.f50358p0 = arrayList;
                return;
            }
            int i11 = i10 + 1;
            Object value = it.next();
            if (i10 >= this.f50358p0.size() || !AbstractC8688p.m9386b(((C16231l) this.f50358p0.get(i10)).f50349a, value)) {
                c16231lMo17806b = mo17806b(value, viewEnvironment);
                String name = String.valueOf(i10);
                AbstractC16544l.m18094g(value, "value");
                AbstractC16544l.m18094g(name, "name");
                InterfaceC14167i interfaceC14167i = value instanceof InterfaceC14167i ? (InterfaceC14167i) value : null;
                String strMo6751b = interfaceC14167i == null ? null : interfaceC14167i.mo6751b();
                if (strMo6751b == null) {
                    strMo6751b = value.getClass().getName();
                }
                String strM18100m = AbstractC16544l.m18100m(name.length() == 0 ? "" : AbstractC16544l.m18100m(name, "+"), strMo6751b);
                AbstractC16544l.m18094g(strM18100m, "<set-?>");
                c16231lMo17806b.f50353e = strM18100m;
                Dialog dialog = c16231lMo17806b.f50351c;
                Window window = dialog.getWindow();
                View decorView = window == null ? null : window.getDecorView();
                if (decorView != null) {
                    ViewOnAttachStateChangeListenerC14519b viewOnAttachStateChangeListenerC14519b = new ViewOnAttachStateChangeListenerC14519b(new C13628m(this, 26));
                    AbstractC7841A0.m8092d(decorView, viewOnAttachStateChangeListenerC14519b);
                    decorView.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC14519b);
                    String str2 = c16231lMo17806b.f50353e;
                    if (str2 == null) {
                        AbstractC16544l.m18103p("savedStateRegistryKey");
                        throw null;
                    }
                    c14522e.m16026t(decorView, str2);
                    decorView.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC13712i(c16231lMo17806b, this));
                }
                dialog.show();
            } else {
                C16231l c16231l = (C16231l) this.f50358p0.get(i10);
                c16231lMo17806b = new C16231l(value, viewEnvironment, c16231l.f50351c, c16231l.f50352d);
                String str3 = c16231l.f50353e;
                if (str3 == null) {
                    AbstractC16544l.m18103p("savedStateRegistryKey");
                    throw null;
                }
                c16231lMo17806b.f50353e = str3;
                mo17807d(c16231lMo17806b);
            }
            arrayList.add(c16231lMo17806b);
            i10 = i11;
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo17807d(C16231l c16231l);

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC3232g interfaceC3232gM9221d = AbstractC8559T2.m9221d(this);
        AbstractC14158L abstractC14158LM9449g = AbstractC8724v.m9449g(this);
        Object objMo15504c = abstractC14158LM9449g == null ? null : abstractC14158LM9449g.mo15504c();
        if (objMo15504c == null) {
            objMo15504c = null;
        }
        AbstractC16544l.m18091d(objMo15504c);
        InterfaceC14167i interfaceC14167i = objMo15504c instanceof InterfaceC14167i ? (InterfaceC14167i) objMo15504c : null;
        String strMo6751b = interfaceC14167i != null ? interfaceC14167i.mo6751b() : null;
        if (strMo6751b == null) {
            strMo6751b = objMo15504c.getClass().getName();
        }
        this.f50360r0.m16014d(AbstractC16544l.m18100m("", strMo6751b), interfaceC3232gM9221d);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f50360r0.m16021n();
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable state) {
        AbstractC16544l.m18094g(state, "state");
        C17296C c17296c = null;
        C16235p c16235p = state instanceof C16235p ? (C16235p) state : null;
        if (c16235p != null) {
            ArrayList arrayList = c16235p.f50356Y;
            int size = arrayList.size();
            int size2 = this.f50358p0.size();
            C17296C c17296c2 = C17296C.f55119a;
            if (size == size2) {
                Iterable iterable = (Iterable) this.f50358p0;
                Iterator it = arrayList.iterator();
                Iterator it2 = iterable.iterator();
                ArrayList arrayList2 = new ArrayList(Math.min(AbstractC17682p.m19389r(arrayList, 10), AbstractC17682p.m19389r(iterable, 10)));
                while (it.hasNext() && it2.hasNext()) {
                    Object next = it.next();
                    C16231l c16231l = (C16231l) it2.next();
                    C16233n keyAndBundle = (C16233n) next;
                    c16231l.getClass();
                    AbstractC16544l.m18094g(keyAndBundle, "keyAndBundle");
                    Object value = c16231l.f50349a;
                    AbstractC16544l.m18094g(value, "value");
                    InterfaceC14167i interfaceC14167i = value instanceof InterfaceC14167i ? (InterfaceC14167i) value : null;
                    String strMo6751b = interfaceC14167i == null ? null : interfaceC14167i.mo6751b();
                    if (strMo6751b == null) {
                        strMo6751b = value.getClass().getName();
                    }
                    if (AbstractC16544l.m18089b(AbstractC16544l.m18100m("", strMo6751b), keyAndBundle.f50354Y)) {
                        Window window = c16231l.f50351c.getWindow();
                        AbstractC16544l.m18091d(window);
                        window.restoreHierarchyState(keyAndBundle.f50355Z);
                    }
                    arrayList2.add(c17296c2);
                }
            }
            super.onRestoreInstanceState(((C16235p) state).getSuperState());
            c17296c = c17296c2;
        }
        if (c17296c == null) {
            super.onRestoreInstanceState(super.onSaveInstanceState());
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        InterfaceC14167i interfaceC14167i;
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        AbstractC16544l.m18091d(parcelableOnSaveInstanceState);
        Iterable<C16231l> iterable = (Iterable) this.f50358p0;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(iterable, 10));
        for (C16231l c16231l : iterable) {
            Window window = c16231l.f50351c.getWindow();
            AbstractC16544l.m18091d(window);
            Bundle saved = window.saveHierarchyState();
            Object value = c16231l.f50349a;
            AbstractC16544l.m18094g(value, "value");
            String name = null;
            if (value instanceof InterfaceC14167i) {
                interfaceC14167i = (InterfaceC14167i) value;
            } else {
                interfaceC14167i = null;
            }
            if (interfaceC14167i != null) {
                name = interfaceC14167i.mo6751b();
            }
            if (name == null) {
                name = value.getClass().getName();
            }
            String strM18100m = AbstractC16544l.m18100m(suYVq.rnCIInM, name);
            AbstractC16544l.m18093f(saved, "saved");
            arrayList.add(new C16233n(strM18100m, saved));
        }
        return new C16235p(parcelableOnSaveInstanceState, arrayList);
    }
}
