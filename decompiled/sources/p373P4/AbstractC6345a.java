package p373P4;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p692d0.C12966e;

/* JADX INFO: renamed from: P4.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6345a {

    /* JADX INFO: renamed from: a */
    public final C12966e f20602a;

    /* JADX INFO: renamed from: b */
    public final C12966e f20603b;

    /* JADX INFO: renamed from: c */
    public final C12966e f20604c;

    public AbstractC6345a(C12966e c12966e, C12966e c12966e2, C12966e c12966e3) {
        this.f20602a = c12966e;
        this.f20603b = c12966e2;
        this.f20604c = c12966e3;
    }

    /* JADX INFO: renamed from: a */
    public abstract C6346b mo6960a();

    /* JADX INFO: renamed from: b */
    public final Class m6961b(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        C12966e c12966e = this.f20604c;
        Class cls2 = (Class) c12966e.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + Separators.DOT + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c12966e.put(cls.getName(), cls3);
        return cls3;
    }

    /* JADX INFO: renamed from: c */
    public final Method m6962c(String str) throws NoSuchMethodException {
        C12966e c12966e = this.f20602a;
        Method method = (Method) c12966e.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC6345a.class.getClassLoader()).getDeclaredMethod("read", AbstractC6345a.class);
        c12966e.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public final Method m6963d(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        C12966e c12966e = this.f20603b;
        Method method = (Method) c12966e.get(name);
        if (method != null) {
            return method;
        }
        Class clsM6961b = m6961b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsM6961b.getDeclaredMethod("write", cls, AbstractC6345a.class);
        c12966e.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: e */
    public abstract boolean mo6964e(int i10);

    /* JADX INFO: renamed from: f */
    public final Parcelable m6965f(Parcelable parcelable, int i10) {
        if (!mo6964e(i10)) {
            return parcelable;
        }
        return ((C6346b) this).f20606e.readParcelable(C6346b.class.getClassLoader());
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC6347c m6966g() {
        String string = ((C6346b) this).f20606e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (InterfaceC6347c) m6962c(string).invoke(null, mo6960a());
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
        } catch (InvocationTargetException e13) {
            if (e13.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e13.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e13);
        }
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo6967h(int i10);

    /* JADX INFO: renamed from: i */
    public final void m6968i(InterfaceC6347c interfaceC6347c) {
        if (interfaceC6347c == null) {
            ((C6346b) this).f20606e.writeString(null);
            return;
        }
        try {
            ((C6346b) this).f20606e.writeString(m6961b(interfaceC6347c.getClass()).getName());
            C6346b c6346bMo6960a = mo6960a();
            try {
                m6963d(interfaceC6347c.getClass()).invoke(null, interfaceC6347c, c6346bMo6960a);
                int i10 = c6346bMo6960a.f20610i;
                if (i10 >= 0) {
                    int i11 = c6346bMo6960a.f20605d.get(i10);
                    Parcel parcel = c6346bMo6960a.f20606e;
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i11);
                    parcel.writeInt(iDataPosition - i11);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e10);
            } catch (IllegalAccessException e11) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
            } catch (InvocationTargetException e13) {
                if (!(e13.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e13);
                }
                throw ((RuntimeException) e13.getCause());
            }
        } catch (ClassNotFoundException e14) {
            throw new RuntimeException(interfaceC6347c.getClass().getSimpleName().concat(" does not have a Parcelizer"), e14);
        }
    }
}
