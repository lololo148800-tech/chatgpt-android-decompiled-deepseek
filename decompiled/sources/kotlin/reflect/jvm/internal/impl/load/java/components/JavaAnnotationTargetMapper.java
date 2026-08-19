package kotlin.reflect.jvm.internal.impl.load.java.components;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import mm.C17309l;
import p534Vm.C8401b;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17682p;
import p909nm.AbstractC17686t;
import p909nm.C17691y;

/* JADX INFO: loaded from: classes2.dex */
public final class JavaAnnotationTargetMapper {
    public static final JavaAnnotationTargetMapper INSTANCE = new JavaAnnotationTargetMapper();

    /* JADX INFO: renamed from: a */
    public static final Object f51810a = AbstractC17659D.m19244f(new C17309l("PACKAGE", EnumSet.noneOf(KotlinTarget.class)), new C17309l(CredentialProviderBaseController.TYPE_TAG, EnumSet.of(KotlinTarget.CLASS, KotlinTarget.FILE)), new C17309l("ANNOTATION_TYPE", EnumSet.of(KotlinTarget.ANNOTATION_CLASS)), new C17309l("TYPE_PARAMETER", EnumSet.of(KotlinTarget.TYPE_PARAMETER)), new C17309l("FIELD", EnumSet.of(KotlinTarget.FIELD)), new C17309l("LOCAL_VARIABLE", EnumSet.of(KotlinTarget.LOCAL_VARIABLE)), new C17309l("PARAMETER", EnumSet.of(KotlinTarget.VALUE_PARAMETER)), new C17309l("CONSTRUCTOR", EnumSet.of(KotlinTarget.CONSTRUCTOR)), new C17309l("METHOD", EnumSet.of(KotlinTarget.FUNCTION, KotlinTarget.PROPERTY_GETTER, KotlinTarget.PROPERTY_SETTER)), new C17309l("TYPE_USE", EnumSet.of(KotlinTarget.TYPE)));

    /* JADX INFO: renamed from: b */
    public static final Object f51811b = AbstractC17659D.m19244f(new C17309l("RUNTIME", KotlinRetention.RUNTIME), new C17309l("CLASS", KotlinRetention.BINARY), new C17309l("SOURCE", KotlinRetention.SOURCE));

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final ConstantValue<?> mapJavaRetentionArgument$descriptors_jvm(JavaAnnotationArgument javaAnnotationArgument) {
        JavaEnumValueAnnotationArgument javaEnumValueAnnotationArgument = javaAnnotationArgument instanceof JavaEnumValueAnnotationArgument ? (JavaEnumValueAnnotationArgument) javaAnnotationArgument : null;
        if (javaEnumValueAnnotationArgument == null) {
            return null;
        }
        ?? r6 = f51811b;
        Name entryName = javaEnumValueAnnotationArgument.getEntryName();
        KotlinRetention kotlinRetention = (KotlinRetention) r6.get(entryName != null ? entryName.asString() : null);
        if (kotlinRetention == null) {
            return null;
        }
        ClassId classId = ClassId.Companion.topLevel(StandardNames.FqNames.annotationRetention);
        Name nameIdentifier = Name.identifier(kotlinRetention.name());
        AbstractC16544l.m18093f(nameIdentifier, "identifier(...)");
        return new EnumValue(classId, nameIdentifier);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final Set<KotlinTarget> mapJavaTargetArgumentByName(String str) {
        EnumSet enumSet = (EnumSet) f51810a.get(str);
        return enumSet != null ? enumSet : C17691y.f56482Y;
    }

    public final ConstantValue<?> mapJavaTargetArguments$descriptors_jvm(List<? extends JavaAnnotationArgument> arguments) {
        AbstractC16544l.m18094g(arguments, "arguments");
        ArrayList<JavaEnumValueAnnotationArgument> arrayList = new ArrayList();
        for (Object obj : arguments) {
            if (obj instanceof JavaEnumValueAnnotationArgument) {
                arrayList.add(obj);
            }
        }
        ArrayList<KotlinTarget> arrayList2 = new ArrayList();
        for (JavaEnumValueAnnotationArgument javaEnumValueAnnotationArgument : arrayList) {
            JavaAnnotationTargetMapper javaAnnotationTargetMapper = INSTANCE;
            Name entryName = javaEnumValueAnnotationArgument.getEntryName();
            AbstractC17686t.m19398v(javaAnnotationTargetMapper.mapJavaTargetArgumentByName(entryName != null ? entryName.asString() : null), arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(AbstractC17682p.m19389r(arrayList2, 10));
        for (KotlinTarget kotlinTarget : arrayList2) {
            ClassId classId = ClassId.Companion.topLevel(StandardNames.FqNames.annotationTarget);
            Name nameIdentifier = Name.identifier(kotlinTarget.name());
            AbstractC16544l.m18093f(nameIdentifier, "identifier(...)");
            arrayList3.add(new EnumValue(classId, nameIdentifier));
        }
        return new ArrayValue(arrayList3, C8401b.f26129Y);
    }
}
