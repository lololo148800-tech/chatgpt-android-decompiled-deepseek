package androidx.datastore.preferences.protobuf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.u */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10987u extends AbstractC10947a {
    private static Map<Object, AbstractC10987u> defaultInstanceMap = new ConcurrentHashMap();
    protected int memoizedSerializedSize;
    protected C10964i0 unknownFields;

    public AbstractC10987u() {
        this.memoizedHashCode = 0;
        this.unknownFields = C10964i0.f33059f;
        this.memoizedSerializedSize = -1;
    }

    /* JADX INFO: renamed from: e */
    public static AbstractC10987u m11715e(Class cls) {
        AbstractC10987u abstractC10987u = defaultInstanceMap.get(cls);
        if (abstractC10987u == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC10987u = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (abstractC10987u == null) {
            abstractC10987u = (AbstractC10987u) ((AbstractC10987u) AbstractC10982r0.m11692a(cls)).mo7129d(6);
            if (abstractC10987u == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, abstractC10987u);
        }
        return abstractC10987u;
    }

    /* JADX INFO: renamed from: f */
    public static Object m11716f(Method method, AbstractC10947a abstractC10947a, Object... objArr) {
        try {
            return method.invoke(abstractC10947a, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m11717h(Class cls, AbstractC10987u abstractC10987u) {
        defaultInstanceMap.put(cls, abstractC10987u);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC10947a
    /* JADX INFO: renamed from: a */
    public final int mo11521a() {
        if (this.memoizedSerializedSize == -1) {
            C10944X c10944x = C10944X.f33003c;
            c10944x.getClass();
            this.memoizedSerializedSize = c10944x.m11515a(getClass()).mo11497e(this);
        }
        return this.memoizedSerializedSize;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC10947a
    /* JADX INFO: renamed from: c */
    public final void mo11523c(C10963i c10963i) {
        C10944X c10944x = C10944X.f33003c;
        c10944x.getClass();
        InterfaceC10948a0 interfaceC10948a0M11515a = c10944x.m11515a(getClass());
        C10930I c10930i = c10963i.f33054c;
        if (c10930i == null) {
            c10930i = new C10930I(c10963i);
        }
        interfaceC10948a0M11515a.mo11496d(this, c10930i);
    }

    /* JADX INFO: renamed from: d */
    public abstract Object mo7129d(int i10);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((AbstractC10987u) mo7129d(6)).getClass().isInstance(obj)) {
            return false;
        }
        C10944X c10944x = C10944X.f33003c;
        c10944x.getClass();
        return c10944x.m11515a(getClass()).mo11501i(this, (AbstractC10987u) obj);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m11718g() {
        byte bByteValue = ((Byte) mo7129d(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        C10944X c10944x = C10944X.f33003c;
        c10944x.getClass();
        boolean zMo11494b = c10944x.m11515a(getClass()).mo11494b(this);
        mo7129d(2);
        return zMo11494b;
    }

    public final int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        C10944X c10944x = C10944X.f33003c;
        c10944x.getClass();
        int iMo11500h = c10944x.m11515a(getClass()).mo11500h(this);
        this.memoizedHashCode = iMo11500h;
        return iMo11500h;
    }

    public final String toString() {
        String string = super.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(string);
        AbstractC10937P.m11469l(this, sb2, 0);
        return sb2.toString();
    }
}
