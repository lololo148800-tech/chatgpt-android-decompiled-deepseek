package androidx.glance.appwidget.protobuf;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.u */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11059u extends AbstractC11030a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC11059u> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected C11029Z unknownFields;

    public AbstractC11059u() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C11029Z.f33279f;
    }

    /* JADX INFO: renamed from: e */
    public static AbstractC11059u m12095e(Class cls) {
        AbstractC11059u abstractC11059u = defaultInstanceMap.get(cls);
        if (abstractC11059u == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC11059u = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (abstractC11059u == null) {
            abstractC11059u = (AbstractC11059u) ((AbstractC11059u) AbstractC11041f0.m12007d(cls)).mo12101d(6);
            if (abstractC11059u == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, abstractC11059u);
        }
        return abstractC11059u;
    }

    /* JADX INFO: renamed from: f */
    public static Object m12096f(Method method, AbstractC11030a abstractC11030a, Object... objArr) {
        try {
            return method.invoke(abstractC11030a, objArr);
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

    /* JADX INFO: renamed from: g */
    public static final boolean m12097g(AbstractC11059u abstractC11059u, boolean z6) {
        byte bByteValue = ((Byte) abstractC11059u.mo12101d(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        C11023T c11023t = C11023T.f33266c;
        c11023t.getClass();
        boolean zMo11898b = c11023t.m11919a(abstractC11059u.getClass()).mo11898b(abstractC11059u);
        if (z6) {
            abstractC11059u.mo12101d(2);
        }
        return zMo11898b;
    }

    /* JADX INFO: renamed from: k */
    public static void m12098k(Class cls, AbstractC11059u abstractC11059u) {
        abstractC11059u.m12103i();
        defaultInstanceMap.put(cls, abstractC11059u);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC11030a
    /* JADX INFO: renamed from: a */
    public final int mo11976a(InterfaceC11026W interfaceC11026W) {
        int iMo11901e;
        int iMo11901e2;
        if (m12102h()) {
            if (interfaceC11026W == null) {
                C11023T c11023t = C11023T.f33266c;
                c11023t.getClass();
                iMo11901e2 = c11023t.m11919a(getClass()).mo11901e(this);
            } else {
                iMo11901e2 = interfaceC11026W.mo11901e(this);
            }
            if (iMo11901e2 >= 0) {
                return iMo11901e2;
            }
            throw new IllegalStateException(AbstractC10763a.m11048f(iMo11901e2, "serialized size must be non-negative, was "));
        }
        int i10 = this.memoizedSerializedSize;
        if ((i10 & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i10 & Integer.MAX_VALUE;
        }
        if (interfaceC11026W == null) {
            C11023T c11023t2 = C11023T.f33266c;
            c11023t2.getClass();
            iMo11901e = c11023t2.m11919a(getClass()).mo11901e(this);
        } else {
            iMo11901e = interfaceC11026W.mo11901e(this);
        }
        m12105l(iMo11901e);
        return iMo11901e;
    }

    /* JADX INFO: renamed from: b */
    public final void m12099b() {
        this.memoizedHashCode = 0;
    }

    /* JADX INFO: renamed from: c */
    public final void m12100c() {
        m12105l(Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: d */
    public abstract Object mo12101d(int i10);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C11023T c11023t = C11023T.f33266c;
        c11023t.getClass();
        return c11023t.m11919a(getClass()).mo11903g(this, (AbstractC11059u) obj);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m12102h() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final int hashCode() {
        if (m12102h()) {
            C11023T c11023t = C11023T.f33266c;
            c11023t.getClass();
            return c11023t.m11919a(getClass()).mo11902f(this);
        }
        if (this.memoizedHashCode == 0) {
            C11023T c11023t2 = C11023T.f33266c;
            c11023t2.getClass();
            this.memoizedHashCode = c11023t2.m11919a(getClass()).mo11902f(this);
        }
        return this.memoizedHashCode;
    }

    /* JADX INFO: renamed from: i */
    public final void m12103i() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: j */
    public final AbstractC11059u m12104j() {
        return (AbstractC11059u) mo12101d(4);
    }

    /* JADX INFO: renamed from: l */
    public final void m12105l(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException(AbstractC10763a.m11048f(i10, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i10 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = AbstractC11017M.f33245a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(string);
        AbstractC11017M.m11878c(this, sb2, 0);
        return sb2.toString();
    }
}
