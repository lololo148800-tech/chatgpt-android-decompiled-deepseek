package p890mb;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import com.google.firebase.components.ComponentRegistrar;
import io.sentry.android.core.AbstractC15256t;
import java.lang.reflect.InvocationTargetException;
import p1104xb.InterfaceC21170a;
import p1148zb.C21831b;
import p571X9.AbstractC9306j0;
import p832jb.C16187g;

/* JADX INFO: renamed from: mb.c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C17206c implements InterfaceC21170a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f54927a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f54928b;

    public /* synthetic */ C17206c(Object obj, int i10) {
        this.f54927a = i10;
        this.f54928b = obj;
    }

    @Override // p1104xb.InterfaceC21170a
    public final Object get() {
        switch (this.f54927a) {
            case 0:
                String str = (String) this.f54928b;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new C17215l("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    AbstractC15256t.m16482t("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e10) {
                    throw new C17215l(AbstractC10763a.m11054l("Could not instantiate ", str, Separators.DOT), e10);
                } catch (InstantiationException e11) {
                    throw new C17215l(AbstractC10763a.m11054l("Could not instantiate ", str, Separators.DOT), e11);
                } catch (NoSuchMethodException e12) {
                    throw new C17215l(AbstractC9306j0.m9889h("Could not instantiate ", str), e12);
                } catch (InvocationTargetException e13) {
                    throw new C17215l(AbstractC9306j0.m9889h("Could not instantiate ", str), e13);
                }
            case 1:
                return (ComponentRegistrar) this.f54928b;
            default:
                return new C21831b((C16187g) this.f54928b);
        }
    }
}
