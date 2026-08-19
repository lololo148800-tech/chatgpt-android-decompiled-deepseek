package p594Y9;

import android.gov.nist.core.Separators;
import android.view.View;
import java.io.IOException;
import java.util.AbstractList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import p030B2.ViewTreeObserverOnPreDrawListenerC0787v;
import p049Bm.InterfaceC1426a;
import p741f5.RunnableC13542a;

/* JADX INFO: renamed from: Y9.E4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9722E4 {
    /* JADX INFO: renamed from: a */
    public static final void m10313a(InterfaceC1426a interfaceC1426a, View view) {
        AbstractC16544l.m18094g(view, "<this>");
        ViewTreeObserverOnPreDrawListenerC0787v viewTreeObserverOnPreDrawListenerC0787v = new ViewTreeObserverOnPreDrawListenerC0787v(view, new RunnableC13542a(interfaceC1426a));
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0787v);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0787v);
    }

    /* JADX INFO: renamed from: b */
    public static String m10314b(AbstractList abstractList) {
        Iterator it = abstractList.iterator();
        StringBuilder sb2 = new StringBuilder();
        try {
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                sb2.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb2.append((CharSequence) Separators.RETURN);
                    Object next2 = it.next();
                    next2.getClass();
                    sb2.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
