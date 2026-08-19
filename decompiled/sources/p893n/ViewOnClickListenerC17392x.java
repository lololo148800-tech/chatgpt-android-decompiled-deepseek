package p893n;

import android.content.Context;
import android.content.ContextWrapper;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: n.x */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC17392x implements View.OnClickListener {

    /* JADX INFO: renamed from: Y */
    public final View f55577Y;

    /* JADX INFO: renamed from: Z */
    public final String f55578Z;

    /* JADX INFO: renamed from: o0 */
    public Method f55579o0;

    /* JADX INFO: renamed from: p0 */
    public Context f55580p0;

    public ViewOnClickListenerC17392x(View view, String str) {
        this.f55577Y = view;
        this.f55578Z = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f55579o0 != null) {
            break;
        }
        View view2 = this.f55577Y;
        Context context = view2.getContext();
        while (true) {
            String str2 = this.f55578Z;
            if (context == null) {
                int id2 = view2.getId();
                if (id2 == -1) {
                    str = "";
                } else {
                    str = " with id '" + view2.getContext().getResources().getResourceEntryName(id2) + Separators.QUOTE;
                }
                StringBuilder sbM11058p = AbstractC10763a.m11058p("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                sbM11058p.append(view2.getClass());
                sbM11058p.append(str);
                throw new IllegalStateException(sbM11058p.toString());
            }
            try {
                if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                    this.f55579o0 = method;
                    this.f55580p0 = context;
                    break;
                }
            } catch (NoSuchMethodException unused) {
            }
            context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
        }
        try {
            this.f55579o0.invoke(this.f55580p0, view);
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e10);
        } catch (InvocationTargetException e11) {
            throw new IllegalStateException("Could not execute method for android:onClick", e11);
        }
    }
}
