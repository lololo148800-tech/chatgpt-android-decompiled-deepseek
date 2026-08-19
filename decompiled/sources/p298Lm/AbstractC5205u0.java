package p298Lm;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import p024Am.C0560a;
import p025An.C0644w;
import p323Mm.AbstractC5517x;
import p323Mm.C5491B;
import p323Mm.C5503j;
import p323Mm.C5504k;
import p323Mm.C5505l;
import p323Mm.C5507n;
import p323Mm.C5508o;
import p323Mm.C5509p;
import p323Mm.C5511r;
import p323Mm.C5512s;
import p323Mm.C5513t;
import p323Mm.C5515v;
import p323Mm.C5518y;
import p323Mm.C5519z;
import p323Mm.InterfaceC5500g;
import p544W9.AbstractC8513L3;
import p544W9.AbstractC8710s3;
import p571X9.AbstractC9393x3;

/* JADX INFO: renamed from: Lm.u0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5205u0 {
    /* JADX WARN: Code duplicated, block: B:12:0x0037  */
    /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Object, mm.i] */
    /* JADX INFO: renamed from: a */
    public static final InterfaceC5500g m5758a(AbstractC5193o0 abstractC5193o0, boolean z6) {
        C5186l c5186l;
        Method method;
        InterfaceC5500g c5511r;
        JvmProtoBuf.JvmMethodSignature setter;
        InterfaceC5500g c5513t;
        if (AbstractC5148K.f16787Y.m21664d(abstractC5193o0.mo5743r().f16912u0)) {
            return C5491B.f17924a;
        }
        ClassId classId = AbstractC5143H0.f16781a;
        AbstractC8710s3 abstractC8710s3M5711b = AbstractC5143H0.m5711b(abstractC5193o0.mo5743r().mo5738m());
        if (abstractC8710s3M5711b instanceof C5192o) {
            C5192o c5192o = (C5192o) abstractC8710s3M5711b;
            JvmProtoBuf.JvmPropertySignature jvmPropertySignature = c5192o.f16881c;
            Method methodM5730i = null;
            if (z6) {
                if (jvmPropertySignature.hasGetter()) {
                    setter = jvmPropertySignature.getGetter();
                } else {
                    setter = null;
                }
            } else if (jvmPropertySignature.hasSetter()) {
                setter = jvmPropertySignature.getSetter();
            } else {
                setter = null;
            }
            if (setter != null) {
                AbstractC5148K abstractC5148K = abstractC5193o0.mo5743r().f16910s0;
                int name = setter.getName();
                NameResolver nameResolver = c5192o.f16882d;
                methodM5730i = abstractC5148K.m5730i(nameResolver.getString(name), nameResolver.getString(setter.getDesc()));
            }
            if (methodM5730i != null) {
                if (!Modifier.isStatic(methodM5730i.getModifiers())) {
                    c5513t = abstractC5193o0.mo5739p() ? new C5511r(methodM5730i, m5761d(abstractC5193o0)) : new C5515v(0, methodM5730i);
                } else if (abstractC5193o0.mo5743r().mo5738m().getAnnotations().hasAnnotation(AbstractC5147J0.f16786a)) {
                    c5513t = abstractC5193o0.mo5739p() ? new C5512s(methodM5730i) : new C5515v(1, methodM5730i);
                } else {
                    c5513t = abstractC5193o0.mo5739p() ? new C5513t(methodM5730i, false, m5761d(abstractC5193o0)) : new C5515v(2, methodM5730i);
                }
                c5511r = c5513t;
            } else if (InlineClassesUtilsKt.isUnderlyingPropertyOfInlineClass(abstractC5193o0.mo5743r().mo5738m()) && AbstractC16544l.m18089b(abstractC5193o0.mo5743r().mo5738m().getVisibility(), DescriptorVisibilities.INTERNAL)) {
                Class clsM9180h = AbstractC8513L3.m9180h(abstractC5193o0.mo5743r().mo5738m().getContainingDeclaration());
                if (clsM9180h == null) {
                    throw new C0560a("Underlying property of inline class " + abstractC5193o0.mo5743r() + " should have a field");
                }
                Method methodM9177e = AbstractC8513L3.m9177e(clsM9180h, abstractC5193o0.mo5743r().mo5738m());
                c5511r = abstractC5193o0.mo5739p() ? new C5518y(methodM9177e, m5761d(abstractC5193o0)) : new C5519z(methodM9177e, AbstractC9393x3.m9974d(methodM9177e.getDeclaringClass()));
            } else {
                Field field = (Field) abstractC5193o0.mo5743r().f16914w0.getValue();
                if (field == null) {
                    throw new C0560a("No accessors or field is found for property " + abstractC5193o0.mo5743r());
                }
                c5511r = m5759b(abstractC5193o0, z6, field);
            }
        } else if (abstractC8710s3M5711b instanceof C5188m) {
            c5511r = m5759b(abstractC5193o0, z6, ((C5188m) abstractC8710s3M5711b).f16873a);
        } else {
            if (!(abstractC8710s3M5711b instanceof C5190n)) {
                if (!(abstractC8710s3M5711b instanceof C5194p)) {
                    throw new C0644w();
                }
                if (z6) {
                    c5186l = ((C5194p) abstractC8710s3M5711b).f16885a;
                } else {
                    c5186l = ((C5194p) abstractC8710s3M5711b).f16886b;
                    if (c5186l == null) {
                        throw new C0560a("No setter found for property " + abstractC5193o0.mo5743r());
                    }
                }
                AbstractC5148K abstractC5148K2 = abstractC5193o0.mo5743r().f16910s0;
                JvmMemberSignature.Method method2 = c5186l.f16870a;
                Method methodM5730i2 = abstractC5148K2.m5730i(method2.getName(), method2.getDesc());
                if (methodM5730i2 != null) {
                    Modifier.isStatic(methodM5730i2.getModifiers());
                    return abstractC5193o0.mo5739p() ? new C5511r(methodM5730i2, m5761d(abstractC5193o0)) : new C5515v(0, methodM5730i2);
                }
                throw new C0560a("No accessor found for property " + abstractC5193o0.mo5743r());
            }
            if (z6) {
                method = ((C5190n) abstractC8710s3M5711b).f16875a;
            } else {
                C5190n c5190n = (C5190n) abstractC8710s3M5711b;
                method = c5190n.f16876b;
                if (method == null) {
                    throw new C0560a("No source found for setter of Java method property: " + c5190n.f16875a);
                }
            }
            c5511r = abstractC5193o0.mo5739p() ? new C5511r(method, m5761d(abstractC5193o0)) : new C5515v(0, method);
        }
        return AbstractC8513L3.m9175c(c5511r, abstractC5193o0.mo5752q(), false);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003a  */
    /* JADX WARN: Code duplicated, block: B:26:0x0086  */
    /* JADX WARN: Code duplicated, block: B:28:0x009b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:33:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d5  */
    /* JADX INFO: renamed from: b */
    public static final AbstractC5517x m5759b(AbstractC5193o0 abstractC5193o0, boolean z6, Field field) {
        AbstractC5517x c5505l;
        PropertyDescriptor propertyDescriptorMo5738m = abstractC5193o0.mo5743r().mo5738m();
        DeclarationDescriptor containingDeclaration = propertyDescriptorMo5738m.getContainingDeclaration();
        AbstractC16544l.m18093f(containingDeclaration, "getContainingDeclaration(...)");
        if (DescriptorUtils.isCompanionObject(containingDeclaration)) {
            DeclarationDescriptor containingDeclaration2 = containingDeclaration.getContainingDeclaration();
            if ((DescriptorUtils.isInterface(containingDeclaration2) || DescriptorUtils.isAnnotationClass(containingDeclaration2)) && (!(propertyDescriptorMo5738m instanceof DeserializedPropertyDescriptor) || !JvmProtoBufUtil.isMovedFromInterfaceCompanion(((DeserializedPropertyDescriptor) propertyDescriptorMo5738m).getProto()))) {
                if (Modifier.isStatic(field.getModifiers())) {
                    if (abstractC5193o0.mo5743r().mo5738m().getAnnotations().hasAnnotation(AbstractC5147J0.f16786a)) {
                        if (z6) {
                        }
                    }
                    if (z6) {
                        if (abstractC5193o0.mo5739p()) {
                        }
                    }
                    if (abstractC5193o0.mo5739p()) {
                        c5505l = new C5504k(field, false);
                    } else {
                        c5505l = new C5505l(field, true, 1);
                    }
                    return c5505l;
                }
            }
        } else if (Modifier.isStatic(field.getModifiers())) {
            if (abstractC5193o0.mo5743r().mo5738m().getAnnotations().hasAnnotation(AbstractC5147J0.f16786a)) {
                return z6 ? new C5505l(field, false, 2) : new C5509p(field, m5760c(abstractC5193o0), false, 2);
            }
            if (z6) {
                return abstractC5193o0.mo5739p() ? new C5508o(field, m5760c(abstractC5193o0), false) : new C5509p(field, m5760c(abstractC5193o0), true, 1);
            }
            if (abstractC5193o0.mo5739p()) {
                c5505l = new C5504k(field, false);
            } else {
                c5505l = new C5505l(field, true, 1);
            }
            return c5505l;
        }
        if (z6) {
            if (abstractC5193o0.mo5739p()) {
                return new C5503j(field, m5761d(abstractC5193o0));
            }
            AbstractC16544l.m18094g(field, "field");
            return new C5505l(field, true, 0);
        }
        if (abstractC5193o0.mo5739p()) {
            return new C5507n(field, m5760c(abstractC5193o0), m5761d(abstractC5193o0));
        }
        boolean zM5760c = m5760c(abstractC5193o0);
        AbstractC16544l.m18094g(field, "field");
        return new C5509p(field, zM5760c, true, 0);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m5760c(AbstractC5193o0 abstractC5193o0) {
        return !TypeUtils.isNullableType(abstractC5193o0.mo5743r().mo5738m().getType());
    }

    /* JADX INFO: renamed from: d */
    public static final Object m5761d(AbstractC5193o0 abstractC5193o0) {
        AbstractC16544l.m18094g(abstractC5193o0, "<this>");
        AbstractC5203t0 abstractC5203t0Mo5743r = abstractC5193o0.mo5743r();
        return AbstractC8513L3.m9174b(abstractC5203t0Mo5743r.f16913v0, abstractC5203t0Mo5743r.mo5738m());
    }
}
