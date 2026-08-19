package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;
import mm.C17309l;
import p345Nm.C5857c;
import p909nm.AbstractC17659D;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes2.dex */
public final class AnnotationUtilKt {

    /* JADX INFO: renamed from: a */
    public static final Name f51430a;

    /* JADX INFO: renamed from: b */
    public static final Name f51431b;

    /* JADX INFO: renamed from: c */
    public static final Name f51432c;

    /* JADX INFO: renamed from: d */
    public static final Name f51433d;

    /* JADX INFO: renamed from: e */
    public static final Name f51434e;

    static {
        Name nameIdentifier = Name.identifier("message");
        AbstractC16544l.m18093f(nameIdentifier, "identifier(...)");
        f51430a = nameIdentifier;
        Name nameIdentifier2 = Name.identifier("replaceWith");
        AbstractC16544l.m18093f(nameIdentifier2, "identifier(...)");
        f51431b = nameIdentifier2;
        Name nameIdentifier3 = Name.identifier("level");
        AbstractC16544l.m18093f(nameIdentifier3, "identifier(...)");
        f51432c = nameIdentifier3;
        Name nameIdentifier4 = Name.identifier("expression");
        AbstractC16544l.m18093f(nameIdentifier4, "identifier(...)");
        f51433d = nameIdentifier4;
        Name nameIdentifier5 = Name.identifier("imports");
        AbstractC16544l.m18093f(nameIdentifier5, "identifier(...)");
        f51434e = nameIdentifier5;
    }

    public static final AnnotationDescriptor createDeprecatedAnnotation(KotlinBuiltIns kotlinBuiltIns, String message, String replaceWith, String level, boolean z6) {
        AbstractC16544l.m18094g(kotlinBuiltIns, "<this>");
        AbstractC16544l.m18094g(message, "message");
        AbstractC16544l.m18094g(replaceWith, "replaceWith");
        AbstractC16544l.m18094g(level, "level");
        BuiltInAnnotationDescriptor builtInAnnotationDescriptor = new BuiltInAnnotationDescriptor(kotlinBuiltIns, StandardNames.FqNames.replaceWith, AbstractC17659D.m19244f(new C17309l(f51433d, new StringValue(replaceWith)), new C17309l(f51434e, new ArrayValue(C17689w.f56480Y, new C5857c(kotlinBuiltIns, 1)))), false, 8, null);
        FqName fqName = StandardNames.FqNames.deprecated;
        C17309l c17309l = new C17309l(f51430a, new StringValue(message));
        C17309l c17309l2 = new C17309l(f51431b, new AnnotationValue(builtInAnnotationDescriptor));
        ClassId classId = ClassId.Companion.topLevel(StandardNames.FqNames.deprecationLevel);
        Name nameIdentifier = Name.identifier(level);
        AbstractC16544l.m18093f(nameIdentifier, "identifier(...)");
        return new BuiltInAnnotationDescriptor(kotlinBuiltIns, fqName, AbstractC17659D.m19244f(c17309l, c17309l2, new C17309l(f51432c, new EnumValue(classId, nameIdentifier))), z6);
    }

    public static /* synthetic */ AnnotationDescriptor createDeprecatedAnnotation$default(KotlinBuiltIns kotlinBuiltIns, String str, String str2, String str3, boolean z6, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = "";
        }
        if ((i10 & 4) != 0) {
            str3 = "WARNING";
        }
        if ((i10 & 8) != 0) {
            z6 = false;
        }
        return createDeprecatedAnnotation(kotlinBuiltIns, str, str2, str3, z6);
    }
}
