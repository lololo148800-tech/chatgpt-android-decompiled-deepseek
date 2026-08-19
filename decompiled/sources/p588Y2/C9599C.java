package p588Y2;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import androidx.fragment.app.AbstractC11002c;
import androidx.fragment.app.AbstractComponentCallbacksC11000a;
import java.lang.reflect.InvocationTargetException;
import p025An.C0644w;
import p692d0.C12959L;

/* JADX INFO: renamed from: Y2.C */
/* JADX INFO: loaded from: classes.dex */
public final class C9599C {

    /* JADX INFO: renamed from: b */
    public static final C12959L f28891b = new C12959L(0);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC11002c f28892a;

    public C9599C(AbstractC11002c abstractC11002c) {
        this.f28892a = abstractC11002c;
    }

    /* JADX INFO: renamed from: b */
    public static Class m10144b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        C12959L c12959l = f28891b;
        C12959L c12959l2 = (C12959L) c12959l.get(classLoader);
        if (c12959l2 == null) {
            c12959l2 = new C12959L(0);
            c12959l.put(classLoader, c12959l2);
        }
        Class cls = (Class) c12959l2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        c12959l2.put(str, cls2);
        return cls2;
    }

    /* JADX INFO: renamed from: c */
    public static Class m10145c(ClassLoader classLoader, String str) {
        try {
            return m10144b(classLoader, str);
        } catch (ClassCastException e10) {
            throw new C0644w(AbstractC10763a.m11054l("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e10);
        } catch (ClassNotFoundException e11) {
            throw new C0644w(AbstractC10763a.m11054l("Unable to instantiate fragment ", str, ": make sure class name exists"), e11);
        }
    }

    /* JADX INFO: renamed from: a */
    public final AbstractComponentCallbacksC11000a m10146a(String str) {
        try {
            return (AbstractComponentCallbacksC11000a) m10145c(this.f28892a.f33204u.f29051Z.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e10) {
            throw new C0644w(AbstractC10763a.m11054l("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e10);
        } catch (InstantiationException e11) {
            throw new C0644w(AbstractC10763a.m11054l("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e11);
        } catch (NoSuchMethodException e12) {
            throw new C0644w(AbstractC10763a.m11054l("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e12);
        } catch (InvocationTargetException e13) {
            throw new C0644w(AbstractC10763a.m11054l("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e13);
        }
    }
}
