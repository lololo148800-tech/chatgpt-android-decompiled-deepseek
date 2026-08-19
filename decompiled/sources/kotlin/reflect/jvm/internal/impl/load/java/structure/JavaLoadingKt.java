package kotlin.reflect.jvm.internal.impl.load.java.structure;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import p909nm.AbstractC17680n;

/* JADX INFO: loaded from: classes2.dex */
public final class JavaLoadingKt {
    /* JADX WARN: Code duplicated, block: B:37:0x0088  */
    public static final boolean isObjectMethodInInterface(JavaMember javaMember) {
        boolean zIsEmpty;
        FqName fqName;
        AbstractC16544l.m18094g(javaMember, "<this>");
        if (!javaMember.getContainingClass().isInterface() || !(javaMember instanceof JavaMethod)) {
            return false;
        }
        JavaMethod javaMethod = (JavaMethod) javaMember;
        String strAsString = javaMethod.getName().asString();
        int iHashCode = strAsString.hashCode();
        if (iHashCode != -1776922004) {
            if (iHashCode != -1295482945) {
                if (iHashCode == 147696667 && strAsString.equals("hashCode")) {
                    zIsEmpty = javaMethod.getValueParameters().isEmpty();
                }
            } else if (strAsString.equals("equals")) {
                JavaValueParameter javaValueParameter = (JavaValueParameter) AbstractC17680n.m19367q0(javaMethod.getValueParameters());
                JavaType type = javaValueParameter != null ? javaValueParameter.getType() : null;
                JavaClassifierType javaClassifierType = type instanceof JavaClassifierType ? (JavaClassifierType) type : null;
                if (javaClassifierType != null) {
                    JavaClassifier classifier = javaClassifierType.getClassifier();
                    if ((classifier instanceof JavaClass) && (fqName = ((JavaClass) classifier).getFqName()) != null && AbstractC16544l.m18089b(fqName.asString(), "java.lang.Object")) {
                        zIsEmpty = true;
                    }
                }
            }
            zIsEmpty = false;
        } else if (strAsString.equals("toString")) {
            zIsEmpty = javaMethod.getValueParameters().isEmpty();
        } else {
            zIsEmpty = false;
        }
        return zIsEmpty;
    }
}
