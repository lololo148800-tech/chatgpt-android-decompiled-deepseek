package kotlin.reflect.jvm.internal.impl.descriptors;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ClassKind {
    public static final ClassKind ANNOTATION_CLASS;
    public static final ClassKind CLASS;
    public static final ClassKind ENUM_CLASS;
    public static final ClassKind ENUM_ENTRY;
    public static final ClassKind INTERFACE;
    public static final ClassKind OBJECT;

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ ClassKind[] f51392Y;

    static {
        ClassKind classKind = new ClassKind("CLASS", 0);
        CLASS = classKind;
        ClassKind classKind2 = new ClassKind("INTERFACE", 1);
        INTERFACE = classKind2;
        ClassKind classKind3 = new ClassKind("ENUM_CLASS", 2);
        ENUM_CLASS = classKind3;
        ClassKind classKind4 = new ClassKind("ENUM_ENTRY", 3);
        ENUM_ENTRY = classKind4;
        ClassKind classKind5 = new ClassKind("ANNOTATION_CLASS", 4);
        ANNOTATION_CLASS = classKind5;
        ClassKind classKind6 = new ClassKind("OBJECT", 5);
        OBJECT = classKind6;
        ClassKind[] classKindArr = {classKind, classKind2, classKind3, classKind4, classKind5, classKind6};
        f51392Y = classKindArr;
        AbstractC7877E4.m8156j(classKindArr);
    }

    public static ClassKind valueOf(String str) {
        return (ClassKind) Enum.valueOf(ClassKind.class, str);
    }

    public static ClassKind[] values() {
        return (ClassKind[]) f51392Y.clone();
    }

    public final boolean isSingleton() {
        return this == OBJECT || this == ENUM_ENTRY;
    }
}
