package p139F9;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Field;
import p1060v9.AbstractC20502t;
import p333N9.AbstractBinderC5687h;

/* JADX INFO: renamed from: F9.b */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC2679b extends AbstractBinderC5687h implements InterfaceC2678a {

    /* JADX INFO: renamed from: b */
    public final Object f8216b;

    public BinderC2679b(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper", 3);
        this.f8216b = obj;
    }

    /* JADX INFO: renamed from: p */
    public static InterfaceC2678a m3655p(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return iInterfaceQueryLocalInterface instanceof InterfaceC2678a ? (InterfaceC2678a) iInterfaceQueryLocalInterface : new C2680c(iBinder, "com.google.android.gms.dynamic.IObjectWrapper", 2);
    }

    /* JADX INFO: renamed from: q */
    public static Object m3656q(InterfaceC2678a interfaceC2678a) {
        if (interfaceC2678a instanceof BinderC2679b) {
            return ((BinderC2679b) interfaceC2678a).f8216b;
        }
        IBinder iBinderAsBinder = interfaceC2678a.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i10 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i10++;
                field = field2;
            }
        }
        if (i10 != 1) {
            throw new IllegalArgumentException(AbstractC10763a.m11048f(declaredFields.length, "Unexpected number of IObjectWrapper declared fields: "));
        }
        AbstractC20502t.m21157h(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(iBinderAsBinder);
        } catch (IllegalAccessException e10) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e10);
        } catch (NullPointerException e11) {
            throw new IllegalArgumentException("Binder object is null.", e11);
        }
    }
}
