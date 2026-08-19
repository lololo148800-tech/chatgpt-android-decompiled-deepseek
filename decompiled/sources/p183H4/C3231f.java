package p183H4;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.lifecycle.C11100i;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p030B2.AbstractC0738T;
import p1028u.C20085b;
import p1028u.C20089f;
import p571X9.AbstractC9106B3;
import p658b5.C11242m;
import p880m.AbstractC17123a;
import p999s.AbstractC19357i0;
import p999s.C19370p;

/* JADX INFO: renamed from: H4.f */
/* JADX INFO: loaded from: classes.dex */
public final class C3231f {

    /* JADX INFO: renamed from: a */
    public boolean f9797a;

    /* JADX INFO: renamed from: b */
    public boolean f9798b;

    /* JADX INFO: renamed from: c */
    public boolean f9799c;

    /* JADX INFO: renamed from: d */
    public final Object f9800d;

    /* JADX INFO: renamed from: e */
    public Parcelable f9801e;

    /* JADX INFO: renamed from: f */
    public Object f9802f;

    public /* synthetic */ C3231f(TextView textView) {
        this.f9801e = null;
        this.f9802f = null;
        this.f9797a = false;
        this.f9798b = false;
        this.f9800d = textView;
    }

    /* JADX INFO: renamed from: a */
    public void m4120a() {
        CompoundButton compoundButton = (CompoundButton) this.f9800d;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.f9797a || this.f9798b) {
                Drawable drawableMutate = buttonDrawable.mutate();
                if (this.f9797a) {
                    drawableMutate.setTintList((ColorStateList) this.f9801e);
                }
                if (this.f9798b) {
                    drawableMutate.setTintMode((PorterDuff.Mode) this.f9802f);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m4121b() {
        C19370p c19370p = (C19370p) this.f9800d;
        Drawable checkMarkDrawable = c19370p.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f9797a || this.f9798b) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.f9797a) {
                    drawableMutate.setTintList((ColorStateList) this.f9801e);
                }
                if (this.f9798b) {
                    drawableMutate.setTintMode((PorterDuff.Mode) this.f9802f);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(c19370p.getDrawableState());
                }
                c19370p.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public Bundle m4122c(String key) {
        AbstractC16544l.m18094g(key, "key");
        if (!this.f9798b) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = (Bundle) this.f9801e;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(key);
        Bundle bundle3 = (Bundle) this.f9801e;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = (Bundle) this.f9801e;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.f9801e = null;
        }
        return bundle2;
    }

    /* JADX INFO: renamed from: d */
    public InterfaceC3230e m4123d() {
        String str;
        InterfaceC3230e interfaceC3230e;
        Iterator it = ((C20089f) this.f9800d).iterator();
        do {
            C20085b c20085b = (C20085b) it;
            if (!c20085b.hasNext()) {
                return null;
            }
            Map.Entry components = (Map.Entry) c20085b.next();
            AbstractC16544l.m18093f(components, "components");
            str = (String) components.getKey();
            interfaceC3230e = (InterfaceC3230e) components.getValue();
        } while (!AbstractC16544l.m18089b(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return interfaceC3230e;
    }

    /* JADX INFO: renamed from: e */
    public void m4124e(AttributeSet attributeSet, int i10) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f9800d;
        Context context = compoundButton.getContext();
        int[] iArr = AbstractC17123a.f54744m;
        C11242m c11242mM12599G = C11242m.m12599G(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) c11242mM12599G.f34019Z;
        AbstractC0738T.m1583k(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) c11242mM12599G.f34019Z, i10);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(AbstractC9106B3.m9636b(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        compoundButton.setButtonDrawable(AbstractC9106B3.m9636b(compoundButton.getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(AbstractC9106B3.m9636b(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                compoundButton.setButtonTintList(c11242mM12599G.m12600A(2));
            }
            if (typedArray.hasValue(3)) {
                compoundButton.setButtonTintMode(AbstractC19357i0.m20463b(typedArray.getInt(3, -1), null));
            }
        } finally {
            c11242mM12599G.m12606H();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m4125f(String key, InterfaceC3230e provider) {
        AbstractC16544l.m18094g(key, "key");
        AbstractC16544l.m18094g(provider, "provider");
        if (((InterfaceC3230e) ((C20089f) this.f9800d).mo20917i(key, provider)) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    /* JADX INFO: renamed from: g */
    public void m4126g() {
        if (!this.f9799c) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        C3226a c3226a = (C3226a) this.f9802f;
        if (c3226a == null) {
            c3226a = new C3226a(this);
        }
        this.f9802f = c3226a;
        try {
            C11100i.class.getDeclaredConstructor(null);
            C3226a c3226a2 = (C3226a) this.f9802f;
            if (c3226a2 != null) {
                ((LinkedHashSet) c3226a2.f9792b).add(C11100i.class.getName());
            }
        } catch (NoSuchMethodException e10) {
            throw new IllegalArgumentException("Class " + C11100i.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
        }
    }

    public C3231f() {
        this.f9800d = new C20089f();
        this.f9799c = true;
    }
}
