package p817j$.util.concurrent;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import p817j$.sun.misc.C15532a;

/* JADX INFO: loaded from: classes4.dex */
public class ConcurrentHashMap<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable, InterfaceC15703v {

    /* JADX INFO: renamed from: g */
    static final int f48882g = Runtime.getRuntime().availableProcessors();

    /* JADX INFO: renamed from: h */
    private static final C15532a f48883h;

    /* JADX INFO: renamed from: i */
    private static final long f48884i;

    /* JADX INFO: renamed from: j */
    private static final long f48885j;

    /* JADX INFO: renamed from: k */
    private static final long f48886k;

    /* JADX INFO: renamed from: l */
    private static final long f48887l;

    /* JADX INFO: renamed from: m */
    private static final long f48888m;

    /* JADX INFO: renamed from: n */
    private static final int f48889n;

    /* JADX INFO: renamed from: o */
    private static final int f48890o;
    private static final ObjectStreamField[] serialPersistentFields;
    private static final long serialVersionUID = 7249069246763182397L;

    /* JADX INFO: renamed from: a */
    volatile transient C15693l[] f48891a;

    /* JADX INFO: renamed from: b */
    private volatile transient C15693l[] f48892b;
    private volatile transient long baseCount;

    /* JADX INFO: renamed from: c */
    private volatile transient C15684c[] f48893c;
    private volatile transient int cellsBusy;

    /* JADX INFO: renamed from: d */
    private transient C15690i f48894d;

    /* JADX INFO: renamed from: e */
    private transient C15700s f48895e;

    /* JADX INFO: renamed from: f */
    private transient C15686e f48896f;
    private volatile transient int sizeCtl;
    private volatile transient int transferIndex;

    /* JADX INFO: renamed from: i */
    static final int m17301i(int i10) {
        return (i10 ^ (i10 >>> 16)) & Integer.MAX_VALUE;
    }

    static {
        ObjectStreamField objectStreamField = new ObjectStreamField("segments", C15695n[].class);
        Class cls = Integer.TYPE;
        serialPersistentFields = new ObjectStreamField[]{objectStreamField, new ObjectStreamField("segmentMask", cls), new ObjectStreamField("segmentShift", cls)};
        C15532a c15532aM16753h = C15532a.m16753h();
        f48883h = c15532aM16753h;
        f48884i = c15532aM16753h.m16762j(ConcurrentHashMap.class, "sizeCtl");
        f48885j = c15532aM16753h.m16762j(ConcurrentHashMap.class, "transferIndex");
        f48886k = c15532aM16753h.m16762j(ConcurrentHashMap.class, "baseCount");
        f48887l = c15532aM16753h.m16762j(ConcurrentHashMap.class, "cellsBusy");
        f48888m = c15532aM16753h.m16762j(C15684c.class, "value");
        f48889n = c15532aM16753h.m16755a(C15693l[].class);
        int iM16756b = c15532aM16753h.m16756b(C15693l[].class);
        if (((iM16756b - 1) & iM16756b) != 0) {
            throw new ExceptionInInitializerError("array index scale not a power of two");
        }
        f48890o = 31 - Integer.numberOfLeadingZeros(iM16756b);
    }

    /* JADX INFO: renamed from: l */
    private static final int m17303l(int i10) {
        int iNumberOfLeadingZeros = (-1) >>> Integer.numberOfLeadingZeros(i10 - 1);
        if (iNumberOfLeadingZeros < 0) {
            return 1;
        }
        if (iNumberOfLeadingZeros >= 1073741824) {
            return 1073741824;
        }
        return 1 + iNumberOfLeadingZeros;
    }

    /* JADX INFO: renamed from: c */
    static Class m17298c(Object obj) {
        Type[] actualTypeArguments;
        if (!(obj instanceof Comparable)) {
            return null;
        }
        Class<?> cls = obj.getClass();
        if (cls == String.class) {
            return cls;
        }
        Type[] genericInterfaces = cls.getGenericInterfaces();
        if (genericInterfaces == null) {
            return null;
        }
        for (Type type : genericInterfaces) {
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                if (parameterizedType.getRawType() == Comparable.class && (actualTypeArguments = parameterizedType.getActualTypeArguments()) != null && actualTypeArguments.length == 1 && actualTypeArguments[0] == cls) {
                    return cls;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    static final C15693l m17302k(C15693l[] c15693lArr, int i10) {
        return (C15693l) f48883h.m16761g(c15693lArr, (((long) i10) << f48890o) + ((long) f48889n));
    }

    /* JADX INFO: renamed from: b */
    static final boolean m17297b(C15693l[] c15693lArr, int i10, C15693l c15693l) {
        return f48883h.m16759e(c15693lArr, (((long) i10) << f48890o) + ((long) f48889n), c15693l);
    }

    /* JADX INFO: renamed from: h */
    static final void m17300h(C15693l[] c15693lArr, int i10, C15693l c15693l) {
        f48883h.m16764l(c15693lArr, (((long) i10) << f48890o) + ((long) f48889n), c15693l);
    }

    public ConcurrentHashMap() {
    }

    public ConcurrentHashMap(int i10) {
        this(i10, 0.75f, 1);
    }

    public ConcurrentHashMap(Map<? extends K, ? extends V> map) {
        this.sizeCtl = 16;
        putAll(map);
    }

    public ConcurrentHashMap(int i10, float f10, int i11) {
        if (f10 <= 0.0f || i10 < 0 || i11 <= 0) {
            throw new IllegalArgumentException();
        }
        long j10 = (long) (((double) ((i10 < i11 ? i11 : i10) / f10)) + 1.0d);
        this.sizeCtl = j10 >= 1073741824 ? 1073741824 : m17303l((int) j10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        long jM17311j = m17311j();
        if (jM17311j < 0) {
            return 0;
        }
        if (jM17311j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) jM17311j;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return m17311j() <= 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        int length;
        C15693l c15693lM17302k;
        Object obj2;
        int iM17301i = m17301i(obj.hashCode());
        C15693l[] c15693lArr = this.f48891a;
        if (c15693lArr != null && (length = c15693lArr.length) > 0 && (c15693lM17302k = m17302k(c15693lArr, (length - 1) & iM17301i)) != null) {
            int i10 = c15693lM17302k.f48916a;
            if (i10 == iM17301i) {
                Object obj3 = c15693lM17302k.f48917b;
                if (obj3 == obj || (obj3 != null && obj.equals(obj3))) {
                    return (V) c15693lM17302k.f48918c;
                }
            } else if (i10 < 0) {
                C15693l c15693lMo17321a = c15693lM17302k.mo17321a(iM17301i, obj);
                if (c15693lMo17321a != null) {
                    return (V) c15693lMo17321a.f48918c;
                }
                return null;
            }
            while (true) {
                c15693lM17302k = c15693lM17302k.f48919d;
                if (c15693lM17302k == null) {
                    break;
                }
                if (c15693lM17302k.f48916a == iM17301i && ((obj2 = c15693lM17302k.f48917b) == obj || (obj2 != null && obj.equals(obj2)))) {
                    return (V) c15693lM17302k.f48918c;
                }
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        obj.getClass();
        C15693l[] c15693lArr = this.f48891a;
        if (c15693lArr != null) {
            C15697p c15697p = new C15697p(c15693lArr, c15693lArr.length, 0, c15693lArr.length);
            while (true) {
                C15693l c15693lM17322a = c15697p.m17322a();
                if (c15693lM17322a == null) {
                    break;
                }
                Object obj2 = c15693lM17322a.f48918c;
                if (obj2 == obj) {
                    return true;
                }
                if (obj2 != null && obj.equals(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k8, V v2) {
        return (V) m17309f(k8, v2, false);
    }

    /* JADX INFO: renamed from: f */
    final Object m17309f(Object obj, Object obj2, boolean z6) {
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        if (obj == null || obj2 == null) {
            throw null;
        }
        int iM17301i = m17301i(obj.hashCode());
        C15693l[] c15693lArrM17299e = this.f48891a;
        int i10 = 0;
        while (true) {
            if (c15693lArrM17299e != null) {
                int length = c15693lArrM17299e.length;
                if (length != 0) {
                    int i11 = (length - 1) & iM17301i;
                    C15693l c15693lM17302k = m17302k(c15693lArrM17299e, i11);
                    if (c15693lM17302k == null) {
                        if (m17297b(c15693lArrM17299e, i11, new C15693l(iM17301i, obj, obj2))) {
                            break;
                        }
                    } else {
                        int i12 = c15693lM17302k.f48916a;
                        if (i12 == -1) {
                            c15693lArrM17299e = m17308d(c15693lArrM17299e, c15693lM17302k);
                        } else {
                            if (z6 && i12 == iM17301i && (((obj5 = c15693lM17302k.f48917b) == obj || (obj5 != null && obj.equals(obj5))) && (obj6 = c15693lM17302k.f48918c) != null)) {
                                return obj6;
                            }
                            synchronized (c15693lM17302k) {
                                try {
                                    if (m17302k(c15693lArrM17299e, i11) != c15693lM17302k) {
                                        obj3 = null;
                                    } else if (i12 >= 0) {
                                        i10 = 1;
                                        C15693l c15693l = c15693lM17302k;
                                        while (true) {
                                            if (c15693l.f48916a == iM17301i && ((obj4 = c15693l.f48917b) == obj || (obj4 != null && obj.equals(obj4)))) {
                                                obj3 = c15693l.f48918c;
                                                if (!z6) {
                                                    c15693l.f48918c = obj2;
                                                }
                                            } else {
                                                C15693l c15693l2 = c15693l.f48919d;
                                                if (c15693l2 == null) {
                                                    c15693l.f48919d = new C15693l(iM17301i, obj, obj2);
                                                    obj3 = null;
                                                } else {
                                                    i10++;
                                                    c15693l = c15693l2;
                                                }
                                            }
                                        }
                                    } else if (c15693lM17302k instanceof C15698q) {
                                        C15699r c15699rM17329e = ((C15698q) c15693lM17302k).m17329e(iM17301i, obj, obj2);
                                        if (c15699rM17329e != null) {
                                            Object obj7 = c15699rM17329e.f48918c;
                                            if (!z6) {
                                                c15699rM17329e.f48918c = obj2;
                                            }
                                            obj3 = obj7;
                                        } else {
                                            obj3 = null;
                                        }
                                        i10 = 2;
                                    } else {
                                        if (c15693lM17302k instanceof C15694m) {
                                            throw new IllegalStateException("Recursive update");
                                        }
                                        obj3 = null;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            if (i10 != 0) {
                                if (i10 >= 8) {
                                    m17305n(c15693lArrM17299e, i11);
                                }
                                if (obj3 == null) {
                                    break;
                                }
                                return obj3;
                            }
                        }
                    }
                }
            }
            c15693lArrM17299e = m17299e();
        }
        m17296a(1L, i10);
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        m17306o(map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            m17309f(entry.getKey(), entry.getValue(), false);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        return (V) m17310g(obj, null, null);
    }

    /* JADX WARN: Code duplicated, block: B:67:0x00b0 A[PHI: r7
      0x00b0: PHI (r7v3 boolean) = 
      (r7v1 boolean)
      (r7v4 boolean)
      (r7v4 boolean)
      (r7v4 boolean)
      (r7v4 boolean)
      (r7v4 boolean)
      (r7v4 boolean)
      (r7v4 boolean)
     binds: [B:66:0x00af, B:47:0x0077, B:49:0x007d, B:53:0x0085, B:55:0x008b, B:42:0x0069, B:32:0x004b, B:34:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: g */
    final Object m17310g(Object obj, Object obj2, Object obj3) {
        int length;
        int i10;
        C15693l c15693lM17302k;
        boolean z6;
        Object obj4;
        C15699r c15699rM17331b;
        Object obj5;
        int iM17301i = m17301i(obj.hashCode());
        C15693l[] c15693lArrM17308d = this.f48891a;
        while (c15693lArrM17308d != null && (length = c15693lArrM17308d.length) != 0 && (c15693lM17302k = m17302k(c15693lArrM17308d, (i10 = (length - 1) & iM17301i))) != null) {
            int i11 = c15693lM17302k.f48916a;
            if (i11 == -1) {
                c15693lArrM17308d = m17308d(c15693lArrM17308d, c15693lM17302k);
            } else {
                synchronized (c15693lM17302k) {
                    try {
                        if (m17302k(c15693lArrM17308d, i10) == c15693lM17302k) {
                            z6 = true;
                            if (i11 >= 0) {
                                C15693l c15693l = null;
                                C15693l c15693l2 = c15693lM17302k;
                                while (true) {
                                    if (c15693l2.f48916a == iM17301i && ((obj5 = c15693l2.f48917b) == obj || (obj5 != null && obj.equals(obj5)))) {
                                        obj4 = c15693l2.f48918c;
                                        if (obj3 == null || obj3 == obj4 || (obj4 != null && obj3.equals(obj4))) {
                                            if (obj2 != null) {
                                                c15693l2.f48918c = obj2;
                                            } else if (c15693l != null) {
                                                c15693l.f48919d = c15693l2.f48919d;
                                            } else {
                                                m17300h(c15693lArrM17308d, i10, c15693l2.f48919d);
                                            }
                                        }
                                    } else {
                                        C15693l c15693l3 = c15693l2.f48919d;
                                        if (c15693l3 != null) {
                                            c15693l = c15693l2;
                                            c15693l2 = c15693l3;
                                        }
                                    }
                                    obj4 = null;
                                }
                            } else if (c15693lM17302k instanceof C15698q) {
                                C15698q c15698q = (C15698q) c15693lM17302k;
                                C15699r c15699r = c15698q.f48934e;
                                if (c15699r == null || (c15699rM17331b = c15699r.m17331b(iM17301i, obj, null)) == null) {
                                    obj4 = null;
                                } else {
                                    obj4 = c15699rM17331b.f48918c;
                                    if (obj3 != null && obj3 != obj4 && (obj4 == null || !obj3.equals(obj4))) {
                                        obj4 = null;
                                    } else if (obj2 != null) {
                                        c15699rM17331b.f48918c = obj2;
                                    } else if (c15698q.m17330f(c15699rM17331b)) {
                                        m17300h(c15693lArrM17308d, i10, m17307p(c15698q.f48935f));
                                    }
                                }
                            } else {
                                if (c15693lM17302k instanceof C15694m) {
                                    throw new IllegalStateException("Recursive update");
                                }
                                z6 = false;
                                obj4 = null;
                            }
                        } else {
                            z6 = false;
                            obj4 = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (z6) {
                    if (obj4 == null) {
                        break;
                    }
                    if (obj2 == null) {
                        m17296a(-1L, -1);
                    }
                    return obj4;
                }
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        C15693l c15693lM17302k;
        C15693l c15693l;
        C15693l[] c15693lArrM17308d = this.f48891a;
        long j10 = 0;
        loop0: while (true) {
            int i10 = 0;
            while (true) {
                if (c15693lArrM17308d == null || i10 >= c15693lArrM17308d.length) {
                    break loop0;
                }
                c15693lM17302k = m17302k(c15693lArrM17308d, i10);
                if (c15693lM17302k == null) {
                    i10++;
                } else {
                    int i11 = c15693lM17302k.f48916a;
                    if (i11 == -1) {
                        break;
                    }
                    synchronized (c15693lM17302k) {
                        try {
                            if (m17302k(c15693lArrM17308d, i10) == c15693lM17302k) {
                                if (i11 >= 0) {
                                    c15693l = c15693lM17302k;
                                } else {
                                    c15693l = c15693lM17302k instanceof C15698q ? ((C15698q) c15693lM17302k).f48935f : null;
                                }
                                while (c15693l != null) {
                                    j10--;
                                    c15693l = c15693l.f48919d;
                                }
                                m17300h(c15693lArrM17308d, i10, null);
                                i10++;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
            c15693lArrM17308d = m17308d(c15693lArrM17308d, c15693lM17302k);
        }
        if (j10 != 0) {
            m17296a(j10, -1);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        C15690i c15690i = this.f48894d;
        if (c15690i != null) {
            return c15690i;
        }
        C15690i c15690i2 = new C15690i(this);
        this.f48894d = c15690i2;
        return c15690i2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        C15700s c15700s = this.f48895e;
        if (c15700s != null) {
            return c15700s;
        }
        C15700s c15700s2 = new C15700s(this);
        this.f48895e = c15700s2;
        return c15700s2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        C15686e c15686e = this.f48896f;
        if (c15686e != null) {
            return c15686e;
        }
        C15686e c15686e2 = new C15686e(this);
        this.f48896f = c15686e2;
        return c15686e2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        C15693l[] c15693lArr = this.f48891a;
        int iHashCode = 0;
        if (c15693lArr != null) {
            C15697p c15697p = new C15697p(c15693lArr, c15693lArr.length, 0, c15693lArr.length);
            while (true) {
                C15693l c15693lM17322a = c15697p.m17322a();
                if (c15693lM17322a == null) {
                    break;
                }
                iHashCode += c15693lM17322a.f48918c.hashCode() ^ c15693lM17322a.f48917b.hashCode();
            }
        }
        return iHashCode;
    }

    @Override // java.util.AbstractMap
    public String toString() {
        C15693l[] c15693lArr = this.f48891a;
        int length = c15693lArr == null ? 0 : c15693lArr.length;
        C15697p c15697p = new C15697p(c15693lArr, length, 0, length);
        StringBuilder sb2 = new StringBuilder("{");
        C15693l c15693lM17322a = c15697p.m17322a();
        if (c15693lM17322a != null) {
            while (true) {
                Object obj = c15693lM17322a.f48917b;
                Object obj2 = c15693lM17322a.f48918c;
                if (obj == this) {
                    obj = "(this Map)";
                }
                sb2.append(obj);
                sb2.append('=');
                if (obj2 == this) {
                    obj2 = "(this Map)";
                }
                sb2.append(obj2);
                c15693lM17322a = c15697p.m17322a();
                if (c15693lM17322a == null) {
                    break;
                }
                sb2.append(", ");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        V value;
        V v2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        C15693l[] c15693lArr = this.f48891a;
        int length = c15693lArr == null ? 0 : c15693lArr.length;
        C15697p c15697p = new C15697p(c15693lArr, length, 0, length);
        while (true) {
            C15693l c15693lM17322a = c15697p.m17322a();
            if (c15693lM17322a != null) {
                Object obj2 = c15693lM17322a.f48918c;
                Object obj3 = map.get(c15693lM17322a.f48917b);
                if (obj3 == null || (obj3 != obj2 && !obj3.equals(obj2))) {
                    break;
                }
            } else {
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    K key = entry.getKey();
                    if (key == null || (value = entry.getValue()) == null || (v2 = get(key)) == null || (value != v2 && !value.equals(v2))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int i10 = 0;
        int i11 = 1;
        while (i11 < 16) {
            i10++;
            i11 <<= 1;
        }
        int i12 = 32 - i10;
        int i13 = i11 - 1;
        C15695n[] c15695nArr = new C15695n[16];
        for (int i14 = 0; i14 < 16; i14++) {
            c15695nArr[i14] = new C15695n();
        }
        ObjectOutputStream.PutField putFieldPutFields = objectOutputStream.putFields();
        putFieldPutFields.put("segments", c15695nArr);
        putFieldPutFields.put("segmentShift", i12);
        putFieldPutFields.put("segmentMask", i13);
        objectOutputStream.writeFields();
        C15693l[] c15693lArr = this.f48891a;
        if (c15693lArr != null) {
            C15697p c15697p = new C15697p(c15693lArr, c15693lArr.length, 0, c15693lArr.length);
            while (true) {
                C15693l c15693lM17322a = c15697p.m17322a();
                if (c15693lM17322a == null) {
                    break;
                }
                objectOutputStream.writeObject(c15693lM17322a.f48917b);
                objectOutputStream.writeObject(c15693lM17322a.f48918c);
            }
        }
        objectOutputStream.writeObject(null);
        objectOutputStream.writeObject(null);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        long j10;
        boolean z6;
        boolean z10;
        Object obj;
        this.sizeCtl = -1;
        objectInputStream.defaultReadObject();
        long j11 = 0;
        long j12 = 0;
        C15693l c15693l = null;
        while (true) {
            Object object = objectInputStream.readObject();
            Object object2 = objectInputStream.readObject();
            j10 = 1;
            if (object == null || object2 == null) {
                break;
            }
            j12++;
            c15693l = new C15693l(m17301i(object.hashCode()), object, object2, c15693l);
        }
        if (j12 == 0) {
            this.sizeCtl = 0;
            return;
        }
        long j13 = (long) (((double) (j12 / 0.75f)) + 1.0d);
        int iM17303l = j13 >= 1073741824 ? 1073741824 : m17303l((int) j13);
        C15693l[] c15693lArr = new C15693l[iM17303l];
        int i10 = iM17303l - 1;
        while (c15693l != null) {
            C15693l c15693l2 = c15693l.f48919d;
            int i11 = c15693l.f48916a;
            int i12 = i11 & i10;
            C15693l c15693lM17302k = m17302k(c15693lArr, i12);
            if (c15693lM17302k == null) {
                z10 = true;
            } else {
                Object obj2 = c15693l.f48917b;
                if (c15693lM17302k.f48916a >= 0) {
                    C15693l c15693l3 = c15693lM17302k;
                    int i13 = 0;
                    while (true) {
                        if (c15693l3 == null) {
                            z6 = true;
                            break;
                        }
                        if (c15693l3.f48916a == i11 && ((obj = c15693l3.f48917b) == obj2 || (obj != null && obj2.equals(obj)))) {
                            z6 = false;
                            break;
                        } else {
                            i13++;
                            c15693l3 = c15693l3.f48919d;
                        }
                    }
                    if (!z6 || i13 < 8) {
                        z10 = z6;
                    } else {
                        long j14 = j11 + 1;
                        c15693l.f48919d = c15693lM17302k;
                        C15693l c15693l4 = c15693l;
                        C15699r c15699r = null;
                        C15699r c15699r2 = null;
                        while (c15693l4 != null) {
                            long j15 = j14;
                            C15699r c15699r3 = new C15699r(c15693l4.f48916a, c15693l4.f48917b, c15693l4.f48918c, null, null);
                            c15699r3.f48940h = c15699r2;
                            if (c15699r2 == null) {
                                c15699r = c15699r3;
                            } else {
                                c15699r2.f48919d = c15699r3;
                            }
                            c15693l4 = c15693l4.f48919d;
                            c15699r2 = c15699r3;
                            j14 = j15;
                        }
                        m17300h(c15693lArr, i12, new C15698q(c15699r));
                        j11 = j14;
                    }
                } else if (((C15698q) c15693lM17302k).m17329e(i11, obj2, c15693l.f48918c) == null) {
                    j11 += j10;
                }
                z10 = false;
            }
            if (z10) {
                j11++;
                c15693l.f48919d = c15693lM17302k;
                m17300h(c15693lArr, i12, c15693l);
            }
            j10 = 1;
            c15693l = c15693l2;
        }
        this.f48891a = c15693lArr;
        this.sizeCtl = iM17303l - (iM17303l >>> 2);
        this.baseCount = j11;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p817j$.util.Map
    public V putIfAbsent(K k8, V v2) {
        return (V) m17309f(k8, v2, true);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p817j$.util.Map
    public boolean remove(Object obj, Object obj2) {
        obj.getClass();
        return (obj2 == null || m17310g(obj, null, obj2) == null) ? false : true;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p817j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        if (obj == null || obj2 == null || obj3 == null) {
            throw null;
        }
        return m17310g(obj, obj3, obj2) != null;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p817j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            throw null;
        }
        return m17310g(obj, obj2, null);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p817j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        V v2 = get(obj);
        return v2 == null ? obj2 : v2;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p817j$.util.Map
    public final void forEach(BiConsumer biConsumer) {
        biConsumer.getClass();
        C15693l[] c15693lArr = this.f48891a;
        if (c15693lArr == null) {
            return;
        }
        C15697p c15697p = new C15697p(c15693lArr, c15693lArr.length, 0, c15693lArr.length);
        while (true) {
            C15693l c15693lM17322a = c15697p.m17322a();
            if (c15693lM17322a == null) {
                return;
            } else {
                biConsumer.accept(c15693lM17322a.f48917b, c15693lM17322a.f48918c);
            }
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p817j$.util.Map
    public final void replaceAll(BiFunction biFunction) {
        biFunction.getClass();
        C15693l[] c15693lArr = this.f48891a;
        if (c15693lArr == null) {
            return;
        }
        C15697p c15697p = new C15697p(c15693lArr, c15693lArr.length, 0, c15693lArr.length);
        while (true) {
            C15693l c15693lM17322a = c15697p.m17322a();
            if (c15693lM17322a == null) {
                return;
            }
            Object obj = c15693lM17322a.f48918c;
            Object obj2 = c15693lM17322a.f48917b;
            do {
                Object objApply = biFunction.apply(obj2, obj);
                objApply.getClass();
                if (m17310g(obj2, objApply, obj) != null) {
                    break;
                } else {
                    obj = get(obj2);
                }
            } while (obj != null);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0043 */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p817j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object computeIfAbsent(Object obj, Function function) {
        C15699r c15699rM17331b;
        Object obj2;
        Object obj3;
        Object obj4;
        if (obj == null || function == null) {
            throw null;
        }
        int iM17301i = m17301i(obj.hashCode());
        C15693l[] c15693lArrM17299e = this.f48891a;
        Object objApply = null;
        int i10 = 0;
        while (true) {
            if (c15693lArrM17299e != null) {
                int length = c15693lArrM17299e.length;
                if (length != 0) {
                    int i11 = (length - 1) & iM17301i;
                    C15693l c15693lM17302k = m17302k(c15693lArrM17299e, i11);
                    boolean z6 = true;
                    if (c15693lM17302k == null) {
                        C15694m c15694m = new C15694m();
                        synchronized (c15694m) {
                            if (m17297b(c15693lArrM17299e, i11, c15694m)) {
                                try {
                                    objApply = function.apply(obj);
                                    m17300h(c15693lArrM17299e, i11, objApply != null ? new C15693l(iM17301i, obj, objApply) : null);
                                    i10 = 1;
                                } catch (Throwable th2) {
                                    m17300h(c15693lArrM17299e, i11, null);
                                    throw th2;
                                }
                            }
                        }
                        if (i10 != 0) {
                            break;
                        }
                    } else {
                        int i12 = c15693lM17302k.f48916a;
                        if (i12 == -1) {
                            c15693lArrM17299e = m17308d(c15693lArrM17299e, c15693lM17302k);
                        } else {
                            if (i12 == iM17301i && (((obj3 = c15693lM17302k.f48917b) == obj || (obj3 != null && obj.equals(obj3))) && (obj4 = c15693lM17302k.f48918c) != null)) {
                                return obj4;
                            }
                            synchronized (c15693lM17302k) {
                                try {
                                    if (m17302k(c15693lArrM17299e, i11) != c15693lM17302k) {
                                        z6 = false;
                                        break;
                                    }
                                    if (i12 >= 0) {
                                        C15693l c15693l = c15693lM17302k;
                                        i10 = 1;
                                        while (true) {
                                            if (c15693l.f48916a == iM17301i && ((obj2 = c15693l.f48917b) == obj || (obj2 != null && obj.equals(obj2)))) {
                                                objApply = c15693l.f48918c;
                                                z6 = false;
                                                break;
                                            }
                                            C15693l c15693l2 = c15693l.f48919d;
                                            if (c15693l2 == null) {
                                                Object objApply2 = function.apply(obj);
                                                if (objApply2 == null) {
                                                    z6 = false;
                                                } else {
                                                    if (c15693l.f48919d != null) {
                                                        throw new IllegalStateException("Recursive update");
                                                    }
                                                    c15693l.f48919d = new C15693l(iM17301i, obj, objApply2);
                                                }
                                                objApply = objApply2;
                                                break;
                                            }
                                            i10++;
                                            c15693l = c15693l2;
                                        }
                                    } else if (c15693lM17302k instanceof C15698q) {
                                        C15698q c15698q = (C15698q) c15693lM17302k;
                                        C15699r c15699r = c15698q.f48934e;
                                        if (c15699r != null && (c15699rM17331b = c15699r.m17331b(iM17301i, obj, null)) != null) {
                                            z6 = false;
                                            objApply = c15699rM17331b.f48918c;
                                        } else {
                                            objApply = function.apply(obj);
                                            if (objApply != null) {
                                                c15698q.m17329e(iM17301i, obj, objApply);
                                            } else {
                                                z6 = false;
                                            }
                                        }
                                        i10 = 2;
                                    } else {
                                        if (!(c15693lM17302k instanceof C15694m)) {
                                            z6 = false;
                                            break;
                                        }
                                        throw new IllegalStateException("Recursive update");
                                    }
                                } catch (Throwable th3) {
                                    throw th3;
                                }
                            }
                            if (i10 != 0) {
                                if (i10 >= 8) {
                                    m17305n(c15693lArrM17299e, i11);
                                }
                                if (z6) {
                                    break;
                                }
                                return objApply;
                            }
                        }
                    }
                }
            }
            c15693lArrM17299e = m17299e();
        }
        if (objApply != null) {
            m17296a(1L, i10);
        }
        return objApply;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p817j$.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        C15699r c15699rM17331b;
        Object obj2;
        if (obj == null || biFunction == null) {
            throw null;
        }
        int iM17301i = m17301i(obj.hashCode());
        C15693l[] c15693lArrM17299e = this.f48891a;
        int i10 = 0;
        Object objApply = null;
        int i11 = 0;
        while (true) {
            if (c15693lArrM17299e != null) {
                int length = c15693lArrM17299e.length;
                if (length != 0) {
                    int i12 = (length - 1) & iM17301i;
                    C15693l c15693lM17302k = m17302k(c15693lArrM17299e, i12);
                    if (c15693lM17302k == null) {
                        break;
                    }
                    int i13 = c15693lM17302k.f48916a;
                    if (i13 == -1) {
                        c15693lArrM17299e = m17308d(c15693lArrM17299e, c15693lM17302k);
                    } else {
                        synchronized (c15693lM17302k) {
                            try {
                                if (m17302k(c15693lArrM17299e, i12) == c15693lM17302k) {
                                    if (i13 >= 0) {
                                        i11 = 1;
                                        C15693l c15693l = null;
                                        C15693l c15693l2 = c15693lM17302k;
                                        while (true) {
                                            if (c15693l2.f48916a == iM17301i && ((obj2 = c15693l2.f48917b) == obj || (obj2 != null && obj.equals(obj2)))) {
                                                objApply = biFunction.apply(obj, c15693l2.f48918c);
                                                if (objApply != null) {
                                                    c15693l2.f48918c = objApply;
                                                    break;
                                                }
                                                C15693l c15693l3 = c15693l2.f48919d;
                                                if (c15693l != null) {
                                                    c15693l.f48919d = c15693l3;
                                                } else {
                                                    m17300h(c15693lArrM17299e, i12, c15693l3);
                                                }
                                                i10 = -1;
                                                break;
                                            }
                                            C15693l c15693l4 = c15693l2.f48919d;
                                            if (c15693l4 == null) {
                                                break;
                                            }
                                            i11++;
                                            c15693l = c15693l2;
                                            c15693l2 = c15693l4;
                                        }
                                    } else if (c15693lM17302k instanceof C15698q) {
                                        C15698q c15698q = (C15698q) c15693lM17302k;
                                        C15699r c15699r = c15698q.f48934e;
                                        if (c15699r != null && (c15699rM17331b = c15699r.m17331b(iM17301i, obj, null)) != null) {
                                            objApply = biFunction.apply(obj, c15699rM17331b.f48918c);
                                            if (objApply != null) {
                                                c15699rM17331b.f48918c = objApply;
                                            } else {
                                                if (c15698q.m17330f(c15699rM17331b)) {
                                                    m17300h(c15693lArrM17299e, i12, m17307p(c15698q.f48935f));
                                                }
                                                i10 = -1;
                                            }
                                        }
                                        i11 = 2;
                                    } else if (c15693lM17302k instanceof C15694m) {
                                        throw new IllegalStateException("Recursive update");
                                    }
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        if (i11 != 0) {
                            break;
                        }
                    }
                }
            }
            c15693lArrM17299e = m17299e();
        }
        if (i10 != 0) {
            m17296a(i10, i11);
        }
        return objApply;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0044 */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p817j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object compute(Object obj, BiFunction biFunction) {
        C15693l c15693l;
        Object objApply;
        Object obj2;
        if (obj == null || biFunction == null) {
            throw null;
        }
        int iM17301i = m17301i(obj.hashCode());
        C15693l[] c15693lArrM17299e = this.f48891a;
        int i10 = 0;
        Object objApply2 = null;
        int i11 = 0;
        while (true) {
            if (c15693lArrM17299e != null) {
                int length = c15693lArrM17299e.length;
                if (length != 0) {
                    int i12 = (length - 1) & iM17301i;
                    C15693l c15693lM17302k = m17302k(c15693lArrM17299e, i12);
                    if (c15693lM17302k == null) {
                        C15694m c15694m = new C15694m();
                        synchronized (c15694m) {
                            if (m17297b(c15693lArrM17299e, i12, c15694m)) {
                                try {
                                    objApply2 = biFunction.apply(obj, null);
                                    if (objApply2 != null) {
                                        c15693l = new C15693l(iM17301i, obj, objApply2);
                                        i11 = 1;
                                    } else {
                                        c15693l = null;
                                    }
                                    m17300h(c15693lArrM17299e, i12, c15693l);
                                    i10 = 1;
                                } catch (Throwable th2) {
                                    m17300h(c15693lArrM17299e, i12, null);
                                    throw th2;
                                }
                            }
                        }
                        if (i10 != 0) {
                            break;
                        }
                    } else {
                        int i13 = c15693lM17302k.f48916a;
                        if (i13 == -1) {
                            c15693lArrM17299e = m17308d(c15693lArrM17299e, c15693lM17302k);
                        } else {
                            synchronized (c15693lM17302k) {
                                try {
                                    if (m17302k(c15693lArrM17299e, i12) == c15693lM17302k) {
                                        if (i13 >= 0) {
                                            C15693l c15693l2 = null;
                                            C15693l c15693l3 = c15693lM17302k;
                                            i10 = 1;
                                            while (true) {
                                                if (c15693l3.f48916a == iM17301i && ((obj2 = c15693l3.f48917b) == obj || (obj2 != null && obj.equals(obj2)))) {
                                                    Object objApply3 = biFunction.apply(obj, c15693l3.f48918c);
                                                    if (objApply3 != null) {
                                                        c15693l3.f48918c = objApply3;
                                                        objApply2 = objApply3;
                                                    } else {
                                                        C15693l c15693l4 = c15693l3.f48919d;
                                                        if (c15693l2 != null) {
                                                            c15693l2.f48919d = c15693l4;
                                                        } else {
                                                            m17300h(c15693lArrM17299e, i12, c15693l4);
                                                        }
                                                        objApply2 = objApply3;
                                                        i11 = -1;
                                                    }
                                                } else {
                                                    C15693l c15693l5 = c15693l3.f48919d;
                                                    if (c15693l5 == null) {
                                                        objApply = biFunction.apply(obj, null);
                                                        if (objApply != null) {
                                                            if (c15693l3.f48919d != null) {
                                                                throw new IllegalStateException("Recursive update");
                                                            }
                                                            c15693l3.f48919d = new C15693l(iM17301i, obj, objApply);
                                                            i11 = 1;
                                                        }
                                                        objApply2 = objApply;
                                                    } else {
                                                        i10++;
                                                        c15693l2 = c15693l3;
                                                        c15693l3 = c15693l5;
                                                    }
                                                }
                                            }
                                        } else if (c15693lM17302k instanceof C15698q) {
                                            C15698q c15698q = (C15698q) c15693lM17302k;
                                            C15699r c15699r = c15698q.f48934e;
                                            C15699r c15699rM17331b = c15699r != null ? c15699r.m17331b(iM17301i, obj, null) : null;
                                            objApply = biFunction.apply(obj, c15699rM17331b == null ? null : c15699rM17331b.f48918c);
                                            if (objApply != null) {
                                                if (c15699rM17331b != null) {
                                                    c15699rM17331b.f48918c = objApply;
                                                } else {
                                                    c15698q.m17329e(iM17301i, obj, objApply);
                                                    i11 = 1;
                                                }
                                            } else if (c15699rM17331b != null) {
                                                if (c15698q.m17330f(c15699rM17331b)) {
                                                    m17300h(c15693lArrM17299e, i12, m17307p(c15698q.f48935f));
                                                }
                                                i11 = -1;
                                            }
                                            i10 = 1;
                                            objApply2 = objApply;
                                        } else if (c15693lM17302k instanceof C15694m) {
                                            throw new IllegalStateException("Recursive update");
                                        }
                                    }
                                } catch (Throwable th3) {
                                    throw th3;
                                }
                            }
                            if (i10 != 0) {
                                if (i10 < 8) {
                                    break;
                                }
                                m17305n(c15693lArrM17299e, i12);
                                break;
                            }
                        }
                    }
                }
            }
            c15693lArrM17299e = m17299e();
        }
        if (i11 != 0) {
            m17296a(i11, i10);
        }
        return objApply2;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p817j$.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        int i10;
        Object obj3;
        Object obj4 = obj2;
        if (obj == null || obj4 == null || biFunction == null) {
            throw null;
        }
        int iM17301i = m17301i(obj.hashCode());
        C15693l[] c15693lArrM17299e = this.f48891a;
        int i11 = 0;
        Object obj5 = null;
        int i12 = 0;
        while (true) {
            if (c15693lArrM17299e != null) {
                int length = c15693lArrM17299e.length;
                if (length != 0) {
                    int i13 = (length - 1) & iM17301i;
                    C15693l c15693lM17302k = m17302k(c15693lArrM17299e, i13);
                    i10 = 1;
                    if (c15693lM17302k == null) {
                        if (m17297b(c15693lArrM17299e, i13, new C15693l(iM17301i, obj, obj4))) {
                            break;
                        }
                    } else {
                        int i14 = c15693lM17302k.f48916a;
                        if (i14 == -1) {
                            c15693lArrM17299e = m17308d(c15693lArrM17299e, c15693lM17302k);
                        } else {
                            synchronized (c15693lM17302k) {
                                try {
                                    if (m17302k(c15693lArrM17299e, i13) == c15693lM17302k) {
                                        if (i14 >= 0) {
                                            C15693l c15693l = null;
                                            C15693l c15693l2 = c15693lM17302k;
                                            i11 = 1;
                                            while (true) {
                                                if (c15693l2.f48916a == iM17301i && ((obj3 = c15693l2.f48917b) == obj || (obj3 != null && obj.equals(obj3)))) {
                                                    Object objApply = biFunction.apply(c15693l2.f48918c, obj4);
                                                    if (objApply != null) {
                                                        c15693l2.f48918c = objApply;
                                                        obj5 = objApply;
                                                        break;
                                                    }
                                                    C15693l c15693l3 = c15693l2.f48919d;
                                                    if (c15693l != null) {
                                                        c15693l.f48919d = c15693l3;
                                                    } else {
                                                        m17300h(c15693lArrM17299e, i13, c15693l3);
                                                    }
                                                    obj5 = objApply;
                                                    i12 = -1;
                                                    break;
                                                }
                                                C15693l c15693l4 = c15693l2.f48919d;
                                                if (c15693l4 == null) {
                                                    c15693l2.f48919d = new C15693l(iM17301i, obj, obj4);
                                                    obj5 = obj4;
                                                    i12 = 1;
                                                    break;
                                                }
                                                i11++;
                                                c15693l = c15693l2;
                                                c15693l2 = c15693l4;
                                            }
                                        } else if (c15693lM17302k instanceof C15698q) {
                                            C15698q c15698q = (C15698q) c15693lM17302k;
                                            C15699r c15699r = c15698q.f48934e;
                                            C15699r c15699rM17331b = c15699r == null ? null : c15699r.m17331b(iM17301i, obj, null);
                                            Object objApply2 = c15699rM17331b == null ? obj4 : biFunction.apply(c15699rM17331b.f48918c, obj4);
                                            if (objApply2 != null) {
                                                if (c15699rM17331b != null) {
                                                    c15699rM17331b.f48918c = objApply2;
                                                } else {
                                                    c15698q.m17329e(iM17301i, obj, objApply2);
                                                    i12 = 1;
                                                }
                                            } else if (c15699rM17331b != null) {
                                                if (c15698q.m17330f(c15699rM17331b)) {
                                                    m17300h(c15693lArrM17299e, i13, m17307p(c15698q.f48935f));
                                                }
                                                i12 = -1;
                                            }
                                            i11 = 2;
                                            obj5 = objApply2;
                                        } else if (c15693lM17302k instanceof C15694m) {
                                            throw new IllegalStateException("Recursive update");
                                        }
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            if (i11 != 0) {
                                if (i11 >= 8) {
                                    m17305n(c15693lArrM17299e, i13);
                                }
                                i10 = i12;
                                obj4 = obj5;
                                break;
                            }
                        }
                    }
                }
            }
            c15693lArrM17299e = m17299e();
        }
        if (i10 != 0) {
            m17296a(i10, i11);
        }
        return obj4;
    }

    public boolean contains(Object obj) {
        return containsValue(obj);
    }

    public Enumeration<K> keys() {
        C15693l[] c15693lArr = this.f48891a;
        int length = c15693lArr == null ? 0 : c15693lArr.length;
        return new C15689h(c15693lArr, length, length, this, 0);
    }

    public Enumeration<V> elements() {
        C15693l[] c15693lArr = this.f48891a;
        int length = c15693lArr == null ? 0 : c15693lArr.length;
        return new C15689h(c15693lArr, length, length, this, 1);
    }

    /* JADX INFO: renamed from: e */
    private final C15693l[] m17299e() {
        while (true) {
            C15693l[] c15693lArr = this.f48891a;
            if (c15693lArr != null && c15693lArr.length != 0) {
                return c15693lArr;
            }
            int i10 = this.sizeCtl;
            if (i10 < 0) {
                Thread.yield();
            } else if (f48883h.m16757c(this, f48884i, i10, -1)) {
                try {
                    C15693l[] c15693lArr2 = this.f48891a;
                    if (c15693lArr2 == null || c15693lArr2.length == 0) {
                        int i11 = i10 > 0 ? i10 : 16;
                        C15693l[] c15693lArr3 = new C15693l[i11];
                        this.f48891a = c15693lArr3;
                        i10 = i11 - (i11 >>> 2);
                        c15693lArr2 = c15693lArr3;
                    }
                    return c15693lArr2;
                } finally {
                    this.sizeCtl = i10;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:149:0x019f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:150:0x014e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:6:0x001c  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:99:0x0141 A[Catch: all -> 0x014c, TRY_LEAVE, TryCatch #2 {all -> 0x014c, blocks: (B:97:0x013d, B:99:0x0141), top: B:132:0x013d }] */
    /* JADX INFO: renamed from: a */
    private final void m17296a(long j10, int i10) {
        boolean zM16758d;
        int iM17313b;
        C15684c[] c15684cArr;
        C15532a c15532a;
        long j11;
        long j12;
        boolean z6;
        int length;
        boolean z10;
        int length2;
        int length3;
        C15684c c15684c;
        long jM17311j;
        C15693l[] c15693lArr;
        int length4;
        C15693l[] c15693lArr2;
        C15684c[] c15684cArr2 = this.f48893c;
        if (c15684cArr2 == null) {
            C15532a c15532a2 = f48883h;
            long j13 = f48886k;
            long j14 = this.baseCount;
            jM17311j = j14 + j10;
            if (!c15532a2.m16758d(this, j13, j14, jM17311j)) {
                if (c15684cArr2 != null || (length3 = c15684cArr2.length - 1) < 0 || (c15684c = c15684cArr2[length3 & ThreadLocalRandom.m17313b()]) == null) {
                    zM16758d = true;
                } else {
                    C15532a c15532a3 = f48883h;
                    long j15 = f48888m;
                    long j16 = c15684c.value;
                    zM16758d = c15532a3.m16758d(c15684c, j15, j16, j16 + j10);
                    if (zM16758d) {
                        if (i10 <= 1) {
                            return;
                        } else {
                            jM17311j = m17311j();
                        }
                    }
                }
                iM17313b = ThreadLocalRandom.m17313b();
                if (iM17313b == 0) {
                    ThreadLocalRandom.m17314f();
                    iM17313b = ThreadLocalRandom.m17313b();
                    zM16758d = true;
                }
                boolean z11 = zM16758d;
                while (true) {
                    boolean z12 = false;
                    while (true) {
                        c15684cArr = this.f48893c;
                        if (c15684cArr == null && (length = c15684cArr.length) > 0) {
                            C15684c c15684c2 = c15684cArr[(length - 1) & iM17313b];
                            if (c15684c2 == null) {
                                if (this.cellsBusy == 0) {
                                    C15684c c15684c3 = new C15684c(j10);
                                    if (this.cellsBusy == 0 && f48883h.m16757c(this, f48887l, 0, 1)) {
                                        try {
                                            C15684c[] c15684cArr3 = this.f48893c;
                                            if (c15684cArr3 == null || (length2 = c15684cArr3.length) <= 0) {
                                                z10 = false;
                                            } else {
                                                int i11 = (length2 - 1) & iM17313b;
                                                if (c15684cArr3[i11] == null) {
                                                    c15684cArr3[i11] = c15684c3;
                                                    z10 = true;
                                                } else {
                                                    z10 = false;
                                                }
                                            }
                                            this.cellsBusy = 0;
                                            if (z10) {
                                                return;
                                            }
                                        } catch (Throwable th2) {
                                            this.cellsBusy = 0;
                                            throw th2;
                                        }
                                    }
                                }
                            } else {
                                if (z11) {
                                    C15532a c15532a4 = f48883h;
                                    long j17 = f48888m;
                                    long j18 = c15684c2.value;
                                    if (!c15532a4.m16758d(c15684c2, j17, j18, j18 + j10)) {
                                        if (this.f48893c == c15684cArr && length < f48882g) {
                                            if (!z12) {
                                                z12 = true;
                                            } else if (this.cellsBusy == 0 && c15532a4.m16757c(this, f48887l, 0, 1)) {
                                                break;
                                            }
                                        }
                                    } else {
                                        return;
                                    }
                                } else {
                                    z11 = true;
                                }
                                iM17313b = ThreadLocalRandom.m17312a(iM17313b);
                            }
                            z12 = false;
                            iM17313b = ThreadLocalRandom.m17312a(iM17313b);
                        } else if (this.cellsBusy != 0 && this.f48893c == c15684cArr && f48883h.m16757c(this, f48887l, 0, 1)) {
                            try {
                                if (this.f48893c == c15684cArr) {
                                    C15684c[] c15684cArr4 = new C15684c[2];
                                    c15684cArr4[iM17313b & 1] = new C15684c(j10);
                                    this.f48893c = c15684cArr4;
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                this.cellsBusy = 0;
                                if (z6) {
                                    return;
                                }
                            } catch (Throwable th3) {
                                this.cellsBusy = 0;
                                throw th3;
                            }
                        } else {
                            c15532a = f48883h;
                            j11 = f48886k;
                            j12 = this.baseCount;
                            if (c15532a.m16758d(this, j11, j12, j12 + j10)) {
                                return;
                            }
                        }
                    }
                    try {
                        if (this.f48893c == c15684cArr) {
                            this.f48893c = (C15684c[]) Arrays.copyOf(c15684cArr, length << 1);
                        }
                        this.cellsBusy = 0;
                    } catch (Throwable th4) {
                        this.cellsBusy = 0;
                        throw th4;
                    }
                }
            }
        } else {
            if (c15684cArr2 != null) {
                zM16758d = true;
            } else {
                zM16758d = true;
            }
            iM17313b = ThreadLocalRandom.m17313b();
            if (iM17313b == 0) {
                ThreadLocalRandom.m17314f();
                iM17313b = ThreadLocalRandom.m17313b();
                zM16758d = true;
            }
            boolean z13 = zM16758d;
            while (true) {
                boolean z14 = false;
                while (true) {
                    c15684cArr = this.f48893c;
                    if (c15684cArr == null) {
                    }
                    if (this.cellsBusy != 0) {
                    }
                    c15532a = f48883h;
                    j11 = f48886k;
                    j12 = this.baseCount;
                    if (c15532a.m16758d(this, j11, j12, j12 + j10)) {
                        return;
                    }
                }
                if (this.f48893c == c15684cArr) {
                    this.f48893c = (C15684c[]) Arrays.copyOf(c15684cArr, length << 1);
                }
                this.cellsBusy = 0;
            }
        }
        if (i10 < 0) {
            return;
        }
        while (true) {
            int i12 = this.sizeCtl;
            if (jM17311j < i12 || (c15693lArr = this.f48891a) == null || (length4 = c15693lArr.length) >= 1073741824) {
                return;
            }
            int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(length4) | 32768;
            if (i12 < 0) {
                if ((i12 >>> 16) != iNumberOfLeadingZeros || i12 == iNumberOfLeadingZeros + 1 || i12 == iNumberOfLeadingZeros + 65535 || (c15693lArr2 = this.f48892b) == null || this.transferIndex <= 0) {
                    return;
                }
                if (f48883h.m16757c(this, f48884i, i12, i12 + 1)) {
                    m17304m(c15693lArr, c15693lArr2);
                }
            } else if (f48883h.m16757c(this, f48884i, i12, (iNumberOfLeadingZeros << 16) + 2)) {
                m17304m(c15693lArr, null);
            }
            jM17311j = m17311j();
        }
    }

    /* JADX INFO: renamed from: d */
    final C15693l[] m17308d(C15693l[] c15693lArr, C15693l c15693l) {
        int i10;
        if (c15693l instanceof C15688g) {
            C15693l[] c15693lArr2 = ((C15688g) c15693l).f48909e;
            int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(c15693lArr.length) | 32768;
            while (c15693lArr2 == this.f48892b && this.f48891a == c15693lArr && (i10 = this.sizeCtl) < 0 && (i10 >>> 16) == iNumberOfLeadingZeros && i10 != iNumberOfLeadingZeros + 1 && i10 != 65535 + iNumberOfLeadingZeros && this.transferIndex > 0) {
                if (f48883h.m16757c(this, f48884i, i10, i10 + 1)) {
                    m17304m(c15693lArr, c15693lArr2);
                    break;
                }
            }
            return c15693lArr2;
        }
        return this.f48891a;
    }

    /* JADX INFO: renamed from: o */
    private final void m17306o(int i10) {
        int length;
        int iM17303l = i10 >= 536870912 ? 1073741824 : m17303l(i10 + (i10 >>> 1) + 1);
        while (true) {
            int i11 = this.sizeCtl;
            if (i11 < 0) {
                return;
            }
            C15693l[] c15693lArr = this.f48891a;
            if (c15693lArr == null || (length = c15693lArr.length) == 0) {
                int i12 = i11 > iM17303l ? i11 : iM17303l;
                if (f48883h.m16757c(this, f48884i, i11, -1)) {
                    try {
                        if (this.f48891a == c15693lArr) {
                            this.f48891a = new C15693l[i12];
                            i11 = i12 - (i12 >>> 2);
                        }
                        this.sizeCtl = i11;
                    } catch (Throwable th2) {
                        this.sizeCtl = i11;
                        throw th2;
                    }
                } else {
                    continue;
                }
            } else {
                if (iM17303l <= i11 || length >= 1073741824) {
                    return;
                }
                if (c15693lArr == this.f48891a) {
                    if (f48883h.m16757c(this, f48884i, i11, ((Integer.numberOfLeadingZeros(length) | 32768) << 16) + 2)) {
                        m17304m(c15693lArr, null);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: m */
    private final void m17304m(C15693l[] c15693lArr, C15693l[] c15693lArr2) {
        C15693l[] c15693lArr3;
        C15688g c15688g;
        boolean z6;
        int i10;
        C15693l c15698q;
        C15693l c15698q2;
        C15693l c15693l;
        ConcurrentHashMap<K, V> concurrentHashMap = this;
        C15693l[] c15693lArr4 = c15693lArr;
        int length = c15693lArr4.length;
        int i11 = f48882g;
        boolean z10 = true;
        int i12 = i11 > 1 ? (length >>> 3) / i11 : length;
        char c9 = 16;
        int i13 = i12 < 16 ? 16 : i12;
        if (c15693lArr2 == null) {
            try {
                C15693l[] c15693lArr5 = new C15693l[length << 1];
                concurrentHashMap.f48892b = c15693lArr5;
                concurrentHashMap.transferIndex = length;
                c15693lArr3 = c15693lArr5;
            } catch (Throwable unused) {
                concurrentHashMap.sizeCtl = Integer.MAX_VALUE;
                return;
            }
        } else {
            c15693lArr3 = c15693lArr2;
        }
        int length2 = c15693lArr3.length;
        C15688g c15688g2 = new C15688g(c15693lArr3);
        boolean zM17297b = true;
        int i14 = 0;
        int i15 = 0;
        boolean z11 = false;
        while (true) {
            if (zM17297b) {
                int i16 = i15 - 1;
                if (i16 >= i14 || z11) {
                    i14 = i14;
                    i15 = i16;
                    zM17297b = false;
                } else {
                    int i17 = concurrentHashMap.transferIndex;
                    if (i17 <= 0) {
                        i15 = -1;
                    } else {
                        C15532a c15532a = f48883h;
                        long j10 = f48885j;
                        int i18 = i17 > i13 ? i17 - i13 : 0;
                        int i19 = i14;
                        if (c15532a.m16757c(this, j10, i17, i18)) {
                            i15 = i17 - 1;
                            i14 = i18;
                        } else {
                            i14 = i19;
                            i15 = i16;
                        }
                    }
                    zM17297b = false;
                }
            } else {
                int i20 = i14;
                C15699r c15699r = null;
                C15693l c15693l2 = null;
                if (i15 < 0 || i15 >= length || (i10 = i15 + length) >= length2) {
                    i13 = i13;
                    length2 = length2;
                    c15688g = c15688g2;
                    if (z11) {
                        this.f48892b = null;
                        this.f48891a = c15693lArr3;
                        this.sizeCtl = (length << 1) - (length >>> 1);
                        return;
                    }
                    concurrentHashMap = this;
                    z6 = true;
                    C15532a c15532a2 = f48883h;
                    long j11 = f48884i;
                    int i21 = concurrentHashMap.sizeCtl;
                    int i22 = i15;
                    if (c15532a2.m16757c(this, j11, i21, i21 - 1)) {
                        c9 = 16;
                        if (i21 - 2 != ((Integer.numberOfLeadingZeros(length) | 32768) << 16)) {
                            return;
                        }
                        i15 = length;
                        zM17297b = true;
                        z11 = true;
                    } else {
                        c9 = 16;
                        i15 = i22;
                    }
                } else {
                    C15693l c15693lM17302k = m17302k(c15693lArr4, i15);
                    if (c15693lM17302k == null) {
                        zM17297b = m17297b(c15693lArr4, i15, c15688g2);
                        z6 = z10;
                    } else {
                        int i23 = c15693lM17302k.f48916a;
                        if (i23 == -1) {
                            zM17297b = z10;
                            z6 = zM17297b;
                        } else {
                            synchronized (c15693lM17302k) {
                                try {
                                    if (m17302k(c15693lArr4, i15) == c15693lM17302k) {
                                        if (i23 >= 0) {
                                            int i24 = i23 & length;
                                            C15693l c15693l3 = c15693lM17302k;
                                            for (C15693l c15693l4 = c15693lM17302k.f48919d; c15693l4 != null; c15693l4 = c15693l4.f48919d) {
                                                int i25 = c15693l4.f48916a & length;
                                                if (i25 != i24) {
                                                    c15693l3 = c15693l4;
                                                    i24 = i25;
                                                }
                                            }
                                            if (i24 == 0) {
                                                c15693l = null;
                                                c15693l2 = c15693l3;
                                            } else {
                                                c15693l = c15693l3;
                                            }
                                            C15693l c15693l5 = c15693lM17302k;
                                            while (c15693l5 != c15693l3) {
                                                int i26 = c15693l5.f48916a;
                                                Object obj = c15693l5.f48917b;
                                                int i27 = i13;
                                                Object obj2 = c15693l5.f48918c;
                                                if ((i26 & length) == 0) {
                                                    c15693l2 = new C15693l(i26, obj, obj2, c15693l2);
                                                } else {
                                                    c15693l = new C15693l(i26, obj, obj2, c15693l);
                                                }
                                                c15693l5 = c15693l5.f48919d;
                                                i13 = i27;
                                                length2 = length2;
                                            }
                                            i13 = i13;
                                            length2 = length2;
                                            m17300h(c15693lArr3, i15, c15693l2);
                                            m17300h(c15693lArr3, i10, c15693l);
                                            m17300h(c15693lArr4, i15, c15688g2);
                                            c15688g = c15688g2;
                                        } else {
                                            i13 = i13;
                                            length2 = length2;
                                            if (c15693lM17302k instanceof C15698q) {
                                                C15698q c15698q3 = (C15698q) c15693lM17302k;
                                                C15699r c15699r2 = null;
                                                C15699r c15699r3 = null;
                                                C15693l c15693l6 = c15698q3.f48935f;
                                                int i28 = 0;
                                                int i29 = 0;
                                                C15699r c15699r4 = null;
                                                while (c15693l6 != null) {
                                                    C15698q c15698q4 = c15698q3;
                                                    int i30 = c15693l6.f48916a;
                                                    C15688g c15688g3 = c15688g2;
                                                    C15699r c15699r5 = new C15699r(i30, c15693l6.f48917b, c15693l6.f48918c, null, null);
                                                    if ((i30 & length) == 0) {
                                                        c15699r5.f48940h = c15699r3;
                                                        if (c15699r3 == null) {
                                                            c15699r = c15699r5;
                                                        } else {
                                                            c15699r3.f48919d = c15699r5;
                                                        }
                                                        i28++;
                                                        c15699r3 = c15699r5;
                                                    } else {
                                                        c15699r5.f48940h = c15699r2;
                                                        if (c15699r2 == null) {
                                                            c15699r4 = c15699r5;
                                                        } else {
                                                            c15699r2.f48919d = c15699r5;
                                                        }
                                                        i29++;
                                                        c15699r2 = c15699r5;
                                                    }
                                                    c15693l6 = c15693l6.f48919d;
                                                    c15698q3 = c15698q4;
                                                    c15688g2 = c15688g3;
                                                }
                                                C15698q c15698q5 = c15698q3;
                                                C15688g c15688g4 = c15688g2;
                                                if (i28 <= 6) {
                                                    c15698q = m17307p(c15699r);
                                                } else {
                                                    c15698q = i29 != 0 ? new C15698q(c15699r) : c15698q5;
                                                }
                                                if (i29 <= 6) {
                                                    c15698q2 = m17307p(c15699r4);
                                                } else {
                                                    c15698q2 = i28 != 0 ? new C15698q(c15699r4) : c15698q5;
                                                }
                                                m17300h(c15693lArr3, i15, c15698q);
                                                m17300h(c15693lArr3, i10, c15698q2);
                                                c15693lArr4 = c15693lArr;
                                                c15688g = c15688g4;
                                                m17300h(c15693lArr4, i15, c15688g);
                                            }
                                        }
                                        zM17297b = true;
                                    } else {
                                        i13 = i13;
                                        length2 = length2;
                                    }
                                    c15688g = c15688g2;
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            concurrentHashMap = this;
                            c9 = 16;
                            z6 = true;
                        }
                    }
                    c15688g = c15688g2;
                }
                c15688g2 = c15688g;
                concurrentHashMap = concurrentHashMap;
                z10 = z6;
                i14 = i20;
                i13 = i13;
                length2 = length2;
                c9 = c9;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    final long m17311j() {
        C15684c[] c15684cArr = this.f48893c;
        long j10 = this.baseCount;
        if (c15684cArr != null) {
            for (C15684c c15684c : c15684cArr) {
                if (c15684c != null) {
                    j10 += c15684c.value;
                }
            }
        }
        return j10;
    }

    /* JADX INFO: renamed from: n */
    private final void m17305n(C15693l[] c15693lArr, int i10) {
        int length = c15693lArr.length;
        if (length < 64) {
            m17306o(length << 1);
            return;
        }
        C15693l c15693lM17302k = m17302k(c15693lArr, i10);
        if (c15693lM17302k == null || c15693lM17302k.f48916a < 0) {
            return;
        }
        synchronized (c15693lM17302k) {
            try {
                if (m17302k(c15693lArr, i10) == c15693lM17302k) {
                    C15699r c15699r = null;
                    C15693l c15693l = c15693lM17302k;
                    C15699r c15699r2 = null;
                    while (c15693l != null) {
                        C15699r c15699r3 = new C15699r(c15693l.f48916a, c15693l.f48917b, c15693l.f48918c, null, null);
                        c15699r3.f48940h = c15699r2;
                        if (c15699r2 == null) {
                            c15699r = c15699r3;
                        } else {
                            c15699r2.f48919d = c15699r3;
                        }
                        c15693l = c15693l.f48919d;
                        c15699r2 = c15699r3;
                    }
                    m17300h(c15693lArr, i10, new C15698q(c15699r));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: p */
    static C15693l m17307p(C15699r c15699r) {
        C15693l c15693l = null;
        C15693l c15693l2 = null;
        for (C15693l c15693l3 = c15699r; c15693l3 != null; c15693l3 = c15693l3.f48919d) {
            C15693l c15693l4 = new C15693l(c15693l3.f48916a, c15693l3.f48917b, c15693l3.f48918c);
            if (c15693l2 == null) {
                c15693l = c15693l4;
            } else {
                c15693l2.f48919d = c15693l4;
            }
            c15693l2 = c15693l4;
        }
        return c15693l;
    }
}
