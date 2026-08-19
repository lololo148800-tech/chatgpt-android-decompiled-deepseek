package kotlin.reflect.jvm.internal.impl.load.kotlin;

import android.gov.nist.javax.sip.parser.TokenNames;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import p025An.C0644w;
import p1113xn.AbstractC21322p;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C16572a implements JvmTypeFactory {

    /* JADX INFO: renamed from: a */
    public static final C16572a f52089a = new C16572a();

    /* JADX INFO: renamed from: a */
    public static JvmType m18246a(String representation) {
        JvmPrimitiveType jvmPrimitiveType;
        AbstractC16544l.m18094g(representation, "representation");
        char cCharAt = representation.charAt(0);
        JvmPrimitiveType[] jvmPrimitiveTypeArrValues = JvmPrimitiveType.values();
        int length = jvmPrimitiveTypeArrValues.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                jvmPrimitiveType = null;
                break;
            }
            jvmPrimitiveType = jvmPrimitiveTypeArrValues[i10];
            if (jvmPrimitiveType.getDesc().charAt(0) == cCharAt) {
                break;
            }
            i10++;
        }
        if (jvmPrimitiveType != null) {
            return new JvmType.Primitive(jvmPrimitiveType);
        }
        if (cCharAt == 'V') {
            return new JvmType.Primitive(null);
        }
        if (cCharAt == '[') {
            String strSubstring = representation.substring(1);
            AbstractC16544l.m18093f(strSubstring, "substring(...)");
            return new JvmType.Array(m18246a(strSubstring));
        }
        if (cCharAt == 'L') {
            AbstractC21322p.m21671E(representation, ';');
        }
        String strSubstring2 = representation.substring(1, representation.length() - 1);
        AbstractC16544l.m18093f(strSubstring2, "substring(...)");
        return new JvmType.Object(strSubstring2);
    }

    /* JADX INFO: renamed from: b */
    public static String m18247b(JvmType type) {
        String desc;
        AbstractC16544l.m18094g(type, "type");
        if (type instanceof JvmType.Array) {
            return "[" + m18247b(((JvmType.Array) type).getElementType());
        }
        if (type instanceof JvmType.Primitive) {
            JvmPrimitiveType jvmPrimitiveType = ((JvmType.Primitive) type).getJvmPrimitiveType();
            return (jvmPrimitiveType == null || (desc = jvmPrimitiveType.getDesc()) == null) ? TokenNames.f32021V : desc;
        }
        if (!(type instanceof JvmType.Object)) {
            throw new C0644w();
        }
        return TokenNames.f32014L + ((JvmType.Object) type).getInternalName() + ';';
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory
    public final Object boxType(Object obj) {
        JvmType possiblyPrimitiveType = (JvmType) obj;
        AbstractC16544l.m18094g(possiblyPrimitiveType, "possiblyPrimitiveType");
        if (!(possiblyPrimitiveType instanceof JvmType.Primitive)) {
            return possiblyPrimitiveType;
        }
        JvmType.Primitive primitive = (JvmType.Primitive) possiblyPrimitiveType;
        if (primitive.getJvmPrimitiveType() == null) {
            return possiblyPrimitiveType;
        }
        String internalName = JvmClassName.byFqNameWithoutInnerClasses(primitive.getJvmPrimitiveType().getWrapperFqName()).getInternalName();
        AbstractC16544l.m18093f(internalName, "getInternalName(...)");
        return new JvmType.Object(internalName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory
    public final /* bridge */ /* synthetic */ Object createFromString(String str) {
        return m18246a(str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory
    public final Object createObjectType(String internalName) {
        AbstractC16544l.m18094g(internalName, "internalName");
        return new JvmType.Object(internalName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory
    public final Object createPrimitiveType(PrimitiveType primitiveType) {
        AbstractC16544l.m18094g(primitiveType, "primitiveType");
        switch (JvmTypeFactoryImpl$WhenMappings.$EnumSwitchMapping$0[primitiveType.ordinal()]) {
            case 1:
                return JvmType.Companion.getBOOLEAN$descriptors_jvm();
            case 2:
                return JvmType.Companion.getCHAR$descriptors_jvm();
            case 3:
                return JvmType.Companion.getBYTE$descriptors_jvm();
            case 4:
                return JvmType.Companion.getSHORT$descriptors_jvm();
            case 5:
                return JvmType.Companion.getINT$descriptors_jvm();
            case 6:
                return JvmType.Companion.getFLOAT$descriptors_jvm();
            case 7:
                return JvmType.Companion.getLONG$descriptors_jvm();
            case 8:
                return JvmType.Companion.getDOUBLE$descriptors_jvm();
            default:
                throw new C0644w();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory
    public final Object getJavaLangClassType() {
        return new JvmType.Object("java/lang/Class");
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory
    public final /* bridge */ /* synthetic */ String toString(Object obj) {
        return m18247b((JvmType) obj);
    }
}
