package p588Y2;

import android.content.Context;
import android.content.res.TypedArray;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractActivityC11001b;
import androidx.fragment.app.AbstractC11002c;
import androidx.fragment.app.AbstractComponentCallbacksC11000a;
import androidx.fragment.app.C11003d;
import androidx.fragment.app.FragmentContainerView;
import p003A1.ViewOnAttachStateChangeListenerC0200Q1;
import p564X2.AbstractC9038a;
import p611Z2.AbstractC10151d;
import p611Z2.C10148a;
import p611Z2.C10150c;

/* JADX INFO: renamed from: Y2.x */
/* JADX INFO: loaded from: classes.dex */
public final class LayoutInflaterFactory2C9640x implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: Y */
    public final AbstractC11002c f29060Y;

    public LayoutInflaterFactory2C9640x(AbstractC11002c abstractC11002c) {
        this.f29060Y = abstractC11002c;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        C11003d c11003dM11796f;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        AbstractC11002c abstractC11002c = this.f29060Y;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, abstractC11002c);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC9038a.f27595a);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        String string = typedArrayObtainStyledAttributes.getString(2);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue != null) {
            try {
                zIsAssignableFrom = AbstractComponentCallbacksC11000a.class.isAssignableFrom(C9599C.m10144b(context.getClassLoader(), attributeValue));
            } catch (ClassNotFoundException unused) {
                zIsAssignableFrom = false;
            }
            if (zIsAssignableFrom) {
                int id2 = view != null ? view.getId() : 0;
                if (id2 == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000aM11767A = resourceId != -1 ? abstractC11002c.m11767A(resourceId) : null;
                if (abstractComponentCallbacksC11000aM11767A == null && string != null) {
                    abstractComponentCallbacksC11000aM11767A = abstractC11002c.m11768B(string);
                }
                if (abstractComponentCallbacksC11000aM11767A == null && id2 != -1) {
                    abstractComponentCallbacksC11000aM11767A = abstractC11002c.m11767A(id2);
                }
                if (abstractComponentCallbacksC11000aM11767A == null) {
                    C9599C c9599cM11770D = abstractC11002c.m11770D();
                    context.getClassLoader();
                    abstractComponentCallbacksC11000aM11767A = c9599cM11770D.m10146a(attributeValue);
                    abstractComponentCallbacksC11000aM11767A.f33163y0 = true;
                    abstractComponentCallbacksC11000aM11767A.f33126H0 = resourceId != 0 ? resourceId : id2;
                    abstractComponentCallbacksC11000aM11767A.f33127I0 = id2;
                    abstractComponentCallbacksC11000aM11767A.f33128J0 = string;
                    abstractComponentCallbacksC11000aM11767A.f33164z0 = true;
                    abstractComponentCallbacksC11000aM11767A.f33122D0 = abstractC11002c;
                    C9637u c9637u = abstractC11002c.f33204u;
                    abstractComponentCallbacksC11000aM11767A.f33123E0 = c9637u;
                    AbstractActivityC11001b abstractActivityC11001b = c9637u.f29051Z;
                    abstractComponentCallbacksC11000aM11767A.f33133O0 = true;
                    if ((c9637u != null ? c9637u.f29050Y : null) != null) {
                        abstractComponentCallbacksC11000aM11767A.f33133O0 = true;
                    }
                    c11003dM11796f = abstractC11002c.m11789a(abstractComponentCallbacksC11000aM11767A);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Fragment " + abstractComponentCallbacksC11000aM11767A + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                } else {
                    if (abstractComponentCallbacksC11000aM11767A.f33164z0) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
                    }
                    abstractComponentCallbacksC11000aM11767A.f33164z0 = true;
                    abstractComponentCallbacksC11000aM11767A.f33122D0 = abstractC11002c;
                    C9637u c9637u2 = abstractC11002c.f33204u;
                    abstractComponentCallbacksC11000aM11767A.f33123E0 = c9637u2;
                    AbstractActivityC11001b abstractActivityC11001b2 = c9637u2.f29051Z;
                    abstractComponentCallbacksC11000aM11767A.f33133O0 = true;
                    if ((c9637u2 != null ? c9637u2.f29050Y : null) != null) {
                        abstractComponentCallbacksC11000aM11767A.f33133O0 = true;
                    }
                    c11003dM11796f = abstractC11002c.m11796f(abstractComponentCallbacksC11000aM11767A);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Retained Fragment " + abstractComponentCallbacksC11000aM11767A + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                }
                ViewGroup viewGroup = (ViewGroup) view;
                C10150c c10150c = AbstractC10151d.f30080a;
                AbstractC10151d.m10750b(new C10148a(abstractComponentCallbacksC11000aM11767A, "Attempting to use <fragment> tag to add fragment " + abstractComponentCallbacksC11000aM11767A + " to container " + viewGroup));
                AbstractC10151d.m10749a(abstractComponentCallbacksC11000aM11767A).getClass();
                abstractComponentCallbacksC11000aM11767A.f33134P0 = viewGroup;
                c11003dM11796f.m11827k();
                c11003dM11796f.m11826j();
                View view2 = abstractComponentCallbacksC11000aM11767A.f33135Q0;
                if (view2 == null) {
                    throw new IllegalStateException(AbstractC10763a.m11054l("Fragment ", attributeValue, " did not create a view."));
                }
                if (resourceId != 0) {
                    view2.setId(resourceId);
                }
                if (abstractComponentCallbacksC11000aM11767A.f33135Q0.getTag() == null) {
                    abstractComponentCallbacksC11000aM11767A.f33135Q0.setTag(string);
                }
                abstractComponentCallbacksC11000aM11767A.f33135Q0.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0200Q1(this, c11003dM11796f));
                return abstractComponentCallbacksC11000aM11767A.f33135Q0;
            }
        }
        return null;
    }
}
