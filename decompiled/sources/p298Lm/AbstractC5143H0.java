package p298Lm;

import android.gov.nist.javax.sip.parser.TokenNames;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.CloneableClassScope;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaConstructor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaField;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAbi;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaElement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.ClassMapperLite;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedCallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;
import p024Am.C0560a;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p544W9.AbstractC8704r3;
import p544W9.AbstractC8710s3;
import p861l1.xapn.suYVq;

/* JADX INFO: renamed from: Lm.H0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5143H0 {

    /* JADX INFO: renamed from: a */
    public static final ClassId f16781a = ClassId.Companion.topLevel(new FqName("java.lang.Void"));

    /* JADX INFO: renamed from: a */
    public static C5186l m5710a(FunctionDescriptor functionDescriptor) {
        String jvmMethodNameIfSpecial = SpecialBuiltinMembers.getJvmMethodNameIfSpecial(functionDescriptor);
        if (jvmMethodNameIfSpecial == null) {
            if (functionDescriptor instanceof PropertyGetterDescriptor) {
                String strAsString = DescriptorUtilsKt.getPropertyIfAccessor(functionDescriptor).getName().asString();
                AbstractC16544l.m18093f(strAsString, "asString(...)");
                jvmMethodNameIfSpecial = JvmAbi.getterName(strAsString);
            } else if (functionDescriptor instanceof PropertySetterDescriptor) {
                String strAsString2 = DescriptorUtilsKt.getPropertyIfAccessor(functionDescriptor).getName().asString();
                AbstractC16544l.m18093f(strAsString2, "asString(...)");
                jvmMethodNameIfSpecial = JvmAbi.setterName(strAsString2);
            } else {
                jvmMethodNameIfSpecial = functionDescriptor.getName().asString();
                AbstractC16544l.m18093f(jvmMethodNameIfSpecial, "asString(...)");
            }
        }
        return new C5186l(new JvmMemberSignature.Method(jvmMethodNameIfSpecial, MethodSignatureMappingKt.computeJvmDescriptor$default(functionDescriptor, false, false, 1, null)));
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC8704r3 m5712c(FunctionDescriptor possiblySubstitutedFunction) {
        Method member;
        JvmMemberSignature.Method jvmConstructorSignature;
        JvmMemberSignature.Method jvmMethodSignature;
        AbstractC16544l.m18094g(possiblySubstitutedFunction, "possiblySubstitutedFunction");
        FunctionDescriptor original = ((FunctionDescriptor) DescriptorUtils.unwrapFakeOverride(possiblySubstitutedFunction)).getOriginal();
        AbstractC16544l.m18093f(original, "getOriginal(...)");
        if (!(original instanceof DeserializedCallableMemberDescriptor)) {
            if (original instanceof JavaMethodDescriptor) {
                SourceElement source = ((JavaMethodDescriptor) original).getSource();
                JavaSourceElement javaSourceElement = source instanceof JavaSourceElement ? (JavaSourceElement) source : null;
                JavaElement javaElement = javaSourceElement != null ? javaSourceElement.getJavaElement() : null;
                ReflectJavaMethod reflectJavaMethod = javaElement instanceof ReflectJavaMethod ? (ReflectJavaMethod) javaElement : null;
                if (reflectJavaMethod != null && (member = reflectJavaMethod.getMember()) != null) {
                    return new C5182j(member);
                }
                throw new C0560a("Incorrect resolution sequence for Java method " + original);
            }
            if (!(original instanceof JavaClassConstructorDescriptor)) {
                if (DescriptorFactory.isEnumValueOfMethod(original) || DescriptorFactory.isEnumValuesMethod(original) || (AbstractC16544l.m18089b(original.getName(), CloneableClassScope.Companion.getCLONE_NAME()) && original.getValueParameters().isEmpty())) {
                    return m5710a(original);
                }
                throw new C0560a("Unknown origin of " + original + " (" + original.getClass() + ')');
            }
            SourceElement source2 = ((JavaClassConstructorDescriptor) original).getSource();
            JavaSourceElement javaSourceElement2 = source2 instanceof JavaSourceElement ? (JavaSourceElement) source2 : null;
            JavaElement javaElement2 = javaSourceElement2 != null ? javaSourceElement2.getJavaElement() : null;
            if (javaElement2 instanceof ReflectJavaConstructor) {
                return new C5180i(((ReflectJavaConstructor) javaElement2).getMember());
            }
            if (javaElement2 instanceof ReflectJavaClass) {
                ReflectJavaClass reflectJavaClass = (ReflectJavaClass) javaElement2;
                if (reflectJavaClass.isAnnotationType()) {
                    return new C5178h(reflectJavaClass.getElement());
                }
            }
            throw new C0560a("Incorrect resolution sequence for Java constructor " + original + " (" + javaElement2 + ')');
        }
        DeserializedMemberDescriptor deserializedMemberDescriptor = (DeserializedMemberDescriptor) original;
        MessageLite proto = deserializedMemberDescriptor.getProto();
        if ((proto instanceof ProtoBuf.Function) && (jvmMethodSignature = JvmProtoBufUtil.INSTANCE.getJvmMethodSignature((ProtoBuf.Function) proto, deserializedMemberDescriptor.getNameResolver(), deserializedMemberDescriptor.getTypeTable())) != null) {
            return new C5186l(jvmMethodSignature);
        }
        if (!(proto instanceof ProtoBuf.Constructor) || (jvmConstructorSignature = JvmProtoBufUtil.INSTANCE.getJvmConstructorSignature((ProtoBuf.Constructor) proto, deserializedMemberDescriptor.getNameResolver(), deserializedMemberDescriptor.getTypeTable())) == null) {
            return m5710a(original);
        }
        DeclarationDescriptor containingDeclaration = possiblySubstitutedFunction.getContainingDeclaration();
        AbstractC16544l.m18093f(containingDeclaration, "getContainingDeclaration(...)");
        if (InlineClassesUtilsKt.isInlineClass(containingDeclaration)) {
            return new C5186l(jvmConstructorSignature);
        }
        DeclarationDescriptor containingDeclaration2 = possiblySubstitutedFunction.getContainingDeclaration();
        AbstractC16544l.m18093f(containingDeclaration2, "getContainingDeclaration(...)");
        if (!InlineClassesUtilsKt.isMultiFieldValueClass(containingDeclaration2)) {
            return new C5184k(jvmConstructorSignature);
        }
        ConstructorDescriptor constructorDescriptor = (ConstructorDescriptor) possiblySubstitutedFunction;
        if (constructorDescriptor.isPrimary()) {
            if (!AbstractC16544l.m18089b(jvmConstructorSignature.getName(), "constructor-impl") || !AbstractC21329w.m21725l(jvmConstructorSignature.getDesc(), ")V", false)) {
                throw new IllegalArgumentException(("Invalid signature: " + jvmConstructorSignature).toString());
            }
        } else {
            if (!AbstractC16544l.m18089b(jvmConstructorSignature.getName(), "constructor-impl")) {
                throw new IllegalArgumentException(("Invalid signature: " + jvmConstructorSignature).toString());
            }
            ClassDescriptor constructedClass = constructorDescriptor.getConstructedClass();
            AbstractC16544l.m18093f(constructedClass, "getConstructedClass(...)");
            ClassId classId = DescriptorUtilsKt.getClassId(constructedClass);
            AbstractC16544l.m18091d(classId);
            String strMapClass = ClassMapperLite.mapClass(classId.asString());
            if (AbstractC21329w.m21725l(jvmConstructorSignature.getDesc(), ")V", false)) {
                jvmConstructorSignature = JvmMemberSignature.Method.copy$default(jvmConstructorSignature, null, AbstractC21322p.m21690X(jvmConstructorSignature.getDesc(), TokenNames.f32021V) + strMapClass, 1, null);
            } else if (!AbstractC21329w.m21725l(jvmConstructorSignature.getDesc(), strMapClass, false)) {
                throw new IllegalArgumentException(("Invalid signature: " + jvmConstructorSignature).toString());
            }
        }
        return new C5186l(jvmConstructorSignature);
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC8710s3 m5711b(PropertyDescriptor possiblyOverriddenProperty) {
        AbstractC16544l.m18094g(possiblyOverriddenProperty, "possiblyOverriddenProperty");
        PropertyDescriptor original = ((PropertyDescriptor) DescriptorUtils.unwrapFakeOverride(possiblyOverriddenProperty)).getOriginal();
        AbstractC16544l.m18093f(original, "getOriginal(...)");
        if (original instanceof DeserializedPropertyDescriptor) {
            DeserializedPropertyDescriptor deserializedPropertyDescriptor = (DeserializedPropertyDescriptor) original;
            ProtoBuf.Property proto = deserializedPropertyDescriptor.getProto();
            GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, JvmProtoBuf.JvmPropertySignature> propertySignature = JvmProtoBuf.propertySignature;
            AbstractC16544l.m18093f(propertySignature, "propertySignature");
            JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) ProtoBufUtilKt.getExtensionOrNull(proto, propertySignature);
            if (jvmPropertySignature != null) {
                return new C5192o(original, proto, jvmPropertySignature, deserializedPropertyDescriptor.getNameResolver(), deserializedPropertyDescriptor.getTypeTable());
            }
        } else if (original instanceof JavaPropertyDescriptor) {
            JavaPropertyDescriptor javaPropertyDescriptor = (JavaPropertyDescriptor) original;
            SourceElement source = javaPropertyDescriptor.getSource();
            JavaSourceElement javaSourceElement = source instanceof JavaSourceElement ? (JavaSourceElement) source : null;
            JavaElement javaElement = javaSourceElement != null ? javaSourceElement.getJavaElement() : null;
            if (javaElement instanceof ReflectJavaField) {
                return new C5188m(((ReflectJavaField) javaElement).getMember());
            }
            if (!(javaElement instanceof ReflectJavaMethod)) {
                throw new C0560a(suYVq.cnWCFG + original + " (source = " + javaElement + ')');
            }
            Method member = ((ReflectJavaMethod) javaElement).getMember();
            PropertySetterDescriptor setter = javaPropertyDescriptor.getSetter();
            SourceElement source2 = setter != null ? setter.getSource() : null;
            JavaSourceElement javaSourceElement2 = source2 instanceof JavaSourceElement ? (JavaSourceElement) source2 : null;
            JavaElement javaElement2 = javaSourceElement2 != null ? javaSourceElement2.getJavaElement() : null;
            ReflectJavaMethod reflectJavaMethod = javaElement2 instanceof ReflectJavaMethod ? (ReflectJavaMethod) javaElement2 : null;
            return new C5190n(member, reflectJavaMethod != null ? reflectJavaMethod.getMember() : null);
        }
        PropertyGetterDescriptor getter = original.getGetter();
        AbstractC16544l.m18091d(getter);
        C5186l c5186lM5710a = m5710a(getter);
        PropertySetterDescriptor setter2 = original.getSetter();
        return new C5194p(c5186lM5710a, setter2 != null ? m5710a(setter2) : null);
    }
}
