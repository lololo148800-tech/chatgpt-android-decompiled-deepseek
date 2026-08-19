package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p077Cn.C1756x;
import p571X9.AbstractC9393x3;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17680n;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes2.dex */
public final class ConstantValueFactory {
    public static final ConstantValueFactory INSTANCE = new ConstantValueFactory();

    public static /* synthetic */ ConstantValue createConstantValue$default(ConstantValueFactory constantValueFactory, Object obj, ModuleDescriptor moduleDescriptor, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            moduleDescriptor = null;
        }
        return constantValueFactory.createConstantValue(obj, moduleDescriptor);
    }

    /* JADX INFO: renamed from: a */
    public final ArrayValue m18359a(List list, ModuleDescriptor moduleDescriptor, PrimitiveType primitiveType) {
        List listM19322C0 = AbstractC17680n.m19322C0(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = listM19322C0.iterator();
        while (it.hasNext()) {
            ConstantValue constantValueCreateConstantValue$default = createConstantValue$default(this, it.next(), null, 2, null);
            if (constantValueCreateConstantValue$default != null) {
                arrayList.add(constantValueCreateConstantValue$default);
            }
        }
        if (moduleDescriptor == null) {
            return new ArrayValue(arrayList, new C1756x(primitiveType, 21));
        }
        SimpleType primitiveArrayKotlinType = moduleDescriptor.getBuiltIns().getPrimitiveArrayKotlinType(primitiveType);
        AbstractC16544l.m18093f(primitiveArrayKotlinType, "getPrimitiveArrayKotlinType(...)");
        return new TypedArrayValue(arrayList, primitiveArrayKotlinType);
    }

    public final ArrayValue createArrayValue(List<? extends ConstantValue<?>> value, KotlinType type) {
        AbstractC16544l.m18094g(value, "value");
        AbstractC16544l.m18094g(type, "type");
        return new TypedArrayValue(value, type);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [nm.w] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory] */
    public final ConstantValue<?> createConstantValue(Object obj, ModuleDescriptor moduleDescriptor) {
        ?? M19292O;
        if (obj instanceof Byte) {
            return new ByteValue(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new ShortValue(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new IntValue(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new LongValue(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new CharValue(((Character) obj).charValue());
        }
        if (obj instanceof Float) {
            return new FloatValue(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new DoubleValue(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new BooleanValue(((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return new StringValue((String) obj);
        }
        boolean z6 = obj instanceof byte[];
        ?? M9974d = C17689w.f56480Y;
        int i10 = 0;
        if (z6) {
            byte[] bArr = (byte[]) obj;
            AbstractC16544l.m18094g(bArr, "<this>");
            int length = bArr.length;
            if (length != 0) {
                if (length != 1) {
                    M9974d = new ArrayList(bArr.length);
                    int length2 = bArr.length;
                    while (i10 < length2) {
                        M9974d.add(Byte.valueOf(bArr[i10]));
                        i10++;
                    }
                } else {
                    M9974d = AbstractC9393x3.m9974d(Byte.valueOf(bArr[0]));
                }
            }
            return m18359a(M9974d, moduleDescriptor, PrimitiveType.BYTE);
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            AbstractC16544l.m18094g(sArr, "<this>");
            int length3 = sArr.length;
            if (length3 != 0) {
                if (length3 != 1) {
                    M9974d = new ArrayList(sArr.length);
                    int length4 = sArr.length;
                    while (i10 < length4) {
                        M9974d.add(Short.valueOf(sArr[i10]));
                        i10++;
                    }
                } else {
                    M9974d = AbstractC9393x3.m9974d(Short.valueOf(sArr[0]));
                }
            }
            return m18359a(M9974d, moduleDescriptor, PrimitiveType.SHORT);
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            AbstractC16544l.m18094g(iArr, "<this>");
            int length5 = iArr.length;
            if (length5 != 0) {
                M19292O = length5 != 1 ? AbstractC17678l.m19292O(iArr) : AbstractC9393x3.m9974d(Integer.valueOf(iArr[0]));
            }
            M19292O = M9974d;
            return m18359a(M19292O, moduleDescriptor, PrimitiveType.INT);
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            AbstractC16544l.m18094g(jArr, "<this>");
            int length6 = jArr.length;
            if (length6 != 0) {
                if (length6 != 1) {
                    M9974d = new ArrayList(jArr.length);
                    int length7 = jArr.length;
                    while (i10 < length7) {
                        M9974d.add(Long.valueOf(jArr[i10]));
                        i10++;
                    }
                } else {
                    M9974d = AbstractC9393x3.m9974d(Long.valueOf(jArr[0]));
                }
            }
            return m18359a(M9974d, moduleDescriptor, PrimitiveType.LONG);
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            AbstractC16544l.m18094g(cArr, "<this>");
            int length8 = cArr.length;
            if (length8 != 0) {
                if (length8 != 1) {
                    M9974d = new ArrayList(cArr.length);
                    int length9 = cArr.length;
                    while (i10 < length9) {
                        M9974d.add(Character.valueOf(cArr[i10]));
                        i10++;
                    }
                } else {
                    M9974d = AbstractC9393x3.m9974d(Character.valueOf(cArr[0]));
                }
            }
            return m18359a(M9974d, moduleDescriptor, PrimitiveType.CHAR);
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            AbstractC16544l.m18094g(fArr, "<this>");
            int length10 = fArr.length;
            if (length10 != 0) {
                if (length10 != 1) {
                    M9974d = new ArrayList(fArr.length);
                    int length11 = fArr.length;
                    while (i10 < length11) {
                        M9974d.add(Float.valueOf(fArr[i10]));
                        i10++;
                    }
                } else {
                    M9974d = AbstractC9393x3.m9974d(Float.valueOf(fArr[0]));
                }
            }
            return m18359a(M9974d, moduleDescriptor, PrimitiveType.FLOAT);
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            AbstractC16544l.m18094g(dArr, "<this>");
            int length12 = dArr.length;
            if (length12 != 0) {
                if (length12 != 1) {
                    M9974d = new ArrayList(dArr.length);
                    int length13 = dArr.length;
                    while (i10 < length13) {
                        M9974d.add(Double.valueOf(dArr[i10]));
                        i10++;
                    }
                } else {
                    M9974d = AbstractC9393x3.m9974d(Double.valueOf(dArr[0]));
                }
            }
            return m18359a(M9974d, moduleDescriptor, PrimitiveType.DOUBLE);
        }
        if (!(obj instanceof boolean[])) {
            if (obj == null) {
                return new NullValue();
            }
            return null;
        }
        boolean[] zArr = (boolean[]) obj;
        AbstractC16544l.m18094g(zArr, "<this>");
        int length14 = zArr.length;
        if (length14 != 0) {
            if (length14 != 1) {
                M9974d = new ArrayList(zArr.length);
                int length15 = zArr.length;
                while (i10 < length15) {
                    M9974d.add(Boolean.valueOf(zArr[i10]));
                    i10++;
                }
            } else {
                M9974d = AbstractC9393x3.m9974d(Boolean.valueOf(zArr[0]));
            }
        }
        return m18359a(M9974d, moduleDescriptor, PrimitiveType.BOOLEAN);
    }
}
