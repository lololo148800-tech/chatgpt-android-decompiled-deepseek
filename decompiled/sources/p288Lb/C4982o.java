package p288Lb;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import p214Ib.C3677t;
import p335Nb.AbstractC5704c;
import p379Pb.C6381b;
import p544W9.AbstractC8633f4;

/* JADX INFO: renamed from: Lb.o */
/* JADX INFO: loaded from: classes.dex */
public final class C4982o extends AbstractC4980m {

    /* JADX INFO: renamed from: e */
    public static final HashMap f16240e;

    /* JADX INFO: renamed from: b */
    public final Constructor f16241b;

    /* JADX INFO: renamed from: c */
    public final Object[] f16242c;

    /* JADX INFO: renamed from: d */
    public final HashMap f16243d;

    static {
        HashMap map = new HashMap();
        map.put(Byte.TYPE, (byte) 0);
        map.put(Short.TYPE, (short) 0);
        map.put(Integer.TYPE, 0);
        map.put(Long.TYPE, 0L);
        map.put(Float.TYPE, Float.valueOf(0.0f));
        map.put(Double.TYPE, Double.valueOf(0.0d));
        map.put(Character.TYPE, (char) 0);
        map.put(Boolean.TYPE, Boolean.FALSE);
        f16240e = map;
    }

    public C4982o(Class cls, LinkedHashMap linkedHashMap) {
        super(linkedHashMap);
        this.f16243d = new HashMap();
        AbstractC8633f4 abstractC8633f4 = AbstractC5704c.f18489a;
        Constructor constructorMo6144c = abstractC8633f4.mo6144c(cls);
        this.f16241b = constructorMo6144c;
        AbstractC5704c.m6151e(constructorMo6144c);
        String[] strArrMo6145d = abstractC8633f4.mo6145d(cls);
        for (int i10 = 0; i10 < strArrMo6145d.length; i10++) {
            this.f16243d.put(strArrMo6145d[i10], Integer.valueOf(i10));
        }
        Class<?>[] parameterTypes = this.f16241b.getParameterTypes();
        this.f16242c = new Object[parameterTypes.length];
        for (int i11 = 0; i11 < parameterTypes.length; i11++) {
            this.f16242c[i11] = f16240e.get(parameterTypes[i11]);
        }
    }

    @Override // p288Lb.AbstractC4980m
    /* JADX INFO: renamed from: c */
    public final Object mo5637c() {
        return (Object[]) this.f16242c.clone();
    }

    @Override // p288Lb.AbstractC4980m
    /* JADX INFO: renamed from: d */
    public final Object mo5638d(Object obj) {
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.f16241b;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e10) {
            AbstractC8633f4 abstractC8633f4 = AbstractC5704c.f18489a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e10);
        } catch (IllegalArgumentException e11) {
            e = e11;
            throw new RuntimeException("Failed to invoke constructor '" + AbstractC5704c.m6148b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InstantiationException e12) {
            e = e12;
            throw new RuntimeException("Failed to invoke constructor '" + AbstractC5704c.m6148b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InvocationTargetException e13) {
            throw new RuntimeException("Failed to invoke constructor '" + AbstractC5704c.m6148b(constructor) + "' with args " + Arrays.toString(objArr), e13.getCause());
        }
    }

    @Override // p288Lb.AbstractC4980m
    /* JADX INFO: renamed from: e */
    public final void mo5639e(Object obj, C6381b c6381b, C4979l c4979l) {
        Object[] objArr = (Object[]) obj;
        HashMap map = this.f16243d;
        String str = c4979l.f16227c;
        Integer num = (Integer) map.get(str);
        if (num == null) {
            throw new IllegalStateException("Could not find the index in the constructor '" + AbstractC5704c.m6148b(this.f16241b) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
        int iIntValue = num.intValue();
        Object objMo4358a = c4979l.f16233i.mo4358a(c6381b);
        if (objMo4358a != null || !c4979l.f16236l) {
            objArr[iIntValue] = objMo4358a;
        } else {
            StringBuilder sbM11058p = AbstractC10763a.m11058p("null is not allowed as value for record component '", str, "' of primitive type; at path ");
            sbM11058p.append(c6381b.mo5620T());
            throw new C3677t(sbM11058p.toString());
        }
    }
}
