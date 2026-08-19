package p544W9;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.InterfaceC11112u;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import p183H4.InterfaceC3232g;
import p225Im.InterfaceC3755c;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3759g;
import p225Im.InterfaceC3760h;
import p225Im.InterfaceC3765m;
import p225Im.InterfaceC3769q;
import p225Im.InterfaceC3776x;
import p274Km.AbstractC4812a;
import p298Lm.AbstractC5147J0;
import p298Lm.AbstractC5202t;
import p323Mm.InterfaceC5500g;
import p523V9.AbstractC7841A0;
import p523V9.AbstractC8104h6;

/* JADX INFO: renamed from: W9.T2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8559T2 {
    /* JADX INFO: renamed from: a */
    public static final boolean m9218a(InterfaceC3755c interfaceC3755c) {
        InterfaceC5500g interfaceC5500gMo5735i;
        InterfaceC5500g interfaceC5500gMo5737l;
        AbstractC16544l.m18094g(interfaceC3755c, "<this>");
        if (interfaceC3755c instanceof InterfaceC3765m) {
            InterfaceC3776x interfaceC3776x = (InterfaceC3776x) interfaceC3755c;
            Field fieldM5445a = AbstractC4812a.m5445a(interfaceC3776x);
            if (!(fieldM5445a != null ? fieldM5445a.isAccessible() : true)) {
                return false;
            }
            Method methodM5446b = AbstractC4812a.m5446b(interfaceC3776x.getGetter());
            if (!(methodM5446b != null ? methodM5446b.isAccessible() : true)) {
                return false;
            }
            Method methodM5446b2 = AbstractC4812a.m5446b(((InterfaceC3765m) interfaceC3755c).getSetter());
            if (!(methodM5446b2 != null ? methodM5446b2.isAccessible() : true)) {
                return false;
            }
        } else if (interfaceC3755c instanceof InterfaceC3776x) {
            InterfaceC3776x interfaceC3776x2 = (InterfaceC3776x) interfaceC3755c;
            Field fieldM5445a2 = AbstractC4812a.m5445a(interfaceC3776x2);
            if (!(fieldM5445a2 != null ? fieldM5445a2.isAccessible() : true)) {
                return false;
            }
            Method methodM5446b3 = AbstractC4812a.m5446b(interfaceC3776x2.getGetter());
            if (!(methodM5446b3 != null ? methodM5446b3.isAccessible() : true)) {
                return false;
            }
        } else if (interfaceC3755c instanceof InterfaceC3769q) {
            Field fieldM5445a3 = AbstractC4812a.m5445a(((InterfaceC3769q) interfaceC3755c).mo4451f());
            if (!(fieldM5445a3 != null ? fieldM5445a3.isAccessible() : true)) {
                return false;
            }
            Method methodM5446b4 = AbstractC4812a.m5446b((InterfaceC3759g) interfaceC3755c);
            if (!(methodM5446b4 != null ? methodM5446b4.isAccessible() : true)) {
                return false;
            }
        } else if (interfaceC3755c instanceof InterfaceC3760h) {
            Field fieldM5445a4 = AbstractC4812a.m5445a(((InterfaceC3760h) interfaceC3755c).mo4451f());
            if (!(fieldM5445a4 != null ? fieldM5445a4.isAccessible() : true)) {
                return false;
            }
            Method methodM5446b5 = AbstractC4812a.m5446b((InterfaceC3759g) interfaceC3755c);
            if (!(methodM5446b5 != null ? methodM5446b5.isAccessible() : true)) {
                return false;
            }
        } else {
            if (!(interfaceC3755c instanceof InterfaceC3759g)) {
                throw new UnsupportedOperationException("Unknown callable: " + interfaceC3755c + " (" + interfaceC3755c.getClass() + ')');
            }
            InterfaceC3759g interfaceC3759g = (InterfaceC3759g) interfaceC3755c;
            Method methodM5446b6 = AbstractC4812a.m5446b(interfaceC3759g);
            if (!(methodM5446b6 != null ? methodM5446b6.isAccessible() : true)) {
                return false;
            }
            AbstractC5202t abstractC5202tM5713a = AbstractC5147J0.m5713a(interfaceC3755c);
            Object objMo5917b = (abstractC5202tM5713a == null || (interfaceC5500gMo5737l = abstractC5202tM5713a.mo5737l()) == null) ? null : interfaceC5500gMo5737l.mo5917b();
            AccessibleObject accessibleObject = objMo5917b instanceof AccessibleObject ? (AccessibleObject) objMo5917b : null;
            if (!(accessibleObject != null ? accessibleObject.isAccessible() : true)) {
                return false;
            }
            AbstractC5202t abstractC5202tM5713a2 = AbstractC5147J0.m5713a(interfaceC3759g);
            Member memberMo5917b = (abstractC5202tM5713a2 == null || (interfaceC5500gMo5735i = abstractC5202tM5713a2.mo5735i()) == null) ? null : interfaceC5500gMo5735i.mo5917b();
            Constructor constructor = memberMo5917b instanceof Constructor ? (Constructor) memberMo5917b : null;
            if (!(constructor != null ? constructor.isAccessible() : true)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC11112u m9219b(View view) {
        InterfaceC11112u interfaceC11112uM8090b = AbstractC7841A0.m8090b(view);
        if (interfaceC11112uM8090b != null) {
            return interfaceC11112uM8090b;
        }
        Context context = view.getContext();
        AbstractC16544l.m18093f(context, "view.context");
        return (InterfaceC11112u) m9220c(context, AbstractC16526C.f51263a.mo5693b(InterfaceC11112u.class));
    }

    /* JADX INFO: renamed from: c */
    public static Context m9220c(Context context, InterfaceC3756d interfaceC3756d) {
        while (!interfaceC3756d.mo4449e(context)) {
            ContextWrapper contextWrapper = context instanceof ContextWrapper ? (ContextWrapper) context : null;
            if (contextWrapper == null || (context = contextWrapper.getBaseContext()) == null) {
                return null;
            }
        }
        if (interfaceC3756d.mo4449e(context)) {
            return context;
        }
        throw new ClassCastException("Value cannot be cast to " + interfaceC3756d.mo4447a());
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC3232g m9221d(FrameLayout frameLayout) {
        InterfaceC3232g interfaceC3232gM8583b = AbstractC8104h6.m8583b(frameLayout);
        if (interfaceC3232gM8583b == null) {
            Context context = frameLayout.getContext();
            AbstractC16544l.m18093f(context, "view.context");
            interfaceC3232gM8583b = (InterfaceC3232g) m9220c(context, AbstractC16526C.f51263a.mo5693b(InterfaceC3232g.class));
        }
        if (interfaceC3232gM8583b != null) {
            return interfaceC3232gM8583b;
        }
        throw new IllegalStateException(AbstractC16544l.m18100m(frameLayout, "Expected to find a SavedStateRegistryOwner either in a parent view or the Context of ").toString());
    }
}
