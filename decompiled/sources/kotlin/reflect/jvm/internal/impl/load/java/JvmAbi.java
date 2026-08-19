package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;
import p1113xn.AbstractC21329w;

/* JADX INFO: loaded from: classes2.dex */
public final class JvmAbi {
    public static final JvmAbi INSTANCE = new JvmAbi();
    public static final ClassId JVM_FIELD_ANNOTATION_CLASS_ID;
    public static final FqName JVM_FIELD_ANNOTATION_FQ_NAME;

    /* JADX INFO: renamed from: a */
    public static final ClassId f51757a;

    static {
        FqName fqName = new FqName("kotlin.jvm.JvmField");
        JVM_FIELD_ANNOTATION_FQ_NAME = fqName;
        ClassId.Companion companion = ClassId.Companion;
        JVM_FIELD_ANNOTATION_CLASS_ID = companion.topLevel(fqName);
        companion.topLevel(new FqName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        f51757a = ClassId.Companion.fromString$default(companion, "kotlin/jvm/internal/RepeatableContainer", false, 2, null);
    }

    public static final String getterName(String propertyName) {
        AbstractC16544l.m18094g(propertyName, "propertyName");
        if (startsWithIsPrefix(propertyName)) {
            return propertyName;
        }
        return "get" + CapitalizeDecapitalizeKt.capitalizeAsciiOnly(propertyName);
    }

    public static final boolean isGetterName(String name) {
        AbstractC16544l.m18094g(name, "name");
        return AbstractC21329w.m21734u(name, "get", false) || AbstractC21329w.m21734u(name, "is", false);
    }

    public static final boolean isSetterName(String name) {
        AbstractC16544l.m18094g(name, "name");
        return AbstractC21329w.m21734u(name, "set", false);
    }

    public static final String setterName(String propertyName) {
        String strCapitalizeAsciiOnly;
        AbstractC16544l.m18094g(propertyName, "propertyName");
        StringBuilder sb2 = new StringBuilder("set");
        if (startsWithIsPrefix(propertyName)) {
            strCapitalizeAsciiOnly = propertyName.substring(2);
            AbstractC16544l.m18093f(strCapitalizeAsciiOnly, "substring(...)");
        } else {
            strCapitalizeAsciiOnly = CapitalizeDecapitalizeKt.capitalizeAsciiOnly(propertyName);
        }
        sb2.append(strCapitalizeAsciiOnly);
        return sb2.toString();
    }

    public static final boolean startsWithIsPrefix(String name) {
        AbstractC16544l.m18094g(name, "name");
        if (!AbstractC21329w.m21734u(name, "is", false) || name.length() == 2) {
            return false;
        }
        char cCharAt = name.charAt(2);
        return AbstractC16544l.m18096i(97, cCharAt) > 0 || AbstractC16544l.m18096i(cCharAt, 122) > 0;
    }

    public final ClassId getREPEATABLE_ANNOTATION_CONTAINER_META_ANNOTATION() {
        return f51757a;
    }
}
